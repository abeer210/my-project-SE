package com.aurelhubert.ahbottomnavigation;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar$SnackbarLayout;

public class AHBottomNavigationFABBehavior extends CoordinatorLayout.c<FloatingActionButton> {
    private long a;

    private void G(FloatingActionButton floatingActionButton, View view) {
        if (floatingActionButton != null && view != null && (view instanceof Snackbar$SnackbarLayout)) {
            this.a = System.currentTimeMillis();
            floatingActionButton.setY(view.getY() - ((float) ((ViewGroup.MarginLayoutParams) floatingActionButton.getLayoutParams()).bottomMargin));
        } else if (floatingActionButton != null && view != null && (view instanceof q) && System.currentTimeMillis() - this.a >= 30) {
            floatingActionButton.setY(view.getY() - ((float) ((ViewGroup.MarginLayoutParams) floatingActionButton.getLayoutParams()).bottomMargin));
        }
    }

    /* renamed from: E */
    public boolean e(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
        if (view != null && (view instanceof Snackbar$SnackbarLayout)) {
            return true;
        }
        if (view == null || !(view instanceof q)) {
            return super.e(coordinatorLayout, floatingActionButton, view);
        }
        return true;
    }

    /* renamed from: F */
    public boolean h(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
        G(floatingActionButton, view);
        return super.h(coordinatorLayout, floatingActionButton, view);
    }
}
