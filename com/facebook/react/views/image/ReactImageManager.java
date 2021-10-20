package com.facebook.react.views.image;

import android.graphics.PorterDuff;
import android.view.View;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.e;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.q;
import com.facebook.yoga.g;
import java.util.Map;
import vigqyno.C0201;

@pj0(name = "RCTImageView")
public class ReactImageManager extends SimpleViewManager<g> {
    public static final String REACT_CLASS = null;
    private final Object mCallerContext;
    private final f mCallerContextFactory;
    private x80 mDraweeControllerBuilder;
    private a mGlobalImageLoadListener;

    static {
        C0201.m83(ReactImageManager.class, 739);
    }

    @Deprecated
    public ReactImageManager(x80 x80, Object obj) {
        this(x80, (a) null, obj);
    }

    @Deprecated
    public Object getCallerContext() {
        return this.mCallerContext;
    }

    public x80 getDraweeControllerBuilder() {
        if (this.mDraweeControllerBuilder == null) {
            this.mDraweeControllerBuilder = c80.f();
        }
        return this.mDraweeControllerBuilder;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        String m = b.m(4);
        String r0 = C0201.m82(34066);
        return e.g(m, e.d(r0, C0201.m82(34067)), b.m(2), e.d(r0, C0201.m82(34068)), b.m(1), e.d(r0, C0201.m82(34069)), b.m(3), e.d(r0, C0201.m82(34070)));
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return C0201.m82(34071);
    }

    @xj0(name = "blurRadius")
    public void setBlurRadius(g gVar, float f) {
        gVar.setBlurRadius(f);
    }

    @xj0(customType = "Color", name = "borderColor")
    public void setBorderColor(g gVar, Integer num) {
        if (num == null) {
            gVar.setBorderColor(0);
        } else {
            gVar.setBorderColor(num.intValue());
        }
    }

    @yj0(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(g gVar, int i, float f) {
        if (!g.a(f)) {
            f = q.c(f);
        }
        if (i == 0) {
            gVar.setBorderRadius(f);
        } else {
            gVar.u(f, i - 1);
        }
    }

    @xj0(name = "borderWidth")
    public void setBorderWidth(g gVar, float f) {
        gVar.setBorderWidth(f);
    }

    @xj0(name = "defaultSrc")
    public void setDefaultSource(g gVar, String str) {
        gVar.setDefaultSource(str);
    }

    @xj0(name = "fadeDuration")
    public void setFadeDuration(g gVar, int i) {
        gVar.setFadeDuration(i);
    }

    @xj0(name = "headers")
    public void setHeaders(g gVar, ReadableMap readableMap) {
        gVar.setHeaders(readableMap);
    }

    @xj0(name = "internal_analyticTag")
    public void setInternal_AnalyticsTag(g gVar, String str) {
        f fVar = this.mCallerContextFactory;
        if (fVar != null) {
            gVar.x(fVar.a((k0) gVar.getContext(), str));
        }
    }

    @xj0(name = "shouldNotifyLoadEvents")
    public void setLoadHandlersRegistered(g gVar, boolean z) {
        gVar.setShouldNotifyLoadEvents(z);
    }

    @xj0(name = "loadingIndicatorSrc")
    public void setLoadingIndicatorSource(g gVar, String str) {
        gVar.setLoadingIndicatorSource(str);
    }

    @xj0(customType = "Color", name = "overlayColor")
    public void setOverlayColor(g gVar, Integer num) {
        if (num == null) {
            gVar.setOverlayColor(0);
        } else {
            gVar.setOverlayColor(num.intValue());
        }
    }

    @xj0(name = "progressiveRenderingEnabled")
    public void setProgressiveRenderingEnabled(g gVar, boolean z) {
        gVar.setProgressiveRenderingEnabled(z);
    }

    @xj0(name = "resizeMethod")
    public void setResizeMethod(g gVar, String str) {
        if (str == null || C0201.m82(34072).equals(str)) {
            gVar.setResizeMethod(c.AUTO);
        } else if (C0201.m82(34073).equals(str)) {
            gVar.setResizeMethod(c.RESIZE);
        } else if (C0201.m82(34074).equals(str)) {
            gVar.setResizeMethod(c.SCALE);
        } else {
            throw new JSApplicationIllegalArgumentException(C0201.m82(34075) + str + C0201.m82(34076));
        }
    }

    @xj0(name = "resizeMode")
    public void setResizeMode(g gVar, String str) {
        gVar.setScaleType(d.c(str));
        gVar.setTileMode(d.d(str));
    }

    @xj0(name = "src")
    public void setSource(g gVar, ReadableArray readableArray) {
        gVar.setSource(readableArray);
    }

    @xj0(customType = "Color", name = "tintColor")
    public void setTintColor(g gVar, Integer num) {
        if (num == null) {
            gVar.clearColorFilter();
        } else {
            gVar.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @Deprecated
    public ReactImageManager(x80 x80, a aVar, Object obj) {
        this.mDraweeControllerBuilder = x80;
        this.mGlobalImageLoadListener = aVar;
        this.mCallerContext = obj;
        this.mCallerContextFactory = null;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public g createViewInstance(k0 k0Var) {
        Object obj;
        f fVar = this.mCallerContextFactory;
        if (fVar != null) {
            obj = fVar.a(k0Var, null);
        } else {
            obj = getCallerContext();
        }
        return new g(k0Var, getDraweeControllerBuilder(), this.mGlobalImageLoadListener, obj);
    }

    public void onAfterUpdateTransaction(g gVar) {
        super.onAfterUpdateTransaction((View) gVar);
        gVar.t();
    }

    public ReactImageManager(x80 x80, f fVar) {
        this(x80, (a) null, fVar);
    }

    public ReactImageManager(x80 x80, a aVar, f fVar) {
        this.mDraweeControllerBuilder = x80;
        this.mGlobalImageLoadListener = aVar;
        this.mCallerContextFactory = fVar;
        this.mCallerContext = null;
    }

    public ReactImageManager() {
        this.mDraweeControllerBuilder = null;
        this.mCallerContext = null;
        this.mCallerContextFactory = null;
    }
}
