package com.huawei.hms.maps.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import com.huawei.hms.common.util.Objects;
import com.huawei.hms.maps.HuaweiMapOptions;
import vigqyno.C0201;

public class CameraPosition implements Parcelable {
    public static final float BEARING_360 = 0.0f;
    public static final Parcelable.Creator<CameraPosition> CREATOR = new Parcelable.Creator<CameraPosition>() {
        /* class com.huawei.hms.maps.model.CameraPosition.AnonymousClass1 */

        @Override // android.os.Parcelable.Creator
        public final CameraPosition createFromParcel(Parcel parcel) {
            return new CameraPosition(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CameraPosition[] newArray(int i) {
            return new CameraPosition[i];
        }
    };
    public static final int TILT_90 = 0;
    public final float bearing;
    public final LatLng target;
    public final float tilt;
    public final float zoom;

    public static class Builder {
        private LatLng a;
        private float b;
        private float c;
        private float d;

        public Builder() {
        }

        public Builder(CameraPosition cameraPosition) {
            this.a = cameraPosition.target;
            this.b = cameraPosition.zoom;
            this.c = cameraPosition.tilt;
            this.d = cameraPosition.bearing;
        }

        public Builder bearing(float f) {
            this.d = f;
            return this;
        }

        public CameraPosition build() {
            return new CameraPosition(this.a, this.b, this.c, this.d);
        }

        public Builder target(LatLng latLng) {
            this.a = latLng;
            return this;
        }

        public Builder tilt(float f) {
            this.c = f;
            return this;
        }

        public Builder zoom(float f) {
            this.b = f;
            return this;
        }
    }

    static {
        C0201.m83(CameraPosition.class, 440);
    }

    public CameraPosition(Parcel parcel) {
        ParcelReader parcelReader = new ParcelReader(parcel);
        this.target = (LatLng) parcelReader.readParcelable(2, LatLng.CREATOR, null);
        this.zoom = parcelReader.readFloat(3, 0.0f);
        this.tilt = parcelReader.readFloat(4, 0.0f);
        this.bearing = parcelReader.readFloat(5, 0.0f);
    }

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        if (latLng != null) {
            this.target = latLng;
            this.zoom = f;
            if (f2 < 0.0f || f2 > 90.0f) {
                throw new IllegalArgumentException(C0201.m82(11504));
            }
            this.tilt = f2 + 0.0f;
            this.bearing = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
            return;
        }
        throw new NullPointerException(C0201.m82(11505));
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CameraPosition cameraPosition) {
        return new Builder(cameraPosition);
    }

    public static CameraPosition createFromAttributes(Context context, AttributeSet attributeSet) {
        return HuaweiMapOptions.buildCameraPosition(context, attributeSet);
    }

    public static CameraPosition fromLatLngZoom(LatLng latLng, float f) {
        return new CameraPosition(latLng, f, 0.0f, 0.0f);
    }

    public int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.target.equals(cameraPosition.target) && Float.floatToIntBits(this.zoom) == Float.floatToIntBits(cameraPosition.zoom) && Float.floatToIntBits(this.tilt) == Float.floatToIntBits(cameraPosition.tilt) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(cameraPosition.bearing);
    }

    public final int hashCode() {
        return Objects.hashCode(this.target, Float.valueOf(this.zoom), Float.valueOf(this.tilt), Float.valueOf(this.bearing));
    }

    public final String toString() {
        return CameraPosition.class.getSimpleName() + C0201.m82(11506) + C0201.m82(11507) + this.bearing + C0201.m82(11508) + this.zoom + C0201.m82(11509) + this.tilt + C0201.m82(11510) + this.target + C0201.m82(11511);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int beginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeParcelable(2, this.target, i, false);
        parcelWrite.writeFloat(3, this.zoom);
        parcelWrite.writeFloat(4, this.tilt);
        parcelWrite.writeFloat(5, this.bearing);
        parcelWrite.finishObjectHeader(beginObjectHeader);
    }
}
