package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import java.lang.ref.WeakReference;
import vigqyno.C0201;

/* renamed from: q90  reason: default package */
/* compiled from: RoundedBitmapDrawable */
public class q90 extends t90 {
    private final Paint G = new Paint();
    private final Paint H = new Paint(1);
    private final Bitmap I;
    private WeakReference<Bitmap> J;

    public q90(Resources resources, Bitmap bitmap, Paint paint) {
        super(new BitmapDrawable(resources, bitmap));
        this.I = bitmap;
        if (paint != null) {
            this.G.set(paint);
        }
        this.G.setFlags(1);
        this.H.setStyle(Paint.Style.STROKE);
    }

    private void l() {
        WeakReference<Bitmap> weakReference = this.J;
        if (weakReference == null || weakReference.get() != this.I) {
            this.J = new WeakReference<>(this.I);
            Paint paint = this.G;
            Bitmap bitmap = this.I;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            this.f = true;
        }
        if (this.f) {
            this.G.getShader().setLocalMatrix(this.A);
            this.f = false;
        }
        this.G.setFilterBitmap(d());
    }

    @Override // defpackage.t90
    public void draw(Canvas canvas) {
        if (oh0.d()) {
            oh0.a(C0201.m82(30309));
        }
        if (!g()) {
            super.draw(canvas);
            if (oh0.d()) {
                oh0.b();
                return;
            }
            return;
        }
        k();
        h();
        l();
        int save = canvas.save();
        canvas.concat(this.x);
        canvas.drawPath(this.e, this.G);
        float f = this.d;
        if (f > 0.0f) {
            this.H.setStrokeWidth(f);
            this.H.setColor(j90.c(this.g, this.G.getAlpha()));
            canvas.drawPath(this.h, this.H);
        }
        canvas.restoreToCount(save);
        if (oh0.d()) {
            oh0.b();
        }
    }

    @Override // defpackage.t90
    public boolean g() {
        return super.g() && this.I != null;
    }

    @Override // defpackage.t90
    public void setAlpha(int i) {
        super.setAlpha(i);
        if (i != this.G.getAlpha()) {
            this.G.setAlpha(i);
            super.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // defpackage.t90
    public void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.G.setColorFilter(colorFilter);
    }
}
