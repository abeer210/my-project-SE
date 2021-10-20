package defpackage;

import vigqyno.C0201;

/* renamed from: v63  reason: default package */
/* compiled from: SHA512Digest */
public class v63 extends q63 {
    @Override // defpackage.m63
    public int a(byte[] bArr, int i) {
        m();
        jb3.h(this.e, bArr, i);
        jb3.h(this.f, bArr, i + 8);
        jb3.h(this.g, bArr, i + 16);
        jb3.h(this.h, bArr, i + 24);
        jb3.h(this.i, bArr, i + 32);
        jb3.h(this.j, bArr, i + 40);
        jb3.h(this.k, bArr, i + 48);
        jb3.h(this.l, bArr, i + 56);
        q();
        return 64;
    }

    @Override // defpackage.m63
    public String d() {
        return C0201.m82(27555);
    }

    @Override // defpackage.m63
    public int e() {
        return 64;
    }

    @Override // defpackage.q63
    public void q() {
        super.q();
        this.e = 7640891576956012808L;
        this.f = -4942790177534073029L;
        this.g = 4354685564936845355L;
        this.h = -6534734903238641935L;
        this.i = 5840696475078001361L;
        this.j = -7276294671716946913L;
        this.k = 2270897969802886507L;
        this.l = 6620516959819538809L;
    }
}
