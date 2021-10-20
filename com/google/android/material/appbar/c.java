package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: ViewOffsetBehavior */
public class c<V extends View> extends CoordinatorLayout.c<V> {
    private d a;
    private int b = 0;
    private int c = 0;

    public c() {
    }

    public int E() {
        d dVar = this.a;
        if (dVar != null) {
            return dVar.b();
        }
        return 0;
    }

    public void F(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.N(v, i);
    }

    public boolean G(int i) {
        d dVar = this.a;
        if (dVar != null) {
            return dVar.e(i);
        }
        this.b = i;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v, int i) {
        F(coordinatorLayout, v, i);
        if (this.a == null) {
            this.a = new d(v);
        }
        this.a.c();
        this.a.a();
        int i2 = this.b;
        if (i2 != 0) {
            this.a.e(i2);
            this.b = 0;
        }
        int i3 = this.c;
        if (i3 == 0) {
            return true;
        }
        this.a.d(i3);
        this.c = 0;
        return true;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
