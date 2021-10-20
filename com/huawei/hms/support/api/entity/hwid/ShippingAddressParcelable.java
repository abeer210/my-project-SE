package com.huawei.hms.support.api.entity.hwid;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public class ShippingAddressParcelable implements Parcelable {
    public static final Parcelable.Creator<ShippingAddressParcelable> CREATOR = new Parcelable.Creator<ShippingAddressParcelable>() {
        /* class com.huawei.hms.support.api.entity.hwid.ShippingAddressParcelable.AnonymousClass1 */

        /* renamed from: a */
        public ShippingAddressParcelable createFromParcel(Parcel parcel) {
            return new ShippingAddressParcelable(parcel);
        }

        /* renamed from: a */
        public ShippingAddressParcelable[] newArray(int i) {
            return new ShippingAddressParcelable[i];
        }
    };
    private ArrayList<ShippingAddressInfo> a;

    public ShippingAddressParcelable() {
    }

    public int describeContents() {
        return 0;
    }

    public ArrayList<ShippingAddressInfo> getShippingAddressInfoList() {
        return this.a;
    }

    public void setShippingAddressInfoList(ArrayList<ShippingAddressInfo> arrayList) {
        this.a = arrayList;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.a);
    }

    public ShippingAddressParcelable(Parcel parcel) {
        this.a = parcel.createTypedArrayList(ShippingAddressInfo.CREATOR);
    }
}
