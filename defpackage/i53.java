package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* renamed from: i53  reason: default package */
/* compiled from: CMSProcessableByteArray */
public class i53 implements j53 {
    private final byte[] a;

    public i53(byte[] bArr) {
        this(new p03(d33.s.u()), bArr);
    }

    @Override // defpackage.j53
    public InputStream a() {
        return new ByteArrayInputStream(this.a);
    }

    public i53(p03 p03, byte[] bArr) {
        this.a = bArr;
    }
}
