package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.vx1;
import vigqyno.C0201;

/* compiled from: DropdownMenuEndIconDelegate */
public class d extends e {
    private static final boolean o = (Build.VERSION.SDK_INT >= 21);
    private final TextWatcher d = new a();
    private final TextInputLayout.e e = new b(this.a);
    private final TextInputLayout.f f = new c();
    private boolean g = false;
    private boolean h = false;
    private long i = Long.MAX_VALUE;
    private StateListDrawable j;
    private rx1 k;
    private AccessibilityManager l;
    private ValueAnimator m;
    private ValueAnimator n;

    /* compiled from: DropdownMenuEndIconDelegate */
    class a implements TextWatcher {

        /* renamed from: com.google.android.material.textfield.d$a$a  reason: collision with other inner class name */
        /* compiled from: DropdownMenuEndIconDelegate */
        class RunnableC0073a implements Runnable {
            public final /* synthetic */ AutoCompleteTextView a;

            public RunnableC0073a(AutoCompleteTextView autoCompleteTextView) {
                this.a = autoCompleteTextView;
            }

            public void run() {
                boolean isPopupShowing = this.a.isPopupShowing();
                d.this.A(isPopupShowing);
                d.this.g = isPopupShowing;
            }
        }

        public a() {
        }

        public void afterTextChanged(Editable editable) {
            d dVar = d.this;
            AutoCompleteTextView v = dVar.v(dVar.a.getEditText());
            v.post(new RunnableC0073a(v));
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate */
    class b extends TextInputLayout.e {
        public b(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // defpackage.r2, com.google.android.material.textfield.TextInputLayout.e
        public void g(View view, w3 w3Var) {
            super.g(view, w3Var);
            w3Var.Z(Spinner.class.getName());
            if (w3Var.K()) {
                w3Var.j0(null);
            }
        }

        @Override // defpackage.r2
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            d dVar = d.this;
            AutoCompleteTextView v = dVar.v(dVar.a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && d.this.l.isTouchExplorationEnabled()) {
                d.this.D(v);
            }
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate */
    class c implements TextInputLayout.f {
        public c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            AutoCompleteTextView v = d.this.v(textInputLayout.getEditText());
            d.this.B(v);
            d.this.s(v);
            d.this.C(v);
            v.setThreshold(0);
            v.removeTextChangedListener(d.this.d);
            v.addTextChangedListener(d.this.d);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            textInputLayout.setTextInputAccessibilityDelegate(d.this.e);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* renamed from: com.google.android.material.textfield.d$d  reason: collision with other inner class name */
    /* compiled from: DropdownMenuEndIconDelegate */
    class View$OnClickListenerC0074d implements View.OnClickListener {
        public View$OnClickListenerC0074d() {
        }

        public void onClick(View view) {
            w30.g(view);
            try {
                d.this.D((AutoCompleteTextView) d.this.a.getEditText());
            } finally {
                w30.h();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: DropdownMenuEndIconDelegate */
    public class e implements View.OnTouchListener {
        public final /* synthetic */ AutoCompleteTextView a;

        public e(AutoCompleteTextView autoCompleteTextView) {
            this.a = autoCompleteTextView;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (d.this.z()) {
                    d.this.g = false;
                }
                d.this.D(this.a);
                view.performClick();
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: DropdownMenuEndIconDelegate */
    public class f implements View.OnFocusChangeListener {
        public f() {
        }

        public void onFocusChange(View view, boolean z) {
            d.this.a.setEndIconActivated(z);
            if (!z) {
                d.this.A(false);
                d.this.g = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: DropdownMenuEndIconDelegate */
    public class g implements AutoCompleteTextView.OnDismissListener {
        public g() {
        }

        public void onDismiss() {
            d.this.g = true;
            d.this.i = System.currentTimeMillis();
            d.this.A(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: DropdownMenuEndIconDelegate */
    public class h extends AnimatorListenerAdapter {
        public h() {
        }

        public void onAnimationEnd(Animator animator) {
            d dVar = d.this;
            dVar.c.setChecked(dVar.h);
            d.this.n.start();
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: DropdownMenuEndIconDelegate */
    public class i implements ValueAnimator.AnimatorUpdateListener {
        public i() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            d.this.c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public d(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void A(boolean z) {
        if (this.h != z) {
            this.h = z;
            this.n.cancel();
            this.m.start();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void B(AutoCompleteTextView autoCompleteTextView) {
        if (o) {
            int boxBackgroundMode = this.a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.k);
            } else if (boxBackgroundMode == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.j);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void C(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new e(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(new f());
        if (o) {
            autoCompleteTextView.setOnDismissListener(new g());
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void D(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView != null) {
            if (z()) {
                this.g = false;
            }
            if (!this.g) {
                if (o) {
                    A(!this.h);
                } else {
                    this.h = !this.h;
                    this.c.toggle();
                }
                if (this.h) {
                    autoCompleteTextView.requestFocus();
                    autoCompleteTextView.showDropDown();
                    return;
                }
                autoCompleteTextView.dismissDropDown();
                return;
            }
            this.g = false;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void s(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView.getKeyListener() == null) {
            int boxBackgroundMode = this.a.getBoxBackgroundMode();
            rx1 boxBackground = this.a.getBoxBackground();
            int c2 = uw1.c(autoCompleteTextView, nv1.colorControlHighlight);
            int[][] iArr = {new int[]{16842919}, new int[0]};
            if (boxBackgroundMode == 2) {
                u(autoCompleteTextView, c2, iArr, boxBackground);
            } else if (boxBackgroundMode == 1) {
                t(autoCompleteTextView, c2, iArr, boxBackground);
            }
        }
    }

    private void t(AutoCompleteTextView autoCompleteTextView, int i2, int[][] iArr, rx1 rx1) {
        int boxBackgroundColor = this.a.getBoxBackgroundColor();
        int[] iArr2 = {uw1.f(i2, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (o) {
            k3.k0(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), rx1, rx1));
            return;
        }
        rx1 rx12 = new rx1(rx1.B());
        rx12.V(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{rx1, rx12});
        int B = k3.B(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int A = k3.A(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        k3.k0(autoCompleteTextView, layerDrawable);
        k3.u0(autoCompleteTextView, B, paddingTop, A, paddingBottom);
    }

    private void u(AutoCompleteTextView autoCompleteTextView, int i2, int[][] iArr, rx1 rx1) {
        LayerDrawable layerDrawable;
        int c2 = uw1.c(autoCompleteTextView, nv1.colorSurface);
        rx1 rx12 = new rx1(rx1.B());
        int f2 = uw1.f(i2, c2, 0.1f);
        rx12.V(new ColorStateList(iArr, new int[]{f2, 0}));
        if (o) {
            rx12.setTint(c2);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{f2, c2});
            rx1 rx13 = new rx1(rx1.B());
            rx13.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, rx12, rx13), rx1});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{rx12, rx1});
        }
        k3.k0(autoCompleteTextView, layerDrawable);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private AutoCompleteTextView v(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException(C0201.m82(36059));
    }

    private ValueAnimator w(int i2, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(yv1.a);
        ofFloat.setDuration((long) i2);
        ofFloat.addUpdateListener(new i());
        return ofFloat;
    }

    private rx1 x(float f2, float f3, float f4, int i2) {
        vx1.b a2 = vx1.a();
        a2.z(f2);
        a2.D(f2);
        a2.r(f3);
        a2.v(f3);
        vx1 m2 = a2.m();
        rx1 l2 = rx1.l(this.b, f4);
        l2.setShapeAppearanceModel(m2);
        l2.X(0, i2, 0, i2);
        return l2;
    }

    private void y() {
        this.n = w(67, 0.0f, 1.0f);
        ValueAnimator w = w(50, 1.0f, 0.0f);
        this.m = w;
        w.addListener(new h());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean z() {
        long currentTimeMillis = System.currentTimeMillis() - this.i;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    @Override // com.google.android.material.textfield.e
    public void a() {
        float dimensionPixelOffset = (float) this.b.getResources().getDimensionPixelOffset(pv1.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = (float) this.b.getResources().getDimensionPixelOffset(pv1.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.b.getResources().getDimensionPixelOffset(pv1.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        rx1 x = x(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        rx1 x2 = x(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.k = x;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.j = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, x);
        this.j.addState(new int[0], x2);
        this.a.setEndIconDrawable(n.d(this.b, o ? qv1.mtrl_dropdown_arrow : qv1.mtrl_ic_arrow_drop_down));
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(vv1.exposed_dropdown_menu_content_description));
        this.a.setEndIconOnClickListener(new View$OnClickListenerC0074d());
        this.a.e(this.f);
        y();
        k3.q0(this.c, 2);
        this.l = (AccessibilityManager) this.b.getSystemService(C0201.m82(36060));
    }

    @Override // com.google.android.material.textfield.e
    public boolean b(int i2) {
        return i2 != 0;
    }

    @Override // com.google.android.material.textfield.e
    public boolean d() {
        return true;
    }
}
