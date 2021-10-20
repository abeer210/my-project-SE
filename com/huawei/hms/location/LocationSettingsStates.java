package com.huawei.hms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.internal.safeparcel.AbstractSafeParcelable;
import com.huawei.hms.common.internal.safeparcel.SafeParcelWriter;
import com.huawei.hms.common.internal.safeparcel.SafeParcelableSerializer;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import vigqyno.C0201;

public class LocationSettingsStates extends AbstractSafeParcelable implements IMessageEntity {
    public static final Parcelable.Creator<LocationSettingsStates> CREATOR = new Parcelable.Creator<LocationSettingsStates>() {
        /* class com.huawei.hms.location.LocationSettingsStates.AnonymousClass1 */

        /* renamed from: a */
        public LocationSettingsStates createFromParcel(Parcel parcel) {
            return new LocationSettingsStates(parcel);
        }

        /* renamed from: a */
        public LocationSettingsStates[] newArray(int i) {
            return new LocationSettingsStates[i];
        }
    };
    @Packed
    private boolean blePresent;
    @Packed
    private boolean bleUsable;
    @Packed
    private boolean gpsPresent;
    @Packed
    private boolean gpsUsable;
    @Packed
    private boolean locationPresent;
    @Packed
    private boolean locationUsable;
    @Packed
    private boolean networkLocationPresent;
    @Packed
    private boolean networkLocationUsable;

    public LocationSettingsStates() {
    }

    public static LocationSettingsStates fromIntent(Intent intent) {
        if (intent == null) {
            return null;
        }
        return (LocationSettingsStates) SafeParcelableSerializer.deserializeFromIntentExtra(intent, C0201.m82(32092), CREATOR);
    }

    public boolean isBlePresent() {
        return this.blePresent;
    }

    public boolean isBleUsable() {
        return this.bleUsable;
    }

    public boolean isGpsPresent() {
        return this.gpsPresent;
    }

    public boolean isGpsUsable() {
        return this.gpsUsable;
    }

    public boolean isLocationPresent() {
        return this.locationPresent;
    }

    public boolean isLocationUsable() {
        return this.locationUsable;
    }

    public boolean isNetworkLocationPresent() {
        return this.networkLocationPresent;
    }

    public boolean isNetworkLocationUsable() {
        return this.networkLocationUsable;
    }

    public void setBlePresent(boolean z) {
        this.blePresent = z;
    }

    public void setBleUsable(boolean z) {
        this.bleUsable = z;
    }

    public void setGpsPresent(boolean z) {
        this.gpsPresent = z;
    }

    public void setGpsUsable(boolean z) {
        this.gpsUsable = z;
    }

    public void setLocationPresent(boolean z) {
        this.locationPresent = z;
    }

    public void setLocationUsable(boolean z) {
        this.locationUsable = z;
    }

    public void setNetworkLocationPresent(boolean z) {
        this.networkLocationPresent = z;
    }

    public void setNetworkLocationUsable(boolean z) {
        this.networkLocationUsable = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, isGpsUsable());
        SafeParcelWriter.writeBoolean(parcel, 2, isNetworkLocationUsable());
        SafeParcelWriter.writeBoolean(parcel, 3, isBleUsable());
        SafeParcelWriter.writeBoolean(parcel, 4, isGpsPresent());
        SafeParcelWriter.writeBoolean(parcel, 5, isNetworkLocationPresent());
        SafeParcelWriter.writeBoolean(parcel, 6, isBlePresent());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public LocationSettingsStates(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.gpsUsable = z;
        this.networkLocationUsable = z2;
        this.bleUsable = z3;
        this.gpsPresent = z4;
        this.networkLocationPresent = z5;
        this.blePresent = z6;
    }

    public LocationSettingsStates(Parcel parcel) {
        boolean z = true;
        this.blePresent = parcel.readByte() != 0;
        this.bleUsable = parcel.readByte() != 0;
        this.gpsPresent = parcel.readByte() != 0;
        this.gpsUsable = parcel.readByte() != 0;
        this.locationPresent = parcel.readByte() != 0;
        this.locationUsable = parcel.readByte() != 0;
        this.networkLocationPresent = parcel.readByte() != 0;
        this.networkLocationUsable = parcel.readByte() == 0 ? false : z;
    }
}
