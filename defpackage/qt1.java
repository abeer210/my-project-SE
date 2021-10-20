package defpackage;

import java.util.concurrent.CancellationException;
import vigqyno.C0201;

/* renamed from: qt1  reason: default package */
public final class qt1 implements Runnable {
    private final /* synthetic */ zs1 a;
    private final /* synthetic */ pt1 b;

    public qt1(pt1 pt1, zs1 zs1) {
        this.b = pt1;
        this.a = zs1;
    }

    public final void run() {
        try {
            zs1 then = pt1.b(this.b).then(this.a.l());
            if (then == null) {
                this.b.onFailure(new NullPointerException(C0201.m82(13592)));
                return;
            }
            then.g(bt1.b, this.b);
            then.e(bt1.b, this.b);
            then.a(bt1.b, this.b);
        } catch (xs1 e) {
            if (e.getCause() instanceof Exception) {
                this.b.onFailure((Exception) e.getCause());
            } else {
                this.b.onFailure(e);
            }
        } catch (CancellationException unused) {
            this.b.onCanceled();
        } catch (Exception e2) {
            this.b.onFailure(e2);
        }
    }
}
