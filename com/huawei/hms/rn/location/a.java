package com.huawei.hms.rn.location;

import android.app.Activity;
import com.huawei.hms.rn.location.backend.interfaces.ActivityHolder;

/* compiled from: lambda */
public final /* synthetic */ class a implements ActivityHolder {
    public final /* synthetic */ RNActivityIdentificationModule a;

    public /* synthetic */ a(RNActivityIdentificationModule rNActivityIdentificationModule) {
        this.a = rNActivityIdentificationModule;
    }

    @Override // com.huawei.hms.rn.location.backend.interfaces.ActivityHolder
    public final Activity getActivity() {
        return RNActivityIdentificationModule.a(this.a);
    }
}
