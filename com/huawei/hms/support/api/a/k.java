package com.huawei.hms.support.api.a;

import android.app.PendingIntent;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.location.GeofenceRequest;
import java.util.List;

/* compiled from: LocationGeofenceClient */
public interface k {
    Task<Void> a(PendingIntent pendingIntent);

    Task<Void> a(GeofenceRequest geofenceRequest, PendingIntent pendingIntent);

    Task<Void> a(List<String> list);
}
