package com.huawei.hms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.hms.support.log.HMSLog;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import vigqyno.C0201;

public class ActivityIdentificationResponse implements Parcelable, IMessageEntity {
    public static final Parcelable.Creator<ActivityIdentificationResponse> CREATOR = new Parcelable.Creator<ActivityIdentificationResponse>() {
        /* class com.huawei.hms.location.ActivityIdentificationResponse.AnonymousClass1 */

        /* renamed from: a */
        public ActivityIdentificationResponse createFromParcel(Parcel parcel) {
            return new ActivityIdentificationResponse(parcel);
        }

        /* renamed from: a */
        public ActivityIdentificationResponse[] newArray(int i) {
            return new ActivityIdentificationResponse[0];
        }
    };
    private static final String EXTRA_CONSTANT = null;
    private static final String TAG = null;
    @Packed
    private List<ActivityIdentificationData> activityIdentificationDatas;
    @Packed
    private long elapsedTimeFromReboot;
    @Packed
    private long time;

    static {
        C0201.m83(ActivityIdentificationResponse.class, 302);
    }

    public static boolean containDataFromIntent(Intent intent) {
        if (intent == null) {
            return false;
        }
        try {
            if (intent.hasExtra(C0201.m82(13974))) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            HMSLog.e(C0201.m82(13975), C0201.m82(13976));
            return false;
        }
    }

    public static ActivityIdentificationResponse getDataFromIntent(Intent intent) {
        try {
            if (!containDataFromIntent(intent)) {
                return null;
            }
            Parcelable parcelableExtra = intent.getParcelableExtra(C0201.m82(13977));
            if (parcelableExtra instanceof ActivityIdentificationResponse) {
                return (ActivityIdentificationResponse) parcelableExtra;
            }
            return null;
        } catch (Exception unused) {
            HMSLog.e(C0201.m82(13978), C0201.m82(13979));
            return null;
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ActivityIdentificationResponse.class != obj.getClass() || !(obj instanceof ActivityIdentificationResponse)) {
            return false;
        }
        ActivityIdentificationResponse activityIdentificationResponse = (ActivityIdentificationResponse) obj;
        if (this.time == activityIdentificationResponse.getTime() && this.elapsedTimeFromReboot == activityIdentificationResponse.getElapsedTimeFromReboot() && Objects.equals(this.activityIdentificationDatas, activityIdentificationResponse.getActivityIdentificationDatas())) {
            return true;
        }
        return false;
    }

    public List<ActivityIdentificationData> getActivityIdentificationDatas() {
        return this.activityIdentificationDatas;
    }

    public int getActivityPossibility(int i) {
        List<ActivityIdentificationData> list = this.activityIdentificationDatas;
        if (list == null || list.size() <= 0) {
            return 0;
        }
        for (ActivityIdentificationData activityIdentificationData : this.activityIdentificationDatas) {
            if (activityIdentificationData.getIdentificationActivity() == i) {
                return activityIdentificationData.getPossibility();
            }
        }
        return 0;
    }

    public long getElapsedTimeFromReboot() {
        return this.elapsedTimeFromReboot;
    }

    public ActivityIdentificationData getMostActivityIdentification() {
        List<ActivityIdentificationData> list = this.activityIdentificationDatas;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.activityIdentificationDatas.get(0);
    }

    public long getTime() {
        return this.time;
    }

    public int hashCode() {
        return Objects.hashCode(new Object[]{Long.valueOf(this.time), Long.valueOf(this.elapsedTimeFromReboot), this.activityIdentificationDatas});
    }

    public void setActivityIdentificationDatas(List<ActivityIdentificationData> list) {
        this.activityIdentificationDatas = list;
    }

    public void setElapsedTimeFromReboot(long j) {
        this.elapsedTimeFromReboot = j;
    }

    public void setTime(long j) {
        this.time = j;
    }

    public String toString() {
        return C0201.m82(13980) + this.time + C0201.m82(13981) + this.elapsedTimeFromReboot + C0201.m82(13982) + this.activityIdentificationDatas + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.time);
        parcel.writeLong(this.elapsedTimeFromReboot);
        parcel.writeTypedList(this.activityIdentificationDatas);
    }

    public ActivityIdentificationResponse() {
    }

    public ActivityIdentificationResponse(List<ActivityIdentificationData> list, long j, long j2) {
        this.activityIdentificationDatas = list;
        this.time = j;
        this.elapsedTimeFromReboot = j2;
    }

    public ActivityIdentificationResponse(ActivityIdentificationData activityIdentificationData, long j, long j2) {
        this.activityIdentificationDatas = Collections.singletonList(activityIdentificationData);
        this.time = j;
        this.elapsedTimeFromReboot = j2;
    }

    private ActivityIdentificationResponse(Parcel parcel) {
        this.time = parcel.readLong();
        this.elapsedTimeFromReboot = parcel.readLong();
        this.activityIdentificationDatas = parcel.createTypedArrayList(ActivityIdentificationData.CREATOR);
    }
}
