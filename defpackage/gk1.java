package defpackage;

/* renamed from: gk1  reason: default package */
public final class gk1 {
    private final qk1 a;
    private final byte[] b;

    private gk1(int i) {
        byte[] bArr = new byte[i];
        this.b = bArr;
        this.a = qk1.p0(bArr);
    }

    public final bk1 a() {
        this.a.g0();
        return new ik1(this.b);
    }

    public final qk1 b() {
        return this.a;
    }

    public /* synthetic */ gk1(int i, ck1 ck1) {
        this(i);
    }
}
