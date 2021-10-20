package com.huawei.hms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PolylineOptions implements Parcelable {
    public static final Parcelable.Creator<PolylineOptions> CREATOR = new Parcelable.Creator<PolylineOptions>() {
        /* class com.huawei.hms.maps.model.PolylineOptions.AnonymousClass1 */

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PolylineOptions createFromParcel(Parcel parcel) {
            return new PolylineOptions(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ PolylineOptions[] newArray(int i) {
            return new PolylineOptions[i];
        }
    };
    private final List<LatLng> a;
    private int b;
    private float c;
    private float d;
    private boolean e;
    private boolean f;
    private boolean g;
    private Cap h;
    private Cap i;
    private int j;
    private List<PatternItem> k;

    public PolylineOptions() {
        this.a = new ArrayList();
        this.c = 10.0f;
        this.b = -16777216;
        this.f = false;
        this.g = false;
        this.e = true;
        this.h = null;
        this.i = null;
        this.j = 0;
        this.k = null;
    }

    public PolylineOptions(Parcel parcel) {
        ParcelReader parcelReader = new ParcelReader(parcel);
        this.a = parcelReader.createTypedList(2, LatLng.CREATOR, new ArrayList());
        this.b = parcelReader.readInt(3, 0);
        this.c = parcelReader.readFloat(4, 10.0f);
        this.d = parcelReader.readFloat(5, 0.0f);
        this.e = parcelReader.readBoolean(6, true);
        this.f = parcelReader.readBoolean(7, false);
        this.g = parcelReader.readBoolean(8, false);
        this.h = (Cap) parcelReader.readParcelable(9, Cap.CREATOR, null);
        this.i = (Cap) parcelReader.readParcelable(10, Cap.CREATOR, null);
        this.j = parcelReader.readInt(11, 0);
        this.k = parcelReader.createTypedList(12, PatternItem.CREATOR, null);
    }

    public PolylineOptions add(LatLng latLng) {
        this.a.add(latLng);
        return this;
    }

    public PolylineOptions add(LatLng... latLngArr) {
        this.a.addAll(Arrays.asList(latLngArr));
        return this;
    }

    public PolylineOptions addAll(Iterable<LatLng> iterable) {
        for (LatLng latLng : iterable) {
            this.a.add(latLng);
        }
        return this;
    }

    public PolylineOptions clickable(boolean z) {
        this.f = z;
        return this;
    }

    public PolylineOptions color(int i2) {
        this.b = i2;
        return this;
    }

    public int describeContents() {
        return 0;
    }

    public PolylineOptions endCap(Cap cap) {
        this.i = cap;
        return this;
    }

    public PolylineOptions geodesic(boolean z) {
        this.g = z;
        return this;
    }

    public int getColor() {
        return this.b;
    }

    public Cap getEndCap() {
        return this.i;
    }

    public int getJointType() {
        return this.j;
    }

    public List<PatternItem> getPattern() {
        return this.k;
    }

    public List<LatLng> getPoints() {
        return this.a;
    }

    public Cap getStartCap() {
        return this.h;
    }

    public float getWidth() {
        return this.c;
    }

    public float getZIndex() {
        return this.d;
    }

    public boolean isClickable() {
        return this.f;
    }

    public boolean isGeodesic() {
        return this.g;
    }

    public boolean isVisible() {
        return this.e;
    }

    public PolylineOptions jointType(int i2) {
        this.j = i2;
        return this;
    }

    public PolylineOptions pattern(List<PatternItem> list) {
        this.k = list;
        return this;
    }

    public PolylineOptions startCap(Cap cap) {
        this.h = cap;
        return this;
    }

    public PolylineOptions visible(boolean z) {
        this.e = z;
        return this;
    }

    public PolylineOptions width(float f2) {
        this.c = f2;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int beginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeTypedList(2, this.a, false);
        parcelWrite.writeInt(3, this.b);
        parcelWrite.writeFloat(4, this.c);
        parcelWrite.writeFloat(5, this.d);
        parcelWrite.writeBoolean(6, this.e);
        parcelWrite.writeBoolean(7, this.f);
        parcelWrite.writeBoolean(8, this.g);
        parcelWrite.writeParcelable(9, this.h, i2, false);
        parcelWrite.writeParcelable(10, this.i, i2, false);
        parcelWrite.writeInt(11, this.j);
        parcelWrite.writeTypedList(12, this.k, false);
        parcelWrite.finishObjectHeader(beginObjectHeader);
    }

    public PolylineOptions zIndex(float f2) {
        this.d = f2;
        return this;
    }
}
