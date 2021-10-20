package defpackage;

import vigqyno.C0201;

/* renamed from: gt1  reason: default package */
public final class gt1 implements Runnable {
    private final /* synthetic */ zs1 a;
    private final /* synthetic */ ft1 b;

    public gt1(ft1 ft1, zs1 zs1) {
        this.b = ft1;
        this.a = zs1;
    }

    public final void run() {
        try {
            zs1 zs1 = (zs1) ft1.b(this.b).a(this.a);
            if (zs1 == null) {
                this.b.onFailure(new NullPointerException(C0201.m82(1762)));
                return;
            }
            zs1.g(bt1.b, this.b);
            zs1.e(bt1.b, this.b);
            zs1.a(bt1.b, this.b);
        } catch (xs1 e) {
            if (e.getCause() instanceof Exception) {
                ft1.c(this.b).r((Exception) e.getCause());
            } else {
                ft1.c(this.b).r(e);
            }
        } catch (Exception e2) {
            ft1.c(this.b).r(e2);
        }
    }
}
