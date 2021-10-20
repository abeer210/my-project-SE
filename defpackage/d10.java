package defpackage;

import java.util.Stack;

/* renamed from: d10  reason: default package */
/* compiled from: DirectoryTiffHandler */
public abstract class d10 implements uq {
    private final Stack<tr> a = new Stack<>();
    private tr b;
    public tr c;
    public final wr d;

    public d10(wr wrVar, tr trVar) {
        this.d = wrVar;
        this.b = trVar;
    }

    private tr C() {
        tr trVar = this.c;
        if (trVar != null) {
            return trVar;
        }
        ur urVar = (ur) this.d.e(ur.class);
        if (urVar != null) {
            return urVar;
        }
        D(ur.class);
        return this.c;
    }

    @Override // defpackage.uq
    public void A(int i, long[] jArr) {
        this.c.N(i, jArr);
    }

    @Override // defpackage.uq
    public void B(int i, mr mrVar) {
        this.c.P(i, mrVar);
    }

    public void D(Class<? extends tr> cls) {
        try {
            tr trVar = (tr) cls.newInstance();
            tr trVar2 = this.c;
            if (trVar2 == null) {
                tr trVar3 = this.b;
                if (trVar3 != null) {
                    trVar.O(trVar3);
                    this.b = null;
                }
            } else {
                this.a.push(trVar2);
                trVar.O(this.c);
            }
            this.c = trVar;
            this.d.a(trVar);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // defpackage.uq
    public void a(int i, double d2) {
        this.c.F(i, d2);
    }

    @Override // defpackage.uq
    public void c(String str) {
        C().a(str);
    }

    @Override // defpackage.uq
    public void d(int i, mr[] mrVarArr) {
        this.c.Q(i, mrVarArr);
    }

    @Override // defpackage.uq
    public void h(int i, int[] iArr) {
        this.c.K(i, iArr);
    }

    @Override // defpackage.uq
    public void i() {
        this.c = this.a.empty() ? null : this.a.pop();
    }

    @Override // defpackage.uq
    public void j(int i, short s) {
        this.c.J(i, s);
    }

    @Override // defpackage.uq
    public void k(int i, byte[] bArr) {
        this.c.C(i, bArr);
    }

    @Override // defpackage.uq
    public void l(int i, float f) {
        this.c.H(i, f);
    }

    @Override // defpackage.uq
    public void m(int i, short[] sArr) {
        this.c.N(i, sArr);
    }

    @Override // defpackage.uq
    public void n(int i, short[] sArr) {
        this.c.N(i, sArr);
    }

    @Override // defpackage.uq
    public void o(int i, long j) {
        this.c.L(i, j);
    }

    @Override // defpackage.uq
    public void p(int i, yr yrVar) {
        this.c.T(i, yrVar);
    }

    @Override // defpackage.uq
    public void q(String str) {
        C().a(str);
    }

    @Override // defpackage.uq
    public void r(int i, int i2) {
        this.c.J(i, i2);
    }

    @Override // defpackage.uq
    public void s(int i, float[] fArr) {
        this.c.I(i, fArr);
    }

    @Override // defpackage.uq
    public void t(int i, int i2) {
        this.c.J(i, i2);
    }

    @Override // defpackage.uq
    public void u(int i, double[] dArr) {
        this.c.G(i, dArr);
    }

    @Override // defpackage.uq
    public void v(int i, int[] iArr) {
        this.c.N(i, iArr);
    }

    @Override // defpackage.uq
    public void x(int i, byte[] bArr) {
        this.c.C(i, bArr);
    }

    @Override // defpackage.uq
    public void y(int i, byte b2) {
        this.c.J(i, b2);
    }

    @Override // defpackage.uq
    public void z(int i, int i2) {
        this.c.J(i, i2);
    }
}
