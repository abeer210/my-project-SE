package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import vigqyno.C0201;

/* compiled from: FrameBasedAnimationDriver */
public class h extends d {
    private long e;
    private double[] f;
    private double g;
    private double h;
    private int i;
    private int j;

    public h(ReadableMap readableMap) {
        a(readableMap);
    }

    @Override // com.facebook.react.animated.d
    public void a(ReadableMap readableMap) {
        ReadableArray array = readableMap.getArray(C0201.m82(29134));
        int size = array.size();
        double[] dArr = this.f;
        if (dArr == null || dArr.length != size) {
            this.f = new double[size];
        }
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            this.f[i2] = array.getDouble(i2);
        }
        String r0 = C0201.m82(29135);
        double d = 0.0d;
        if (readableMap.hasKey(r0)) {
            if (readableMap.getType(r0) == ReadableType.Number) {
                d = readableMap.getDouble(r0);
            }
            this.g = d;
        } else {
            this.g = 0.0d;
        }
        String r02 = C0201.m82(29136);
        if (readableMap.hasKey(r02)) {
            this.i = readableMap.getType(r02) == ReadableType.Number ? readableMap.getInt(r02) : 1;
        } else {
            this.i = 1;
        }
        this.j = 1;
        if (this.i == 0) {
            z = true;
        }
        this.a = z;
        this.e = -1;
    }

    @Override // com.facebook.react.animated.d
    public void b(long j2) {
        double d;
        if (this.e < 0) {
            this.e = j2;
            if (this.j == 1) {
                this.h = this.b.f;
            }
        }
        double d2 = (double) ((j2 - this.e) / 1000000);
        Double.isNaN(d2);
        int round = (int) Math.round(d2 / 16.666666666666668d);
        if (round < 0) {
            throw new IllegalStateException(C0201.m82(29137));
        } else if (!this.a) {
            double[] dArr = this.f;
            if (round >= dArr.length - 1) {
                d = this.g;
                int i2 = this.i;
                if (i2 == -1 || this.j < i2) {
                    this.e = -1;
                    this.j++;
                } else {
                    this.a = true;
                }
            } else {
                double d3 = this.h;
                d = d3 + (dArr[round] * (this.g - d3));
            }
            this.b.f = d;
        }
    }
}
