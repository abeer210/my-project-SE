package com.facebook.react.views.art;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import vigqyno.C0201;

/* compiled from: ARTGroupShadowNode */
public class a extends f {
    public RectF f;

    private static RectF f(float[] fArr) {
        if (fArr.length == 4) {
            return new RectF(fArr[0], fArr[1], fArr[0] + fArr[2], fArr[1] + fArr[3]);
        }
        throw new JSApplicationIllegalArgumentException(C0201.m82(8851));
    }

    @Override // com.facebook.react.views.art.f
    public void b(Canvas canvas, Paint paint, float f2) {
        float f3 = f2 * this.a;
        if (f3 > 0.01f) {
            d(canvas);
            RectF rectF = this.f;
            if (rectF != null) {
                float f4 = rectF.left;
                float f5 = this.c;
                canvas.clipRect(f4 * f5, rectF.top * f5, rectF.right * f5, rectF.bottom * f5);
            }
            for (int i = 0; i < getChildCount(); i++) {
                f fVar = (f) getChildAt(i);
                fVar.b(canvas, paint, f3);
                fVar.markUpdateSeen();
            }
            c(canvas);
        }
    }

    @Override // com.facebook.react.uimanager.a0, com.facebook.react.uimanager.b0, com.facebook.react.views.art.f
    public boolean isVirtual() {
        return true;
    }

    @xj0(name = "clipping")
    public void setClipping(ReadableArray readableArray) {
        float[] b = g.b(readableArray);
        if (b != null) {
            this.f = f(b);
            markUpdated();
        }
    }
}
