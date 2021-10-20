package defpackage;

/* renamed from: g50  reason: default package */
/* compiled from: NoOpDiskTrimmableRegistry */
public class g50 implements f50 {
    private static g50 a;

    private g50() {
    }

    public static synchronized g50 b() {
        g50 g50;
        synchronized (g50.class) {
            if (a == null) {
                a = new g50();
            }
            g50 = a;
        }
        return g50;
    }

    @Override // defpackage.f50
    public void a(e50 e50) {
    }
}
