package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.b;
import java.util.Locale;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: m21  reason: default package */
public final class m21 extends ip0 implements b {
    public static final Parcelable.Creator<m21> CREATOR = new n21();
    private final String a;
    private final long b;
    private final short c;
    private final double d;
    private final double e;
    private final float f;
    private final int g;
    private final int h;
    private final int i;

    public m21(String str, int i2, short s, double d2, double d3, float f2, long j, int i3, int i4) {
        if (str == null || str.length() > 100) {
            String r6 = C0201.m82(8128);
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? r6.concat(valueOf) : new String(r6));
        } else if (f2 <= 0.0f) {
            StringBuilder sb = new StringBuilder(31);
            sb.append(C0201.m82(8127));
            sb.append(f2);
            throw new IllegalArgumentException(sb.toString());
        } else if (d2 > 90.0d || d2 < -90.0d) {
            StringBuilder sb2 = new StringBuilder(42);
            sb2.append(C0201.m82(8126));
            sb2.append(d2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (d3 > 180.0d || d3 < -180.0d) {
            StringBuilder sb3 = new StringBuilder(43);
            sb3.append(C0201.m82(8125));
            sb3.append(d3);
            throw new IllegalArgumentException(sb3.toString());
        } else {
            int i5 = i2 & 7;
            if (i5 != 0) {
                this.c = s;
                this.a = str;
                this.d = d2;
                this.e = d3;
                this.f = f2;
                this.b = j;
                this.g = i5;
                this.h = i3;
                this.i = i4;
                return;
            }
            StringBuilder sb4 = new StringBuilder(46);
            sb4.append(C0201.m82(8124));
            sb4.append(i2);
            throw new IllegalArgumentException(sb4.toString());
        }
    }

    public static m21 o(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        m21 createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }

    @Override // com.google.android.gms.location.b
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof m21)) {
            return false;
        }
        m21 m21 = (m21) obj;
        return this.f == m21.f && this.d == m21.d && this.e == m21.e && this.c == m21.c;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.d);
        long doubleToLongBits2 = Double.doubleToLongBits(this.e);
        return ((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.f)) * 31) + this.c) * 31) + this.g;
    }

    public final String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[9];
        objArr[0] = this.c != 1 ? null : C0201.m82(8129);
        objArr[1] = this.a.replaceAll(C0201.m82(8130), C0201.m82(8131));
        objArr[2] = Integer.valueOf(this.g);
        objArr[3] = Double.valueOf(this.d);
        objArr[4] = Double.valueOf(this.e);
        objArr[5] = Float.valueOf(this.f);
        objArr[6] = Integer.valueOf(this.h / C0188.f18);
        objArr[7] = Integer.valueOf(this.i);
        objArr[8] = Long.valueOf(this.b);
        return String.format(locale, C0201.m82(8132), objArr);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = kp0.a(parcel);
        kp0.u(parcel, 1, a(), false);
        kp0.q(parcel, 2, this.b);
        kp0.t(parcel, 3, this.c);
        kp0.i(parcel, 4, this.d);
        kp0.i(parcel, 5, this.e);
        kp0.k(parcel, 6, this.f);
        kp0.n(parcel, 7, this.g);
        kp0.n(parcel, 8, this.h);
        kp0.n(parcel, 9, this.i);
        kp0.b(parcel, a2);
    }
}
