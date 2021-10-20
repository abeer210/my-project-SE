package org.wonday.pdf;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.k0;
import vigqyno.C0201;

public class RCTPdfManager extends SimpleViewManager<a> {
    private static final String REACT_CLASS = null;
    private Context context;
    private a pdfView;

    static {
        C0201.m83(RCTPdfManager.class, 720);
    }

    public RCTPdfManager(ReactApplicationContext reactApplicationContext) {
        this.context = reactApplicationContext;
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return C0201.m82(28005);
    }

    public void onDropViewInstance(a aVar) {
    }

    @xj0(name = "enableAnnotationRendering")
    public void setEnableAnnotationRendering(a aVar, boolean z) {
        aVar.setEnableAnnotationRendering(z);
    }

    @xj0(name = "enableAntialiasing")
    public void setEnableAntialiasing(a aVar, boolean z) {
        aVar.setEnableAntialiasing(z);
    }

    @xj0(name = "enablePaging")
    public void setEnablePaging(a aVar, boolean z) {
        aVar.setEnablePaging(z);
    }

    @xj0(name = "fitPolicy")
    public void setFitPolycy(a aVar, int i) {
        aVar.setFitPolicy(i);
    }

    @xj0(name = "horizontal")
    public void setHorizontal(a aVar, boolean z) {
        aVar.setHorizontal(z);
    }

    @xj0(name = "maxScale")
    public void setMaxScale(a aVar, float f) {
        aVar.setMaxScale(f);
    }

    @xj0(name = "minScale")
    public void setMinScale(a aVar, float f) {
        aVar.setMinScale(f);
    }

    @xj0(name = "page")
    public void setPage(a aVar, int i) {
        aVar.setPage(i);
    }

    @xj0(name = "password")
    public void setPassword(a aVar, String str) {
        aVar.setPassword(str);
    }

    @xj0(name = "path")
    public void setPath(a aVar, String str) {
        aVar.setPath(str);
    }

    @xj0(name = "scale")
    public void setScale(a aVar, float f) {
        aVar.setScale(f);
    }

    @xj0(name = "spacing")
    public void setSpacing(a aVar, int i) {
        aVar.setSpacing(i);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(k0 k0Var) {
        a aVar = new a(k0Var, null);
        this.pdfView = aVar;
        return aVar;
    }

    public void onAfterUpdateTransaction(a aVar) {
        super.onAfterUpdateTransaction((View) aVar);
        aVar.k0();
    }
}
