package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import vigqyno.C0201;

@SuppressLint({"ViewConstructor"})
/* compiled from: UseView */
public class u0 extends a0 {
    private String r0;
    private b0 s0;
    private b0 t0;
    private b0 u0;
    private b0 v0;

    public u0(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.w0, com.horcrux.svg.a0
    public void j(Canvas canvas, Paint paint, float f) {
        w0 s = getSvgView().s(this.r0);
        if (s == null) {
            f60.A(C0201.m82(7723), C0201.m82(7721) + this.r0 + C0201.m82(7722));
            return;
        }
        s.e();
        canvas.translate((float) r(this.s0), (float) p(this.t0));
        boolean z = s instanceof a0;
        if (z) {
            ((a0) s).z(this);
        }
        int u = s.u(canvas, this.c);
        i(canvas, paint);
        if (s instanceof f0) {
            ((f0) s).P(canvas, paint, f, (float) r(this.u0), (float) p(this.v0));
        } else {
            s.j(canvas, paint, f * this.b);
        }
        setClientRect(s.getClientRect());
        s.t(canvas, u);
        if (z) {
            ((a0) s).B();
        }
    }

    @Override // com.horcrux.svg.w0
    public Path m(Canvas canvas, Paint paint) {
        w0 s = getSvgView().s(this.r0);
        if (s == null) {
            f60.A(C0201.m82(7726), C0201.m82(7724) + this.r0 + C0201.m82(7725));
            return null;
        }
        Path m = s.m(canvas, paint);
        Path path = new Path();
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) r(this.s0), (float) p(this.t0));
        m.transform(matrix, path);
        return path;
    }

    @Override // com.horcrux.svg.w0, com.horcrux.svg.a0
    public int n(float[] fArr) {
        if (this.i && this.j) {
            float[] fArr2 = new float[2];
            this.g.mapPoints(fArr2, fArr);
            this.h.mapPoints(fArr2);
            w0 s = getSvgView().s(this.r0);
            if (s == null) {
                f60.A(C0201.m82(7729), C0201.m82(7727) + this.r0 + C0201.m82(7728));
                return -1;
            }
            int n = s.n(fArr2);
            if (n != -1) {
                return (s.o() || n != s.getId()) ? n : getId();
            }
        }
        return -1;
    }

    @xj0(name = "height")
    public void setHeight(Dynamic dynamic) {
        this.v0 = b0.b(dynamic);
        invalidate();
    }

    @xj0(name = "href")
    public void setHref(String str) {
        this.r0 = str;
        invalidate();
    }

    @xj0(name = "width")
    public void setWidth(Dynamic dynamic) {
        this.u0 = b0.b(dynamic);
        invalidate();
    }

    @xj0(name = "x")
    public void setX(Dynamic dynamic) {
        this.s0 = b0.b(dynamic);
        invalidate();
    }

    @xj0(name = "y")
    public void setY(Dynamic dynamic) {
        this.t0 = b0.b(dynamic);
        invalidate();
    }
}
