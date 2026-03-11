package i;

import A.C;
import A.E;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import b2.h;
import d2.C0152a;
import j.C0247l;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import r.C0408a;

/* renamed from: i.i  reason: case insensitive filesystem */
public class C0207i implements Menu {

    /* renamed from: u  reason: collision with root package name */
    public static final int[] f3150u = {1, 4, 5, 3, 2, 0};

    /* renamed from: a  reason: collision with root package name */
    public final Context f3151a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f3152b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3153c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f3154d;

    /* renamed from: e  reason: collision with root package name */
    public C0152a f3155e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f3156f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f3157g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3158h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f3159i;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList f3160j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3161k;

    /* renamed from: l  reason: collision with root package name */
    public CharSequence f3162l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f3163m = false;

    /* renamed from: n  reason: collision with root package name */
    public boolean f3164n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f3165o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f3166p = false;

    /* renamed from: q  reason: collision with root package name */
    public final ArrayList f3167q = new ArrayList();

    /* renamed from: r  reason: collision with root package name */
    public final CopyOnWriteArrayList f3168r = new CopyOnWriteArrayList();

    /* renamed from: s  reason: collision with root package name */
    public C0208j f3169s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f3170t = false;

    public C0207i(Context context) {
        boolean z3;
        boolean z4 = false;
        this.f3151a = context;
        Resources resources = context.getResources();
        this.f3152b = resources;
        this.f3156f = new ArrayList();
        this.f3157g = new ArrayList();
        this.f3158h = true;
        this.f3159i = new ArrayList();
        this.f3160j = new ArrayList();
        this.f3161k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = E.f2a;
            if (Build.VERSION.SDK_INT >= 28) {
                z3 = C.b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                if (identifier == 0 || !resources2.getBoolean(identifier)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
            }
            if (z3) {
                z4 = true;
            }
        }
        this.f3154d = z4;
    }

    public final C0208j a(int i3, int i4, int i5, CharSequence charSequence) {
        int i6;
        int i7 = (-65536 & i5) >> 16;
        if (i7 < 0 || i7 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i8 = (f3150u[i7] << 16) | (65535 & i5);
        C0208j jVar = new C0208j(this, i3, i4, i5, i8, charSequence);
        ArrayList arrayList = this.f3156f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i6 = 0;
                break;
            } else if (((C0208j) arrayList.get(size)).f3176d <= i8) {
                i6 = size + 1;
                break;
            } else {
                size--;
            }
        }
        arrayList.add(i6, jVar);
        o(true);
        return jVar;
    }

    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [android.view.MenuItem[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int addIntentOptions(int r8, int r9, int r10, android.content.ComponentName r11, android.content.Intent[] r12, android.content.Intent r13, int r14, android.view.MenuItem[] r15) {
        /*
            r7 = this;
            android.content.Context r0 = r7.f3151a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r1 = 0
            java.util.List r11 = r0.queryIntentActivityOptions(r11, r12, r13, r1)
            if (r11 == 0) goto L_0x0012
            int r2 = r11.size()
            goto L_0x0013
        L_0x0012:
            r2 = r1
        L_0x0013:
            r14 = r14 & 1
            if (r14 != 0) goto L_0x001a
            r7.removeGroup(r8)
        L_0x001a:
            if (r1 >= r2) goto L_0x005b
            java.lang.Object r14 = r11.get(r1)
            android.content.pm.ResolveInfo r14 = (android.content.pm.ResolveInfo) r14
            android.content.Intent r3 = new android.content.Intent
            int r4 = r14.specificIndex
            if (r4 >= 0) goto L_0x002a
            r4 = r13
            goto L_0x002c
        L_0x002a:
            r4 = r12[r4]
        L_0x002c:
            r3.<init>(r4)
            android.content.ComponentName r4 = new android.content.ComponentName
            android.content.pm.ActivityInfo r5 = r14.activityInfo
            android.content.pm.ApplicationInfo r6 = r5.applicationInfo
            java.lang.String r6 = r6.packageName
            java.lang.String r5 = r5.name
            r4.<init>(r6, r5)
            r3.setComponent(r4)
            java.lang.CharSequence r4 = r14.loadLabel(r0)
            i.j r4 = r7.a(r8, r9, r10, r4)
            android.graphics.drawable.Drawable r5 = r14.loadIcon(r0)
            r4.setIcon((android.graphics.drawable.Drawable) r5)
            r4.f3179g = r3
            if (r15 == 0) goto L_0x0058
            int r14 = r14.specificIndex
            if (r14 < 0) goto L_0x0058
            r15[r14] = r4
        L_0x0058:
            int r1 = r1 + 1
            goto L_0x001a
        L_0x005b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i.C0207i.addIntentOptions(int, int, int, android.content.ComponentName, android.content.Intent[], android.content.Intent, int, android.view.MenuItem[]):int");
    }

    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(C0213o oVar, Context context) {
        this.f3168r.add(new WeakReference(oVar));
        oVar.e(context, this);
        this.f3161k = true;
    }

    public final void c(boolean z3) {
        if (!this.f3166p) {
            this.f3166p = true;
            CopyOnWriteArrayList copyOnWriteArrayList = this.f3168r;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0213o oVar = (C0213o) weakReference.get();
                if (oVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    oVar.a(this, z3);
                }
            }
            this.f3166p = false;
        }
    }

    public final void clear() {
        C0208j jVar = this.f3169s;
        if (jVar != null) {
            d(jVar);
        }
        this.f3156f.clear();
        o(true);
    }

    public final void clearHeader() {
        this.f3162l = null;
        o(false);
    }

    public final void close() {
        c(true);
    }

    public boolean d(C0208j jVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3168r;
        boolean z3 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f3169s == jVar) {
            s();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0213o oVar = (C0213o) weakReference.get();
                if (oVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z3 = oVar.b(jVar);
                    if (z3) {
                        break;
                    }
                }
            }
            r();
            if (z3) {
                this.f3169s = null;
            }
        }
        return z3;
    }

    public boolean e(C0207i iVar, MenuItem menuItem) {
        C0247l lVar;
        C0152a aVar = this.f3155e;
        if (aVar == null || (lVar = ((ActionMenuView) aVar.f2912g).f2151C) == null) {
            return false;
        }
        ((Toolbar) ((h) lVar).f2743g).getClass();
        return false;
    }

    public boolean f(C0208j jVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3168r;
        boolean z3 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        s();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C0213o oVar = (C0213o) weakReference.get();
            if (oVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z3 = oVar.g(jVar);
                if (z3) {
                    break;
                }
            }
        }
        r();
        if (z3) {
            this.f3169s = jVar;
        }
        return z3;
    }

    public final MenuItem findItem(int i3) {
        MenuItem findItem;
        ArrayList arrayList = this.f3156f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C0208j jVar = (C0208j) arrayList.get(i4);
            if (jVar.f3173a == i3) {
                return jVar;
            }
            if (jVar.hasSubMenu() && (findItem = jVar.f3187o.findItem(i3)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final C0208j g(int i3, KeyEvent keyEvent) {
        char c3;
        ArrayList arrayList = this.f3167q;
        arrayList.clear();
        h(arrayList, i3, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C0208j) arrayList.get(0);
        }
        boolean m3 = m();
        for (int i4 = 0; i4 < size; i4++) {
            C0208j jVar = (C0208j) arrayList.get(i4);
            if (m3) {
                c3 = jVar.f3182j;
            } else {
                c3 = jVar.f3180h;
            }
            char[] cArr = keyData.meta;
            if ((c3 == cArr[0] && (metaState & 2) == 0) || ((c3 == cArr[2] && (metaState & 2) != 0) || (m3 && c3 == 8 && i3 == 67))) {
                return jVar;
            }
        }
        return null;
    }

    public final MenuItem getItem(int i3) {
        return (MenuItem) this.f3156f.get(i3);
    }

    public final void h(ArrayList arrayList, int i3, KeyEvent keyEvent) {
        char c3;
        int i4;
        ArrayList arrayList2 = arrayList;
        int i5 = i3;
        KeyEvent keyEvent2 = keyEvent;
        boolean m3 = m();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent2.getKeyData(keyData) || i5 == 67) {
            ArrayList arrayList3 = this.f3156f;
            int size = arrayList3.size();
            for (int i6 = 0; i6 < size; i6++) {
                C0208j jVar = (C0208j) arrayList3.get(i6);
                if (jVar.hasSubMenu()) {
                    jVar.f3187o.h(arrayList2, i5, keyEvent2);
                }
                if (m3) {
                    c3 = jVar.f3182j;
                } else {
                    c3 = jVar.f3180h;
                }
                if (m3) {
                    i4 = jVar.f3183k;
                } else {
                    i4 = jVar.f3181i;
                }
                if ((modifiers & 69647) == (i4 & 69647) && c3 != 0) {
                    char[] cArr = keyData.meta;
                    if (c3 != cArr[0] && c3 != cArr[2]) {
                        if (m3 && c3 == 8) {
                            if (i5 != 67) {
                            }
                        }
                    }
                    if (jVar.isEnabled()) {
                        arrayList2.add(jVar);
                    }
                }
            }
        }
    }

    public final boolean hasVisibleItems() {
        ArrayList arrayList = this.f3156f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((C0208j) arrayList.get(i3)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList k3 = k();
        if (this.f3161k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f3168r;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z3 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0213o oVar = (C0213o) weakReference.get();
                if (oVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z3 |= oVar.d();
                }
            }
            ArrayList arrayList = this.f3159i;
            ArrayList arrayList2 = this.f3160j;
            if (z3) {
                arrayList.clear();
                arrayList2.clear();
                int size = k3.size();
                for (int i3 = 0; i3 < size; i3++) {
                    C0208j jVar = (C0208j) k3.get(i3);
                    if (jVar.d()) {
                        arrayList.add(jVar);
                    } else {
                        arrayList2.add(jVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(k());
            }
            this.f3161k = false;
        }
    }

    public final boolean isShortcutKey(int i3, KeyEvent keyEvent) {
        if (g(i3, keyEvent) != null) {
            return true;
        }
        return false;
    }

    public final ArrayList k() {
        boolean z3 = this.f3158h;
        ArrayList arrayList = this.f3157g;
        if (!z3) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f3156f;
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0208j jVar = (C0208j) arrayList2.get(i3);
            if (jVar.isVisible()) {
                arrayList.add(jVar);
            }
        }
        this.f3158h = false;
        this.f3161k = true;
        return arrayList;
    }

    public boolean l() {
        return this.f3170t;
    }

    public boolean m() {
        return this.f3153c;
    }

    public boolean n() {
        return this.f3154d;
    }

    public final void o(boolean z3) {
        if (!this.f3163m) {
            if (z3) {
                this.f3158h = true;
                this.f3161k = true;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.f3168r;
            if (!copyOnWriteArrayList.isEmpty()) {
                s();
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    C0213o oVar = (C0213o) weakReference.get();
                    if (oVar == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else {
                        oVar.h();
                    }
                }
                r();
                return;
            }
            return;
        }
        this.f3164n = true;
        if (z3) {
            this.f3165o = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean p(android.view.MenuItem r6, i.C0209k r7, int r8) {
        /*
            r5 = this;
            i.j r6 = (i.C0208j) r6
            r0 = 0
            if (r6 == 0) goto L_0x00ab
            boolean r1 = r6.isEnabled()
            if (r1 != 0) goto L_0x000d
            goto L_0x00ab
        L_0x000d:
            android.view.MenuItem$OnMenuItemClickListener r1 = r6.f3188p
            r2 = 1
            if (r1 == 0) goto L_0x001a
            boolean r1 = r1.onMenuItemClick(r6)
            if (r1 == 0) goto L_0x001a
        L_0x0018:
            r1 = r2
            goto L_0x0036
        L_0x001a:
            i.i r1 = r6.f3186n
            boolean r3 = r1.e(r1, r6)
            if (r3 == 0) goto L_0x0023
            goto L_0x0018
        L_0x0023:
            android.content.Intent r3 = r6.f3179g
            if (r3 == 0) goto L_0x0035
            android.content.Context r1 = r1.f3151a     // Catch:{ ActivityNotFoundException -> 0x002d }
            r1.startActivity(r3)     // Catch:{ ActivityNotFoundException -> 0x002d }
            goto L_0x0018
        L_0x002d:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L_0x0035:
            r1 = r0
        L_0x0036:
            boolean r3 = r6.c()
            if (r3 == 0) goto L_0x0047
            boolean r6 = r6.expandActionView()
            r1 = r1 | r6
            if (r1 == 0) goto L_0x00aa
            r5.c(r2)
            goto L_0x00aa
        L_0x0047:
            boolean r3 = r6.hasSubMenu()
            if (r3 != 0) goto L_0x0055
            r6 = r8 & 1
            if (r6 != 0) goto L_0x00aa
            r5.c(r2)
            goto L_0x00aa
        L_0x0055:
            r8 = r8 & 4
            if (r8 != 0) goto L_0x005c
            r5.c(r0)
        L_0x005c:
            boolean r8 = r6.hasSubMenu()
            if (r8 != 0) goto L_0x0070
            i.s r8 = new i.s
            android.content.Context r3 = r5.f3151a
            r8.<init>(r3, r5, r6)
            r6.f3187o = r8
            java.lang.CharSequence r3 = r6.f3177e
            r8.setHeaderTitle((java.lang.CharSequence) r3)
        L_0x0070:
            i.s r6 = r6.f3187o
            java.util.concurrent.CopyOnWriteArrayList r8 = r5.f3168r
            boolean r3 = r8.isEmpty()
            if (r3 == 0) goto L_0x007b
            goto L_0x00a4
        L_0x007b:
            if (r7 == 0) goto L_0x0081
            boolean r0 = r7.k(r6)
        L_0x0081:
            java.util.Iterator r7 = r8.iterator()
        L_0x0085:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x00a4
            java.lang.Object r3 = r7.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            i.o r4 = (i.C0213o) r4
            if (r4 != 0) goto L_0x009d
            r8.remove(r3)
            goto L_0x0085
        L_0x009d:
            if (r0 != 0) goto L_0x0085
            boolean r0 = r4.k(r6)
            goto L_0x0085
        L_0x00a4:
            r1 = r1 | r0
            if (r1 != 0) goto L_0x00aa
            r5.c(r2)
        L_0x00aa:
            return r1
        L_0x00ab:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.C0207i.p(android.view.MenuItem, i.k, int):boolean");
    }

    public final boolean performIdentifierAction(int i3, int i4) {
        return p(findItem(i3), (C0209k) null, i4);
    }

    public final boolean performShortcut(int i3, KeyEvent keyEvent, int i4) {
        boolean z3;
        C0208j g2 = g(i3, keyEvent);
        if (g2 != null) {
            z3 = p(g2, (C0209k) null, i4);
        } else {
            z3 = false;
        }
        if ((i4 & 2) != 0) {
            c(true);
        }
        return z3;
    }

    public final void q(int i3, CharSequence charSequence, int i4, View view) {
        if (view != null) {
            this.f3162l = null;
        } else {
            if (i3 > 0) {
                this.f3162l = this.f3152b.getText(i3);
            } else if (charSequence != null) {
                this.f3162l = charSequence;
            }
            if (i4 > 0) {
                C0408a.b(this.f3151a, i4);
            }
        }
        o(false);
    }

    public final void r() {
        this.f3163m = false;
        if (this.f3164n) {
            this.f3164n = false;
            o(this.f3165o);
        }
    }

    public final void removeGroup(int i3) {
        ArrayList arrayList = this.f3156f;
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                i5 = -1;
                break;
            } else if (((C0208j) arrayList.get(i5)).f3174b == i3) {
                break;
            } else {
                i5++;
            }
        }
        if (i5 >= 0) {
            int size2 = arrayList.size() - i5;
            while (true) {
                int i6 = i4 + 1;
                if (i4 >= size2 || ((C0208j) arrayList.get(i5)).f3174b != i3) {
                    o(true);
                } else {
                    if (i5 >= 0) {
                        ArrayList arrayList2 = this.f3156f;
                        if (i5 < arrayList2.size()) {
                            arrayList2.remove(i5);
                        }
                    }
                    i4 = i6;
                }
            }
            o(true);
        }
    }

    public final void removeItem(int i3) {
        ArrayList arrayList = this.f3156f;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            } else if (((C0208j) arrayList.get(i4)).f3173a == i3) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 >= 0) {
            ArrayList arrayList2 = this.f3156f;
            if (i4 < arrayList2.size()) {
                arrayList2.remove(i4);
                o(true);
            }
        }
    }

    public final void s() {
        if (!this.f3163m) {
            this.f3163m = true;
            this.f3164n = false;
            this.f3165o = false;
        }
    }

    public final void setGroupCheckable(int i3, boolean z3, boolean z4) {
        int i4;
        ArrayList arrayList = this.f3156f;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            C0208j jVar = (C0208j) arrayList.get(i5);
            if (jVar.f3174b == i3) {
                int i6 = jVar.f3195x & -5;
                if (z4) {
                    i4 = 4;
                } else {
                    i4 = 0;
                }
                jVar.f3195x = i6 | i4;
                jVar.setCheckable(z3);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z3) {
        this.f3170t = z3;
    }

    public final void setGroupEnabled(int i3, boolean z3) {
        ArrayList arrayList = this.f3156f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C0208j jVar = (C0208j) arrayList.get(i4);
            if (jVar.f3174b == i3) {
                jVar.setEnabled(z3);
            }
        }
    }

    public final void setGroupVisible(int i3, boolean z3) {
        int i4;
        ArrayList arrayList = this.f3156f;
        int size = arrayList.size();
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            C0208j jVar = (C0208j) arrayList.get(i5);
            if (jVar.f3174b == i3) {
                int i6 = jVar.f3195x;
                int i7 = i6 & -9;
                if (z3) {
                    i4 = 0;
                } else {
                    i4 = 8;
                }
                int i8 = i7 | i4;
                jVar.f3195x = i8;
                if (i6 != i8) {
                    z4 = true;
                }
            }
        }
        if (z4) {
            o(true);
        }
    }

    public void setQwertyMode(boolean z3) {
        this.f3153c = z3;
        o(false);
    }

    public final int size() {
        return this.f3156f.size();
    }

    public final MenuItem add(int i3) {
        return a(0, 0, 0, this.f3152b.getString(i3));
    }

    public final SubMenu addSubMenu(int i3) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f3152b.getString(i3));
    }

    public final MenuItem add(int i3, int i4, int i5, CharSequence charSequence) {
        return a(i3, i4, i5, charSequence);
    }

    public final SubMenu addSubMenu(int i3, int i4, int i5, CharSequence charSequence) {
        C0208j a2 = a(i3, i4, i5, charSequence);
        C0217s sVar = new C0217s(this.f3151a, this, a2);
        a2.f3187o = sVar;
        sVar.setHeaderTitle(a2.f3177e);
        return sVar;
    }

    public final MenuItem add(int i3, int i4, int i5, int i6) {
        return a(i3, i4, i5, this.f3152b.getString(i6));
    }

    public final SubMenu addSubMenu(int i3, int i4, int i5, int i6) {
        return addSubMenu(i3, i4, i5, (CharSequence) this.f3152b.getString(i6));
    }

    public C0207i j() {
        return this;
    }
}
