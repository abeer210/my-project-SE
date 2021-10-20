package defpackage;

/* renamed from: zs2  reason: default package */
/* compiled from: PDPage */
public class zs2 implements ct2 {
    private final vq2 a;

    public zs2() {
        this(dt2.b);
    }

    /* renamed from: a */
    public vq2 k() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof zs2) && ((zs2) obj).k() == k();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public zs2(dt2 dt2) {
        vq2 vq2 = new vq2();
        this.a = vq2;
        vq2.n1(ar2.x0, ar2.g0);
        this.a.o1(ar2.Z, dt2);
    }

    public zs2(vq2 vq2, bt2 bt2) {
        this.a = vq2;
    }
}
