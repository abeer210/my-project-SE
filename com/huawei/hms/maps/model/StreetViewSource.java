package com.huawei.hms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import com.huawei.hms.common.util.Objects;
import vigqyno.C0201;

@Deprecated
public class StreetViewSource implements Parcelable {
    public static final Parcelable.Creator<StreetViewSource> CREATOR = new Parcelable.Creator<StreetViewSource>() {
        /* class com.huawei.hms.maps.model.StreetViewSource.AnonymousClass1 */

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ StreetViewSource createFromParcel(Parcel parcel) {
            return new StreetViewSource(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ StreetViewSource[] newArray(int i) {
            return new StreetViewSource[i];
        }
    };
    public static final StreetViewSource DEFAULT = new StreetViewSource(0);
    public static final StreetViewSource OUTDOOR = new StreetViewSource(1);
    public static final int TYPE_DEFAULT = 0;
    public static final int TYPE_OUTDOOR = 0;
    private final int a;

    static {
        C0201.m83(StreetViewSource.class, 574);
    }

    public StreetViewSource(int i) {
        this.a = i;
    }

    public StreetViewSource(Parcel parcel) {
        this.a = new ParcelReader(parcel).readInt(2, 0);
    }

    public int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StreetViewSource) && this.a == ((StreetViewSource) obj).a;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.a));
    }

    public final String toString() {
        return C0201.m82(32235) + String.valueOf(this.a);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int beginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeInt(2, this.a);
        parcelWrite.finishObjectHeader(beginObjectHeader);
    }
}
