package defpackage;

/* renamed from: v80  reason: default package */
/* compiled from: RetryManager */
public class v80 {
    private boolean a;
    private int b;
    private int c;

    public v80() {
        a();
    }

    public void a() {
        this.a = false;
        this.b = 4;
        c();
    }

    public void b() {
        this.c++;
    }

    public void c() {
        this.c = 0;
    }

    public void d(boolean z) {
        this.a = z;
    }

    public boolean e() {
        return this.a && this.c < this.b;
    }
}
