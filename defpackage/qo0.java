package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.s;
import vigqyno.C0201;

/* renamed from: qo0  reason: default package */
public final class qo0 extends ip0 {
    public static final Parcelable.Creator<qo0> CREATOR = new ro0();
    private final boolean a;
    private final long b;
    private final long c;

    public qo0(boolean z, long j, long j2) {
        this.a = z;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qo0) {
            qo0 qo0 = (qo0) obj;
            return this.a == qo0.a && this.b == qo0.b && this.c == qo0.c;
        }
    }

    public final int hashCode() {
        return s.b(Boolean.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c));
    }

    public final String toString() {
        return C0201.m82(35638) + this.a + C0201.m82(35639) + this.b + C0201.m82(35640) + this.c + C0201.m82(35641);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.c(parcel, 1, this.a);
        kp0.q(parcel, 2, this.c);
        kp0.q(parcel, 3, this.b);
        kp0.b(parcel, a2);
    }
}
