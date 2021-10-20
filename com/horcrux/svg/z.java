package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;

@SuppressLint({"ViewConstructor"})
/* compiled from: RectView */
public class z extends a0 {
    private b0 r0;
    private b0 s0;
    private b0 t0;
    private b0 u0;
    private b0 v0;
    private b0 w0;

    public z(ReactContext reactContext) {
        super(reactContext);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008a  */
    @Override // com.horcrux.svg.w0
    public Path m(Canvas canvas, Paint paint) {
        double d;
        double d2;
        double d3;
        double d4;
        Path path = new Path();
        double r = r(this.r0);
        double p = p(this.s0);
        double r2 = r(this.t0);
        double p2 = p(this.u0);
        if (this.v0 == null && this.w0 == null) {
            path.addRect((float) r, (float) p, (float) (r + r2), (float) (p + p2), Path.Direction.CW);
            path.close();
        } else {
            b0 b0Var = this.v0;
            if (b0Var == null) {
                d2 = p(this.w0);
            } else if (this.w0 == null) {
                d2 = r(b0Var);
            } else {
                d2 = r(b0Var);
                d = p(this.w0);
                d3 = r2 / 2.0d;
                if (d2 > d3) {
                    d2 = d3;
                }
                d4 = p2 / 2.0d;
                if (d > d4) {
                    d = d4;
                }
                if (Build.VERSION.SDK_INT < 21) {
                    path.addRoundRect((float) r, (float) p, (float) (r + r2), (float) (p + p2), (float) d2, (float) d, Path.Direction.CW);
                } else {
                    path.addRoundRect(new RectF((float) r, (float) p, (float) (r + r2), (float) (p + p2)), (float) d2, (float) d, Path.Direction.CW);
                }
            }
            d = d2;
            d3 = r2 / 2.0d;
            if (d2 > d3) {
            }
            d4 = p2 / 2.0d;
            if (d > d4) {
            }
            if (Build.VERSION.SDK_INT < 21) {
            }
        }
        return path;
    }

    @xj0(name = "height")
    public void setHeight(Dynamic dynamic) {
        this.u0 = b0.b(dynamic);
        invalidate();
    }

    @xj0(name = "rx")
    public void setRx(Dynamic dynamic) {
        this.v0 = b0.b(dynamic);
        invalidate();
    }

    @xj0(name = "ry")
    public void setRy(Dynamic dynamic) {
        this.w0 = b0.b(dynamic);
        invalidate();
    }

    @xj0(name = "width")
    public void setWidth(Dynamic dynamic) {
        this.t0 = b0.b(dynamic);
        invalidate();
    }

    @xj0(name = "x")
    public void setX(Dynamic dynamic) {
        this.r0 = b0.b(dynamic);
        invalidate();
    }

    @xj0(name = "y")
    public void setY(Dynamic dynamic) {
        this.s0 = b0.b(dynamic);
        invalidate();
    }
}
