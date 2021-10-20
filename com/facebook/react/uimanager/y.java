package com.facebook.react.uimanager;

import android.os.Bundle;
import android.view.ViewGroup;

/* compiled from: ReactRoot */
public interface y {
    void e(int i);

    Bundle getAppProperties();

    int getHeightMeasureSpec();

    String getInitialUITemplate();

    ViewGroup getRootViewGroup();

    int getRootViewTag();

    @Deprecated
    String getSurfaceID();

    int getUIManagerType();

    int getWidthMeasureSpec();

    void h();

    void setRootViewTag(int i);

    void setShouldLogContentAppeared(boolean z);
}
