package com.huawei.hms.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.support.api.a.a;
import com.huawei.hms.support.api.a.b;
import com.huawei.hms.support.api.a.r;

public class ActivityIdentificationService {
    private b a;

    public ActivityIdentificationService(Context context) {
        this.a = a.b(context, (r) null);
    }

    public Task<Void> createActivityConversionUpdates(ActivityConversionRequest activityConversionRequest, PendingIntent pendingIntent) {
        return this.a.a(activityConversionRequest, pendingIntent);
    }

    public Task<Void> createActivityIdentificationUpdates(long j, PendingIntent pendingIntent) {
        return this.a.a(j, pendingIntent);
    }

    public Task<Void> deleteActivityConversionUpdates(PendingIntent pendingIntent) {
        return this.a.b(pendingIntent);
    }

    public Task<Void> deleteActivityIdentificationUpdates(PendingIntent pendingIntent) {
        return this.a.a(pendingIntent);
    }

    public ActivityIdentificationService(Activity activity) {
        this.a = a.b(activity, (r) null);
    }
}
