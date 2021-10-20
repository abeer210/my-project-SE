package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: kw1  reason: default package */
/* compiled from: BadgeUtils */
public class kw1 {
    public static final boolean a = (Build.VERSION.SDK_INT < 18);

    public static void a(jw1 jw1, View view, FrameLayout frameLayout) {
        c(jw1, view, frameLayout);
        if (a) {
            frameLayout.setForeground(jw1);
        } else {
            view.getOverlay().add(jw1);
        }
    }

    public static void b(jw1 jw1, View view, FrameLayout frameLayout) {
        if (jw1 != null) {
            if (a) {
                frameLayout.setForeground(null);
            } else {
                view.getOverlay().remove(jw1);
            }
        }
    }

    public static void c(jw1 jw1, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        (a ? frameLayout : view).getDrawingRect(rect);
        jw1.setBounds(rect);
        jw1.v(view, frameLayout);
    }

    public static void d(Rect rect, float f, float f2, float f3, float f4) {
        rect.set((int) (f - f3), (int) (f2 - f4), (int) (f + f3), (int) (f2 + f4));
    }
}
