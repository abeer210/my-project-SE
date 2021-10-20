package com.huawei.hms.location;

import android.app.Activity;
import android.content.Context;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.support.api.a.a;
import com.huawei.hms.support.api.a.h;
import com.huawei.hms.support.api.a.r;

public class LocationEnhanceService {
    private h a;

    public LocationEnhanceService(Context context) {
        this.a = a.d(context, (r) null);
    }

    public Task<NavigationResult> getNavigationState(NavigationRequest navigationRequest) {
        com.huawei.hms.support.api.a.a.b.a.a().c();
        return this.a.a(navigationRequest);
    }

    public LocationEnhanceService(Activity activity) {
        this.a = a.d(activity, (r) null);
    }
}
