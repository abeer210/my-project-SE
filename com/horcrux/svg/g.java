package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;

@SuppressLint({"ViewConstructor"})
/* compiled from: EllipseView */
public class g extends a0 {
    private b0 r0;
    private b0 s0;
    private b0 t0;
    private b0 u0;

    public g(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.w0
    public Path m(Canvas canvas, Paint paint) {
        Path path = new Path();
        double r = r(this.r0);
        double p = p(this.s0);
        double r2 = r(this.t0);
        double p2 = p(this.u0);
        path.addOval(new RectF((float) (r - r2), (float) (p - p2), (float) (r + r2), (float) (p + p2)), Path.Direction.CW);
        return path;
    }

    @xj0(name = "cx")
    public void setCx(Dynamic dynamic) {
        this.r0 = b0.b(dynamic);
        invalidate();
    }

    @xj0(name = "cy")
    public void setCy(Dynamic dynamic) {
        this.s0 = b0.b(dynamic);
        invalidate();
    }

    @xj0(name = "rx")
    public void setRx(Dynamic dynamic) {
        this.t0 = b0.b(dynamic);
        invalidate();
    }

    @xj0(name = "ry")
    public void setRy(Dynamic dynamic) {
        this.u0 = b0.b(dynamic);
        invalidate();
    }
}
