package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.z;
import androidx.core.widget.j;
import java.util.ArrayList;
import java.util.List;

/* compiled from: IndicatorViewController */
public final class f {
    private final Context a;
    private final TextInputLayout b;
    private LinearLayout c;
    private int d;
    private FrameLayout e;
    private int f;
    private Animator g;
    private final float h;
    private int i;
    private int j;
    private CharSequence k;
    private boolean l;
    private TextView m;
    private CharSequence n;
    private int o;
    private ColorStateList p;
    private CharSequence q;
    private boolean r;
    private TextView s;
    private int t;
    private ColorStateList u;
    private Typeface v;

    /* access modifiers changed from: package-private */
    /* compiled from: IndicatorViewController */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ int a;
        public final /* synthetic */ TextView b;
        public final /* synthetic */ int c;
        public final /* synthetic */ TextView d;

        public a(int i, TextView textView, int i2, TextView textView2) {
            this.a = i;
            this.b = textView;
            this.c = i2;
            this.d = textView2;
        }

        public void onAnimationEnd(Animator animator) {
            f.this.i = this.a;
            f.this.g = null;
            TextView textView = this.b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.c == 1 && f.this.m != null) {
                    f.this.m.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.d.setAlpha(1.0f);
            }
        }

        public void onAnimationStart(Animator animator) {
            TextView textView = this.d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public f(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.a = context;
        this.b = textInputLayout;
        this.h = (float) context.getResources().getDimensionPixelSize(pv1.design_textinput_caption_translate_y);
    }

    private void H(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void J(ViewGroup viewGroup, int i2) {
        if (i2 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean K(TextView textView, CharSequence charSequence) {
        return k3.O(this.b) && this.b.isEnabled() && (this.j != this.i || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    private void N(int i2, int i3, boolean z) {
        if (i2 != i3) {
            if (z) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.g = animatorSet;
                ArrayList arrayList = new ArrayList();
                h(arrayList, this.r, this.s, 2, i2, i3);
                h(arrayList, this.l, this.m, 1, i2, i3);
                zv1.a(animatorSet, arrayList);
                animatorSet.addListener(new a(i3, l(i2), i2, l(i3)));
                animatorSet.start();
            } else {
                z(i2, i3);
            }
            this.b.k0();
            this.b.o0(z);
            this.b.y0();
        }
    }

    private boolean f() {
        return (this.c == null || this.b.getEditText() == null) ? false : true;
    }

    private void h(List<Animator> list, boolean z, TextView textView, int i2, int i3, int i4) {
        if (textView != null && z) {
            if (i2 == i4 || i2 == i3) {
                list.add(i(textView, i4 == i2));
                if (i4 == i2) {
                    list.add(j(textView));
                }
            }
        }
    }

    private ObjectAnimator i(TextView textView, boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, z ? 1.0f : 0.0f);
        ofFloat.setDuration(167L);
        ofFloat.setInterpolator(yv1.a);
        return ofFloat;
    }

    private ObjectAnimator j(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.h, 0.0f);
        ofFloat.setDuration(217L);
        ofFloat.setInterpolator(yv1.d);
        return ofFloat;
    }

    private TextView l(int i2) {
        if (i2 == 1) {
            return this.m;
        }
        if (i2 != 2) {
            return null;
        }
        return this.s;
    }

    private boolean u(int i2) {
        if (i2 != 1 || this.m == null || TextUtils.isEmpty(this.k)) {
            return false;
        }
        return true;
    }

    private void z(int i2, int i3) {
        TextView l2;
        TextView l3;
        if (i2 != i3) {
            if (!(i3 == 0 || (l3 = l(i3)) == null)) {
                l3.setVisibility(0);
                l3.setAlpha(1.0f);
            }
            if (!(i2 == 0 || (l2 = l(i2)) == null)) {
                l2.setVisibility(4);
                if (i2 == 1) {
                    l2.setText((CharSequence) null);
                }
            }
            this.i = i3;
        }
    }

    public void A(CharSequence charSequence) {
        this.n = charSequence;
        TextView textView = this.m;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void B(boolean z) {
        if (this.l != z) {
            g();
            if (z) {
                z zVar = new z(this.a);
                this.m = zVar;
                zVar.setId(rv1.textinput_error);
                if (Build.VERSION.SDK_INT >= 17) {
                    this.m.setTextAlignment(5);
                }
                Typeface typeface = this.v;
                if (typeface != null) {
                    this.m.setTypeface(typeface);
                }
                C(this.o);
                D(this.p);
                A(this.n);
                this.m.setVisibility(4);
                k3.j0(this.m, 1);
                d(this.m, 0);
            } else {
                s();
                y(this.m, 0);
                this.m = null;
                this.b.k0();
                this.b.y0();
            }
            this.l = z;
        }
    }

    public void C(int i2) {
        this.o = i2;
        TextView textView = this.m;
        if (textView != null) {
            this.b.Y(textView, i2);
        }
    }

    public void D(ColorStateList colorStateList) {
        this.p = colorStateList;
        TextView textView = this.m;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void E(int i2) {
        this.t = i2;
        TextView textView = this.s;
        if (textView != null) {
            j.q(textView, i2);
        }
    }

    public void F(boolean z) {
        if (this.r != z) {
            g();
            if (z) {
                z zVar = new z(this.a);
                this.s = zVar;
                zVar.setId(rv1.textinput_helper_text);
                if (Build.VERSION.SDK_INT >= 17) {
                    this.s.setTextAlignment(5);
                }
                Typeface typeface = this.v;
                if (typeface != null) {
                    this.s.setTypeface(typeface);
                }
                this.s.setVisibility(4);
                k3.j0(this.s, 1);
                E(this.t);
                G(this.u);
                d(this.s, 1);
            } else {
                t();
                y(this.s, 1);
                this.s = null;
                this.b.k0();
                this.b.y0();
            }
            this.r = z;
        }
    }

    public void G(ColorStateList colorStateList) {
        this.u = colorStateList;
        TextView textView = this.s;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void I(Typeface typeface) {
        if (typeface != this.v) {
            this.v = typeface;
            H(this.m, typeface);
            H(this.s, typeface);
        }
    }

    public void L(CharSequence charSequence) {
        g();
        this.k = charSequence;
        this.m.setText(charSequence);
        if (this.i != 1) {
            this.j = 1;
        }
        N(this.i, this.j, K(this.m, charSequence));
    }

    public void M(CharSequence charSequence) {
        g();
        this.q = charSequence;
        this.s.setText(charSequence);
        if (this.i != 2) {
            this.j = 2;
        }
        N(this.i, this.j, K(this.s, charSequence));
    }

    public void d(TextView textView, int i2) {
        if (this.c == null && this.e == null) {
            LinearLayout linearLayout = new LinearLayout(this.a);
            this.c = linearLayout;
            linearLayout.setOrientation(0);
            this.b.addView(this.c, -1, -2);
            this.e = new FrameLayout(this.a);
            this.c.addView(this.e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.b.getEditText() != null) {
                e();
            }
        }
        if (v(i2)) {
            this.e.setVisibility(0);
            this.e.addView(textView);
            this.f++;
        } else {
            this.c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.c.setVisibility(0);
        this.d++;
    }

    public void e() {
        if (f()) {
            k3.u0(this.c, k3.B(this.b.getEditText()), 0, k3.A(this.b.getEditText()), 0);
        }
    }

    public void g() {
        Animator animator = this.g;
        if (animator != null) {
            animator.cancel();
        }
    }

    public boolean k() {
        return u(this.j);
    }

    public CharSequence m() {
        return this.n;
    }

    public CharSequence n() {
        return this.k;
    }

    public int o() {
        TextView textView = this.m;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public ColorStateList p() {
        TextView textView = this.m;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    public CharSequence q() {
        return this.q;
    }

    public int r() {
        TextView textView = this.s;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public void s() {
        this.k = null;
        g();
        if (this.i == 1) {
            if (!this.r || TextUtils.isEmpty(this.q)) {
                this.j = 0;
            } else {
                this.j = 2;
            }
        }
        N(this.i, this.j, K(this.m, null));
    }

    public void t() {
        g();
        if (this.i == 2) {
            this.j = 0;
        }
        N(this.i, this.j, K(this.s, null));
    }

    public boolean v(int i2) {
        return i2 == 0 || i2 == 1;
    }

    public boolean w() {
        return this.l;
    }

    public boolean x() {
        return this.r;
    }

    public void y(TextView textView, int i2) {
        FrameLayout frameLayout;
        if (this.c != null) {
            if (!v(i2) || (frameLayout = this.e) == null) {
                this.c.removeView(textView);
            } else {
                int i3 = this.f - 1;
                this.f = i3;
                J(frameLayout, i3);
                this.e.removeView(textView);
            }
            int i4 = this.d - 1;
            this.d = i4;
            J(this.c, i4);
        }
    }
}
