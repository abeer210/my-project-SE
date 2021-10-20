package defpackage;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import defpackage.if2;

/* renamed from: ii2  reason: default package */
/* compiled from: Presenter */
public class ii2 {
    private Activity a;
    private bf2 b;

    public ii2(Activity activity, bf2 bf2) {
        this.a = activity;
        this.b = bf2;
    }

    private void a(nl2 nl2, bf2 bf2) {
        if (bf2.m.a.f() && !(nl2 instanceof an2)) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new ColorDrawable(((Integer) bf2.m.a.d()).intValue())});
            layerDrawable.setLayerInset(0, 0, ((nl2 instanceof jl2) || ((ViewGroup.MarginLayoutParams) nl2.B().getLayoutParams()).topMargin == 0) ? nl2.Y().l.d.i() ? 0 : sj2.a(nl2.u()) : 0, 0, 0);
            nl2.B().setBackground(layerDrawable);
        }
    }

    private void b(ze2 ze2) {
        c(ze2);
        u(ze2);
    }

    private void c(ze2 ze2) {
        View decorView = this.a.getWindow().getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(((Boolean) ze2.b.e(Boolean.valueOf((systemUiVisibility & 512) == 0))).booleanValue() ? systemUiVisibility & -4099 : systemUiVisibility | 4098);
    }

    private void e(cf2 cf2) {
        this.a.setRequestedOrientation(cf2.b());
    }

    private void f(bf2 bf2) {
        bf2 i = bf2.i();
        i.m(this.b);
        if2 if2 = i.l;
        w(if2);
        y(if2.b);
        z(if2);
        x(if2.c);
    }

    private void g(View view, bf2 bf2) {
        if ((view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && bf2.m.c.f()) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = ((Integer) bf2.m.c.e(0)).intValue();
        }
    }

    private void h(nl2 nl2, bf2 bf2) {
        a(nl2, bf2);
        g(nl2.B(), bf2);
    }

    private void i(View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setSystemUiVisibility(view.getSystemUiVisibility() & -8193);
        }
    }

    private boolean j(int i) {
        double red = (double) Color.red(i);
        Double.isNaN(red);
        double green = (double) Color.green(i);
        Double.isNaN(green);
        double d = (red * 0.299d) + (green * 0.587d);
        double blue = (double) Color.blue(i);
        Double.isNaN(blue);
        return 1.0d - ((d + (blue * 0.114d)) / 255.0d) < 0.5d;
    }

    private void k(ze2 ze2) {
        l(ze2);
        u(ze2);
    }

    private void l(ze2 ze2) {
        if (ze2.b.f()) {
            b(ze2);
        }
    }

    private void n(if2 if2) {
        if (if2.a.f() && Build.VERSION.SDK_INT >= 21) {
            this.a.getWindow().setStatusBarColor(((Integer) if2.a.e(-16777216)).intValue());
        }
    }

    private void o(View view, if2 if2) {
        n(if2);
        q(if2.b);
        r(if2);
        p(view, if2.c, if2.d);
    }

    private void p(View view, sf2 sf2, sf2 sf22) {
        if (sf2.f()) {
            int systemUiVisibility = view.getSystemUiVisibility();
            int i = sf2.i() ? systemUiVisibility & -1029 : systemUiVisibility | 1028;
            if (i != view.getSystemUiVisibility()) {
                view.requestLayout();
            }
            view.setSystemUiVisibility(i);
        } else if (!sf22.f()) {
        } else {
            if (sf22.i()) {
                view.setSystemUiVisibility(1024);
            } else {
                view.setSystemUiVisibility(-1025);
            }
        }
    }

    private void q(if2.a aVar) {
        if (aVar.d() && Build.VERSION.SDK_INT >= 23) {
            View decorView = this.a.getWindow().getDecorView();
            if (aVar == if2.a.Dark) {
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            } else {
                i(decorView);
            }
        }
    }

    private void r(if2 if2) {
        Window window = this.a.getWindow();
        if (if2.e.i()) {
            window.setFlags(67108864, 67108864);
        } else if (if2.e.g() && sj2.b(window)) {
            window.clearFlags(67108864);
        }
    }

    private void u(ze2 ze2) {
        if (Build.VERSION.SDK_INT >= 21 && ze2.a.a()) {
            int intValue = ((Integer) ze2.a.e(Integer.valueOf(this.a.getWindow().getNavigationBarColor()))).intValue();
            this.a.getWindow().setNavigationBarColor(intValue);
            v(intValue);
        }
    }

    private void v(int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            View decorView = this.a.getWindow().getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(j(i) ? systemUiVisibility | 16 : systemUiVisibility & -17);
        }
    }

    private void w(if2 if2) {
        if (Build.VERSION.SDK_INT >= 21 && if2.a.a()) {
            this.a.getWindow().setStatusBarColor(((Integer) if2.a.e(Integer.valueOf(if2.c.j() ? -16777216 : 0))).intValue());
        }
    }

    private void x(sf2 sf2) {
        View decorView = this.a.getWindow().getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(sf2.g() ? systemUiVisibility | 4 : systemUiVisibility & -5);
    }

    private void y(if2.a aVar) {
        View decorView = this.a.getWindow().getDecorView();
        if (Build.VERSION.SDK_INT >= 23) {
            if (aVar == if2.a.Dark) {
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            } else {
                i(decorView);
            }
        }
    }

    private void z(if2 if2) {
        Window window = this.a.getWindow();
        if (if2.e.i()) {
            window.setFlags(67108864, 67108864);
        } else if (sj2.b(window)) {
            window.clearFlags(67108864);
        }
    }

    public void d(nl2 nl2, bf2 bf2) {
        bf2 i = bf2.i();
        i.m(this.b);
        e(i.m.d);
        h(nl2, i);
        f(i);
        b(i.k);
    }

    public void m(View view, bf2 bf2) {
        o(view, bf2.l);
        k(bf2.k);
    }

    public void s(bf2 bf2) {
        bf2 i = bf2.i();
        i.m(this.b);
        f(i);
    }

    public void t(bf2 bf2) {
        this.b = bf2;
    }
}
