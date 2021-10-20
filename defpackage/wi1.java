package defpackage;

/* renamed from: wi1  reason: default package */
public enum wi1 implements ol1 {
    REASON_UNKNOWN(0),
    REASON_MISSING(1),
    REASON_UPGRADE(2),
    REASON_INVALID(3);
    
    private final int a;

    private wi1(int i) {
        this.a = i;
    }

    public static wi1 b(int i) {
        if (i == 0) {
            return REASON_UNKNOWN;
        }
        if (i == 1) {
            return REASON_MISSING;
        }
        if (i == 2) {
            return REASON_UPGRADE;
        }
        if (i != 3) {
            return null;
        }
        return REASON_INVALID;
    }

    @Override // defpackage.ol1
    public final int a() {
        return this.a;
    }
}
