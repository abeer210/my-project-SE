package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.u;
import vigqyno.C0201;

/* renamed from: d01  reason: default package */
public final class d01 extends ip0 {
    public static final Parcelable.Creator<d01> CREATOR = new e01();
    private final String a;
    private final int b;
    public final int c;
    private final String d;
    private final String e;
    private final boolean f;
    public final String g;
    private final boolean h;
    private final int i;

    public d01(String str, int i2, int i3, String str2, String str3, String str4, boolean z, jz0 jz0) {
        u.k(str);
        this.a = str;
        this.b = i2;
        this.c = i3;
        this.g = str2;
        this.d = str3;
        this.e = str4;
        this.f = !z;
        this.h = z;
        this.i = jz0.u();
    }

    public d01(String str, int i2, int i3, String str2, String str3, boolean z, String str4, boolean z2, int i4) {
        this.a = str;
        this.b = i2;
        this.c = i3;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.g = str4;
        this.h = z2;
        this.i = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d01) {
            d01 d01 = (d01) obj;
            return s.a(this.a, d01.a) && this.b == d01.b && this.c == d01.c && s.a(this.g, d01.g) && s.a(this.d, d01.d) && s.a(this.e, d01.e) && this.f == d01.f && this.h == d01.h && this.i == d01.i;
        }
    }

    public final int hashCode() {
        return s.b(this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), this.g, this.d, this.e, Boolean.valueOf(this.f), Boolean.valueOf(this.h), Integer.valueOf(this.i));
    }

    public final String toString() {
        return C0201.m82(28718) + C0201.m82(28719) + this.a + ',' + C0201.m82(28720) + this.b + ',' + C0201.m82(28721) + this.c + ',' + C0201.m82(28722) + this.g + ',' + C0201.m82(28723) + this.d + ',' + C0201.m82(28724) + this.e + ',' + C0201.m82(28725) + this.f + ',' + C0201.m82(28726) + this.h + ',' + C0201.m82(28727) + this.i + C0201.m82(28728);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = kp0.a(parcel);
        kp0.u(parcel, 2, this.a, false);
        kp0.n(parcel, 3, this.b);
        kp0.n(parcel, 4, this.c);
        kp0.u(parcel, 5, this.d, false);
        kp0.u(parcel, 6, this.e, false);
        kp0.c(parcel, 7, this.f);
        kp0.u(parcel, 8, this.g, false);
        kp0.c(parcel, 9, this.h);
        kp0.n(parcel, 10, this.i);
        kp0.b(parcel, a2);
    }
}
