package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: ej2  reason: default package */
/* compiled from: CoordinatorLayoutUtils */
public class ej2 {
    public static CoordinatorLayout.f a() {
        return new CoordinatorLayout.f(-1, -1);
    }

    public static CoordinatorLayout.f b(CoordinatorLayout.c cVar) {
        CoordinatorLayout.f fVar = new CoordinatorLayout.f(-1, -1);
        fVar.o(cVar);
        return fVar;
    }

    public static void c(View view, int i) {
        ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) view.getLayoutParams())).bottomMargin = i + ((Integer) yj2.b(view, qd2.fab_bottom_margin, 0)).intValue();
    }
}
