package io.flutter.embedding.engine.renderer;

import B.c;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.view.Surface;
import androidx.annotation.Keep;
import io.flutter.view.TextureRegistry$ImageConsumer;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.n;
import io.flutter.view.o;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

@Keep
final class FlutterRenderer$ImageReaderSurfaceProducer implements TextureRegistry$SurfaceProducer, TextureRegistry$ImageConsumer, n {
    private static final boolean CLEANUP_ON_MEMORY_PRESSURE = true;
    private static final int MAX_DEQUEUED_IMAGES = 2;
    private static final int MAX_IMAGES = 7;
    private static final String TAG = "ImageReaderSurfaceProducer";
    private static final boolean VERBOSE_LOGS = false;
    private static final boolean trimOnMemoryPressure = true;
    o callback;
    private boolean createNewReader = true;
    private final long id;
    private boolean ignoringFence = VERBOSE_LOGS;
    private final ArrayDeque<e> imageReaderQueue = new ArrayDeque<>();
    private long lastDequeueTime = 0;
    private ArrayList<c> lastDequeuedImage = new ArrayList<>();
    private long lastQueueTime = 0;
    /* access modifiers changed from: private */
    public e lastReaderDequeuedFrom = null;
    private long lastScheduleTime = 0;
    private final Object lock = new Object();
    boolean notifiedDestroy = VERBOSE_LOGS;
    private int numTrims = 0;
    private final HashMap<ImageReader, e> perImageReaders = new HashMap<>();
    /* access modifiers changed from: private */
    public boolean released;
    private int requestedHeight = 1;
    private int requestedWidth = 1;
    final /* synthetic */ h this$0;

    public FlutterRenderer$ImageReaderSurfaceProducer(h hVar, long j3) {
        this.this$0 = hVar;
        this.id = j3;
    }

    private void cleanup() {
        synchronized (this.lock) {
            try {
                for (e next : this.perImageReaders.values()) {
                    if (this.lastReaderDequeuedFrom == next) {
                        this.lastReaderDequeuedFrom = null;
                    }
                    next.f3287c = true;
                    next.f3285a.close();
                    next.f3286b.clear();
                }
                this.perImageReaders.clear();
                if (this.lastDequeuedImage.size() > 0) {
                    Iterator<c> it = this.lastDequeuedImage.iterator();
                    while (it.hasNext()) {
                        it.next().f3282a.close();
                    }
                    this.lastDequeuedImage.clear();
                }
                e eVar = this.lastReaderDequeuedFrom;
                if (eVar != null) {
                    eVar.f3287c = true;
                    eVar.f3285a.close();
                    eVar.f3286b.clear();
                    this.lastReaderDequeuedFrom = null;
                }
                this.imageReaderQueue.clear();
            } finally {
            }
        }
    }

    private ImageReader createImageReader29() {
        return ImageReader.newInstance(this.requestedWidth, this.requestedHeight, 34, 7, 256);
    }

    private ImageReader createImageReader33() {
        c.m();
        ImageReader.Builder g2 = c.g(this.requestedWidth, this.requestedHeight);
        g2.setMaxImages(7);
        g2.setImageFormat(34);
        g2.setUsage(256);
        return g2.build();
    }

    private e getActiveReader() {
        synchronized (this.lock) {
            try {
                if (!this.createNewReader) {
                    e peekLast = this.imageReaderQueue.peekLast();
                    if (peekLast.f3285a.getSurface().isValid()) {
                        return peekLast;
                    }
                }
                this.createNewReader = VERBOSE_LOGS;
                e orCreatePerImageReader = getOrCreatePerImageReader(createImageReader());
                return orCreatePerImageReader;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private e getOrCreatePerImageReader(ImageReader imageReader) {
        e eVar = this.perImageReaders.get(imageReader);
        if (eVar != null) {
            return eVar;
        }
        e createPerImageReader = createPerImageReader(imageReader);
        this.perImageReaders.put(imageReader, createPerImageReader);
        this.imageReaderQueue.add(createPerImageReader);
        return createPerImageReader;
    }

    /* access modifiers changed from: private */
    public void lambda$dequeueImage$0() {
        if (!this.released) {
            this.this$0.f3309a.scheduleFrame();
        }
    }

    private void maybeWaitOnFence(Image image) {
        if (image == null || this.ignoringFence) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            waitOnFence(image);
        } else {
            this.ignoringFence = true;
        }
    }

    private void releaseInternal() {
        cleanup();
        this.released = true;
        HashSet hashSet = this.this$0.f3313e;
        Iterator it = hashSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == this) {
                hashSet.remove(weakReference);
                break;
            }
        }
        this.this$0.f3314f.remove(this);
    }

    private void waitOnFence(Image image) {
        try {
            image.getFence().awaitForever();
        } catch (IOException unused) {
        }
    }

    public Image acquireLatestImage() {
        c dequeueImage = dequeueImage();
        if (dequeueImage == null) {
            return null;
        }
        Image image = dequeueImage.f3282a;
        maybeWaitOnFence(image);
        return image;
    }

    public ImageReader createImageReader() {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            return createImageReader33();
        }
        if (i3 >= 29) {
            return createImageReader29();
        }
        throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
    }

    public e createPerImageReader(ImageReader imageReader) {
        return new e(this, imageReader);
    }

    public double deltaMillis(long j3) {
        return ((double) j3) / 1000000.0d;
    }

    public c dequeueImage() {
        c cVar;
        boolean z3;
        c cVar2;
        synchronized (this.lock) {
            try {
                Iterator<e> it = this.imageReaderQueue.iterator();
                cVar = null;
                while (true) {
                    boolean hasNext = it.hasNext();
                    z3 = VERBOSE_LOGS;
                    if (!hasNext) {
                        break;
                    }
                    e next = it.next();
                    ArrayDeque arrayDeque = next.f3286b;
                    if (arrayDeque.isEmpty()) {
                        cVar2 = null;
                    } else {
                        cVar2 = (c) arrayDeque.removeFirst();
                    }
                    if (cVar2 == null) {
                        cVar = cVar2;
                    } else {
                        while (this.lastDequeuedImage.size() > 2) {
                            this.lastDequeuedImage.remove(0).f3282a.close();
                        }
                        this.lastDequeuedImage.add(cVar2);
                        this.lastReaderDequeuedFrom = next;
                        cVar = cVar2;
                    }
                }
                pruneImageReaderQueue();
                Iterator<e> it2 = this.imageReaderQueue.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!it2.next().f3286b.isEmpty()) {
                            z3 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (z3) {
            this.this$0.f3312d.post(new b(this));
        }
        return cVar;
    }

    public void disableFenceForTest() {
        this.ignoringFence = true;
    }

    public void finalize() {
        try {
            if (!this.released) {
                releaseInternal();
                h hVar = this.this$0;
                hVar.f3312d.post(new f(this.id, hVar.f3309a));
                super.finalize();
            }
        } finally {
            super.finalize();
        }
    }

    public Surface getForcedNewSurface() {
        this.createNewReader = true;
        return getSurface();
    }

    public int getHeight() {
        return this.requestedHeight;
    }

    public Surface getSurface() {
        return getActiveReader().f3285a.getSurface();
    }

    public int getWidth() {
        return this.requestedWidth;
    }

    public boolean handlesCropAndRotation() {
        return VERBOSE_LOGS;
    }

    public long id() {
        return this.id;
    }

    public int numImageReaders() {
        int size;
        synchronized (this.lock) {
            size = this.imageReaderQueue.size();
        }
        return size;
    }

    public int numImages() {
        int i3;
        synchronized (this.lock) {
            try {
                Iterator<e> it = this.imageReaderQueue.iterator();
                i3 = 0;
                while (it.hasNext()) {
                    i3 += it.next().f3286b.size();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i3;
    }

    public int numTrims() {
        int i3;
        synchronized (this.lock) {
            i3 = this.numTrims;
        }
        return i3;
    }

    public void onImage(ImageReader imageReader, Image image) {
        c cVar;
        synchronized (this.lock) {
            e orCreatePerImageReader = getOrCreatePerImageReader(imageReader);
            if (orCreatePerImageReader.f3287c) {
                cVar = null;
            } else {
                FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer = orCreatePerImageReader.f3288d;
                System.nanoTime();
                c cVar2 = new c(flutterRenderer$ImageReaderSurfaceProducer, image);
                ArrayDeque arrayDeque = orCreatePerImageReader.f3286b;
                arrayDeque.add(cVar2);
                while (arrayDeque.size() > 2) {
                    ((c) arrayDeque.removeFirst()).f3282a.close();
                }
                cVar = cVar2;
            }
        }
        if (cVar != null) {
            this.this$0.f3309a.scheduleFrame();
        }
    }

    public void onTrimMemory(int i3) {
        if (i3 >= 40) {
            synchronized (this.lock) {
                this.numTrims++;
            }
            cleanup();
            this.createNewReader = true;
        }
    }

    public int pendingDequeuedImages() {
        return this.lastDequeuedImage.size();
    }

    public void pruneImageReaderQueue() {
        e peekFirst;
        while (this.imageReaderQueue.size() > 1 && (peekFirst = this.imageReaderQueue.peekFirst()) != null) {
            ArrayDeque arrayDeque = peekFirst.f3286b;
            if (arrayDeque.isEmpty() && peekFirst.f3288d.lastReaderDequeuedFrom != peekFirst) {
                this.imageReaderQueue.removeFirst();
                HashMap<ImageReader, e> hashMap = this.perImageReaders;
                ImageReader imageReader = peekFirst.f3285a;
                hashMap.remove(imageReader);
                peekFirst.f3287c = true;
                imageReader.close();
                arrayDeque.clear();
            } else {
                return;
            }
        }
    }

    public void release() {
        if (!this.released) {
            releaseInternal();
            h hVar = this.this$0;
            hVar.f3309a.unregisterTexture(this.id);
        }
    }

    public void scheduleFrame() {
        this.this$0.f3309a.scheduleFrame();
    }

    public void setCallback(o oVar) {
    }

    public void setSize(int i3, int i4) {
        int max = Math.max(1, i3);
        int max2 = Math.max(1, i4);
        if (this.requestedWidth != max || this.requestedHeight != max2) {
            this.createNewReader = true;
            this.requestedHeight = max2;
            this.requestedWidth = max;
        }
    }
}
