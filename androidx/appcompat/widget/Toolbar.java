package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.r;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0188;

public class Toolbar extends ViewGroup {
    private CharSequence A;
    private CharSequence B;
    private ColorStateList C;
    private ColorStateList D;
    private boolean E;
    private boolean F;
    private final ArrayList<View> G;
    private final ArrayList<View> H;
    private final int[] I;
    public f J;
    private final ActionMenuView.e K;
    private y0 L;
    private c M;
    private d N;
    private m.a O;
    private g.a P;
    private boolean Q;
    private final Runnable R;
    private ActionMenuView a;
    private TextView b;
    private TextView c;
    private ImageButton d;
    private ImageView e;
    private Drawable f;
    private CharSequence g;
    public ImageButton h;
    public View i;
    private Context j;
    private int k;
    private int l;
    private int m;
    public int n;
    private int o;
    private int p;
    private int q;
    private int u;
    private int v;
    private o0 w;
    private int x;
    private int y;
    private int z;

    class a implements ActionMenuView.e {
        public a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            f fVar = Toolbar.this.J;
            if (fVar != null) {
                return fVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    class b implements Runnable {
        public b() {
        }

        public void run() {
            Toolbar.this.O();
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements View.OnClickListener {
        public c() {
        }

        public void onClick(View view) {
            w30.g(view);
            try {
                Toolbar.this.e();
            } finally {
                w30.h();
            }
        }
    }

    /* access modifiers changed from: private */
    public class d implements m {
        public androidx.appcompat.view.menu.g a;
        public i b;

        public d() {
        }

        @Override // androidx.appcompat.view.menu.m
        public void c(androidx.appcompat.view.menu.g gVar, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.m
        public void d(boolean z) {
            if (this.b != null) {
                androidx.appcompat.view.menu.g gVar = this.a;
                boolean z2 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.a.getItem(i) == this.b) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    f(this.a, this.b);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean e() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean f(androidx.appcompat.view.menu.g gVar, i iVar) {
            View view = Toolbar.this.i;
            if (view instanceof x) {
                ((x) view).d();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.i);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.h);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.i = null;
            toolbar3.a();
            this.b = null;
            Toolbar.this.requestLayout();
            iVar.r(false);
            return true;
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean g(androidx.appcompat.view.menu.g gVar, i iVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.h.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.h);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.h);
            }
            Toolbar.this.i = iVar.getActionView();
            this.b = iVar;
            ViewParent parent2 = Toolbar.this.i.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.i);
                }
                e m = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                m.a = 8388611 | (toolbar4.n & 112);
                m.b = 2;
                toolbar4.i.setLayoutParams(m);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.i);
            }
            Toolbar.this.G();
            Toolbar.this.requestLayout();
            iVar.r(true);
            View view = Toolbar.this.i;
            if (view instanceof x) {
                ((x) view).c();
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.m
        public void h(m.a aVar) {
        }

        @Override // androidx.appcompat.view.menu.m
        public void i(Context context, androidx.appcompat.view.menu.g gVar) {
            i iVar;
            androidx.appcompat.view.menu.g gVar2 = this.a;
            if (!(gVar2 == null || (iVar = this.b) == null)) {
                gVar2.f(iVar);
            }
            this.a = gVar;
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean k(r rVar) {
            return false;
        }
    }

    public interface f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    private int B(View view, int i2, int[] iArr, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - iArr[0];
        int max = i2 + Math.max(0, i4);
        iArr[0] = Math.max(0, -i4);
        int q2 = q(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, q2, max + measuredWidth, view.getMeasuredHeight() + q2);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
    }

    private int C(View view, int i2, int[] iArr, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - iArr[1];
        int max = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int q2 = q(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, q2, max, view.getMeasuredHeight() + q2);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).leftMargin);
    }

    private int D(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i7);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + max + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private void E(View view, int i2, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i6 >= 0) {
            if (mode != 0) {
                i6 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i6);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void F() {
        removeCallbacks(this.R);
        post(this.R);
    }

    private boolean M() {
        if (!this.Q) {
            return false;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (N(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean N(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void b(List<View> list, int i2) {
        boolean z2 = k3.w(this) == 1;
        int childCount = getChildCount();
        int b2 = u2.b(i2, k3.w(this));
        list.clear();
        if (z2) {
            for (int i3 = childCount - 1; i3 >= 0; i3--) {
                View childAt = getChildAt(i3);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.b == 0 && N(childAt) && p(eVar.a) == b2) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = getChildAt(i4);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.b == 0 && N(childAt2) && p(eVar2.a) == b2) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z2) {
        e eVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            eVar = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams)) {
            eVar = generateLayoutParams(layoutParams);
        } else {
            eVar = (e) layoutParams;
        }
        eVar.b = 1;
        if (!z2 || this.i == null) {
            addView(view, eVar);
            return;
        }
        view.setLayoutParams(eVar);
        this.H.add(view);
    }

    private MenuInflater getMenuInflater() {
        return new b0(getContext());
    }

    private void h() {
        if (this.w == null) {
            this.w = new o0();
        }
    }

    private void i() {
        if (this.e == null) {
            this.e = new o(getContext());
        }
    }

    private void j() {
        k();
        if (this.a.N() == null) {
            androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) this.a.getMenu();
            if (this.N == null) {
                this.N = new d();
            }
            this.a.setExpandedActionViewsExclusive(true);
            gVar.c(this.N, this.j);
        }
    }

    private void k() {
        if (this.a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.a = actionMenuView;
            actionMenuView.setPopupTheme(this.k);
            this.a.setOnMenuItemClickListener(this.K);
            this.a.O(this.O, this.P);
            e m2 = generateDefaultLayoutParams();
            m2.a = 8388613 | (this.n & 112);
            this.a.setLayoutParams(m2);
            c(this.a, false);
        }
    }

    private void l() {
        if (this.d == null) {
            this.d = new m(getContext(), null, defpackage.d.toolbarNavigationButtonStyle);
            e m2 = generateDefaultLayoutParams();
            m2.a = 8388611 | (this.n & 112);
            this.d.setLayoutParams(m2);
        }
    }

    private int p(int i2) {
        int w2 = k3.w(this);
        int b2 = u2.b(i2, w2) & 7;
        if (b2 == 1 || b2 == 3 || b2 == 5) {
            return b2;
        }
        return w2 == 1 ? 5 : 3;
    }

    private int q(View view, int i2) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int r = r(eVar.a);
        if (r == 48) {
            return getPaddingTop() - i3;
        }
        if (r == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        if (i4 < i5) {
            i4 = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            int i7 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            if (i6 < i7) {
                i4 = Math.max(0, i4 - (i7 - i6));
            }
        }
        return paddingTop + i4;
    }

    private int r(int i2) {
        int i3 = i2 & 112;
        return (i3 == 16 || i3 == 48 || i3 == 80) ? i3 : this.z & 112;
    }

    private int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return x2.b(marginLayoutParams) + x2.a(marginLayoutParams);
    }

    private int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int u(List<View> list, int[] iArr) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int size = list.size();
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            View view = list.get(i4);
            e eVar = (e) view.getLayoutParams();
            int i6 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - i2;
            int i7 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - i3;
            int max = Math.max(0, i6);
            int max2 = Math.max(0, i7);
            int max3 = Math.max(0, -i6);
            int max4 = Math.max(0, -i7);
            i5 += max + view.getMeasuredWidth() + max2;
            i4++;
            i3 = max4;
            i2 = max3;
        }
        return i5;
    }

    private boolean y(View view) {
        return view.getParent() == this || this.H.contains(view);
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.a;
        return actionMenuView != null && actionMenuView.J();
    }

    public void G() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((e) childAt.getLayoutParams()).b == 2 || childAt == this.a)) {
                removeViewAt(childCount);
                this.H.add(childAt);
            }
        }
    }

    public void H(int i2, int i3) {
        h();
        this.w.g(i2, i3);
    }

    public void I(androidx.appcompat.view.menu.g gVar, c cVar) {
        if (gVar != null || this.a != null) {
            k();
            androidx.appcompat.view.menu.g N2 = this.a.N();
            if (N2 != gVar) {
                if (N2 != null) {
                    N2.O(this.M);
                    N2.O(this.N);
                }
                if (this.N == null) {
                    this.N = new d();
                }
                cVar.F(true);
                if (gVar != null) {
                    gVar.c(cVar, this.j);
                    gVar.c(this.N, this.j);
                } else {
                    cVar.i(this.j, null);
                    this.N.i(this.j, null);
                    cVar.d(true);
                    this.N.d(true);
                }
                this.a.setPopupTheme(this.k);
                this.a.setPresenter(cVar);
                this.M = cVar;
            }
        }
    }

    public void J(m.a aVar, g.a aVar2) {
        this.O = aVar;
        this.P = aVar2;
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView != null) {
            actionMenuView.O(aVar, aVar2);
        }
    }

    public void K(Context context, int i2) {
        this.m = i2;
        TextView textView = this.c;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    public void L(Context context, int i2) {
        this.l = i2;
        TextView textView = this.b;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    public boolean O() {
        ActionMenuView actionMenuView = this.a;
        return actionMenuView != null && actionMenuView.P();
    }

    public void a() {
        for (int size = this.H.size() - 1; size >= 0; size--) {
            addView(this.H.get(size));
        }
        this.H.clear();
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.a) != null && actionMenuView.K();
    }

    public void e() {
        d dVar = this.N;
        i iVar = dVar == null ? null : dVar.b;
        if (iVar != null) {
            iVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView != null) {
            actionMenuView.B();
        }
    }

    public void g() {
        if (this.h == null) {
            m mVar = new m(getContext(), null, defpackage.d.toolbarNavigationButtonStyle);
            this.h = mVar;
            mVar.setImageDrawable(this.f);
            this.h.setContentDescription(this.g);
            e m2 = generateDefaultLayoutParams();
            m2.a = 8388611 | (this.n & 112);
            m2.b = 2;
            this.h.setLayoutParams(m2);
            this.h.setOnClickListener(new c());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        o0 o0Var = this.w;
        if (o0Var != null) {
            return o0Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.y;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        o0 o0Var = this.w;
        if (o0Var != null) {
            return o0Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        o0 o0Var = this.w;
        if (o0Var != null) {
            return o0Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        o0 o0Var = this.w;
        if (o0Var != null) {
            return o0Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.x;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.g N2;
        ActionMenuView actionMenuView = this.a;
        if ((actionMenuView == null || (N2 = actionMenuView.N()) == null || !N2.hasVisibleItems()) ? false : true) {
            return Math.max(getContentInsetEnd(), Math.max(this.y, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (k3.w(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (k3.w(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.x, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.a.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public c getOuterActionMenuPresenter() {
        return this.M;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.j;
    }

    public int getPopupTheme() {
        return this.k;
    }

    public CharSequence getSubtitle() {
        return this.B;
    }

    public final TextView getSubtitleTextView() {
        return this.c;
    }

    public CharSequence getTitle() {
        return this.A;
    }

    public int getTitleMarginBottom() {
        return this.v;
    }

    public int getTitleMarginEnd() {
        return this.q;
    }

    public int getTitleMarginStart() {
        return this.p;
    }

    public int getTitleMarginTop() {
        return this.u;
    }

    public final TextView getTitleTextView() {
        return this.b;
    }

    public d0 getWrapper() {
        if (this.L == null) {
            this.L = new y0(this, true);
        }
        return this.L;
    }

    /* renamed from: m */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    /* renamed from: n */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* renamed from: o */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e) {
            return new e((e) layoutParams);
        }
        if (layoutParams instanceof a.C0006a) {
            return new e((a.C0006a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new e(layoutParams);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.R);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.F = false;
        }
        if (!this.F) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.F = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.F = false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x02a3 A[LOOP:0: B:101:0x02a1->B:102:0x02a3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02c5 A[LOOP:1: B:104:0x02c3->B:105:0x02c5, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02fe A[LOOP:2: B:112:0x02fc->B:113:0x02fe, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0229  */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        boolean N2;
        boolean N3;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int size;
        int i14;
        int size2;
        int i15;
        int i16;
        int size3;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean z3 = k3.w(this) == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i25 = width - paddingRight;
        int[] iArr = this.I;
        iArr[1] = 0;
        iArr[0] = 0;
        int x2 = k3.x(this);
        int min = x2 >= 0 ? Math.min(x2, i5 - i3) : 0;
        if (!N(this.d)) {
            i7 = paddingLeft;
        } else if (z3) {
            i6 = C(this.d, i25, iArr, min);
            i7 = paddingLeft;
            if (N(this.h)) {
                if (z3) {
                    i6 = C(this.h, i6, iArr, min);
                } else {
                    i7 = B(this.h, i7, iArr, min);
                }
            }
            if (N(this.a)) {
                if (z3) {
                    i7 = B(this.a, i7, iArr, min);
                } else {
                    i6 = C(this.a, i6, iArr, min);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - i7);
            iArr[1] = Math.max(0, currentContentInsetRight - (i25 - i6));
            int max = Math.max(i7, currentContentInsetLeft);
            int min2 = Math.min(i6, i25 - currentContentInsetRight);
            if (N(this.i)) {
                if (z3) {
                    min2 = C(this.i, min2, iArr, min);
                } else {
                    max = B(this.i, max, iArr, min);
                }
            }
            if (N(this.e)) {
                if (z3) {
                    min2 = C(this.e, min2, iArr, min);
                } else {
                    max = B(this.e, max, iArr, min);
                }
            }
            N2 = N(this.b);
            N3 = N(this.c);
            if (!N2) {
                e eVar = (e) this.b.getLayoutParams();
                i8 = paddingRight;
                i9 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + this.b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin + 0;
            } else {
                i8 = paddingRight;
                i9 = 0;
            }
            if (!N3) {
                e eVar2 = (e) this.c.getLayoutParams();
                i10 = width;
                i9 += ((ViewGroup.MarginLayoutParams) eVar2).topMargin + this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin;
            } else {
                i10 = width;
            }
            if (!N2 || N3) {
                TextView textView = !N2 ? this.b : this.c;
                TextView textView2 = !N3 ? this.c : this.b;
                e eVar3 = (e) textView.getLayoutParams();
                e eVar4 = (e) textView2.getLayoutParams();
                boolean z4 = (!N2 && this.b.getMeasuredWidth() > 0) || (N3 && this.c.getMeasuredWidth() > 0);
                i17 = this.z & 112;
                i12 = paddingLeft;
                if (i17 != 48) {
                    i18 = max;
                    i11 = min;
                    i19 = getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar3).topMargin + this.u;
                } else if (i17 != 80) {
                    int i26 = (((height - paddingTop) - paddingBottom) - i9) / 2;
                    int i27 = ((ViewGroup.MarginLayoutParams) eVar3).topMargin;
                    i11 = min;
                    int i28 = this.u;
                    i18 = max;
                    if (i26 < i27 + i28) {
                        i26 = i27 + i28;
                    } else {
                        int i29 = (((height - paddingBottom) - i9) - i26) - paddingTop;
                        int i30 = ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin;
                        int i31 = this.v;
                        if (i29 < i30 + i31) {
                            i26 = Math.max(0, i26 - ((((ViewGroup.MarginLayoutParams) eVar4).bottomMargin + i31) - i29));
                        }
                    }
                    i19 = paddingTop + i26;
                } else {
                    i18 = max;
                    i11 = min;
                    i19 = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) eVar4).bottomMargin) - this.v) - i9;
                }
                if (!z3) {
                    int i32 = (z4 ? this.p : 0) - iArr[1];
                    min2 -= Math.max(0, i32);
                    iArr[1] = Math.max(0, -i32);
                    if (N2) {
                        int measuredWidth = min2 - this.b.getMeasuredWidth();
                        int measuredHeight = this.b.getMeasuredHeight() + i19;
                        this.b.layout(measuredWidth, i19, min2, measuredHeight);
                        i23 = measuredWidth - this.q;
                        i19 = measuredHeight + ((ViewGroup.MarginLayoutParams) ((e) this.b.getLayoutParams())).bottomMargin;
                    } else {
                        i23 = min2;
                    }
                    if (N3) {
                        e eVar5 = (e) this.c.getLayoutParams();
                        int i33 = i19 + ((ViewGroup.MarginLayoutParams) eVar5).topMargin;
                        this.c.layout(min2 - this.c.getMeasuredWidth(), i33, min2, this.c.getMeasuredHeight() + i33);
                        i24 = min2 - this.q;
                        int i34 = ((ViewGroup.MarginLayoutParams) eVar5).bottomMargin;
                    } else {
                        i24 = min2;
                    }
                    if (z4) {
                        min2 = Math.min(i23, i24);
                    }
                    max = i18;
                } else {
                    if (z4) {
                        i20 = this.p;
                        i13 = 0;
                    } else {
                        i13 = 0;
                        i20 = 0;
                    }
                    int i35 = i20 - iArr[i13];
                    max = i18 + Math.max(i13, i35);
                    iArr[i13] = Math.max(i13, -i35);
                    if (N2) {
                        int measuredWidth2 = this.b.getMeasuredWidth() + max;
                        int measuredHeight2 = this.b.getMeasuredHeight() + i19;
                        this.b.layout(max, i19, measuredWidth2, measuredHeight2);
                        i21 = measuredWidth2 + this.q;
                        i19 = measuredHeight2 + ((ViewGroup.MarginLayoutParams) ((e) this.b.getLayoutParams())).bottomMargin;
                    } else {
                        i21 = max;
                    }
                    if (N3) {
                        e eVar6 = (e) this.c.getLayoutParams();
                        int i36 = i19 + ((ViewGroup.MarginLayoutParams) eVar6).topMargin;
                        int measuredWidth3 = this.c.getMeasuredWidth() + max;
                        this.c.layout(max, i36, measuredWidth3, this.c.getMeasuredHeight() + i36);
                        i22 = measuredWidth3 + this.q;
                        int i37 = ((ViewGroup.MarginLayoutParams) eVar6).bottomMargin;
                    } else {
                        i22 = max;
                    }
                    if (z4) {
                        max = Math.max(i21, i22);
                    }
                    b(this.G, 3);
                    size = this.G.size();
                    for (i14 = 0; i14 < size; i14++) {
                        max = B(this.G.get(i14), max, iArr, i11);
                    }
                    b(this.G, 5);
                    size2 = this.G.size();
                    for (i15 = 0; i15 < size2; i15++) {
                        min2 = C(this.G.get(i15), min2, iArr, i11);
                    }
                    b(this.G, 1);
                    int u2 = u(this.G, iArr);
                    i16 = (i12 + (((i10 - i12) - i8) / 2)) - (u2 / 2);
                    int i38 = u2 + i16;
                    if (i16 >= max) {
                        max = i38 > min2 ? i16 - (i38 - min2) : i16;
                    }
                    size3 = this.G.size();
                    while (i13 < size3) {
                        max = B(this.G.get(i13), max, iArr, i11);
                        i13++;
                    }
                    this.G.clear();
                    return;
                }
            } else {
                i12 = paddingLeft;
                i11 = min;
            }
            i13 = 0;
            b(this.G, 3);
            size = this.G.size();
            while (i14 < size) {
            }
            b(this.G, 5);
            size2 = this.G.size();
            while (i15 < size2) {
            }
            b(this.G, 1);
            int u22 = u(this.G, iArr);
            i16 = (i12 + (((i10 - i12) - i8) / 2)) - (u22 / 2);
            int i382 = u22 + i16;
            if (i16 >= max) {
            }
            size3 = this.G.size();
            while (i13 < size3) {
            }
            this.G.clear();
            return;
        } else {
            i7 = B(this.d, paddingLeft, iArr, min);
        }
        i6 = i25;
        if (N(this.h)) {
        }
        if (N(this.a)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i7);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i25 - i6));
        int max2 = Math.max(i7, currentContentInsetLeft2);
        int min22 = Math.min(i6, i25 - currentContentInsetRight2);
        if (N(this.i)) {
        }
        if (N(this.e)) {
        }
        N2 = N(this.b);
        N3 = N(this.c);
        if (!N2) {
        }
        if (!N3) {
        }
        if (!N2) {
        }
        if (!N2) {
        }
        if (!N3) {
        }
        e eVar32 = (e) textView.getLayoutParams();
        e eVar42 = (e) textView2.getLayoutParams();
        if (!N2) {
        }
        i17 = this.z & 112;
        i12 = paddingLeft;
        if (i17 != 48) {
        }
        if (!z3) {
        }
    }

    public void onMeasure(int i2, int i3) {
        char c2;
        char c3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr = this.I;
        int i11 = 0;
        if (d1.b(this)) {
            c3 = 1;
            c2 = 0;
        } else {
            c3 = 0;
            c2 = 1;
        }
        if (N(this.d)) {
            E(this.d, i2, 0, i3, 0, this.o);
            i6 = this.d.getMeasuredWidth() + s(this.d);
            i5 = Math.max(0, this.d.getMeasuredHeight() + t(this.d));
            i4 = View.combineMeasuredStates(0, this.d.getMeasuredState());
        } else {
            i6 = 0;
            i5 = 0;
            i4 = 0;
        }
        if (N(this.h)) {
            E(this.h, i2, 0, i3, 0, this.o);
            i6 = this.h.getMeasuredWidth() + s(this.h);
            i5 = Math.max(i5, this.h.getMeasuredHeight() + t(this.h));
            i4 = View.combineMeasuredStates(i4, this.h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i6);
        iArr[c3] = Math.max(0, currentContentInsetStart - i6);
        if (N(this.a)) {
            E(this.a, i2, max, i3, 0, this.o);
            i7 = this.a.getMeasuredWidth() + s(this.a);
            i5 = Math.max(i5, this.a.getMeasuredHeight() + t(this.a));
            i4 = View.combineMeasuredStates(i4, this.a.getMeasuredState());
        } else {
            i7 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i7);
        iArr[c2] = Math.max(0, currentContentInsetEnd - i7);
        if (N(this.i)) {
            max2 += D(this.i, i2, max2, i3, 0, iArr);
            i5 = Math.max(i5, this.i.getMeasuredHeight() + t(this.i));
            i4 = View.combineMeasuredStates(i4, this.i.getMeasuredState());
        }
        if (N(this.e)) {
            max2 += D(this.e, i2, max2, i3, 0, iArr);
            i5 = Math.max(i5, this.e.getMeasuredHeight() + t(this.e));
            i4 = View.combineMeasuredStates(i4, this.e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((e) childAt.getLayoutParams()).b == 0 && N(childAt)) {
                max2 += D(childAt, i2, max2, i3, 0, iArr);
                i5 = Math.max(i5, childAt.getMeasuredHeight() + t(childAt));
                i4 = View.combineMeasuredStates(i4, childAt.getMeasuredState());
            }
        }
        int i13 = this.u + this.v;
        int i14 = this.p + this.q;
        if (N(this.b)) {
            D(this.b, i2, max2 + i14, i3, i13, iArr);
            int measuredWidth = this.b.getMeasuredWidth() + s(this.b);
            i8 = this.b.getMeasuredHeight() + t(this.b);
            i10 = View.combineMeasuredStates(i4, this.b.getMeasuredState());
            i9 = measuredWidth;
        } else {
            i10 = i4;
            i9 = 0;
            i8 = 0;
        }
        if (N(this.c)) {
            i9 = Math.max(i9, D(this.c, i2, max2 + i14, i3, i8 + i13, iArr));
            i8 += this.c.getMeasuredHeight() + t(this.c);
            i10 = View.combineMeasuredStates(i10, this.c.getMeasuredState());
        }
        int max3 = Math.max(i5, i8);
        int paddingLeft = max2 + i9 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i2, -16777216 & i10);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i3, i10 << 16);
        if (!M()) {
            i11 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i11);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        ActionMenuView actionMenuView = this.a;
        androidx.appcompat.view.menu.g N2 = actionMenuView != null ? actionMenuView.N() : null;
        int i2 = gVar.c;
        if (!(i2 == 0 || this.N == null || N2 == null || (findItem = N2.findItem(i2)) == null)) {
            findItem.expandActionView();
        }
        if (gVar.d) {
            F();
        }
    }

    public void onRtlPropertiesChanged(int i2) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i2);
        }
        h();
        o0 o0Var = this.w;
        boolean z2 = true;
        if (i2 != 1) {
            z2 = false;
        }
        o0Var.f(z2);
    }

    public Parcelable onSaveInstanceState() {
        i iVar;
        g gVar = new g(super.onSaveInstanceState());
        d dVar = this.N;
        if (!(dVar == null || (iVar = dVar.b) == null)) {
            gVar.c = iVar.getItemId();
        }
        gVar.d = A();
        return gVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.E = false;
        }
        if (!this.E) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.E = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.E = false;
        }
        return true;
    }

    public void setCollapseContentDescription(int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseIcon(int i2) {
        setCollapseIcon(n.d(getContext(), i2));
    }

    public void setCollapsible(boolean z2) {
        this.Q = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = C0188.f23;
        }
        if (i2 != this.y) {
            this.y = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = C0188.f23;
        }
        if (i2 != this.x) {
            this.x = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(n.d(getContext(), i2));
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(n.d(getContext(), i2));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.J = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.k != i2) {
            this.k = i2;
            if (i2 == 0) {
                this.j = getContext();
            } else {
                this.j = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitleTextColor(int i2) {
        setSubtitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitleMarginBottom(int i2) {
        this.v = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.q = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.p = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.u = i2;
        requestLayout();
    }

    public void setTitleTextColor(int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    public boolean v() {
        d dVar = this.N;
        return (dVar == null || dVar.b == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.a;
        return actionMenuView != null && actionMenuView.H();
    }

    public void x(int i2) {
        getMenuInflater().inflate(i2, getMenu());
    }

    public boolean z() {
        ActionMenuView actionMenuView = this.a;
        return actionMenuView != null && actionMenuView.I();
    }

    public static class e extends a.C0006a {
        public int b = 0;

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public e(int i, int i2) {
            super(i, i2);
            this.a = 8388627;
        }

        public e(int i, int i2, int i3) {
            super(i, i2);
            this.a = i3;
        }

        public e(e eVar) {
            super((a.C0006a) eVar);
            this.b = eVar.b;
        }

        public e(a.C0006a aVar) {
            super(aVar);
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            a(marginLayoutParams);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, defpackage.d.toolbarStyle);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.h.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.h;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!y(this.e)) {
                c(this.e, true);
            }
        } else {
            ImageView imageView = this.e;
            if (imageView != null && y(imageView)) {
                removeView(this.e);
                this.H.remove(this.e);
            }
        }
        ImageView imageView2 = this.e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!y(this.d)) {
                c(this.d, true);
            }
        } else {
            ImageButton imageButton = this.d;
            if (imageButton != null && y(imageButton)) {
                removeView(this.d);
                this.H.remove(this.d);
            }
        }
        ImageButton imageButton2 = this.d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.c == null) {
                Context context = getContext();
                z zVar = new z(context);
                this.c = zVar;
                zVar.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.m;
                if (i2 != 0) {
                    this.c.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.D;
                if (colorStateList != null) {
                    this.c.setTextColor(colorStateList);
                }
            }
            if (!y(this.c)) {
                c(this.c, true);
            }
        } else {
            TextView textView = this.c;
            if (textView != null && y(textView)) {
                removeView(this.c);
                this.H.remove(this.c);
            }
        }
        TextView textView2 = this.c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.B = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.D = colorStateList;
        TextView textView = this.c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.b == null) {
                Context context = getContext();
                z zVar = new z(context);
                this.b = zVar;
                zVar.setSingleLine();
                this.b.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.l;
                if (i2 != 0) {
                    this.b.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.C;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
            }
            if (!y(this.b)) {
                c(this.b, true);
            }
        } else {
            TextView textView = this.b;
            if (textView != null && y(textView)) {
                removeView(this.b);
                this.H.remove(this.b);
            }
        }
        TextView textView2 = this.b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.A = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.C = colorStateList;
        TextView textView = this.b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public static class g extends f4 {
        public static final Parcelable.Creator<g> CREATOR = new a();
        public int c;
        public boolean d;

        static class a implements Parcelable.ClassLoaderCreator<g> {
            /* renamed from: a */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            /* renamed from: b */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            /* renamed from: c */
            public g[] newArray(int i) {
                return new g[i];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readInt();
            this.d = parcel.readInt() != 0;
        }

        @Override // defpackage.f4
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d ? 1 : 0);
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.z = 8388627;
        this.G = new ArrayList<>();
        this.H = new ArrayList<>();
        this.I = new int[2];
        this.K = new a();
        this.R = new b();
        x0 u2 = x0.u(getContext(), attributeSet, m.Toolbar, i2, 0);
        this.l = u2.n(m.Toolbar_titleTextAppearance, 0);
        this.m = u2.n(m.Toolbar_subtitleTextAppearance, 0);
        this.z = u2.l(m.Toolbar_android_gravity, this.z);
        this.n = u2.l(m.Toolbar_buttonGravity, 48);
        int e2 = u2.e(m.Toolbar_titleMargin, 0);
        e2 = u2.r(m.Toolbar_titleMargins) ? u2.e(m.Toolbar_titleMargins, e2) : e2;
        this.v = e2;
        this.u = e2;
        this.q = e2;
        this.p = e2;
        int e3 = u2.e(m.Toolbar_titleMarginStart, -1);
        if (e3 >= 0) {
            this.p = e3;
        }
        int e4 = u2.e(m.Toolbar_titleMarginEnd, -1);
        if (e4 >= 0) {
            this.q = e4;
        }
        int e5 = u2.e(m.Toolbar_titleMarginTop, -1);
        if (e5 >= 0) {
            this.u = e5;
        }
        int e6 = u2.e(m.Toolbar_titleMarginBottom, -1);
        if (e6 >= 0) {
            this.v = e6;
        }
        this.o = u2.f(m.Toolbar_maxButtonHeight, -1);
        int e7 = u2.e(m.Toolbar_contentInsetStart, C0188.f23);
        int e8 = u2.e(m.Toolbar_contentInsetEnd, C0188.f23);
        int f2 = u2.f(m.Toolbar_contentInsetLeft, 0);
        int f3 = u2.f(m.Toolbar_contentInsetRight, 0);
        h();
        this.w.e(f2, f3);
        if (!(e7 == Integer.MIN_VALUE && e8 == Integer.MIN_VALUE)) {
            this.w.g(e7, e8);
        }
        this.x = u2.e(m.Toolbar_contentInsetStartWithNavigation, C0188.f23);
        this.y = u2.e(m.Toolbar_contentInsetEndWithActions, C0188.f23);
        this.f = u2.g(m.Toolbar_collapseIcon);
        this.g = u2.p(m.Toolbar_collapseContentDescription);
        CharSequence p2 = u2.p(m.Toolbar_title);
        if (!TextUtils.isEmpty(p2)) {
            setTitle(p2);
        }
        CharSequence p3 = u2.p(m.Toolbar_subtitle);
        if (!TextUtils.isEmpty(p3)) {
            setSubtitle(p3);
        }
        this.j = getContext();
        setPopupTheme(u2.n(m.Toolbar_popupTheme, 0));
        Drawable g2 = u2.g(m.Toolbar_navigationIcon);
        if (g2 != null) {
            setNavigationIcon(g2);
        }
        CharSequence p4 = u2.p(m.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(p4)) {
            setNavigationContentDescription(p4);
        }
        Drawable g3 = u2.g(m.Toolbar_logo);
        if (g3 != null) {
            setLogo(g3);
        }
        CharSequence p5 = u2.p(m.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(p5)) {
            setLogoDescription(p5);
        }
        if (u2.r(m.Toolbar_titleTextColor)) {
            setTitleTextColor(u2.c(m.Toolbar_titleTextColor));
        }
        if (u2.r(m.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(u2.c(m.Toolbar_subtitleTextColor));
        }
        if (u2.r(m.Toolbar_menu)) {
            x(u2.n(m.Toolbar_menu, 0));
        }
        u2.v();
    }
}
