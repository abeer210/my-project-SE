package com.reactnativenavigation.views.bottomtabs;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.reactnativenavigation.views.BehaviourDelegate;
import com.reactnativenavigation.views.c;
import com.reactnativenavigation.views.d;

public class BottomTabsBehaviour extends BehaviourDelegate {
    public BottomTabsBehaviour(c cVar) {
        super(cVar);
    }

    /* renamed from: G */
    public boolean e(CoordinatorLayout coordinatorLayout, ViewGroup viewGroup, View view) {
        return view instanceof d;
    }
}
