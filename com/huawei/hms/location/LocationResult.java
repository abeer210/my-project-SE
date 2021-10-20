package com.huawei.hms.location;

import android.content.Intent;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.hms.support.api.a.c.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import vigqyno.C0201;

public class LocationResult implements Parcelable, IMessageEntity {
    public static final Parcelable.Creator<LocationResult> CREATOR = new Parcelable.Creator<LocationResult>() {
        /* class com.huawei.hms.location.LocationResult.AnonymousClass1 */

        /* renamed from: a */
        public LocationResult createFromParcel(Parcel parcel) {
            return new LocationResult(parcel);
        }

        /* renamed from: a */
        public LocationResult[] newArray(int i) {
            return new LocationResult[i];
        }
    };
    private static final String EXTRA_KEY = null;
    private static final String TAG = null;
    @Packed
    private List<HWLocation> locations;

    static {
        C0201.m83(LocationResult.class, 502);
    }

    public LocationResult(List<HWLocation> list) {
        this.locations = list;
    }

    public static LocationResult create(List<HWLocation> list) {
        return new LocationResult(list);
    }

    public static LocationResult extractResult(Intent intent) {
        try {
            if (!hasResult(intent)) {
                return null;
            }
            return (LocationResult) intent.getExtras().getParcelable(C0201.m82(37482));
        } catch (Exception unused) {
            Log.e(C0201.m82(37483), C0201.m82(37484));
            return null;
        }
    }

    public static boolean hasResult(Intent intent) {
        if (intent == null) {
            return false;
        }
        try {
            return intent.hasExtra(C0201.m82(37485));
        } catch (Exception unused) {
            Log.e(C0201.m82(37486), C0201.m82(37487));
            return false;
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || LocationResult.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.locations, ((LocationResult) obj).locations);
    }

    public final List<HWLocation> getHWLocationList() {
        return this.locations;
    }

    public final HWLocation getLastHWLocation() {
        int size = this.locations.size();
        if (size == 0) {
            return null;
        }
        return this.locations.get(size - 1);
    }

    public final Location getLastLocation() {
        int size = this.locations.size();
        if (size == 0) {
            return null;
        }
        return c.a(this.locations.get(size - 1));
    }

    public final List<Location> getLocations() {
        ArrayList arrayList = new ArrayList();
        for (HWLocation hWLocation : this.locations) {
            Location a = c.a(hWLocation);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    public int hashCode() {
        return Objects.hash(this.locations);
    }

    public String toString() {
        return C0201.m82(37488) + this.locations + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.locations);
    }

    public LocationResult(Parcel parcel) {
        this.locations = parcel.createTypedArrayList(HWLocation.CREATOR);
    }
}
