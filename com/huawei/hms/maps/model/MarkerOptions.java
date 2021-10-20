package com.huawei.hms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import com.huawei.hms.feature.dynamic.IObjectWrapper;

public class MarkerOptions implements Parcelable {
    public static final Parcelable.Creator<MarkerOptions> CREATOR = new Parcelable.Creator<MarkerOptions>() {
        /* class com.huawei.hms.maps.model.MarkerOptions.AnonymousClass1 */

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MarkerOptions createFromParcel(Parcel parcel) {
            return new MarkerOptions(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MarkerOptions[] newArray(int i) {
            return new MarkerOptions[i];
        }
    };
    private LatLng a;
    private String b;
    private String c;
    private BitmapDescriptor d;
    private float e = 0.5f;
    private float f = 1.0f;
    private boolean g;
    private boolean h = true;
    private boolean i = false;
    private float j = 0.0f;
    private float k = 0.5f;
    private float l = 0.0f;
    private float m = 1.0f;
    private float n;
    private boolean o = false;
    private float p = 0.5f;
    private float q = 1.0f;
    private boolean r = false;

    public MarkerOptions() {
    }

    public MarkerOptions(Parcel parcel) {
        ParcelReader parcelReader = new ParcelReader(parcel);
        this.a = (LatLng) parcelReader.readParcelable(2, LatLng.CREATOR, null);
        this.b = parcelReader.createString(3, null);
        this.c = parcelReader.createString(4, null);
        this.e = parcelReader.readFloat(5, 0.0f);
        this.f = parcelReader.readFloat(6, 0.0f);
        this.g = parcelReader.readBoolean(7, true);
        this.h = parcelReader.readBoolean(8, true);
        this.i = parcelReader.readBoolean(9, true);
        this.j = parcelReader.readFloat(10, 0.0f);
        this.k = parcelReader.readFloat(11, 0.0f);
        this.l = parcelReader.readFloat(12, 0.0f);
        this.m = parcelReader.readFloat(13, 0.0f);
        this.n = parcelReader.readFloat(14, 0.0f);
        this.o = parcelReader.readBoolean(15, false);
        IBinder readIBinder = parcelReader.readIBinder(16, null);
        if (readIBinder != null) {
            this.d = new BitmapDescriptor(IObjectWrapper.Stub.asInterface(readIBinder));
        }
        this.p = parcelReader.readFloat(17, 0.0f);
        this.q = parcelReader.readFloat(18, 0.0f);
        this.r = parcelReader.readBoolean(19, false);
    }

    public MarkerOptions alpha(float f2) {
        this.m = f2;
        return this;
    }

    @Deprecated
    public MarkerOptions anchor(float f2, float f3) {
        this.r = false;
        this.e = f2;
        this.f = f3;
        return this;
    }

    public MarkerOptions anchorMarker(float f2, float f3) {
        this.r = true;
        this.p = f2;
        this.q = f3;
        return this;
    }

    public MarkerOptions clusterable(boolean z) {
        this.o = z;
        return this;
    }

    public int describeContents() {
        return 0;
    }

    public MarkerOptions draggable(boolean z) {
        this.g = z;
        return this;
    }

    public MarkerOptions flat(boolean z) {
        this.i = z;
        return this;
    }

    public float getAlpha() {
        return this.m;
    }

    @Deprecated
    public float getAnchorU() {
        return this.e;
    }

    @Deprecated
    public float getAnchorV() {
        return this.f;
    }

    public BitmapDescriptor getIcon() {
        return this.d;
    }

    public float getInfoWindowAnchorU() {
        return this.k;
    }

    public float getInfoWindowAnchorV() {
        return this.l;
    }

    public float getMarkerAnchorU() {
        return this.p;
    }

    public float getMarkerAnchorV() {
        return this.q;
    }

    public final LatLng getPosition() {
        return this.a;
    }

    public float getRotation() {
        return this.j;
    }

    public String getSnippet() {
        return this.c;
    }

    public String getTitle() {
        return this.b;
    }

    public float getZIndex() {
        return this.n;
    }

    public MarkerOptions icon(BitmapDescriptor bitmapDescriptor) {
        this.d = bitmapDescriptor;
        return this;
    }

    public MarkerOptions infoWindowAnchor(float f2, float f3) {
        this.k = f2;
        this.l = f3;
        return this;
    }

    public boolean isDraggable() {
        return this.g;
    }

    public boolean isFlat() {
        return this.i;
    }

    public boolean isNewAnchorSetting() {
        return this.r;
    }

    public boolean isVisible() {
        return this.h;
    }

    public boolean ismClusterable() {
        return this.o;
    }

    public MarkerOptions position(LatLng latLng) {
        this.a = latLng;
        return this;
    }

    public MarkerOptions rotation(float f2) {
        this.j = f2;
        return this;
    }

    public MarkerOptions snippet(String str) {
        this.c = str;
        return this;
    }

    public MarkerOptions title(String str) {
        this.b = str;
        return this;
    }

    public MarkerOptions visible(boolean z) {
        this.h = z;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int beginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeParcelable(2, this.a, i2, false);
        parcelWrite.writeString(3, this.b, false);
        parcelWrite.writeString(4, this.c, false);
        parcelWrite.writeFloat(5, this.e);
        parcelWrite.writeFloat(6, this.f);
        parcelWrite.writeBoolean(7, this.g);
        parcelWrite.writeBoolean(8, this.h);
        parcelWrite.writeBoolean(9, this.i);
        parcelWrite.writeFloat(10, this.j);
        parcelWrite.writeFloat(11, this.k);
        parcelWrite.writeFloat(12, this.l);
        parcelWrite.writeFloat(13, this.m);
        parcelWrite.writeFloat(14, this.n);
        parcelWrite.writeBoolean(15, this.o);
        BitmapDescriptor bitmapDescriptor = this.d;
        parcelWrite.writeIBinder(16, bitmapDescriptor != null ? bitmapDescriptor.getObject().asBinder() : null, true);
        parcelWrite.writeFloat(17, this.p);
        parcelWrite.writeFloat(18, this.q);
        parcelWrite.writeBoolean(19, this.r);
        parcelWrite.finishObjectHeader(beginObjectHeader);
    }

    public MarkerOptions zIndex(float f2) {
        this.n = f2;
        return this;
    }
}
