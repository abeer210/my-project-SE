package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.s;
import vigqyno.C0201;

/* renamed from: xo0  reason: default package */
/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public class xo0 extends ip0 {
    public static final Parcelable.Creator<xo0> CREATOR = new jq0();
    private final String a;
    @Deprecated
    private final int b;
    private final long c;

    public xo0(String str, long j) {
        this.a = str;
        this.c = j;
        this.b = -1;
    }

    public boolean equals(Object obj) {
        if (obj instanceof xo0) {
            xo0 xo0 = (xo0) obj;
            if (((o() == null || !o().equals(xo0.o())) && (o() != null || xo0.o() != null)) || p() != xo0.p()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return s.b(o(), Long.valueOf(p()));
    }

    public String o() {
        return this.a;
    }

    public long p() {
        long j = this.c;
        return j == -1 ? (long) this.b : j;
    }

    public String toString() {
        s.a c2 = s.c(this);
        c2.a(C0201.m82(26865), o());
        c2.a(C0201.m82(26866), Long.valueOf(p()));
        return c2.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.u(parcel, 1, o(), false);
        kp0.n(parcel, 2, this.b);
        kp0.q(parcel, 3, p());
        kp0.b(parcel, a2);
    }

    public xo0(String str, int i, long j) {
        this.a = str;
        this.b = i;
        this.c = j;
    }
}
