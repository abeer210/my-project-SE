package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;

@SuppressLint({"ViewConstructor"})
/* compiled from: LineView */
public class m extends a0 {
    private b0 r0;
    private b0 s0;
    private b0 t0;
    private b0 u0;

    public m(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.w0
    public Path m(Canvas canvas, Paint paint) {
        Path path = new Path();
        double r = r(this.r0);
        double p = p(this.s0);
        double r2 = r(this.t0);
        double p2 = p(this.u0);
        path.moveTo((float) r, (float) p);
        path.lineTo((float) r2, (float) p2);
        return path;
    }

    @xj0(name = "x1")
    public void setX1(Dynamic dynamic) {
        this.r0 = b0.b(dynamic);
        invalidate();
    }

    @xj0(name = "x2")
    public void setX2(Dynamic dynamic) {
        this.t0 = b0.b(dynamic);
        invalidate();
    }

    @xj0(name = "y1")
    public void setY1(Dynamic dynamic) {
        this.s0 = b0.b(dynamic);
        invalidate();
    }

    @xj0(name = "y2")
    public void setY2(Dynamic dynamic) {
        this.u0 = b0.b(dynamic);
        invalidate();
    }
}
