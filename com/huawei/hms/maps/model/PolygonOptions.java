package com.huawei.hms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PolygonOptions implements Parcelable {
    public static final Parcelable.Creator<PolygonOptions> CREATOR = new Parcelable.Creator<PolygonOptions>() {
        /* class com.huawei.hms.maps.model.PolygonOptions.AnonymousClass1 */

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PolygonOptions createFromParcel(Parcel parcel) {
            return new PolygonOptions(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ PolygonOptions[] newArray(int i) {
            return new PolygonOptions[i];
        }
    };
    private final List<LatLng> a;
    private final List<List<LatLng>> b;
    private float c;
    private int d;
    private int e;
    private float f;
    private boolean g;
    private boolean h;
    private boolean i;
    private int j;
    private List<PatternItem> k;

    public PolygonOptions() {
        this.c = 10.0f;
        this.d = -16777216;
        this.e = 0;
        this.f = 0.0f;
        this.g = true;
        this.h = false;
        this.i = false;
        this.j = 0;
        this.k = null;
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.k = new ArrayList();
    }

    public PolygonOptions(Parcel parcel) {
        this.c = 10.0f;
        this.d = -16777216;
        this.e = 0;
        this.f = 0.0f;
        this.g = true;
        this.h = false;
        this.i = false;
        this.j = 0;
        this.k = null;
        ParcelReader parcelReader = new ParcelReader(parcel);
        this.a = parcelReader.createTypedList(2, LatLng.CREATOR, new ArrayList());
        ArrayList arrayList = new ArrayList();
        parcelReader.readList(3, arrayList, LatLng.class.getClassLoader());
        this.b = arrayList;
        this.c = parcelReader.readFloat(4, 0.0f);
        this.d = parcelReader.readInt(5, 0);
        this.e = parcelReader.readInt(6, 0);
        this.f = parcelReader.readFloat(7, 0.0f);
        this.g = parcelReader.readBoolean(8, true);
        this.h = parcelReader.readBoolean(9, true);
        this.i = parcelReader.readBoolean(10, true);
        this.j = parcelReader.readInt(11, 0);
        this.k = parcelReader.createTypedList(12, PatternItem.CREATOR, null);
    }

    public PolygonOptions add(LatLng latLng) {
        this.a.add(latLng);
        return this;
    }

    public PolygonOptions add(LatLng... latLngArr) {
        this.a.addAll(Arrays.asList(latLngArr));
        return this;
    }

    public PolygonOptions addAll(Iterable<LatLng> iterable) {
        for (LatLng latLng : iterable) {
            this.a.add(latLng);
        }
        return this;
    }

    public PolygonOptions addHole(Iterable<LatLng> iterable) {
        ArrayList arrayList = new ArrayList();
        for (LatLng latLng : iterable) {
            arrayList.add(latLng);
        }
        this.b.add(arrayList);
        return this;
    }

    public PolygonOptions clickable(boolean z) {
        this.i = z;
        return this;
    }

    public int describeContents() {
        return 0;
    }

    public PolygonOptions fillColor(int i2) {
        this.e = i2;
        return this;
    }

    public PolygonOptions geodesic(boolean z) {
        this.h = z;
        return this;
    }

    public int getFillColor() {
        return this.e;
    }

    public List<List<LatLng>> getHoles() {
        return this.b;
    }

    public List<LatLng> getPoints() {
        return this.a;
    }

    public int getStrokeColor() {
        return this.d;
    }

    public int getStrokeJointType() {
        return this.j;
    }

    public List<PatternItem> getStrokePattern() {
        return this.k;
    }

    public float getStrokeWidth() {
        return this.c;
    }

    public float getZIndex() {
        return this.f;
    }

    public boolean isClickable() {
        return this.i;
    }

    public boolean isGeodesic() {
        return this.h;
    }

    public boolean isVisible() {
        return this.g;
    }

    public PolygonOptions strokeColor(int i2) {
        this.d = i2;
        return this;
    }

    public PolygonOptions strokeJointType(int i2) {
        this.j = i2;
        return this;
    }

    public PolygonOptions strokePattern(List<PatternItem> list) {
        this.k = list;
        return this;
    }

    public PolygonOptions strokeWidth(float f2) {
        this.c = f2;
        return this;
    }

    public PolygonOptions visible(boolean z) {
        this.g = z;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int beginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeTypedList(2, this.a, false);
        parcelWrite.writeList(3, this.b, false);
        parcelWrite.writeFloat(4, this.c);
        parcelWrite.writeInt(5, this.d);
        parcelWrite.writeInt(6, this.e);
        parcelWrite.writeFloat(7, this.f);
        parcelWrite.writeBoolean(8, this.g);
        parcelWrite.writeBoolean(9, this.h);
        parcelWrite.writeBoolean(10, this.i);
        parcelWrite.writeInt(11, this.j);
        parcelWrite.writeTypedList(12, this.k, false);
        parcelWrite.finishObjectHeader(beginObjectHeader);
    }

    public PolygonOptions zIndex(float f2) {
        this.f = f2;
        return this;
    }
}
