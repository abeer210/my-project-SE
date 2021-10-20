package defpackage;

import vigqyno.C0201;

/* renamed from: ku0  reason: default package */
public final class ku0 {
    private final ru0 a;
    private final byte[] b;

    private ku0(int i) {
        byte[] bArr = new byte[i];
        this.b = bArr;
        this.a = ru0.R(bArr);
    }

    public /* synthetic */ ku0(int i, gu0 gu0) {
        this(i);
    }

    public final fu0 a() {
        if (this.a.t() == 0) {
            return new mu0(this.b);
        }
        throw new IllegalStateException(C0201.m82(19822));
    }

    public final ru0 b() {
        return this.a;
    }
}
