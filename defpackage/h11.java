package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;

/* renamed from: h11  reason: default package */
public final class h11 extends ip0 implements m {
    public static final Parcelable.Creator<h11> CREATOR = new i11();
    private final Status a;

    static {
        Status status = Status.e;
    }

    public h11(Status status) {
        this.a = status;
    }

    @Override // com.google.android.gms.common.api.m
    public final Status k() {
        return this.a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.s(parcel, 1, k(), i, false);
        kp0.b(parcel, a2);
    }
}
