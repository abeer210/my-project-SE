package defpackage;

/* renamed from: p10  reason: default package */
/* compiled from: CommunicationProblemListenerTask */
public class p10 implements Runnable {
    private o10 a;
    private Throwable b;

    public p10(o10 o10, Throwable th) {
        this.a = o10;
        this.b = th;
    }

    public void run() {
        Throwable th = this.b;
        if (th instanceof t10) {
            r10 a2 = ((t10) th).a();
            this.a.b(a2.a, a2.b, a2.c);
            return;
        }
        this.a.a(th);
    }
}
