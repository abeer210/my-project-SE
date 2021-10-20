package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.AttributeSet;
import com.yalantis.ucrop.h;
import com.yalantis.ucrop.task.BitmapCropTask;
import com.yalantis.ucrop.view.b;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import vigqyno.C0201;

/* compiled from: CropImageView */
public class a extends b {
    private Runnable A;
    private float B;
    private float C;
    private int D;
    private int E;
    private long F;
    private final RectF u;
    private final Matrix v;
    private float w;
    private float x;
    private fu2 y;
    private Runnable z;

    /* access modifiers changed from: private */
    /* renamed from: com.yalantis.ucrop.view.a$a  reason: collision with other inner class name */
    /* compiled from: CropImageView */
    public static class RunnableC0133a implements Runnable {
        private final WeakReference<a> a;
        private final long b;
        private final long c = System.currentTimeMillis();
        private final float d;
        private final float e;
        private final float f;
        private final float g;
        private final float h;
        private final float i;
        private final boolean j;

        public RunnableC0133a(a aVar, long j2, float f2, float f3, float f4, float f5, float f6, float f7, boolean z) {
            this.a = new WeakReference<>(aVar);
            this.b = j2;
            this.d = f2;
            this.e = f3;
            this.f = f4;
            this.g = f5;
            this.h = f6;
            this.i = f7;
            this.j = z;
        }

        public void run() {
            a aVar = this.a.get();
            if (aVar != null) {
                float min = (float) Math.min(this.b, System.currentTimeMillis() - this.c);
                float b2 = mu2.b(min, 0.0f, this.f, (float) this.b);
                float b3 = mu2.b(min, 0.0f, this.g, (float) this.b);
                float a2 = mu2.a(min, 0.0f, this.i, (float) this.b);
                if (min < ((float) this.b)) {
                    float[] fArr = aVar.d;
                    aVar.m(b2 - (fArr[0] - this.d), b3 - (fArr[1] - this.e));
                    if (!this.j) {
                        aVar.D(this.h + a2, aVar.u.centerX(), aVar.u.centerY());
                    }
                    if (!aVar.v()) {
                        aVar.post(this);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: CropImageView */
    public static class b implements Runnable {
        private final WeakReference<a> a;
        private final long b;
        private final long c = System.currentTimeMillis();
        private final float d;
        private final float e;
        private final float f;
        private final float g;

        public b(a aVar, long j, float f2, float f3, float f4, float f5) {
            this.a = new WeakReference<>(aVar);
            this.b = j;
            this.d = f2;
            this.e = f3;
            this.f = f4;
            this.g = f5;
        }

        public void run() {
            a aVar = this.a.get();
            if (aVar != null) {
                float min = (float) Math.min(this.b, System.currentTimeMillis() - this.c);
                float a2 = mu2.a(min, 0.0f, this.e, (float) this.b);
                if (min < ((float) this.b)) {
                    aVar.D(this.d + a2, this.f, this.g);
                    aVar.post(this);
                    return;
                }
                aVar.z();
            }
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void A(float f, float f2) {
        float width = this.u.width();
        float height = this.u.height();
        float max = Math.max(this.u.width() / f, this.u.height() / f2);
        RectF rectF = this.u;
        float f3 = ((height - (f2 * max)) / 2.0f) + rectF.top;
        this.f.reset();
        this.f.postScale(max, max);
        this.f.postTranslate(((width - (f * max)) / 2.0f) + rectF.left, f3);
        setImageMatrix(this.f);
    }

    private float[] q() {
        this.v.reset();
        this.v.setRotate(-getCurrentAngle());
        float[] fArr = this.c;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        float[] b2 = ru2.b(this.u);
        this.v.mapPoints(copyOf);
        this.v.mapPoints(b2);
        RectF d = ru2.d(copyOf);
        RectF d2 = ru2.d(b2);
        float f = d.left - d2.left;
        float f2 = d.top - d2.top;
        float f3 = d.right - d2.right;
        float f4 = d.bottom - d2.bottom;
        float[] fArr2 = new float[4];
        if (f <= 0.0f) {
            f = 0.0f;
        }
        fArr2[0] = f;
        if (f2 <= 0.0f) {
            f2 = 0.0f;
        }
        fArr2[1] = f2;
        if (f3 >= 0.0f) {
            f3 = 0.0f;
        }
        fArr2[2] = f3;
        if (f4 >= 0.0f) {
            f4 = 0.0f;
        }
        fArr2[3] = f4;
        this.v.reset();
        this.v.setRotate(getCurrentAngle());
        this.v.mapPoints(fArr2);
        return fArr2;
    }

    private void r() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            s((float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
        }
    }

    private void s(float f, float f2) {
        float min = Math.min(Math.min(this.u.width() / f, this.u.width() / f2), Math.min(this.u.height() / f2, this.u.height() / f));
        this.C = min;
        this.B = min * this.x;
    }

    public void B(float f, float f2, float f3, long j) {
        if (f > getMaxScale()) {
            f = getMaxScale();
        }
        float currentScale = getCurrentScale();
        b bVar = new b(this, j, currentScale, f - currentScale, f2, f3);
        this.A = bVar;
        post(bVar);
    }

    public void C(float f) {
        D(f, this.u.centerX(), this.u.centerY());
    }

    public void D(float f, float f2, float f3) {
        if (f <= getMaxScale()) {
            l(f / getCurrentScale(), f2, f3);
        }
    }

    public void E(float f) {
        F(f, this.u.centerX(), this.u.centerY());
    }

    public void F(float f, float f2, float f3) {
        if (f >= getMinScale()) {
            l(f / getCurrentScale(), f2, f3);
        }
    }

    public fu2 getCropBoundsChangeListener() {
        return this.y;
    }

    public float getMaxScale() {
        return this.B;
    }

    public float getMinScale() {
        return this.C;
    }

    public float getTargetAspectRatio() {
        return this.w;
    }

    @Override // com.yalantis.ucrop.view.b
    public void j() {
        super.j();
        Drawable drawable = getDrawable();
        if (drawable != null) {
            float intrinsicWidth = (float) drawable.getIntrinsicWidth();
            float intrinsicHeight = (float) drawable.getIntrinsicHeight();
            if (this.w == 0.0f) {
                this.w = intrinsicWidth / intrinsicHeight;
            }
            int i = this.g;
            float f = this.w;
            int i2 = (int) (((float) i) / f);
            int i3 = this.h;
            if (i2 > i3) {
                int i4 = (int) (((float) i3) * f);
                int i5 = (i - i4) / 2;
                this.u.set((float) i5, 0.0f, (float) (i4 + i5), (float) i3);
            } else {
                int i6 = (i3 - i2) / 2;
                this.u.set(0.0f, (float) i6, (float) i, (float) (i2 + i6));
            }
            s(intrinsicWidth, intrinsicHeight);
            A(intrinsicWidth, intrinsicHeight);
            fu2 fu2 = this.y;
            if (fu2 != null) {
                fu2.a(this.w);
            }
            b.AbstractC0134b bVar = this.i;
            if (bVar != null) {
                bVar.d(getCurrentScale());
                this.i.a(getCurrentAngle());
            }
        }
    }

    @Override // com.yalantis.ucrop.view.b
    public void l(float f, float f2, float f3) {
        if (f > 1.0f && getCurrentScale() * f <= getMaxScale()) {
            super.l(f, f2, f3);
        } else if (f < 1.0f && getCurrentScale() * f >= getMinScale()) {
            super.l(f, f2, f3);
        }
    }

    public void setCropBoundsChangeListener(fu2 fu2) {
        this.y = fu2;
    }

    public void setCropRect(RectF rectF) {
        this.w = rectF.width() / rectF.height();
        this.u.set(rectF.left - ((float) getPaddingLeft()), rectF.top - ((float) getPaddingTop()), rectF.right - ((float) getPaddingRight()), rectF.bottom - ((float) getPaddingBottom()));
        r();
        z();
    }

    public void setImageToWrapCropBounds(boolean z2) {
        float f;
        float f2;
        float f3;
        if (this.m && !v()) {
            float[] fArr = this.d;
            float f4 = fArr[0];
            float f5 = fArr[1];
            float currentScale = getCurrentScale();
            float centerX = this.u.centerX() - f4;
            float centerY = this.u.centerY() - f5;
            this.v.reset();
            this.v.setTranslate(centerX, centerY);
            float[] fArr2 = this.c;
            float[] copyOf = Arrays.copyOf(fArr2, fArr2.length);
            this.v.mapPoints(copyOf);
            boolean w2 = w(copyOf);
            if (w2) {
                float[] q = q();
                f2 = -(q[1] + q[3]);
                f3 = -(q[0] + q[2]);
                f = 0.0f;
            } else {
                RectF rectF = new RectF(this.u);
                this.v.reset();
                this.v.setRotate(getCurrentAngle());
                this.v.mapRect(rectF);
                float[] c = ru2.c(this.c);
                f3 = centerX;
                f = (Math.max(rectF.width() / c[0], rectF.height() / c[1]) * currentScale) - currentScale;
                f2 = centerY;
            }
            if (z2) {
                RunnableC0133a aVar = new RunnableC0133a(this, this.F, f4, f5, f3, f2, currentScale, f, w2);
                this.z = aVar;
                post(aVar);
                return;
            }
            m(f3, f2);
            if (!w2) {
                D(currentScale + f, this.u.centerX(), this.u.centerY());
            }
        }
    }

    public void setImageToWrapCropBoundsAnimDuration(long j) {
        if (j > 0) {
            this.F = j;
            return;
        }
        throw new IllegalArgumentException(C0201.m82(2357));
    }

    public void setMaxResultImageSizeX(int i) {
        this.D = i;
    }

    public void setMaxResultImageSizeY(int i) {
        this.E = i;
    }

    public void setMaxScaleMultiplier(float f) {
        this.x = f;
    }

    public void setTargetAspectRatio(float f) {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            this.w = f;
            return;
        }
        if (f == 0.0f) {
            this.w = ((float) drawable.getIntrinsicWidth()) / ((float) drawable.getIntrinsicHeight());
        } else {
            this.w = f;
        }
        fu2 fu2 = this.y;
        if (fu2 != null) {
            fu2.a(this.w);
        }
    }

    public void t() {
        removeCallbacks(this.z);
        removeCallbacks(this.A);
    }

    public void u(Bitmap.CompressFormat compressFormat, int i, du2 du2) {
        t();
        setImageToWrapCropBounds(false);
        new BitmapCropTask(getViewBitmap(), new ku2(this.u, ru2.d(this.c), getCurrentScale(), getCurrentAngle()), new iu2(this.D, this.E, compressFormat, i, getImageInputPath(), getImageOutputPath(), getExifInfo()), du2).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public boolean v() {
        return w(this.c);
    }

    public boolean w(float[] fArr) {
        this.v.reset();
        this.v.setRotate(-getCurrentAngle());
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        this.v.mapPoints(copyOf);
        float[] b2 = ru2.b(this.u);
        this.v.mapPoints(b2);
        return ru2.d(copyOf).contains(ru2.d(b2));
    }

    public void x(float f) {
        k(f, this.u.centerX(), this.u.centerY());
    }

    public void y(TypedArray typedArray) {
        float abs = Math.abs(typedArray.getFloat(h.ucrop_UCropView_ucrop_aspect_ratio_x, 0.0f));
        float abs2 = Math.abs(typedArray.getFloat(h.ucrop_UCropView_ucrop_aspect_ratio_y, 0.0f));
        if (abs == 0.0f || abs2 == 0.0f) {
            this.w = 0.0f;
        } else {
            this.w = abs / abs2;
        }
    }

    public void z() {
        setImageToWrapCropBounds(true);
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.u = new RectF();
        this.v = new Matrix();
        this.x = 10.0f;
        this.A = null;
        this.D = 0;
        this.E = 0;
        this.F = 500;
    }
}
