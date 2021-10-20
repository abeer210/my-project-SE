package com.reactnativenavigation.views;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

@SuppressLint({"ViewConstructor"})
/* compiled from: ExternalComponentLayout */
public class h extends CoordinatorLayout implements e {
    public h(Context context) {
        super(context);
    }

    @Override // com.reactnativenavigation.views.k
    public boolean b() {
        return getChildCount() >= 1;
    }
}
