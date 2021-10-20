package defpackage;

/* renamed from: bm0  reason: default package */
/* compiled from: PageRenderingException */
public class bm0 extends Exception {
    private final int a;

    public bm0(int i, Throwable th) {
        super(th);
        this.a = i;
    }

    public int a() {
        return this.a;
    }
}
