package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* renamed from: vx1  reason: default package */
/* compiled from: ShapeAppearanceModel */
public class vx1 {
    public ox1 a;
    public ox1 b;
    public ox1 c;
    public ox1 d;
    public nx1 e;
    public nx1 f;
    public nx1 g;
    public nx1 h;
    public qx1 i;
    public qx1 j;
    public qx1 k;
    public qx1 l;

    /* renamed from: vx1$c */
    /* compiled from: ShapeAppearanceModel */
    public interface c {
        nx1 a(nx1 nx1);
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int i2, int i3) {
        return c(context, i2, i3, 0);
    }

    private static b c(Context context, int i2, int i3, int i4) {
        return d(context, i2, i3, new lx1((float) i4));
    }

    private static b d(Context context, int i2, int i3, nx1 nx1) {
        if (i3 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i2);
            i2 = i3;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, xv1.ShapeAppearance);
        try {
            int i4 = obtainStyledAttributes.getInt(xv1.ShapeAppearance_cornerFamily, 0);
            int i5 = obtainStyledAttributes.getInt(xv1.ShapeAppearance_cornerFamilyTopLeft, i4);
            int i6 = obtainStyledAttributes.getInt(xv1.ShapeAppearance_cornerFamilyTopRight, i4);
            int i7 = obtainStyledAttributes.getInt(xv1.ShapeAppearance_cornerFamilyBottomRight, i4);
            int i8 = obtainStyledAttributes.getInt(xv1.ShapeAppearance_cornerFamilyBottomLeft, i4);
            nx1 m = m(obtainStyledAttributes, xv1.ShapeAppearance_cornerSize, nx1);
            nx1 m2 = m(obtainStyledAttributes, xv1.ShapeAppearance_cornerSizeTopLeft, m);
            nx1 m3 = m(obtainStyledAttributes, xv1.ShapeAppearance_cornerSizeTopRight, m);
            nx1 m4 = m(obtainStyledAttributes, xv1.ShapeAppearance_cornerSizeBottomRight, m);
            nx1 m5 = m(obtainStyledAttributes, xv1.ShapeAppearance_cornerSizeBottomLeft, m);
            b bVar = new b();
            bVar.x(i5, m2);
            bVar.B(i6, m3);
            bVar.t(i7, m4);
            bVar.p(i8, m5);
            return bVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int i2, int i3) {
        return f(context, attributeSet, i2, i3, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        return g(context, attributeSet, i2, i3, new lx1((float) i4));
    }

    public static b g(Context context, AttributeSet attributeSet, int i2, int i3, nx1 nx1) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xv1.MaterialShape, i2, i3);
        int resourceId = obtainStyledAttributes.getResourceId(xv1.MaterialShape_shapeAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(xv1.MaterialShape_shapeAppearanceOverlay, 0);
        obtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, nx1);
    }

    private static nx1 m(TypedArray typedArray, int i2, nx1 nx1) {
        TypedValue peekValue = typedArray.peekValue(i2);
        if (peekValue == null) {
            return nx1;
        }
        int i3 = peekValue.type;
        if (i3 == 5) {
            return new lx1((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return i3 == 6 ? new tx1(peekValue.getFraction(1.0f, 1.0f)) : nx1;
    }

    public qx1 h() {
        return this.k;
    }

    public ox1 i() {
        return this.d;
    }

    public nx1 j() {
        return this.h;
    }

    public ox1 k() {
        return this.c;
    }

    public nx1 l() {
        return this.g;
    }

    public qx1 n() {
        return this.l;
    }

    public qx1 o() {
        return this.j;
    }

    public qx1 p() {
        return this.i;
    }

    public ox1 q() {
        return this.a;
    }

    public nx1 r() {
        return this.e;
    }

    public ox1 s() {
        return this.b;
    }

    public nx1 t() {
        return this.f;
    }

    public boolean u(RectF rectF) {
        boolean z = this.l.getClass().equals(qx1.class) && this.j.getClass().equals(qx1.class) && this.i.getClass().equals(qx1.class) && this.k.getClass().equals(qx1.class);
        float a2 = this.e.a(rectF);
        boolean z2 = this.f.a(rectF) == a2 && this.h.a(rectF) == a2 && this.g.a(rectF) == a2;
        boolean z3 = (this.b instanceof ux1) && (this.a instanceof ux1) && (this.c instanceof ux1) && (this.d instanceof ux1);
        if (!z || !z2 || !z3) {
            return false;
        }
        return true;
    }

    public b v() {
        return new b(this);
    }

    public vx1 w(float f2) {
        b v = v();
        v.o(f2);
        return v.m();
    }

    public vx1 x(c cVar) {
        b v = v();
        v.A(cVar.a(r()));
        v.E(cVar.a(t()));
        v.s(cVar.a(j()));
        v.w(cVar.a(l()));
        return v.m();
    }

    private vx1(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
        this.h = bVar.h;
        this.i = bVar.i;
        this.j = bVar.j;
        this.k = bVar.k;
        this.l = bVar.l;
    }

    /* renamed from: vx1$b */
    /* compiled from: ShapeAppearanceModel */
    public static final class b {
        private ox1 a = sx1.b();
        private ox1 b = sx1.b();
        private ox1 c = sx1.b();
        private ox1 d = sx1.b();
        private nx1 e = new lx1(0.0f);
        private nx1 f = new lx1(0.0f);
        private nx1 g = new lx1(0.0f);
        private nx1 h = new lx1(0.0f);
        private qx1 i = sx1.c();
        private qx1 j = sx1.c();
        private qx1 k = sx1.c();
        private qx1 l = sx1.c();

        public b() {
        }

        private static float n(ox1 ox1) {
            if (ox1 instanceof ux1) {
                return ((ux1) ox1).a;
            }
            if (ox1 instanceof px1) {
                return ((px1) ox1).a;
            }
            return -1.0f;
        }

        public b A(nx1 nx1) {
            this.e = nx1;
            return this;
        }

        public b B(int i2, nx1 nx1) {
            C(sx1.a(i2));
            E(nx1);
            return this;
        }

        public b C(ox1 ox1) {
            this.b = ox1;
            float n = n(ox1);
            if (n != -1.0f) {
                D(n);
            }
            return this;
        }

        public b D(float f2) {
            this.f = new lx1(f2);
            return this;
        }

        public b E(nx1 nx1) {
            this.f = nx1;
            return this;
        }

        public vx1 m() {
            return new vx1(this);
        }

        public b o(float f2) {
            z(f2);
            D(f2);
            v(f2);
            r(f2);
            return this;
        }

        public b p(int i2, nx1 nx1) {
            q(sx1.a(i2));
            s(nx1);
            return this;
        }

        public b q(ox1 ox1) {
            this.d = ox1;
            float n = n(ox1);
            if (n != -1.0f) {
                r(n);
            }
            return this;
        }

        public b r(float f2) {
            this.h = new lx1(f2);
            return this;
        }

        public b s(nx1 nx1) {
            this.h = nx1;
            return this;
        }

        public b t(int i2, nx1 nx1) {
            u(sx1.a(i2));
            w(nx1);
            return this;
        }

        public b u(ox1 ox1) {
            this.c = ox1;
            float n = n(ox1);
            if (n != -1.0f) {
                v(n);
            }
            return this;
        }

        public b v(float f2) {
            this.g = new lx1(f2);
            return this;
        }

        public b w(nx1 nx1) {
            this.g = nx1;
            return this;
        }

        public b x(int i2, nx1 nx1) {
            y(sx1.a(i2));
            A(nx1);
            return this;
        }

        public b y(ox1 ox1) {
            this.a = ox1;
            float n = n(ox1);
            if (n != -1.0f) {
                z(n);
            }
            return this;
        }

        public b z(float f2) {
            this.e = new lx1(f2);
            return this;
        }

        public b(vx1 vx1) {
            this.a = vx1.a;
            this.b = vx1.b;
            this.c = vx1.c;
            this.d = vx1.d;
            this.e = vx1.e;
            this.f = vx1.f;
            this.g = vx1.g;
            this.h = vx1.h;
            this.i = vx1.i;
            this.j = vx1.j;
            this.k = vx1.k;
            this.l = vx1.l;
        }
    }

    public vx1() {
        this.a = sx1.b();
        this.b = sx1.b();
        this.c = sx1.b();
        this.d = sx1.b();
        this.e = new lx1(0.0f);
        this.f = new lx1(0.0f);
        this.g = new lx1(0.0f);
        this.h = new lx1(0.0f);
        this.i = sx1.c();
        this.j = sx1.c();
        this.k = sx1.c();
        this.l = sx1.c();
    }
}
