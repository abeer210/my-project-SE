package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.s;
import defpackage.no0;
import java.util.Arrays;
import vigqyno.C0201;

/* renamed from: so0  reason: default package */
public final class so0 extends ip0 {
    public static final Parcelable.Creator<so0> CREATOR = new to0();
    public d01 a;
    public byte[] b;
    private int[] c;
    private String[] d;
    private int[] e;
    private byte[][] f;
    private wr1[] g;
    private boolean h;
    public final sz0 i;
    public final no0.c j;
    public final no0.c k;

    public so0(d01 d01, sz0 sz0, no0.c cVar, no0.c cVar2, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr, wr1[] wr1Arr, boolean z) {
        this.a = d01;
        this.i = sz0;
        this.j = cVar;
        this.k = null;
        this.c = iArr;
        this.d = null;
        this.e = iArr2;
        this.f = null;
        this.g = null;
        this.h = z;
    }

    public so0(d01 d01, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z, wr1[] wr1Arr) {
        this.a = d01;
        this.b = bArr;
        this.c = iArr;
        this.d = strArr;
        this.i = null;
        this.j = null;
        this.k = null;
        this.e = iArr2;
        this.f = bArr2;
        this.g = wr1Arr;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof so0) {
            so0 so0 = (so0) obj;
            return s.a(this.a, so0.a) && Arrays.equals(this.b, so0.b) && Arrays.equals(this.c, so0.c) && Arrays.equals(this.d, so0.d) && s.a(this.i, so0.i) && s.a(this.j, so0.j) && s.a(this.k, so0.k) && Arrays.equals(this.e, so0.e) && Arrays.deepEquals(this.f, so0.f) && Arrays.equals(this.g, so0.g) && this.h == so0.h;
        }
    }

    public final int hashCode() {
        return s.b(this.a, this.b, this.c, this.d, this.i, this.j, this.k, this.e, this.f, this.g, Boolean.valueOf(this.h));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(C0201.m82(22345));
        sb.append(this.a);
        sb.append(C0201.m82(22346));
        sb.append(this.b == null ? null : new String(this.b));
        sb.append(C0201.m82(22347));
        sb.append(Arrays.toString(this.c));
        sb.append(C0201.m82(22348));
        sb.append(Arrays.toString(this.d));
        sb.append(C0201.m82(22349));
        sb.append(this.i);
        sb.append(C0201.m82(22350));
        sb.append(this.j);
        sb.append(C0201.m82(22351));
        sb.append(this.k);
        sb.append(C0201.m82(22352));
        sb.append(Arrays.toString(this.e));
        sb.append(C0201.m82(22353));
        sb.append(Arrays.toString(this.f));
        sb.append(C0201.m82(22354));
        sb.append(Arrays.toString(this.g));
        sb.append(C0201.m82(22355));
        sb.append(this.h);
        sb.append(C0201.m82(22356));
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = kp0.a(parcel);
        kp0.s(parcel, 2, this.a, i2, false);
        kp0.g(parcel, 3, this.b, false);
        kp0.o(parcel, 4, this.c, false);
        kp0.v(parcel, 5, this.d, false);
        kp0.o(parcel, 6, this.e, false);
        kp0.h(parcel, 7, this.f, false);
        kp0.c(parcel, 8, this.h);
        kp0.x(parcel, 9, this.g, i2, false);
        kp0.b(parcel, a2);
    }
}
