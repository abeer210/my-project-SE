package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* compiled from: WrappedDrawableApi14 */
public class d extends Drawable implements Drawable.Callback, c, b {
    public static final PorterDuff.Mode g = PorterDuff.Mode.SRC_IN;
    private int a;
    private PorterDuff.Mode b;
    private boolean c;
    public f d;
    private boolean e;
    public Drawable f;

    public d(f fVar, Resources resources) {
        this.d = fVar;
        e(resources);
    }

    private f d() {
        return new f(this.d);
    }

    private void e(Resources resources) {
        Drawable.ConstantState constantState;
        f fVar = this.d;
        if (fVar != null && (constantState = fVar.b) != null) {
            a(constantState.newDrawable(resources));
        }
    }

    private boolean f(int[] iArr) {
        if (!c()) {
            return false;
        }
        f fVar = this.d;
        ColorStateList colorStateList = fVar.c;
        PorterDuff.Mode mode = fVar.d;
        if (colorStateList == null || mode == null) {
            this.c = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.c && colorForState == this.a && mode == this.b)) {
                setColorFilter(colorForState, mode);
                this.a = colorForState;
                this.b = mode;
                this.c = true;
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.graphics.drawable.c
    public final void a(Drawable drawable) {
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            f fVar = this.d;
            if (fVar != null) {
                fVar.b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // androidx.core.graphics.drawable.c
    public final Drawable b() {
        return this.f;
    }

    public boolean c() {
        return true;
    }

    public void draw(Canvas canvas) {
        this.f.draw(canvas);
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        f fVar = this.d;
        return changingConfigurations | (fVar != null ? fVar.getChangingConfigurations() : 0) | this.f.getChangingConfigurations();
    }

    public Drawable.ConstantState getConstantState() {
        f fVar = this.d;
        if (fVar == null || !fVar.a()) {
            return null;
        }
        this.d.a = getChangingConfigurations();
        return this.d;
    }

    public Drawable getCurrent() {
        return this.f.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f.getPadding(rect);
    }

    public int[] getState() {
        return this.f.getState();
    }

    public Region getTransparentRegion() {
        return this.f.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return this.f.isAutoMirrored();
    }

    public boolean isStateful() {
        f fVar;
        ColorStateList colorStateList = (!c() || (fVar = this.d) == null) ? null : fVar.c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f.isStateful();
    }

    public void jumpToCurrentState() {
        this.f.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (!this.e && super.mutate() == this) {
            this.d = d();
            Drawable drawable = this.f;
            if (drawable != null) {
                drawable.mutate();
            }
            f fVar = this.d;
            if (fVar != null) {
                Drawable drawable2 = this.f;
                fVar.b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.e = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onLevelChange(int i) {
        return this.f.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        this.f.setAutoMirrored(z);
    }

    public void setChangingConfigurations(int i) {
        this.f.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f.setFilterBitmap(z);
    }

    public boolean setState(int[] iArr) {
        return f(iArr) || this.f.setState(iArr);
    }

    @Override // androidx.core.graphics.drawable.b
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        this.d.c = colorStateList;
        f(getState());
    }

    @Override // androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        this.d.d = mode;
        f(getState());
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public d(Drawable drawable) {
        this.d = d();
        a(drawable);
    }
}
