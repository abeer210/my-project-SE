package defpackage;

/* renamed from: j81  reason: default package */
public final class j81 {
    private final r81 a;
    private final byte[] b;

    private j81(int i) {
        byte[] bArr = new byte[i];
        this.b = bArr;
        this.a = r81.v0(bArr);
    }

    public final c81 a() {
        this.a.J0();
        return new l81(this.b);
    }

    public final r81 b() {
        return this.a;
    }

    public /* synthetic */ j81(int i, b81 b81) {
        this(i);
    }
}
