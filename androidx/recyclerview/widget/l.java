package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ScrollbarHelper */
public class l {
    public static int a(RecyclerView.a0 a0Var, j jVar, View view, View view2, RecyclerView.o oVar, boolean z) {
        if (oVar.J() == 0 || a0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(oVar.h0(view) - oVar.h0(view2)) + 1;
        }
        return Math.min(jVar.n(), jVar.d(view2) - jVar.g(view));
    }

    public static int b(RecyclerView.a0 a0Var, j jVar, View view, View view2, RecyclerView.o oVar, boolean z, boolean z2) {
        int i;
        if (oVar.J() == 0 || a0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(oVar.h0(view), oVar.h0(view2));
        int max = Math.max(oVar.h0(view), oVar.h0(view2));
        if (z2) {
            i = Math.max(0, (a0Var.b() - max) - 1);
        } else {
            i = Math.max(0, min);
        }
        if (!z) {
            return i;
        }
        return Math.round((((float) i) * (((float) Math.abs(jVar.d(view2) - jVar.g(view))) / ((float) (Math.abs(oVar.h0(view) - oVar.h0(view2)) + 1)))) + ((float) (jVar.m() - jVar.g(view))));
    }

    public static int c(RecyclerView.a0 a0Var, j jVar, View view, View view2, RecyclerView.o oVar, boolean z) {
        if (oVar.J() == 0 || a0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return a0Var.b();
        }
        return (int) ((((float) (jVar.d(view2) - jVar.g(view))) / ((float) (Math.abs(oVar.h0(view) - oVar.h0(view2)) + 1))) * ((float) a0Var.b()));
    }
}
