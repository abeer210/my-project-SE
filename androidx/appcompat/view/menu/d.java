package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.k0;
import androidx.appcompat.widget.l0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CascadingMenuPopup */
public final class d extends k implements m, View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int E = j.abc_cascading_menu_item_layout;
    private m.a A;
    public ViewTreeObserver B;
    private PopupWindow.OnDismissListener C;
    public boolean D;
    private final Context b;
    private final int c;
    private final int d;
    private final int e;
    private final boolean f;
    public final Handler g;
    private final List<g> h = new ArrayList();
    public final List<C0008d> i = new ArrayList();
    public final ViewTreeObserver.OnGlobalLayoutListener j = new a();
    private final View.OnAttachStateChangeListener k = new b();
    private final k0 l = new c();
    private int m = 0;
    private int n = 0;
    private View o;
    public View p;
    private int q;
    private boolean u;
    private boolean v;
    private int w;
    private int x;
    private boolean y;
    private boolean z;

    /* compiled from: CascadingMenuPopup */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public void onGlobalLayout() {
            if (d.this.b() && d.this.i.size() > 0 && !d.this.i.get(0).a.B()) {
                View view = d.this.p;
                if (view == null || !view.isShown()) {
                    d.this.dismiss();
                    return;
                }
                for (C0008d dVar : d.this.i) {
                    dVar.a.a();
                }
            }
        }
    }

    /* compiled from: CascadingMenuPopup */
    class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = d.this.B;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    d.this.B = view.getViewTreeObserver();
                }
                d dVar = d.this;
                dVar.B.removeGlobalOnLayoutListener(dVar.j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* compiled from: CascadingMenuPopup */
    class c implements k0 {

        /* compiled from: CascadingMenuPopup */
        class a implements Runnable {
            public final /* synthetic */ C0008d a;
            public final /* synthetic */ MenuItem b;
            public final /* synthetic */ g c;

            public a(C0008d dVar, MenuItem menuItem, g gVar) {
                this.a = dVar;
                this.b = menuItem;
                this.c = gVar;
            }

            public void run() {
                C0008d dVar = this.a;
                if (dVar != null) {
                    d.this.D = true;
                    dVar.b.e(false);
                    d.this.D = false;
                }
                if (this.b.isEnabled() && this.b.hasSubMenu()) {
                    this.c.L(this.b, 4);
                }
            }
        }

        public c() {
        }

        @Override // androidx.appcompat.widget.k0
        public void e(g gVar, MenuItem menuItem) {
            C0008d dVar = null;
            d.this.g.removeCallbacksAndMessages(null);
            int size = d.this.i.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (gVar == d.this.i.get(i).b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                int i2 = i + 1;
                if (i2 < d.this.i.size()) {
                    dVar = d.this.i.get(i2);
                }
                d.this.g.postAtTime(new a(dVar, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
            }
        }

        @Override // androidx.appcompat.widget.k0
        public void h(g gVar, MenuItem menuItem) {
            d.this.g.removeCallbacksAndMessages(gVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.view.menu.d$d  reason: collision with other inner class name */
    /* compiled from: CascadingMenuPopup */
    public static class C0008d {
        public final l0 a;
        public final g b;
        public final int c;

        public C0008d(l0 l0Var, g gVar, int i) {
            this.a = l0Var;
            this.b = gVar;
            this.c = i;
        }

        public ListView a() {
            return this.a.j();
        }
    }

    public d(Context context, View view, int i2, int i3, boolean z2) {
        this.b = context;
        this.o = view;
        this.d = i2;
        this.e = i3;
        this.f = z2;
        this.y = false;
        this.q = D();
        Resources resources = context.getResources();
        this.c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(g.abc_config_prefDialogWidth));
        this.g = new Handler();
    }

    private int A(g gVar) {
        int size = this.i.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (gVar == this.i.get(i2).b) {
                return i2;
            }
        }
        return -1;
    }

    private MenuItem B(g gVar, g gVar2) {
        int size = gVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = gVar.getItem(i2);
            if (item.hasSubMenu() && gVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View C(C0008d dVar, g gVar) {
        int i2;
        f fVar;
        int firstVisiblePosition;
        MenuItem B2 = B(dVar.b, gVar);
        if (B2 == null) {
            return null;
        }
        ListView a2 = dVar.a();
        ListAdapter adapter = a2.getAdapter();
        int i3 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i2 = headerViewListAdapter.getHeadersCount();
            fVar = (f) headerViewListAdapter.getWrappedAdapter();
        } else {
            fVar = (f) adapter;
            i2 = 0;
        }
        int count = fVar.getCount();
        while (true) {
            if (i3 >= count) {
                i3 = -1;
                break;
            } else if (B2 == fVar.getItem(i3)) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 != -1 && (firstVisiblePosition = (i3 + i2) - a2.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a2.getChildCount()) {
            return a2.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int D() {
        return k3.w(this.o) == 1 ? 0 : 1;
    }

    private int E(int i2) {
        List<C0008d> list = this.i;
        ListView a2 = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        a2.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.p.getWindowVisibleDisplayFrame(rect);
        if (this.q == 1) {
            if (iArr[0] + a2.getWidth() + i2 > rect.right) {
                return 0;
            }
            return 1;
        } else if (iArr[0] - i2 < 0) {
            return 1;
        } else {
            return 0;
        }
    }

    private void F(g gVar) {
        View view;
        C0008d dVar;
        int i2;
        int i3;
        int i4;
        LayoutInflater from = LayoutInflater.from(this.b);
        f fVar = new f(gVar, from, this.f, E);
        if (!b() && this.y) {
            fVar.d(true);
        } else if (b()) {
            fVar.d(k.x(gVar));
        }
        int o2 = k.o(fVar, null, this.b, this.c);
        l0 z2 = z();
        z2.p(fVar);
        z2.F(o2);
        z2.G(this.n);
        if (this.i.size() > 0) {
            List<C0008d> list = this.i;
            dVar = list.get(list.size() - 1);
            view = C(dVar, gVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            z2.U(false);
            z2.R(null);
            int E2 = E(o2);
            boolean z3 = E2 == 1;
            this.q = E2;
            if (Build.VERSION.SDK_INT >= 26) {
                z2.D(view);
                i3 = 0;
                i2 = 0;
            } else {
                int[] iArr = new int[2];
                this.o.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.n & 7) == 5) {
                    iArr[0] = iArr[0] + this.o.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i2 = iArr2[0] - iArr[0];
                i3 = iArr2[1] - iArr[1];
            }
            if ((this.n & 5) != 5) {
                if (z3) {
                    o2 = view.getWidth();
                }
                i4 = i2 - o2;
                z2.f(i4);
                z2.M(true);
                z2.l(i3);
            } else if (!z3) {
                o2 = view.getWidth();
                i4 = i2 - o2;
                z2.f(i4);
                z2.M(true);
                z2.l(i3);
            }
            i4 = i2 + o2;
            z2.f(i4);
            z2.M(true);
            z2.l(i3);
        } else {
            if (this.u) {
                z2.f(this.w);
            }
            if (this.v) {
                z2.l(this.x);
            }
            z2.H(n());
        }
        this.i.add(new C0008d(z2, gVar, this.q));
        z2.a();
        ListView j2 = z2.j();
        j2.setOnKeyListener(this);
        if (dVar == null && this.z && gVar.x() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(j.abc_popup_menu_header_item_layout, (ViewGroup) j2, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(gVar.x());
            j2.addHeaderView(frameLayout, null, false);
            z2.a();
        }
    }

    private l0 z() {
        l0 l0Var = new l0(this.b, null, this.d, this.e);
        l0Var.T(this.l);
        l0Var.L(this);
        l0Var.K(this);
        l0Var.D(this.o);
        l0Var.G(this.n);
        l0Var.J(true);
        l0Var.I(2);
        return l0Var;
    }

    @Override // androidx.appcompat.view.menu.p
    public void a() {
        if (!b()) {
            for (g gVar : this.h) {
                F(gVar);
            }
            this.h.clear();
            View view = this.o;
            this.p = view;
            if (view != null) {
                boolean z2 = this.B == null;
                ViewTreeObserver viewTreeObserver = this.p.getViewTreeObserver();
                this.B = viewTreeObserver;
                if (z2) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.j);
                }
                this.p.addOnAttachStateChangeListener(this.k);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean b() {
        return this.i.size() > 0 && this.i.get(0).a.b();
    }

    @Override // androidx.appcompat.view.menu.m
    public void c(g gVar, boolean z2) {
        int A2 = A(gVar);
        if (A2 >= 0) {
            int i2 = A2 + 1;
            if (i2 < this.i.size()) {
                this.i.get(i2).b.e(false);
            }
            C0008d remove = this.i.remove(A2);
            remove.b.O(this);
            if (this.D) {
                remove.a.S(null);
                remove.a.E(0);
            }
            remove.a.dismiss();
            int size = this.i.size();
            if (size > 0) {
                this.q = this.i.get(size - 1).c;
            } else {
                this.q = D();
            }
            if (size == 0) {
                dismiss();
                m.a aVar = this.A;
                if (aVar != null) {
                    aVar.c(gVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.B;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.B.removeGlobalOnLayoutListener(this.j);
                    }
                    this.B = null;
                }
                this.p.removeOnAttachStateChangeListener(this.k);
                this.C.onDismiss();
            } else if (z2) {
                this.i.get(0).b.e(false);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void d(boolean z2) {
        for (C0008d dVar : this.i) {
            k.y(dVar.a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        int size = this.i.size();
        if (size > 0) {
            C0008d[] dVarArr = (C0008d[]) this.i.toArray(new C0008d[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                C0008d dVar = dVarArr[i2];
                if (dVar.a.b()) {
                    dVar.a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void h(m.a aVar) {
        this.A = aVar;
    }

    @Override // androidx.appcompat.view.menu.p
    public ListView j() {
        if (this.i.isEmpty()) {
            return null;
        }
        List<C0008d> list = this.i;
        return list.get(list.size() - 1).a();
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean k(r rVar) {
        for (C0008d dVar : this.i) {
            if (rVar == dVar.b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        l(rVar);
        m.a aVar = this.A;
        if (aVar != null) {
            aVar.d(rVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.k
    public void l(g gVar) {
        gVar.c(this, this.b);
        if (b()) {
            F(gVar);
        } else {
            this.h.add(gVar);
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public boolean m() {
        return false;
    }

    public void onDismiss() {
        C0008d dVar;
        int size = this.i.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                dVar = null;
                break;
            }
            dVar = this.i.get(i2);
            if (!dVar.a.b()) {
                break;
            }
            i2++;
        }
        if (dVar != null) {
            dVar.b.e(false);
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
        if (this.o != view) {
            this.o = view;
            this.n = u2.b(this.m, k3.w(view));
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void r(boolean z2) {
        this.y = z2;
    }

    @Override // androidx.appcompat.view.menu.k
    public void s(int i2) {
        if (this.m != i2) {
            this.m = i2;
            this.n = u2.b(i2, k3.w(this.o));
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void t(int i2) {
        this.u = true;
        this.w = i2;
    }

    @Override // androidx.appcompat.view.menu.k
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.C = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.k
    public void v(boolean z2) {
        this.z = z2;
    }

    @Override // androidx.appcompat.view.menu.k
    public void w(int i2) {
        this.v = true;
        this.x = i2;
    }
}
