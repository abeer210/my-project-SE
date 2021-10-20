package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.horcrux.svg.a;
import vigqyno.C0201;

@SuppressLint({"ViewConstructor"})
/* compiled from: LinearGradientView */
public class n extends d {
    private static final float[] g0 = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    private b0 W;
    private b0 a0;
    private b0 b0;
    private b0 c0;
    private ReadableArray d0;
    private a.b e0;
    private Matrix f0 = null;

    public n(ReactContext reactContext) {
        super(reactContext);
    }

    @xj0(name = "gradient")
    public void setGradient(ReadableArray readableArray) {
        this.d0 = readableArray;
        invalidate();
    }

    @xj0(name = "gradientTransform")
    public void setGradientTransform(ReadableArray readableArray) {
        if (readableArray != null) {
            int c = v.c(readableArray, g0, this.u);
            if (c == 6) {
                if (this.f0 == null) {
                    this.f0 = new Matrix();
                }
                this.f0.setValues(g0);
            } else if (c != -1) {
                f60.A(C0201.m82(26578), C0201.m82(26579));
            }
        } else {
            this.f0 = null;
        }
        invalidate();
    }

    @xj0(name = "gradientUnits")
    public void setGradientUnits(int i) {
        if (i == 0) {
            this.e0 = a.b.OBJECT_BOUNDING_BOX;
        } else if (i == 1) {
            this.e0 = a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    @xj0(name = "x1")
    public void setX1(Dynamic dynamic) {
        this.W = b0.b(dynamic);
        invalidate();
    }

    @xj0(name = "x2")
    public void setX2(Dynamic dynamic) {
        this.b0 = b0.b(dynamic);
        invalidate();
    }

    @xj0(name = "y1")
    public void setY1(Dynamic dynamic) {
        this.a0 = b0.b(dynamic);
        invalidate();
    }

    @xj0(name = "y2")
    public void setY2(Dynamic dynamic) {
        this.c0 = b0.b(dynamic);
        invalidate();
    }

    @Override // com.horcrux.svg.w0
    public void v() {
        if (this.x != null) {
            a aVar = new a(a.EnumC0078a.LINEAR_GRADIENT, new b0[]{this.W, this.a0, this.b0, this.c0}, this.e0);
            aVar.e(this.d0);
            Matrix matrix = this.f0;
            if (matrix != null) {
                aVar.f(matrix);
            }
            e0 svgView = getSvgView();
            if (this.e0 == a.b.USER_SPACE_ON_USE) {
                aVar.h(svgView.getCanvasBounds());
            }
            svgView.f(aVar, this.x);
        }
    }
}
