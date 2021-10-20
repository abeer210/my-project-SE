package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;

public final class l extends ip0 implements m {
    public static final Parcelable.Creator<l> CREATOR = new x();
    private final Status a;
    private final m b;

    public l(Status status) {
        this(status, null);
    }

    public l(Status status, m mVar) {
        this.a = status;
        this.b = mVar;
    }

    @Override // com.google.android.gms.common.api.m
    public final Status k() {
        return this.a;
    }

    public final m o() {
        return this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.s(parcel, 1, k(), i, false);
        kp0.s(parcel, 2, o(), i, false);
        kp0.b(parcel, a2);
    }
}
