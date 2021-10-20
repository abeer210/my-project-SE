package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.internal.f;
import com.google.android.material.internal.g;
import java.lang.ref.WeakReference;
import vigqyno.C0201;

/* renamed from: jw1  reason: default package */
/* compiled from: BadgeDrawable */
public class jw1 extends Drawable implements f.b {
    private static final int q = wv1.Widget_MaterialComponents_Badge;
    private static final int u = nv1.badgeStyle;
    private final WeakReference<Context> a;
    private final rx1 b = new rx1();
    private final f c;
    private final Rect d = new Rect();
    private final float e;
    private final float f;
    private final float g;
    private final a h;
    private float i;
    private float j;
    private int k;
    private float l;
    private float m;
    private float n;
    private WeakReference<View> o;
    private WeakReference<ViewGroup> p;

    private jw1(Context context) {
        this.a = new WeakReference<>(context);
        g.c(context);
        Resources resources = context.getResources();
        this.e = (float) resources.getDimensionPixelSize(pv1.mtrl_badge_radius);
        this.g = (float) resources.getDimensionPixelSize(pv1.mtrl_badge_long_text_horizontal_padding);
        this.f = (float) resources.getDimensionPixelSize(pv1.mtrl_badge_with_text_radius);
        f fVar = new f(this);
        this.c = fVar;
        fVar.e().setTextAlign(Paint.Align.CENTER);
        this.h = new a(context);
        t(wv1.TextAppearance_MaterialComponents_Badge);
    }

    private void b(Context context, Rect rect, View view) {
        float f2;
        float f3;
        int i2 = this.h.h;
        if (i2 == 8388691 || i2 == 8388693) {
            this.j = (float) (rect.bottom - this.h.j);
        } else {
            this.j = (float) (rect.top + this.h.j);
        }
        if (i() <= 9) {
            float f4 = !j() ? this.e : this.f;
            this.l = f4;
            this.n = f4;
            this.m = f4;
        } else {
            float f5 = this.f;
            this.l = f5;
            this.n = f5;
            this.m = (this.c.f(f()) / 2.0f) + this.g;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(j() ? pv1.mtrl_badge_text_horizontal_edge_offset : pv1.mtrl_badge_horizontal_edge_offset);
        int i3 = this.h.h;
        if (i3 == 8388659 || i3 == 8388691) {
            if (k3.w(view) == 0) {
                f2 = (((float) rect.left) - this.m) + ((float) dimensionPixelSize) + ((float) this.h.i);
            } else {
                f2 = ((((float) rect.right) + this.m) - ((float) dimensionPixelSize)) - ((float) this.h.i);
            }
            this.i = f2;
            return;
        }
        if (k3.w(view) == 0) {
            f3 = ((((float) rect.right) + this.m) - ((float) dimensionPixelSize)) - ((float) this.h.i);
        } else {
            f3 = (((float) rect.left) - this.m) + ((float) dimensionPixelSize) + ((float) this.h.i);
        }
        this.i = f3;
    }

    public static jw1 c(Context context) {
        return d(context, null, u, q);
    }

    private static jw1 d(Context context, AttributeSet attributeSet, int i2, int i3) {
        jw1 jw1 = new jw1(context);
        jw1.k(context, attributeSet, i2, i3);
        return jw1;
    }

    private void e(Canvas canvas) {
        Rect rect = new Rect();
        String f2 = f();
        this.c.e().getTextBounds(f2, 0, f2.length(), rect);
        canvas.drawText(f2, this.i, this.j + ((float) (rect.height() / 2)), this.c.e());
    }

    private String f() {
        if (i() <= this.k) {
            return Integer.toString(i());
        }
        Context context = this.a.get();
        if (context == null) {
            return C0201.m82(27397);
        }
        return context.getString(vv1.mtrl_exceed_max_badge_number_suffix, Integer.valueOf(this.k), C0201.m82(27398));
    }

    private void k(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray h2 = g.h(context, attributeSet, xv1.Badge, i2, i3, new int[0]);
        q(h2.getInt(xv1.Badge_maxCharacterCount, 4));
        if (h2.hasValue(xv1.Badge_number)) {
            r(h2.getInt(xv1.Badge_number, 0));
        }
        m(l(context, h2, xv1.Badge_backgroundColor));
        if (h2.hasValue(xv1.Badge_badgeTextColor)) {
            o(l(context, h2, xv1.Badge_badgeTextColor));
        }
        n(h2.getInt(xv1.Badge_badgeGravity, 8388661));
        p(h2.getDimensionPixelOffset(xv1.Badge_horizontalOffset, 0));
        u(h2.getDimensionPixelOffset(xv1.Badge_verticalOffset, 0));
        h2.recycle();
    }

    private static int l(Context context, TypedArray typedArray, int i2) {
        return dx1.a(context, typedArray, i2).getDefaultColor();
    }

    private void s(ex1 ex1) {
        Context context;
        if (this.c.d() != ex1 && (context = this.a.get()) != null) {
            this.c.h(ex1, context);
            w();
        }
    }

    private void t(int i2) {
        Context context = this.a.get();
        if (context != null) {
            s(new ex1(context, i2));
        }
    }

    private void w() {
        Context context = this.a.get();
        WeakReference<View> weakReference = this.o;
        ViewGroup viewGroup = null;
        View view = weakReference != null ? weakReference.get() : null;
        if (context != null && view != null) {
            Rect rect = new Rect();
            rect.set(this.d);
            Rect rect2 = new Rect();
            view.getDrawingRect(rect2);
            WeakReference<ViewGroup> weakReference2 = this.p;
            if (weakReference2 != null) {
                viewGroup = weakReference2.get();
            }
            if (viewGroup != null || kw1.a) {
                if (viewGroup == null) {
                    viewGroup = (ViewGroup) view.getParent();
                }
                viewGroup.offsetDescendantRectToMyCoords(view, rect2);
            }
            b(context, rect2, view);
            kw1.d(this.d, this.i, this.j, this.m, this.n);
            this.b.T(this.l);
            if (!rect.equals(this.d)) {
                this.b.setBounds(this.d);
            }
        }
    }

    private void x() {
        double h2 = (double) h();
        Double.isNaN(h2);
        this.k = ((int) Math.pow(10.0d, h2 - 1.0d)) - 1;
    }

    @Override // com.google.android.material.internal.f.b
    public void a() {
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.b.draw(canvas);
            if (j()) {
                e(canvas);
            }
        }
    }

    public CharSequence g() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (!j()) {
            return this.h.f;
        }
        if (this.h.g <= 0 || (context = this.a.get()) == null) {
            return null;
        }
        return context.getResources().getQuantityString(this.h.g, i(), Integer.valueOf(i()));
    }

    public int getAlpha() {
        return this.h.c;
    }

    public int getIntrinsicHeight() {
        return this.d.height();
    }

    public int getIntrinsicWidth() {
        return this.d.width();
    }

    public int getOpacity() {
        return -3;
    }

    public int h() {
        return this.h.e;
    }

    public int i() {
        if (!j()) {
            return 0;
        }
        return this.h.d;
    }

    public boolean isStateful() {
        return false;
    }

    public boolean j() {
        return this.h.d != -1;
    }

    public void m(int i2) {
        this.h.a = i2;
        ColorStateList valueOf = ColorStateList.valueOf(i2);
        if (this.b.w() != valueOf) {
            this.b.V(valueOf);
            invalidateSelf();
        }
    }

    public void n(int i2) {
        if (this.h.h != i2) {
            this.h.h = i2;
            WeakReference<View> weakReference = this.o;
            if (weakReference != null && weakReference.get() != null) {
                View view = this.o.get();
                WeakReference<ViewGroup> weakReference2 = this.p;
                v(view, weakReference2 != null ? weakReference2.get() : null);
            }
        }
    }

    public void o(int i2) {
        this.h.b = i2;
        if (this.c.e().getColor() != i2) {
            this.c.e().setColor(i2);
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.internal.f.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public void p(int i2) {
        this.h.i = i2;
        w();
    }

    public void q(int i2) {
        if (this.h.e != i2) {
            this.h.e = i2;
            x();
            this.c.i(true);
            w();
            invalidateSelf();
        }
    }

    public void r(int i2) {
        int max = Math.max(0, i2);
        if (this.h.d != max) {
            this.h.d = max;
            this.c.i(true);
            w();
            invalidateSelf();
        }
    }

    public void setAlpha(int i2) {
        this.h.c = i2;
        this.c.e().setAlpha(i2);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void u(int i2) {
        this.h.j = i2;
        w();
    }

    public void v(View view, ViewGroup viewGroup) {
        this.o = new WeakReference<>(view);
        this.p = new WeakReference<>(viewGroup);
        w();
        invalidateSelf();
    }

    /* renamed from: jw1$a */
    /* compiled from: BadgeDrawable */
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0148a();
        private int a;
        private int b;
        private int c = 255;
        private int d = -1;
        private int e;
        private CharSequence f;
        private int g;
        private int h;
        private int i;
        private int j;

        /* renamed from: jw1$a$a  reason: collision with other inner class name */
        /* compiled from: BadgeDrawable */
        static class C0148a implements Parcelable.Creator<a> {
            /* renamed from: a */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            /* renamed from: b */
            public a[] newArray(int i) {
                return new a[i];
            }
        }

        public a(Context context) {
            this.b = new ex1(context, wv1.TextAppearance_MaterialComponents_Badge).b.getDefaultColor();
            this.f = context.getString(vv1.mtrl_badge_numberless_content_description);
            this.g = uv1.mtrl_badge_content_description;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
            parcel.writeString(this.f.toString());
            parcel.writeInt(this.g);
            parcel.writeInt(this.h);
            parcel.writeInt(this.i);
            parcel.writeInt(this.j);
        }

        public a(Parcel parcel) {
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            this.c = parcel.readInt();
            this.d = parcel.readInt();
            this.e = parcel.readInt();
            this.f = parcel.readString();
            this.g = parcel.readInt();
            this.h = parcel.readInt();
            this.i = parcel.readInt();
            this.j = parcel.readInt();
        }
    }
}
