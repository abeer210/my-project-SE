package defpackage;

/* renamed from: n60  reason: default package */
/* compiled from: NoOpMemoryTrimmableRegistry */
public class n60 implements m60 {
    private static n60 a;

    public static synchronized n60 b() {
        n60 n60;
        synchronized (n60.class) {
            if (a == null) {
                a = new n60();
            }
            n60 = a;
        }
        return n60;
    }

    @Override // defpackage.m60
    public void a(l60 l60) {
    }
}
