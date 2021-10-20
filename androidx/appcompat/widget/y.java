package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.core.widget.b;
import androidx.core.widget.j;
import defpackage.l1;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* compiled from: AppCompatTextHelper */
public class y {
    private final TextView a;
    private v0 b;
    private v0 c;
    private v0 d;
    private v0 e;
    private v0 f;
    private v0 g;
    private v0 h;
    private final a0 i;
    private int j = 0;
    private int k = -1;
    private Typeface l;
    private boolean m;

    /* access modifiers changed from: private */
    /* compiled from: AppCompatTextHelper */
    public static class a extends l1.a {
        private final WeakReference<y> a;
        private final int b;
        private final int c;

        /* renamed from: androidx.appcompat.widget.y$a$a  reason: collision with other inner class name */
        /* compiled from: AppCompatTextHelper */
        private class RunnableC0011a implements Runnable {
            private final WeakReference<y> a;
            private final Typeface b;

            public RunnableC0011a(a aVar, WeakReference<y> weakReference, Typeface typeface) {
                this.a = weakReference;
                this.b = typeface;
            }

            public void run() {
                y yVar = this.a.get();
                if (yVar != null) {
                    yVar.B(this.b);
                }
            }
        }

        public a(y yVar, int i, int i2) {
            this.a = new WeakReference<>(yVar);
            this.b = i;
            this.c = i2;
        }

        @Override // defpackage.l1.a
        public void c(int i) {
        }

        @Override // defpackage.l1.a
        public void d(Typeface typeface) {
            int i;
            y yVar = this.a.get();
            if (yVar != null) {
                if (Build.VERSION.SDK_INT >= 28 && (i = this.b) != -1) {
                    typeface = Typeface.create(typeface, i, (this.c & 2) != 0);
                }
                yVar.q(new RunnableC0011a(this, this.a, typeface));
            }
        }
    }

    public y(TextView textView) {
        this.a = textView;
        this.i = new a0(this.a);
    }

    private void A(int i2, float f2) {
        this.i.y(i2, f2);
    }

    private void C(Context context, x0 x0Var) {
        String o;
        this.j = x0Var.k(m.TextAppearance_android_textStyle, this.j);
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 28) {
            int k2 = x0Var.k(m.TextAppearance_android_textFontWeight, -1);
            this.k = k2;
            if (k2 != -1) {
                this.j = (this.j & 2) | 0;
            }
        }
        if (x0Var.r(m.TextAppearance_android_fontFamily) || x0Var.r(m.TextAppearance_fontFamily)) {
            this.l = null;
            int i2 = x0Var.r(m.TextAppearance_fontFamily) ? m.TextAppearance_fontFamily : m.TextAppearance_android_fontFamily;
            int i3 = this.k;
            int i4 = this.j;
            if (!context.isRestricted()) {
                try {
                    Typeface j2 = x0Var.j(i2, this.j, new a(this, i3, i4));
                    if (j2 != null) {
                        if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
                            this.l = j2;
                        } else {
                            this.l = Typeface.create(Typeface.create(j2, 0), this.k, (this.j & 2) != 0);
                        }
                    }
                    this.m = this.l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.l == null && (o = x0Var.o(i2)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
                    this.l = Typeface.create(o, this.j);
                    return;
                }
                Typeface create = Typeface.create(o, 0);
                int i5 = this.k;
                if ((this.j & 2) != 0) {
                    z = true;
                }
                this.l = Typeface.create(create, i5, z);
            }
        } else if (x0Var.r(m.TextAppearance_android_typeface)) {
            this.m = false;
            int k3 = x0Var.k(m.TextAppearance_android_typeface, 1);
            if (k3 == 1) {
                this.l = Typeface.SANS_SERIF;
            } else if (k3 == 2) {
                this.l = Typeface.SERIF;
            } else if (k3 == 3) {
                this.l = Typeface.MONOSPACE;
            }
        }
    }

    private void a(Drawable drawable, v0 v0Var) {
        if (drawable != null && v0Var != null) {
            j.i(drawable, v0Var, this.a.getDrawableState());
        }
    }

    private static v0 d(Context context, j jVar, int i2) {
        ColorStateList f2 = jVar.f(context, i2);
        if (f2 == null) {
            return null;
        }
        v0 v0Var = new v0();
        v0Var.d = true;
        v0Var.a = f2;
        return v0Var;
    }

    private void x(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (Build.VERSION.SDK_INT >= 17 && (drawable5 != null || drawable6 != null)) {
            Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            TextView textView = this.a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        } else if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
            if (Build.VERSION.SDK_INT >= 17) {
                Drawable[] compoundDrawablesRelative2 = this.a.getCompoundDrawablesRelative();
                if (!(compoundDrawablesRelative2[0] == null && compoundDrawablesRelative2[2] == null)) {
                    TextView textView2 = this.a;
                    Drawable drawable7 = compoundDrawablesRelative2[0];
                    if (drawable2 == null) {
                        drawable2 = compoundDrawablesRelative2[1];
                    }
                    Drawable drawable8 = compoundDrawablesRelative2[2];
                    if (drawable4 == null) {
                        drawable4 = compoundDrawablesRelative2[3];
                    }
                    textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
                    return;
                }
            }
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            TextView textView3 = this.a;
            if (drawable == null) {
                drawable = compoundDrawables[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawables[1];
            }
            if (drawable3 == null) {
                drawable3 = compoundDrawables[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawables[3];
            }
            textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }

    private void y() {
        v0 v0Var = this.h;
        this.b = v0Var;
        this.c = v0Var;
        this.d = v0Var;
        this.e = v0Var;
        this.f = v0Var;
        this.g = v0Var;
    }

    public void B(Typeface typeface) {
        if (this.m) {
            this.a.setTypeface(typeface);
            this.l = typeface;
        }
    }

    public void b() {
        if (!(this.b == null && this.c == null && this.d == null && this.e == null)) {
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (Build.VERSION.SDK_INT < 17) {
            return;
        }
        if (this.f != null || this.g != null) {
            Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f);
            a(compoundDrawablesRelative[2], this.g);
        }
    }

    public void c() {
        this.i.b();
    }

    public int e() {
        return this.i.j();
    }

    public int f() {
        return this.i.k();
    }

    public int g() {
        return this.i.l();
    }

    public int[] h() {
        return this.i.m();
    }

    public int i() {
        return this.i.n();
    }

    public ColorStateList j() {
        v0 v0Var = this.h;
        if (v0Var != null) {
            return v0Var.a;
        }
        return null;
    }

    public PorterDuff.Mode k() {
        v0 v0Var = this.h;
        if (v0Var != null) {
            return v0Var.b;
        }
        return null;
    }

    public boolean l() {
        return this.i.s();
    }

    @SuppressLint({"NewApi"})
    public void m(AttributeSet attributeSet, int i2) {
        ColorStateList colorStateList;
        boolean z;
        boolean z2;
        ColorStateList colorStateList2;
        String str;
        ColorStateList colorStateList3;
        String str2;
        j jVar;
        int i3;
        Context context = this.a.getContext();
        j b2 = j.b();
        x0 u = x0.u(context, attributeSet, m.AppCompatTextHelper, i2, 0);
        int n = u.n(m.AppCompatTextHelper_android_textAppearance, -1);
        if (u.r(m.AppCompatTextHelper_android_drawableLeft)) {
            this.b = d(context, b2, u.n(m.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (u.r(m.AppCompatTextHelper_android_drawableTop)) {
            this.c = d(context, b2, u.n(m.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (u.r(m.AppCompatTextHelper_android_drawableRight)) {
            this.d = d(context, b2, u.n(m.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (u.r(m.AppCompatTextHelper_android_drawableBottom)) {
            this.e = d(context, b2, u.n(m.AppCompatTextHelper_android_drawableBottom, 0));
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (u.r(m.AppCompatTextHelper_android_drawableStart)) {
                this.f = d(context, b2, u.n(m.AppCompatTextHelper_android_drawableStart, 0));
            }
            if (u.r(m.AppCompatTextHelper_android_drawableEnd)) {
                this.g = d(context, b2, u.n(m.AppCompatTextHelper_android_drawableEnd, 0));
            }
        }
        u.v();
        boolean z3 = this.a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (n != -1) {
            x0 s = x0.s(context, n, m.TextAppearance);
            if (z3 || !s.r(m.TextAppearance_textAllCaps)) {
                z2 = false;
                z = false;
            } else {
                z2 = s.a(m.TextAppearance_textAllCaps, false);
                z = true;
            }
            C(context, s);
            if (Build.VERSION.SDK_INT < 23) {
                colorStateList = s.r(m.TextAppearance_android_textColor) ? s.c(m.TextAppearance_android_textColor) : null;
                colorStateList3 = s.r(m.TextAppearance_android_textColorHint) ? s.c(m.TextAppearance_android_textColorHint) : null;
                colorStateList2 = s.r(m.TextAppearance_android_textColorLink) ? s.c(m.TextAppearance_android_textColorLink) : null;
            } else {
                colorStateList3 = null;
                colorStateList2 = null;
                colorStateList = null;
            }
            str2 = s.r(m.TextAppearance_textLocale) ? s.o(m.TextAppearance_textLocale) : null;
            str = (Build.VERSION.SDK_INT < 26 || !s.r(m.TextAppearance_fontVariationSettings)) ? null : s.o(m.TextAppearance_fontVariationSettings);
            s.v();
        } else {
            str2 = null;
            colorStateList3 = null;
            str = null;
            colorStateList2 = null;
            z2 = false;
            z = false;
            colorStateList = null;
        }
        x0 u2 = x0.u(context, attributeSet, m.TextAppearance, i2, 0);
        if (!z3 && u2.r(m.TextAppearance_textAllCaps)) {
            z2 = u2.a(m.TextAppearance_textAllCaps, false);
            z = true;
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (u2.r(m.TextAppearance_android_textColor)) {
                colorStateList = u2.c(m.TextAppearance_android_textColor);
            }
            if (u2.r(m.TextAppearance_android_textColorHint)) {
                colorStateList3 = u2.c(m.TextAppearance_android_textColorHint);
            }
            if (u2.r(m.TextAppearance_android_textColorLink)) {
                colorStateList2 = u2.c(m.TextAppearance_android_textColorLink);
            }
        }
        if (u2.r(m.TextAppearance_textLocale)) {
            str2 = u2.o(m.TextAppearance_textLocale);
        }
        if (Build.VERSION.SDK_INT >= 26 && u2.r(m.TextAppearance_fontVariationSettings)) {
            str = u2.o(m.TextAppearance_fontVariationSettings);
        }
        if (Build.VERSION.SDK_INT < 28 || !u2.r(m.TextAppearance_android_textSize) || u2.f(m.TextAppearance_android_textSize, -1) != 0) {
            jVar = b2;
        } else {
            jVar = b2;
            this.a.setTextSize(0, 0.0f);
        }
        C(context, u2);
        u2.v();
        if (colorStateList != null) {
            this.a.setTextColor(colorStateList);
        }
        if (colorStateList3 != null) {
            this.a.setHintTextColor(colorStateList3);
        }
        if (colorStateList2 != null) {
            this.a.setLinkTextColor(colorStateList2);
        }
        if (!z3 && z) {
            r(z2);
        }
        Typeface typeface = this.l;
        if (typeface != null) {
            if (this.k == -1) {
                this.a.setTypeface(typeface, this.j);
            } else {
                this.a.setTypeface(typeface);
            }
        }
        if (str != null) {
            this.a.setFontVariationSettings(str);
        }
        if (str2 != null) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 24) {
                this.a.setTextLocales(LocaleList.forLanguageTags(str2));
            } else if (i4 >= 21) {
                this.a.setTextLocale(Locale.forLanguageTag(str2.substring(0, str2.indexOf(44))));
            }
        }
        this.i.t(attributeSet, i2);
        if (b.r && this.i.n() != 0) {
            int[] m2 = this.i.m();
            if (m2.length > 0) {
                if (((float) this.a.getAutoSizeStepGranularity()) != -1.0f) {
                    this.a.setAutoSizeTextTypeUniformWithConfiguration(this.i.k(), this.i.j(), this.i.l(), 0);
                } else {
                    this.a.setAutoSizeTextTypeUniformWithPresetSizes(m2, 0);
                }
            }
        }
        x0 t = x0.t(context, attributeSet, m.AppCompatTextView);
        int n2 = t.n(m.AppCompatTextView_drawableLeftCompat, -1);
        Drawable c2 = n2 != -1 ? jVar.c(context, n2) : null;
        int n3 = t.n(m.AppCompatTextView_drawableTopCompat, -1);
        Drawable c3 = n3 != -1 ? jVar.c(context, n3) : null;
        int n4 = t.n(m.AppCompatTextView_drawableRightCompat, -1);
        Drawable c4 = n4 != -1 ? jVar.c(context, n4) : null;
        int n5 = t.n(m.AppCompatTextView_drawableBottomCompat, -1);
        Drawable c5 = n5 != -1 ? jVar.c(context, n5) : null;
        int n6 = t.n(m.AppCompatTextView_drawableStartCompat, -1);
        Drawable c6 = n6 != -1 ? jVar.c(context, n6) : null;
        int n7 = t.n(m.AppCompatTextView_drawableEndCompat, -1);
        x(c2, c3, c4, c5, c6, n7 != -1 ? jVar.c(context, n7) : null);
        if (t.r(m.AppCompatTextView_drawableTint)) {
            j.j(this.a, t.c(m.AppCompatTextView_drawableTint));
        }
        if (t.r(m.AppCompatTextView_drawableTintMode)) {
            i3 = -1;
            j.k(this.a, e0.e(t.k(m.AppCompatTextView_drawableTintMode, -1), null));
        } else {
            i3 = -1;
        }
        int f2 = t.f(m.AppCompatTextView_firstBaselineToTopHeight, i3);
        int f3 = t.f(m.AppCompatTextView_lastBaselineToBottomHeight, i3);
        int f4 = t.f(m.AppCompatTextView_lineHeight, i3);
        t.v();
        if (f2 != i3) {
            j.m(this.a, f2);
        }
        if (f3 != i3) {
            j.n(this.a, f3);
        }
        if (f4 != i3) {
            j.o(this.a, f4);
        }
    }

    public void n(boolean z, int i2, int i3, int i4, int i5) {
        if (!b.r) {
            c();
        }
    }

    public void o() {
        b();
    }

    public void p(Context context, int i2) {
        String o;
        ColorStateList c2;
        x0 s = x0.s(context, i2, m.TextAppearance);
        if (s.r(m.TextAppearance_textAllCaps)) {
            r(s.a(m.TextAppearance_textAllCaps, false));
        }
        if (Build.VERSION.SDK_INT < 23 && s.r(m.TextAppearance_android_textColor) && (c2 = s.c(m.TextAppearance_android_textColor)) != null) {
            this.a.setTextColor(c2);
        }
        if (s.r(m.TextAppearance_android_textSize) && s.f(m.TextAppearance_android_textSize, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        C(context, s);
        if (Build.VERSION.SDK_INT >= 26 && s.r(m.TextAppearance_fontVariationSettings) && (o = s.o(m.TextAppearance_fontVariationSettings)) != null) {
            this.a.setFontVariationSettings(o);
        }
        s.v();
        Typeface typeface = this.l;
        if (typeface != null) {
            this.a.setTypeface(typeface, this.j);
        }
    }

    public void q(Runnable runnable) {
        this.a.post(runnable);
    }

    public void r(boolean z) {
        this.a.setAllCaps(z);
    }

    public void s(int i2, int i3, int i4, int i5) throws IllegalArgumentException {
        this.i.u(i2, i3, i4, i5);
    }

    public void t(int[] iArr, int i2) throws IllegalArgumentException {
        this.i.v(iArr, i2);
    }

    public void u(int i2) {
        this.i.w(i2);
    }

    public void v(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new v0();
        }
        v0 v0Var = this.h;
        v0Var.a = colorStateList;
        v0Var.d = colorStateList != null;
        y();
    }

    public void w(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new v0();
        }
        v0 v0Var = this.h;
        v0Var.b = mode;
        v0Var.c = mode != null;
        y();
    }

    public void z(int i2, float f2) {
        if (!b.r && !l()) {
            A(i2, f2);
        }
    }
}
