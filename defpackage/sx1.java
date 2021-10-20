package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.h;

/* renamed from: sx1  reason: default package */
/* compiled from: MaterialShapeUtils */
public class sx1 {
    public static ox1 a(int i) {
        if (i == 0) {
            return new ux1();
        }
        if (i != 1) {
            return b();
        }
        return new px1();
    }

    public static ox1 b() {
        return new ux1();
    }

    public static qx1 c() {
        return new qx1();
    }

    public static void d(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof rx1) {
            ((rx1) background).U(f);
        }
    }

    public static void e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof rx1) {
            f(view, (rx1) background);
        }
    }

    public static void f(View view, rx1 rx1) {
        if (rx1.N()) {
            rx1.Y(h.b(view));
        }
    }
}
