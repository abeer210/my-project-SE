package com.huawei.hms.rn.location;

import android.app.Activity;
import com.huawei.hms.rn.location.backend.interfaces.ActivityHolder;

/* compiled from: lambda */
public final /* synthetic */ class b implements ActivityHolder {
    public final /* synthetic */ RNFusedLocationModule a;

    public /* synthetic */ b(RNFusedLocationModule rNFusedLocationModule) {
        this.a = rNFusedLocationModule;
    }

    @Override // com.huawei.hms.rn.location.backend.interfaces.ActivityHolder
    public final Activity getActivity() {
        return RNFusedLocationModule.a(this.a);
    }
}
