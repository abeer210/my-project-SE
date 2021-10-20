package com.reactnativenavigation.views.stack;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.reactnativenavigation.views.BehaviourDelegate;
import com.reactnativenavigation.views.c;
import com.reactnativenavigation.views.i;
import com.reactnativenavigation.views.j;
import com.reactnativenavigation.views.topbar.a;

public class StackBehaviour extends BehaviourDelegate {
    public StackBehaviour(c cVar) {
        super(cVar);
    }

    /* renamed from: G */
    public boolean e(CoordinatorLayout coordinatorLayout, ViewGroup viewGroup, View view) {
        return (view instanceof a) || (view instanceof i) || (view instanceof j);
    }
}
