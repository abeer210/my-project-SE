package com.huawei.hms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import java.util.List;

public class CircleOptions implements Parcelable {
    public static final Parcelable.Creator<CircleOptions> CREATOR = new Parcelable.Creator<CircleOptions>() {
        /* class com.huawei.hms.maps.model.CircleOptions.AnonymousClass1 */

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CircleOptions createFromParcel(Parcel parcel) {
            return new CircleOptions(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CircleOptions[] newArray(int i) {
            return new CircleOptions[i];
        }
    };
    private LatLng a;
    private int b = 0;
    private double c;
    private int d = -16777216;
    private List<PatternItem> e;
    private float f = 10.0f;
    private float g = 0.0f;
    private boolean h = false;
    private boolean i = true;

    public CircleOptions() {
    }

    public CircleOptions(Parcel parcel) {
        ParcelReader parcelReader = new ParcelReader(parcel);
        this.a = (LatLng) parcelReader.readParcelable(2, LatLng.CREATOR, null);
        this.b = parcelReader.readInt(3, 0);
        this.c = parcelReader.readDouble(4, 0.0d);
        this.d = parcelReader.readInt(5, 0);
        this.e = parcelReader.createTypedList(6, PatternItem.CREATOR, null);
        this.f = parcelReader.readFloat(7, 0.0f);
        this.g = parcelReader.readFloat(8, 0.0f);
        this.h = parcelReader.readBoolean(9, true);
        this.i = parcelReader.readBoolean(10, true);
    }

    public CircleOptions center(LatLng latLng) {
        this.a = latLng;
        return this;
    }

    public CircleOptions clickable(boolean z) {
        this.h = z;
        return this;
    }

    public int describeContents() {
        return 0;
    }

    public CircleOptions fillColor(int i2) {
        this.b = i2;
        return this;
    }

    public LatLng getCenter() {
        return this.a;
    }

    public int getFillColor() {
        return this.b;
    }

    public double getRadius() {
        return this.c;
    }

    public int getStrokeColor() {
        return this.d;
    }

    public List<PatternItem> getStrokePattern() {
        return this.e;
    }

    public float getStrokeWidth() {
        return this.f;
    }

    public float getZIndex() {
        return this.g;
    }

    public boolean isClickable() {
        return this.h;
    }

    public boolean isVisible() {
        return this.i;
    }

    public CircleOptions radius(double d2) {
        this.c = d2;
        return this;
    }

    public CircleOptions strokeColor(int i2) {
        this.d = i2;
        return this;
    }

    public CircleOptions strokePattern(List<PatternItem> list) {
        this.e = list;
        return this;
    }

    public CircleOptions strokeWidth(float f2) {
        this.f = f2;
        return this;
    }

    public CircleOptions visible(boolean z) {
        this.i = z;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int beginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeParcelable(2, this.a, i2, false);
        parcelWrite.writeInt(3, this.b);
        parcelWrite.writeDouble(4, this.c);
        parcelWrite.writeInt(5, this.d);
        parcelWrite.writeTypedList(6, this.e, false);
        parcelWrite.writeFloat(7, this.f);
        parcelWrite.writeFloat(8, this.g);
        parcelWrite.writeBoolean(9, this.h);
        parcelWrite.writeBoolean(10, this.i);
        parcelWrite.finishObjectHeader(beginObjectHeader);
    }

    public CircleOptions zIndex(float f2) {
        this.g = f2;
        return this;
    }
}
