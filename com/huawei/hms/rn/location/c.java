package com.huawei.hms.rn.location;

import android.app.Activity;
import com.huawei.hms.rn.location.backend.interfaces.ActivityHolder;

/* compiled from: lambda */
public final /* synthetic */ class c implements ActivityHolder {
    public final /* synthetic */ RNGeofenceModule a;

    public /* synthetic */ c(RNGeofenceModule rNGeofenceModule) {
        this.a = rNGeofenceModule;
    }

    @Override // com.huawei.hms.rn.location.backend.interfaces.ActivityHolder
    public final Activity getActivity() {
        return RNGeofenceModule.a(this.a);
    }
}
