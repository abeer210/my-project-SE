package com.airbnb.android.react.maps;

import com.facebook.react.uimanager.i;
import com.facebook.react.uimanager.v0;
import java.util.HashMap;
import vigqyno.C0201;

/* compiled from: SizeReportingShadowNode */
public class u extends i {
    @Override // com.facebook.react.uimanager.b0
    public void onCollectExtraUpdates(v0 v0Var) {
        super.onCollectExtraUpdates(v0Var);
        HashMap hashMap = new HashMap();
        hashMap.put(C0201.m82(31837), Float.valueOf(getLayoutWidth()));
        hashMap.put(C0201.m82(31838), Float.valueOf(getLayoutHeight()));
        v0Var.R(getReactTag(), hashMap);
    }
}
