package com.facebook.react.views.text;

import android.content.Context;
import android.text.Spannable;
import android.view.View;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.common.e;
import com.facebook.react.uimanager.c0;
import com.facebook.react.uimanager.f;
import com.facebook.react.uimanager.j0;
import com.facebook.react.uimanager.k0;
import com.facebook.yoga.n;
import java.util.Map;
import vigqyno.C0201;

@pj0(name = "RCTText")
public class ReactTextViewManager extends ReactTextAnchorViewManager<r, p> implements f {
    public static final String REACT_CLASS = null;
    public s mReactTextViewManagerCallback;

    static {
        C0201.m83(ReactTextViewManager.class, 724);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        String r0 = C0201.m82(34079);
        return e.e(C0201.m82(34082), e.d(r0, C0201.m82(34080)), C0201.m82(34083), e.d(r0, C0201.m82(34081)));
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return C0201.m82(34084);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<p> getShadowNodeClass() {
        return p.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f, n nVar, float f2, n nVar2, int[] iArr) {
        return b0.d(context, readableMap, readableMap2, f, nVar, f2, nVar2, this.mReactTextViewManagerCallback, iArr);
    }

    @Override // com.facebook.react.uimanager.f
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public p createShadowNodeInstance() {
        return new p();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public r createViewInstance(k0 k0Var) {
        return new r(k0Var);
    }

    public void onAfterUpdateTransaction(r rVar) {
        super.onAfterUpdateTransaction((View) rVar);
        rVar.l();
    }

    public void setPadding(r rVar, int i, int i2, int i3, int i4) {
        rVar.setPadding(i, i2, i3, i4);
    }

    public void updateExtraData(r rVar, Object obj) {
        q qVar = (q) obj;
        if (qVar.b()) {
            z.g(qVar.k(), rVar);
        }
        rVar.setText(qVar);
    }

    public Object updateState(r rVar, c0 c0Var, j0 j0Var) {
        ReadableNativeMap state = j0Var.getState();
        ReadableNativeMap map = state.getMap(C0201.m82(34085));
        ReadableNativeMap map2 = state.getMap(C0201.m82(34086));
        Spannable c = b0.c(rVar.getContext(), map, this.mReactTextViewManagerCallback);
        rVar.setSpanned(c);
        int j = x.j(map2.getString(C0201.m82(34087)));
        String r0 = C0201.m82(34088);
        return new q(c, state.hasKey(r0) ? state.getInt(r0) : -1, false, x.i(c0Var), j, x.f(c0Var));
    }

    public p createShadowNodeInstance(s sVar) {
        return new p(sVar);
    }
}
