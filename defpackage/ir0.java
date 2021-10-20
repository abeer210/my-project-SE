package defpackage;

/* renamed from: ir0  reason: default package */
public final class ir0 {
    private static ir0 b;
    private final hr0 a = new hr0();

    static {
        ir0 ir0 = new ir0();
        synchronized (ir0.class) {
            b = ir0;
        }
    }

    private ir0() {
    }

    public static hr0 a() {
        return b().a;
    }

    private static ir0 b() {
        ir0 ir0;
        synchronized (ir0.class) {
            ir0 = b;
        }
        return ir0;
    }
}
