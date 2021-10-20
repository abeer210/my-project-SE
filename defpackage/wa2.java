package defpackage;

/* renamed from: wa2  reason: default package */
/* compiled from: ErrorCorrectionLevel */
public enum wa2 {
    L(1),
    M(0),
    Q(3),
    H(2);
    
    private static final wa2[] e;

    /* access modifiers changed from: public */
    static {
        wa2 wa2;
        wa2 wa22 = L;
        e = new wa2[]{M, wa22, wa2, Q};
    }

    private wa2(int i) {
    }

    public static wa2 b(int i) {
        if (i >= 0) {
            wa2[] wa2Arr = e;
            if (i < wa2Arr.length) {
                return wa2Arr[i];
            }
        }
        throw new IllegalArgumentException();
    }
}
