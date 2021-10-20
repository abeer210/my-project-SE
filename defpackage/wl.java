package defpackage;

/* renamed from: wl  reason: default package */
/* compiled from: BytesResource */
public class wl implements hi<byte[]> {
    private final byte[] a;

    public wl(byte[] bArr) {
        ep.d(bArr);
        this.a = bArr;
    }

    @Override // defpackage.hi
    public int a() {
        return this.a.length;
    }

    @Override // defpackage.hi
    public Class<byte[]> b() {
        return byte[].class;
    }

    /* renamed from: c */
    public byte[] get() {
        return this.a;
    }

    @Override // defpackage.hi
    public void recycle() {
    }
}
