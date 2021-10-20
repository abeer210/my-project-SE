package defpackage;

/* renamed from: xi1  reason: default package */
public enum xi1 implements ol1 {
    RESULT_UNKNOWN(0),
    RESULT_SUCCESS(1),
    RESULT_FAIL(2),
    RESULT_SKIPPED(3);
    
    private final int a;

    private xi1(int i) {
        this.a = i;
    }

    public static xi1 b(int i) {
        if (i == 0) {
            return RESULT_UNKNOWN;
        }
        if (i == 1) {
            return RESULT_SUCCESS;
        }
        if (i == 2) {
            return RESULT_FAIL;
        }
        if (i != 3) {
            return null;
        }
        return RESULT_SKIPPED;
    }

    @Override // defpackage.ol1
    public final int a() {
        return this.a;
    }
}
