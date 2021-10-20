package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.g;
import vigqyno.C0188;
import vigqyno.C0201;

public class ActionBarContextView extends a {
    private CharSequence i;
    private CharSequence j;
    private View k;
    private View l;
    private LinearLayout m;
    private TextView n;
    private TextView o;
    private int p;
    private int q;
    private boolean u;
    private int v;

    /* access modifiers changed from: package-private */
    public class a implements View.OnClickListener {
        public final /* synthetic */ w a;

        public a(w wVar) {
            this.a = wVar;
        }

        public void onClick(View view) {
            w30.g(view);
            try {
                this.a.c();
            } finally {
                w30.h();
            }
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    private void i() {
        if (this.m == null) {
            LayoutInflater.from(getContext()).inflate(j.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.m = linearLayout;
            this.n = (TextView) linearLayout.findViewById(i.action_bar_title);
            this.o = (TextView) this.m.findViewById(i.action_bar_subtitle);
            if (this.p != 0) {
                this.n.setTextAppearance(getContext(), this.p);
            }
            if (this.q != 0) {
                this.o.setTextAppearance(getContext(), this.q);
            }
        }
        this.n.setText(this.i);
        this.o.setText(this.j);
        boolean z = !TextUtils.isEmpty(this.i);
        boolean z2 = !TextUtils.isEmpty(this.j);
        int i2 = 0;
        this.o.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.m;
        if (!z && !z2) {
            i2 = 8;
        }
        linearLayout2.setVisibility(i2);
        if (this.m.getParent() == null) {
            addView(this.m);
        }
    }

    public void g() {
        if (this.k == null) {
            k();
        }
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.j;
    }

    public CharSequence getTitle() {
        return this.i;
    }

    public void h(w wVar) {
        View view = this.k;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.v, (ViewGroup) this, false);
            this.k = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.k);
        }
        this.k.findViewById(i.action_mode_close_button).setOnClickListener(new a(wVar));
        g gVar = (g) wVar.e();
        c cVar = this.d;
        if (cVar != null) {
            cVar.x();
        }
        c cVar2 = new c(getContext());
        this.d = cVar2;
        cVar2.I(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        gVar.c(this.d, this.b);
        ActionMenuView actionMenuView = (ActionMenuView) this.d.o(this);
        this.c = actionMenuView;
        k3.k0(actionMenuView, null);
        addView(this.c, layoutParams);
    }

    public boolean j() {
        return this.u;
    }

    public void k() {
        removeAllViews();
        this.l = null;
        this.c = null;
    }

    public boolean l() {
        c cVar = this.d;
        if (cVar != null) {
            return cVar.J();
        }
        return false;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.d;
        if (cVar != null) {
            cVar.A();
            this.d.B();
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(ActionBarContextView.class.getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.i);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        boolean b = d1.b(this);
        int paddingRight = b ? (i4 - i2) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
        View view = this.k;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.k.getLayoutParams();
            int i6 = b ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = b ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int d = a.d(paddingRight, i6, b);
            paddingRight = a.d(d + e(this.k, d, paddingTop, paddingTop2, b), i7, b);
        }
        int i8 = paddingRight;
        LinearLayout linearLayout = this.m;
        if (!(linearLayout == null || this.l != null || linearLayout.getVisibility() == 8)) {
            i8 += e(this.m, i8, paddingTop, paddingTop2, b);
        }
        View view2 = this.l;
        if (view2 != null) {
            e(view2, i8, paddingTop, paddingTop2, b);
        }
        int paddingLeft = b ? getPaddingLeft() : (i4 - i2) - getPaddingRight();
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b);
        }
    }

    public void onMeasure(int i2, int i3) {
        int i4 = 1073741824;
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new IllegalStateException(ActionBarContextView.class.getSimpleName() + C0201.m82(36842));
        } else if (View.MeasureSpec.getMode(i3) != 0) {
            int size = View.MeasureSpec.getSize(i2);
            int i5 = this.e;
            if (i5 <= 0) {
                i5 = View.MeasureSpec.getSize(i3);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i6 = i5 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, C0188.f23);
            View view = this.k;
            if (view != null) {
                int c = c(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.k.getLayoutParams();
                paddingLeft = c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.c;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = c(this.c, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.m;
            if (linearLayout != null && this.l == null) {
                if (this.u) {
                    this.m.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.m.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.m.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.l;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i7 = layoutParams.width != -2 ? 1073741824 : C0188.f23;
                int i8 = layoutParams.width;
                if (i8 >= 0) {
                    paddingLeft = Math.min(i8, paddingLeft);
                }
                if (layoutParams.height == -2) {
                    i4 = C0188.f23;
                }
                int i9 = layoutParams.height;
                if (i9 >= 0) {
                    i6 = Math.min(i9, i6);
                }
                this.l.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i7), View.MeasureSpec.makeMeasureSpec(i6, i4));
            }
            if (this.e <= 0) {
                int childCount = getChildCount();
                int i10 = 0;
                for (int i11 = 0; i11 < childCount; i11++) {
                    int measuredHeight = getChildAt(i11).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i10) {
                        i10 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i10);
                return;
            }
            setMeasuredDimension(size, i5);
        } else {
            throw new IllegalStateException(ActionBarContextView.class.getSimpleName() + C0201.m82(36841));
        }
    }

    @Override // androidx.appcompat.widget.a
    public void setContentHeight(int i2) {
        this.e = i2;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.l;
        if (view2 != null) {
            removeView(view2);
        }
        this.l = view;
        if (!(view == null || (linearLayout = this.m) == null)) {
            removeView(linearLayout);
            this.m = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.j = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.i = charSequence;
        i();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.u) {
            requestLayout();
        }
        this.u = z;
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ void setVisibility(int i2) {
        super.setVisibility(i2);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        x0 u2 = x0.u(context, attributeSet, m.ActionMode, i2, 0);
        k3.k0(this, u2.g(m.ActionMode_background));
        this.p = u2.n(m.ActionMode_titleTextStyle, 0);
        this.q = u2.n(m.ActionMode_subtitleTextStyle, 0);
        this.e = u2.m(m.ActionMode_height, 0);
        this.v = u2.n(m.ActionMode_closeItemLayout, j.abc_action_mode_close_item_material);
        u2.v();
    }
}
