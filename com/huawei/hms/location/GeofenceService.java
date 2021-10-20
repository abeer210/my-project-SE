package com.huawei.hms.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.support.api.a.a;
import com.huawei.hms.support.api.a.k;
import com.huawei.hms.support.api.a.r;
import java.util.List;

public class GeofenceService {
    private k a;

    public GeofenceService(Context context) {
        this.a = a.c(context, (r) null);
    }

    public Task<Void> createGeofenceList(GeofenceRequest geofenceRequest, PendingIntent pendingIntent) {
        return this.a.a(geofenceRequest, pendingIntent);
    }

    public Task<Void> deleteGeofenceList(List<String> list) {
        return this.a.a(list);
    }

    public Task<Void> deleteGeofenceList(PendingIntent pendingIntent) {
        return this.a.a(pendingIntent);
    }

    public GeofenceService(Activity activity) {
        this.a = a.c(activity, (r) null);
    }
}
