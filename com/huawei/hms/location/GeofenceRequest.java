package com.huawei.hms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.hms.support.api.entity.location.fence.GeofenceEntity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import vigqyno.C0201;

public class GeofenceRequest implements Parcelable, IMessageEntity {
    public static final int COORDINATE_TYPE_GCJ_02 = 0;
    public static final int COORDINATE_TYPE_WGS_84 = 0;
    public static final Parcelable.Creator<GeofenceRequest> CREATOR = new Parcelable.Creator<GeofenceRequest>() {
        /* class com.huawei.hms.location.GeofenceRequest.AnonymousClass1 */

        /* renamed from: a */
        public GeofenceRequest createFromParcel(Parcel parcel) {
            return new GeofenceRequest(parcel);
        }

        /* renamed from: a */
        public GeofenceRequest[] newArray(int i) {
            return new GeofenceRequest[i];
        }
    };
    public static final int DWELL_INIT_CONVERSION = 0;
    public static final int ENTER_INIT_CONVERSION = 0;
    public static final int EXIT_INIT_CONVERSION = 0;
    @Packed
    private int coordinateType;
    @Packed
    private List<GeofenceEntity> geofenceList;
    @Packed
    private int initConversions;

    public static final class Builder {
        private final List<GeofenceEntity> a = new ArrayList();
        private int b = 5;
        private int c = 1;

        public GeofenceRequest build() {
            Preconditions.checkArgument(!this.a.isEmpty(), C0201.m82(10507));
            int i = this.c;
            if (!(i == 0 || i == 1)) {
                this.c = 1;
            }
            HashSet hashSet = new HashSet();
            for (GeofenceEntity geofenceEntity : this.a) {
                hashSet.add(geofenceEntity.getUniqueId());
            }
            if (hashSet.size() == this.a.size()) {
                int i2 = this.b;
                if (((i2 & 7) != 0 || i2 == 0) && this.b >= 0) {
                    return new GeofenceRequest(this.a, this.b, this.c);
                }
                throw new IllegalArgumentException(C0201.m82(10508));
            }
            throw new IllegalArgumentException(C0201.m82(10509));
        }

        public Builder createGeofence(Geofence geofence) {
            Preconditions.checkNotNull(geofence, C0201.m82(10510));
            Preconditions.checkArgument(geofence instanceof GeofenceEntity, C0201.m82(10511));
            this.a.add((GeofenceEntity) geofence);
            return this;
        }

        public Builder createGeofenceList(List<Geofence> list) {
            if (list != null && !list.isEmpty()) {
                for (Geofence geofence : list) {
                    if (geofence != null) {
                        createGeofence(geofence);
                    }
                }
            }
            return this;
        }

        public Builder setCoordinateType(int i) {
            this.c = i;
            return this;
        }

        public Builder setInitConversions(int i) {
            this.b = i;
            return this;
        }
    }

    static {
        C0201.m83(GeofenceRequest.class, 370);
    }

    public int describeContents() {
        return 0;
    }

    public int getCoordinateType() {
        return this.coordinateType;
    }

    public List<Geofence> getGeofences() {
        if (this.geofenceList == null) {
            return new ArrayList();
        }
        return new ArrayList(this.geofenceList);
    }

    public int getInitConversions() {
        return this.initConversions;
    }

    public String toString() {
        return C0201.m82(27804) + this.geofenceList + C0201.m82(27805) + this.initConversions + C0201.m82(27806) + this.coordinateType + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.geofenceList);
        parcel.writeInt(this.initConversions);
        parcel.writeInt(this.coordinateType);
    }

    public GeofenceRequest() {
    }

    public GeofenceRequest(List<GeofenceEntity> list, int i, int i2) {
        this.geofenceList = list;
        this.initConversions = i;
        this.coordinateType = i2;
    }

    private GeofenceRequest(Parcel parcel) {
        this.geofenceList = parcel.createTypedArrayList(GeofenceEntity.CREATOR);
        this.initConversions = parcel.readInt();
        this.coordinateType = parcel.readInt();
    }
}
