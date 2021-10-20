package com.huawei.hms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import com.huawei.hms.maps.model.LatLng;
import com.huawei.hms.maps.model.StreetViewPanoramaCamera;
import com.huawei.hms.maps.model.StreetViewSource;
import vigqyno.C0201;

@Deprecated
public final class StreetViewPanoramaOptions implements Parcelable {
    public static final Parcelable.Creator<StreetViewPanoramaOptions> CREATOR = new Parcelable.Creator<StreetViewPanoramaOptions>() {
        /* class com.huawei.hms.maps.StreetViewPanoramaOptions.AnonymousClass1 */

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ StreetViewPanoramaOptions createFromParcel(Parcel parcel) {
            return new StreetViewPanoramaOptions(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ StreetViewPanoramaOptions[] newArray(int i) {
            return new StreetViewPanoramaOptions[i];
        }
    };
    private StreetViewPanoramaCamera a;
    private String b;
    private LatLng c;
    private Integer d;
    private Boolean e;
    private Boolean f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private StreetViewSource j;

    public StreetViewPanoramaOptions() {
        Boolean bool = Boolean.TRUE;
        this.e = bool;
        this.f = bool;
        this.g = bool;
        this.h = bool;
    }

    public StreetViewPanoramaOptions(Parcel parcel) {
        Boolean bool = Boolean.TRUE;
        this.e = bool;
        this.f = bool;
        this.g = bool;
        this.h = bool;
        ParcelReader parcelReader = new ParcelReader(parcel);
        this.g = parcelReader.readBooleanObject(2, null);
        this.b = parcelReader.createString(3, null);
        this.c = (LatLng) parcelReader.readParcelable(4, LatLng.CREATOR, null);
        this.d = parcelReader.readIntegerObject(5, null);
        this.j = (StreetViewSource) parcelReader.readParcelable(6, StreetViewSource.CREATOR, null);
        this.h = parcelReader.readBooleanObject(7, null);
        this.a = (StreetViewPanoramaCamera) parcelReader.readParcelable(8, StreetViewPanoramaCamera.CREATOR, null);
        this.i = parcelReader.readBooleanObject(9, null);
        this.e = parcelReader.readBooleanObject(10, null);
        this.f = parcelReader.readBooleanObject(11, null);
    }

    public final int describeContents() {
        return 0;
    }

    public final Boolean getPanningGesturesEnabled() {
        return Boolean.FALSE;
    }

    public final String getPanoramaId() {
        return C0201.m82(29410);
    }

    public final LatLng getPosition() {
        return new LatLng(0.0d, 0.0d);
    }

    public final Integer getRadius() {
        return 0;
    }

    public final StreetViewSource getSource() {
        return this.j;
    }

    public final Boolean getStreetNamesEnabled() {
        return Boolean.FALSE;
    }

    public final StreetViewPanoramaCamera getStreetViewPanoramaCamera() {
        return this.a;
    }

    public final Boolean getUseViewLifecycleInFragment() {
        return Boolean.FALSE;
    }

    public final Boolean getUserNavigationEnabled() {
        return Boolean.FALSE;
    }

    public final Boolean getZoomGesturesEnabled() {
        return Boolean.FALSE;
    }

    public final StreetViewPanoramaOptions panningGesturesEnabled(boolean z) {
        this.g = Boolean.valueOf(z);
        return this;
    }

    public final StreetViewPanoramaOptions panoramaCamera(StreetViewPanoramaCamera streetViewPanoramaCamera) {
        this.a = streetViewPanoramaCamera;
        return this;
    }

    public final StreetViewPanoramaOptions panoramaId(String str) {
        this.b = str;
        return this;
    }

    public final StreetViewPanoramaOptions position(LatLng latLng) {
        this.c = latLng;
        return this;
    }

    public final StreetViewPanoramaOptions position(LatLng latLng, StreetViewSource streetViewSource) {
        this.c = latLng;
        this.j = streetViewSource;
        return this;
    }

    public final StreetViewPanoramaOptions position(LatLng latLng, Integer num) {
        this.c = latLng;
        this.d = num;
        return this;
    }

    public final StreetViewPanoramaOptions position(LatLng latLng, Integer num, StreetViewSource streetViewSource) {
        this.c = latLng;
        this.d = num;
        this.j = streetViewSource;
        return this;
    }

    public final StreetViewPanoramaOptions streetNamesEnabled(boolean z) {
        this.h = Boolean.valueOf(z);
        return this;
    }

    public final String toString() {
        return C0201.m82(29411);
    }

    public final StreetViewPanoramaOptions useViewLifecycleInFragment(boolean z) {
        this.i = Boolean.valueOf(z);
        return this;
    }

    public final StreetViewPanoramaOptions userNavigationEnabled(boolean z) {
        this.e = Boolean.valueOf(z);
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int beginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeBooleanObject(2, this.g);
        parcelWrite.writeString(3, this.b, false);
        parcelWrite.writeParcelable(4, this.c, i2, false);
        parcelWrite.writeIntegerObject(5, this.d, false);
        parcelWrite.writeParcelable(6, this.j, i2, false);
        parcelWrite.writeBooleanObject(7, this.h, false);
        parcelWrite.writeParcelable(8, this.a, i2, false);
        parcelWrite.writeBooleanObject(9, this.i, false);
        parcelWrite.writeBooleanObject(10, this.e, false);
        parcelWrite.writeBooleanObject(11, this.f, false);
        parcelWrite.finishObjectHeader(beginObjectHeader);
    }

    public final StreetViewPanoramaOptions zoomGesturesEnabled(boolean z) {
        this.f = Boolean.valueOf(z);
        return this;
    }
}
