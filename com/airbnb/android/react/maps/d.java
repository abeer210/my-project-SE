package com.airbnb.android.react.maps;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.Log;
import com.google.android.gms.maps.c;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.a0;
import com.google.android.gms.maps.model.b0;
import com.google.android.gms.maps.model.c0;
import com.google.android.gms.maps.model.z;
import java.io.ByteArrayOutputStream;
import java.util.List;
import vigqyno.C0201;

/* compiled from: AirMapGradientPolyline */
public class d extends c {
    private List<LatLng> a;
    private int[] b;
    private float c;
    private float d;
    private c e;
    private a0 f;
    private a g;
    public final Context h;

    /* compiled from: AirMapGradientPolyline */
    public class a implements c0 {
        public final List<LatLng> b;
        public final int[] c;
        public final float d;
        public final float e;
        public final int f;
        public final d62 g = new d62(256.0d);
        public LatLng[] h;
        public y52[] i;
        public y52[] j;

        public a(Context context, List<LatLng> list, int[] iArr, float f2) {
            this.b = list;
            this.c = iArr;
            this.d = f2;
            float f3 = context.getResources().getDisplayMetrics().density;
            this.e = f3;
            this.f = (int) (f3 * 256.0f);
            a();
        }

        public void a() {
            this.h = new LatLng[this.b.size()];
            this.i = new y52[this.b.size()];
            this.j = new y52[Math.max(this.b.size() - 1, 0)];
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                LatLng latLng = this.b.get(i2);
                this.h[i2] = latLng;
                this.i[i2] = this.g.a(latLng);
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    this.j[i3] = this.g.a(l42.c(this.b.get(i3), latLng, 0.5d));
                }
            }
        }

        public void b(Canvas canvas, Matrix matrix, Paint paint, Paint paint2, b bVar, b bVar2, float f2, float f3) {
            if (f2 == f3) {
                c(canvas, paint2, bVar, bVar2, f2);
                return;
            }
            matrix.reset();
            matrix.preRotate((float) Math.toDegrees(Math.atan2(bVar2.b - bVar.b, bVar2.a - bVar.a)), (float) bVar.a, (float) bVar.b);
            matrix.preTranslate((float) bVar.a, (float) bVar.b);
            float sqrt = (float) Math.sqrt(Math.pow(bVar2.a - bVar.a, 2.0d) + Math.pow(bVar2.b - bVar.b, 2.0d));
            matrix.preScale(sqrt, sqrt);
            float f4 = 1.0f / (f3 - f2);
            matrix.preScale(f4, f4);
            matrix.preTranslate(-f2, 0.0f);
            paint.getShader().setLocalMatrix(matrix);
            canvas.drawLine((float) bVar.a, (float) bVar.b, (float) bVar2.a, (float) bVar2.b, paint);
        }

        public void c(Canvas canvas, Paint paint, b bVar, b bVar2, float f2) {
            paint.setColor(d.i(this.c, f2));
            canvas.drawLine((float) bVar.a, (float) bVar.b, (float) bVar2.a, (float) bVar2.b, paint);
        }

        public void d(Canvas canvas, Matrix matrix, Paint paint, Paint paint2, float f2, int i2, int i3) {
            Canvas canvas2 = canvas;
            b bVar = new b();
            b bVar2 = new b();
            b bVar3 = new b();
            b bVar4 = new b();
            b bVar5 = new b();
            float f3 = 1.0f;
            if (this.b.size() == 1) {
                bVar.a(this.i[0], f2, i2, i3, this.f);
                paint2.setStyle(Paint.Style.FILL);
                paint2.setColor(d.i(this.c, 1.0f));
                canvas2.drawCircle((float) bVar.a, (float) bVar.b, paint2.getStrokeWidth() / 2.0f, paint2);
                paint2.setStyle(Paint.Style.STROKE);
            } else if (this.b.size() == 2) {
                bVar.a(this.i[0], f2, i2, i3, this.f);
                bVar2.a(this.i[1], f2, i2, i3, this.f);
                c(canvas, paint2, bVar, bVar2, 0.0f);
            } else {
                int i4 = 2;
                while (i4 < this.b.size()) {
                    int i5 = i4 - 2;
                    bVar.a(this.i[i5], f2, i2, i3, this.f);
                    int i6 = i4 - 1;
                    bVar2.a(this.i[i6], f2, i2, i3, this.f);
                    bVar3.a(this.i[i4], f2, i2, i3, this.f);
                    bVar4.a(this.j[i5], f2, i2, i3, this.f);
                    bVar5.a(this.j[i6], f2, i2, i3, this.f);
                    float f4 = (float) i4;
                    float size = (f4 - 2.0f) / ((float) this.b.size());
                    float size2 = (f4 - f3) / ((float) this.b.size());
                    float f5 = (size + size2) / 2.0f;
                    Log.d(C0201.m82(32752), String.valueOf(f5));
                    paint2.setStyle(Paint.Style.FILL);
                    paint2.setColor(d.i(this.c, f5));
                    canvas2.drawCircle((float) bVar2.a, (float) bVar2.b, paint2.getStrokeWidth() / 2.0f, paint2);
                    paint2.setStyle(Paint.Style.STROKE);
                    b(canvas, matrix, paint, paint2, i5 == 0 ? bVar : bVar4, bVar2, size, f5);
                    b(canvas, matrix, paint, paint2, bVar2, i4 == this.b.size() + -1 ? bVar3 : bVar5, f5, size2);
                    i4++;
                    canvas2 = canvas;
                    f3 = 1.0f;
                }
            }
        }

        @Override // com.google.android.gms.maps.model.c0
        public z getTile(int i2, int i3, int i4) {
            int i5 = this.f;
            Bitmap createBitmap = Bitmap.createBitmap(i5, i5, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Matrix matrix = new Matrix();
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(this.d);
            paint.setStrokeCap(Paint.Cap.BUTT);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setFlags(1);
            paint.setShader(new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, this.c, (float[]) null, Shader.TileMode.CLAMP));
            paint.getShader().setLocalMatrix(matrix);
            Paint paint2 = new Paint();
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(this.d);
            paint2.setStrokeCap(Paint.Cap.BUTT);
            paint2.setStrokeJoin(Paint.Join.ROUND);
            paint2.setFlags(1);
            double pow = Math.pow(2.0d, (double) i4);
            double d2 = (double) this.e;
            Double.isNaN(d2);
            d(canvas, matrix, paint, paint2, (float) (pow * d2), i2, i3);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            int i6 = this.f;
            return new z(i6, i6, byteArrayOutputStream.toByteArray());
        }
    }

    /* compiled from: AirMapGradientPolyline */
    public static class b {
        public double a;
        public double b;

        public b a(y52 y52, float f, int i, int i2, int i3) {
            double d = y52.a;
            double d2 = (double) f;
            Double.isNaN(d2);
            double d3 = (double) (i * i3);
            Double.isNaN(d3);
            this.a = (d * d2) - d3;
            double d4 = y52.b;
            Double.isNaN(d2);
            double d5 = (double) (i2 * i3);
            Double.isNaN(d5);
            this.b = (d4 * d2) - d5;
            return this;
        }
    }

    public d(Context context) {
        super(context);
        this.h = context;
    }

    private b0 h() {
        b0 b0Var = new b0();
        b0Var.y(this.c);
        a aVar = new a(this.h, this.a, this.b, this.d);
        this.g = aVar;
        b0Var.u(aVar);
        return b0Var;
    }

    public static int i(int[] iArr, float f2) {
        float length = f2 * ((float) (iArr.length - 1));
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            float max = Math.max(1.0f - Math.abs(length - ((float) i4)), 0.0f);
            i += (int) (((float) Color.red(iArr[i4])) * max);
            i2 += (int) (((float) Color.green(iArr[i4])) * max);
            i3 += (int) (((float) Color.blue(iArr[i4])) * max);
        }
        return Color.rgb(i, i2, i3);
    }

    @Override // com.airbnb.android.react.maps.c
    public void e(c cVar) {
        this.f.b();
    }

    public void f(c cVar) {
        Log.d(C0201.m82(36631), C0201.m82(36632));
        this.e = cVar;
        this.f = cVar.f(h());
    }

    @Override // com.airbnb.android.react.maps.c
    public Object getFeature() {
        return this.f;
    }

    public void setCoordinates(List<LatLng> list) {
        this.a = list;
        a0 a0Var = this.f;
        if (a0Var != null) {
            a0Var.b();
        }
        c cVar = this.e;
        if (cVar != null) {
            this.f = cVar.f(h());
        }
    }

    public void setStrokeColors(int[] iArr) {
        this.b = iArr;
        a0 a0Var = this.f;
        if (a0Var != null) {
            a0Var.b();
        }
        c cVar = this.e;
        if (cVar != null) {
            this.f = cVar.f(h());
        }
    }

    public void setWidth(float f2) {
        this.d = f2;
        a0 a0Var = this.f;
        if (a0Var != null) {
            a0Var.b();
        }
        c cVar = this.e;
        if (cVar != null) {
            this.f = cVar.f(h());
        }
    }

    public void setZIndex(float f2) {
        this.c = f2;
        a0 a0Var = this.f;
        if (a0Var != null) {
            a0Var.d(f2);
        }
    }
}
