package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.horcrux.svg.a;
import vigqyno.C0201;

@SuppressLint({"ViewConstructor"})
/* compiled from: PatternView */
public class t extends k {
    private static final float[] G0 = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    private float A0;
    private float B0;
    private float C0;
    public String D0;
    public int E0;
    private Matrix F0 = null;
    private b0 t0;
    private b0 u0;
    private b0 v0;
    private b0 w0;
    private a.b x0;
    private a.b y0;
    private float z0;

    public t(ReactContext reactContext) {
        super(reactContext);
    }

    public RectF getViewBox() {
        float f = this.z0;
        float f2 = this.u;
        float f3 = this.A0;
        return new RectF(f * f2, f3 * f2, (f + this.B0) * f2, (f3 + this.C0) * f2);
    }

    @xj0(name = "align")
    public void setAlign(String str) {
        this.D0 = str;
        invalidate();
    }

    @xj0(name = "height")
    public void setHeight(Dynamic dynamic) {
        this.w0 = b0.b(dynamic);
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

    @xj0(name = "patternContentUnits")
    public void setPatternContentUnits(int i) {
        if (i == 0) {
            this.y0 = a.b.OBJECT_BOUNDING_BOX;
        } else if (i == 1) {
            this.y0 = a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    @xj0(name = "patternTransform")
    public void setPatternTransform(ReadableArray readableArray) {
        if (readableArray != null) {
            int c = v.c(readableArray, G0, this.u);
            if (c == 6) {
                if (this.F0 == null) {
                    this.F0 = new Matrix();
                }
                this.F0.setValues(G0);
            } else if (c != -1) {
                f60.A(C0201.m82(26791), C0201.m82(26792));
            }
        } else {
            this.F0 = null;
        }
        invalidate();
    }

    @xj0(name = "patternUnits")
    public void setPatternUnits(int i) {
        if (i == 0) {
            this.x0 = a.b.OBJECT_BOUNDING_BOX;
        } else if (i == 1) {
            this.x0 = a.b.USER_SPACE_ON_USE;
        }
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

    @xj0(name = "width")
    public void setWidth(Dynamic dynamic) {
        this.v0 = b0.b(dynamic);
        invalidate();
    }

    @xj0(name = "x")
    public void setX(Dynamic dynamic) {
        this.t0 = b0.b(dynamic);
        invalidate();
    }

    @xj0(name = "y")
    public void setY(Dynamic dynamic) {
        this.u0 = b0.b(dynamic);
        invalidate();
    }

    @Override // com.horcrux.svg.w0, com.horcrux.svg.k
    public void v() {
        if (this.x != null) {
            a aVar = new a(a.EnumC0078a.PATTERN, new b0[]{this.t0, this.u0, this.v0, this.w0}, this.x0);
            aVar.d(this.y0);
            aVar.g(this);
            Matrix matrix = this.F0;
            if (matrix != null) {
                aVar.f(matrix);
            }
            e0 svgView = getSvgView();
            a.b bVar = this.x0;
            a.b bVar2 = a.b.USER_SPACE_ON_USE;
            if (bVar == bVar2 || this.y0 == bVar2) {
                aVar.h(svgView.getCanvasBounds());
            }
            svgView.f(aVar, this.x);
        }
    }
}
