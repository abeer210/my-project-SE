package defpackage;

/* renamed from: q40  reason: default package */
/* compiled from: NoOpCacheEventListener */
public class q40 implements l40 {
    private static q40 a;

    private q40() {
    }

    public static synchronized q40 i() {
        q40 q40;
        synchronized (q40.class) {
            if (a == null) {
                a = new q40();
            }
            q40 = a;
        }
        return q40;
    }

    @Override // defpackage.l40
    public void a(k40 k40) {
    }

    @Override // defpackage.l40
    public void b(k40 k40) {
    }

    @Override // defpackage.l40
    public void c() {
    }

    @Override // defpackage.l40
    public void d(k40 k40) {
    }

    @Override // defpackage.l40
    public void e(k40 k40) {
    }

    @Override // defpackage.l40
    public void f(k40 k40) {
    }

    @Override // defpackage.l40
    public void g(k40 k40) {
    }

    @Override // defpackage.l40
    public void h(k40 k40) {
    }
}
