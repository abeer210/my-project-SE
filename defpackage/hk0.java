package defpackage;

/* renamed from: hk0  reason: default package */
/* compiled from: LayoutAnimationType */
public enum hk0 {
    CREATE,
    UPDATE,
    DELETE;

    /* access modifiers changed from: package-private */
    /* renamed from: hk0$a */
    /* compiled from: LayoutAnimationType */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            int[] iArr = new int[hk0.values().length];
            a = iArr;
            iArr[hk0.CREATE.ordinal()] = 1;
            a[hk0.UPDATE.ordinal()] = 2;
            try {
                a[hk0.DELETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static String b(hk0 hk0) {
        int i = a.a[hk0.ordinal()];
        if (i == 1) {
            return "create";
        }
        if (i == 2) {
            return "update";
        }
        if (i == 3) {
            return "delete";
        }
        throw new IllegalArgumentException("Unsupported LayoutAnimationType: " + hk0);
    }
}
