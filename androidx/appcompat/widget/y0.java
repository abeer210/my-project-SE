package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.Toolbar;
import vigqyno.C0201;

/* compiled from: ToolbarWidgetWrapper */
public class y0 implements d0 {
    public Toolbar a;
    private int b;
    private View c;
    private View d;
    private Drawable e;
    private Drawable f;
    private Drawable g;
    private boolean h;
    public CharSequence i;
    private CharSequence j;
    private CharSequence k;
    public Window.Callback l;
    public boolean m;
    private c n;
    private int o;
    private int p;
    private Drawable q;

    /* compiled from: ToolbarWidgetWrapper */
    class a implements View.OnClickListener {
        public final androidx.appcompat.view.menu.a a = new androidx.appcompat.view.menu.a(y0.this.a.getContext(), 0, 16908332, 0, 0, y0.this.i);

        public a() {
        }

        public void onClick(View view) {
            w30.g(view);
            try {
                if (y0.this.l != null && y0.this.m) {
                    y0.this.l.onMenuItemSelected(0, this.a);
                }
            } finally {
                w30.h();
            }
        }
    }

    /* compiled from: ToolbarWidgetWrapper */
    class b extends r3 {
        private boolean a = false;
        public final /* synthetic */ int b;

        public b(int i) {
            this.b = i;
        }

        @Override // defpackage.r3, defpackage.q3
        public void a(View view) {
            this.a = true;
        }

        @Override // defpackage.q3
        public void b(View view) {
            if (!this.a) {
                y0.this.a.setVisibility(this.b);
            }
        }

        @Override // defpackage.r3, defpackage.q3
        public void c(View view) {
            y0.this.a.setVisibility(0);
        }
    }

    public y0(Toolbar toolbar, boolean z) {
        this(toolbar, z, k.abc_action_bar_up_description, h.abc_ic_ab_back_material);
    }

    private void F(CharSequence charSequence) {
        this.i = charSequence;
        if ((this.b & 8) != 0) {
            this.a.setTitle(charSequence);
        }
    }

    private void G() {
        if ((this.b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.k)) {
            this.a.setNavigationContentDescription(this.p);
        } else {
            this.a.setNavigationContentDescription(this.k);
        }
    }

    private void H() {
        if ((this.b & 4) != 0) {
            Toolbar toolbar = this.a;
            Drawable drawable = this.g;
            if (drawable == null) {
                drawable = this.q;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.a.setNavigationIcon((Drawable) null);
    }

    private void I() {
        Drawable drawable;
        int i2 = this.b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) != 0) {
            drawable = this.f;
            if (drawable == null) {
                drawable = this.e;
            }
        } else {
            drawable = this.e;
        }
        this.a.setLogo(drawable);
    }

    private int w() {
        if (this.a.getNavigationIcon() == null) {
            return 11;
        }
        this.q = this.a.getNavigationIcon();
        return 15;
    }

    public void A(int i2) {
        B(i2 == 0 ? null : getContext().getString(i2));
    }

    public void B(CharSequence charSequence) {
        this.k = charSequence;
        G();
    }

    public void C(Drawable drawable) {
        this.g = drawable;
        H();
    }

    public void D(CharSequence charSequence) {
        this.j = charSequence;
        if ((this.b & 8) != 0) {
            this.a.setSubtitle(charSequence);
        }
    }

    public void E(CharSequence charSequence) {
        this.h = true;
        F(charSequence);
    }

    @Override // androidx.appcompat.widget.d0
    public void a(Menu menu, m.a aVar) {
        if (this.n == null) {
            c cVar = new c(this.a.getContext());
            this.n = cVar;
            cVar.p(i.action_menu_presenter);
        }
        this.n.h(aVar);
        this.a.I((g) menu, this.n);
    }

    @Override // androidx.appcompat.widget.d0
    public boolean b() {
        return this.a.A();
    }

    @Override // androidx.appcompat.widget.d0
    public void c() {
        this.m = true;
    }

    @Override // androidx.appcompat.widget.d0
    public void collapseActionView() {
        this.a.e();
    }

    @Override // androidx.appcompat.widget.d0
    public boolean d() {
        return this.a.d();
    }

    @Override // androidx.appcompat.widget.d0
    public boolean e() {
        return this.a.z();
    }

    @Override // androidx.appcompat.widget.d0
    public boolean f() {
        return this.a.w();
    }

    @Override // androidx.appcompat.widget.d0
    public boolean g() {
        return this.a.O();
    }

    @Override // androidx.appcompat.widget.d0
    public Context getContext() {
        return this.a.getContext();
    }

    @Override // androidx.appcompat.widget.d0
    public CharSequence getTitle() {
        return this.a.getTitle();
    }

    @Override // androidx.appcompat.widget.d0
    public void h() {
        this.a.f();
    }

    @Override // androidx.appcompat.widget.d0
    public void i(p0 p0Var) {
        Toolbar toolbar;
        View view = this.c;
        if (view != null && view.getParent() == (toolbar = this.a)) {
            toolbar.removeView(this.c);
        }
        this.c = p0Var;
        if (p0Var != null && this.o == 2) {
            this.a.addView(p0Var, 0);
            Toolbar.e eVar = (Toolbar.e) this.c.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) eVar).width = -2;
            ((ViewGroup.MarginLayoutParams) eVar).height = -2;
            eVar.a = 8388691;
            p0Var.setAllowCollapse(true);
        }
    }

    @Override // androidx.appcompat.widget.d0
    public boolean j() {
        return this.a.v();
    }

    @Override // androidx.appcompat.widget.d0
    public void k(int i2) {
        View view;
        int i3 = this.b ^ i2;
        this.b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    G();
                }
                H();
            }
            if ((i3 & 3) != 0) {
                I();
            }
            if ((i3 & 8) != 0) {
                if ((i2 & 8) != 0) {
                    this.a.setTitle(this.i);
                    this.a.setSubtitle(this.j);
                } else {
                    this.a.setTitle((CharSequence) null);
                    this.a.setSubtitle((CharSequence) null);
                }
            }
            if ((i3 & 16) != 0 && (view = this.d) != null) {
                if ((i2 & 16) != 0) {
                    this.a.addView(view);
                } else {
                    this.a.removeView(view);
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.d0
    public Menu l() {
        return this.a.getMenu();
    }

    @Override // androidx.appcompat.widget.d0
    public void m(int i2) {
        z(i2 != 0 ? n.d(getContext(), i2) : null);
    }

    @Override // androidx.appcompat.widget.d0
    public int n() {
        return this.o;
    }

    @Override // androidx.appcompat.widget.d0
    public p3 o(int i2, long j2) {
        p3 c2 = k3.c(this.a);
        c2.a(i2 == 0 ? 1.0f : 0.0f);
        c2.d(j2);
        c2.f(new b(i2));
        return c2;
    }

    @Override // androidx.appcompat.widget.d0
    public void p(m.a aVar, g.a aVar2) {
        this.a.J(aVar, aVar2);
    }

    @Override // androidx.appcompat.widget.d0
    public ViewGroup q() {
        return this.a;
    }

    @Override // androidx.appcompat.widget.d0
    public void r(boolean z) {
    }

    @Override // androidx.appcompat.widget.d0
    public int s() {
        return this.b;
    }

    @Override // androidx.appcompat.widget.d0
    public void setIcon(int i2) {
        setIcon(i2 != 0 ? n.d(getContext(), i2) : null);
    }

    @Override // androidx.appcompat.widget.d0
    public void setVisibility(int i2) {
        this.a.setVisibility(i2);
    }

    @Override // androidx.appcompat.widget.d0
    public void setWindowCallback(Window.Callback callback) {
        this.l = callback;
    }

    @Override // androidx.appcompat.widget.d0
    public void setWindowTitle(CharSequence charSequence) {
        if (!this.h) {
            F(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.d0
    public void t() {
        Log.i(C0201.m82(12958), C0201.m82(12959));
    }

    @Override // androidx.appcompat.widget.d0
    public void u() {
        Log.i(C0201.m82(12960), C0201.m82(12961));
    }

    @Override // androidx.appcompat.widget.d0
    public void v(boolean z) {
        this.a.setCollapsible(z);
    }

    public void x(View view) {
        View view2 = this.d;
        if (!(view2 == null || (this.b & 16) == 0)) {
            this.a.removeView(view2);
        }
        this.d = view;
        if (view != null && (this.b & 16) != 0) {
            this.a.addView(view);
        }
    }

    public void y(int i2) {
        if (i2 != this.p) {
            this.p = i2;
            if (TextUtils.isEmpty(this.a.getNavigationContentDescription())) {
                A(this.p);
            }
        }
    }

    public void z(Drawable drawable) {
        this.f = drawable;
        I();
    }

    public y0(Toolbar toolbar, boolean z, int i2, int i3) {
        Drawable drawable;
        this.o = 0;
        this.p = 0;
        this.a = toolbar;
        this.i = toolbar.getTitle();
        this.j = toolbar.getSubtitle();
        this.h = this.i != null;
        this.g = toolbar.getNavigationIcon();
        x0 u = x0.u(toolbar.getContext(), null, m.ActionBar, d.actionBarStyle, 0);
        this.q = u.g(m.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence p2 = u.p(m.ActionBar_title);
            if (!TextUtils.isEmpty(p2)) {
                E(p2);
            }
            CharSequence p3 = u.p(m.ActionBar_subtitle);
            if (!TextUtils.isEmpty(p3)) {
                D(p3);
            }
            Drawable g2 = u.g(m.ActionBar_logo);
            if (g2 != null) {
                z(g2);
            }
            Drawable g3 = u.g(m.ActionBar_icon);
            if (g3 != null) {
                setIcon(g3);
            }
            if (this.g == null && (drawable = this.q) != null) {
                C(drawable);
            }
            k(u.k(m.ActionBar_displayOptions, 0));
            int n2 = u.n(m.ActionBar_customNavigationLayout, 0);
            if (n2 != 0) {
                x(LayoutInflater.from(this.a.getContext()).inflate(n2, (ViewGroup) this.a, false));
                k(this.b | 16);
            }
            int m2 = u.m(m.ActionBar_height, 0);
            if (m2 > 0) {
                ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
                layoutParams.height = m2;
                this.a.setLayoutParams(layoutParams);
            }
            int e2 = u.e(m.ActionBar_contentInsetStart, -1);
            int e3 = u.e(m.ActionBar_contentInsetEnd, -1);
            if (e2 >= 0 || e3 >= 0) {
                this.a.H(Math.max(e2, 0), Math.max(e3, 0));
            }
            int n3 = u.n(m.ActionBar_titleTextStyle, 0);
            if (n3 != 0) {
                Toolbar toolbar2 = this.a;
                toolbar2.L(toolbar2.getContext(), n3);
            }
            int n4 = u.n(m.ActionBar_subtitleTextStyle, 0);
            if (n4 != 0) {
                Toolbar toolbar3 = this.a;
                toolbar3.K(toolbar3.getContext(), n4);
            }
            int n5 = u.n(m.ActionBar_popupTheme, 0);
            if (n5 != 0) {
                this.a.setPopupTheme(n5);
            }
        } else {
            this.b = w();
        }
        u.v();
        y(i2);
        this.k = this.a.getNavigationContentDescription();
        this.a.setNavigationOnClickListener(new a());
    }

    @Override // androidx.appcompat.widget.d0
    public void setIcon(Drawable drawable) {
        this.e = drawable;
        I();
    }
}
