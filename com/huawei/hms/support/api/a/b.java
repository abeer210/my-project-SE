package com.huawei.hms.support.api.a;

import android.app.PendingIntent;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.location.ActivityConversionRequest;

/* compiled from: LocationArClient */
public interface b {
    Task<Void> a(long j, PendingIntent pendingIntent);

    Task<Void> a(PendingIntent pendingIntent);

    Task<Void> a(ActivityConversionRequest activityConversionRequest, PendingIntent pendingIntent);

    Task<Void> b(PendingIntent pendingIntent);
}
