package com.facebook.react.uimanager.events;

/* compiled from: TouchEventType */
public enum i {
    START,
    END,
    MOVE,
    CANCEL;

    /* access modifiers changed from: package-private */
    /* compiled from: TouchEventType */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            int[] iArr = new int[i.values().length];
            a = iArr;
            iArr[i.START.ordinal()] = 1;
            a[i.END.ordinal()] = 2;
            a[i.MOVE.ordinal()] = 3;
            try {
                a[i.CANCEL.ordinal()] = 4;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static String b(i iVar) {
        int i = a.a[iVar.ordinal()];
        if (i == 1) {
            return "topTouchStart";
        }
        if (i == 2) {
            return "topTouchEnd";
        }
        if (i == 3) {
            return "topTouchMove";
        }
        if (i == 4) {
            return "topTouchCancel";
        }
        throw new IllegalArgumentException("Unexpected type " + iVar);
    }
}
