package com.BV.LinearGradient;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.q;

/* compiled from: LinearGradientView */
public class b extends View {
    private final Paint a = new Paint(1);
    private Path b;
    private RectF c;
    private LinearGradient d;
    private float[] e;
    private float[] f = {0.0f, 0.0f};
    private float[] g = {0.0f, 1.0f};
    private int[] h;
    private boolean i = false;
    private float[] j = {0.5f, 0.5f};
    private float k = 45.0f;
    private int[] l = {0, 0};
    private float[] m = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};

    public b(Context context) {
        super(context);
    }

    private float[] a(float f2) {
        float sqrt = (float) Math.sqrt(2.0d);
        double d2 = (double) ((f2 - 90.0f) * 0.017453292f);
        return new float[]{((float) Math.cos(d2)) * sqrt, ((float) Math.sin(d2)) * sqrt};
    }

    private void b() {
        int[] iArr = this.h;
        if (iArr != null) {
            float[] fArr = this.e;
            if (fArr == null || iArr.length == fArr.length) {
                float[] fArr2 = this.f;
                float[] fArr3 = this.g;
                if (this.i && this.j != null) {
                    float[] a2 = a(this.k);
                    float[] fArr4 = this.j;
                    float[] fArr5 = {fArr4[0] - (a2[0] / 2.0f), fArr4[1] - (a2[1] / 2.0f)};
                    fArr3 = new float[]{fArr4[0] + (a2[0] / 2.0f), fArr4[1] + (a2[1] / 2.0f)};
                    fArr2 = fArr5;
                }
                float f2 = fArr2[0];
                int[] iArr2 = this.l;
                LinearGradient linearGradient = new LinearGradient(((float) iArr2[0]) * f2, fArr2[1] * ((float) iArr2[1]), fArr3[0] * ((float) iArr2[0]), fArr3[1] * ((float) iArr2[1]), this.h, this.e, Shader.TileMode.CLAMP);
                this.d = linearGradient;
                this.a.setShader(linearGradient);
                invalidate();
            }
        }
    }

    private void c() {
        if (this.b == null) {
            this.b = new Path();
            this.c = new RectF();
        }
        this.b.reset();
        RectF rectF = this.c;
        int[] iArr = this.l;
        rectF.set(0.0f, 0.0f, (float) iArr[0], (float) iArr[1]);
        this.b.addRoundRect(this.c, this.m, Path.Direction.CW);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = this.b;
        if (path == null) {
            canvas.drawPaint(this.a);
        } else {
            canvas.drawPath(path, this.a);
        }
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        this.l = new int[]{i2, i3};
        c();
        b();
    }

    public void setAngle(float f2) {
        this.k = f2;
        b();
    }

    public void setAngleCenter(ReadableArray readableArray) {
        this.j = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        b();
    }

    public void setBorderRadii(ReadableArray readableArray) {
        int size = readableArray.size();
        float[] fArr = new float[size];
        for (int i2 = 0; i2 < size; i2++) {
            fArr[i2] = q.c((float) readableArray.getDouble(i2));
        }
        this.m = fArr;
        c();
        b();
    }

    public void setColors(ReadableArray readableArray) {
        int size = readableArray.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = readableArray.getInt(i2);
        }
        this.h = iArr;
        b();
    }

    public void setEndPosition(ReadableArray readableArray) {
        this.g = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        b();
    }

    public void setLocations(ReadableArray readableArray) {
        int size = readableArray.size();
        float[] fArr = new float[size];
        for (int i2 = 0; i2 < size; i2++) {
            fArr[i2] = (float) readableArray.getDouble(i2);
        }
        this.e = fArr;
        b();
    }

    public void setStartPosition(ReadableArray readableArray) {
        this.f = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        b();
    }

    public void setUseAngle(boolean z) {
        this.i = z;
        b();
    }
}
