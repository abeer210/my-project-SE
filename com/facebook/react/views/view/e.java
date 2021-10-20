package com.facebook.react.views.view;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;

/* compiled from: ReactViewBackgroundManager */
public class e {
    private d a;
    private View b;

    public e(View view) {
        this.b = view;
    }

    private d a() {
        if (this.a == null) {
            this.a = new d(this.b.getContext());
            Drawable background = this.b.getBackground();
            k3.k0(this.b, null);
            if (background == null) {
                k3.k0(this.b, this.a);
            } else {
                k3.k0(this.b, new LayerDrawable(new Drawable[]{this.a, background}));
            }
        }
        return this.a;
    }

    public void b(int i) {
        if (i != 0 || this.a != null) {
            a().x(i);
        }
    }

    public void c(int i, float f, float f2) {
        a().t(i, f, f2);
    }

    public void d(float f) {
        a().y(f);
    }

    public void e(float f, int i) {
        a().z(f, i);
    }

    public void f(String str) {
        a().v(str);
    }

    public void g(int i, float f) {
        a().w(i, f);
    }
}
