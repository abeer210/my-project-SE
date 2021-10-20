package com.horcrux.svg;

import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;

/* compiled from: GlyphContext */
public class i {
    private double[] A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private final float M;
    private final float N;
    private final float O;
    public final ArrayList<h> a = new ArrayList<>();
    private final ArrayList<b0[]> b = new ArrayList<>();
    private final ArrayList<b0[]> c = new ArrayList<>();
    private final ArrayList<b0[]> d = new ArrayList<>();
    private final ArrayList<b0[]> e = new ArrayList<>();
    private final ArrayList<double[]> f = new ArrayList<>();
    private final ArrayList<Integer> g = new ArrayList<>();
    private final ArrayList<Integer> h = new ArrayList<>();
    private final ArrayList<Integer> i = new ArrayList<>();
    private final ArrayList<Integer> j = new ArrayList<>();
    private final ArrayList<Integer> k = new ArrayList<>();
    private final ArrayList<Integer> l = new ArrayList<>();
    private final ArrayList<Integer> m = new ArrayList<>();
    private final ArrayList<Integer> n = new ArrayList<>();
    private final ArrayList<Integer> o = new ArrayList<>();
    private final ArrayList<Integer> p = new ArrayList<>();
    private double q = 12.0d;
    private h r = h.p;
    private double s;
    private double t;
    private double u;
    private double v;
    private b0[] w;
    private b0[] x;
    private b0[] y;
    private b0[] z;

    public i(float f2, float f3, float f4) {
        b0[] b0VarArr = new b0[0];
        this.w = b0VarArr;
        this.x = new b0[0];
        this.y = new b0[0];
        this.z = new b0[0];
        this.A = new double[]{0.0d};
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.M = f2;
        this.N = f3;
        this.O = f4;
        this.b.add(b0VarArr);
        this.c.add(this.x);
        this.d.add(this.y);
        this.e.add(this.z);
        this.f.add(this.A);
        this.g.add(Integer.valueOf(this.G));
        this.h.add(Integer.valueOf(this.H));
        this.i.add(Integer.valueOf(this.I));
        this.j.add(Integer.valueOf(this.J));
        this.k.add(Integer.valueOf(this.K));
        this.a.add(this.r);
        q();
    }

    private double[] a(ArrayList<b0> arrayList) {
        int size = arrayList.size();
        double[] dArr = new double[size];
        for (int i2 = 0; i2 < size; i2++) {
            dArr[i2] = arrayList.get(i2).a;
        }
        return dArr;
    }

    private b0[] e(ArrayList<b0> arrayList) {
        int size = arrayList.size();
        b0[] b0VarArr = new b0[size];
        for (int i2 = 0; i2 < size; i2++) {
            b0VarArr[i2] = arrayList.get(i2);
        }
        return b0VarArr;
    }

    private h f(k kVar) {
        if (this.L > 0) {
            return this.r;
        }
        for (k parentTextRoot = kVar.getParentTextRoot(); parentTextRoot != null; parentTextRoot = parentTextRoot.getParentTextRoot()) {
            h b2 = parentTextRoot.I().b();
            if (b2 != h.p) {
                return b2;
            }
        }
        return h.p;
    }

    private static void h(ArrayList<Integer> arrayList, int i2) {
        while (i2 >= 0) {
            arrayList.set(i2, Integer.valueOf(arrayList.get(i2).intValue() + 1));
            i2--;
        }
    }

    private void q() {
        this.l.add(Integer.valueOf(this.B));
        this.m.add(Integer.valueOf(this.C));
        this.n.add(Integer.valueOf(this.D));
        this.o.add(Integer.valueOf(this.E));
        this.p.add(Integer.valueOf(this.F));
    }

    private void r(k kVar, ReadableMap readableMap) {
        h f2 = f(kVar);
        this.L++;
        if (readableMap == null) {
            this.a.add(f2);
            return;
        }
        h hVar = new h(readableMap, f2, (double) this.M);
        this.q = hVar.a;
        this.a.add(hVar);
        this.r = hVar;
    }

    private void s() {
        this.F = 0;
        this.E = 0;
        this.D = 0;
        this.C = 0;
        this.B = 0;
        this.K = -1;
        this.J = -1;
        this.I = -1;
        this.H = -1;
        this.G = -1;
        this.v = 0.0d;
        this.u = 0.0d;
        this.t = 0.0d;
        this.s = 0.0d;
    }

    public h b() {
        return this.r;
    }

    public double c() {
        return this.q;
    }

    public float d() {
        return this.O;
    }

    public float g() {
        return this.N;
    }

    public double i() {
        h(this.i, this.D);
        int i2 = this.I + 1;
        b0[] b0VarArr = this.y;
        if (i2 < b0VarArr.length) {
            this.I = i2;
            this.u += v.a(b0VarArr[i2], (double) this.N, 0.0d, (double) this.M, this.q);
        }
        return this.u;
    }

    public double j() {
        h(this.j, this.E);
        int i2 = this.J + 1;
        b0[] b0VarArr = this.z;
        if (i2 < b0VarArr.length) {
            this.J = i2;
            this.v += v.a(b0VarArr[i2], (double) this.O, 0.0d, (double) this.M, this.q);
        }
        return this.v;
    }

    public double k() {
        h(this.k, this.F);
        int min = Math.min(this.K + 1, this.A.length - 1);
        this.K = min;
        return this.A[min];
    }

    public double l(double d2) {
        h(this.g, this.B);
        int i2 = this.G + 1;
        b0[] b0VarArr = this.w;
        if (i2 < b0VarArr.length) {
            this.u = 0.0d;
            this.G = i2;
            this.s = v.a(b0VarArr[i2], (double) this.N, 0.0d, (double) this.M, this.q);
        }
        double d3 = this.s + d2;
        this.s = d3;
        return d3;
    }

    public double m() {
        h(this.h, this.C);
        int i2 = this.H + 1;
        b0[] b0VarArr = this.x;
        if (i2 < b0VarArr.length) {
            this.v = 0.0d;
            this.H = i2;
            this.t = v.a(b0VarArr[i2], (double) this.O, 0.0d, (double) this.M, this.q);
        }
        return this.t;
    }

    public void n() {
        this.a.remove(this.L);
        this.l.remove(this.L);
        this.m.remove(this.L);
        this.n.remove(this.L);
        this.o.remove(this.L);
        this.p.remove(this.L);
        int i2 = this.L - 1;
        this.L = i2;
        int i3 = this.B;
        int i4 = this.C;
        int i5 = this.D;
        int i6 = this.E;
        int i7 = this.F;
        this.r = this.a.get(i2);
        this.B = this.l.get(this.L).intValue();
        this.C = this.m.get(this.L).intValue();
        this.D = this.n.get(this.L).intValue();
        this.E = this.o.get(this.L).intValue();
        this.F = this.p.get(this.L).intValue();
        if (i3 != this.B) {
            this.b.remove(i3);
            this.w = this.b.get(this.B);
            this.G = this.g.get(this.B).intValue();
        }
        if (i4 != this.C) {
            this.c.remove(i4);
            this.x = this.c.get(this.C);
            this.H = this.h.get(this.C).intValue();
        }
        if (i5 != this.D) {
            this.d.remove(i5);
            this.y = this.d.get(this.D);
            this.I = this.i.get(this.D).intValue();
        }
        if (i6 != this.E) {
            this.e.remove(i6);
            this.z = this.e.get(this.E);
            this.J = this.j.get(this.E).intValue();
        }
        if (i7 != this.F) {
            this.f.remove(i7);
            this.A = this.f.get(this.F);
            this.K = this.k.get(this.F).intValue();
        }
    }

    public void o(k kVar, ReadableMap readableMap) {
        r(kVar, readableMap);
        q();
    }

    public void p(boolean z2, t0 t0Var, ReadableMap readableMap, ArrayList<b0> arrayList, ArrayList<b0> arrayList2, ArrayList<b0> arrayList3, ArrayList<b0> arrayList4, ArrayList<b0> arrayList5) {
        if (z2) {
            s();
        }
        r(t0Var, readableMap);
        if (!(arrayList == null || arrayList.size() == 0)) {
            this.B++;
            this.G = -1;
            this.g.add(-1);
            b0[] e2 = e(arrayList);
            this.w = e2;
            this.b.add(e2);
        }
        if (!(arrayList2 == null || arrayList2.size() == 0)) {
            this.C++;
            this.H = -1;
            this.h.add(-1);
            b0[] e3 = e(arrayList2);
            this.x = e3;
            this.c.add(e3);
        }
        if (!(arrayList3 == null || arrayList3.size() == 0)) {
            this.D++;
            this.I = -1;
            this.i.add(-1);
            b0[] e4 = e(arrayList3);
            this.y = e4;
            this.d.add(e4);
        }
        if (!(arrayList4 == null || arrayList4.size() == 0)) {
            this.E++;
            this.J = -1;
            this.j.add(-1);
            b0[] e5 = e(arrayList4);
            this.z = e5;
            this.e.add(e5);
        }
        if (!(arrayList5 == null || arrayList5.size() == 0)) {
            this.F++;
            this.K = -1;
            this.k.add(-1);
            double[] a2 = a(arrayList5);
            this.A = a2;
            this.f.add(a2);
        }
        q();
    }
}
