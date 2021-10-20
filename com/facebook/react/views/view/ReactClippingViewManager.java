package com.facebook.react.views.view;

import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.views.view.f;

public abstract class ReactClippingViewManager<T extends f> extends ViewGroupManager<T> {
    @xj0(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(T t, boolean z) {
        UiThreadUtil.assertOnUiThread();
        t.setRemoveClippedSubviews(z);
    }

    public void addView(T t, View view, int i) {
        UiThreadUtil.assertOnUiThread();
        if (t.getRemoveClippedSubviews()) {
            t.addViewWithSubviewClippingEnabled(view, i);
        } else {
            t.addView(view, i);
        }
    }

    public View getChildAt(T t, int i) {
        if (t.getRemoveClippedSubviews()) {
            return t.getChildAtWithSubviewClippingEnabled(i);
        }
        return t.getChildAt(i);
    }

    public int getChildCount(T t) {
        if (t.getRemoveClippedSubviews()) {
            return t.getAllChildrenCount();
        }
        return t.getChildCount();
    }

    public void removeAllViews(T t) {
        UiThreadUtil.assertOnUiThread();
        if (t.getRemoveClippedSubviews()) {
            t.removeAllViewsWithSubviewClippingEnabled();
        } else {
            t.removeAllViews();
        }
    }

    public void removeViewAt(T t, int i) {
        UiThreadUtil.assertOnUiThread();
        if (t.getRemoveClippedSubviews()) {
            View childAt = getChildAt((f) t, i);
            if (childAt.getParent() != null) {
                t.removeView(childAt);
            }
            t.removeViewWithSubviewClippingEnabled(childAt);
            return;
        }
        t.removeViewAt(i);
    }
}
