package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.e0;
import androidx.appcompat.widget.x0;
import androidx.appcompat.widget.z;
import androidx.core.widget.j;
import com.google.android.material.internal.CheckableImageButton;
import defpackage.vx1;
import java.util.Iterator;
import java.util.LinkedHashSet;
import vigqyno.C0201;

public class TextInputLayout extends LinearLayout {
    private static final int K0 = wv1.Widget_Design_TextInputLayout;
    private final TextView A;
    private final int A0;
    private boolean B;
    private final int B0;
    private CharSequence C;
    private final int C0;
    private boolean D;
    private int D0;
    private rx1 E;
    private boolean E0;
    private rx1 F;
    public final com.google.android.material.internal.a F0;
    private vx1 G;
    private boolean G0;
    private final int H;
    private ValueAnimator H0;
    private int I;
    private boolean I0;
    private final int J;
    private boolean J0;
    private int K;
    private final int L;
    private final int M;
    private int N;
    private int O;
    private final Rect P;
    private final Rect Q;
    private final RectF R;
    private Typeface S;
    private final CheckableImageButton T;
    private ColorStateList U;
    private boolean V;
    private PorterDuff.Mode W;
    private final FrameLayout a;
    private boolean a0;
    private final LinearLayout b;
    private Drawable b0;
    private final LinearLayout c;
    private int c0;
    private final FrameLayout d;
    private View.OnLongClickListener d0;
    public EditText e;
    private final LinkedHashSet<f> e0;
    private CharSequence f;
    private int f0;
    private final f g;
    private final SparseArray<e> g0;
    public boolean h;
    private final CheckableImageButton h0;
    private int i;
    private final LinkedHashSet<g> i0;
    private boolean j;
    private ColorStateList j0;
    private TextView k;
    private boolean k0;
    private int l;
    private PorterDuff.Mode l0;
    private int m;
    private boolean m0;
    private CharSequence n;
    private Drawable n0;
    private boolean o;
    private int o0;
    private TextView p;
    private Drawable p0;
    private ColorStateList q;
    private View.OnLongClickListener q0;
    private final CheckableImageButton r0;
    private ColorStateList s0;
    private ColorStateList t0;
    private int u;
    private ColorStateList u0;
    private ColorStateList v;
    private int v0;
    private ColorStateList w;
    private int w0;
    private CharSequence x;
    private int x0;
    private final TextView y;
    private ColorStateList y0;
    private CharSequence z;
    private int z0;

    /* access modifiers changed from: package-private */
    public class a implements TextWatcher {
        public a() {
        }

        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.o0(!textInputLayout.J0);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.h) {
                textInputLayout2.g0(editable.length());
            }
            if (TextInputLayout.this.o) {
                TextInputLayout.this.s0(editable.length());
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    class b implements Runnable {
        public b() {
        }

        public void run() {
            TextInputLayout.this.h0.performClick();
            TextInputLayout.this.h0.jumpDrawablesToCurrentState();
        }
    }

    class c implements Runnable {
        public c() {
        }

        public void run() {
            TextInputLayout.this.e.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.F0.Q(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class e extends r2 {
        private final TextInputLayout d;

        public e(TextInputLayout textInputLayout) {
            this.d = textInputLayout;
        }

        @Override // defpackage.r2
        public void g(View view, w3 w3Var) {
            super.g(view, w3Var);
            EditText editText = this.d.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.d.getHint();
            CharSequence helperText = this.d.getHelperText();
            CharSequence error = this.d.getError();
            int counterMaxLength = this.d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.d.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !TextUtils.isEmpty(helperText);
            boolean z4 = !TextUtils.isEmpty(error);
            boolean z5 = z4 || !TextUtils.isEmpty(counterOverflowDescription);
            CharSequence r11 = C0201.m82(31674);
            String charSequence = z2 ? hint.toString() : r11;
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence);
            String r12 = C0201.m82(31675);
            sb.append(((z4 || z3) && !TextUtils.isEmpty(charSequence)) ? r12 : r11);
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            if (z4) {
                helperText = error;
            } else if (!z3) {
                helperText = r11;
            }
            sb3.append((Object) helperText);
            String sb4 = sb3.toString();
            if (z) {
                w3Var.y0(text);
            } else if (!TextUtils.isEmpty(sb4)) {
                w3Var.y0(sb4);
            }
            if (!TextUtils.isEmpty(sb4)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    w3Var.j0(sb4);
                } else {
                    if (z) {
                        sb4 = ((Object) text) + r12 + sb4;
                    }
                    w3Var.y0(sb4);
                }
                w3Var.v0(!z);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            w3Var.l0(counterMaxLength);
            if (z5) {
                if (!z4) {
                    error = counterOverflowDescription;
                }
                w3Var.f0(error);
            }
        }
    }

    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    public interface g {
        void a(TextInputLayout textInputLayout, int i);
    }

    /* access modifiers changed from: package-private */
    public static class h extends f4 {
        public static final Parcelable.Creator<h> CREATOR = new a();
        public CharSequence c;
        public boolean d;

        static class a implements Parcelable.ClassLoaderCreator<h> {
            /* renamed from: a */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            /* renamed from: b */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            /* renamed from: c */
            public h[] newArray(int i) {
                return new h[i];
            }
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return C0201.m82(31776) + Integer.toHexString(System.identityHashCode(this)) + C0201.m82(31777) + ((Object) this.c) + C0201.m82(31778);
        }

        @Override // defpackage.f4
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.c, parcel, i);
            parcel.writeInt(this.d ? 1 : 0);
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.d = parcel.readInt() != 1 ? false : true;
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, nv1.textInputStyle);
    }

    private void A() {
        Iterator<f> it = this.e0.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    private void B(int i2) {
        Iterator<g> it = this.i0.iterator();
        while (it.hasNext()) {
            it.next().a(this, i2);
        }
    }

    private void C(Canvas canvas) {
        rx1 rx1 = this.F;
        if (rx1 != null) {
            Rect bounds = rx1.getBounds();
            bounds.top = bounds.bottom - this.K;
            this.F.draw(canvas);
        }
    }

    private void D(Canvas canvas) {
        if (this.B) {
            this.F0.i(canvas);
        }
    }

    private void E(boolean z2) {
        ValueAnimator valueAnimator = this.H0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.H0.cancel();
        }
        if (!z2 || !this.G0) {
            this.F0.Q(0.0f);
        } else {
            h(0.0f);
        }
        if (z() && ((c) this.E).h0()) {
            x();
        }
        this.E0 = true;
        I();
        u0();
        x0();
    }

    private int F(int i2, boolean z2) {
        int compoundPaddingLeft = i2 + this.e.getCompoundPaddingLeft();
        return (this.x == null || z2) ? compoundPaddingLeft : (compoundPaddingLeft - this.y.getMeasuredWidth()) + this.y.getPaddingLeft();
    }

    private int G(int i2, boolean z2) {
        int compoundPaddingRight = i2 - this.e.getCompoundPaddingRight();
        return (this.x == null || !z2) ? compoundPaddingRight : compoundPaddingRight + this.y.getMeasuredWidth() + this.y.getPaddingRight();
    }

    private boolean H() {
        return this.f0 != 0;
    }

    private void I() {
        TextView textView = this.p;
        if (textView != null && this.o) {
            textView.setText((CharSequence) null);
            this.p.setVisibility(4);
        }
    }

    private boolean K() {
        return this.r0.getVisibility() == 0;
    }

    private boolean O() {
        if (this.I != 1 || (Build.VERSION.SDK_INT >= 16 && this.e.getMinLines() > 1)) {
            return false;
        }
        return true;
    }

    private void Q() {
        o();
        U();
        y0();
        if (this.I != 0) {
            n0();
        }
    }

    private void R() {
        if (z()) {
            RectF rectF = this.R;
            this.F0.k(rectF, this.e.getWidth(), this.e.getGravity());
            k(rectF);
            rectF.offset((float) (-getPaddingLeft()), 0.0f);
            ((c) this.E).n0(rectF);
        }
    }

    private static void S(ViewGroup viewGroup, boolean z2) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            childAt.setEnabled(z2);
            if (childAt instanceof ViewGroup) {
                S((ViewGroup) childAt, z2);
            }
        }
    }

    private void T() {
        TextView textView = this.p;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void U() {
        if (b0()) {
            k3.k0(this.e, this.E);
        }
    }

    private static void V(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean I2 = k3.I(checkableImageButton);
        boolean z2 = false;
        int i2 = 1;
        boolean z3 = onLongClickListener != null;
        if (I2 || z3) {
            z2 = true;
        }
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(I2);
        checkableImageButton.setPressable(I2);
        checkableImageButton.setLongClickable(z3);
        if (!z2) {
            i2 = 2;
        }
        k3.q0(checkableImageButton, i2);
    }

    private static void W(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        V(checkableImageButton, onLongClickListener);
    }

    private static void X(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        V(checkableImageButton, onLongClickListener);
    }

    private boolean Z() {
        return (this.r0.getVisibility() == 0 || ((H() && J()) || this.z != null)) && this.c.getMeasuredWidth() > 0;
    }

    private boolean a0() {
        return !(getStartIconDrawable() == null && this.x == null) && this.b.getMeasuredWidth() > 0;
    }

    private boolean b0() {
        EditText editText = this.e;
        return (editText == null || this.E == null || editText.getBackground() != null || this.I == 0) ? false : true;
    }

    private void c0() {
        TextView textView = this.p;
        if (textView != null && this.o) {
            textView.setText(this.n);
            this.p.setVisibility(0);
            this.p.bringToFront();
        }
    }

    private void d0(boolean z2) {
        if (!z2 || getEndIconDrawable() == null) {
            l();
            return;
        }
        Drawable mutate = androidx.core.graphics.drawable.a.r(getEndIconDrawable()).mutate();
        androidx.core.graphics.drawable.a.n(mutate, this.g.o());
        this.h0.setImageDrawable(mutate);
    }

    private void e0(Rect rect) {
        rx1 rx1 = this.F;
        if (rx1 != null) {
            int i2 = rect.bottom;
            rx1.setBounds(rect.left, i2 - this.M, rect.right, i2);
        }
    }

    private void f0() {
        if (this.k != null) {
            EditText editText = this.e;
            g0(editText == null ? 0 : editText.getText().length());
        }
    }

    private void g() {
        TextView textView = this.p;
        if (textView != null) {
            this.a.addView(textView);
            this.p.setVisibility(0);
        }
    }

    private e getEndIconDelegate() {
        e eVar = this.g0.get(this.f0);
        return eVar != null ? eVar : this.g0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.r0.getVisibility() == 0) {
            return this.r0;
        }
        if (!H() || !J()) {
            return null;
        }
        return this.h0;
    }

    private static void h0(Context context, TextView textView, int i2, int i3, boolean z2) {
        textView.setContentDescription(context.getString(z2 ? vv1.character_counter_overflowed_content_description : vv1.character_counter_content_description, Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    private void i() {
        rx1 rx1 = this.E;
        if (rx1 != null) {
            rx1.setShapeAppearanceModel(this.G);
            if (v()) {
                this.E.a0((float) this.K, this.N);
            }
            int p2 = p();
            this.O = p2;
            this.E.V(ColorStateList.valueOf(p2));
            if (this.f0 == 3) {
                this.e.getBackground().invalidateSelf();
            }
            j();
            invalidate();
        }
    }

    private void i0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.k;
        if (textView != null) {
            Y(textView, this.j ? this.l : this.m);
            if (!this.j && (colorStateList2 = this.v) != null) {
                this.k.setTextColor(colorStateList2);
            }
            if (this.j && (colorStateList = this.w) != null) {
                this.k.setTextColor(colorStateList);
            }
        }
    }

    private void j() {
        if (this.F != null) {
            if (w()) {
                this.F.V(ColorStateList.valueOf(this.N));
            }
            invalidate();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d5  */
    private boolean j0() {
        boolean z2;
        if (this.e == null) {
            return false;
        }
        boolean z3 = true;
        if (a0()) {
            int measuredWidth = this.b.getMeasuredWidth() - this.e.getPaddingLeft();
            if (this.b0 == null || this.c0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.b0 = colorDrawable;
                this.c0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] a2 = j.a(this.e);
            Drawable drawable = a2[0];
            Drawable drawable2 = this.b0;
            if (drawable != drawable2) {
                j.l(this.e, drawable2, a2[1], a2[2], a2[3]);
            }
            z2 = false;
            if (Z()) {
                int measuredWidth2 = this.A.getMeasuredWidth() - this.e.getPaddingRight();
                CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
                if (endIconToUpdateDummyDrawable != null) {
                    measuredWidth2 = measuredWidth2 + endIconToUpdateDummyDrawable.getMeasuredWidth() + x2.b((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams());
                }
                Drawable[] a3 = j.a(this.e);
                Drawable drawable3 = this.n0;
                if (drawable3 == null || this.o0 == measuredWidth2) {
                    if (this.n0 == null) {
                        ColorDrawable colorDrawable2 = new ColorDrawable();
                        this.n0 = colorDrawable2;
                        this.o0 = measuredWidth2;
                        colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                    }
                    Drawable drawable4 = a3[2];
                    Drawable drawable5 = this.n0;
                    if (drawable4 != drawable5) {
                        this.p0 = a3[2];
                        j.l(this.e, a3[0], a3[1], drawable5, a3[3]);
                    } else {
                        z3 = z2;
                    }
                } else {
                    this.o0 = measuredWidth2;
                    drawable3.setBounds(0, 0, measuredWidth2, 1);
                    j.l(this.e, a3[0], a3[1], this.n0, a3[3]);
                }
            } else if (this.n0 == null) {
                return z2;
            } else {
                Drawable[] a4 = j.a(this.e);
                if (a4[2] == this.n0) {
                    j.l(this.e, a4[0], a4[1], this.p0, a4[3]);
                } else {
                    z3 = z2;
                }
                this.n0 = null;
            }
            return z3;
        }
        if (this.b0 != null) {
            Drawable[] a5 = j.a(this.e);
            j.l(this.e, null, a5[1], a5[2], a5[3]);
            this.b0 = null;
        }
        z2 = false;
        if (Z()) {
        }
        return z3;
        z2 = true;
        if (Z()) {
        }
        return z3;
    }

    private void k(RectF rectF) {
        float f2 = rectF.left;
        int i2 = this.H;
        rectF.left = f2 - ((float) i2);
        rectF.top -= (float) i2;
        rectF.right += (float) i2;
        rectF.bottom += (float) i2;
    }

    private void l() {
        m(this.h0, this.k0, this.j0, this.m0, this.l0);
    }

    private boolean l0() {
        int max;
        if (this.e == null || this.e.getMeasuredHeight() >= (max = Math.max(this.c.getMeasuredHeight(), this.b.getMeasuredHeight()))) {
            return false;
        }
        this.e.setMinimumHeight(max);
        return true;
    }

    private void m(CheckableImageButton checkableImageButton, boolean z2, ColorStateList colorStateList, boolean z3, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z2 || z3)) {
            drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
            if (z2) {
                androidx.core.graphics.drawable.a.o(drawable, colorStateList);
            }
            if (z3) {
                androidx.core.graphics.drawable.a.p(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    private void m0(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int colorForState = colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
            Drawable mutate = androidx.core.graphics.drawable.a.r(drawable).mutate();
            androidx.core.graphics.drawable.a.o(mutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    private void n() {
        m(this.T, this.V, this.U, this.a0, this.W);
    }

    private void n0() {
        if (this.I != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.a.getLayoutParams();
            int u2 = u();
            if (u2 != layoutParams.topMargin) {
                layoutParams.topMargin = u2;
                this.a.requestLayout();
            }
        }
    }

    private void o() {
        int i2 = this.I;
        if (i2 == 0) {
            this.E = null;
            this.F = null;
        } else if (i2 == 1) {
            this.E = new rx1(this.G);
            this.F = new rx1();
        } else if (i2 == 2) {
            if (!this.B || (this.E instanceof c)) {
                this.E = new rx1(this.G);
            } else {
                this.E = new c(this.G);
            }
            this.F = null;
        } else {
            throw new IllegalArgumentException(this.I + C0201.m82(3807));
        }
    }

    private int p() {
        return this.I == 1 ? uw1.e(uw1.d(this, nv1.colorSurface, 0), this.O) : this.O;
    }

    private void p0(boolean z2, boolean z3) {
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.e;
        boolean z4 = true;
        boolean z5 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.e;
        if (editText2 == null || !editText2.hasFocus()) {
            z4 = false;
        }
        boolean k2 = this.g.k();
        ColorStateList colorStateList2 = this.t0;
        if (colorStateList2 != null) {
            this.F0.G(colorStateList2);
            this.F0.M(this.t0);
        }
        if (!isEnabled) {
            this.F0.G(ColorStateList.valueOf(this.D0));
            this.F0.M(ColorStateList.valueOf(this.D0));
        } else if (k2) {
            this.F0.G(this.g.p());
        } else if (this.j && (textView = this.k) != null) {
            this.F0.G(textView.getTextColors());
        } else if (z4 && (colorStateList = this.u0) != null) {
            this.F0.G(colorStateList);
        }
        if (z5 || (isEnabled() && (z4 || k2))) {
            if (z3 || this.E0) {
                y(z2);
            }
        } else if (z3 || !this.E0) {
            E(z2);
        }
    }

    private Rect q(Rect rect) {
        if (this.e != null) {
            Rect rect2 = this.Q;
            boolean z2 = k3.w(this) == 1;
            rect2.bottom = rect.bottom;
            int i2 = this.I;
            if (i2 == 1) {
                rect2.left = F(rect.left, z2);
                rect2.top = rect.top + this.J;
                rect2.right = G(rect.right, z2);
                return rect2;
            } else if (i2 != 2) {
                rect2.left = rect.left + this.e.getCompoundPaddingLeft();
                rect2.top = getPaddingTop();
                rect2.right = rect.right - this.e.getCompoundPaddingRight();
                return rect2;
            } else {
                rect2.left = rect.left + this.e.getPaddingLeft();
                rect2.top = rect.top - u();
                rect2.right = rect.right - this.e.getPaddingRight();
                return rect2;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    private void q0() {
        EditText editText;
        if (this.p != null && (editText = this.e) != null) {
            this.p.setGravity((editText.getGravity() & -113) | 48);
            this.p.setPadding(this.e.getCompoundPaddingLeft(), this.e.getCompoundPaddingTop(), this.e.getCompoundPaddingRight(), this.e.getCompoundPaddingBottom());
        }
    }

    private int r(Rect rect, Rect rect2, float f2) {
        if (this.I == 1) {
            return (int) (((float) rect2.top) + f2);
        }
        return rect.bottom - this.e.getCompoundPaddingBottom();
    }

    private void r0() {
        EditText editText = this.e;
        s0(editText == null ? 0 : editText.getText().length());
    }

    private int s(Rect rect, float f2) {
        if (O()) {
            return (int) (((float) rect.centerY()) - (f2 / 2.0f));
        }
        return rect.top + this.e.getCompoundPaddingTop();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void s0(int i2) {
        if (i2 != 0 || this.E0) {
            I();
        } else {
            c0();
        }
    }

    private void setEditText(EditText editText) {
        if (this.e == null) {
            if (this.f0 != 3 && !(editText instanceof TextInputEditText)) {
                Log.i(C0201.m82(3808), C0201.m82(3809));
            }
            this.e = editText;
            Q();
            setTextInputAccessibilityDelegate(new e(this));
            this.F0.W(this.e.getTypeface());
            this.F0.O(this.e.getTextSize());
            int gravity = this.e.getGravity();
            this.F0.H((gravity & -113) | 48);
            this.F0.N(gravity);
            this.e.addTextChangedListener(new a());
            if (this.t0 == null) {
                this.t0 = this.e.getHintTextColors();
            }
            if (this.B) {
                if (TextUtils.isEmpty(this.C)) {
                    CharSequence hint = this.e.getHint();
                    this.f = hint;
                    setHint(hint);
                    this.e.setHint((CharSequence) null);
                }
                this.D = true;
            }
            if (this.k != null) {
                g0(this.e.getText().length());
            }
            k0();
            this.g.e();
            this.b.bringToFront();
            this.c.bringToFront();
            this.d.bringToFront();
            this.r0.bringToFront();
            A();
            t0();
            w0();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            p0(false, true);
            return;
        }
        throw new IllegalArgumentException(C0201.m82(3810));
    }

    private void setErrorIconVisible(boolean z2) {
        int i2 = 0;
        this.r0.setVisibility(z2 ? 0 : 8);
        FrameLayout frameLayout = this.d;
        if (z2) {
            i2 = 8;
        }
        frameLayout.setVisibility(i2);
        w0();
        if (!H()) {
            j0();
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.C)) {
            this.C = charSequence;
            this.F0.U(charSequence);
            if (!this.E0) {
                R();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z2) {
        if (this.o != z2) {
            if (z2) {
                z zVar = new z(getContext());
                this.p = zVar;
                zVar.setId(rv1.textinput_placeholder);
                k3.j0(this.p, 1);
                setPlaceholderTextAppearance(this.u);
                setPlaceholderTextColor(this.q);
                g();
            } else {
                T();
                this.p = null;
            }
            this.o = z2;
        }
    }

    private Rect t(Rect rect) {
        if (this.e != null) {
            Rect rect2 = this.Q;
            float s = this.F0.s();
            rect2.left = rect.left + this.e.getCompoundPaddingLeft();
            rect2.top = s(rect, s);
            rect2.right = rect.right - this.e.getCompoundPaddingRight();
            rect2.bottom = r(rect, rect2, s);
            return rect2;
        }
        throw new IllegalStateException();
    }

    private void t0() {
        if (this.e != null) {
            this.y.setPadding(P() ? 0 : this.e.getPaddingLeft(), this.e.getCompoundPaddingTop(), this.y.getCompoundPaddingRight(), this.e.getCompoundPaddingBottom());
        }
    }

    private int u() {
        float m2;
        if (!this.B) {
            return 0;
        }
        int i2 = this.I;
        if (i2 == 0 || i2 == 1) {
            m2 = this.F0.m();
        } else if (i2 != 2) {
            return 0;
        } else {
            m2 = this.F0.m() / 2.0f;
        }
        return (int) m2;
    }

    private void u0() {
        this.y.setVisibility((this.x == null || M()) ? 8 : 0);
        j0();
    }

    private boolean v() {
        return this.I == 2 && w();
    }

    private void v0(boolean z2, boolean z3) {
        int defaultColor = this.y0.getDefaultColor();
        int colorForState = this.y0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.y0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z2) {
            this.N = colorForState2;
        } else if (z3) {
            this.N = colorForState;
        } else {
            this.N = defaultColor;
        }
    }

    private boolean w() {
        return this.K > -1 && this.N != 0;
    }

    private void w0() {
        if (this.e != null) {
            TextView textView = this.A;
            textView.setPadding(textView.getPaddingLeft(), this.e.getPaddingTop(), (J() || K()) ? 0 : this.e.getPaddingRight(), this.e.getPaddingBottom());
        }
    }

    private void x() {
        if (z()) {
            ((c) this.E).k0();
        }
    }

    private void x0() {
        int visibility = this.A.getVisibility();
        int i2 = 0;
        boolean z2 = this.z != null && !M();
        TextView textView = this.A;
        if (!z2) {
            i2 = 8;
        }
        textView.setVisibility(i2);
        if (visibility != this.A.getVisibility()) {
            getEndIconDelegate().c(z2);
        }
        j0();
    }

    private void y(boolean z2) {
        ValueAnimator valueAnimator = this.H0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.H0.cancel();
        }
        if (!z2 || !this.G0) {
            this.F0.Q(1.0f);
        } else {
            h(1.0f);
        }
        this.E0 = false;
        if (z()) {
            R();
        }
        c0();
        u0();
        x0();
    }

    private boolean z() {
        return this.B && !TextUtils.isEmpty(this.C) && (this.E instanceof c);
    }

    public boolean J() {
        return this.d.getVisibility() == 0 && this.h0.getVisibility() == 0;
    }

    public boolean L() {
        return this.g.x();
    }

    public final boolean M() {
        return this.E0;
    }

    public boolean N() {
        return this.D;
    }

    public boolean P() {
        return this.T.getVisibility() == 0;
    }

    public void Y(TextView textView, int i2) {
        boolean z2 = true;
        try {
            j.q(textView, i2);
            if (Build.VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                z2 = false;
            }
        } catch (Exception unused) {
        }
        if (z2) {
            j.q(textView, wv1.TextAppearance_AppCompat_Caption);
            textView.setTextColor(androidx.core.content.b.d(getContext(), ov1.design_error));
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.a.addView(view, layoutParams2);
            this.a.setLayoutParams(layoutParams);
            n0();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i2, layoutParams);
    }

    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i2) {
        EditText editText;
        if (this.f == null || (editText = this.e) == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i2);
            return;
        }
        boolean z2 = this.D;
        this.D = false;
        CharSequence hint = editText.getHint();
        this.e.setHint(this.f);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i2);
        } finally {
            this.e.setHint(hint);
            this.D = z2;
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.J0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.J0 = false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        D(canvas);
        C(canvas);
    }

    public void drawableStateChanged() {
        if (!this.I0) {
            boolean z2 = true;
            this.I0 = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            com.google.android.material.internal.a aVar = this.F0;
            boolean T2 = aVar != null ? aVar.T(drawableState) | false : false;
            if (this.e != null) {
                if (!k3.O(this) || !isEnabled()) {
                    z2 = false;
                }
                o0(z2);
            }
            k0();
            y0();
            if (T2) {
                invalidate();
            }
            this.I0 = false;
        }
    }

    public void e(f fVar) {
        this.e0.add(fVar);
        if (this.e != null) {
            fVar.a(this);
        }
    }

    public void f(g gVar) {
        this.i0.add(gVar);
    }

    public void g0(int i2) {
        boolean z2 = this.j;
        int i3 = this.i;
        if (i3 == -1) {
            this.k.setText(String.valueOf(i2));
            this.k.setContentDescription(null);
            this.j = false;
        } else {
            this.j = i2 > i3;
            h0(getContext(), this.k, i2, this.i, this.j);
            if (z2 != this.j) {
                i0();
            }
            this.k.setText(getContext().getString(vv1.character_counter_pattern, Integer.valueOf(i2), Integer.valueOf(this.i)));
        }
        if (this.e != null && z2 != this.j) {
            o0(false);
            y0();
            k0();
        }
    }

    public int getBaseline() {
        EditText editText = this.e;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + u();
        }
        return super.getBaseline();
    }

    public rx1 getBoxBackground() {
        int i2 = this.I;
        if (i2 == 1 || i2 == 2) {
            return this.E;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.O;
    }

    public int getBoxBackgroundMode() {
        return this.I;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.E.r();
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.E.s();
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.E.F();
    }

    public float getBoxCornerRadiusTopStart() {
        return this.E.E();
    }

    public int getBoxStrokeColor() {
        return this.x0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.y0;
    }

    public int getCounterMaxLength() {
        return this.i;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.h || !this.j || (textView = this.k) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.v;
    }

    public ColorStateList getCounterTextColor() {
        return this.v;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.t0;
    }

    public EditText getEditText() {
        return this.e;
    }

    public CharSequence getEndIconContentDescription() {
        return this.h0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.h0.getDrawable();
    }

    public int getEndIconMode() {
        return this.f0;
    }

    public CheckableImageButton getEndIconView() {
        return this.h0;
    }

    public CharSequence getError() {
        if (this.g.w()) {
            return this.g.n();
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.g.m();
    }

    public int getErrorCurrentTextColors() {
        return this.g.o();
    }

    public Drawable getErrorIconDrawable() {
        return this.r0.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        return this.g.o();
    }

    public CharSequence getHelperText() {
        if (this.g.x()) {
            return this.g.q();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.g.r();
    }

    public CharSequence getHint() {
        if (this.B) {
            return this.C;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.F0.m();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.F0.p();
    }

    public ColorStateList getHintTextColor() {
        return this.u0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.h0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.h0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.o) {
            return this.n;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.u;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.q;
    }

    public CharSequence getPrefixText() {
        return this.x;
    }

    public ColorStateList getPrefixTextColor() {
        return this.y.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.y;
    }

    public CharSequence getStartIconContentDescription() {
        return this.T.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.T.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.z;
    }

    public ColorStateList getSuffixTextColor() {
        return this.A.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.A;
    }

    public Typeface getTypeface() {
        return this.S;
    }

    public void h(float f2) {
        if (this.F0.t() != f2) {
            if (this.H0 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.H0 = valueAnimator;
                valueAnimator.setInterpolator(yv1.b);
                this.H0.setDuration(167L);
                this.H0.addUpdateListener(new d());
            }
            this.H0.setFloatValues(this.F0.t(), f2);
            this.H0.start();
        }
    }

    public void k0() {
        Drawable background;
        TextView textView;
        EditText editText = this.e;
        if (editText != null && this.I == 0 && (background = editText.getBackground()) != null) {
            if (e0.a(background)) {
                background = background.mutate();
            }
            if (this.g.k()) {
                background.setColorFilter(androidx.appcompat.widget.j.e(this.g.o(), PorterDuff.Mode.SRC_IN));
            } else if (!this.j || (textView = this.k) == null) {
                androidx.core.graphics.drawable.a.c(background);
                this.e.refreshDrawableState();
            } else {
                background.setColorFilter(androidx.appcompat.widget.j.e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    public void o0(boolean z2) {
        p0(z2, false);
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        EditText editText = this.e;
        if (editText != null) {
            Rect rect = this.P;
            com.google.android.material.internal.b.a(this, editText, rect);
            e0(rect);
            if (this.B) {
                int gravity = this.e.getGravity() & -113;
                this.F0.H(gravity | 48);
                this.F0.N(gravity);
                this.F0.E(q(rect));
                this.F0.L(t(rect));
                this.F0.B();
                if (z() && !this.E0) {
                    R();
                }
            }
        }
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        boolean l02 = l0();
        boolean j02 = j0();
        if (l02 || j02) {
            this.e.post(new c());
        }
        q0();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        setError(hVar.c);
        if (hVar.d) {
            this.h0.post(new b());
        }
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        if (this.g.k()) {
            hVar.c = getError();
        }
        hVar.d = H() && this.h0.isChecked();
        return hVar;
    }

    public void setBoxBackgroundColor(int i2) {
        if (this.O != i2) {
            this.O = i2;
            this.z0 = i2;
            i();
        }
    }

    public void setBoxBackgroundColorResource(int i2) {
        setBoxBackgroundColor(androidx.core.content.b.d(getContext(), i2));
    }

    public void setBoxBackgroundMode(int i2) {
        if (i2 != this.I) {
            this.I = i2;
            if (this.e != null) {
                Q();
            }
        }
    }

    public void setBoxStrokeColor(int i2) {
        if (this.x0 != i2) {
            this.x0 = i2;
            y0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.v0 = colorStateList.getDefaultColor();
            this.D0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.w0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.x0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.x0 != colorStateList.getDefaultColor()) {
            this.x0 = colorStateList.getDefaultColor();
        }
        y0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.y0 != colorStateList) {
            this.y0 = colorStateList;
            y0();
        }
    }

    public void setCounterEnabled(boolean z2) {
        if (this.h != z2) {
            if (z2) {
                z zVar = new z(getContext());
                this.k = zVar;
                zVar.setId(rv1.textinput_counter);
                Typeface typeface = this.S;
                if (typeface != null) {
                    this.k.setTypeface(typeface);
                }
                this.k.setMaxLines(1);
                this.g.d(this.k, 2);
                x2.d((ViewGroup.MarginLayoutParams) this.k.getLayoutParams(), getResources().getDimensionPixelOffset(pv1.mtrl_textinput_counter_margin_start));
                i0();
                f0();
            } else {
                this.g.y(this.k, 2);
                this.k = null;
            }
            this.h = z2;
        }
    }

    public void setCounterMaxLength(int i2) {
        if (this.i != i2) {
            if (i2 > 0) {
                this.i = i2;
            } else {
                this.i = -1;
            }
            if (this.h) {
                f0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i2) {
        if (this.l != i2) {
            this.l = i2;
            i0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.w != colorStateList) {
            this.w = colorStateList;
            i0();
        }
    }

    public void setCounterTextAppearance(int i2) {
        if (this.m != i2) {
            this.m = i2;
            i0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.v != colorStateList) {
            this.v = colorStateList;
            i0();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.t0 = colorStateList;
        this.u0 = colorStateList;
        if (this.e != null) {
            o0(false);
        }
    }

    public void setEnabled(boolean z2) {
        S(this, z2);
        super.setEnabled(z2);
    }

    public void setEndIconActivated(boolean z2) {
        this.h0.setActivated(z2);
    }

    public void setEndIconCheckable(boolean z2) {
        this.h0.setCheckable(z2);
    }

    public void setEndIconContentDescription(int i2) {
        setEndIconContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setEndIconDrawable(int i2) {
        setEndIconDrawable(i2 != 0 ? n.d(getContext(), i2) : null);
    }

    public void setEndIconMode(int i2) {
        int i3 = this.f0;
        this.f0 = i2;
        setEndIconVisible(i2 != 0);
        if (getEndIconDelegate().b(this.I)) {
            getEndIconDelegate().a();
            l();
            B(i3);
            return;
        }
        throw new IllegalStateException(C0201.m82(3811) + this.I + C0201.m82(3812) + i2);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        W(this.h0, onClickListener, this.q0);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.q0 = onLongClickListener;
        X(this.h0, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.j0 != colorStateList) {
            this.j0 = colorStateList;
            this.k0 = true;
            l();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.l0 != mode) {
            this.l0 = mode;
            this.m0 = true;
            l();
        }
    }

    public void setEndIconVisible(boolean z2) {
        if (J() != z2) {
            this.h0.setVisibility(z2 ? 0 : 8);
            w0();
            j0();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.g.w()) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.g.L(charSequence);
        } else {
            this.g.s();
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.g.A(charSequence);
    }

    public void setErrorEnabled(boolean z2) {
        this.g.B(z2);
    }

    public void setErrorIconDrawable(int i2) {
        setErrorIconDrawable(i2 != 0 ? n.d(getContext(), i2) : null);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.s0 = colorStateList;
        Drawable drawable = this.r0.getDrawable();
        if (drawable != null) {
            drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
        }
        if (this.r0.getDrawable() != drawable) {
            this.r0.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.r0.getDrawable();
        if (drawable != null) {
            drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
            androidx.core.graphics.drawable.a.p(drawable, mode);
        }
        if (this.r0.getDrawable() != drawable) {
            this.r0.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i2) {
        this.g.C(i2);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.g.D(colorStateList);
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!L()) {
                setHelperTextEnabled(true);
            }
            this.g.M(charSequence);
        } else if (L()) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.g.G(colorStateList);
    }

    public void setHelperTextEnabled(boolean z2) {
        this.g.F(z2);
    }

    public void setHelperTextTextAppearance(int i2) {
        this.g.E(i2);
    }

    public void setHint(CharSequence charSequence) {
        if (this.B) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.G0 = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.B) {
            this.B = z2;
            if (!z2) {
                this.D = false;
                if (!TextUtils.isEmpty(this.C) && TextUtils.isEmpty(this.e.getHint())) {
                    this.e.setHint(this.C);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.C)) {
                        setHint(hint);
                    }
                    this.e.setHint((CharSequence) null);
                }
                this.D = true;
            }
            if (this.e != null) {
                n0();
            }
        }
    }

    public void setHintTextAppearance(int i2) {
        this.F0.F(i2);
        this.u0 = this.F0.l();
        if (this.e != null) {
            o0(false);
            n0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.u0 != colorStateList) {
            if (this.t0 == null) {
                this.F0.G(colorStateList);
            }
            this.u0 = colorStateList;
            if (this.e != null) {
                o0(false);
            }
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i2) {
        setPasswordVisibilityToggleContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i2) {
        setPasswordVisibilityToggleDrawable(i2 != 0 ? n.d(getContext(), i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z2) {
        if (z2 && this.f0 != 1) {
            setEndIconMode(1);
        } else if (!z2) {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.j0 = colorStateList;
        this.k0 = true;
        l();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.l0 = mode;
        this.m0 = true;
        l();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (!this.o || !TextUtils.isEmpty(charSequence)) {
            if (!this.o) {
                setPlaceholderTextEnabled(true);
            }
            this.n = charSequence;
        } else {
            setPlaceholderTextEnabled(false);
        }
        r0();
    }

    public void setPlaceholderTextAppearance(int i2) {
        this.u = i2;
        TextView textView = this.p;
        if (textView != null) {
            j.q(textView, i2);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.q != colorStateList) {
            this.q = colorStateList;
            TextView textView = this.p;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.x = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.y.setText(charSequence);
        u0();
    }

    public void setPrefixTextAppearance(int i2) {
        j.q(this.y, i2);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.y.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z2) {
        this.T.setCheckable(z2);
    }

    public void setStartIconContentDescription(int i2) {
        setStartIconContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setStartIconDrawable(int i2) {
        setStartIconDrawable(i2 != 0 ? n.d(getContext(), i2) : null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        W(this.T, onClickListener, this.d0);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.d0 = onLongClickListener;
        X(this.T, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.U != colorStateList) {
            this.U = colorStateList;
            this.V = true;
            n();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.W != mode) {
            this.W = mode;
            this.a0 = true;
            n();
        }
    }

    public void setStartIconVisible(boolean z2) {
        if (P() != z2) {
            this.T.setVisibility(z2 ? 0 : 8);
            t0();
            j0();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.z = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.A.setText(charSequence);
        x0();
    }

    public void setSuffixTextAppearance(int i2) {
        j.q(this.A, i2);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.A.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.e;
        if (editText != null) {
            k3.h0(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.S) {
            this.S = typeface;
            this.F0.W(typeface);
            this.g.I(typeface);
            TextView textView = this.k;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    public void y0() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.E != null && this.I != 0) {
            boolean z2 = false;
            boolean z3 = isFocused() || ((editText2 = this.e) != null && editText2.hasFocus());
            boolean z4 = isHovered() || ((editText = this.e) != null && editText.isHovered());
            if (!isEnabled()) {
                this.N = this.D0;
            } else if (this.g.k()) {
                if (this.y0 != null) {
                    v0(z3, z4);
                } else {
                    this.N = this.g.o();
                }
            } else if (!this.j || (textView = this.k) == null) {
                if (z3) {
                    this.N = this.x0;
                } else if (z4) {
                    this.N = this.w0;
                } else {
                    this.N = this.v0;
                }
            } else if (this.y0 != null) {
                v0(z3, z4);
            } else {
                this.N = textView.getCurrentTextColor();
            }
            if (getErrorIconDrawable() != null && this.g.w() && this.g.k()) {
                z2 = true;
            }
            setErrorIconVisible(z2);
            m0(this.r0, this.s0);
            m0(this.T, this.U);
            m0(this.h0, this.j0);
            if (getEndIconDelegate().d()) {
                d0(this.g.k());
            }
            if (!z3 || !isEnabled()) {
                this.K = this.L;
            } else {
                this.K = this.M;
            }
            if (this.I == 1) {
                if (!isEnabled()) {
                    this.O = this.A0;
                } else if (z4 && !z3) {
                    this.O = this.C0;
                } else if (z3) {
                    this.O = this.B0;
                } else {
                    this.O = this.z0;
                }
            }
            i();
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet, int i2) {
        super(ay1.c(context, attributeSet, i2, K0), attributeSet, i2);
        this.g = new f(this);
        this.P = new Rect();
        this.Q = new Rect();
        this.R = new RectF();
        this.e0 = new LinkedHashSet<>();
        this.f0 = 0;
        this.g0 = new SparseArray<>();
        this.i0 = new LinkedHashSet<>();
        this.F0 = new com.google.android.material.internal.a(this);
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        addView(this.a);
        LinearLayout linearLayout = new LinearLayout(context2);
        this.b = linearLayout;
        linearLayout.setOrientation(0);
        this.b.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        this.a.addView(this.b);
        LinearLayout linearLayout2 = new LinearLayout(context2);
        this.c = linearLayout2;
        linearLayout2.setOrientation(0);
        this.c.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        this.a.addView(this.c);
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.d = frameLayout2;
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        this.F0.V(yv1.a);
        this.F0.S(yv1.a);
        this.F0.H(8388659);
        x0 i3 = com.google.android.material.internal.g.i(context2, attributeSet, xv1.TextInputLayout, i2, K0, xv1.TextInputLayout_counterTextAppearance, xv1.TextInputLayout_counterOverflowTextAppearance, xv1.TextInputLayout_errorTextAppearance, xv1.TextInputLayout_helperTextTextAppearance, xv1.TextInputLayout_hintTextAppearance);
        this.B = i3.a(xv1.TextInputLayout_hintEnabled, true);
        setHint(i3.p(xv1.TextInputLayout_android_hint));
        this.G0 = i3.a(xv1.TextInputLayout_hintAnimationEnabled, true);
        this.G = vx1.e(context2, attributeSet, i2, K0).m();
        this.H = context2.getResources().getDimensionPixelOffset(pv1.mtrl_textinput_box_label_cutout_padding);
        this.J = i3.e(xv1.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.L = i3.f(xv1.TextInputLayout_boxStrokeWidth, context2.getResources().getDimensionPixelSize(pv1.mtrl_textinput_box_stroke_width_default));
        this.M = i3.f(xv1.TextInputLayout_boxStrokeWidthFocused, context2.getResources().getDimensionPixelSize(pv1.mtrl_textinput_box_stroke_width_focused));
        this.K = this.L;
        float d2 = i3.d(xv1.TextInputLayout_boxCornerRadiusTopStart, -1.0f);
        float d3 = i3.d(xv1.TextInputLayout_boxCornerRadiusTopEnd, -1.0f);
        float d4 = i3.d(xv1.TextInputLayout_boxCornerRadiusBottomEnd, -1.0f);
        float d5 = i3.d(xv1.TextInputLayout_boxCornerRadiusBottomStart, -1.0f);
        vx1.b v2 = this.G.v();
        if (d2 >= 0.0f) {
            v2.z(d2);
        }
        if (d3 >= 0.0f) {
            v2.D(d3);
        }
        if (d4 >= 0.0f) {
            v2.v(d4);
        }
        if (d5 >= 0.0f) {
            v2.r(d5);
        }
        this.G = v2.m();
        ColorStateList b2 = dx1.b(context2, i3, xv1.TextInputLayout_boxBackgroundColor);
        if (b2 != null) {
            int defaultColor = b2.getDefaultColor();
            this.z0 = defaultColor;
            this.O = defaultColor;
            if (b2.isStateful()) {
                this.A0 = b2.getColorForState(new int[]{-16842910}, -1);
                this.B0 = b2.getColorForState(new int[]{16842908, 16842910}, -1);
                this.C0 = b2.getColorForState(new int[]{16843623, 16842910}, -1);
            } else {
                this.B0 = this.z0;
                ColorStateList c2 = n.c(context2, ov1.mtrl_filled_background_color);
                this.A0 = c2.getColorForState(new int[]{-16842910}, -1);
                this.C0 = c2.getColorForState(new int[]{16843623}, -1);
            }
        } else {
            this.O = 0;
            this.z0 = 0;
            this.A0 = 0;
            this.B0 = 0;
            this.C0 = 0;
        }
        if (i3.r(xv1.TextInputLayout_android_textColorHint)) {
            ColorStateList c3 = i3.c(xv1.TextInputLayout_android_textColorHint);
            this.u0 = c3;
            this.t0 = c3;
        }
        ColorStateList b3 = dx1.b(context2, i3, xv1.TextInputLayout_boxStrokeColor);
        this.x0 = i3.b(xv1.TextInputLayout_boxStrokeColor, 0);
        this.v0 = androidx.core.content.b.d(context2, ov1.mtrl_textinput_default_box_stroke_color);
        this.D0 = androidx.core.content.b.d(context2, ov1.mtrl_textinput_disabled_color);
        this.w0 = androidx.core.content.b.d(context2, ov1.mtrl_textinput_hovered_box_stroke_color);
        if (b3 != null) {
            setBoxStrokeColorStateList(b3);
        }
        if (i3.r(xv1.TextInputLayout_boxStrokeErrorColor)) {
            setBoxStrokeErrorColor(dx1.b(context2, i3, xv1.TextInputLayout_boxStrokeErrorColor));
        }
        if (i3.n(xv1.TextInputLayout_hintTextAppearance, -1) != -1) {
            setHintTextAppearance(i3.n(xv1.TextInputLayout_hintTextAppearance, 0));
        }
        int n2 = i3.n(xv1.TextInputLayout_errorTextAppearance, 0);
        CharSequence p2 = i3.p(xv1.TextInputLayout_errorContentDescription);
        boolean a2 = i3.a(xv1.TextInputLayout_errorEnabled, false);
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(tv1.design_text_input_end_icon, (ViewGroup) this.c, false);
        this.r0 = checkableImageButton;
        checkableImageButton.setVisibility(8);
        if (i3.r(xv1.TextInputLayout_errorIconDrawable)) {
            setErrorIconDrawable(i3.g(xv1.TextInputLayout_errorIconDrawable));
        }
        if (i3.r(xv1.TextInputLayout_errorIconTint)) {
            setErrorIconTintList(dx1.b(context2, i3, xv1.TextInputLayout_errorIconTint));
        }
        if (i3.r(xv1.TextInputLayout_errorIconTintMode)) {
            setErrorIconTintMode(com.google.android.material.internal.h.d(i3.k(xv1.TextInputLayout_errorIconTintMode, -1), null));
        }
        this.r0.setContentDescription(getResources().getText(vv1.error_icon_content_description));
        k3.q0(this.r0, 2);
        this.r0.setClickable(false);
        this.r0.setPressable(false);
        this.r0.setFocusable(false);
        int n3 = i3.n(xv1.TextInputLayout_helperTextTextAppearance, 0);
        boolean a3 = i3.a(xv1.TextInputLayout_helperTextEnabled, false);
        CharSequence p3 = i3.p(xv1.TextInputLayout_helperText);
        int n4 = i3.n(xv1.TextInputLayout_placeholderTextAppearance, 0);
        CharSequence p4 = i3.p(xv1.TextInputLayout_placeholderText);
        int n5 = i3.n(xv1.TextInputLayout_prefixTextAppearance, 0);
        CharSequence p5 = i3.p(xv1.TextInputLayout_prefixText);
        int n6 = i3.n(xv1.TextInputLayout_suffixTextAppearance, 0);
        CharSequence p6 = i3.p(xv1.TextInputLayout_suffixText);
        boolean a4 = i3.a(xv1.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(i3.k(xv1.TextInputLayout_counterMaxLength, -1));
        this.m = i3.n(xv1.TextInputLayout_counterTextAppearance, 0);
        this.l = i3.n(xv1.TextInputLayout_counterOverflowTextAppearance, 0);
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(tv1.design_text_input_start_icon, (ViewGroup) this.b, false);
        this.T = checkableImageButton2;
        checkableImageButton2.setVisibility(8);
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        if (i3.r(xv1.TextInputLayout_startIconDrawable)) {
            setStartIconDrawable(i3.g(xv1.TextInputLayout_startIconDrawable));
            if (i3.r(xv1.TextInputLayout_startIconContentDescription)) {
                setStartIconContentDescription(i3.p(xv1.TextInputLayout_startIconContentDescription));
            }
            setStartIconCheckable(i3.a(xv1.TextInputLayout_startIconCheckable, true));
        }
        if (i3.r(xv1.TextInputLayout_startIconTint)) {
            setStartIconTintList(dx1.b(context2, i3, xv1.TextInputLayout_startIconTint));
        }
        if (i3.r(xv1.TextInputLayout_startIconTintMode)) {
            setStartIconTintMode(com.google.android.material.internal.h.d(i3.k(xv1.TextInputLayout_startIconTintMode, -1), null));
        }
        setBoxBackgroundMode(i3.k(xv1.TextInputLayout_boxBackgroundMode, 0));
        CheckableImageButton checkableImageButton3 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(tv1.design_text_input_end_icon, (ViewGroup) this.d, false);
        this.h0 = checkableImageButton3;
        this.d.addView(checkableImageButton3);
        this.h0.setVisibility(8);
        this.g0.append(-1, new b(this));
        this.g0.append(0, new g(this));
        this.g0.append(1, new h(this));
        this.g0.append(2, new a(this));
        this.g0.append(3, new d(this));
        if (i3.r(xv1.TextInputLayout_endIconMode)) {
            setEndIconMode(i3.k(xv1.TextInputLayout_endIconMode, 0));
            if (i3.r(xv1.TextInputLayout_endIconDrawable)) {
                setEndIconDrawable(i3.g(xv1.TextInputLayout_endIconDrawable));
            }
            if (i3.r(xv1.TextInputLayout_endIconContentDescription)) {
                setEndIconContentDescription(i3.p(xv1.TextInputLayout_endIconContentDescription));
            }
            setEndIconCheckable(i3.a(xv1.TextInputLayout_endIconCheckable, true));
        } else if (i3.r(xv1.TextInputLayout_passwordToggleEnabled)) {
            setEndIconMode(i3.a(xv1.TextInputLayout_passwordToggleEnabled, false) ? 1 : 0);
            setEndIconDrawable(i3.g(xv1.TextInputLayout_passwordToggleDrawable));
            setEndIconContentDescription(i3.p(xv1.TextInputLayout_passwordToggleContentDescription));
            if (i3.r(xv1.TextInputLayout_passwordToggleTint)) {
                setEndIconTintList(dx1.b(context2, i3, xv1.TextInputLayout_passwordToggleTint));
            }
            if (i3.r(xv1.TextInputLayout_passwordToggleTintMode)) {
                setEndIconTintMode(com.google.android.material.internal.h.d(i3.k(xv1.TextInputLayout_passwordToggleTintMode, -1), null));
            }
        }
        if (!i3.r(xv1.TextInputLayout_passwordToggleEnabled)) {
            if (i3.r(xv1.TextInputLayout_endIconTint)) {
                setEndIconTintList(dx1.b(context2, i3, xv1.TextInputLayout_endIconTint));
            }
            if (i3.r(xv1.TextInputLayout_endIconTintMode)) {
                setEndIconTintMode(com.google.android.material.internal.h.d(i3.k(xv1.TextInputLayout_endIconTintMode, -1), null));
            }
        }
        z zVar = new z(context2);
        this.y = zVar;
        zVar.setId(rv1.textinput_prefix_text);
        this.y.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        k3.j0(this.y, 1);
        this.b.addView(this.T);
        this.b.addView(this.y);
        z zVar2 = new z(context2);
        this.A = zVar2;
        zVar2.setId(rv1.textinput_suffix_text);
        this.A.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
        k3.j0(this.A, 1);
        this.c.addView(this.A);
        this.c.addView(this.r0);
        this.c.addView(this.d);
        setHelperTextEnabled(a3);
        setHelperText(p3);
        setHelperTextTextAppearance(n3);
        setErrorEnabled(a2);
        setErrorTextAppearance(n2);
        setErrorContentDescription(p2);
        setCounterTextAppearance(this.m);
        setCounterOverflowTextAppearance(this.l);
        setPlaceholderText(p4);
        setPlaceholderTextAppearance(n4);
        setPrefixText(p5);
        setPrefixTextAppearance(n5);
        setSuffixText(p6);
        setSuffixTextAppearance(n6);
        if (i3.r(xv1.TextInputLayout_errorTextColor)) {
            setErrorTextColor(i3.c(xv1.TextInputLayout_errorTextColor));
        }
        if (i3.r(xv1.TextInputLayout_helperTextTextColor)) {
            setHelperTextColor(i3.c(xv1.TextInputLayout_helperTextTextColor));
        }
        if (i3.r(xv1.TextInputLayout_hintTextColor)) {
            setHintTextColor(i3.c(xv1.TextInputLayout_hintTextColor));
        }
        if (i3.r(xv1.TextInputLayout_counterTextColor)) {
            setCounterTextColor(i3.c(xv1.TextInputLayout_counterTextColor));
        }
        if (i3.r(xv1.TextInputLayout_counterOverflowTextColor)) {
            setCounterOverflowTextColor(i3.c(xv1.TextInputLayout_counterOverflowTextColor));
        }
        if (i3.r(xv1.TextInputLayout_placeholderTextColor)) {
            setPlaceholderTextColor(i3.c(xv1.TextInputLayout_placeholderTextColor));
        }
        if (i3.r(xv1.TextInputLayout_prefixTextColor)) {
            setPrefixTextColor(i3.c(xv1.TextInputLayout_prefixTextColor));
        }
        if (i3.r(xv1.TextInputLayout_suffixTextColor)) {
            setSuffixTextColor(i3.c(xv1.TextInputLayout_suffixTextColor));
        }
        setCounterEnabled(a4);
        setEnabled(i3.a(xv1.TextInputLayout_android_enabled, true));
        i3.v();
        k3.q0(this, 2);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.h0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.h0.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.r0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.g.w());
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.T.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.T.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            n();
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        setStartIconContentDescription((CharSequence) null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.h0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.h0.setImageDrawable(drawable);
    }
}
