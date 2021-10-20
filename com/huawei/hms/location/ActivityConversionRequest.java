package com.huawei.hms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import vigqyno.C0201;

public class ActivityConversionRequest implements Parcelable, IMessageEntity {
    public static final Parcelable.Creator<ActivityConversionRequest> CREATOR = new Parcelable.Creator<ActivityConversionRequest>() {
        /* class com.huawei.hms.location.ActivityConversionRequest.AnonymousClass1 */

        /* renamed from: a */
        public ActivityConversionRequest createFromParcel(Parcel parcel) {
            return new ActivityConversionRequest(parcel);
        }

        /* renamed from: a */
        public ActivityConversionRequest[] newArray(int i) {
            return new ActivityConversionRequest[i];
        }
    };
    public static final Comparator<ActivityConversionInfo> IS_EQUAL_CONVERSION = new Comparator<ActivityConversionInfo>() {
        /* class com.huawei.hms.location.ActivityConversionRequest.AnonymousClass2 */

        /* renamed from: a */
        public int compare(ActivityConversionInfo activityConversionInfo, ActivityConversionInfo activityConversionInfo2) {
            int activityType = activityConversionInfo.getActivityType() - activityConversionInfo2.getActivityType();
            if (activityType == 0) {
                int conversionType = activityConversionInfo.getConversionType() - activityConversionInfo2.getConversionType();
                if (conversionType == 0) {
                    return 0;
                }
                if (conversionType > 0) {
                    return 1;
                }
            } else if (activityType > 0) {
                return 1;
            }
            return -1;
        }
    };
    @Packed
    private List<ActivityConversionInfo> activityConversions;

    public ActivityConversionRequest() {
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ActivityConversionRequest.class != obj.getClass() || !(obj instanceof ActivityConversionRequest)) {
            return false;
        }
        return Objects.equals(this.activityConversions, ((ActivityConversionRequest) obj).getActivityConversions());
    }

    public List<ActivityConversionInfo> getActivityConversions() {
        return this.activityConversions;
    }

    public int hashCode() {
        return this.activityConversions.hashCode();
    }

    public void setActivityConversions(List<ActivityConversionInfo> list) {
        this.activityConversions = list;
    }

    public void setDataToIntent(Intent intent) {
        intent.putExtra(C0201.m82(4041), this);
    }

    public String toString() {
        return C0201.m82(4042) + this.activityConversions + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.activityConversions);
    }

    public ActivityConversionRequest(Parcel parcel) {
        this.activityConversions = parcel.createTypedArrayList(ActivityConversionInfo.CREATOR);
    }

    public ActivityConversionRequest(List<ActivityConversionInfo> list) {
        this.activityConversions = list;
    }
}
