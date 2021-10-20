package com.huawei.hms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import java.util.Arrays;
import vigqyno.C0201;

public class LocationAvailability implements Parcelable, IMessageEntity {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new Parcelable.Creator<LocationAvailability>() {
        /* class com.huawei.hms.location.LocationAvailability.AnonymousClass1 */

        /* renamed from: a */
        public LocationAvailability createFromParcel(Parcel parcel) {
            return new LocationAvailability(parcel);
        }

        /* renamed from: a */
        public LocationAvailability[] newArray(int i) {
            return new LocationAvailability[i];
        }
    };
    private static final String EXTRA_KEY = null;
    private static final String TAG = null;
    @Packed
    private int cellStatus;
    @Packed
    private long elapsedRealtimeNs;
    @Packed
    private int locationStatus;
    @Packed
    private int wifiStatus;

    static {
        C0201.m83(LocationAvailability.class, 419);
    }

    public LocationAvailability() {
    }

    public static LocationAvailability extractLocationAvailability(Intent intent) {
        try {
            if (hasLocationAvailability(intent)) {
                return (LocationAvailability) intent.getParcelableExtra(C0201.m82(38992));
            }
            return null;
        } catch (Exception unused) {
            Log.e(C0201.m82(38993), C0201.m82(38994));
            return null;
        }
    }

    public static boolean hasLocationAvailability(Intent intent) {
        if (intent == null) {
            return false;
        }
        try {
            return intent.hasExtra(C0201.m82(38995));
        } catch (Exception unused) {
            Log.e(C0201.m82(38996), C0201.m82(38997));
            return false;
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LocationAvailability)) {
            return false;
        }
        LocationAvailability locationAvailability = (LocationAvailability) obj;
        if (this.cellStatus == locationAvailability.cellStatus && this.wifiStatus == locationAvailability.wifiStatus && this.elapsedRealtimeNs == locationAvailability.elapsedRealtimeNs && this.locationStatus == locationAvailability.locationStatus) {
            return true;
        }
        return false;
    }

    public int getCellStatus() {
        return this.cellStatus;
    }

    public long getElapsedRealtimeNs() {
        return this.elapsedRealtimeNs;
    }

    public int getLocationStatus() {
        return this.locationStatus;
    }

    public int getWifiStatus() {
        return this.wifiStatus;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.locationStatus), Integer.valueOf(this.cellStatus), Integer.valueOf(this.wifiStatus), Long.valueOf(this.elapsedRealtimeNs)});
    }

    public boolean isLocationAvailable() {
        return this.locationStatus < 1000;
    }

    public void setCellStatus(int i) {
        this.cellStatus = i;
    }

    public void setElapsedRealtimeNs(long j) {
        this.elapsedRealtimeNs = j;
    }

    public void setLocationStatus(int i) {
        this.locationStatus = i;
    }

    public void setWifiStatus(int i) {
        this.wifiStatus = i;
    }

    public String toString() {
        return C0201.m82(38998) + isLocationAvailable() + C0201.m82(38999);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.cellStatus);
        parcel.writeInt(this.wifiStatus);
        parcel.writeLong(this.elapsedRealtimeNs);
        parcel.writeInt(this.locationStatus);
    }

    public LocationAvailability(Parcel parcel) {
        this.cellStatus = parcel.readInt();
        this.wifiStatus = parcel.readInt();
        this.elapsedRealtimeNs = parcel.readLong();
        this.locationStatus = parcel.readInt();
    }
}
