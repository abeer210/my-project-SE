package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;
import vigqyno.C0201;

/* renamed from: i21  reason: default package */
public final class i21 extends ip0 {
    public static final Parcelable.Creator<i21> CREATOR = new j21();
    public static final List<d> h = Collections.emptyList();
    private LocationRequest a;
    private List<d> b;
    private String c;
    private boolean d;
    private boolean e;
    private boolean f;
    private String g;

    public i21(LocationRequest locationRequest, List<d> list, String str, boolean z, boolean z2, boolean z3, String str2) {
        this.a = locationRequest;
        this.b = list;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = str2;
    }

    @Deprecated
    public static i21 o(LocationRequest locationRequest) {
        return new i21(locationRequest, h, null, false, false, false, null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i21)) {
            return false;
        }
        i21 i21 = (i21) obj;
        return s.a(this.a, i21.a) && s.a(this.b, i21.b) && s.a(this.c, i21.c) && this.d == i21.d && this.e == i21.e && this.f == i21.f && s.a(this.g, i21.g);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        if (this.c != null) {
            sb.append(C0201.m82(31755));
            sb.append(this.c);
        }
        if (this.g != null) {
            sb.append(C0201.m82(31756));
            sb.append(this.g);
        }
        sb.append(C0201.m82(31757));
        sb.append(this.d);
        sb.append(C0201.m82(31758));
        sb.append(this.b);
        sb.append(C0201.m82(31759));
        sb.append(this.e);
        if (this.f) {
            sb.append(C0201.m82(31760));
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.s(parcel, 1, this.a, i, false);
        kp0.y(parcel, 5, this.b, false);
        kp0.u(parcel, 6, this.c, false);
        kp0.c(parcel, 7, this.d);
        kp0.c(parcel, 8, this.e);
        kp0.c(parcel, 9, this.f);
        kp0.u(parcel, 10, this.g, false);
        kp0.b(parcel, a2);
    }
}
