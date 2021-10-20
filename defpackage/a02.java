package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: a02  reason: default package */
public abstract class a02 implements Parcelable {
    public static a02 b(PendingIntent pendingIntent) {
        return new d02(pendingIntent);
    }

    public abstract PendingIntent a();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(a(), 0);
    }
}
