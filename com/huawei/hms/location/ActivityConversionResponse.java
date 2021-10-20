package com.huawei.hms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.log.HMSLog;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

public class ActivityConversionResponse implements Parcelable {
    public static final Parcelable.Creator<ActivityConversionResponse> CREATOR = new Parcelable.Creator<ActivityConversionResponse>() {
        /* class com.huawei.hms.location.ActivityConversionResponse.AnonymousClass1 */

        /* renamed from: a */
        public ActivityConversionResponse createFromParcel(Parcel parcel) {
            return new ActivityConversionResponse(parcel);
        }

        /* renamed from: a */
        public ActivityConversionResponse[] newArray(int i) {
            return new ActivityConversionResponse[i];
        }
    };
    private List<ActivityConversionData> a;

    public static boolean containDataFromIntent(Intent intent) {
        if (intent == null) {
            return false;
        }
        try {
            if (intent.hasExtra(C0201.m82(33632))) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            HMSLog.e(C0201.m82(33633), C0201.m82(33634));
            return false;
        }
    }

    public static ActivityConversionResponse getDataFromIntent(Intent intent) {
        try {
            if (!containDataFromIntent(intent)) {
                return null;
            }
            Parcelable parcelableExtra = intent.getParcelableExtra(C0201.m82(33635));
            if (parcelableExtra instanceof ActivityConversionResponse) {
                return (ActivityConversionResponse) parcelableExtra;
            }
            return null;
        } catch (Exception unused) {
            HMSLog.e(C0201.m82(33636), C0201.m82(33637));
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
        if (obj == null || ActivityConversionResponse.class != obj.getClass() || !this.a.equals(((ActivityConversionResponse) obj).a)) {
            return false;
        }
        return true;
    }

    public List<ActivityConversionData> getActivityConversionDatas() {
        return this.a;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.a);
    }

    public ActivityConversionResponse() {
        this.a = new ArrayList();
    }

    public ActivityConversionResponse(List<ActivityConversionData> list) {
        this.a = new ArrayList();
        this.a = list;
    }

    private ActivityConversionResponse(Parcel parcel) {
        this.a = new ArrayList();
        this.a = parcel.createTypedArrayList(ActivityConversionData.CREATOR);
    }
}
