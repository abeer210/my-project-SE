package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMap;
import vigqyno.C0201;

/* compiled from: SpringAnimation */
public class n extends d {
    private long e;
    private boolean f;
    private double g;
    private double h;
    private double i;
    private double j;
    private boolean k;
    private final b l;
    private double m;
    private double n;
    private double o;
    private double p;
    private double q;
    private int r;
    private int s;
    private double t;

    /* access modifiers changed from: private */
    /* compiled from: SpringAnimation */
    public static class b {
        public double a;
        public double b;

        private b() {
        }
    }

    public n(ReadableMap readableMap) {
        b bVar = new b();
        this.l = bVar;
        bVar.b = readableMap.getDouble(C0201.m82(28470));
        a(readableMap);
    }

    private void c(double d) {
        double d2;
        double d3;
        if (!e()) {
            double d4 = 0.064d;
            if (d <= 0.064d) {
                d4 = d;
            }
            this.q += d4;
            double d5 = this.h;
            double d6 = this.i;
            double d7 = this.g;
            double d8 = -this.j;
            double sqrt = d5 / (Math.sqrt(d7 * d6) * 2.0d);
            double sqrt2 = Math.sqrt(d7 / d6);
            double sqrt3 = Math.sqrt(1.0d - (sqrt * sqrt)) * sqrt2;
            double d9 = this.n - this.m;
            double d10 = this.q;
            if (sqrt < 1.0d) {
                double exp = Math.exp((-sqrt) * sqrt2 * d10);
                double d11 = sqrt * sqrt2;
                double d12 = d8 + (d11 * d9);
                double d13 = d10 * sqrt3;
                d2 = this.n - ((((d12 / sqrt3) * Math.sin(d13)) + (Math.cos(d13) * d9)) * exp);
                d3 = ((d11 * exp) * (((Math.sin(d13) * d12) / sqrt3) + (Math.cos(d13) * d9))) - (((Math.cos(d13) * d12) - ((sqrt3 * d9) * Math.sin(d13))) * exp);
            } else {
                double exp2 = Math.exp((-sqrt2) * d10);
                double d14 = this.n - (((((sqrt2 * d9) + d8) * d10) + d9) * exp2);
                d3 = exp2 * ((d8 * ((d10 * sqrt2) - 1.0d)) + (d10 * d9 * sqrt2 * sqrt2));
                d2 = d14;
            }
            b bVar = this.l;
            bVar.a = d2;
            bVar.b = d3;
            if (e() || (this.k && f())) {
                if (this.g > 0.0d) {
                    double d15 = this.n;
                    this.m = d15;
                    this.l.a = d15;
                } else {
                    double d16 = this.l.a;
                    this.n = d16;
                    this.m = d16;
                }
                this.l.b = 0.0d;
            }
        }
    }

    private double d(b bVar) {
        return Math.abs(this.n - bVar.a);
    }

    private boolean e() {
        return Math.abs(this.l.b) <= this.o && (d(this.l) <= this.p || this.g == 0.0d);
    }

    private boolean f() {
        if (this.g > 0.0d) {
            double d = this.m;
            double d2 = this.n;
            if (d >= d2 || this.l.a <= d2) {
                double d3 = this.m;
                double d4 = this.n;
                if (d3 <= d4 || this.l.a >= d4) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.facebook.react.animated.d
    public void a(ReadableMap readableMap) {
        this.g = readableMap.getDouble(C0201.m82(28471));
        this.h = readableMap.getDouble(C0201.m82(28472));
        this.i = readableMap.getDouble(C0201.m82(28473));
        this.j = this.l.b;
        this.n = readableMap.getDouble(C0201.m82(28474));
        this.o = readableMap.getDouble(C0201.m82(28475));
        this.p = readableMap.getDouble(C0201.m82(28476));
        this.k = readableMap.getBoolean(C0201.m82(28477));
        String r0 = C0201.m82(28478);
        boolean z = true;
        int i2 = readableMap.hasKey(r0) ? readableMap.getInt(r0) : 1;
        this.r = i2;
        if (i2 != 0) {
            z = false;
        }
        this.a = z;
        this.s = 0;
        this.q = 0.0d;
        this.f = false;
    }

    @Override // com.facebook.react.animated.d
    public void b(long j2) {
        long j3 = j2 / 1000000;
        if (!this.f) {
            if (this.s == 0) {
                this.t = this.b.f;
                this.s = 1;
            }
            b bVar = this.l;
            double d = this.b.f;
            bVar.a = d;
            this.m = d;
            this.e = j3;
            this.q = 0.0d;
            this.f = true;
        }
        double d2 = (double) (j3 - this.e);
        Double.isNaN(d2);
        c(d2 / 1000.0d);
        this.e = j3;
        this.b.f = this.l.a;
        if (e()) {
            int i2 = this.r;
            if (i2 == -1 || this.s < i2) {
                this.f = false;
                this.b.f = this.t;
                this.s++;
                return;
            }
            this.a = true;
        }
    }
}
