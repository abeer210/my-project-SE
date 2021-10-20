package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import defpackage.l1;
import vigqyno.C0201;

/* renamed from: ex1  reason: default package */
/* compiled from: TextAppearance */
public class ex1 {
    public final float a;
    public final ColorStateList b;
    public final ColorStateList c;
    public final ColorStateList d;
    public final int e;
    public final int f;
    public final String g;
    public final ColorStateList h;
    public final float i;
    public final float j;
    public final float k;
    private final int l;
    private boolean m = false;
    private Typeface n;

    /* access modifiers changed from: package-private */
    /* renamed from: ex1$a */
    /* compiled from: TextAppearance */
    public class a extends l1.a {
        public final /* synthetic */ gx1 a;

        public a(gx1 gx1) {
            this.a = gx1;
        }

        @Override // defpackage.l1.a
        public void c(int i) {
            ex1.this.m = true;
            this.a.a(i);
        }

        @Override // defpackage.l1.a
        public void d(Typeface typeface) {
            ex1 ex1 = ex1.this;
            ex1.n = Typeface.create(typeface, ex1.e);
            ex1.this.m = true;
            this.a.b(ex1.this.n, false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ex1$b */
    /* compiled from: TextAppearance */
    public class b extends gx1 {
        public final /* synthetic */ TextPaint a;
        public final /* synthetic */ gx1 b;

        public b(TextPaint textPaint, gx1 gx1) {
            this.a = textPaint;
            this.b = gx1;
        }

        @Override // defpackage.gx1
        public void a(int i) {
            this.b.a(i);
        }

        @Override // defpackage.gx1
        public void b(Typeface typeface, boolean z) {
            ex1.this.k(this.a, typeface);
            this.b.b(typeface, z);
        }
    }

    public ex1(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, xv1.TextAppearance);
        this.a = obtainStyledAttributes.getDimension(xv1.TextAppearance_android_textSize, 0.0f);
        this.b = dx1.a(context, obtainStyledAttributes, xv1.TextAppearance_android_textColor);
        this.c = dx1.a(context, obtainStyledAttributes, xv1.TextAppearance_android_textColorHint);
        this.d = dx1.a(context, obtainStyledAttributes, xv1.TextAppearance_android_textColorLink);
        this.e = obtainStyledAttributes.getInt(xv1.TextAppearance_android_textStyle, 0);
        this.f = obtainStyledAttributes.getInt(xv1.TextAppearance_android_typeface, 1);
        int e2 = dx1.e(obtainStyledAttributes, xv1.TextAppearance_fontFamily, xv1.TextAppearance_android_fontFamily);
        this.l = obtainStyledAttributes.getResourceId(e2, 0);
        this.g = obtainStyledAttributes.getString(e2);
        obtainStyledAttributes.getBoolean(xv1.TextAppearance_textAllCaps, false);
        this.h = dx1.a(context, obtainStyledAttributes, xv1.TextAppearance_android_shadowColor);
        this.i = obtainStyledAttributes.getFloat(xv1.TextAppearance_android_shadowDx, 0.0f);
        this.j = obtainStyledAttributes.getFloat(xv1.TextAppearance_android_shadowDy, 0.0f);
        this.k = obtainStyledAttributes.getFloat(xv1.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
    }

    private void d() {
        String str;
        if (this.n == null && (str = this.g) != null) {
            this.n = Typeface.create(str, this.e);
        }
        if (this.n == null) {
            int i2 = this.f;
            if (i2 == 1) {
                this.n = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.n = Typeface.SERIF;
            } else if (i2 != 3) {
                this.n = Typeface.DEFAULT;
            } else {
                this.n = Typeface.MONOSPACE;
            }
            this.n = Typeface.create(this.n, this.e);
        }
    }

    public Typeface e() {
        d();
        return this.n;
    }

    public Typeface f(Context context) {
        if (this.m) {
            return this.n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface c2 = l1.c(context, this.l);
                this.n = c2;
                if (c2 != null) {
                    this.n = Typeface.create(c2, this.e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e2) {
                Log.d(C0201.m82(25220), C0201.m82(25219) + this.g, e2);
            }
        }
        d();
        this.m = true;
        return this.n;
    }

    public void g(Context context, TextPaint textPaint, gx1 gx1) {
        k(textPaint, e());
        h(context, new b(textPaint, gx1));
    }

    public void h(Context context, gx1 gx1) {
        if (fx1.a()) {
            f(context);
        } else {
            d();
        }
        if (this.l == 0) {
            this.m = true;
        }
        if (this.m) {
            gx1.b(this.n, true);
            return;
        }
        try {
            l1.e(context, this.l, new a(gx1), null);
        } catch (Resources.NotFoundException unused) {
            this.m = true;
            gx1.a(1);
        } catch (Exception e2) {
            Log.d(C0201.m82(25222), C0201.m82(25221) + this.g, e2);
            this.m = true;
            gx1.a(-3);
        }
    }

    public void i(Context context, TextPaint textPaint, gx1 gx1) {
        j(context, textPaint, gx1);
        ColorStateList colorStateList = this.b;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f2 = this.k;
        float f3 = this.i;
        float f4 = this.j;
        ColorStateList colorStateList2 = this.h;
        textPaint.setShadowLayer(f2, f3, f4, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void j(Context context, TextPaint textPaint, gx1 gx1) {
        if (fx1.a()) {
            k(textPaint, f(context));
        } else {
            g(context, textPaint, gx1);
        }
    }

    public void k(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int style = (typeface.getStyle() ^ -1) & this.e;
        textPaint.setFakeBoldText((style & 1) != 0);
        textPaint.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.a);
    }
}
