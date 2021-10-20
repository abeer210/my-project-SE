package com.cmcewen.blurview;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.k0;
import java.util.Objects;
import vigqyno.C0201;

public class BlurViewManager extends ViewGroupManager<xu2> {
    private static final String REACT_CLASS = null;
    private static final int defaultRadius = 0;
    private static final int defaultSampling = 0;

    static {
        C0201.m83(BlurViewManager.class, 315);
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return C0201.m82(10327);
    }

    @xj0(customType = "Color", name = "overlayColor")
    public void setColor(xu2 xu2, int i) {
        xu2.c(i);
        xu2.invalidate();
    }

    @xj0(defaultInt = 10, name = "downsampleFactor")
    public void setDownsampleFactor(xu2 xu2, int i) {
    }

    @xj0(defaultInt = 10, name = "blurRadius")
    public void setRadius(xu2 xu2, int i) {
        xu2.b((float) i);
        xu2.invalidate();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public xu2 createViewInstance(k0 k0Var) {
        xu2 xu2 = new xu2(k0Var);
        View decorView = ((Activity) Objects.requireNonNull(k0Var.getCurrentActivity())).getWindow().getDecorView();
        xu2.d((ViewGroup) decorView.findViewById(16908290)).c(decorView.getBackground()).h(new cv2(k0Var)).g(10.0f).d(false);
        return xu2;
    }
}
