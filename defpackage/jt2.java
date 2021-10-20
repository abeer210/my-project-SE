package defpackage;

import java.io.IOException;
import vigqyno.C0201;

/* renamed from: jt2  reason: default package */
/* compiled from: PDEncryption */
public class jt2 {
    private final vq2 a;
    private pt2 b = qt2.c.b(b());

    public jt2(vq2 vq2) {
        this.a = vq2;
    }

    public it2 a(ar2 ar2) {
        vq2 vq2;
        vq2 vq22 = (vq2) this.a.k0(ar2.o);
        if (vq22 == null || (vq2 = (vq2) vq22.k0(ar2)) == null) {
            return null;
        }
        return new it2(vq2);
    }

    public final String b() {
        return this.a.S0(ar2.J);
    }

    public int c() {
        return this.a.t0(ar2.W, 40);
    }

    public byte[] d() throws IOException {
        gr2 gr2 = (gr2) this.a.k0(ar2.e0);
        if (gr2 != null) {
            return gr2.r();
        }
        return null;
    }

    public byte[] e() throws IOException {
        gr2 gr2 = (gr2) this.a.k0(ar2.c0);
        if (gr2 != null) {
            return gr2.r();
        }
        return null;
    }

    public int f() {
        return this.a.t0(ar2.f0, 0);
    }

    public byte[] g() throws IOException {
        gr2 gr2 = (gr2) this.a.k0(ar2.i0);
        if (gr2 != null) {
            return gr2.r();
        }
        return null;
    }

    public gr2 h(int i) {
        return (gr2) ((sq2) this.a.G0(ar2.n0)).x(i);
    }

    public int i() {
        return ((sq2) this.a.G0(ar2.n0)).size();
    }

    public int j() {
        return this.a.t0(ar2.m0, 0);
    }

    public pt2 k() throws IOException {
        pt2 pt2 = this.b;
        if (pt2 != null) {
            return pt2;
        }
        throw new IOException(C0201.m82(24791) + b());
    }

    public it2 l() {
        return a(ar2.u0);
    }

    public byte[] m() throws IOException {
        gr2 gr2 = (gr2) this.a.k0(ar2.z0);
        if (gr2 != null) {
            return gr2.r();
        }
        return null;
    }

    public byte[] n() throws IOException {
        gr2 gr2 = (gr2) this.a.k0(ar2.y0);
        if (gr2 != null) {
            return gr2.r();
        }
        return null;
    }

    public int o() {
        return this.a.t0(ar2.A0, 0);
    }

    public boolean p() {
        tq2 k0 = this.a.k0(ar2.I);
        if (k0 instanceof uq2) {
            return ((uq2) k0).r();
        }
        return true;
    }
}
