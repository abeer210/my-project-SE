package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import vigqyno.C0201;

/* renamed from: wr1  reason: default package */
public class wr1 extends ip0 {
    public static final Parcelable.Creator<wr1> CREATOR = new yr1();
    private static final byte[][] i = new byte[0][];
    private final String a;
    private final byte[] b;
    private final byte[][] c;
    private final byte[][] d;
    private final byte[][] e;
    private final byte[][] f;
    private final int[] g;
    private final byte[][] h;

    public wr1(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6) {
        this.a = str;
        this.b = bArr;
        this.c = bArr2;
        this.d = bArr3;
        this.e = bArr4;
        this.f = bArr5;
        this.g = iArr;
        this.h = bArr6;
    }

    private static List<Integer> o(int[] iArr) {
        if (iArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i2 : iArr) {
            arrayList.add(Integer.valueOf(i2));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static List<String> p(byte[][] bArr) {
        if (bArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte[] bArr2 : bArr) {
            arrayList.add(Base64.encodeToString(bArr2, 3));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static void r(StringBuilder sb, String str, byte[][] bArr) {
        String r6;
        sb.append(str);
        sb.append(C0201.m82(1011));
        if (bArr == null) {
            r6 = C0201.m82(1012);
        } else {
            sb.append(C0201.m82(1013));
            int length = bArr.length;
            boolean z = true;
            int i2 = 0;
            while (i2 < length) {
                byte[] bArr2 = bArr[i2];
                if (!z) {
                    sb.append(C0201.m82(1014));
                }
                String r1 = C0201.m82(1015);
                sb.append(r1);
                sb.append(Base64.encodeToString(bArr2, 3));
                sb.append(r1);
                i2++;
                z = false;
            }
            r6 = C0201.m82(1016);
        }
        sb.append(r6);
    }

    public boolean equals(Object obj) {
        if (obj instanceof wr1) {
            wr1 wr1 = (wr1) obj;
            return as1.a(this.a, wr1.a) && Arrays.equals(this.b, wr1.b) && as1.a(p(this.c), p(wr1.c)) && as1.a(p(this.d), p(wr1.d)) && as1.a(p(this.e), p(wr1.e)) && as1.a(p(this.f), p(wr1.f)) && as1.a(o(this.g), o(wr1.g)) && as1.a(p(this.h), p(wr1.h));
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder(C0201.m82(1017));
        String r1 = C0201.m82(1018);
        sb.append(r1);
        String str2 = this.a;
        String r3 = C0201.m82(1019);
        String r4 = C0201.m82(1020);
        if (str2 == null) {
            str = r3;
        } else {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 2);
            sb2.append(r4);
            sb2.append(str2);
            sb2.append(r4);
            str = sb2.toString();
        }
        sb.append(str);
        String r2 = C0201.m82(1021);
        sb.append(r2);
        byte[] bArr = this.b;
        sb.append(C0201.m82(1022));
        String r6 = C0201.m82(1023);
        sb.append(r6);
        if (bArr == null) {
            sb.append(r3);
        } else {
            sb.append(r4);
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append(r4);
        }
        sb.append(r2);
        r(sb, C0201.m82(1024), this.c);
        sb.append(r2);
        r(sb, C0201.m82(1025), this.d);
        sb.append(r2);
        r(sb, C0201.m82(1026), this.e);
        sb.append(r2);
        r(sb, C0201.m82(1027), this.f);
        sb.append(r2);
        int[] iArr = this.g;
        sb.append(C0201.m82(1028));
        sb.append(r6);
        String r5 = C0201.m82(1029);
        if (iArr == null) {
            sb.append(r3);
        } else {
            sb.append(r1);
            int length = iArr.length;
            boolean z = true;
            int i2 = 0;
            while (i2 < length) {
                int i3 = iArr[i2];
                if (!z) {
                    sb.append(r2);
                }
                sb.append(i3);
                i2++;
                z = false;
            }
            sb.append(r5);
        }
        sb.append(r2);
        r(sb, C0201.m82(1030), this.h);
        sb.append(r5);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = kp0.a(parcel);
        kp0.u(parcel, 2, this.a, false);
        kp0.g(parcel, 3, this.b, false);
        kp0.h(parcel, 4, this.c, false);
        kp0.h(parcel, 5, this.d, false);
        kp0.h(parcel, 6, this.e, false);
        kp0.h(parcel, 7, this.f, false);
        kp0.o(parcel, 8, this.g, false);
        kp0.h(parcel, 9, this.h, false);
        kp0.b(parcel, a2);
    }
}
