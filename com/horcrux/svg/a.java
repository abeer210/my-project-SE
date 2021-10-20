package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import com.facebook.react.bridge.ReadableArray;
import com.horcrux.svg.b0;
import vigqyno.C0201;

/* compiled from: Brush */
public class a {
    private final EnumC0078a a;
    private final b0[] b;
    private ReadableArray c;
    private final boolean d;
    private boolean e;
    private Matrix f;
    private Rect g;
    private t h;

    /* access modifiers changed from: package-private */
    /* renamed from: com.horcrux.svg.a$a  reason: collision with other inner class name */
    /* compiled from: Brush */
    public enum EnumC0078a {
        LINEAR_GRADIENT,
        RADIAL_GRADIENT,
        PATTERN
    }

    /* access modifiers changed from: package-private */
    /* compiled from: Brush */
    public enum b {
        OBJECT_BOUNDING_BOX,
        USER_SPACE_ON_USE
    }

    public a(EnumC0078a aVar, b0[] b0VarArr, b bVar) {
        this.a = aVar;
        this.b = b0VarArr;
        this.d = bVar == b.OBJECT_BOUNDING_BOX;
    }

    private RectF a(RectF rectF) {
        float f2;
        if (!this.d) {
            rectF = new RectF(this.g);
        }
        float width = rectF.width();
        float height = rectF.height();
        float f3 = 0.0f;
        if (this.d) {
            f3 = rectF.left;
            f2 = rectF.top;
        } else {
            f2 = 0.0f;
        }
        return new RectF(f3, f2, width + f3, height + f2);
    }

    private double b(b0 b0Var, double d2, float f2, float f3) {
        double d3;
        if (this.d) {
            if (b0Var.b == b0.b.NUMBER) {
                d3 = d2;
                return v.a(b0Var, d2, 0.0d, d3, (double) f3);
            }
        }
        d3 = (double) f2;
        return v.a(b0Var, d2, 0.0d, d3, (double) f3);
    }

    private static void c(ReadableArray readableArray, int i, float[] fArr, int[] iArr, float f2) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 * 2;
            fArr[i2] = (float) readableArray.getDouble(i3);
            int i4 = readableArray.getInt(i3 + 1);
            iArr[i2] = (i4 & 16777215) | (Math.round(((float) (i4 >>> 24)) * f2) << 24);
        }
    }

    public void d(b bVar) {
        this.e = bVar == b.OBJECT_BOUNDING_BOX;
    }

    public void e(ReadableArray readableArray) {
        this.c = readableArray;
    }

    public void f(Matrix matrix) {
        this.f = matrix;
    }

    public void g(t tVar) {
        this.h = tVar;
    }

    public void h(Rect rect) {
        this.g = rect;
    }

    public void i(Paint paint, RectF rectF, float f2, float f3) {
        float[] fArr;
        int[] iArr;
        RectF a2 = a(rectF);
        float width = a2.width();
        float height = a2.height();
        float f4 = a2.left;
        float f5 = a2.top;
        float textSize = paint.getTextSize();
        if (this.a == EnumC0078a.PATTERN) {
            double d2 = (double) width;
            double b2 = b(this.b[0], d2, f2, textSize);
            double d3 = (double) height;
            double b3 = b(this.b[1], d3, f2, textSize);
            double b4 = b(this.b[2], d2, f2, textSize);
            double b5 = b(this.b[3], d3, f2, textSize);
            if (b4 > 1.0d && b5 > 1.0d) {
                Bitmap createBitmap = Bitmap.createBitmap((int) b4, (int) b5, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                RectF viewBox = this.h.getViewBox();
                if (viewBox != null && viewBox.width() > 0.0f && viewBox.height() > 0.0f) {
                    RectF rectF2 = new RectF((float) b2, (float) b3, (float) b4, (float) b5);
                    t tVar = this.h;
                    canvas.concat(v0.a(viewBox, rectF2, tVar.D0, tVar.E0));
                }
                if (this.e) {
                    canvas.scale(width / f2, height / f2);
                }
                this.h.j(canvas, new Paint(), f3);
                Matrix matrix = new Matrix();
                Matrix matrix2 = this.f;
                if (matrix2 != null) {
                    matrix.preConcat(matrix2);
                }
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                BitmapShader bitmapShader = new BitmapShader(createBitmap, tileMode, tileMode);
                bitmapShader.setLocalMatrix(matrix);
                paint.setShader(bitmapShader);
                return;
            }
            return;
        }
        int size = this.c.size();
        String r1 = C0201.m82(29413);
        if (size == 0) {
            f60.A(r1, C0201.m82(29414));
            return;
        }
        int i = size / 2;
        int[] iArr2 = new int[i];
        float[] fArr2 = new float[i];
        c(this.c, i, fArr2, iArr2, f3);
        if (i == 1) {
            int[] iArr3 = {iArr2[0], iArr2[0]};
            float[] fArr3 = {fArr2[0], fArr2[0]};
            f60.A(r1, C0201.m82(29415));
            iArr = iArr3;
            fArr = fArr3;
        } else {
            iArr = iArr2;
            fArr = fArr2;
        }
        EnumC0078a aVar = this.a;
        if (aVar == EnumC0078a.LINEAR_GRADIENT) {
            double d4 = (double) width;
            double b6 = b(this.b[0], d4, f2, textSize);
            double d5 = (double) f4;
            Double.isNaN(d5);
            double d6 = b6 + d5;
            double d7 = (double) height;
            double b7 = b(this.b[1], d7, f2, textSize);
            double d8 = (double) f5;
            Double.isNaN(d8);
            double d9 = b7 + d8;
            double b8 = b(this.b[2], d4, f2, textSize);
            Double.isNaN(d5);
            double d10 = b8 + d5;
            double b9 = b(this.b[3], d7, f2, textSize);
            Double.isNaN(d8);
            Shader linearGradient = new LinearGradient((float) d6, (float) d9, (float) d10, (float) (b9 + d8), iArr, fArr, Shader.TileMode.CLAMP);
            if (this.f != null) {
                Matrix matrix3 = new Matrix();
                matrix3.preConcat(this.f);
                linearGradient.setLocalMatrix(matrix3);
            }
            paint.setShader(linearGradient);
        } else if (aVar == EnumC0078a.RADIAL_GRADIENT) {
            double d11 = (double) width;
            double b10 = b(this.b[2], d11, f2, textSize);
            double d12 = (double) height;
            double b11 = b(this.b[3], d12, f2, textSize) / b10;
            double b12 = b(this.b[4], d11, f2, textSize);
            double d13 = (double) f4;
            Double.isNaN(d13);
            double d14 = b12 + d13;
            double b13 = b(this.b[5], d12, f2, textSize);
            double d15 = (double) f5;
            Double.isNaN(d15);
            Shader radialGradient = new RadialGradient((float) d14, (float) (b13 + (d15 / b11)), (float) b10, iArr, fArr, Shader.TileMode.CLAMP);
            Matrix matrix4 = new Matrix();
            matrix4.preScale(1.0f, (float) b11);
            Matrix matrix5 = this.f;
            if (matrix5 != null) {
                matrix4.preConcat(matrix5);
            }
            radialGradient.setLocalMatrix(matrix4);
            paint.setShader(radialGradient);
        }
    }
}
