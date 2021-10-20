package defpackage;

/* renamed from: et1  reason: default package */
public final class et1 implements Runnable {
    private final /* synthetic */ zs1 a;
    private final /* synthetic */ dt1 b;

    public et1(dt1 dt1, zs1 zs1) {
        this.b = dt1;
        this.a = zs1;
    }

    public final void run() {
        if (this.a.n()) {
            dt1.b(this.b).v();
            return;
        }
        try {
            dt1.b(this.b).s(dt1.c(this.b).a(this.a));
        } catch (xs1 e) {
            if (e.getCause() instanceof Exception) {
                dt1.b(this.b).r((Exception) e.getCause());
            } else {
                dt1.b(this.b).r(e);
            }
        } catch (Exception e2) {
            dt1.b(this.b).r(e2);
        }
    }
}
