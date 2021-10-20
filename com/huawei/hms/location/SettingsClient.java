package com.huawei.hms.location;

import android.app.Activity;
import android.content.Context;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.support.api.a.a;
import com.huawei.hms.support.api.a.e;
import com.huawei.hms.support.api.a.r;

public class SettingsClient {
    private Context a;
    private Activity b;
    private e c;

    public SettingsClient(Context context) {
        this.a = context;
        this.c = a.a(context, (r) null);
    }

    public Task<LocationSettingsResponse> checkLocationSettings(LocationSettingsRequest locationSettingsRequest) {
        return this.c.a(locationSettingsRequest);
    }

    public SettingsClient(Activity activity) {
        this.b = activity;
        this.c = a.a(activity, (r) null);
    }
}
