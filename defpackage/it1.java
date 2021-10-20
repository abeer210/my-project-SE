package defpackage;

/* renamed from: it1  reason: default package */
public final class it1 implements Runnable {
    private final /* synthetic */ ht1 a;

    public it1(ht1 ht1) {
        this.a = ht1;
    }

    public final void run() {
        synchronized (ht1.b(this.a)) {
            if (ht1.c(this.a) != null) {
                ht1.c(this.a).onCanceled();
            }
        }
    }
}
