package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.common.c;
import com.google.android.play.core.common.e;
import java.util.concurrent.Executor;

public final class p0 implements d {
    private final z2 a;
    private iz1<Context> b;
    private iz1<f2> c;
    private iz1<b0> d;
    private iz1<x0> e;
    private iz1<q> f;
    private iz1<String> g = hz1.a(new f3(this.b));
    private iz1<i3> h = new gz1();
    private iz1<Executor> i;
    private iz1<l1> j;
    private iz1<v> k;
    private iz1<r0> l;
    private iz1<p2> m;
    private iz1<z1> n;
    private iz1<d2> o;
    private iz1<c> p;
    private iz1<i2> q;
    private iz1<i0> r;
    private iz1<o1> s;
    private iz1<u0> t;
    private iz1<l0> u;
    private iz1<Executor> v;
    private iz1<t1> w;
    private iz1<m02> x;
    private iz1<v2> y;

    public /* synthetic */ p0(z2 z2Var) {
        this.a = z2Var;
        e3 e3Var = new e3(z2Var);
        this.b = e3Var;
        iz1<f2> a2 = hz1.a(new g2(e3Var));
        this.c = a2;
        this.d = hz1.a(new c0(this.b, a2));
        iz1<x0> a3 = hz1.a(y0.a());
        this.e = a3;
        this.f = hz1.a(new r(this.b, a3));
        iz1<Executor> a4 = hz1.a(a3.a);
        this.i = a4;
        this.j = hz1.a(new m1(this.d, this.h, this.e, a4));
        gz1 gz1 = new gz1();
        this.k = gz1;
        this.l = hz1.a(new s0(this.d, this.h, gz1, this.e));
        this.m = hz1.a(new q2(this.d));
        this.n = hz1.a(new a2(this.d));
        this.o = hz1.a(new e2(this.d, this.h, this.j, this.i, this.e));
        iz1<c> a5 = hz1.a(e.b());
        this.p = a5;
        this.q = hz1.a(new j2(this.d, this.h, a5));
        iz1<i0> a6 = hz1.a(new j0(this.h));
        this.r = a6;
        iz1<o1> a7 = hz1.a(new p1(this.j, this.d, a6));
        this.s = a7;
        this.t = hz1.a(new v0(this.j, this.h, this.l, this.m, this.n, this.o, this.q, a7));
        this.u = hz1.a(m0.a);
        iz1<Executor> a8 = hz1.a(g3.a);
        this.v = a8;
        gz1.b(this.k, hz1.a(new w(this.b, this.j, this.t, this.h, this.e, this.u, this.p, this.i, a8)));
        iz1<t1> a9 = hz1.a(new u1(this.g, this.k, this.e, this.b, this.c, this.i));
        this.w = a9;
        gz1.b(this.h, hz1.a(new d3(this.b, this.f, a9)));
        iz1<m02> a10 = hz1.a(n02.a(this.b));
        this.x = a10;
        iz1<v2> a11 = hz1.a(new w2(this.d, this.h, this.k, a10, this.j, this.e, this.u, this.i));
        this.y = a11;
        hz1.a(new c3(a11, this.b));
    }

    @Override // com.google.android.play.core.assetpacks.d
    public final void a(AssetPackExtractionService assetPackExtractionService) {
        assetPackExtractionService.b = e3.a(this.a);
        assetPackExtractionService.c = this.y.a();
        assetPackExtractionService.d = this.d.a();
    }
}
