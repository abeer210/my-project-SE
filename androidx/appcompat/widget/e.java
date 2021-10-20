package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: AppCompatBackgroundHelper */
public class e {
    private final View a;
    private final j b;
    private int c = -1;
    private v0 d;
    private v0 e;
    private v0 f;

    public e(View view) {
        this.a = view;
        this.b = j.b();
    }

    private boolean a(Drawable drawable) {
        if (this.f == null) {
            this.f = new v0();
        }
        v0 v0Var = this.f;
        v0Var.a();
        ColorStateList n = k3.n(this.a);
        if (n != null) {
            v0Var.d = true;
            v0Var.a = n;
        }
        PorterDuff.Mode o = k3.o(this.a);
        if (o != null) {
            v0Var.c = true;
            v0Var.b = o;
        }
        if (!v0Var.d && !v0Var.c) {
            return false;
        }
        j.i(drawable, v0Var, this.a.getDrawableState());
        return true;
    }

    private boolean k() {
        int i = Build.VERSION.SDK_INT;
        if (i <= 21) {
            return i == 21;
        }
        if (this.d != null) {
            return true;
        }
        return false;
    }

    public void b() {
        Drawable background = this.a.getBackground();
        if (background == null) {
            return;
        }
        if (!k() || !a(background)) {
            v0 v0Var = this.e;
            if (v0Var != null) {
                j.i(background, v0Var, this.a.getDrawableState());
                return;
            }
            v0 v0Var2 = this.d;
            if (v0Var2 != null) {
                j.i(background, v0Var2, this.a.getDrawableState());
            }
        }
    }

    public ColorStateList c() {
        v0 v0Var = this.e;
        if (v0Var != null) {
            return v0Var.a;
        }
        return null;
    }

    public PorterDuff.Mode d() {
        v0 v0Var = this.e;
        if (v0Var != null) {
            return v0Var.b;
        }
        return null;
    }

    public void e(AttributeSet attributeSet, int i) {
        x0 u = x0.u(this.a.getContext(), attributeSet, m.ViewBackgroundHelper, i, 0);
        try {
            if (u.r(m.ViewBackgroundHelper_android_background)) {
                this.c = u.n(m.ViewBackgroundHelper_android_background, -1);
                ColorStateList f2 = this.b.f(this.a.getContext(), this.c);
                if (f2 != null) {
                    h(f2);
                }
            }
            if (u.r(m.ViewBackgroundHelper_backgroundTint)) {
                k3.l0(this.a, u.c(m.ViewBackgroundHelper_backgroundTint));
            }
            if (u.r(m.ViewBackgroundHelper_backgroundTintMode)) {
                k3.m0(this.a, e0.e(u.k(m.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
        } finally {
            u.v();
        }
    }

    public void f(Drawable drawable) {
        this.c = -1;
        h(null);
        b();
    }

    public void g(int i) {
        this.c = i;
        j jVar = this.b;
        h(jVar != null ? jVar.f(this.a.getContext(), i) : null);
        b();
    }

    public void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new v0();
            }
            v0 v0Var = this.d;
            v0Var.a = colorStateList;
            v0Var.d = true;
        } else {
            this.d = null;
        }
        b();
    }

    public void i(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new v0();
        }
        v0 v0Var = this.e;
        v0Var.a = colorStateList;
        v0Var.d = true;
        b();
    }

    public void j(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new v0();
        }
        v0 v0Var = this.e;
        v0Var.b = mode;
        v0Var.c = true;
        b();
    }
}
