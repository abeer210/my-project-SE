package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.facebook.react.bridge.ReactContext;

@SuppressLint({"ViewConstructor"})
/* compiled from: SymbolView */
public class f0 extends k {
    private float t0;
    private float u0;
    private float v0;
    private float w0;
    private String x0;
    private int y0;

    public f0(ReactContext reactContext) {
        super(reactContext);
    }

    public void P(Canvas canvas, Paint paint, float f, float f2, float f3) {
        if (this.x0 != null) {
            float f4 = this.t0;
            float f5 = this.u;
            float f6 = this.u0;
            canvas.concat(v0.a(new RectF(f4 * f5, f6 * f5, (f4 + this.v0) * f5, (f6 + this.w0) * f5), new RectF(0.0f, 0.0f, f2, f3), this.x0, this.y0));
            super.j(canvas, paint, f);
        }
    }

    @Override // com.horcrux.svg.w0, com.horcrux.svg.k, com.horcrux.svg.a0
    public void j(Canvas canvas, Paint paint, float f) {
        v();
    }

    @xj0(name = "align")
    public void setAlign(String str) {
        this.x0 = str;
        invalidate();
    }

    @xj0(name = "meetOrSlice")
    public void setMeetOrSlice(int i) {
        this.y0 = i;
        invalidate();
    }

    @xj0(name = "minX")
    public void setMinX(float f) {
        this.t0 = f;
        invalidate();
    }

    @xj0(name = "minY")
    public void setMinY(float f) {
        this.u0 = f;
        invalidate();
    }

    @xj0(name = "vbHeight")
    public void setVbHeight(float f) {
        this.w0 = f;
        invalidate();
    }

    @xj0(name = "vbWidth")
    public void setVbWidth(float f) {
        this.v0 = f;
        invalidate();
    }
}
