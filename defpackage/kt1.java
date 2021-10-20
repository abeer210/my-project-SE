package defpackage;

/* renamed from: kt1  reason: default package */
public final class kt1 implements Runnable {
    private final /* synthetic */ zs1 a;
    private final /* synthetic */ jt1 b;

    public kt1(jt1 jt1, zs1 zs1) {
        this.b = jt1;
        this.a = zs1;
    }

    public final void run() {
        synchronized (jt1.b(this.b)) {
            if (jt1.c(this.b) != null) {
                jt1.c(this.b).a(this.a);
            }
        }
    }
}
