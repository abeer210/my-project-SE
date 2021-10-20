package com.huawei.hms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.internal.Objects;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import vigqyno.C0201;

public class ActivityConversionInfo implements Parcelable, IMessageEntity {
    public static final Parcelable.Creator<ActivityConversionInfo> CREATOR = new Parcelable.Creator<ActivityConversionInfo>() {
        /* class com.huawei.hms.location.ActivityConversionInfo.AnonymousClass1 */

        /* renamed from: a */
        public ActivityConversionInfo createFromParcel(Parcel parcel) {
            return new ActivityConversionInfo(parcel);
        }

        /* renamed from: a */
        public ActivityConversionInfo[] newArray(int i) {
            return new ActivityConversionInfo[i];
        }
    };
    public static final int ENTER_ACTIVITY_CONVERSION = 0;
    public static final int EXIT_ACTIVITY_CONVERSION = 0;
    @Packed
    private int activityType;
    @Packed
    private int conversionType;

    public static class Builder {
        private int a = -1;
        private int b = -1;

        public ActivityConversionInfo build() {
            boolean z = true;
            Preconditions.checkState(this.a != -1, C0201.m82(9081));
            if (this.b == -1) {
                z = false;
            }
            Preconditions.checkState(z, C0201.m82(9082));
            return new ActivityConversionInfo(this.a, this.b);
        }

        public Builder setActivityType(int i) {
            ActivityIdentificationData.isValidType(i);
            this.a = i;
            return this;
        }

        public Builder setConversionType(int i) {
            this.b = i;
            return this;
        }
    }

    static {
        C0201.m83(ActivityConversionInfo.class, 509);
    }

    public ActivityConversionInfo() {
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return true;
        }
        if (!(obj instanceof ActivityConversionInfo)) {
            return false;
        }
        ActivityConversionInfo activityConversionInfo = (ActivityConversionInfo) obj;
        if (this.activityType == activityConversionInfo.getActivityType() && this.conversionType == activityConversionInfo.getConversionType()) {
            return true;
        }
        return false;
    }

    public int getActivityType() {
        return this.activityType;
    }

    public int getConversionType() {
        return this.conversionType;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.activityType), Integer.valueOf(this.conversionType));
    }

    public void setActivityType(int i) {
        this.activityType = i;
    }

    public void setConversionType(int i) {
        this.conversionType = i;
    }

    public String toString() {
        return C0201.m82(25199) + this.activityType + C0201.m82(25200) + this.conversionType + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.activityType);
        parcel.writeInt(this.conversionType);
    }

    public ActivityConversionInfo(int i, int i2) {
        this.activityType = i;
        this.conversionType = i2;
    }

    public ActivityConversionInfo(Parcel parcel) {
        this.activityType = parcel.readInt();
        this.conversionType = parcel.readInt();
    }
}
