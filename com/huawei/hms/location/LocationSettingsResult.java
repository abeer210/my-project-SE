package com.huawei.hms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.api.client.Status;

public class LocationSettingsResult extends Result implements Parcelable {
    public static final Parcelable.Creator<LocationSettingsResult> CREATOR = new Parcelable.Creator<LocationSettingsResult>() {
        /* class com.huawei.hms.location.LocationSettingsResult.AnonymousClass1 */

        /* renamed from: a */
        public LocationSettingsResult createFromParcel(Parcel parcel) {
            return new LocationSettingsResult(parcel);
        }

        /* renamed from: a */
        public LocationSettingsResult[] newArray(int i) {
            return new LocationSettingsResult[i];
        }
    };
    @Packed
    private LocationSettingsStates locationSettingsStates;
    @Packed
    private Status status;

    public LocationSettingsResult() {
    }

    public int describeContents() {
        return 0;
    }

    public LocationSettingsStates getLocationSettingsStates() {
        return this.locationSettingsStates;
    }

    @Override // com.huawei.hms.support.api.client.Result
    public Status getStatus() {
        return this.status;
    }

    public void setLocationSettingsStates(LocationSettingsStates locationSettingsStates2) {
        this.locationSettingsStates = locationSettingsStates2;
    }

    @Override // com.huawei.hms.support.api.client.Result
    public void setStatus(Status status2) {
        this.status = status2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.status, i);
        parcel.writeParcelable(this.locationSettingsStates, i);
    }

    public LocationSettingsResult(Parcel parcel) {
        this.status = (Status) parcel.readParcelable(Status.class.getClassLoader());
        this.locationSettingsStates = (LocationSettingsStates) parcel.readParcelable(LocationSettingsStates.class.getClassLoader());
    }
}
