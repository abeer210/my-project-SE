package defpackage;

import android.view.ViewGroup;
import com.reactnativenavigation.views.topbar.a;
import defpackage.fe2;

/* renamed from: de2  reason: default package */
/* compiled from: TopBarCollapseBehavior */
public class de2 implements fe2.b, fe2.a {
    private a a;
    private fe2 b;
    private ce2 c;

    public de2(a aVar) {
        this.a = aVar;
        this.c = new ce2(aVar);
    }

    @Override // defpackage.fe2.b
    public void a(float f) {
        float f2 = (float) (-this.a.getMeasuredHeight());
        if (f < f2 && this.a.getVisibility() == 0) {
            this.a.setVisibility(8);
            this.a.setTranslationY(f2);
        } else if (f > f2 && f <= 0.0f) {
            this.a.setTranslationY(f);
        }
    }

    @Override // defpackage.fe2.a
    public void b() {
        this.c.e(this.a.getTranslationY(), (float) ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).topMargin);
    }

    @Override // defpackage.fe2.a
    public void c() {
        this.c.k(this.a.getTranslationY());
    }

    @Override // defpackage.fe2.b
    public void d(float f) {
        int measuredHeight = this.a.getMeasuredHeight();
        if (this.a.getVisibility() == 8 && f > ((float) (-measuredHeight))) {
            this.a.setVisibility(0);
            this.a.setTranslationY(f);
        } else if (f <= 0.0f && f >= ((float) (-measuredHeight))) {
            this.a.setTranslationY(f);
        }
    }

    public void e() {
        fe2 fe2 = this.b;
        if (fe2 != null) {
            fe2.h();
            this.a.setVisibility(0);
            this.a.setTranslationY(0.0f);
        }
    }

    public void f(fe2 fe2) {
        this.b = fe2;
        fe2.g(this.a, this, this);
    }
}
