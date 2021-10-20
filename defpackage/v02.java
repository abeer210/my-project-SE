package defpackage;

/* renamed from: v02  reason: default package */
public final class v02 implements Runnable {
    public final /* synthetic */ s02 a;
    public final /* synthetic */ w02 b;

    public v02(w02 w02, s02 s02) {
        this.b = w02;
        this.a = s02;
    }

    public final void run() {
        synchronized (this.b.b) {
            if (this.b.c != null) {
                this.b.c.a(this.a);
            }
        }
    }
}
