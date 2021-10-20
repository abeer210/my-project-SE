package defpackage;

/* renamed from: k62  reason: default package */
/* compiled from: FormatException */
public final class k62 extends s62 {
    private static final k62 c;

    static {
        k62 k62 = new k62();
        c = k62;
        k62.setStackTrace(s62.b);
    }

    private k62() {
    }

    public static k62 a() {
        return s62.a ? new k62() : c;
    }

    public static k62 b(Throwable th) {
        return s62.a ? new k62(th) : c;
    }

    private k62(Throwable th) {
        super(th);
    }
}
