package com.huawei.hms.support.api.entity.hwid;

import android.os.Parcel;
import android.os.Parcelable;
import vigqyno.C0201;

public class LabelInfo implements Parcelable {
    public static final Parcelable.Creator<LabelInfo> CREATOR = new Parcelable.Creator<LabelInfo>() {
        /* class com.huawei.hms.support.api.entity.hwid.LabelInfo.AnonymousClass1 */

        /* renamed from: a */
        public LabelInfo createFromParcel(Parcel parcel) {
            return new LabelInfo(parcel);
        }

        /* renamed from: a */
        public LabelInfo[] newArray(int i) {
            return new LabelInfo[i];
        }
    };
    private int a;
    private String b;

    public LabelInfo() {
        this.a = -1;
        this.b = C0201.m82(10556);
    }

    public int describeContents() {
        return 0;
    }

    public String getLabelName() {
        return this.b;
    }

    public int getLabelType() {
        return this.a;
    }

    public boolean isEquals(LabelInfo labelInfo) {
        return labelInfo != null && getLabelType() == labelInfo.getLabelType() && getLabelName().equals(labelInfo.getLabelName());
    }

    public void setLabelName(String str) {
        this.b = str;
    }

    public void setLabelType(int i) {
        this.a = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
    }

    public LabelInfo(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readString();
    }
}
