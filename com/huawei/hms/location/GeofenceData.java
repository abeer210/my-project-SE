package com.huawei.hms.location;

import android.content.Intent;
import android.location.Location;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

public class GeofenceData {
    public static final String KEY_ERROR_CODE = null;
    public static final String KEY_GEOFENCE_LIST = null;
    public static final String KEY_LOCATION = null;
    public static final String KEY_TRANSITION = null;
    private final int a;
    private final int b;
    private final List<Geofence> c;
    private final Location d;

    static {
        C0201.m83(GeofenceData.class, 408);
    }

    private GeofenceData(int i, int i2, List<Geofence> list, Location location) {
        this.a = i;
        this.b = i2;
        this.c = list;
        this.d = location;
    }

    public static GeofenceData getDataFromIntent(Intent intent) {
        if (intent == null) {
            return null;
        }
        int i = -1;
        int intExtra = intent.getIntExtra(C0201.m82(31721), -1);
        int intExtra2 = intent.getIntExtra(C0201.m82(31722), -1);
        if (intExtra2 == 1 || intExtra2 == 2 || intExtra2 == 4) {
            i = intExtra2;
        }
        Location location = (Location) intent.getParcelableExtra(C0201.m82(31723));
        ArrayList arrayList = new ArrayList();
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra(C0201.m82(31724));
        if (parcelableArrayListExtra != null && parcelableArrayListExtra.size() > 0) {
            arrayList.addAll(parcelableArrayListExtra);
        }
        return new GeofenceData(intExtra, i, arrayList, location);
    }

    public int getConversion() {
        return this.b;
    }

    public List<Geofence> getConvertingGeofenceList() {
        return this.c;
    }

    public Location getConvertingLocation() {
        return this.d;
    }

    public int getErrorCode() {
        return this.a;
    }

    public boolean isFailure() {
        return this.a != -1;
    }

    public boolean isSuccess() {
        return this.a == -1;
    }
}
