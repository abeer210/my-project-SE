package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import vigqyno.C0201;

/* renamed from: v6  reason: default package */
/* compiled from: ViewUtils */
public class v6 {
    private static final b7 a;
    public static final Property<View, Float> b = new a(Float.class, C0201.m82(8524));

    /* renamed from: v6$a */
    /* compiled from: ViewUtils */
    static class a extends Property<View, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(v6.c(view));
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            v6.h(view, f.floatValue());
        }
    }

    /* renamed from: v6$b */
    /* compiled from: ViewUtils */
    static class b extends Property<View, Rect> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Rect get(View view) {
            return k3.p(view);
        }

        /* renamed from: b */
        public void set(View view, Rect rect) {
            k3.n0(view, rect);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            a = new a7();
        } else if (i >= 23) {
            a = new z6();
        } else if (i >= 22) {
            a = new y6();
        } else if (i >= 21) {
            a = new x6();
        } else if (i >= 19) {
            a = new w6();
        } else {
            a = new b7();
        }
        new b(Rect.class, C0201.m82(8525));
    }

    public static void a(View view) {
        a.a(view);
    }

    public static u6 b(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new t6(view);
        }
        return s6.e(view);
    }

    public static float c(View view) {
        return a.c(view);
    }

    public static g7 d(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new f7(view);
        }
        return new e7(view.getWindowToken());
    }

    public static void e(View view) {
        a.d(view);
    }

    public static void f(View view, Matrix matrix) {
        a.e(view, matrix);
    }

    public static void g(View view, int i, int i2, int i3, int i4) {
        a.f(view, i, i2, i3, i4);
    }

    public static void h(View view, float f) {
        a.g(view, f);
    }

    public static void i(View view, int i) {
        a.h(view, i);
    }

    public static void j(View view, Matrix matrix) {
        a.i(view, matrix);
    }

    public static void k(View view, Matrix matrix) {
        a.j(view, matrix);
    }
}
