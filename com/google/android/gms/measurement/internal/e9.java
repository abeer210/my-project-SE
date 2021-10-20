package com.google.android.gms.measurement.internal;

import defpackage.n51;
import defpackage.p51;

public final /* synthetic */ class e9 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    /* JADX WARNING: Can't wrap try/catch for region: R(21:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|(3:27|28|30)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|30) */
    /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|30) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
    static {
        int[] iArr = new int[n51.b.values().length];
        b = iArr;
        try {
            iArr[n51.b.LESS_THAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[n51.b.GREATER_THAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[n51.b.EQUAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            b[n51.b.BETWEEN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[p51.a.values().length];
        a = iArr2;
        iArr2[p51.a.REGEXP.ordinal()] = 1;
        a[p51.a.BEGINS_WITH.ordinal()] = 2;
        a[p51.a.ENDS_WITH.ordinal()] = 3;
        a[p51.a.PARTIAL.ordinal()] = 4;
        a[p51.a.EXACT.ordinal()] = 5;
        try {
            a[p51.a.IN_LIST.ordinal()] = 6;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
