package com.facebook.react.views.progressbar;

import android.content.Context;
import android.widget.ProgressBar;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.y0;
import vigqyno.C0201;

@pj0(name = "AndroidProgressBar")
public class ReactProgressBarViewManager extends BaseViewManager<a, b> implements xk0<a> {
    public static final String DEFAULT_STYLE = null;
    public static final String PROP_ANIMATING = null;
    public static final String PROP_INDETERMINATE = null;
    public static final String PROP_PROGRESS = null;
    public static final String PROP_STYLE = null;
    public static final String REACT_CLASS = null;
    private static Object sProgressBarCtorLock = new Object();
    private final y0<a> mDelegate = new wk0(this);

    static {
        C0201.m83(ReactProgressBarViewManager.class, 409);
    }

    public static ProgressBar createProgressBar(Context context, int i) {
        ProgressBar progressBar;
        synchronized (sProgressBarCtorLock) {
            progressBar = new ProgressBar(context, null, i);
        }
        return progressBar;
    }

    public static int getStyleFromString(String str) {
        if (str == null) {
            throw new JSApplicationIllegalArgumentException(C0201.m82(18523));
        } else if (str.equals(C0201.m82(18515))) {
            return 16842872;
        } else {
            if (str.equals(C0201.m82(18516))) {
                return 16842873;
            }
            if (str.equals(C0201.m82(18517))) {
                return 16842874;
            }
            if (str.equals(C0201.m82(18518))) {
                return 16843399;
            }
            if (str.equals(C0201.m82(18519))) {
                return 16843400;
            }
            if (str.equals(C0201.m82(18520))) {
                return 16843401;
            }
            if (str.equals(C0201.m82(18521))) {
                return 16842871;
            }
            throw new JSApplicationIllegalArgumentException(C0201.m82(18522) + str);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public y0<a> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return C0201.m82(18524);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<b> getShadowNodeClass() {
        return b.class;
    }

    public void setTypeAttr(a aVar, String str) {
    }

    public void updateExtraData(a aVar, Object obj) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public b createShadowNodeInstance() {
        return new b();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(k0 k0Var) {
        return new a(k0Var);
    }

    public void onAfterUpdateTransaction(a aVar) {
        aVar.a();
    }

    @xj0(name = "animating")
    public void setAnimating(a aVar, boolean z) {
        aVar.b(z);
    }

    @xj0(customType = "Color", name = "color")
    public void setColor(a aVar, Integer num) {
        aVar.d(num);
    }

    @xj0(name = "indeterminate")
    public void setIndeterminate(a aVar, boolean z) {
        aVar.e(z);
    }

    @xj0(name = "progress")
    public void setProgress(a aVar, double d) {
        aVar.f(d);
    }

    @xj0(name = "styleAttr")
    public void setStyleAttr(a aVar, String str) {
        aVar.g(str);
    }

    public void setTestID(a aVar, String str) {
        super.setTestId(aVar, str);
    }
}
