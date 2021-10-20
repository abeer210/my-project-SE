package com.huawei.hms.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.support.api.a.a;
import com.huawei.hms.support.api.a.e;
import com.huawei.hms.support.api.a.r;
import vigqyno.C0201;

public class FusedLocationProviderClient {
    public static final String KEY_VERTICAL_ACCURACY = null;
    private final Context a;
    private e b;

    static {
        C0201.m83(FusedLocationProviderClient.class, 689);
    }

    public FusedLocationProviderClient(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = a.a(applicationContext, (r) null);
    }

    public Task<Void> flushLocations() {
        com.huawei.hms.support.api.a.a.b.a.a().c();
        return this.b.b();
    }

    public Task<Location> getLastLocation() {
        com.huawei.hms.support.api.a.a.b.a.a().c();
        return this.b.a();
    }

    public Task<HWLocation> getLastLocationWithAddress(LocationRequest locationRequest) {
        com.huawei.hms.support.api.a.a.b.a.a().c();
        return this.b.a(locationRequest);
    }

    public Task<LocationAvailability> getLocationAvailability() {
        com.huawei.hms.support.api.a.a.b.a.a().c();
        return this.b.c();
    }

    public Task<Void> removeLocationUpdates(LocationCallback locationCallback) {
        com.huawei.hms.support.api.a.a.b.a.a().c();
        return this.b.a(locationCallback);
    }

    public Task<Void> requestLocationUpdates(LocationRequest locationRequest, LocationCallback locationCallback, Looper looper) {
        com.huawei.hms.support.api.a.a.b.a.a().c();
        return this.b.a(locationRequest, locationCallback, looper);
    }

    public Task<Void> requestLocationUpdatesEx(LocationRequest locationRequest, LocationCallback locationCallback, Looper looper) {
        com.huawei.hms.support.api.a.a.b.a.a().c();
        return this.b.b(locationRequest, locationCallback, looper);
    }

    public Task<Void> setMockLocation(Location location) {
        com.huawei.hms.support.api.a.a.b.a.a().c();
        return this.b.a(location);
    }

    public Task<Void> setMockMode(boolean z) {
        com.huawei.hms.support.api.a.a.b.a.a().c();
        return this.b.a(z);
    }

    public Task<Void> removeLocationUpdates(PendingIntent pendingIntent) {
        com.huawei.hms.support.api.a.a.b.a.a().c();
        return this.b.a(pendingIntent);
    }

    public Task<Void> requestLocationUpdates(LocationRequest locationRequest, PendingIntent pendingIntent) {
        com.huawei.hms.support.api.a.a.b.a.a().c();
        return this.b.a(locationRequest, pendingIntent);
    }

    public FusedLocationProviderClient(Activity activity) {
        this.a = activity.getApplicationContext();
        this.b = a.a(activity, (r) null);
    }
}
