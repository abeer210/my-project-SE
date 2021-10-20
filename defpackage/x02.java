package defpackage;

/* renamed from: x02  reason: default package */
public final class x02 implements Runnable {
    public final /* synthetic */ s02 a;
    public final /* synthetic */ y02 b;

    public x02(y02 y02, s02 s02) {
        this.b = y02;
        this.a = s02;
    }

    public final void run() {
        synchronized (this.b.b) {
            if (this.b.c != null) {
                this.b.c.onFailure(this.a.d());
            }
        }
    }
}
