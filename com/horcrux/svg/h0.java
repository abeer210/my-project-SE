package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;

@SuppressLint({"ViewConstructor"})
/* compiled from: TextPathView */
public class h0 extends t0 {
    private String E0;
    private r0 F0;
    private q0 G0;
    private b0 H0;

    public h0(ReactContext reactContext) {
        super(reactContext);
        p0 p0Var = p0.align;
        s0 s0Var = s0.exact;
    }

    @Override // com.horcrux.svg.k
    public void L() {
    }

    @Override // com.horcrux.svg.t0, com.horcrux.svg.k
    public void M() {
    }

    public q0 V() {
        return this.G0;
    }

    public r0 W() {
        return this.F0;
    }

    public b0 X() {
        return this.H0;
    }

    public Path Y(Canvas canvas, Paint paint) {
        w0 s = getSvgView().s(this.E0);
        if (!(s instanceof a0)) {
            return null;
        }
        return ((a0) s).m(canvas, paint);
    }

    @Override // com.horcrux.svg.w0, com.horcrux.svg.t0, com.horcrux.svg.k, com.horcrux.svg.a0
    public void j(Canvas canvas, Paint paint, float f) {
        G(canvas, paint, f);
    }

    @Override // com.horcrux.svg.w0, com.horcrux.svg.t0, com.horcrux.svg.k
    public Path m(Canvas canvas, Paint paint) {
        return R(canvas, paint);
    }

    @xj0(name = "href")
    public void setHref(String str) {
        this.E0 = str;
        invalidate();
    }

    @Override // com.horcrux.svg.t0
    @xj0(name = "method")
    public void setMethod(String str) {
        p0.valueOf(str);
        invalidate();
    }

    @xj0(name = "midLine")
    public void setSharp(String str) {
        this.G0 = q0.valueOf(str);
        invalidate();
    }

    @xj0(name = "side")
    public void setSide(String str) {
        this.F0 = r0.valueOf(str);
        invalidate();
    }

    @xj0(name = "spacing")
    public void setSpacing(String str) {
        s0.valueOf(str);
        invalidate();
    }

    @xj0(name = "startOffset")
    public void setStartOffset(Dynamic dynamic) {
        this.H0 = b0.b(dynamic);
        invalidate();
    }
}
