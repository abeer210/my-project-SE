package defpackage;

/* renamed from: ot1  reason: default package */
public final class ot1 implements Runnable {
    private final /* synthetic */ zs1 a;
    private final /* synthetic */ nt1 b;

    public ot1(nt1 nt1, zs1 zs1) {
        this.b = nt1;
        this.a = zs1;
    }

    public final void run() {
        synchronized (nt1.b(this.b)) {
            if (nt1.c(this.b) != null) {
                nt1.c(this.b).onSuccess(this.a.l());
            }
        }
    }
}
