package com.huawei.hms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import vigqyno.C0201;

public class GroundOverlayOptions implements Parcelable {
    public static final Parcelable.Creator<GroundOverlayOptions> CREATOR = new Parcelable.Creator<GroundOverlayOptions>() {
        /* class com.huawei.hms.maps.model.GroundOverlayOptions.AnonymousClass1 */

        @Override // android.os.Parcelable.Creator
        public final GroundOverlayOptions createFromParcel(Parcel parcel) {
            return new GroundOverlayOptions(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final GroundOverlayOptions[] newArray(int i) {
            return new GroundOverlayOptions[i];
        }
    };
    public static final float NO_DIMENSION = 0.0f;
    private float a = 0.5f;
    private float b = 0.5f;
    private float c;
    private LatLngBounds d;
    private float e;
    private BitmapDescriptor f;
    private LatLng g;
    private float h = 0.0f;
    private float i;
    private float j;
    private boolean k;
    private boolean l = true;

    static {
        C0201.m83(GroundOverlayOptions.class, 493);
    }

    public GroundOverlayOptions() {
    }

    public GroundOverlayOptions(Parcel parcel) {
        ParcelReader parcelReader = new ParcelReader(parcel);
        this.a = parcelReader.readFloat(2, 0.0f);
        this.b = parcelReader.readFloat(3, 0.0f);
        this.c = parcelReader.readFloat(4, 0.0f);
        this.d = (LatLngBounds) parcelReader.readParcelable(5, LatLngBounds.CREATOR, null);
        this.e = parcelReader.readFloat(6, 0.0f);
        IBinder readIBinder = parcelReader.readIBinder(7, null);
        if (readIBinder != null) {
            this.f = new BitmapDescriptor(IObjectWrapper.Stub.asInterface(readIBinder));
        }
        this.g = (LatLng) parcelReader.readParcelable(8, LatLng.CREATOR, null);
        this.h = parcelReader.readFloat(9, 0.0f);
        this.i = parcelReader.readFloat(10, 0.0f);
        this.j = parcelReader.readFloat(11, 0.0f);
        this.k = parcelReader.readBoolean(12, true);
        this.l = parcelReader.readBoolean(13, true);
    }

    private static boolean a(float f2) {
        return f2 < 0.0f;
    }

    public GroundOverlayOptions anchor(float f2, float f3) {
        this.a = f2;
        this.b = f3;
        return this;
    }

    public GroundOverlayOptions bearing(float f2) {
        this.c = f2;
        return this;
    }

    public GroundOverlayOptions clickable(boolean z) {
        this.k = z;
        return this;
    }

    public int describeContents() {
        return 0;
    }

    public float getAnchorU() {
        return this.a;
    }

    public float getAnchorV() {
        return this.b;
    }

    public float getBearing() {
        return this.c;
    }

    public LatLngBounds getBounds() {
        return this.d;
    }

    public float getHeight() {
        return this.e;
    }

    public BitmapDescriptor getImage() {
        return this.f;
    }

    public LatLng getLocation() {
        return this.g;
    }

    public float getTransparency() {
        return this.h;
    }

    public float getWidth() {
        return this.i;
    }

    public float getZIndex() {
        return this.j;
    }

    public GroundOverlayOptions image(BitmapDescriptor bitmapDescriptor) {
        if (bitmapDescriptor != null) {
            this.f = bitmapDescriptor;
            return this;
        }
        throw new NullPointerException(C0201.m82(32038));
    }

    public boolean isClickable() {
        return this.k;
    }

    public boolean isVisible() {
        return this.l;
    }

    public GroundOverlayOptions position(LatLng latLng, float f2) {
        if (this.g != null) {
            throw new IllegalStateException(C0201.m82(32040));
        } else if (!a(f2)) {
            this.g = latLng;
            this.i = f2;
            this.e = -1.0f;
            return this;
        } else {
            throw new IllegalArgumentException(C0201.m82(32039));
        }
    }

    public GroundOverlayOptions position(LatLng latLng, float f2, float f3) {
        if (this.g != null) {
            throw new IllegalStateException(C0201.m82(32043));
        } else if (a(f2)) {
            throw new IllegalArgumentException(C0201.m82(32042));
        } else if (!a(f3)) {
            this.g = latLng;
            this.i = f2;
            this.e = f3;
            return this;
        } else {
            throw new IllegalArgumentException(C0201.m82(32041));
        }
    }

    public GroundOverlayOptions positionFromBounds(LatLngBounds latLngBounds) {
        if (this.g == null) {
            this.d = latLngBounds;
            return this;
        }
        throw new IllegalStateException(C0201.m82(32044));
    }

    public GroundOverlayOptions transparency(float f2) {
        if (f2 > 1.0f) {
            throw new IllegalArgumentException(C0201.m82(32046));
        } else if (f2 >= 0.0f) {
            this.h = f2;
            return this;
        } else {
            throw new IllegalArgumentException(C0201.m82(32045));
        }
    }

    public GroundOverlayOptions visible(boolean z) {
        this.l = z;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int beginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeFloat(2, this.a);
        parcelWrite.writeFloat(3, this.b);
        parcelWrite.writeFloat(4, this.c);
        parcelWrite.writeParcelable(5, this.d, i2, false);
        parcelWrite.writeFloat(6, this.e);
        parcelWrite.writeIBinder(7, this.f.getObject().asBinder(), false);
        parcelWrite.writeParcelable(8, this.g, i2, false);
        parcelWrite.writeFloat(9, this.h);
        parcelWrite.writeFloat(10, this.i);
        parcelWrite.writeFloat(11, this.j);
        parcelWrite.writeBoolean(12, this.k);
        parcelWrite.writeBoolean(13, this.l);
        parcelWrite.finishObjectHeader(beginObjectHeader);
    }

    public GroundOverlayOptions zIndex(float f2) {
        this.j = f2;
        return this;
    }
}
