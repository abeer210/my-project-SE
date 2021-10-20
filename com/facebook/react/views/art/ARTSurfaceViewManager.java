package com.facebook.react.views.art;

import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.k0;
import com.facebook.yoga.m;
import com.facebook.yoga.n;
import com.facebook.yoga.p;
import vigqyno.C0201;

@pj0(name = "ARTSurfaceView")
public class ARTSurfaceViewManager extends BaseViewManager<c, d> {
    private static final m MEASURE_FUNCTION = new a();
    public static final String REACT_CLASS = null;

    static class a implements m {
        @Override // com.facebook.yoga.m
        public long a(p pVar, float f, n nVar, float f2, n nVar2) {
            throw new IllegalStateException(C0201.m82(1667));
        }
    }

    static {
        C0201.m83(ARTSurfaceViewManager.class, 529);
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return C0201.m82(26599);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<d> getShadowNodeClass() {
        return d.class;
    }

    public void setBackgroundColor(c cVar, int i) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public d createShadowNodeInstance() {
        d dVar = new d();
        dVar.setMeasureFunction(MEASURE_FUNCTION);
        return dVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public c createViewInstance(k0 k0Var) {
        return new c(k0Var);
    }

    public void updateExtraData(c cVar, Object obj) {
        ((d) obj).d(cVar);
    }
}
