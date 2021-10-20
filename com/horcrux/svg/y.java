package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.horcrux.svg.a;
import vigqyno.C0201;

@SuppressLint({"ViewConstructor"})
/* compiled from: RadialGradientView */
public class y extends d {
    private static final float[] i0 = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    private b0 W;
    private b0 a0;
    private b0 b0;
    private b0 c0;
    private b0 d0;
    private b0 e0;
    private ReadableArray f0;
    private a.b g0;
    private Matrix h0 = null;

    public y(ReactContext reactContext) {
        super(reactContext);
    }

    @xj0(name = "cx")
    public void setCx(Dynamic dynamic) {
        this.d0 = b0.b(dynamic);
        invalidate();
    }

    @xj0(name = "cy")
    public void setCy(Dynamic dynamic) {
        this.e0 = b0.b(dynamic);
        invalidate();
    }

    @xj0(name = "fx")
    public void setFx(Dynamic dynamic) {
        this.W = b0.b(dynamic);
        invalidate();
    }

    @xj0(name = "fy")
    public void setFy(Dynamic dynamic) {
        this.a0 = b0.b(dynamic);
        invalidate();
    }

    @xj0(name = "gradient")
    public void setGradient(ReadableArray readableArray) {
        this.f0 = readableArray;
        invalidate();
    }

    @xj0(name = "gradientTransform")
    public void setGradientTransform(ReadableArray readableArray) {
        if (readableArray != null) {
            int c = v.c(readableArray, i0, this.u);
            if (c == 6) {
                if (this.h0 == null) {
                    this.h0 = new Matrix();
                }
                this.h0.setValues(i0);
            } else if (c != -1) {
                f60.A(C0201.m82(26877), C0201.m82(26878));
            }
        } else {
            this.h0 = null;
        }
        invalidate();
    }

    @xj0(name = "gradientUnits")
    public void setGradientUnits(int i) {
        if (i == 0) {
            this.g0 = a.b.OBJECT_BOUNDING_BOX;
        } else if (i == 1) {
            this.g0 = a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    @xj0(name = "rx")
    public void setRx(Dynamic dynamic) {
        this.b0 = b0.b(dynamic);
        invalidate();
    }

    @xj0(name = "ry")
    public void setRy(Dynamic dynamic) {
        this.c0 = b0.b(dynamic);
        invalidate();
    }

    @Override // com.horcrux.svg.w0
    public void v() {
        if (this.x != null) {
            a aVar = new a(a.EnumC0078a.RADIAL_GRADIENT, new b0[]{this.W, this.a0, this.b0, this.c0, this.d0, this.e0}, this.g0);
            aVar.e(this.f0);
            Matrix matrix = this.h0;
            if (matrix != null) {
                aVar.f(matrix);
            }
            e0 svgView = getSvgView();
            if (this.g0 == a.b.USER_SPACE_ON_USE) {
                aVar.h(svgView.getCanvasBounds());
            }
            svgView.f(aVar, this.x);
        }
    }
}
