package com.huawei.hms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import vigqyno.C0201;

public final class mbw implements Parcelable {
    public static final Parcelable.Creator<mbw> CREATOR = new Parcelable.Creator<mbw>() {
        /* class com.huawei.hms.maps.mbw.AnonymousClass1 */

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ mbw createFromParcel(Parcel parcel) {
            return new mbw(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ mbw[] newArray(int i) {
            return new mbw[i];
        }
    };
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public long f;

    public mbw() {
    }

    public mbw(Parcel parcel) {
        ParcelReader parcelReader = new ParcelReader(parcel);
        String r1 = C0201.m82(31088);
        this.a = parcelReader.createString(2, r1);
        this.b = parcelReader.createString(3, r1);
        this.c = parcelReader.createString(4, r1);
        this.d = parcelReader.createString(5, r1);
        this.e = parcelReader.createString(6, r1);
        this.f = parcelReader.readLong(7, 0);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int beginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeString(2, this.a, false);
        parcelWrite.writeString(3, this.b, false);
        parcelWrite.writeString(4, this.c, false);
        parcelWrite.writeString(5, this.d, false);
        parcelWrite.writeString(6, this.e, false);
        parcelWrite.writeLong(7, this.f);
        parcelWrite.finishObjectHeader(beginObjectHeader);
    }
}
