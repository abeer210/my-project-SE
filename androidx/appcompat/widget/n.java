package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.widget.e;

/* compiled from: AppCompatImageHelper */
public class n {
    private final ImageView a;
    private v0 b;
    private v0 c;
    private v0 d;

    public n(ImageView imageView) {
        this.a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.d == null) {
            this.d = new v0();
        }
        v0 v0Var = this.d;
        v0Var.a();
        ColorStateList a2 = e.a(this.a);
        if (a2 != null) {
            v0Var.d = true;
            v0Var.a = a2;
        }
        PorterDuff.Mode b2 = e.b(this.a);
        if (b2 != null) {
            v0Var.c = true;
            v0Var.b = b2;
        }
        if (!v0Var.d && !v0Var.c) {
            return false;
        }
        j.i(drawable, v0Var, this.a.getDrawableState());
        return true;
    }

    private boolean j() {
        int i = Build.VERSION.SDK_INT;
        if (i <= 21) {
            return i == 21;
        }
        if (this.b != null) {
            return true;
        }
        return false;
    }

    public void b() {
        Drawable drawable = this.a.getDrawable();
        if (drawable != null) {
            e0.b(drawable);
        }
        if (drawable == null) {
            return;
        }
        if (!j() || !a(drawable)) {
            v0 v0Var = this.c;
            if (v0Var != null) {
                j.i(drawable, v0Var, this.a.getDrawableState());
                return;
            }
            v0 v0Var2 = this.b;
            if (v0Var2 != null) {
                j.i(drawable, v0Var2, this.a.getDrawableState());
            }
        }
    }

    public ColorStateList c() {
        v0 v0Var = this.c;
        if (v0Var != null) {
            return v0Var.a;
        }
        return null;
    }

    public PorterDuff.Mode d() {
        v0 v0Var = this.c;
        if (v0Var != null) {
            return v0Var.b;
        }
        return null;
    }

    public boolean e() {
        return Build.VERSION.SDK_INT < 21 || !(this.a.getBackground() instanceof RippleDrawable);
    }

    public void f(AttributeSet attributeSet, int i) {
        int n;
        x0 u = x0.u(this.a.getContext(), attributeSet, m.AppCompatImageView, i, 0);
        try {
            Drawable drawable = this.a.getDrawable();
            if (!(drawable != null || (n = u.n(m.AppCompatImageView_srcCompat, -1)) == -1 || (drawable = defpackage.n.d(this.a.getContext(), n)) == null)) {
                this.a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                e0.b(drawable);
            }
            if (u.r(m.AppCompatImageView_tint)) {
                e.c(this.a, u.c(m.AppCompatImageView_tint));
            }
            if (u.r(m.AppCompatImageView_tintMode)) {
                e.d(this.a, e0.e(u.k(m.AppCompatImageView_tintMode, -1), null));
            }
        } finally {
            u.v();
        }
    }

    public void g(int i) {
        if (i != 0) {
            Drawable d2 = defpackage.n.d(this.a.getContext(), i);
            if (d2 != null) {
                e0.b(d2);
            }
            this.a.setImageDrawable(d2);
        } else {
            this.a.setImageDrawable(null);
        }
        b();
    }

    public void h(ColorStateList colorStateList) {
        if (this.c == null) {
            this.c = new v0();
        }
        v0 v0Var = this.c;
        v0Var.a = colorStateList;
        v0Var.d = true;
        b();
    }

    public void i(PorterDuff.Mode mode) {
        if (this.c == null) {
            this.c = new v0();
        }
        v0 v0Var = this.c;
        v0Var.b = mode;
        v0Var.c = true;
        b();
    }
}
