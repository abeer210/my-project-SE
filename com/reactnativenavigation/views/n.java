package com.reactnativenavigation.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.reactnativenavigation.views.topbar.ScrollDIsabledBehavior;

@SuppressLint({"ViewConstructor"})
/* compiled from: StackLayout */
public class n extends CoordinatorLayout implements e {
    private String C;

    public n(Context context, yn2 yn2, String str) {
        super(context);
        this.C = str;
        d0(yn2);
    }

    private void d0(yn2 yn2) {
        View d = yn2.d(getContext(), this);
        CoordinatorLayout.f fVar = new CoordinatorLayout.f(-1, xj2.e(getContext()));
        fVar.o(new ScrollDIsabledBehavior());
        addView(d, fVar);
    }

    @Override // com.reactnativenavigation.views.k
    public boolean b() {
        if (getChildCount() < 2 || !(getChildAt(1) instanceof k) || !((k) getChildAt(1)).b()) {
            return false;
        }
        return true;
    }

    public String getStackId() {
        return this.C;
    }
}
