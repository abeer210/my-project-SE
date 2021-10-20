package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import vigqyno.C0201;

@SuppressLint({"ViewConstructor"})
/* compiled from: MarkerView */
public class o extends k {
    private float A0;
    private float B0;
    private float C0;
    public String D0;
    public int E0;
    public Matrix F0 = new Matrix();
    private b0 t0;
    private b0 u0;
    private b0 v0;
    private b0 w0;
    private String x0;
    private String y0;
    private float z0;

    public o(ReactContext reactContext) {
        super(reactContext);
    }

    public void P(Canvas canvas, Paint paint, float f, w wVar, float f2) {
        int u = u(canvas, this.c);
        this.F0.reset();
        u uVar = wVar.b;
        Matrix matrix = this.F0;
        float f3 = this.u;
        matrix.setTranslate(((float) uVar.a) * f3, ((float) uVar.b) * f3);
        double parseDouble = C0201.m82(26702).equals(this.y0) ? -1.0d : Double.parseDouble(this.y0);
        if (parseDouble == -1.0d) {
            parseDouble = wVar.c;
        }
        this.F0.preRotate(((float) parseDouble) + 180.0f);
        if (C0201.m82(26703).equals(this.x0)) {
            this.F0.preScale(f2, f2);
        }
        double r = r(this.v0);
        double d = (double) this.u;
        Double.isNaN(d);
        double d2 = r / d;
        double p = p(this.w0);
        double d3 = (double) this.u;
        Double.isNaN(d3);
        RectF rectF = new RectF(0.0f, 0.0f, (float) d2, (float) (p / d3));
        if (this.D0 != null) {
            float f4 = this.z0;
            float f5 = this.u;
            float f6 = this.A0;
            Matrix a = v0.a(new RectF(f4 * f5, f6 * f5, (f4 + this.B0) * f5, (f6 + this.C0) * f5), rectF, this.D0, this.E0);
            float[] fArr = new float[9];
            a.getValues(fArr);
            this.F0.preScale(fArr[0], fArr[4]);
        }
        this.F0.preTranslate((float) (-r(this.t0)), (float) (-p(this.u0)));
        canvas.concat(this.F0);
        G(canvas, paint, f);
        t(canvas, u);
    }

    @xj0(name = "align")
    public void setAlign(String str) {
        this.D0 = str;
        invalidate();
    }

    @xj0(name = "markerHeight")
    public void setMarkerHeight(Dynamic dynamic) {
        this.w0 = b0.b(dynamic);
        invalidate();
    }

    @xj0(name = "markerUnits")
    public void setMarkerUnits(String str) {
        this.x0 = str;
        invalidate();
    }

    @xj0(name = "markerWidth")
    public void setMarkerWidth(Dynamic dynamic) {
        this.v0 = b0.b(dynamic);
        invalidate();
    }

    @xj0(name = "meetOrSlice")
    public void setMeetOrSlice(int i) {
        this.E0 = i;
        invalidate();
    }

    @xj0(name = "minX")
    public void setMinX(float f) {
        this.z0 = f;
        invalidate();
    }

    @xj0(name = "minY")
    public void setMinY(float f) {
        this.A0 = f;
        invalidate();
    }

    @xj0(name = "orient")
    public void setOrient(String str) {
        this.y0 = str;
        invalidate();
    }

    @xj0(name = "refX")
    public void setRefX(Dynamic dynamic) {
        this.t0 = b0.b(dynamic);
        invalidate();
    }

    @xj0(name = "refY")
    public void setRefY(Dynamic dynamic) {
        this.u0 = b0.b(dynamic);
        invalidate();
    }

    @xj0(name = "vbHeight")
    public void setVbHeight(float f) {
        this.C0 = f;
        invalidate();
    }

    @xj0(name = "vbWidth")
    public void setVbWidth(float f) {
        this.B0 = f;
        invalidate();
    }

    @Override // com.horcrux.svg.w0, com.horcrux.svg.k
    public void v() {
        if (this.x != null) {
            getSvgView().i(this, this.x);
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof w0) {
                    ((w0) childAt).v();
                }
            }
        }
    }
}
