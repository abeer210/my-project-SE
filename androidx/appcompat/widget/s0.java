package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;

/* compiled from: ThemeUtils */
public class s0 {
    private static final ThreadLocal<TypedValue> a = new ThreadLocal<>();
    public static final int[] b = {-16842910};
    public static final int[] c = {16842908};
    public static final int[] d = {16842919};
    public static final int[] e = {16842912};
    public static final int[] f = new int[0];
    private static final int[] g = new int[1];

    public static int a(Context context, int i) {
        ColorStateList d2 = d(context, i);
        if (d2 != null && d2.isStateful()) {
            return d2.getColorForState(b, d2.getDefaultColor());
        }
        TypedValue e2 = e();
        context.getTheme().resolveAttribute(16842803, e2, true);
        return c(context, i, e2.getFloat());
    }

    public static int b(Context context, int i) {
        int[] iArr = g;
        iArr[0] = i;
        x0 t = x0.t(context, null, iArr);
        try {
            return t.b(0, 0);
        } finally {
            t.v();
        }
    }

    public static int c(Context context, int i, float f2) {
        int b2 = b(context, i);
        return n1.o(b2, Math.round(((float) Color.alpha(b2)) * f2));
    }

    public static ColorStateList d(Context context, int i) {
        int[] iArr = g;
        iArr[0] = i;
        x0 t = x0.t(context, null, iArr);
        try {
            return t.c(0);
        } finally {
            t.v();
        }
    }

    private static TypedValue e() {
        TypedValue typedValue = a.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        a.set(typedValue2);
        return typedValue2;
    }
}
