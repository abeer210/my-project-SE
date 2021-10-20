package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.p0;
import defpackage.w;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import vigqyno.C0201;

/* compiled from: WindowDecorActionBar */
public class l extends a implements ActionBarOverlayLayout.d {
    private static final Interpolator D = new AccelerateInterpolator();
    private static final Interpolator E = new DecelerateInterpolator();
    public final q3 A = new a();
    public final q3 B = new b();
    public final s3 C = new c();
    public Context a;
    private Context b;
    private Activity c;
    private Dialog d;
    public ActionBarOverlayLayout e;
    public ActionBarContainer f;
    public d0 g;
    public ActionBarContextView h;
    public View i;
    public p0 j;
    private boolean k;
    public d l;
    public w m;
    public w.a n;
    private boolean o;
    private ArrayList<a.b> p = new ArrayList<>();
    private boolean q;
    private int r = 0;
    public boolean s = true;
    public boolean t;
    public boolean u;
    private boolean v;
    private boolean w = true;
    public c0 x;
    private boolean y;
    public boolean z;

    /* compiled from: WindowDecorActionBar */
    class a extends r3 {
        public a() {
        }

        @Override // defpackage.q3
        public void b(View view) {
            View view2;
            l lVar = l.this;
            if (lVar.s && (view2 = lVar.i) != null) {
                view2.setTranslationY(0.0f);
                l.this.f.setTranslationY(0.0f);
            }
            l.this.f.setVisibility(8);
            l.this.f.setTransitioning(false);
            l lVar2 = l.this;
            lVar2.x = null;
            lVar2.y();
            ActionBarOverlayLayout actionBarOverlayLayout = l.this.e;
            if (actionBarOverlayLayout != null) {
                k3.f0(actionBarOverlayLayout);
            }
        }
    }

    /* compiled from: WindowDecorActionBar */
    class b extends r3 {
        public b() {
        }

        @Override // defpackage.q3
        public void b(View view) {
            l lVar = l.this;
            lVar.x = null;
            lVar.f.requestLayout();
        }
    }

    /* compiled from: WindowDecorActionBar */
    class c implements s3 {
        public c() {
        }

        @Override // defpackage.s3
        public void a(View view) {
            ((View) l.this.f.getParent()).invalidate();
        }
    }

    /* compiled from: WindowDecorActionBar */
    public class d extends w implements g.a {
        private final Context c;
        private final g d;
        private w.a e;
        private WeakReference<View> f;

        public d(Context context, w.a aVar) {
            this.c = context;
            this.e = aVar;
            g gVar = new g(context);
            gVar.S(1);
            this.d = gVar;
            gVar.R(this);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(g gVar, MenuItem menuItem) {
            w.a aVar = this.e;
            if (aVar != null) {
                return aVar.d(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(g gVar) {
            if (this.e != null) {
                k();
                l.this.h.l();
            }
        }

        @Override // defpackage.w
        public void c() {
            l lVar = l.this;
            if (lVar.l == this) {
                if (!l.x(lVar.t, lVar.u, false)) {
                    l lVar2 = l.this;
                    lVar2.m = this;
                    lVar2.n = this.e;
                } else {
                    this.e.a(this);
                }
                this.e = null;
                l.this.w(false);
                l.this.h.g();
                l.this.g.q().sendAccessibilityEvent(32);
                l lVar3 = l.this;
                lVar3.e.setHideOnContentScrollEnabled(lVar3.z);
                l.this.l = null;
            }
        }

        @Override // defpackage.w
        public View d() {
            WeakReference<View> weakReference = this.f;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // defpackage.w
        public Menu e() {
            return this.d;
        }

        @Override // defpackage.w
        public MenuInflater f() {
            return new b0(this.c);
        }

        @Override // defpackage.w
        public CharSequence g() {
            return l.this.h.getSubtitle();
        }

        @Override // defpackage.w
        public CharSequence i() {
            return l.this.h.getTitle();
        }

        @Override // defpackage.w
        public void k() {
            if (l.this.l == this) {
                this.d.d0();
                try {
                    this.e.c(this, this.d);
                } finally {
                    this.d.c0();
                }
            }
        }

        @Override // defpackage.w
        public boolean l() {
            return l.this.h.j();
        }

        @Override // defpackage.w
        public void m(View view) {
            l.this.h.setCustomView(view);
            this.f = new WeakReference<>(view);
        }

        @Override // defpackage.w
        public void n(int i) {
            o(l.this.a.getResources().getString(i));
        }

        @Override // defpackage.w
        public void o(CharSequence charSequence) {
            l.this.h.setSubtitle(charSequence);
        }

        @Override // defpackage.w
        public void q(int i) {
            r(l.this.a.getResources().getString(i));
        }

        @Override // defpackage.w
        public void r(CharSequence charSequence) {
            l.this.h.setTitle(charSequence);
        }

        @Override // defpackage.w
        public void s(boolean z) {
            super.s(z);
            l.this.h.setTitleOptional(z);
        }

        public boolean t() {
            this.d.d0();
            try {
                return this.e.b(this, this.d);
            } finally {
                this.d.c0();
            }
        }
    }

    public l(Activity activity, boolean z2) {
        new ArrayList();
        this.c = activity;
        View decorView = activity.getWindow().getDecorView();
        E(decorView);
        if (!z2) {
            this.i = decorView.findViewById(16908290);
        }
    }

    private d0 B(View view) {
        if (view instanceof d0) {
            return (d0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C0201.m82(4027));
        sb.append(view != null ? view.getClass().getSimpleName() : C0201.m82(4028));
        throw new IllegalStateException(sb.toString());
    }

    private void D() {
        if (this.v) {
            this.v = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.e;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            N(false);
        }
    }

    private void E(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(i.decor_content_parent);
        this.e = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.g = B(view.findViewById(i.action_bar));
        this.h = (ActionBarContextView) view.findViewById(i.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(i.action_bar_container);
        this.f = actionBarContainer;
        d0 d0Var = this.g;
        if (d0Var == null || this.h == null || actionBarContainer == null) {
            throw new IllegalStateException(l.class.getSimpleName() + C0201.m82(4029));
        }
        this.a = d0Var.getContext();
        boolean z2 = (this.g.s() & 4) != 0;
        if (z2) {
            this.k = true;
        }
        v b2 = v.b(this.a);
        K(b2.a() || z2);
        I(b2.g());
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, m.ActionBar, defpackage.d.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(m.ActionBar_hideOnContentScroll, false)) {
            J(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(m.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            H((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    private void I(boolean z2) {
        this.q = z2;
        if (!z2) {
            this.g.i(null);
            this.f.setTabContainer(this.j);
        } else {
            this.f.setTabContainer(null);
            this.g.i(this.j);
        }
        boolean z3 = true;
        boolean z4 = C() == 2;
        p0 p0Var = this.j;
        if (p0Var != null) {
            if (z4) {
                p0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.e;
                if (actionBarOverlayLayout != null) {
                    k3.f0(actionBarOverlayLayout);
                }
            } else {
                p0Var.setVisibility(8);
            }
        }
        this.g.v(!this.q && z4);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.e;
        if (this.q || !z4) {
            z3 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z3);
    }

    private boolean L() {
        return k3.O(this.f);
    }

    private void M() {
        if (!this.v) {
            this.v = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.e;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            N(false);
        }
    }

    private void N(boolean z2) {
        if (x(this.t, this.u, this.v)) {
            if (!this.w) {
                this.w = true;
                A(z2);
            }
        } else if (this.w) {
            this.w = false;
            z(z2);
        }
    }

    public static boolean x(boolean z2, boolean z3, boolean z4) {
        if (z4) {
            return true;
        }
        return !z2 && !z3;
    }

    public void A(boolean z2) {
        View view;
        View view2;
        c0 c0Var = this.x;
        if (c0Var != null) {
            c0Var.a();
        }
        this.f.setVisibility(0);
        if (this.r != 0 || (!this.y && !z2)) {
            this.f.setAlpha(1.0f);
            this.f.setTranslationY(0.0f);
            if (this.s && (view = this.i) != null) {
                view.setTranslationY(0.0f);
            }
            this.B.b(null);
        } else {
            this.f.setTranslationY(0.0f);
            float f2 = (float) (-this.f.getHeight());
            if (z2) {
                int[] iArr = {0, 0};
                this.f.getLocationInWindow(iArr);
                f2 -= (float) iArr[1];
            }
            this.f.setTranslationY(f2);
            c0 c0Var2 = new c0();
            p3 c2 = k3.c(this.f);
            c2.k(0.0f);
            c2.i(this.C);
            c0Var2.c(c2);
            if (this.s && (view2 = this.i) != null) {
                view2.setTranslationY(f2);
                p3 c3 = k3.c(this.i);
                c3.k(0.0f);
                c0Var2.c(c3);
            }
            c0Var2.f(E);
            c0Var2.e(250);
            c0Var2.g(this.B);
            this.x = c0Var2;
            c0Var2.h();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.e;
        if (actionBarOverlayLayout != null) {
            k3.f0(actionBarOverlayLayout);
        }
    }

    public int C() {
        return this.g.n();
    }

    public void F(boolean z2) {
        G(z2 ? 4 : 0, 4);
    }

    public void G(int i2, int i3) {
        int s2 = this.g.s();
        if ((i3 & 4) != 0) {
            this.k = true;
        }
        this.g.k((i2 & i3) | ((i3 ^ -1) & s2));
    }

    public void H(float f2) {
        k3.o0(this.f, f2);
    }

    public void J(boolean z2) {
        if (!z2 || this.e.w()) {
            this.z = z2;
            this.e.setHideOnContentScrollEnabled(z2);
            return;
        }
        throw new IllegalStateException(C0201.m82(4030));
    }

    public void K(boolean z2) {
        this.g.r(z2);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.u) {
            this.u = false;
            N(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c(boolean z2) {
        this.s = z2;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
        if (!this.u) {
            this.u = true;
            N(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        c0 c0Var = this.x;
        if (c0Var != null) {
            c0Var.a();
            this.x = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void f(int i2) {
        this.r = i2;
    }

    @Override // androidx.appcompat.app.a
    public boolean h() {
        d0 d0Var = this.g;
        if (d0Var == null || !d0Var.j()) {
            return false;
        }
        this.g.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void i(boolean z2) {
        if (z2 != this.o) {
            this.o = z2;
            int size = this.p.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.p.get(i2).a(z2);
            }
        }
    }

    @Override // androidx.appcompat.app.a
    public int j() {
        return this.g.s();
    }

    @Override // androidx.appcompat.app.a
    public Context k() {
        if (this.b == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(defpackage.d.actionBarWidgetTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.b = new ContextThemeWrapper(this.a, i2);
            } else {
                this.b = this.a;
            }
        }
        return this.b;
    }

    @Override // androidx.appcompat.app.a
    public void m(Configuration configuration) {
        I(v.b(this.a).g());
    }

    @Override // androidx.appcompat.app.a
    public boolean o(int i2, KeyEvent keyEvent) {
        Menu e2;
        d dVar = this.l;
        if (dVar == null || (e2 = dVar.e()) == null) {
            return false;
        }
        boolean z2 = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z2 = false;
        }
        e2.setQwertyMode(z2);
        return e2.performShortcut(i2, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public void r(boolean z2) {
        if (!this.k) {
            F(z2);
        }
    }

    @Override // androidx.appcompat.app.a
    public void s(boolean z2) {
        G(z2 ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.a
    public void t(boolean z2) {
        c0 c0Var;
        this.y = z2;
        if (!z2 && (c0Var = this.x) != null) {
            c0Var.a();
        }
    }

    @Override // androidx.appcompat.app.a
    public void u(CharSequence charSequence) {
        this.g.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public w v(w.a aVar) {
        d dVar = this.l;
        if (dVar != null) {
            dVar.c();
        }
        this.e.setHideOnContentScrollEnabled(false);
        this.h.k();
        d dVar2 = new d(this.h.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.l = dVar2;
        dVar2.k();
        this.h.h(dVar2);
        w(true);
        this.h.sendAccessibilityEvent(32);
        return dVar2;
    }

    public void w(boolean z2) {
        p3 p3Var;
        p3 p3Var2;
        if (z2) {
            M();
        } else {
            D();
        }
        if (L()) {
            if (z2) {
                p3Var = this.g.o(4, 100);
                p3Var2 = this.h.f(0, 200);
            } else {
                p3Var2 = this.g.o(0, 200);
                p3Var = this.h.f(8, 100);
            }
            c0 c0Var = new c0();
            c0Var.d(p3Var, p3Var2);
            c0Var.h();
        } else if (z2) {
            this.g.setVisibility(4);
            this.h.setVisibility(0);
        } else {
            this.g.setVisibility(0);
            this.h.setVisibility(8);
        }
    }

    public void y() {
        w.a aVar = this.n;
        if (aVar != null) {
            aVar.a(this.m);
            this.m = null;
            this.n = null;
        }
    }

    public void z(boolean z2) {
        View view;
        c0 c0Var = this.x;
        if (c0Var != null) {
            c0Var.a();
        }
        if (this.r != 0 || (!this.y && !z2)) {
            this.A.b(null);
            return;
        }
        this.f.setAlpha(1.0f);
        this.f.setTransitioning(true);
        c0 c0Var2 = new c0();
        float f2 = (float) (-this.f.getHeight());
        if (z2) {
            int[] iArr = {0, 0};
            this.f.getLocationInWindow(iArr);
            f2 -= (float) iArr[1];
        }
        p3 c2 = k3.c(this.f);
        c2.k(f2);
        c2.i(this.C);
        c0Var2.c(c2);
        if (this.s && (view = this.i) != null) {
            p3 c3 = k3.c(view);
            c3.k(f2);
            c0Var2.c(c3);
        }
        c0Var2.f(D);
        c0Var2.e(250);
        c0Var2.g(this.A);
        this.x = c0Var2;
        c0Var2.h();
    }

    public l(Dialog dialog) {
        new ArrayList();
        this.d = dialog;
        E(dialog.getWindow().getDecorView());
    }
}
