package com.huawei.hms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import java.util.Arrays;
import vigqyno.C0201;

@Deprecated
public class StreetViewPanoramaCamera implements Parcelable {
    public static final Parcelable.Creator<StreetViewPanoramaCamera> CREATOR = new Parcelable.Creator<StreetViewPanoramaCamera>() {
        /* class com.huawei.hms.maps.model.StreetViewPanoramaCamera.AnonymousClass1 */

        @Override // android.os.Parcelable.Creator
        public final StreetViewPanoramaCamera createFromParcel(Parcel parcel) {
            return new StreetViewPanoramaCamera(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final StreetViewPanoramaCamera[] newArray(int i) {
            return new StreetViewPanoramaCamera[i];
        }
    };
    private final StreetViewPanoramaOrientation a;
    public final float bearing;
    public final float tilt;
    public final float zoom;

    public static class Builder {
        public float bearing;
        public float tilt;
        public float zoom;

        public Builder() {
        }

        public Builder(StreetViewPanoramaCamera streetViewPanoramaCamera) {
            this.bearing = streetViewPanoramaCamera.bearing;
            this.tilt = streetViewPanoramaCamera.tilt;
            this.zoom = streetViewPanoramaCamera.zoom;
        }

        public Builder bearing(float f) {
            this.bearing = f;
            return this;
        }

        public StreetViewPanoramaCamera build() {
            return new StreetViewPanoramaCamera(this.bearing, this.tilt, this.zoom);
        }

        public Builder orientation(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
            this.bearing = streetViewPanoramaOrientation.bearing;
            this.tilt = streetViewPanoramaOrientation.tilt;
            return this;
        }

        public Builder tilt(float f) {
            this.tilt = f;
            return this;
        }

        public Builder zoom(float f) {
            this.zoom = f;
            return this;
        }
    }

    public StreetViewPanoramaCamera(float f, float f2, float f3) {
        this.zoom = f;
        this.tilt = f2;
        this.bearing = f3;
        this.a = new StreetViewPanoramaOrientation(f2, f3);
    }

    public StreetViewPanoramaCamera(Parcel parcel) {
        ParcelReader parcelReader = new ParcelReader(parcel);
        this.bearing = parcelReader.readFloat(2, 0.0f);
        this.tilt = parcelReader.readFloat(3, 0.0f);
        this.zoom = parcelReader.readFloat(4, 0.0f);
        this.a = new StreetViewPanoramaOrientation(this.tilt, this.bearing);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreetViewPanoramaCamera streetViewPanoramaCamera) {
        return new Builder(streetViewPanoramaCamera);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StreetViewPanoramaCamera) {
            StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) obj;
            return Float.floatToIntBits(this.zoom) == Float.floatToIntBits(streetViewPanoramaCamera.zoom) && Float.floatToIntBits(this.tilt) == Float.floatToIntBits(streetViewPanoramaCamera.tilt) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(streetViewPanoramaCamera.bearing);
        }
    }

    public StreetViewPanoramaOrientation getOrientation() {
        return this.a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.zoom), Float.valueOf(this.tilt), Float.valueOf(this.bearing)});
    }

    public String toString() {
        Float valueOf = Float.valueOf(this.zoom);
        Float valueOf2 = Float.valueOf(this.tilt);
        Float valueOf3 = Float.valueOf(this.bearing);
        StringBuilder sb = new StringBuilder(100);
        sb.append(C0201.m82(23797));
        sb.append(valueOf);
        String r0 = C0201.m82(23798);
        sb.append(r0);
        sb.append(valueOf2);
        sb.append(r0);
        sb.append(valueOf3);
        sb.append(C0201.m82(23799));
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int beginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeFloat(2, this.bearing);
        parcelWrite.writeFloat(3, this.tilt);
        parcelWrite.writeFloat(4, this.bearing);
        parcelWrite.finishObjectHeader(beginObjectHeader);
    }
}
