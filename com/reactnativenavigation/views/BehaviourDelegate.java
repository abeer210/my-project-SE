package com.reactnativenavigation.views;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class BehaviourDelegate extends CoordinatorLayout.c<ViewGroup> {
    private c a;

    public BehaviourDelegate(c cVar) {
        this.a = cVar;
    }

    /* renamed from: E */
    public boolean h(CoordinatorLayout coordinatorLayout, ViewGroup viewGroup, View view) {
        return this.a.c(coordinatorLayout, viewGroup, view);
    }

    /* renamed from: F */
    public boolean m(CoordinatorLayout coordinatorLayout, ViewGroup viewGroup, int i, int i2, int i3, int i4) {
        return this.a.b(coordinatorLayout, viewGroup, i, i2, i3, i4);
    }
}
