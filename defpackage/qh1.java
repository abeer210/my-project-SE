package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: qh1  reason: default package */
public final class qh1 extends ip0 {
    public static final Parcelable.Creator<qh1> CREATOR = new ph1();
    public final long a;
    public final long b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final Bundle g;

    public qh1(long j, long j2, boolean z, String str, String str2, String str3, Bundle bundle) {
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.q(parcel, 1, this.a);
        kp0.q(parcel, 2, this.b);
        kp0.c(parcel, 3, this.c);
        kp0.u(parcel, 4, this.d, false);
        kp0.u(parcel, 5, this.e, false);
        kp0.u(parcel, 6, this.f, false);
        kp0.e(parcel, 7, this.g, false);
        kp0.b(parcel, a2);
    }
}
