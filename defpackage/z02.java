package defpackage;

/* renamed from: z02  reason: default package */
public final class z02 implements Runnable {
    public final /* synthetic */ s02 a;
    public final /* synthetic */ a12 b;

    public z02(a12 a12, s02 s02) {
        this.b = a12;
        this.a = s02;
    }

    public final void run() {
        synchronized (a12.b(this.b)) {
            if (a12.c(this.b) != null) {
                a12.c(this.b).onSuccess(this.a.e());
            }
        }
    }
}
