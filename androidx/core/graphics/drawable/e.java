package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;
import vigqyno.C0201;

/* compiled from: WrappedDrawableApi21 */
public class e extends d {
    private static Method h;

    public e(Drawable drawable) {
        super(drawable);
        g();
    }

    private void g() {
        if (h == null) {
            try {
                h = Drawable.class.getDeclaredMethod(C0201.m82(37613), new Class[0]);
            } catch (Exception e) {
                Log.w(C0201.m82(37614), C0201.m82(37615), e);
            }
        }
    }

    @Override // androidx.core.graphics.drawable.d
    public boolean c() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f;
        if ((drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    public Rect getDirtyBounds() {
        return this.f.getDirtyBounds();
    }

    public void getOutline(Outline outline) {
        this.f.getOutline(outline);
    }

    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f;
        if (!(drawable == null || (method = h) == null)) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e) {
                Log.w(C0201.m82(37616), C0201.m82(37617), e);
            }
        }
        return false;
    }

    public void setHotspot(float f, float f2) {
        this.f.setHotspot(f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // androidx.core.graphics.drawable.d
    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // androidx.core.graphics.drawable.d, androidx.core.graphics.drawable.b
    public void setTint(int i) {
        if (c()) {
            super.setTint(i);
        } else {
            this.f.setTint(i);
        }
    }

    @Override // androidx.core.graphics.drawable.d, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        if (c()) {
            super.setTintList(colorStateList);
        } else {
            this.f.setTintList(colorStateList);
        }
    }

    @Override // androidx.core.graphics.drawable.d, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        if (c()) {
            super.setTintMode(mode);
        } else {
            this.f.setTintMode(mode);
        }
    }

    public e(f fVar, Resources resources) {
        super(fVar, resources);
        g();
    }
}
