package com.huawei.hms.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.internal.Objects;
import vigqyno.C0201;

public final class ConnectionResult implements Parcelable {
    public static final int API_UNAVAILABLE = 0;
    public static final int BINDFAIL_RESOLUTION_BACKGROUND = 0;
    public static final int BINDFAIL_RESOLUTION_REQUIRED = 0;
    public static final int CANCELED = 0;
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new Parcelable.Creator<ConnectionResult>() {
        /* class com.huawei.hms.api.ConnectionResult.AnonymousClass1 */

        /* renamed from: a */
        public ConnectionResult createFromParcel(Parcel parcel) {
            return new ConnectionResult(parcel);
        }

        /* renamed from: a */
        public ConnectionResult[] newArray(int i) {
            return new ConnectionResult[i];
        }
    };
    public static final int DEVELOPER_ERROR = 0;
    public static final int DRIVE_EXTERNAL_STORAGE_REQUIRED = 0;
    public static final int INTERNAL_ERROR = 0;
    public static final int INTERRUPTED = 0;
    public static final int INVALID_ACCOUNT = 0;
    public static final int LICENSE_CHECK_FAILED = 0;
    public static final int NETWORK_ERROR = 0;
    public static final int RESOLUTION_REQUIRED = 0;
    public static final int RESTRICTED_PROFILE = 0;
    public static final int SERVICE_DISABLED = 0;
    public static final int SERVICE_INVALID = 0;
    public static final int SERVICE_MISSING = 0;
    public static final int SERVICE_MISSING_PERMISSION = 0;
    public static final int SERVICE_UNSUPPORTED = 0;
    public static final int SERVICE_UPDATING = 0;
    public static final int SERVICE_VERSION_UPDATE_REQUIRED = 0;
    public static final int SIGN_IN_FAILED = 0;
    public static final int SIGN_IN_REQUIRED = 0;
    public static final int SUCCESS = 0;
    public static final int TIMEOUT = 0;
    private int a;
    private PendingIntent b;
    private String c;
    private int d;

    static {
        C0201.m83(ConnectionResult.class, 271);
    }

    public static String a(int i) {
        if (i == -1) {
            return C0201.m82(7587);
        }
        if (i == 0) {
            return C0201.m82(7586);
        }
        if (i == 1) {
            return C0201.m82(7585);
        }
        if (i == 2) {
            return C0201.m82(7584);
        }
        if (i == 3) {
            return C0201.m82(7583);
        }
        if (i == 13) {
            return C0201.m82(7582);
        }
        if (i == 14) {
            return C0201.m82(7581);
        }
        if (i == 19) {
            return C0201.m82(7580);
        }
        if (i == 21) {
            return C0201.m82(7579);
        }
        switch (i) {
            case 6:
                return C0201.m82(7578);
            case 7:
                return C0201.m82(7577);
            case 8:
                return C0201.m82(7576);
            case 9:
                return C0201.m82(7575);
            case 10:
                return C0201.m82(7574);
            case 11:
                return C0201.m82(7573);
            default:
                return C0201.m82(7571) + i + C0201.m82(7572);
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (!(obj instanceof ConnectionResult) || this.a != ((ConnectionResult) obj).a || this.d != ((ConnectionResult) obj).d || !this.c.equals(((ConnectionResult) obj).c) || !this.b.equals(((ConnectionResult) obj).b)) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public int getErrorCode() {
        return this.d;
    }

    public final String getErrorMessage() {
        return this.c;
    }

    public final PendingIntent getResolution() {
        return this.b;
    }

    public final boolean hasResolution() {
        return HuaweiApiAvailability.getInstance().isUserResolvableError(this.d, this.b);
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf((long) this.a), Long.valueOf((long) getErrorCode()), getErrorMessage(), this.b);
    }

    public final boolean isSuccess() {
        return this.d == 0;
    }

    public final void startResolutionForResult(Activity activity, int i) throws IntentSender.SendIntentException {
        if (hasResolution()) {
            HuaweiApiAvailability.getInstance().resolveError(activity, this.d, i, this.b);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.d);
        parcel.writeString(this.c);
        this.b.writeToParcel(parcel, i);
    }

    public ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str) {
        this.a = 1;
        this.b = null;
        this.c = null;
        this.a = i;
        this.d = i2;
        this.b = pendingIntent;
        this.c = str;
    }

    public ConnectionResult(int i) {
        this(i, (PendingIntent) null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }

    private ConnectionResult(Parcel parcel) {
        this.a = 1;
        this.b = null;
        this.c = null;
        this.a = parcel.readInt();
        this.d = parcel.readInt();
        this.c = parcel.readString();
        Parcelable parcelable = (Parcelable) PendingIntent.CREATOR.createFromParcel(parcel);
        if (parcelable != null) {
            this.b = (PendingIntent) parcelable;
        }
    }
}
