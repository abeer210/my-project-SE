package com.huawei.hms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import com.huawei.hms.common.util.Objects;
import vigqyno.C0201;

@Deprecated
public class StreetViewPanoramaLocation implements Parcelable {
    public static final Parcelable.Creator<StreetViewPanoramaLocation> CREATOR = new Parcelable.Creator<StreetViewPanoramaLocation>() {
        /* class com.huawei.hms.maps.model.StreetViewPanoramaLocation.AnonymousClass1 */

        @Override // android.os.Parcelable.Creator
        public final StreetViewPanoramaLocation createFromParcel(Parcel parcel) {
            return new StreetViewPanoramaLocation(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final StreetViewPanoramaLocation[] newArray(int i) {
            return new StreetViewPanoramaLocation[i];
        }
    };
    public StreetViewPanoramaLink[] links;
    public final String panoId;
    public final LatLng position;

    public StreetViewPanoramaLocation(Parcel parcel) {
        ParcelReader parcelReader = new ParcelReader(parcel);
        this.links = (StreetViewPanoramaLink[]) parcelReader.createTypedArray(2, StreetViewPanoramaLink.CREATOR, null);
        this.panoId = parcelReader.createString(3, null);
        this.position = (LatLng) parcelReader.readParcelable(4, LatLng.CREATOR, null);
    }

    public StreetViewPanoramaLocation(StreetViewPanoramaLink[] streetViewPanoramaLinkArr, LatLng latLng, String str) {
        this.links = streetViewPanoramaLinkArr;
        this.position = latLng;
        this.panoId = str;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLocation)) {
            return false;
        }
        StreetViewPanoramaLocation streetViewPanoramaLocation = (StreetViewPanoramaLocation) obj;
        return this.panoId.equals(streetViewPanoramaLocation.panoId) && this.position.equals(streetViewPanoramaLocation.position);
    }

    public int hashCode() {
        return Objects.hashCode(this.position, this.panoId);
    }

    public String toString() {
        return Objects.toStringHelper(this).add(C0201.m82(36008), this.panoId).add(C0201.m82(36009), this.position.toString()).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int beginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeTypedArray(2, this.links, i, false);
        parcelWrite.writeString(3, this.panoId, false);
        parcelWrite.writeParcelable(4, this.position, i, false);
        parcelWrite.finishObjectHeader(beginObjectHeader);
    }
}
