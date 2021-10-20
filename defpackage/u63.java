package defpackage;

import vigqyno.C0201;

/* renamed from: u63  reason: default package */
/* compiled from: SHA384Digest */
public class u63 extends q63 {
    @Override // defpackage.m63
    public int a(byte[] bArr, int i) {
        m();
        jb3.h(this.e, bArr, i);
        jb3.h(this.f, bArr, i + 8);
        jb3.h(this.g, bArr, i + 16);
        jb3.h(this.h, bArr, i + 24);
        jb3.h(this.i, bArr, i + 32);
        jb3.h(this.j, bArr, i + 40);
        q();
        return 48;
    }

    @Override // defpackage.m63
    public String d() {
        return C0201.m82(37886);
    }

    @Override // defpackage.m63
    public int e() {
        return 48;
    }

    @Override // defpackage.q63
    public void q() {
        super.q();
        this.e = -3766243637369397544L;
        this.f = 7105036623409894663L;
        this.g = -7973340178411365097L;
        this.h = 1526699215303891257L;
        this.i = 7436329637833083697L;
        this.j = -8163818279084223215L;
        this.k = -2662702644619276377L;
        this.l = 5167115440072839076L;
    }
}
