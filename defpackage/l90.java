package defpackage;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: l90  reason: default package */
/* compiled from: ForwardingDrawable */
public class l90 extends Drawable implements Drawable.Callback, y90, x90, h90 {
    private static final Matrix d = new Matrix();
    private Drawable a;
    private final i90 b = new i90();
    public y90 c;

    public l90(Drawable drawable) {
        this.a = drawable;
        j90.d(drawable, this, this);
    }

    @Override // defpackage.x90
    public void b(y90 y90) {
        this.c = y90;
    }

    @Override // defpackage.y90
    public void d(Matrix matrix) {
        n(matrix);
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // defpackage.h90
    public Drawable g(Drawable drawable) {
        return p(drawable);
    }

    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return super.getConstantState();
        }
        return drawable.getConstantState();
    }

    public Drawable getCurrent() {
        return this.a;
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return super.getIntrinsicHeight();
        }
        return drawable.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return super.getIntrinsicWidth();
        }
        return drawable.getIntrinsicWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return 0;
        }
        return drawable.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        Drawable drawable = this.a;
        if (drawable == null) {
            return super.getPadding(rect);
        }
        return drawable.getPadding(rect);
    }

    @Override // defpackage.y90
    public void h(RectF rectF) {
        y90 y90 = this.c;
        if (y90 != null) {
            y90.h(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isStateful() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return false;
        }
        return drawable.isStateful();
    }

    @Override // defpackage.h90
    public Drawable l() {
        return getCurrent();
    }

    public Drawable mutate() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    public void n(Matrix matrix) {
        y90 y90 = this.c;
        if (y90 != null) {
            y90.d(matrix);
        } else {
            matrix.reset();
        }
    }

    public void o(RectF rectF) {
        n(d);
        rectF.set(getBounds());
        d.mapRect(rectF);
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onLevelChange(int i) {
        Drawable drawable = this.a;
        if (drawable == null) {
            return super.onLevelChange(i);
        }
        return drawable.setLevel(i);
    }

    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.a;
        if (drawable == null) {
            return super.onStateChange(iArr);
        }
        return drawable.setState(iArr);
    }

    public Drawable p(Drawable drawable) {
        Drawable q = q(drawable);
        invalidateSelf();
        return q;
    }

    public Drawable q(Drawable drawable) {
        Drawable drawable2 = this.a;
        j90.d(drawable2, null, null);
        j90.d(drawable, null, null);
        j90.e(drawable, this.b);
        j90.a(drawable, this);
        j90.d(drawable, this, this);
        this.a = drawable;
        return drawable2;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.b.b(i);
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.b.c(colorFilter);
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    public void setDither(boolean z) {
        this.b.d(z);
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setDither(z);
        }
    }

    public void setFilterBitmap(boolean z) {
        this.b.e(z);
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setFilterBitmap(z);
        }
    }

    @TargetApi(21)
    public void setHotspot(float f, float f2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.a;
        if (drawable == null) {
            return visible;
        }
        return drawable.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
