package defpackage;

/* renamed from: rr0  reason: default package */
public abstract class rr0 {
    private static rr0 a;

    public static synchronized rr0 b() {
        rr0 rr0;
        synchronized (rr0.class) {
            if (a == null) {
                a = new or0();
            }
            rr0 = a;
        }
        return rr0;
    }

    public abstract sr0<Boolean> a(String str, boolean z);
}
