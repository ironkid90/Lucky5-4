package j$.time;

abstract /* synthetic */ class g {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ int[] f5126a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ int[] f5127b;

    /* JADX WARNING: Can't wrap try/catch for region: R(46:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
    /* JADX WARNING: Can't wrap try/catch for region: R(49:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
    /* JADX WARNING: Can't wrap try/catch for region: R(52:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0071 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x007b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0085 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x008f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0099 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00a3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00ad */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00b7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00c3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00cf */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00db */
    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00e7 */
    static {
        /*
            j$.time.temporal.b[] r0 = j$.time.temporal.b.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            f5127b = r0
            r1 = 1
            j$.time.temporal.b r2 = j$.time.temporal.b.DAYS     // Catch:{ NoSuchFieldError -> 0x0012 }
            int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
            r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
        L_0x0012:
            r0 = 2
            int[] r2 = f5127b     // Catch:{ NoSuchFieldError -> 0x001d }
            j$.time.temporal.b r3 = j$.time.temporal.b.WEEKS     // Catch:{ NoSuchFieldError -> 0x001d }
            int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
            r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
        L_0x001d:
            r2 = 3
            int[] r3 = f5127b     // Catch:{ NoSuchFieldError -> 0x0028 }
            j$.time.temporal.b r4 = j$.time.temporal.b.MONTHS     // Catch:{ NoSuchFieldError -> 0x0028 }
            int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
            r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
        L_0x0028:
            r3 = 4
            int[] r4 = f5127b     // Catch:{ NoSuchFieldError -> 0x0033 }
            j$.time.temporal.b r5 = j$.time.temporal.b.YEARS     // Catch:{ NoSuchFieldError -> 0x0033 }
            int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
            r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
        L_0x0033:
            r4 = 5
            int[] r5 = f5127b     // Catch:{ NoSuchFieldError -> 0x003e }
            j$.time.temporal.b r6 = j$.time.temporal.b.DECADES     // Catch:{ NoSuchFieldError -> 0x003e }
            int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
            r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
        L_0x003e:
            r5 = 6
            int[] r6 = f5127b     // Catch:{ NoSuchFieldError -> 0x0049 }
            j$.time.temporal.b r7 = j$.time.temporal.b.CENTURIES     // Catch:{ NoSuchFieldError -> 0x0049 }
            int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
            r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
        L_0x0049:
            r6 = 7
            int[] r7 = f5127b     // Catch:{ NoSuchFieldError -> 0x0054 }
            j$.time.temporal.b r8 = j$.time.temporal.b.MILLENNIA     // Catch:{ NoSuchFieldError -> 0x0054 }
            int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
            r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
        L_0x0054:
            r7 = 8
            int[] r8 = f5127b     // Catch:{ NoSuchFieldError -> 0x0060 }
            j$.time.temporal.b r9 = j$.time.temporal.b.ERAS     // Catch:{ NoSuchFieldError -> 0x0060 }
            int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
            r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
        L_0x0060:
            j$.time.temporal.a[] r8 = j$.time.temporal.a.values()
            int r8 = r8.length
            int[] r8 = new int[r8]
            f5126a = r8
            j$.time.temporal.a r9 = j$.time.temporal.a.DAY_OF_MONTH     // Catch:{ NoSuchFieldError -> 0x0071 }
            int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0071 }
            r8[r9] = r1     // Catch:{ NoSuchFieldError -> 0x0071 }
        L_0x0071:
            int[] r1 = f5126a     // Catch:{ NoSuchFieldError -> 0x007b }
            j$.time.temporal.a r8 = j$.time.temporal.a.DAY_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x007b }
            int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x007b }
            r1[r8] = r0     // Catch:{ NoSuchFieldError -> 0x007b }
        L_0x007b:
            int[] r0 = f5126a     // Catch:{ NoSuchFieldError -> 0x0085 }
            j$.time.temporal.a r1 = j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH     // Catch:{ NoSuchFieldError -> 0x0085 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0085 }
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0085 }
        L_0x0085:
            int[] r0 = f5126a     // Catch:{ NoSuchFieldError -> 0x008f }
            j$.time.temporal.a r1 = j$.time.temporal.a.YEAR_OF_ERA     // Catch:{ NoSuchFieldError -> 0x008f }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
            r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x008f }
        L_0x008f:
            int[] r0 = f5126a     // Catch:{ NoSuchFieldError -> 0x0099 }
            j$.time.temporal.a r1 = j$.time.temporal.a.DAY_OF_WEEK     // Catch:{ NoSuchFieldError -> 0x0099 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0099 }
            r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0099 }
        L_0x0099:
            int[] r0 = f5126a     // Catch:{ NoSuchFieldError -> 0x00a3 }
            j$.time.temporal.a r1 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH     // Catch:{ NoSuchFieldError -> 0x00a3 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a3 }
            r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x00a3 }
        L_0x00a3:
            int[] r0 = f5126a     // Catch:{ NoSuchFieldError -> 0x00ad }
            j$.time.temporal.a r1 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR     // Catch:{ NoSuchFieldError -> 0x00ad }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ad }
            r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x00ad }
        L_0x00ad:
            int[] r0 = f5126a     // Catch:{ NoSuchFieldError -> 0x00b7 }
            j$.time.temporal.a r1 = j$.time.temporal.a.EPOCH_DAY     // Catch:{ NoSuchFieldError -> 0x00b7 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b7 }
            r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x00b7 }
        L_0x00b7:
            int[] r0 = f5126a     // Catch:{ NoSuchFieldError -> 0x00c3 }
            j$.time.temporal.a r1 = j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x00c3 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c3 }
            r2 = 9
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c3 }
        L_0x00c3:
            int[] r0 = f5126a     // Catch:{ NoSuchFieldError -> 0x00cf }
            j$.time.temporal.a r1 = j$.time.temporal.a.MONTH_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x00cf }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cf }
            r2 = 10
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cf }
        L_0x00cf:
            int[] r0 = f5126a     // Catch:{ NoSuchFieldError -> 0x00db }
            j$.time.temporal.a r1 = j$.time.temporal.a.PROLEPTIC_MONTH     // Catch:{ NoSuchFieldError -> 0x00db }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00db }
            r2 = 11
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00db }
        L_0x00db:
            int[] r0 = f5126a     // Catch:{ NoSuchFieldError -> 0x00e7 }
            j$.time.temporal.a r1 = j$.time.temporal.a.YEAR     // Catch:{ NoSuchFieldError -> 0x00e7 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e7 }
            r2 = 12
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e7 }
        L_0x00e7:
            int[] r0 = f5126a     // Catch:{ NoSuchFieldError -> 0x00f3 }
            j$.time.temporal.a r1 = j$.time.temporal.a.ERA     // Catch:{ NoSuchFieldError -> 0x00f3 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f3 }
            r2 = 13
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f3 }
        L_0x00f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.g.<clinit>():void");
    }
}
