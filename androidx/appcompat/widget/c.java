package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.view.menu.r;
import androidx.appcompat.widget.ActionMenuView;
import defpackage.s2;
import java.util.ArrayList;

/* compiled from: ActionMenuPresenter */
public class c extends androidx.appcompat.view.menu.b implements s2.a {
    public a A;
    public RunnableC0010c B;
    private b C;
    public final f D = new f();
    public int E;
    public d i;
    private Drawable j;
    private boolean k;
    private boolean l;
    private boolean m;
    private int n;
    private int o;
    private int p;
    private boolean q;
    private boolean u;
    private boolean v;
    private boolean w;
    private int x;
    private final SparseBooleanArray y = new SparseBooleanArray();
    public e z;

    /* access modifiers changed from: private */
    /* compiled from: ActionMenuPresenter */
    public class a extends l {
        public a(Context context, r rVar, View view) {
            super(context, rVar, view, false, defpackage.d.actionOverflowMenuStyle);
            if (!((i) rVar.getItem()).l()) {
                View view2 = c.this.i;
                f(view2 == null ? (View) c.this.h : view2);
            }
            j(c.this.D);
        }

        @Override // androidx.appcompat.view.menu.l
        public void e() {
            c cVar = c.this;
            cVar.A = null;
            cVar.E = 0;
            super.e();
        }
    }

    /* compiled from: ActionMenuPresenter */
    private class b extends ActionMenuItemView.b {
        public b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public p a() {
            a aVar = c.this.A;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.c$c  reason: collision with other inner class name */
    /* compiled from: ActionMenuPresenter */
    public class RunnableC0010c implements Runnable {
        private e a;

        public RunnableC0010c(e eVar) {
            this.a = eVar;
        }

        public void run() {
            if (c.this.c != null) {
                c.this.c.d();
            }
            View view = (View) c.this.h;
            if (!(view == null || view.getWindowToken() == null || !this.a.m())) {
                c.this.z = this.a;
            }
            c.this.B = null;
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: ActionMenuPresenter */
    public class d extends o implements ActionMenuView.a {

        /* compiled from: ActionMenuPresenter */
        class a extends h0 {
            public a(View view, c cVar) {
                super(view);
            }

            @Override // androidx.appcompat.widget.h0
            public p b() {
                e eVar = c.this.z;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // androidx.appcompat.widget.h0
            public boolean c() {
                c.this.J();
                return true;
            }

            @Override // androidx.appcompat.widget.h0
            public boolean d() {
                c cVar = c.this;
                if (cVar.B != null) {
                    return false;
                }
                cVar.A();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, defpackage.d.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            z0.a(this, getContentDescription());
            setOnTouchListener(new a(this, c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean c() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.J();
            return true;
        }

        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.a.l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: ActionMenuPresenter */
    public class e extends l {
        public e(Context context, g gVar, View view, boolean z) {
            super(context, gVar, view, z, defpackage.d.actionOverflowMenuStyle);
            h(8388613);
            j(c.this.D);
        }

        @Override // androidx.appcompat.view.menu.l
        public void e() {
            if (c.this.c != null) {
                c.this.c.close();
            }
            c.this.z = null;
            super.e();
        }
    }

    /* compiled from: ActionMenuPresenter */
    private class f implements m.a {
        public f() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void c(g gVar, boolean z) {
            if (gVar instanceof r) {
                gVar.D().e(false);
            }
            m.a m = c.this.m();
            if (m != null) {
                m.c(gVar, z);
            }
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean d(g gVar) {
            if (gVar == null) {
                return false;
            }
            c.this.E = ((r) gVar).getItem().getItemId();
            m.a m = c.this.m();
            if (m != null) {
                return m.d(gVar);
            }
            return false;
        }
    }

    public c(Context context) {
        super(context, j.abc_action_menu_layout, j.abc_action_menu_item_layout);
    }

    private View y(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.h;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof n.a) && ((n.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public boolean A() {
        n nVar;
        RunnableC0010c cVar = this.B;
        if (cVar == null || (nVar = this.h) == null) {
            e eVar = this.z;
            if (eVar == null) {
                return false;
            }
            eVar.b();
            return true;
        }
        ((View) nVar).removeCallbacks(cVar);
        this.B = null;
        return true;
    }

    public boolean B() {
        a aVar = this.A;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean C() {
        return this.B != null || D();
    }

    public boolean D() {
        e eVar = this.z;
        return eVar != null && eVar.d();
    }

    public void E(Configuration configuration) {
        if (!this.q) {
            this.p = v.b(this.b).d();
        }
        g gVar = this.c;
        if (gVar != null) {
            gVar.K(true);
        }
    }

    public void F(boolean z2) {
        this.w = z2;
    }

    public void G(ActionMenuView actionMenuView) {
        this.h = actionMenuView;
        actionMenuView.b(this.c);
    }

    public void H(Drawable drawable) {
        d dVar = this.i;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.k = true;
        this.j = drawable;
    }

    public void I(boolean z2) {
        this.l = z2;
        this.m = true;
    }

    public boolean J() {
        g gVar;
        if (!this.l || D() || (gVar = this.c) == null || this.h == null || this.B != null || gVar.z().isEmpty()) {
            return false;
        }
        RunnableC0010c cVar = new RunnableC0010c(new e(this.b, this.c, this.i, true));
        this.B = cVar;
        ((View) this.h).post(cVar);
        super.k(null);
        return true;
    }

    @Override // androidx.appcompat.view.menu.b
    public void b(i iVar, n.a aVar) {
        aVar.f(iVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.h);
        if (this.C == null) {
            this.C = new b();
        }
        actionMenuItemView.setPopupCallback(this.C);
    }

    @Override // androidx.appcompat.view.menu.m, androidx.appcompat.view.menu.b
    public void c(g gVar, boolean z2) {
        x();
        super.c(gVar, z2);
    }

    @Override // androidx.appcompat.view.menu.m, androidx.appcompat.view.menu.b
    public void d(boolean z2) {
        n nVar;
        super.d(z2);
        ((View) this.h).requestLayout();
        g gVar = this.c;
        boolean z3 = false;
        if (gVar != null) {
            ArrayList<i> s = gVar.s();
            int size = s.size();
            for (int i2 = 0; i2 < size; i2++) {
                s2 b2 = s.get(i2).b();
                if (b2 != null) {
                    b2.i(this);
                }
            }
        }
        g gVar2 = this.c;
        ArrayList<i> z4 = gVar2 != null ? gVar2.z() : null;
        if (this.l && z4 != null) {
            int size2 = z4.size();
            if (size2 == 1) {
                z3 = !z4.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z3 = true;
            }
        }
        if (z3) {
            if (this.i == null) {
                this.i = new d(this.a);
            }
            ViewGroup viewGroup = (ViewGroup) this.i.getParent();
            if (viewGroup != this.h) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.h;
                actionMenuView.addView(this.i, actionMenuView.F());
            }
        } else {
            d dVar = this.i;
            if (dVar != null && dVar.getParent() == (nVar = this.h)) {
                ((ViewGroup) nVar).removeView(this.i);
            }
        }
        ((ActionMenuView) this.h).setOverflowReserved(this.l);
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean e() {
        int i2;
        ArrayList<i> arrayList;
        int i3;
        int i4;
        int i5;
        c cVar = this;
        g gVar = cVar.c;
        View view = null;
        int i6 = 0;
        if (gVar != null) {
            arrayList = gVar.E();
            i2 = arrayList.size();
        } else {
            arrayList = null;
            i2 = 0;
        }
        int i7 = cVar.p;
        int i8 = cVar.o;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.h;
        boolean z2 = false;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < i2; i11++) {
            i iVar = arrayList.get(i11);
            if (iVar.o()) {
                i9++;
            } else if (iVar.n()) {
                i10++;
            } else {
                z2 = true;
            }
            if (cVar.w && iVar.isActionViewExpanded()) {
                i7 = 0;
            }
        }
        if (cVar.l && (z2 || i10 + i9 > i7)) {
            i7--;
        }
        int i12 = i7 - i9;
        SparseBooleanArray sparseBooleanArray = cVar.y;
        sparseBooleanArray.clear();
        if (cVar.u) {
            int i13 = cVar.x;
            i3 = i8 / i13;
            i4 = i13 + ((i8 % i13) / i3);
        } else {
            i4 = 0;
            i3 = 0;
        }
        int i14 = 0;
        int i15 = 0;
        while (i14 < i2) {
            i iVar2 = arrayList.get(i14);
            if (iVar2.o()) {
                View n2 = cVar.n(iVar2, view, viewGroup);
                if (cVar.u) {
                    i3 -= ActionMenuView.L(n2, i4, i3, makeMeasureSpec, i6);
                } else {
                    n2.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = n2.getMeasuredWidth();
                i8 -= measuredWidth;
                if (i15 == 0) {
                    i15 = measuredWidth;
                }
                int groupId = iVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                iVar2.u(true);
                i5 = i2;
            } else if (iVar2.n()) {
                int groupId2 = iVar2.getGroupId();
                boolean z3 = sparseBooleanArray.get(groupId2);
                boolean z4 = (i12 > 0 || z3) && i8 > 0 && (!cVar.u || i3 > 0);
                boolean z5 = z4;
                i5 = i2;
                if (z4) {
                    View n3 = cVar.n(iVar2, null, viewGroup);
                    if (cVar.u) {
                        int L = ActionMenuView.L(n3, i4, i3, makeMeasureSpec, 0);
                        i3 -= L;
                        if (L == 0) {
                            z5 = false;
                        }
                    } else {
                        n3.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    int measuredWidth2 = n3.getMeasuredWidth();
                    i8 -= measuredWidth2;
                    if (i15 == 0) {
                        i15 = measuredWidth2;
                    }
                    z4 = z5 & (!cVar.u ? i8 + i15 > 0 : i8 >= 0);
                }
                if (z4 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z3) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i16 = 0; i16 < i14; i16++) {
                        i iVar3 = arrayList.get(i16);
                        if (iVar3.getGroupId() == groupId2) {
                            if (iVar3.l()) {
                                i12++;
                            }
                            iVar3.u(false);
                        }
                    }
                }
                if (z4) {
                    i12--;
                }
                iVar2.u(z4);
            } else {
                i5 = i2;
                iVar2.u(false);
                i14++;
                view = null;
                cVar = this;
                i2 = i5;
                i6 = 0;
            }
            i14++;
            view = null;
            cVar = this;
            i2 = i5;
            i6 = 0;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.m, androidx.appcompat.view.menu.b
    public void i(Context context, g gVar) {
        super.i(context, gVar);
        Resources resources = context.getResources();
        v b2 = v.b(context);
        if (!this.m) {
            this.l = b2.h();
        }
        if (!this.v) {
            this.n = b2.c();
        }
        if (!this.q) {
            this.p = b2.d();
        }
        int i2 = this.n;
        if (this.l) {
            if (this.i == null) {
                d dVar = new d(this.a);
                this.i = dVar;
                if (this.k) {
                    dVar.setImageDrawable(this.j);
                    this.j = null;
                    this.k = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.i.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i2 -= this.i.getMeasuredWidth();
        } else {
            this.i = null;
        }
        this.o = i2;
        this.x = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.m, androidx.appcompat.view.menu.b
    public boolean k(r rVar) {
        boolean z2 = false;
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        r rVar2 = rVar;
        while (rVar2.e0() != this.c) {
            rVar2 = (r) rVar2.e0();
        }
        View y2 = y(rVar2.getItem());
        if (y2 == null) {
            return false;
        }
        rVar.getItem().getItemId();
        int size = rVar.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            MenuItem item = rVar.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z2 = true;
                break;
            }
            i2++;
        }
        a aVar = new a(this.b, rVar, y2);
        this.A = aVar;
        aVar.g(z2);
        this.A.k();
        super.k(rVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.b
    public boolean l(ViewGroup viewGroup, int i2) {
        if (viewGroup.getChildAt(i2) == this.i) {
            return false;
        }
        return super.l(viewGroup, i2);
    }

    @Override // androidx.appcompat.view.menu.b
    public View n(i iVar, View view, ViewGroup viewGroup) {
        View actionView = iVar.getActionView();
        if (actionView == null || iVar.j()) {
            actionView = super.n(iVar, view, viewGroup);
        }
        actionView.setVisibility(iVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.o(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.b
    public n o(ViewGroup viewGroup) {
        n nVar = this.h;
        n o2 = super.o(viewGroup);
        if (nVar != o2) {
            ((ActionMenuView) o2).setPresenter(this);
        }
        return o2;
    }

    @Override // androidx.appcompat.view.menu.b
    public boolean q(int i2, i iVar) {
        return iVar.l();
    }

    public boolean x() {
        return A() | B();
    }

    public Drawable z() {
        d dVar = this.i;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.k) {
            return this.j;
        }
        return null;
    }
}
