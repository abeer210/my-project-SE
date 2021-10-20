package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.u;
import java.util.Collections;
import java.util.List;
import vigqyno.C0201;

public final class b0 extends ip0 {
    public static final Parcelable.Creator<b0> CREATOR = new c0();
    private final List<String> a;
    private final PendingIntent b;
    private final String c;

    public b0(List<String> list, PendingIntent pendingIntent, String str) {
        this.a = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.b = pendingIntent;
        this.c = str;
    }

    public static b0 o(PendingIntent pendingIntent) {
        u.l(pendingIntent, C0201.m82(10799));
        return new b0(null, pendingIntent, C0201.m82(10800));
    }

    public static b0 p(List<String> list) {
        u.l(list, C0201.m82(10801));
        u.b(!list.isEmpty(), C0201.m82(10802));
        return new b0(list, null, C0201.m82(10803));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.w(parcel, 1, this.a, false);
        kp0.s(parcel, 2, this.b, i, false);
        kp0.u(parcel, 3, this.c, false);
        kp0.b(parcel, a2);
    }
}
