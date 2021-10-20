package defpackage;

import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: x9  reason: default package */
public final class x9 extends v9 {
    public x9() {
    }

    public x9(int i) throws t8 {
        super(i);
    }

    public x9 A(boolean z) {
        f(C0188.f23, z);
        return this;
    }

    public x9 B(boolean z) {
        f(256, z);
        return this;
    }

    public x9 C(boolean z) {
        f(2, z);
        return this;
    }

    @Override // defpackage.v9
    public void a(int i) throws t8 {
        if ((i & 256) > 0 && (i & 512) > 0) {
            throw new t8(C0201.m82(13696), 103);
        } else if ((i & 2) > 0 && (i & 768) > 0) {
            throw new t8(C0201.m82(13697), 103);
        }
    }

    @Override // defpackage.v9
    public int e() {
        return -2147475470;
    }

    public boolean h() {
        return c(64);
    }

    public boolean i() {
        return c(512);
    }

    public boolean j() {
        return c(4096);
    }

    public boolean k() {
        return c(2048);
    }

    public boolean l() {
        return c(1024);
    }

    public boolean m() {
        return (d() & 768) > 0;
    }

    public boolean n() {
        return c(32);
    }

    public boolean o() {
        return c(C0188.f23);
    }

    public boolean p() {
        return (d() & 768) == 0;
    }

    public boolean q() {
        return c(256);
    }

    public void r(x9 x9Var) throws t8 {
        if (x9Var != null) {
            g(x9Var.d() | d());
        }
    }

    public x9 s(boolean z) {
        f(512, z);
        return this;
    }

    public x9 t(boolean z) {
        f(4096, z);
        return this;
    }

    public x9 u(boolean z) {
        f(2048, z);
        return this;
    }

    public x9 v(boolean z) {
        f(1024, z);
        return this;
    }

    public x9 w(boolean z) {
        f(64, z);
        return this;
    }

    public x9 x(boolean z) {
        f(16, z);
        return this;
    }

    public x9 y(boolean z) {
        f(128, z);
        return this;
    }

    public x9 z(boolean z) {
        f(32, z);
        return this;
    }
}
