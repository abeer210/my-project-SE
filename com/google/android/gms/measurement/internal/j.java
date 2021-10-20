package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.u;
import vigqyno.C0201;

public final class j extends ip0 {
    public static final Parcelable.Creator<j> CREATOR = new m();
    public final String a;
    public final i b;
    public final String c;
    public final long d;

    public j(String str, i iVar, String str2, long j) {
        this.a = str;
        this.b = iVar;
        this.c = str2;
        this.d = j;
    }

    public final String toString() {
        String str = this.c;
        String str2 = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append(C0201.m82(27040));
        sb.append(str);
        sb.append(C0201.m82(27041));
        sb.append(str2);
        sb.append(C0201.m82(27042));
        sb.append(valueOf);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.u(parcel, 2, this.a, false);
        kp0.s(parcel, 3, this.b, i, false);
        kp0.u(parcel, 4, this.c, false);
        kp0.q(parcel, 5, this.d);
        kp0.b(parcel, a2);
    }

    public j(j jVar, long j) {
        u.k(jVar);
        this.a = jVar.a;
        this.b = jVar.b;
        this.c = jVar.c;
        this.d = j;
    }
}
