package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.l0;
import vigqyno.C0201;

/* compiled from: StandardMenuPopup */
public final class q extends k implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, m, View.OnKeyListener {
    private static final int y = j.abc_popup_menu_item_layout;
    private final Context b;
    private final g c;
    private final f d;
    private final boolean e;
    private final int f;
    private final int g;
    private final int h;
    public final l0 i;
    public final ViewTreeObserver.OnGlobalLayoutListener j = new a();
    private final View.OnAttachStateChangeListener k = new b();
    private PopupWindow.OnDismissListener l;
    private View m;
    public View n;
    private m.a o;
    public ViewTreeObserver p;
    private boolean q;
    private boolean u;
    private int v;
    private int w = 0;
    private boolean x;

    /* compiled from: StandardMenuPopup */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public void onGlobalLayout() {
            if (q.this.b() && !q.this.i.B()) {
                View view = q.this.n;
                if (view == null || !view.isShown()) {
                    q.this.dismiss();
                } else {
                    q.this.i.a();
                }
            }
        }
    }

    /* compiled from: StandardMenuPopup */
    class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = q.this.p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    q.this.p = view.getViewTreeObserver();
                }
                q qVar = q.this;
                qVar.p.removeGlobalOnLayoutListener(qVar.j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public q(Context context, g gVar, View view, int i2, int i3, boolean z) {
        this.b = context;
        this.c = gVar;
        this.e = z;
        this.d = new f(gVar, LayoutInflater.from(context), this.e, y);
        this.g = i2;
        this.h = i3;
        Resources resources = context.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(g.abc_config_prefDialogWidth));
        this.m = view;
        this.i = new l0(this.b, null, this.g, this.h);
        gVar.c(this, context);
    }

    private boolean z() {
        View view;
        if (b()) {
            return true;
        }
        if (this.q || (view = this.m) == null) {
            return false;
        }
        this.n = view;
        this.i.K(this);
        this.i.L(this);
        this.i.J(true);
        View view2 = this.n;
        boolean z = this.p == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.p = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.j);
        }
        view2.addOnAttachStateChangeListener(this.k);
        this.i.D(view2);
        this.i.G(this.w);
        if (!this.u) {
            this.v = k.o(this.d, null, this.b, this.f);
            this.u = true;
        }
        this.i.F(this.v);
        this.i.I(2);
        this.i.H(n());
        this.i.a();
        ListView j2 = this.i.j();
        j2.setOnKeyListener(this);
        if (this.x && this.c.x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.b).inflate(j.abc_popup_menu_header_item_layout, (ViewGroup) j2, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.c.x());
            }
            frameLayout.setEnabled(false);
            j2.addHeaderView(frameLayout, null, false);
        }
        this.i.p(this.d);
        this.i.a();
        return true;
    }

    @Override // androidx.appcompat.view.menu.p
    public void a() {
        if (!z()) {
            throw new IllegalStateException(C0201.m82(5647));
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean b() {
        return !this.q && this.i.b();
    }

    @Override // androidx.appcompat.view.menu.m
    public void c(g gVar, boolean z) {
        if (gVar == this.c) {
            dismiss();
            m.a aVar = this.o;
            if (aVar != null) {
                aVar.c(gVar, z);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void d(boolean z) {
        this.u = false;
        f fVar = this.d;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        if (b()) {
            this.i.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void h(m.a aVar) {
        this.o = aVar;
    }

    @Override // androidx.appcompat.view.menu.p
    public ListView j() {
        return this.i.j();
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean k(r rVar) {
        if (rVar.hasVisibleItems()) {
            l lVar = new l(this.b, rVar, this.n, this.e, this.g, this.h);
            lVar.j(this.o);
            lVar.g(k.x(rVar));
            lVar.i(this.l);
            this.l = null;
            this.c.e(false);
            int d2 = this.i.d();
            int o2 = this.i.o();
            if ((Gravity.getAbsoluteGravity(this.w, k3.w(this.m)) & 7) == 5) {
                d2 += this.m.getWidth();
            }
            if (lVar.n(d2, o2)) {
                m.a aVar = this.o;
                if (aVar == null) {
                    return true;
                }
                aVar.d(rVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.k
    public void l(g gVar) {
    }

    public void onDismiss() {
        this.q = true;
        this.c.close();
        ViewTreeObserver viewTreeObserver = this.p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.p = this.n.getViewTreeObserver();
            }
            this.p.removeGlobalOnLayoutListener(this.j);
            this.p = null;
        }
        this.n.removeOnAttachStateChangeListener(this.k);
        PopupWindow.OnDismissListener onDismissListener = this.l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.k
    public void p(View view) {
        this.m = view;
    }

    @Override // androidx.appcompat.view.menu.k
    public void r(boolean z) {
        this.d.d(z);
    }

    @Override // androidx.appcompat.view.menu.k
    public void s(int i2) {
        this.w = i2;
    }

    @Override // androidx.appcompat.view.menu.k
    public void t(int i2) {
        this.i.f(i2);
    }

    @Override // androidx.appcompat.view.menu.k
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.l = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.k
    public void v(boolean z) {
        this.x = z;
    }

    @Override // androidx.appcompat.view.menu.k
    public void w(int i2) {
        this.i.l(i2);
    }
}
