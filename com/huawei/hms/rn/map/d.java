package com.huawei.hms.rn.map;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.m;
import com.facebook.react.uimanager.n0;
import com.huawei.hms.rn.map.HMSMapView;

/* compiled from: lambda */
public final /* synthetic */ class d implements n0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Promise b;
    public final /* synthetic */ ReadableMap c;

    public /* synthetic */ d(int i, Promise promise, ReadableMap readableMap) {
        this.a = i;
        this.b = promise;
        this.c = readableMap;
    }

    @Override // com.facebook.react.uimanager.n0
    public final void a(m mVar) {
        HMSMapView.Module.a(this.a, this.b, this.c, mVar);
    }
}
