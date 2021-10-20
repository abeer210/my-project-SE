package defpackage;

/* renamed from: e0  reason: default package */
/* compiled from: ArchTaskExecutor */
public class e0 extends g0 {
    private static volatile e0 c;
    private g0 a;
    private g0 b;

    private e0() {
        f0 f0Var = new f0();
        this.b = f0Var;
        this.a = f0Var;
    }

    public static e0 c() {
        if (c != null) {
            return c;
        }
        synchronized (e0.class) {
            if (c == null) {
                c = new e0();
            }
        }
        return c;
    }

    @Override // defpackage.g0
    public boolean a() {
        return this.a.a();
    }

    @Override // defpackage.g0
    public void b(Runnable runnable) {
        this.a.b(runnable);
    }
}
