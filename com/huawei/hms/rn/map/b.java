package com.huawei.hms.rn.map;

import com.facebook.react.bridge.Promise;
import com.facebook.react.uimanager.m;
import com.facebook.react.uimanager.n0;
import com.huawei.hms.rn.map.HMSMapView;

/* compiled from: lambda */
public final /* synthetic */ class b implements n0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Promise b;

    public /* synthetic */ b(int i, Promise promise) {
        this.a = i;
        this.b = promise;
    }

    @Override // com.facebook.react.uimanager.n0
    public final void a(m mVar) {
        HMSMapView.Module.d(this.a, this.b, mVar);
    }
}
