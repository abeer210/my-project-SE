package defpackage;

import java.io.Serializable;

/* renamed from: p93  reason: default package */
/* compiled from: XMSSNode */
public final class p93 implements Serializable {
    private final int a;
    private final byte[] b;

    public p93(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    /* renamed from: a */
    public p93 clone() {
        return new p93(b(), c());
    }

    public int b() {
        return this.a;
    }

    public byte[] c() {
        return v93.c(this.b);
    }
}
