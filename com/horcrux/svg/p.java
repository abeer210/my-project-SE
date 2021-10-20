package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.horcrux.svg.a;
import vigqyno.C0201;

@SuppressLint({"ViewConstructor"})
/* compiled from: MaskView */
public class p extends k {
    private static final float[] y0 = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    public b0 t0;
    public b0 u0;
    public b0 v0;
    public b0 w0;
    private Matrix x0 = null;

    public p(ReactContext reactContext) {
        super(reactContext);
    }

    @xj0(name = "height")
    public void setHeight(Dynamic dynamic) {
        this.w0 = b0.b(dynamic);
        invalidate();
    }

    @xj0(name = "maskContentUnits")
    public void setMaskContentUnits(int i) {
        if (i == 0) {
            a.b bVar = a.b.OBJECT_BOUNDING_BOX;
        } else if (i == 1) {
            a.b bVar2 = a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    @xj0(name = "maskTransform")
    public void setMaskTransform(ReadableArray readableArray) {
        if (readableArray != null) {
            int c = v.c(readableArray, y0, this.u);
            if (c == 6) {
                if (this.x0 == null) {
                    this.x0 = new Matrix();
                }
                this.x0.setValues(y0);
            } else if (c != -1) {
                f60.A(C0201.m82(26676), C0201.m82(26677));
            }
        } else {
            this.x0 = null;
        }
        invalidate();
    }

    @xj0(name = "maskUnits")
    public void setMaskUnits(int i) {
        if (i == 0) {
            a.b bVar = a.b.OBJECT_BOUNDING_BOX;
        } else if (i == 1) {
            a.b bVar2 = a.b.USER_SPACE_ON_USE;
        }
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
            getSvgView().j(this, this.x);
        }
    }
}
