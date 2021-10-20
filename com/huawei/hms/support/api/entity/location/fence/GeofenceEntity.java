package com.huawei.hms.support.api.entity.location.fence;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.hms.location.Geofence;
import vigqyno.C0201;

public class GeofenceEntity implements Parcelable, IMessageEntity, Geofence {
    public static final Parcelable.Creator<GeofenceEntity> CREATOR = new Parcelable.Creator<GeofenceEntity>() {
        /* class com.huawei.hms.support.api.entity.location.fence.GeofenceEntity.AnonymousClass1 */

        /* renamed from: a */
        public GeofenceEntity createFromParcel(Parcel parcel) {
            return new GeofenceEntity(parcel);
        }

        /* renamed from: a */
        public GeofenceEntity[] newArray(int i) {
            return new GeofenceEntity[i];
        }
    };
    @Packed
    private int conversions;
    @Packed
    private int dwellDelayTime;
    @Packed
    private double latitude;
    @Packed
    private double longitude;
    @Packed
    private int notificationInterval;
    @Packed
    private float radius;
    @Packed
    private String uniqueId;
    @Packed
    private long validDuration;

    public int describeContents() {
        return 0;
    }

    @Override // com.huawei.hms.location.Geofence
    public final String getUniqueId() {
        return this.uniqueId;
    }

    public String toString() {
        return C0201.m82(6324) + this.uniqueId + '\'' + C0201.m82(6325) + this.conversions + C0201.m82(6326) + this.validDuration + C0201.m82(6327) + this.radius + C0201.m82(6328) + this.notificationInterval + C0201.m82(6329) + this.dwellDelayTime + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uniqueId);
        parcel.writeInt(this.conversions);
        parcel.writeLong(this.validDuration);
        parcel.writeDouble(this.latitude);
        parcel.writeDouble(this.longitude);
        parcel.writeFloat(this.radius);
        parcel.writeInt(this.notificationInterval);
        parcel.writeInt(this.dwellDelayTime);
    }

    public GeofenceEntity(String str, int i, double d, double d2, float f, long j, int i2, int i3) {
        this.dwellDelayTime = -1;
        if (TextUtils.isEmpty(str) || str.length() > 100) {
            throw new IllegalArgumentException(TextUtils.isEmpty(str) ? C0201.m82(6322) : C0201.m82(6323).concat(str));
        } else if (f <= 0.0f) {
            throw new IllegalArgumentException(C0201.m82(6321) + f);
        } else if (d > 90.0d || d < -90.0d) {
            throw new IllegalArgumentException(C0201.m82(6320));
        } else if (d2 > 180.0d || d2 < -180.0d) {
            throw new IllegalArgumentException(C0201.m82(6319));
        } else if ((i & 7) != 0) {
            this.uniqueId = str;
            this.latitude = d;
            this.longitude = d2;
            this.radius = f;
            this.validDuration = j;
            this.conversions = i;
            this.notificationInterval = i2;
            this.dwellDelayTime = i3;
        } else {
            throw new IllegalArgumentException(C0201.m82(6318) + i);
        }
    }

    private GeofenceEntity(Parcel parcel) {
        this.dwellDelayTime = -1;
        this.uniqueId = parcel.readString();
        this.conversions = parcel.readInt();
        this.validDuration = parcel.readLong();
        this.latitude = parcel.readDouble();
        this.longitude = parcel.readDouble();
        this.radius = parcel.readFloat();
        this.notificationInterval = parcel.readInt();
        this.dwellDelayTime = parcel.readInt();
    }
}
