package defpackage;

import java.util.Arrays;
import java.util.Map;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: e82  reason: default package */
/* compiled from: CodaBarReader */
public final class e82 extends o82 {
    public static final char[] d = C0201.m82(34532).toCharArray();
    public static final int[] e = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};
    private static final char[] f = {'A', 'B', 'C', 'D'};
    private final StringBuilder a = new StringBuilder(20);
    private int[] b = new int[80];
    private int c = 0;

    public static boolean h(char[] cArr, char c2) {
        if (cArr != null) {
            for (char c3 : cArr) {
                if (c3 == c2) {
                    return true;
                }
            }
        }
        return false;
    }

    private void i(int i) {
        int[] iArr = this.b;
        int i2 = this.c;
        iArr[i2] = i;
        int i3 = i2 + 1;
        this.c = i3;
        if (i3 >= iArr.length) {
            int[] iArr2 = new int[(i3 << 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.b = iArr2;
        }
    }

    private int j() throws o62 {
        for (int i = 1; i < this.c; i += 2) {
            int l = l(i);
            if (l != -1 && h(f, d[l])) {
                int i2 = 0;
                for (int i3 = i; i3 < i + 7; i3++) {
                    i2 += this.b[i3];
                }
                if (i == 1 || this.b[i - 1] >= i2 / 2) {
                    return i;
                }
            }
        }
        throw o62.a();
    }

    private void k(b72 b72) throws o62 {
        int i = 0;
        this.c = 0;
        int f2 = b72.f(0);
        int g = b72.g();
        if (f2 < g) {
            boolean z = true;
            while (f2 < g) {
                if (b72.c(f2) != z) {
                    i++;
                } else {
                    i(i);
                    z = !z;
                    i = 1;
                }
                f2++;
            }
            i(i);
            return;
        }
        throw o62.a();
    }

    private int l(int i) {
        int i2 = i + 7;
        if (i2 >= this.c) {
            return -1;
        }
        int[] iArr = this.b;
        int i3 = C0188.f24;
        int i4 = 0;
        int i5 = C0188.f24;
        int i6 = 0;
        for (int i7 = i; i7 < i2; i7 += 2) {
            int i8 = iArr[i7];
            if (i8 < i5) {
                i5 = i8;
            }
            if (i8 > i6) {
                i6 = i8;
            }
        }
        int i9 = (i5 + i6) / 2;
        int i10 = 0;
        for (int i11 = i + 1; i11 < i2; i11 += 2) {
            int i12 = iArr[i11];
            if (i12 < i3) {
                i3 = i12;
            }
            if (i12 > i10) {
                i10 = i12;
            }
        }
        int i13 = (i3 + i10) / 2;
        int i14 = 128;
        int i15 = 0;
        for (int i16 = 0; i16 < 7; i16++) {
            i14 >>= 1;
            if (iArr[i + i16] > ((i16 & 1) == 0 ? i9 : i13)) {
                i15 |= i14;
            }
        }
        while (true) {
            int[] iArr2 = e;
            if (i4 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i4] == i15) {
                return i4;
            }
            i4++;
        }
    }

    private void m(int i) throws o62 {
        int[] iArr = {0, 0, 0, 0};
        int[] iArr2 = {0, 0, 0, 0};
        int length = this.a.length() - 1;
        int i2 = 0;
        int i3 = i;
        int i4 = 0;
        while (true) {
            int i5 = e[this.a.charAt(i4)];
            for (int i6 = 6; i6 >= 0; i6--) {
                int i7 = (i6 & 1) + ((i5 & 1) << 1);
                iArr[i7] = iArr[i7] + this.b[i3 + i6];
                iArr2[i7] = iArr2[i7] + 1;
                i5 >>= 1;
            }
            if (i4 >= length) {
                break;
            }
            i3 += 8;
            i4++;
        }
        float[] fArr = new float[4];
        float[] fArr2 = new float[4];
        for (int i8 = 0; i8 < 2; i8++) {
            fArr2[i8] = 0.0f;
            int i9 = i8 + 2;
            fArr2[i9] = ((((float) iArr[i8]) / ((float) iArr2[i8])) + (((float) iArr[i9]) / ((float) iArr2[i9]))) / 2.0f;
            fArr[i8] = fArr2[i9];
            fArr[i9] = ((((float) iArr[i9]) * 2.0f) + 1.5f) / ((float) iArr2[i9]);
        }
        loop3:
        while (true) {
            int i10 = e[this.a.charAt(i2)];
            for (int i11 = 6; i11 >= 0; i11--) {
                int i12 = (i11 & 1) + ((i10 & 1) << 1);
                float f2 = (float) this.b[i + i11];
                if (f2 >= fArr2[i12] && f2 <= fArr[i12]) {
                    i10 >>= 1;
                }
            }
            if (i2 < length) {
                i += 8;
                i2++;
            } else {
                return;
            }
        }
        throw o62.a();
    }

    @Override // defpackage.o82
    public t62 c(int i, b72 b72, Map<j62, ?> map) throws o62 {
        Arrays.fill(this.b, 0);
        k(b72);
        int j = j();
        this.a.setLength(0);
        int i2 = j;
        do {
            int l = l(i2);
            if (l != -1) {
                this.a.append((char) l);
                i2 += 8;
                if (this.a.length() > 1 && h(f, d[l])) {
                    break;
                }
            } else {
                throw o62.a();
            }
        } while (i2 < this.c);
        int i3 = i2 - 1;
        int i4 = this.b[i3];
        int i5 = 0;
        for (int i6 = -8; i6 < -1; i6++) {
            i5 += this.b[i2 + i6];
        }
        if (i2 >= this.c || i4 >= i5 / 2) {
            m(j);
            for (int i7 = 0; i7 < this.a.length(); i7++) {
                StringBuilder sb = this.a;
                sb.setCharAt(i7, d[sb.charAt(i7)]);
            }
            if (h(f, this.a.charAt(0))) {
                StringBuilder sb2 = this.a;
                if (!h(f, sb2.charAt(sb2.length() - 1))) {
                    throw o62.a();
                } else if (this.a.length() > 3) {
                    if (map == null || !map.containsKey(j62.RETURN_CODABAR_START_END)) {
                        StringBuilder sb3 = this.a;
                        sb3.deleteCharAt(sb3.length() - 1);
                        this.a.deleteCharAt(0);
                    }
                    int i8 = 0;
                    for (int i9 = 0; i9 < j; i9++) {
                        i8 += this.b[i9];
                    }
                    float f2 = (float) i8;
                    while (j < i3) {
                        i8 += this.b[j];
                        j++;
                    }
                    float f3 = (float) i;
                    return new t62(this.a.toString(), null, new v62[]{new v62(f2, f3), new v62((float) i8, f3)}, f62.CODABAR);
                } else {
                    throw o62.a();
                }
            } else {
                throw o62.a();
            }
        } else {
            throw o62.a();
        }
    }
}
