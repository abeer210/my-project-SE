package defpackage;

/* renamed from: fl1  reason: default package */
public final /* synthetic */ class fl1 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
    /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
    static {
        int[] iArr = new int[ul1.values().length];
        b = iArr;
        try {
            iArr[ul1.BYTE_STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[ul1.MESSAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[ul1.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[gl1.values().length];
        a = iArr2;
        iArr2[gl1.MAP.ordinal()] = 1;
        a[gl1.VECTOR.ordinal()] = 2;
        a[gl1.SCALAR.ordinal()] = 3;
    }
}
