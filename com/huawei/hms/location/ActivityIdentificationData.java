package com.huawei.hms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.util.Arrays;
import java.util.Objects;
import vigqyno.C0201;

public class ActivityIdentificationData implements Parcelable {
    public static final int BIKE = 0;
    public static final Parcelable.Creator<ActivityIdentificationData> CREATOR = new Parcelable.Creator<ActivityIdentificationData>() {
        /* class com.huawei.hms.location.ActivityIdentificationData.AnonymousClass1 */

        /* renamed from: a */
        public ActivityIdentificationData createFromParcel(Parcel parcel) {
            return new ActivityIdentificationData(parcel);
        }

        /* renamed from: a */
        public ActivityIdentificationData[] newArray(int i) {
            return new ActivityIdentificationData[i];
        }
    };
    public static final int FOOT = 0;
    public static final int OTHERS = 0;
    public static final int RUNNING = 0;
    public static final int STILL = 0;
    public static final int TILTING = 0;
    public static final int VEHICLE = 0;
    public static final int WALKING = 0;
    private static final int[] a = {100, 101, 102, 103, 105, 107, 108};
    private int b;
    private int c;

    static {
        C0201.m83(ActivityIdentificationData.class, 542);
    }

    public static boolean isValidType(int i) {
        if (Arrays.binarySearch(a, i) >= 0) {
            return true;
        }
        Log.e(C0201.m82(10019), i + C0201.m82(10018));
        return false;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return true;
        }
        if (ActivityIdentificationData.class != obj.getClass() || !(obj instanceof ActivityIdentificationData)) {
            return false;
        }
        ActivityIdentificationData activityIdentificationData = (ActivityIdentificationData) obj;
        if (this.b == activityIdentificationData.getIdentificationActivity() && this.c == activityIdentificationData.getPossibility()) {
            return true;
        }
        return false;
    }

    public int getIdentificationActivity() {
        return this.b;
    }

    public int getPossibility() {
        return this.c;
    }

    public int hashCode() {
        return Objects.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public void setIdentificationActivity(int i) {
        this.b = i;
    }

    public void setPossibility(int i) {
        this.c = i;
    }

    public String toString() {
        String str;
        int i = this.b;
        switch (i) {
            case 100:
                str = C0201.m82(10027);
                break;
            case 101:
                str = C0201.m82(10026);
                break;
            case 102:
                str = C0201.m82(10025);
                break;
            case 103:
                str = C0201.m82(10024);
                break;
            case 104:
                str = C0201.m82(10023);
                break;
            case 105:
                str = C0201.m82(10022);
                break;
            case 106:
            default:
                str = Integer.toString(i);
                break;
            case 107:
                str = C0201.m82(10021);
                break;
            case 108:
                str = C0201.m82(10020);
                break;
        }
        return C0201.m82(10028) + str + C0201.m82(10029) + this.c + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }

    public ActivityIdentificationData(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    private ActivityIdentificationData(Parcel parcel) {
        this.b = parcel.readInt();
        this.c = parcel.readInt();
    }
}
