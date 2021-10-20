package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;

/* renamed from: uw1  reason: default package */
/* compiled from: MaterialColors */
public class uw1 {
    public static int a(Context context, int i, int i2) {
        TypedValue a = cx1.a(context, i);
        return a != null ? a.data : i2;
    }

    public static int b(Context context, int i, String str) {
        return cx1.c(context, i, str);
    }

    public static int c(View view, int i) {
        return cx1.d(view, i);
    }

    public static int d(View view, int i, int i2) {
        return a(view.getContext(), i, i2);
    }

    public static int e(int i, int i2) {
        return n1.j(i2, i);
    }

    public static int f(int i, int i2, float f) {
        return e(i, n1.o(i2, Math.round(((float) Color.alpha(i2)) * f)));
    }

    public static int g(View view, int i, int i2, float f) {
        return f(c(view, i), c(view, i2), f);
    }
}
