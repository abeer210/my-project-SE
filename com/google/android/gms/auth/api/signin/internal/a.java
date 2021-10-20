package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class a extends ip0 {
    public static final Parcelable.Creator<a> CREATOR = new d();
    private final int a;
    private int b;
    private Bundle c;

    public a(int i, int i2, Bundle bundle) {
        this.a = i;
        this.b = i2;
        this.c = bundle;
    }

    public int o() {
        return this.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.n(parcel, 1, this.a);
        kp0.n(parcel, 2, o());
        kp0.e(parcel, 3, this.c, false);
        kp0.b(parcel, a2);
    }
}
