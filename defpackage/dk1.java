package defpackage;

import java.util.Arrays;

/* renamed from: dk1  reason: default package */
public final class dk1 implements fk1 {
    private dk1() {
    }

    @Override // defpackage.fk1
    public final byte[] a(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    public /* synthetic */ dk1(ck1 ck1) {
        this();
    }
}
