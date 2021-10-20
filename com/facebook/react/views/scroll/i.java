package com.facebook.react.views.scroll;

/* compiled from: ScrollEventType */
public enum i {
    BEGIN_DRAG,
    END_DRAG,
    SCROLL,
    MOMENTUM_BEGIN,
    MOMENTUM_END;

    /* compiled from: ScrollEventType */
    static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            int[] iArr = new int[i.values().length];
            a = iArr;
            iArr[i.BEGIN_DRAG.ordinal()] = 1;
            a[i.END_DRAG.ordinal()] = 2;
            a[i.SCROLL.ordinal()] = 3;
            a[i.MOMENTUM_BEGIN.ordinal()] = 4;
            a[i.MOMENTUM_END.ordinal()] = 5;
        }
    }

    public static String b(i iVar) {
        int i = a.a[iVar.ordinal()];
        if (i == 1) {
            return "topScrollBeginDrag";
        }
        if (i == 2) {
            return "topScrollEndDrag";
        }
        if (i == 3) {
            return "topScroll";
        }
        if (i == 4) {
            return "topMomentumScrollBegin";
        }
        if (i == 5) {
            return "topMomentumScrollEnd";
        }
        throw new IllegalArgumentException("Unsupported ScrollEventType: " + iVar);
    }
}
