package com.huawei.hms.location;

import android.os.Parcel;
import android.os.Parcelable;
import vigqyno.C0201;

public class ActivityConversionData implements Parcelable {
    public static final Parcelable.Creator<ActivityConversionData> CREATOR = new Parcelable.Creator<ActivityConversionData>() {
        /* class com.huawei.hms.location.ActivityConversionData.AnonymousClass1 */

        /* renamed from: a */
        public ActivityConversionData createFromParcel(Parcel parcel) {
            return new ActivityConversionData(parcel);
        }

        /* renamed from: a */
        public ActivityConversionData[] newArray(int i) {
            return new ActivityConversionData[0];
        }
    };
    private int a;
    private int b;
    private long c;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityConversionData)) {
            return false;
        }
        ActivityConversionData activityConversionData = (ActivityConversionData) obj;
        if (this.a == activityConversionData.getActivityType() && this.b == activityConversionData.getConversionType() && this.c == activityConversionData.getElapsedTimeFromReboot()) {
            return true;
        }
        return false;
    }

    public int getActivityType() {
        return this.a;
    }

    public int getConversionType() {
        return this.b;
    }

    public long getElapsedTimeFromReboot() {
        return this.c;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return C0201.m82(4493) + this.a + C0201.m82(4494) + this.b + C0201.m82(4495) + this.c + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeLong(this.c);
    }

    public ActivityConversionData() {
    }

    public ActivityConversionData(int i, int i2, long j) {
        this.a = i;
        this.b = i2;
        this.c = j;
    }

    private ActivityConversionData(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readLong();
    }
}
