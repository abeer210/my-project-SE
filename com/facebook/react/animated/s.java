package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMap;
import vigqyno.C0201;

/* compiled from: ValueAnimatedNode */
public class s extends b {
    public Object e = null;
    public double f = Double.NaN;
    public double g = 0.0d;
    private c h;

    public s() {
    }

    public void f() {
        this.g += this.f;
        this.f = 0.0d;
    }

    public void g() {
        this.f += this.g;
        this.g = 0.0d;
    }

    public Object h() {
        return this.e;
    }

    public double i() {
        if (Double.isNaN(this.g + this.f)) {
            e();
        }
        return this.g + this.f;
    }

    public void j() {
        c cVar = this.h;
        if (cVar != null) {
            cVar.a(i());
        }
    }

    public void k(c cVar) {
        this.h = cVar;
    }

    public s(ReadableMap readableMap) {
        this.f = readableMap.getDouble(C0201.m82(27990));
        this.g = readableMap.getDouble(C0201.m82(27991));
    }
}
