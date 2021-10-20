package com.facebook.react.views.image;

import android.graphics.Matrix;
import android.graphics.Rect;
import defpackage.w90;
import vigqyno.C0201;

/* compiled from: ScaleTypeStartInside */
public class h extends w90.a {
    public static final w90.c j = new h();

    @Override // defpackage.w90.a
    public void b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        float min = Math.min(Math.min(f3, f4), 1.0f);
        matrix.setScale(min, min);
        matrix.postTranslate((float) ((int) (((float) rect.left) + 0.5f)), (float) ((int) (((float) rect.top) + 0.5f)));
    }

    public String toString() {
        return C0201.m82(31775);
    }
}
