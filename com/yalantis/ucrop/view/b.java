package com.yalantis.ucrop.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import androidx.appcompat.widget.o;
import vigqyno.C0201;

/* compiled from: TransformImageView */
public class b extends o {
    public final float[] c;
    public final float[] d;
    private final float[] e;
    public Matrix f;
    public int g;
    public int h;
    public AbstractC0134b i;
    private float[] j;
    private float[] k;
    public boolean l;
    public boolean m;
    private int n;
    private String o;
    private String p;
    private ju2 q;

    /* compiled from: TransformImageView */
    class a implements eu2 {
        public a() {
        }

        @Override // defpackage.eu2
        public void a(Bitmap bitmap, ju2 ju2, String str, String str2) {
            b.this.o = str;
            b.this.p = str2;
            b.this.q = ju2;
            b bVar = b.this;
            bVar.l = true;
            bVar.setImageBitmap(bitmap);
        }

        @Override // defpackage.eu2
        public void onFailure(Exception exc) {
            Log.e(C0201.m82(36915), C0201.m82(36916), exc);
            AbstractC0134b bVar = b.this.i;
            if (bVar != null) {
                bVar.c(exc);
            }
        }
    }

    /* renamed from: com.yalantis.ucrop.view.b$b  reason: collision with other inner class name */
    /* compiled from: TransformImageView */
    public interface AbstractC0134b {
        void a(float f);

        void b();

        void c(Exception exc);

        void d(float f);
    }

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void o() {
        this.f.mapPoints(this.c, this.j);
        this.f.mapPoints(this.d, this.k);
    }

    public float f(Matrix matrix) {
        return (float) (-(Math.atan2((double) h(matrix, 1), (double) h(matrix, 0)) * 57.29577951308232d));
    }

    public float g(Matrix matrix) {
        return (float) Math.sqrt(Math.pow((double) h(matrix, 0), 2.0d) + Math.pow((double) h(matrix, 3), 2.0d));
    }

    public float getCurrentAngle() {
        return f(this.f);
    }

    public float getCurrentScale() {
        return g(this.f);
    }

    public ju2 getExifInfo() {
        return this.q;
    }

    public String getImageInputPath() {
        return this.o;
    }

    public String getImageOutputPath() {
        return this.p;
    }

    public int getMaxBitmapSize() {
        if (this.n <= 0) {
            this.n = lu2.b(getContext());
        }
        return this.n;
    }

    public Bitmap getViewBitmap() {
        if (getDrawable() == null || !(getDrawable() instanceof ou2)) {
            return null;
        }
        return ((ou2) getDrawable()).a();
    }

    public float h(Matrix matrix, int i2) {
        matrix.getValues(this.e);
        return this.e[i2];
    }

    public void i() {
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public void j() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            float intrinsicWidth = (float) drawable.getIntrinsicWidth();
            float intrinsicHeight = (float) drawable.getIntrinsicHeight();
            Log.d(C0201.m82(2333), String.format(C0201.m82(2332), Integer.valueOf((int) intrinsicWidth), Integer.valueOf((int) intrinsicHeight)));
            RectF rectF = new RectF(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
            this.j = ru2.b(rectF);
            this.k = ru2.a(rectF);
            this.m = true;
            AbstractC0134b bVar = this.i;
            if (bVar != null) {
                bVar.b();
            }
        }
    }

    public void k(float f2, float f3, float f4) {
        if (f2 != 0.0f) {
            this.f.postRotate(f2, f3, f4);
            setImageMatrix(this.f);
            AbstractC0134b bVar = this.i;
            if (bVar != null) {
                bVar.a(f(this.f));
            }
        }
    }

    public void l(float f2, float f3, float f4) {
        if (f2 != 0.0f) {
            this.f.postScale(f2, f2, f3, f4);
            setImageMatrix(this.f);
            AbstractC0134b bVar = this.i;
            if (bVar != null) {
                bVar.d(g(this.f));
            }
        }
    }

    public void m(float f2, float f3) {
        if (f2 != 0.0f || f3 != 0.0f) {
            this.f.postTranslate(f2, f3);
            setImageMatrix(this.f);
        }
    }

    public void n(Uri uri, Uri uri2) throws Exception {
        int maxBitmapSize = getMaxBitmapSize();
        lu2.d(getContext(), uri, uri2, maxBitmapSize, maxBitmapSize, new a());
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (z || (this.l && !this.m)) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            this.g = (getWidth() - getPaddingRight()) - paddingLeft;
            this.h = (getHeight() - getPaddingBottom()) - paddingTop;
            j();
        }
    }

    @Override // androidx.appcompat.widget.o
    public void setImageBitmap(Bitmap bitmap) {
        setImageDrawable(new ou2(bitmap));
    }

    public void setImageMatrix(Matrix matrix) {
        super.setImageMatrix(matrix);
        this.f.set(matrix);
        o();
    }

    public void setMaxBitmapSize(int i2) {
        this.n = i2;
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.MATRIX) {
            super.setScaleType(scaleType);
        } else {
            Log.w(C0201.m82(2334), C0201.m82(2335));
        }
    }

    public void setTransformImageListener(AbstractC0134b bVar) {
        this.i = bVar;
    }

    public b(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.c = new float[8];
        this.d = new float[2];
        this.e = new float[9];
        this.f = new Matrix();
        this.l = false;
        this.m = false;
        this.n = 0;
        i();
    }
}
