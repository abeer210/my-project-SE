package com.huawei.hms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import com.huawei.hms.maps.mco;
import java.util.Objects;
import vigqyno.C0201;

public class LatLng implements Parcelable {
    public static final Parcelable.Creator<LatLng> CREATOR = new Parcelable.Creator<LatLng>() {
        /* class com.huawei.hms.maps.model.LatLng.AnonymousClass1 */

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LatLng createFromParcel(Parcel parcel) {
            return new LatLng(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LatLng[] newArray(int i) {
            return new LatLng[i];
        }
    };
    public double latitude;
    public double longitude;

    public LatLng(double d, double d2) {
        if ((-180.0d >= d2 || d2 >= 180.0d) && Math.abs(d2 + 180.0d) >= 1.0E-6d) {
            this.longitude = ((((d2 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
            mco.d(C0201.m82(37159), C0201.m82(37160));
        } else {
            this.longitude = d2;
        }
        this.latitude = Math.max(-90.0d, Math.min(90.0d, d));
    }

    public LatLng(Parcel parcel) {
        ParcelReader parcelReader = new ParcelReader(parcel);
        this.latitude = parcelReader.readDouble(2, 0.0d);
        this.longitude = parcelReader.readDouble(3, 0.0d);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.compare(latLng.latitude, this.latitude) == 0 && Double.compare(latLng.longitude, this.longitude) == 0;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.latitude), Double.valueOf(this.longitude));
    }

    public final String toString() {
        return C0201.m82(37161) + this.latitude + C0201.m82(37162) + this.longitude;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int beginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeDouble(2, this.latitude);
        parcelWrite.writeDouble(3, this.longitude);
        parcelWrite.finishObjectHeader(beginObjectHeader);
    }
}
