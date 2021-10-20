package com.reactnativenavigation.views;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.j4;

/* compiled from: SideMenuRoot */
public class m extends CoordinatorLayout {
    private l C;

    public m(Context context) {
        super(context);
    }

    private j4.e e0(gf2 gf2, int i) {
        return new j4.e(h0(gf2), g0(gf2), i);
    }

    private void f0() {
        this.C.setFitsSystemWindows(true);
        k3.t0(this.C, b.a);
    }

    private int g0(gf2 gf2) {
        if (gf2.d.f()) {
            return (int) TypedValue.applyDimension(1, (float) ((Integer) gf2.d.d()).intValue(), Resources.getSystem().getDisplayMetrics());
        }
        return -1;
    }

    private int h0(gf2 gf2) {
        if (gf2.e.f()) {
            return (int) TypedValue.applyDimension(1, (float) ((Integer) gf2.e.d()).intValue(), Resources.getSystem().getDisplayMetrics());
        }
        return -1;
    }

    public static /* synthetic */ t3 k0(View view, t3 t3Var) {
        return t3Var;
    }

    public void d0(l lVar, c cVar) {
        this.C = lVar;
        f0();
        addView(lVar, ej2.b(new BehaviourDelegate(cVar)));
    }

    public l getSideMenu() {
        return this.C;
    }

    public boolean i0(int i) {
        return this.C.C(i);
    }

    public boolean j0(View view) {
        return this.C == view;
    }

    public void l0(nl2 nl2, bf2 bf2) {
        this.C.addView(nl2.B(), e0(bf2.i.a, 3));
    }

    public void m0(nl2 nl2, bf2 bf2) {
        this.C.addView(nl2.B(), e0(bf2.i.b, 5));
    }

    public void setCenter(nl2 nl2) {
        this.C.addView(nl2.B());
    }
}
