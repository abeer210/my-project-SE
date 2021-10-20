package defpackage;

import vigqyno.C0201;

/* renamed from: k93  reason: default package */
/* compiled from: WOTSPlusPublicKeyParameters */
public final class k93 {
    private final byte[][] a;

    public k93(j93 j93, byte[][] bArr) {
        if (j93 == null) {
            throw new NullPointerException(C0201.m82(37386));
        } else if (bArr == null) {
            throw new NullPointerException(C0201.m82(37385));
        } else if (v93.k(bArr)) {
            throw new NullPointerException(C0201.m82(37384));
        } else if (bArr.length == j93.c()) {
            for (byte[] bArr2 : bArr) {
                if (bArr2.length != j93.b()) {
                    throw new IllegalArgumentException(C0201.m82(37382));
                }
            }
            this.a = v93.d(bArr);
        } else {
            throw new IllegalArgumentException(C0201.m82(37383));
        }
    }

    public byte[][] a() {
        return v93.d(this.a);
    }
}
