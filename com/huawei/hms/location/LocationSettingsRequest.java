package com.huawei.hms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class LocationSettingsRequest implements Parcelable, IMessageEntity {
    public static final Parcelable.Creator<LocationSettingsRequest> CREATOR = new Parcelable.Creator<LocationSettingsRequest>() {
        /* class com.huawei.hms.location.LocationSettingsRequest.AnonymousClass1 */

        /* renamed from: a */
        public LocationSettingsRequest createFromParcel(Parcel parcel) {
            return new LocationSettingsRequest(parcel);
        }

        /* renamed from: a */
        public LocationSettingsRequest[] newArray(int i) {
            return new LocationSettingsRequest[i];
        }
    };
    @Packed
    public boolean alwaysShow;
    @Packed
    public boolean needBle;
    @Packed
    public List<LocationRequest> requests;

    public static class Builder {
        private List<LocationRequest> a = new ArrayList();
        private boolean b = false;
        private boolean c = false;

        public Builder addAllLocationRequests(Collection<LocationRequest> collection) {
            this.a.addAll(collection);
            return this;
        }

        public Builder addLocationRequest(LocationRequest locationRequest) {
            this.a.add(locationRequest);
            return this;
        }

        public LocationSettingsRequest build() {
            return new LocationSettingsRequest(this.a, this.b, this.c);
        }

        public Builder setAlwaysShow(boolean z) {
            this.b = z;
            return this;
        }

        public Builder setNeedBle(boolean z) {
            this.c = z;
            return this;
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.requests);
        parcel.writeByte(this.alwaysShow ? (byte) 1 : 0);
        parcel.writeByte(this.needBle ? (byte) 1 : 0);
    }

    private LocationSettingsRequest() {
    }

    private LocationSettingsRequest(List<LocationRequest> list, boolean z, boolean z2) {
        this.requests = list;
        this.alwaysShow = z;
        this.needBle = z2;
    }

    public LocationSettingsRequest(Parcel parcel) {
        boolean z = true;
        this.alwaysShow = parcel.readByte() != 0;
        this.needBle = parcel.readByte() == 0 ? false : z;
    }
}
