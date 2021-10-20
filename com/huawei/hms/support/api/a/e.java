package com.huawei.hms.support.api.a;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.location.HWLocation;
import com.huawei.hms.location.LocationAvailability;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.location.LocationSettingsRequest;
import com.huawei.hms.location.LocationSettingsResponse;

/* compiled from: LocationClient */
public interface e {
    Task<Location> a();

    Task<Void> a(PendingIntent pendingIntent);

    Task<Void> a(Location location);

    Task<Void> a(LocationCallback locationCallback);

    Task<HWLocation> a(LocationRequest locationRequest);

    Task<Void> a(LocationRequest locationRequest, PendingIntent pendingIntent);

    Task<Void> a(LocationRequest locationRequest, LocationCallback locationCallback, Looper looper);

    Task<LocationSettingsResponse> a(LocationSettingsRequest locationSettingsRequest);

    Task<Void> a(boolean z);

    Task<Void> b();

    Task<Void> b(LocationRequest locationRequest, LocationCallback locationCallback, Looper looper);

    Task<LocationAvailability> c();
}
