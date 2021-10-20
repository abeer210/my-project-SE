package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.u;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

public final class f4 {
    private long A;
    private long B;
    private String C;
    private boolean D;
    private long E;
    private long F;
    private final o4 a;
    private final String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private long g;
    private long h;
    private long i;
    private String j;
    private long k;
    private String l;
    private long m;
    private long n;
    private boolean o;
    private long p;
    private boolean q;
    private boolean r;
    private String s;
    private Boolean t;
    private long u;
    private List<String> v;
    private long w;
    private long x;
    private long y;
    private long z;

    public f4(o4 o4Var, String str) {
        u.k(o4Var);
        u.g(str);
        this.a = o4Var;
        this.b = str;
        o4Var.c().j();
    }

    public final long A() {
        this.a.c().j();
        return this.y;
    }

    public final long B() {
        this.a.c().j();
        return this.z;
    }

    public final long C() {
        this.a.c().j();
        return this.B;
    }

    public final void D(String str) {
        this.a.c().j();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.D |= !y8.z0(this.d, str);
        this.d = str;
    }

    public final void E(boolean z2) {
        this.a.c().j();
        this.D = this.q != z2;
        this.q = z2;
    }

    public final long F() {
        this.a.c().j();
        return this.A;
    }

    public final String G() {
        this.a.c().j();
        return this.C;
    }

    public final String H() {
        this.a.c().j();
        String str = this.C;
        X(null);
        return str;
    }

    public final long I() {
        this.a.c().j();
        return this.p;
    }

    public final boolean J() {
        this.a.c().j();
        return this.q;
    }

    public final boolean K() {
        this.a.c().j();
        return this.r;
    }

    public final Boolean L() {
        this.a.c().j();
        return this.t;
    }

    public final List<String> M() {
        this.a.c().j();
        return this.v;
    }

    public final void N(String str) {
        this.a.c().j();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.D |= !y8.z0(this.s, str);
        this.s = str;
    }

    public final void O(boolean z2) {
        this.a.c().j();
        this.D = this.r != z2;
        this.r = z2;
    }

    public final void P(String str) {
        this.a.c().j();
        this.D |= !y8.z0(this.e, str);
        this.e = str;
    }

    public final void Q(long j2) {
        this.a.c().j();
        this.D |= this.h != j2;
        this.h = j2;
    }

    public final void R(String str) {
        this.a.c().j();
        this.D |= !y8.z0(this.f, str);
        this.f = str;
    }

    public final void S(long j2) {
        this.a.c().j();
        this.D |= this.i != j2;
        this.i = j2;
    }

    public final void T(String str) {
        this.a.c().j();
        this.D |= !y8.z0(this.j, str);
        this.j = str;
    }

    public final void U(long j2) {
        this.a.c().j();
        this.D |= this.k != j2;
        this.k = j2;
    }

    public final void V(String str) {
        this.a.c().j();
        this.D |= !y8.z0(this.l, str);
        this.l = str;
    }

    public final void W(long j2) {
        this.a.c().j();
        this.D |= this.m != j2;
        this.m = j2;
    }

    public final void X(String str) {
        this.a.c().j();
        this.D |= !y8.z0(this.C, str);
        this.C = str;
    }

    public final void Y(long j2) {
        this.a.c().j();
        this.D |= this.n != j2;
        this.n = j2;
    }

    public final void Z(long j2) {
        this.a.c().j();
        this.D |= this.u != j2;
        this.u = j2;
    }

    public final String a() {
        this.a.c().j();
        return this.c;
    }

    public final void a0(long j2) {
        boolean z2 = true;
        u.a(j2 >= 0);
        this.a.c().j();
        boolean z3 = this.D;
        if (this.g == j2) {
            z2 = false;
        }
        this.D = z2 | z3;
        this.g = j2;
    }

    public final String b() {
        this.a.c().j();
        return this.f;
    }

    public final void b0(long j2) {
        this.a.c().j();
        this.D |= this.E != j2;
        this.E = j2;
    }

    public final String c() {
        this.a.c().j();
        return this.d;
    }

    public final void c0(long j2) {
        this.a.c().j();
        this.D |= this.F != j2;
        this.F = j2;
    }

    public final boolean d() {
        this.a.c().j();
        return this.o;
    }

    public final void d0(long j2) {
        this.a.c().j();
        this.D |= this.w != j2;
        this.w = j2;
    }

    public final void e(boolean z2) {
        this.a.c().j();
        this.D |= this.o != z2;
        this.o = z2;
    }

    public final void e0(long j2) {
        this.a.c().j();
        this.D |= this.x != j2;
        this.x = j2;
    }

    public final void f(Boolean bool) {
        this.a.c().j();
        this.D = !y8.K(this.t, bool);
        this.t = bool;
    }

    public final void f0(long j2) {
        this.a.c().j();
        this.D |= this.y != j2;
        this.y = j2;
    }

    public final void g(String str) {
        this.a.c().j();
        this.D |= !y8.z0(this.c, str);
        this.c = str;
    }

    public final void g0(long j2) {
        this.a.c().j();
        this.D |= this.z != j2;
        this.z = j2;
    }

    public final void h(List<String> list) {
        this.a.c().j();
        if (!y8.W(this.v, list)) {
            this.D = true;
            this.v = list != null ? new ArrayList(list) : null;
        }
    }

    public final void h0(long j2) {
        this.a.c().j();
        this.D |= this.B != j2;
        this.B = j2;
    }

    public final void i() {
        this.a.c().j();
        this.D = false;
    }

    public final void i0(long j2) {
        this.a.c().j();
        this.D |= this.A != j2;
        this.A = j2;
    }

    public final String j() {
        this.a.c().j();
        return this.b;
    }

    public final void j0(long j2) {
        this.a.c().j();
        this.D |= this.p != j2;
        this.p = j2;
    }

    public final String k() {
        this.a.c().j();
        return this.s;
    }

    public final String l() {
        this.a.c().j();
        return this.e;
    }

    public final long m() {
        this.a.c().j();
        return this.h;
    }

    public final long n() {
        this.a.c().j();
        return this.i;
    }

    public final String o() {
        this.a.c().j();
        return this.j;
    }

    public final long p() {
        this.a.c().j();
        return this.k;
    }

    public final String q() {
        this.a.c().j();
        return this.l;
    }

    public final long r() {
        this.a.c().j();
        return this.m;
    }

    public final long s() {
        this.a.c().j();
        return this.n;
    }

    public final long t() {
        this.a.c().j();
        return this.u;
    }

    public final long u() {
        this.a.c().j();
        return this.g;
    }

    public final long v() {
        this.a.c().j();
        return this.E;
    }

    public final long w() {
        this.a.c().j();
        return this.F;
    }

    public final void x() {
        this.a.c().j();
        long j2 = this.g + 1;
        if (j2 > 2147483647L) {
            this.a.e().H().a(C0201.m82(32794), k3.B(this.b));
            j2 = 0;
        }
        this.D = true;
        this.g = j2;
    }

    public final long y() {
        this.a.c().j();
        return this.w;
    }

    public final long z() {
        this.a.c().j();
        return this.x;
    }
}
