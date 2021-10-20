package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.n;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class w extends ip0 {
    public static final Parcelable.Creator<w> CREATOR = new j0();
    private final int a;
    private IBinder b;
    private vo0 c;
    private boolean d;
    private boolean e;

    public w(int i, IBinder iBinder, vo0 vo0, boolean z, boolean z2) {
        this.a = i;
        this.b = iBinder;
        this.c = vo0;
        this.d = z;
        this.e = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.c.equals(wVar.c) && o().equals(wVar.o());
    }

    public n o() {
        return n.a.U3(this.b);
    }

    public vo0 p() {
        return this.c;
    }

    public boolean r() {
        return this.d;
    }

    public boolean s() {
        return this.e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.n(parcel, 1, this.a);
        kp0.m(parcel, 2, this.b, false);
        kp0.s(parcel, 3, p(), i, false);
        kp0.c(parcel, 4, r());
        kp0.c(parcel, 5, s());
        kp0.b(parcel, a2);
    }
}
