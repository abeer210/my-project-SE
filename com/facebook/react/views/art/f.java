package com.facebook.react.views.art;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.b0;
import com.facebook.react.uimanager.c;
import vigqyno.C0201;

/* compiled from: ARTVirtualNode */
public abstract class f extends b0 {
    private static final float[] d = new float[9];
    private static final float[] e = new float[9];
    public float a = 1.0f;
    private Matrix b = new Matrix();
    public final float c = c.f().density;

    public abstract void b(Canvas canvas, Paint paint, float f);

    public void c(Canvas canvas) {
        canvas.restore();
    }

    public final void d(Canvas canvas) {
        canvas.save();
        Matrix matrix = this.b;
        if (matrix != null) {
            canvas.concat(matrix);
        }
    }

    public void e() {
        float[] fArr = e;
        float[] fArr2 = d;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[2];
        float f = fArr2[4];
        float f2 = this.c;
        fArr[2] = f * f2;
        fArr[3] = fArr2[1];
        fArr[4] = fArr2[3];
        fArr[5] = fArr2[5] * f2;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
        if (this.b == null) {
            this.b = new Matrix();
        }
        this.b.setValues(e);
    }

    @Override // com.facebook.react.uimanager.a0, com.facebook.react.uimanager.b0
    public boolean isVirtual() {
        return true;
    }

    @xj0(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(float f) {
        this.a = f;
        markUpdated();
    }

    @xj0(name = "transform")
    public void setTransform(ReadableArray readableArray) {
        if (readableArray != null) {
            int a2 = g.a(readableArray, d);
            if (a2 == 6) {
                e();
            } else if (a2 != -1) {
                throw new JSApplicationIllegalArgumentException(C0201.m82(9430));
            }
        } else {
            this.b = null;
        }
        markUpdated();
    }
}
