package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.i0;
import vigqyno.C0188;

public class ActionMenuView extends i0 implements g.b, n {
    private int A;
    private int B;
    private int C;
    public e D;
    private g p;
    private Context q;
    private int u;
    private boolean v;
    private c w;
    private m.a x;
    public g.a y;
    private boolean z;

    public interface a {
        boolean a();

        boolean c();
    }

    /* access modifiers changed from: private */
    public static class b implements m.a {
        @Override // androidx.appcompat.view.menu.m.a
        public void c(g gVar, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean d(g gVar) {
            return false;
        }
    }

    public static class c extends i0.a {
        @ViewDebug.ExportedProperty
        public boolean c;
        @ViewDebug.ExportedProperty
        public int d;
        @ViewDebug.ExportedProperty
        public int e;
        @ViewDebug.ExportedProperty
        public boolean f;
        @ViewDebug.ExportedProperty
        public boolean g;
        public boolean h;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.c = cVar.c;
        }

        public c(int i, int i2) {
            super(i, i2);
            this.c = false;
        }
    }

    /* access modifiers changed from: private */
    public class d implements g.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(g gVar, MenuItem menuItem) {
            e eVar = ActionMenuView.this.D;
            return eVar != null && eVar.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(g gVar) {
            g.a aVar = ActionMenuView.this.y;
            if (aVar != null) {
                aVar.b(gVar);
            }
        }
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public static int L(View view, int i, int i2, int i3, int i4) {
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z2 = true;
        boolean z3 = actionMenuItemView != null && actionMenuItemView.h();
        int i5 = 2;
        if (i2 <= 0 || (z3 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, C0188.f23), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z3 || i6 >= 2) {
                i5 = i6;
            }
        }
        if (cVar.c || !z3) {
            z2 = false;
        }
        cVar.f = z2;
        cVar.d = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* JADX WARN: Type inference failed for: r14v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARNING: Unknown variable types count: 1 */
    private void M(int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        int i5;
        boolean z3;
        boolean z4;
        int i6;
        ?? r14;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        int i7 = size - paddingLeft;
        int i8 = this.B;
        int i9 = i7 / i8;
        int i10 = i7 % i8;
        if (i9 == 0) {
            setMeasuredDimension(i7, 0);
            return;
        }
        int i11 = i8 + (i10 / i9);
        int childCount = getChildCount();
        int i12 = 0;
        int i13 = 0;
        boolean z5 = false;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        long j = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                boolean z6 = childAt instanceof ActionMenuItemView;
                int i17 = i14 + 1;
                if (z6) {
                    int i18 = this.C;
                    i6 = i17;
                    r14 = 0;
                    childAt.setPadding(i18, 0, i18, 0);
                } else {
                    i6 = i17;
                    r14 = 0;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.h = r14;
                int i19 = r14 == true ? 1 : 0;
                int i20 = r14 == true ? 1 : 0;
                int i21 = r14 == true ? 1 : 0;
                cVar.e = i19;
                cVar.d = r14;
                cVar.f = r14;
                ((ViewGroup.MarginLayoutParams) cVar).leftMargin = r14;
                ((ViewGroup.MarginLayoutParams) cVar).rightMargin = r14;
                cVar.g = z6 && ((ActionMenuItemView) childAt).h();
                int L = L(childAt, i11, cVar.c ? 1 : i9, childMeasureSpec, paddingTop);
                i15 = Math.max(i15, L);
                if (cVar.f) {
                    i16++;
                }
                if (cVar.c) {
                    z5 = true;
                }
                i9 -= L;
                i12 = Math.max(i12, childAt.getMeasuredHeight());
                if (L == 1) {
                    j |= (long) (1 << i13);
                    i12 = i12;
                }
                i14 = i6;
            }
            i13++;
            size2 = size2;
        }
        boolean z7 = z5 && i14 == 2;
        boolean z8 = false;
        while (true) {
            if (i16 <= 0 || i9 <= 0) {
                i5 = mode;
                i3 = i7;
                z2 = z8;
                i4 = i12;
            } else {
                int i22 = 0;
                int i23 = 0;
                int i24 = C0188.f24;
                long j2 = 0;
                while (i23 < childCount) {
                    c cVar2 = (c) getChildAt(i23).getLayoutParams();
                    if (cVar2.f) {
                        int i25 = cVar2.d;
                        if (i25 < i24) {
                            j2 = 1 << i23;
                            i24 = i25;
                            i22 = 1;
                        } else if (i25 == i24) {
                            i22++;
                            j2 |= 1 << i23;
                        }
                    }
                    i23++;
                    i12 = i12;
                    z8 = z8;
                }
                z2 = z8;
                i4 = i12;
                j |= j2;
                if (i22 > i9) {
                    i5 = mode;
                    i3 = i7;
                    break;
                }
                int i26 = i24 + 1;
                int i27 = 0;
                while (i27 < childCount) {
                    View childAt2 = getChildAt(i27);
                    c cVar3 = (c) childAt2.getLayoutParams();
                    long j3 = (long) (1 << i27);
                    if ((j2 & j3) == 0) {
                        if (cVar3.d == i26) {
                            j |= j3;
                        }
                        z4 = z7;
                    } else {
                        if (!z7 || !cVar3.g || i9 != 1) {
                            z4 = z7;
                        } else {
                            int i28 = this.C;
                            z4 = z7;
                            childAt2.setPadding(i28 + i11, 0, i28, 0);
                        }
                        cVar3.d++;
                        cVar3.h = true;
                        i9--;
                    }
                    i27++;
                    mode = mode;
                    i7 = i7;
                    z7 = z4;
                }
                i12 = i4;
                z8 = true;
            }
        }
        boolean z9 = !z5 && i14 == 1;
        if (i9 <= 0 || j == 0 || (i9 >= i14 - 1 && !z9 && i15 <= 1)) {
            z3 = z2;
        } else {
            float bitCount = (float) Long.bitCount(j);
            if (!z9) {
                if ((j & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).g) {
                    bitCount -= 0.5f;
                }
                int i29 = childCount - 1;
                if ((j & ((long) (1 << i29))) != 0 && !((c) getChildAt(i29).getLayoutParams()).g) {
                    bitCount -= 0.5f;
                }
            }
            int i30 = bitCount > 0.0f ? (int) (((float) (i9 * i11)) / bitCount) : 0;
            z3 = z2;
            for (int i31 = 0; i31 < childCount; i31++) {
                if ((j & ((long) (1 << i31))) != 0) {
                    View childAt3 = getChildAt(i31);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.e = i30;
                        cVar4.h = true;
                        if (i31 == 0 && !cVar4.g) {
                            ((ViewGroup.MarginLayoutParams) cVar4).leftMargin = (-i30) / 2;
                        }
                    } else if (cVar4.c) {
                        cVar4.e = i30;
                        cVar4.h = true;
                        ((ViewGroup.MarginLayoutParams) cVar4).rightMargin = (-i30) / 2;
                    } else {
                        if (i31 != 0) {
                            ((ViewGroup.MarginLayoutParams) cVar4).leftMargin = i30 / 2;
                        }
                        if (i31 != childCount - 1) {
                            ((ViewGroup.MarginLayoutParams) cVar4).rightMargin = i30 / 2;
                        }
                    }
                    z3 = true;
                }
            }
        }
        if (z3) {
            for (int i32 = 0; i32 < childCount; i32++) {
                View childAt4 = getChildAt(i32);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.h) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.d * i11) + cVar5.e, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i3, i5 != 1073741824 ? i4 : size2);
    }

    public void B() {
        c cVar = this.w;
        if (cVar != null) {
            cVar.x();
        }
    }

    /* renamed from: C */
    public c m() {
        c cVar = new c(-2, -2);
        cVar.b = 16;
        return cVar;
    }

    /* renamed from: D */
    public c n(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* renamed from: E */
    public c o(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return m();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (cVar.b <= 0) {
            cVar.b = 16;
        }
        return cVar;
    }

    public c F() {
        c C2 = m();
        C2.c = true;
        return C2;
    }

    public boolean G(int i) {
        boolean z2 = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof a)) {
            z2 = false | ((a) childAt).a();
        }
        return (i <= 0 || !(childAt2 instanceof a)) ? z2 : z2 | ((a) childAt2).c();
    }

    public boolean H() {
        c cVar = this.w;
        return cVar != null && cVar.A();
    }

    public boolean I() {
        c cVar = this.w;
        return cVar != null && cVar.C();
    }

    public boolean J() {
        c cVar = this.w;
        return cVar != null && cVar.D();
    }

    public boolean K() {
        return this.v;
    }

    public g N() {
        return this.p;
    }

    public void O(m.a aVar, g.a aVar2) {
        this.x = aVar;
        this.y = aVar2;
    }

    public boolean P() {
        c cVar = this.w;
        return cVar != null && cVar.J();
    }

    @Override // androidx.appcompat.view.menu.g.b
    public boolean a(i iVar) {
        return this.p.L(iVar, 0);
    }

    @Override // androidx.appcompat.view.menu.n
    public void b(g gVar) {
        this.p = gVar;
    }

    @Override // androidx.appcompat.widget.i0
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.p == null) {
            Context context = getContext();
            g gVar = new g(context);
            this.p = gVar;
            gVar.R(new d());
            c cVar = new c(context);
            this.w = cVar;
            cVar.I(true);
            c cVar2 = this.w;
            m.a aVar = this.x;
            if (aVar == null) {
                aVar = new b();
            }
            cVar2.h(aVar);
            this.p.c(this.w, this.q);
            this.w.G(this);
        }
        return this.p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.w.z();
    }

    public int getPopupTheme() {
        return this.u;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c cVar = this.w;
        if (cVar != null) {
            cVar.d(false);
            if (this.w.D()) {
                this.w.A();
                this.w.J();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        B();
    }

    @Override // androidx.appcompat.widget.i0
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (!this.z) {
            super.onLayout(z2, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean b2 = d1.b(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (G(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b2) {
                        i5 = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
                        i6 = i5 + measuredWidth;
                    } else {
                        i6 = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
                        i5 = i6 - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i5, i12, i6, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin) + ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
                    G(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        int max = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (b2) {
            int width = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.c) {
                    int i17 = width - ((ViewGroup.MarginLayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width = i17 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) cVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.c) {
                int i20 = paddingLeft + ((ViewGroup.MarginLayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = i20 + measuredWidth4 + ((ViewGroup.MarginLayoutParams) cVar3).rightMargin + max;
            }
        }
    }

    @Override // androidx.appcompat.widget.i0
    public void onMeasure(int i, int i2) {
        g gVar;
        boolean z2 = this.z;
        boolean z3 = View.MeasureSpec.getMode(i) == 1073741824;
        this.z = z3;
        if (z2 != z3) {
            this.A = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (!(!this.z || (gVar = this.p) == null || size == this.A)) {
            this.A = size;
            gVar.K(true);
        }
        int childCount = getChildCount();
        if (!this.z || childCount <= 0) {
            for (int i3 = 0; i3 < childCount; i3++) {
                c cVar = (c) getChildAt(i3).getLayoutParams();
                ((ViewGroup.MarginLayoutParams) cVar).rightMargin = 0;
                ((ViewGroup.MarginLayoutParams) cVar).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        M(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z2) {
        this.w.F(z2);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.D = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.w.H(drawable);
    }

    public void setOverflowReserved(boolean z2) {
        this.v = z2;
    }

    public void setPopupTheme(int i) {
        if (this.u != i) {
            this.u = i;
            if (i == 0) {
                this.q = getContext();
            } else {
                this.q = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(c cVar) {
        this.w = cVar;
        cVar.G(this);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.B = (int) (56.0f * f);
        this.C = (int) (f * 4.0f);
        this.q = context;
        this.u = 0;
    }
}
