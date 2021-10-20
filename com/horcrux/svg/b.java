package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;

@SuppressLint({"ViewConstructor"})
/* compiled from: CircleView */
public class b extends a0 {
    private b0 r0;
    private b0 s0;
    private b0 t0;

    public b(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.w0
    public Path m(Canvas canvas, Paint paint) {
        Path path = new Path();
        path.addCircle((float) r(this.r0), (float) p(this.s0), (float) q(this.t0), Path.Direction.CW);
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

    @xj0(name = "r")
    public void setR(Dynamic dynamic) {
        this.t0 = b0.b(dynamic);
        invalidate();
    }
}
