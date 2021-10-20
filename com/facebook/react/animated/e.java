package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMap;
import vigqyno.C0201;

/* compiled from: DecayAnimation */
public class e extends d {
    private final double e;
    private double f;
    private long g;
    private double h;
    private double i;
    private int j;
    private int k;

    public e(ReadableMap readableMap) {
        this.e = readableMap.getDouble(C0201.m82(28972));
        a(readableMap);
    }

    @Override // com.facebook.react.animated.d
    public void a(ReadableMap readableMap) {
        this.f = readableMap.getDouble(C0201.m82(28973));
        String r0 = C0201.m82(28974);
        boolean z = true;
        int i2 = readableMap.hasKey(r0) ? readableMap.getInt(r0) : 1;
        this.j = i2;
        this.k = 1;
        if (i2 != 0) {
            z = false;
        }
        this.a = z;
        this.g = -1;
        this.h = 0.0d;
        this.i = 0.0d;
    }

    @Override // com.facebook.react.animated.d
    public void b(long j2) {
        long j3 = j2 / 1000000;
        if (this.g == -1) {
            this.g = j3 - 16;
            double d = this.h;
            if (d == this.i) {
                this.h = this.b.f;
            } else {
                this.b.f = d;
            }
            this.i = this.b.f;
        }
        double d2 = this.h;
        double d3 = this.e;
        double d4 = this.f;
        double d5 = (double) (j3 - this.g);
        Double.isNaN(d5);
        double exp = d2 + ((d3 / (1.0d - d4)) * (1.0d - Math.exp((-(1.0d - d4)) * d5)));
        if (Math.abs(this.i - exp) < 0.1d) {
            int i2 = this.j;
            if (i2 == -1 || this.k < i2) {
                this.g = -1;
                this.k++;
            } else {
                this.a = true;
                return;
            }
        }
        this.i = exp;
        this.b.f = exp;
    }
}
