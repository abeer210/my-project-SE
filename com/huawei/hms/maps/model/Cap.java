package com.huawei.hms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.Preconditions;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import com.huawei.hms.common.util.Objects;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import java.util.Locale;
import vigqyno.C0201;

public class Cap implements Parcelable {
    public static final Parcelable.Creator<Cap> CREATOR = new Parcelable.Creator<Cap>() {
        /* class com.huawei.hms.maps.model.Cap.AnonymousClass1 */

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Cap createFromParcel(Parcel parcel) {
            return Cap.a(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Cap[] newArray(int i) {
            return new Cap[i];
        }
    };
    public static final int TYPE_BUTT_CAP = 0;
    public static final int TYPE_CUSTOM_CAP = 0;
    public static final int TYPE_ROUND_CAP = 0;
    public static final int TYPE_SQUARE_CAP = 0;
    private int a;
    private BitmapDescriptor b;
    private float c;

    static {
        C0201.m83(Cap.class, 569);
    }

    public Cap(int i) {
        this(i, Float.valueOf(0.0f));
    }

    private Cap(int i, BitmapDescriptor bitmapDescriptor, Float f) {
        Preconditions.checkArgument(i != 3 || (bitmapDescriptor != null && (f != null && (f.floatValue() > 0.0f ? 1 : (f.floatValue() == 0.0f ? 0 : -1)) > 0)), String.format(Locale.ENGLISH, C0201.m82(32730), Integer.valueOf(i), bitmapDescriptor, f));
        this.a = i;
        this.b = bitmapDescriptor;
        if (f != null) {
            this.c = f.floatValue();
        }
    }

    private Cap(int i, Float f) {
        this(i, null, f);
    }

    public Cap(BitmapDescriptor bitmapDescriptor, float f) {
        this(3, bitmapDescriptor, Float.valueOf(f));
    }

    public static Cap a(Parcel parcel) {
        ParcelReader parcelReader = new ParcelReader(parcel);
        int readInt = parcelReader.readInt(2, 3);
        if (readInt == 0) {
            return new ButtCap();
        }
        if (readInt == 1) {
            return new SquareCap();
        }
        if (readInt == 2) {
            return new RoundCap();
        }
        if (readInt == 3) {
            IBinder readIBinder = parcelReader.readIBinder(3, null);
            float readFloat = parcelReader.readFloat(4, 0.0f);
            if (readIBinder != null) {
                BitmapDescriptor bitmapDescriptor = new BitmapDescriptor(IObjectWrapper.Stub.asInterface(readIBinder));
                return readFloat != 0.0f ? new CustomCap(bitmapDescriptor, readFloat) : new CustomCap(bitmapDescriptor);
            }
        }
        return null;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cap)) {
            return false;
        }
        Cap cap = (Cap) obj;
        return this.a == cap.a && Objects.equal(this.b, cap.b) && Objects.equal(Float.valueOf(this.c), Float.valueOf(cap.c));
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.a), this.b, Float.valueOf(this.c));
    }

    public String toString() {
        return C0201.m82(32731) + this.a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int beginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeInt(2, this.a);
        BitmapDescriptor bitmapDescriptor = this.b;
        parcelWrite.writeIBinder(3, bitmapDescriptor != null ? bitmapDescriptor.getObject().asBinder() : null, true);
        parcelWrite.writeFloat(4, this.c);
        parcelWrite.finishObjectHeader(beginObjectHeader);
    }
}
