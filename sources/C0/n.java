package C0;

import b1.j;

public final /* synthetic */ class n implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f145f;

    /* renamed from: g  reason: collision with root package name */
    public Object f146g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f147h;

    public /* synthetic */ n(int i3, Object obj, Object obj2) {
        this.f145f = i3;
        this.f146g = obj;
        this.f147h = obj2;
    }

    private final void a() {
        try {
            b();
        } catch (Error e2) {
            synchronized (((j) this.f147h).f2695g) {
                ((j) this.f147h).f2696h = 1;
                throw e2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        if (r1 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        if (r1 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0052, code lost:
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        ((java.lang.Runnable) r10.f146g).run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0062, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        b1.j.f2693k.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.f146g), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            java.lang.Object r2 = r10.f147h     // Catch:{ all -> 0x005e }
            b1.j r2 = (b1.j) r2     // Catch:{ all -> 0x005e }
            java.util.ArrayDeque r2 = r2.f2695g     // Catch:{ all -> 0x005e }
            monitor-enter(r2)     // Catch:{ all -> 0x005e }
            r3 = 1
            if (r0 != 0) goto L_0x002c
            java.lang.Object r0 = r10.f147h     // Catch:{ all -> 0x0020 }
            b1.j r0 = (b1.j) r0     // Catch:{ all -> 0x0020 }
            int r4 = r0.f2696h     // Catch:{ all -> 0x0020 }
            r5 = 4
            if (r4 != r5) goto L_0x0022
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x001f
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x001f:
            return
        L_0x0020:
            r0 = move-exception
            goto L_0x0083
        L_0x0022:
            long r6 = r0.f2697i     // Catch:{ all -> 0x0020 }
            r8 = 1
            long r6 = r6 + r8
            r0.f2697i = r6     // Catch:{ all -> 0x0020 }
            r0.f2696h = r5     // Catch:{ all -> 0x0020 }
            r0 = r3
        L_0x002c:
            java.lang.Object r4 = r10.f147h     // Catch:{ all -> 0x0020 }
            b1.j r4 = (b1.j) r4     // Catch:{ all -> 0x0020 }
            java.util.ArrayDeque r4 = r4.f2695g     // Catch:{ all -> 0x0020 }
            java.lang.Object r4 = r4.poll()     // Catch:{ all -> 0x0020 }
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch:{ all -> 0x0020 }
            r10.f146g = r4     // Catch:{ all -> 0x0020 }
            if (r4 != 0) goto L_0x004d
            java.lang.Object r0 = r10.f147h     // Catch:{ all -> 0x0020 }
            b1.j r0 = (b1.j) r0     // Catch:{ all -> 0x0020 }
            r0.f2696h = r3     // Catch:{ all -> 0x0020 }
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x004c
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x004c:
            return
        L_0x004d:
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            boolean r2 = java.lang.Thread.interrupted()     // Catch:{ all -> 0x005e }
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r10.f146g     // Catch:{ RuntimeException -> 0x0062 }
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch:{ RuntimeException -> 0x0062 }
            r3.run()     // Catch:{ RuntimeException -> 0x0062 }
        L_0x005b:
            r10.f146g = r2     // Catch:{ all -> 0x005e }
            goto L_0x0002
        L_0x005e:
            r0 = move-exception
            goto L_0x0085
        L_0x0060:
            r0 = move-exception
            goto L_0x0080
        L_0x0062:
            r3 = move-exception
            java.util.logging.Logger r4 = b1.j.f2693k     // Catch:{ all -> 0x0060 }
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch:{ all -> 0x0060 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0060 }
            r6.<init>()     // Catch:{ all -> 0x0060 }
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch:{ all -> 0x0060 }
            java.lang.Object r7 = r10.f146g     // Catch:{ all -> 0x0060 }
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch:{ all -> 0x0060 }
            r6.append(r7)     // Catch:{ all -> 0x0060 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0060 }
            r4.log(r5, r6, r3)     // Catch:{ all -> 0x0060 }
            goto L_0x005b
        L_0x0080:
            r10.f146g = r2     // Catch:{ all -> 0x005e }
            throw r0     // Catch:{ all -> 0x005e }
        L_0x0083:
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            throw r0     // Catch:{ all -> 0x005e }
        L_0x0085:
            if (r1 == 0) goto L_0x008e
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L_0x008e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.n.b():void");
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [H1.a, java.lang.Exception] */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            int r0 = r6.f145f
            switch(r0) {
                case 0: goto L_0x02c1;
                case 1: goto L_0x027f;
                case 2: goto L_0x0221;
                case 3: goto L_0x01f6;
                case 4: goto L_0x019a;
                case 5: goto L_0x0139;
                case 6: goto L_0x011e;
                case 7: goto L_0x00fb;
                case 8: goto L_0x009a;
                case 9: goto L_0x0079;
                case 10: goto L_0x0075;
                case 11: goto L_0x003e;
                case 12: goto L_0x0021;
                case 13: goto L_0x000f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r6.f146g
            x.d r0 = (x.d) r0
            java.lang.Object r1 = r6.f147h
            r0.accept(r1)
            return
        L_0x000f:
            java.lang.Object r0 = r6.f146g
            b2.h r0 = (b2.h) r0
            java.lang.Object r0 = r0.f2743g
            C0.u r0 = (C0.u) r0
            if (r0 == 0) goto L_0x0020
            java.lang.Object r1 = r6.f147h
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            r0.b(r1)
        L_0x0020:
            return
        L_0x0021:
            java.lang.Object r0 = r6.f146g
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            java.lang.Object r0 = r0.get()
            j.s r0 = (j.C0253s) r0
            if (r0 != 0) goto L_0x002e
            goto L_0x003d
        L_0x002e:
            boolean r1 = r0.f3792m
            if (r1 == 0) goto L_0x003d
            android.widget.TextView r1 = r0.f3780a
            java.lang.Object r2 = r6.f147h
            android.graphics.Typeface r2 = (android.graphics.Typeface) r2
            r1.setTypeface(r2)
            r0.f3791l = r2
        L_0x003d:
            return
        L_0x003e:
            java.lang.Object r0 = r6.f147h
            j.i r0 = (j.C0244i) r0
            i.i r1 = r0.f3698h
            if (r1 == 0) goto L_0x0051
            d2.a r1 = r1.f3155e
            if (r1 == 0) goto L_0x0051
            java.lang.Object r1 = r1.f2912g
            androidx.appcompat.widget.ActionMenuView r1 = (androidx.appcompat.widget.ActionMenuView) r1
            r1.getClass()
        L_0x0051:
            androidx.appcompat.widget.ActionMenuView r1 = r0.f3702l
            if (r1 == 0) goto L_0x0071
            android.os.IBinder r1 = r1.getWindowToken()
            if (r1 == 0) goto L_0x0071
            java.lang.Object r1 = r6.f146g
            j.f r1 = (j.C0241f) r1
            boolean r2 = r1.b()
            if (r2 == 0) goto L_0x0066
            goto L_0x006f
        L_0x0066:
            android.view.View r2 = r1.f3204e
            if (r2 != 0) goto L_0x006b
            goto L_0x0071
        L_0x006b:
            r2 = 0
            r1.d(r2, r2, r2, r2)
        L_0x006f:
            r0.f3712w = r1
        L_0x0071:
            r1 = 0
            r0.f3714y = r1
            return
        L_0x0075:
            r6.a()
            return
        L_0x0079:
            java.lang.Object r0 = r6.f146g
            W0.p r0 = (W0.p) r0
            java.lang.Object r1 = r6.f147h     // Catch:{ Exception -> 0x008b, all -> 0x0089 }
            java.util.concurrent.Callable r1 = (java.util.concurrent.Callable) r1     // Catch:{ Exception -> 0x008b, all -> 0x0089 }
            java.lang.Object r1 = r1.call()     // Catch:{ Exception -> 0x008b, all -> 0x0089 }
            r0.l(r1)     // Catch:{ Exception -> 0x008b, all -> 0x0089 }
            goto L_0x0099
        L_0x0089:
            r1 = move-exception
            goto L_0x008d
        L_0x008b:
            r1 = move-exception
            goto L_0x0096
        L_0x008d:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r1)
            r0.k(r2)
            goto L_0x0099
        L_0x0096:
            r0.k(r1)
        L_0x0099:
            return
        L_0x009a:
            java.lang.Object r0 = r6.f147h
            W0.l r0 = (W0.l) r0
            java.lang.Object r1 = r0.f1883g     // Catch:{ f -> 0x00db, CancellationException -> 0x00e1, Exception -> 0x00d9 }
            W0.g r1 = (W0.g) r1     // Catch:{ f -> 0x00db, CancellationException -> 0x00e1, Exception -> 0x00d9 }
            java.lang.Object r2 = r6.f146g     // Catch:{ f -> 0x00db, CancellationException -> 0x00e1, Exception -> 0x00d9 }
            W0.h r2 = (W0.h) r2     // Catch:{ f -> 0x00db, CancellationException -> 0x00e1, Exception -> 0x00d9 }
            java.lang.Object r2 = r2.c()     // Catch:{ f -> 0x00db, CancellationException -> 0x00e1, Exception -> 0x00d9 }
            W0.p r1 = r1.a(r2)     // Catch:{ f -> 0x00db, CancellationException -> 0x00e1, Exception -> 0x00d9 }
            if (r1 != 0) goto L_0x00bb
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Continuation returned null"
            r1.<init>(r2)
            r0.c(r1)
            goto L_0x00fa
        L_0x00bb:
            W0.n r2 = W0.j.f1877b
            r1.a(r2, r0)
            W0.l r3 = new W0.l
            r3.<init>((W0.n) r2, (W0.d) r0)
            F0.v r4 = r1.f1889b
            r4.d(r3)
            r1.o()
            W0.l r3 = new W0.l
            r3.<init>((W0.n) r2, (W0.b) r0)
            r4.d(r3)
            r1.o()
            goto L_0x00fa
        L_0x00d9:
            r1 = move-exception
            goto L_0x00dd
        L_0x00db:
            r1 = move-exception
            goto L_0x00e5
        L_0x00dd:
            r0.c(r1)
            goto L_0x00fa
        L_0x00e1:
            r0.b()
            goto L_0x00fa
        L_0x00e5:
            java.lang.Throwable r2 = r1.getCause()
            boolean r2 = r2 instanceof java.lang.Exception
            if (r2 == 0) goto L_0x00f7
            java.lang.Throwable r1 = r1.getCause()
            java.lang.Exception r1 = (java.lang.Exception) r1
            r0.c(r1)
            goto L_0x00fa
        L_0x00f7:
            r0.c(r1)
        L_0x00fa:
            return
        L_0x00fb:
            java.lang.Object r0 = r6.f147h
            W0.l r0 = (W0.l) r0
            java.lang.Object r0 = r0.f1883g
            monitor-enter(r0)
            java.lang.Object r1 = r6.f147h     // Catch:{ all -> 0x0118 }
            W0.l r1 = (W0.l) r1     // Catch:{ all -> 0x0118 }
            java.lang.Object r1 = r1.f1885i     // Catch:{ all -> 0x0118 }
            W0.e r1 = (W0.e) r1     // Catch:{ all -> 0x0118 }
            if (r1 == 0) goto L_0x011a
            java.lang.Object r2 = r6.f146g     // Catch:{ all -> 0x0118 }
            W0.h r2 = (W0.h) r2     // Catch:{ all -> 0x0118 }
            java.lang.Object r2 = r2.c()     // Catch:{ all -> 0x0118 }
            r1.d(r2)     // Catch:{ all -> 0x0118 }
            goto L_0x011a
        L_0x0118:
            r1 = move-exception
            goto L_0x011c
        L_0x011a:
            monitor-exit(r0)     // Catch:{ all -> 0x0118 }
            return
        L_0x011c:
            monitor-exit(r0)     // Catch:{ all -> 0x0118 }
            throw r1
        L_0x011e:
            java.lang.Object r0 = r6.f147h
            W0.l r0 = (W0.l) r0
            java.lang.Object r0 = r0.f1883g
            monitor-enter(r0)
            java.lang.Object r1 = r6.f147h     // Catch:{ all -> 0x0136 }
            W0.l r1 = (W0.l) r1     // Catch:{ all -> 0x0136 }
            java.lang.Object r1 = r1.f1885i     // Catch:{ all -> 0x0136 }
            W0.c r1 = (W0.c) r1     // Catch:{ all -> 0x0136 }
            java.lang.Object r2 = r6.f146g     // Catch:{ all -> 0x0136 }
            W0.h r2 = (W0.h) r2     // Catch:{ all -> 0x0136 }
            r1.p(r2)     // Catch:{ all -> 0x0136 }
            monitor-exit(r0)     // Catch:{ all -> 0x0136 }
            return
        L_0x0136:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0136 }
            throw r1
        L_0x0139:
            java.lang.Object r0 = r6.f147h
            W0.k r0 = (W0.k) r0
            W0.a r1 = r0.f1880h     // Catch:{ f -> 0x0178, Exception -> 0x0176 }
            java.lang.Object r2 = r6.f146g     // Catch:{ f -> 0x0178, Exception -> 0x0176 }
            W0.h r2 = (W0.h) r2     // Catch:{ f -> 0x0178, Exception -> 0x0176 }
            java.lang.Object r1 = r1.o(r2)     // Catch:{ f -> 0x0178, Exception -> 0x0176 }
            W0.h r1 = (W0.h) r1     // Catch:{ f -> 0x0178, Exception -> 0x0176 }
            if (r1 != 0) goto L_0x0156
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Continuation returned null"
            r1.<init>(r2)
            r0.c(r1)
            goto L_0x0199
        L_0x0156:
            W0.n r2 = W0.j.f1877b
            r1.a(r2, r0)
            W0.p r1 = (W0.p) r1
            W0.l r3 = new W0.l
            r3.<init>((W0.n) r2, (W0.d) r0)
            F0.v r4 = r1.f1889b
            r4.d(r3)
            r1.o()
            W0.l r3 = new W0.l
            r3.<init>((W0.n) r2, (W0.b) r0)
            r4.d(r3)
            r1.o()
            goto L_0x0199
        L_0x0176:
            r1 = move-exception
            goto L_0x017a
        L_0x0178:
            r1 = move-exception
            goto L_0x0180
        L_0x017a:
            W0.p r0 = r0.f1881i
            r0.k(r1)
            goto L_0x0199
        L_0x0180:
            java.lang.Throwable r2 = r1.getCause()
            boolean r2 = r2 instanceof java.lang.Exception
            if (r2 == 0) goto L_0x0194
            W0.p r0 = r0.f1881i
            java.lang.Throwable r1 = r1.getCause()
            java.lang.Exception r1 = (java.lang.Exception) r1
            r0.k(r1)
            goto L_0x0199
        L_0x0194:
            W0.p r0 = r0.f1881i
            r0.k(r1)
        L_0x0199:
            return
        L_0x019a:
            java.lang.Object r0 = r6.f146g
            W0.h r0 = (W0.h) r0
            W0.p r0 = (W0.p) r0
            boolean r0 = r0.f1891d
            if (r0 == 0) goto L_0x01ae
            java.lang.Object r0 = r6.f147h
            W0.k r0 = (W0.k) r0
            W0.p r0 = r0.f1881i
            r0.m()
            goto L_0x01f5
        L_0x01ae:
            java.lang.Object r0 = r6.f147h     // Catch:{ f -> 0x01c8, Exception -> 0x01c6 }
            W0.k r0 = (W0.k) r0     // Catch:{ f -> 0x01c8, Exception -> 0x01c6 }
            W0.a r0 = r0.f1880h     // Catch:{ f -> 0x01c8, Exception -> 0x01c6 }
            java.lang.Object r1 = r6.f146g     // Catch:{ f -> 0x01c8, Exception -> 0x01c6 }
            W0.h r1 = (W0.h) r1     // Catch:{ f -> 0x01c8, Exception -> 0x01c6 }
            java.lang.Object r0 = r0.o(r1)     // Catch:{ f -> 0x01c8, Exception -> 0x01c6 }
            java.lang.Object r1 = r6.f147h
            W0.k r1 = (W0.k) r1
            W0.p r1 = r1.f1881i
            r1.l(r0)
            goto L_0x01f5
        L_0x01c6:
            r0 = move-exception
            goto L_0x01ca
        L_0x01c8:
            r0 = move-exception
            goto L_0x01d4
        L_0x01ca:
            java.lang.Object r1 = r6.f147h
            W0.k r1 = (W0.k) r1
            W0.p r1 = r1.f1881i
            r1.k(r0)
            goto L_0x01f5
        L_0x01d4:
            java.lang.Throwable r1 = r0.getCause()
            boolean r1 = r1 instanceof java.lang.Exception
            if (r1 == 0) goto L_0x01ec
            java.lang.Object r1 = r6.f147h
            W0.k r1 = (W0.k) r1
            W0.p r1 = r1.f1881i
            java.lang.Throwable r0 = r0.getCause()
            java.lang.Exception r0 = (java.lang.Exception) r0
            r1.k(r0)
            goto L_0x01f5
        L_0x01ec:
            java.lang.Object r1 = r6.f147h
            W0.k r1 = (W0.k) r1
            W0.p r1 = r1.f1881i
            r1.k(r0)
        L_0x01f5:
            return
        L_0x01f6:
            r0 = 0
        L_0x01f7:
            java.lang.Object r1 = r6.f146g     // Catch:{ all -> 0x01ff }
            java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch:{ all -> 0x01ff }
            r1.run()     // Catch:{ all -> 0x01ff }
            goto L_0x0205
        L_0x01ff:
            r1 = move-exception
            r2.j r2 = r2.C0426j.f4457f
            I2.C0071w.e(r1, r2)
        L_0x0205:
            java.lang.Object r1 = r6.f147h
            N2.i r1 = (N2.i) r1
            java.lang.Runnable r2 = r1.i()
            if (r2 != 0) goto L_0x0210
            goto L_0x0220
        L_0x0210:
            r6.f146g = r2
            int r0 = r0 + 1
            r2 = 16
            if (r0 < r2) goto L_0x01f7
            P2.l r0 = r1.f1198h
            r0.getClass()
            r0.g(r1, r6)
        L_0x0220:
            return
        L_0x0221:
            java.lang.Object r0 = r6.f147h
            F0.n r0 = (F0.n) r0
            F0.d r1 = r0.f344f
            java.util.concurrent.ConcurrentHashMap r1 = r1.f316j
            F0.a r2 = r0.f340b
            java.lang.Object r1 = r1.get(r2)
            F0.l r1 = (F0.l) r1
            if (r1 != 0) goto L_0x0234
            goto L_0x027e
        L_0x0234:
            java.lang.Object r2 = r6.f146g
            D0.a r2 = (D0.a) r2
            int r3 = r2.f190b
            r4 = 1
            if (r3 != 0) goto L_0x023f
            r3 = r4
            goto L_0x0240
        L_0x023f:
            r3 = 0
        L_0x0240:
            r5 = 0
            if (r3 == 0) goto L_0x027b
            r0.f343e = r4
            E0.a r2 = r0.f339a
            boolean r3 = r2.l()
            if (r3 == 0) goto L_0x025b
            boolean r1 = r0.f343e
            if (r1 == 0) goto L_0x027e
            G0.d r1 = r0.f341c
            if (r1 == 0) goto L_0x027e
            java.util.Set r0 = r0.f342d
            r2.e(r1, r0)
            goto L_0x027e
        L_0x025b:
            java.util.Set r0 = r2.h()     // Catch:{ SecurityException -> 0x0263 }
            r2.e(r5, r0)     // Catch:{ SecurityException -> 0x0263 }
            goto L_0x027e
        L_0x0263:
            r0 = move-exception
            java.lang.String r3 = "GoogleApiManager"
            java.lang.String r4 = "Failed to get service from broker. "
            android.util.Log.e(r3, r4, r0)
            java.lang.String r0 = "Failed to get service from broker."
            r2.k(r0)
            D0.a r0 = new D0.a
            r2 = 10
            r0.<init>(r2)
            r1.o(r0, r5)
            goto L_0x027e
        L_0x027b:
            r1.o(r2, r5)
        L_0x027e:
            return
        L_0x027f:
            java.lang.Object r0 = r6.f146g
            C0.q r0 = (C0.q) r0
            java.lang.Object r1 = r6.f147h
            C0.s r1 = (C0.s) r1
            int r1 = r1.f162a
            java.lang.String r2 = "Timing out request: "
            monitor-enter(r0)
            android.util.SparseArray r3 = r0.f156e     // Catch:{ all -> 0x02bc }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x02bc }
            C0.s r3 = (C0.s) r3     // Catch:{ all -> 0x02bc }
            if (r3 == 0) goto L_0x02ba
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x02bc }
            r4.<init>(r2)     // Catch:{ all -> 0x02bc }
            r4.append(r1)     // Catch:{ all -> 0x02bc }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x02bc }
            java.lang.String r4 = "MessengerIpcClient"
            android.util.Log.w(r4, r2)     // Catch:{ all -> 0x02bc }
            android.util.SparseArray r2 = r0.f156e     // Catch:{ all -> 0x02bc }
            r2.remove(r1)     // Catch:{ all -> 0x02bc }
            java.lang.String r1 = "Timed out waiting for response"
            H1.a r2 = new H1.a     // Catch:{ all -> 0x02bc }
            r4 = 0
            r2.<init>(r1, r4)     // Catch:{ all -> 0x02bc }
            r3.b(r2)     // Catch:{ all -> 0x02bc }
            r0.c()     // Catch:{ all -> 0x02bc }
        L_0x02ba:
            monitor-exit(r0)
            goto L_0x02be
        L_0x02bc:
            r1 = move-exception
            goto L_0x02bf
        L_0x02be:
            return
        L_0x02bf:
            monitor-exit(r0)     // Catch:{ all -> 0x02bc }
            throw r1
        L_0x02c1:
            java.lang.Object r0 = r6.f146g
            C0.q r0 = (C0.q) r0
            java.lang.Object r1 = r6.f147h
            android.os.IBinder r1 = (android.os.IBinder) r1
            monitor-enter(r0)
            r2 = 0
            if (r1 != 0) goto L_0x02d6
            java.lang.String r1 = "Null service connection"
            r0.a(r1, r2)     // Catch:{ all -> 0x02d4 }
            monitor-exit(r0)     // Catch:{ all -> 0x02d4 }
            goto L_0x02f8
        L_0x02d4:
            r1 = move-exception
            goto L_0x02f9
        L_0x02d6:
            C0.r r3 = new C0.r     // Catch:{ RemoteException -> 0x02ef }
            r3.<init>((android.os.IBinder) r1)     // Catch:{ RemoteException -> 0x02ef }
            r0.f154c = r3     // Catch:{ RemoteException -> 0x02ef }
            r1 = 2
            r0.f152a = r1     // Catch:{ all -> 0x02d4 }
            C0.t r1 = r0.f157f     // Catch:{ all -> 0x02d4 }
            java.util.concurrent.ScheduledExecutorService r1 = r1.f169b     // Catch:{ all -> 0x02d4 }
            C0.o r2 = new C0.o     // Catch:{ all -> 0x02d4 }
            r3 = 0
            r2.<init>(r0, r3)     // Catch:{ all -> 0x02d4 }
            r1.execute(r2)     // Catch:{ all -> 0x02d4 }
            monitor-exit(r0)     // Catch:{ all -> 0x02d4 }
            goto L_0x02f8
        L_0x02ef:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x02d4 }
            r0.a(r1, r2)     // Catch:{ all -> 0x02d4 }
            monitor-exit(r0)     // Catch:{ all -> 0x02d4 }
        L_0x02f8:
            return
        L_0x02f9:
            monitor-exit(r0)     // Catch:{ all -> 0x02d4 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.n.run():void");
    }

    public String toString() {
        String str;
        switch (this.f145f) {
            case 10:
                Runnable runnable = (Runnable) this.f146g;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i3 = ((j) this.f147h).f2696h;
                if (i3 == 1) {
                    str = "IDLE";
                } else if (i3 == 2) {
                    str = "QUEUING";
                } else if (i3 == 3) {
                    str = "QUEUED";
                } else if (i3 != 4) {
                    str = "null";
                } else {
                    str = "RUNNING";
                }
                sb.append(str);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ n(Object obj, Object obj2, int i3, boolean z3) {
        this.f145f = i3;
        this.f147h = obj;
        this.f146g = obj2;
    }

    public n(j jVar) {
        this.f145f = 10;
        this.f147h = jVar;
    }
}
