package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.a;

/* renamed from: q  reason: default package */
/* compiled from: DrawableWrapper */
public class q extends Drawable implements Drawable.Callback {
    private Drawable a;

    public q(Drawable drawable) {
        b(drawable);
    }

    public Drawable a() {
        return this.a;
    }

    public void b(Drawable drawable) {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.a.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.a.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.a.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.a.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.a.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.a.getMinimumWidth();
    }

    public int getOpacity() {
        return this.a.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.a.getPadding(rect);
    }

    public int[] getState() {
        return this.a.getState();
    }

    public Region getTransparentRegion() {
        return this.a.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return a.h(this.a);
    }

    public boolean isStateful() {
        return this.a.isStateful();
    }

    public void jumpToCurrentState() {
        a.i(this.a);
    }

    public void onBoundsChange(Rect rect) {
        this.a.setBounds(rect);
    }

    public boolean onLevelChange(int i) {
        return this.a.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        a.j(this.a, z);
    }

    public void setChangingConfigurations(int i) {
        this.a.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.a.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.a.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        a.k(this.a, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        a.l(this.a, i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.a.setState(iArr);
    }

    public void setTint(int i) {
        a.n(this.a, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        a.o(this.a, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        a.p(this.a, mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.a.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
