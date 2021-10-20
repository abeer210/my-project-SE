package defpackage;

import java.util.ArrayList;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: f82  reason: default package */
/* compiled from: Code128Reader */
public final class f82 extends o82 {
    public static final int[][] a = {new int[]{2, 1, 2, 2, 2, 2}, new int[]{2, 2, 2, 1, 2, 2}, new int[]{2, 2, 2, 2, 2, 1}, new int[]{1, 2, 1, 2, 2, 3}, new int[]{1, 2, 1, 3, 2, 2}, new int[]{1, 3, 1, 2, 2, 2}, new int[]{1, 2, 2, 2, 1, 3}, new int[]{1, 2, 2, 3, 1, 2}, new int[]{1, 3, 2, 2, 1, 2}, new int[]{2, 2, 1, 2, 1, 3}, new int[]{2, 2, 1, 3, 1, 2}, new int[]{2, 3, 1, 2, 1, 2}, new int[]{1, 1, 2, 2, 3, 2}, new int[]{1, 2, 2, 1, 3, 2}, new int[]{1, 2, 2, 2, 3, 1}, new int[]{1, 1, 3, 2, 2, 2}, new int[]{1, 2, 3, 1, 2, 2}, new int[]{1, 2, 3, 2, 2, 1}, new int[]{2, 2, 3, 2, 1, 1}, new int[]{2, 2, 1, 1, 3, 2}, new int[]{2, 2, 1, 2, 3, 1}, new int[]{2, 1, 3, 2, 1, 2}, new int[]{2, 2, 3, 1, 1, 2}, new int[]{3, 1, 2, 1, 3, 1}, new int[]{3, 1, 1, 2, 2, 2}, new int[]{3, 2, 1, 1, 2, 2}, new int[]{3, 2, 1, 2, 2, 1}, new int[]{3, 1, 2, 2, 1, 2}, new int[]{3, 2, 2, 1, 1, 2}, new int[]{3, 2, 2, 2, 1, 1}, new int[]{2, 1, 2, 1, 2, 3}, new int[]{2, 1, 2, 3, 2, 1}, new int[]{2, 3, 2, 1, 2, 1}, new int[]{1, 1, 1, 3, 2, 3}, new int[]{1, 3, 1, 1, 2, 3}, new int[]{1, 3, 1, 3, 2, 1}, new int[]{1, 1, 2, 3, 1, 3}, new int[]{1, 3, 2, 1, 1, 3}, new int[]{1, 3, 2, 3, 1, 1}, new int[]{2, 1, 1, 3, 1, 3}, new int[]{2, 3, 1, 1, 1, 3}, new int[]{2, 3, 1, 3, 1, 1}, new int[]{1, 1, 2, 1, 3, 3}, new int[]{1, 1, 2, 3, 3, 1}, new int[]{1, 3, 2, 1, 3, 1}, new int[]{1, 1, 3, 1, 2, 3}, new int[]{1, 1, 3, 3, 2, 1}, new int[]{1, 3, 3, 1, 2, 1}, new int[]{3, 1, 3, 1, 2, 1}, new int[]{2, 1, 1, 3, 3, 1}, new int[]{2, 3, 1, 1, 3, 1}, new int[]{2, 1, 3, 1, 1, 3}, new int[]{2, 1, 3, 3, 1, 1}, new int[]{2, 1, 3, 1, 3, 1}, new int[]{3, 1, 1, 1, 2, 3}, new int[]{3, 1, 1, 3, 2, 1}, new int[]{3, 3, 1, 1, 2, 1}, new int[]{3, 1, 2, 1, 1, 3}, new int[]{3, 1, 2, 3, 1, 1}, new int[]{3, 3, 2, 1, 1, 1}, new int[]{3, 1, 4, 1, 1, 1}, new int[]{2, 2, 1, 4, 1, 1}, new int[]{4, 3, 1, 1, 1, 1}, new int[]{1, 1, 1, 2, 2, 4}, new int[]{1, 1, 1, 4, 2, 2}, new int[]{1, 2, 1, 1, 2, 4}, new int[]{1, 2, 1, 4, 2, 1}, new int[]{1, 4, 1, 1, 2, 2}, new int[]{1, 4, 1, 2, 2, 1}, new int[]{1, 1, 2, 2, 1, 4}, new int[]{1, 1, 2, 4, 1, 2}, new int[]{1, 2, 2, 1, 1, 4}, new int[]{1, 2, 2, 4, 1, 1}, new int[]{1, 4, 2, 1, 1, 2}, new int[]{1, 4, 2, 2, 1, 1}, new int[]{2, 4, 1, 2, 1, 1}, new int[]{2, 2, 1, 1, 1, 4}, new int[]{4, 1, 3, 1, 1, 1}, new int[]{2, 4, 1, 1, 1, 2}, new int[]{1, 3, 4, 1, 1, 1}, new int[]{1, 1, 1, 2, 4, 2}, new int[]{1, 2, 1, 1, 4, 2}, new int[]{1, 2, 1, 2, 4, 1}, new int[]{1, 1, 4, 2, 1, 2}, new int[]{1, 2, 4, 1, 1, 2}, new int[]{1, 2, 4, 2, 1, 1}, new int[]{4, 1, 1, 2, 1, 2}, new int[]{4, 2, 1, 1, 1, 2}, new int[]{4, 2, 1, 2, 1, 1}, new int[]{2, 1, 2, 1, 4, 1}, new int[]{2, 1, 4, 1, 2, 1}, new int[]{4, 1, 2, 1, 2, 1}, new int[]{1, 1, 1, 1, 4, 3}, new int[]{1, 1, 1, 3, 4, 1}, new int[]{1, 3, 1, 1, 4, 1}, new int[]{1, 1, 4, 1, 1, 3}, new int[]{1, 1, 4, 3, 1, 1}, new int[]{4, 1, 1, 1, 1, 3}, new int[]{4, 1, 1, 3, 1, 1}, new int[]{1, 1, 3, 1, 4, 1}, new int[]{1, 1, 4, 1, 3, 1}, new int[]{3, 1, 1, 1, 4, 1}, new int[]{4, 1, 1, 1, 3, 1}, new int[]{2, 1, 1, 4, 1, 2}, new int[]{2, 1, 1, 2, 1, 4}, new int[]{2, 1, 1, 2, 3, 2}, new int[]{2, 3, 3, 1, 1, 1, 2}};

    private static int h(b72 b72, int[] iArr, int i) throws o62 {
        o82.f(b72, i, iArr);
        float f = 0.25f;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            int[][] iArr2 = a;
            if (i3 >= iArr2.length) {
                break;
            }
            float e = o82.e(iArr, iArr2[i3], 0.7f);
            if (e < f) {
                i2 = i3;
                f = e;
            }
            i3++;
        }
        if (i2 >= 0) {
            return i2;
        }
        throw o62.a();
    }

    private static int[] i(b72 b72) throws o62 {
        int g = b72.g();
        int e = b72.e(0);
        int[] iArr = new int[6];
        int i = e;
        boolean z = false;
        int i2 = 0;
        while (e < g) {
            if (b72.c(e) != z) {
                iArr[i2] = iArr[i2] + 1;
            } else {
                if (i2 == 5) {
                    float f = 0.25f;
                    int i3 = -1;
                    for (int i4 = 103; i4 <= 105; i4++) {
                        float e2 = o82.e(iArr, a[i4], 0.7f);
                        if (e2 < f) {
                            i3 = i4;
                            f = e2;
                        }
                    }
                    if (i3 < 0 || !b72.i(Math.max(0, i - ((e - i) / 2)), i, false)) {
                        i += iArr[0] + iArr[1];
                        int i5 = i2 - 1;
                        System.arraycopy(iArr, 2, iArr, 0, i5);
                        iArr[i5] = 0;
                        iArr[i2] = 0;
                        i2--;
                    } else {
                        return new int[]{i, e, i3};
                    }
                } else {
                    i2++;
                }
                iArr[i2] = 1;
                z = !z;
            }
            e++;
        }
        throw o62.a();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e6, code lost:
        if (r9 != false) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x012c, code lost:
        if (r9 != false) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x012e, code lost:
        r3 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0133 A[PHI: r17 
      PHI: (r17v12 boolean) = (r17v17 boolean), (r17v19 boolean) binds: [B:62:0x010c, B:41:0x00c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x013f A[PHI: r16 r17 
      PHI: (r16v5 boolean) = (r16v6 boolean), (r16v1 boolean), (r16v1 boolean), (r16v1 boolean), (r16v1 boolean), (r16v1 boolean), (r16v1 boolean), (r16v1 boolean), (r16v1 boolean) binds: [B:79:0x013d, B:62:0x010c, B:63:0x0110, B:67:0x011c, B:66:0x0118, B:41:0x00c6, B:42:0x00cb, B:46:0x00d8, B:45:0x00d3] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r17v10 boolean) = (r17v11 boolean), (r17v17 boolean), (r17v17 boolean), (r17v17 boolean), (r17v17 boolean), (r17v19 boolean), (r17v19 boolean), (r17v19 boolean), (r17v19 boolean) binds: [B:79:0x013d, B:62:0x010c, B:63:0x0110, B:67:0x011c, B:66:0x0118, B:41:0x00c6, B:42:0x00cb, B:46:0x00d8, B:45:0x00d3] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.o82
    public t62 c(int i, b72 b72, Map<j62, ?> map) throws o62, k62, i62 {
        char c;
        boolean z;
        boolean z2 = false;
        boolean z3 = map != null && map.containsKey(j62.ASSUME_GS1);
        int[] i2 = i(b72);
        int i3 = i2[2];
        ArrayList arrayList = new ArrayList(20);
        arrayList.add(Byte.valueOf((byte) i3));
        switch (i3) {
            case 103:
                c = 'e';
                break;
            case 104:
                c = 'd';
                break;
            case 105:
                c = 'c';
                break;
            default:
                throw k62.a();
        }
        StringBuilder sb = new StringBuilder(20);
        int i4 = 6;
        int[] iArr = new int[6];
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = true;
        boolean z7 = false;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = i2[0];
        int i9 = i2[1];
        char c2 = c;
        while (!z5) {
            int h = h(b72, iArr, i9);
            arrayList.add(Byte.valueOf((byte) h));
            if (h != 106) {
                z6 = true;
            }
            if (h != 106) {
                i6++;
                i3 += i6 * h;
            }
            int i10 = i9;
            for (int i11 = 0; i11 < i4; i11++) {
                i10 += iArr[i11];
            }
            switch (h) {
                case 103:
                case 104:
                case 105:
                    throw k62.a();
                default:
                    String r15 = C0201.m82(32819);
                    switch (c2) {
                        case 'c':
                            if (h >= 100) {
                                if (h != 106) {
                                    z6 = false;
                                }
                                if (h != 106) {
                                    switch (h) {
                                        case 100:
                                            z = false;
                                            c2 = 'd';
                                            break;
                                        case 101:
                                            z = false;
                                            c2 = 'e';
                                            break;
                                        case 102:
                                            if (z3) {
                                                if (sb.length() == 0) {
                                                    sb.append(r15);
                                                } else {
                                                    sb.append((char) 29);
                                                }
                                            }
                                        default:
                                            z = false;
                                            break;
                                    }
                                } else {
                                    z = false;
                                    z5 = true;
                                    break;
                                }
                            } else {
                                if (h < 10) {
                                    sb.append('0');
                                }
                                sb.append(h);
                            }
                            z = false;
                        case 'd':
                            if (h < 96) {
                                if (z4 == z2) {
                                    sb.append((char) (h + 32));
                                } else {
                                    sb.append((char) (h + 32 + 128));
                                }
                                z = false;
                                z4 = false;
                                break;
                            } else {
                                if (h != 106) {
                                    z6 = false;
                                }
                                if (h != 106) {
                                    switch (h) {
                                        case 96:
                                        case 97:
                                        default:
                                            z = false;
                                            break;
                                        case 98:
                                            z = true;
                                            c2 = 'e';
                                            break;
                                        case 99:
                                            z = false;
                                            c2 = 'c';
                                            break;
                                        case 100:
                                            if (z2 || !z4) {
                                                if (z2) {
                                                }
                                                z = false;
                                                z4 = true;
                                                break;
                                            }
                                            z2 = true;
                                            z = false;
                                            z4 = false;
                                            break;
                                        case 101:
                                            z = false;
                                            c2 = 'e';
                                            break;
                                        case 102:
                                            if (z3) {
                                                if (sb.length() == 0) {
                                                    sb.append(r15);
                                                } else {
                                                    sb.append((char) 29);
                                                }
                                            }
                                            z = false;
                                            break;
                                    }
                                }
                                z5 = true;
                                z = false;
                            }
                            break;
                        case 'e':
                            if (h < 64) {
                                if (z4 == z2) {
                                    sb.append((char) (h + 32));
                                } else {
                                    sb.append((char) (h + 32 + 128));
                                }
                            } else if (h >= 96) {
                                if (h != 106) {
                                    z6 = false;
                                }
                                if (h != 106) {
                                    switch (h) {
                                        case 98:
                                            z = true;
                                            c2 = 'd';
                                            break;
                                        case 100:
                                            z = false;
                                            c2 = 'd';
                                            break;
                                        case 101:
                                            if (z2 || !z4) {
                                                if (z2) {
                                                }
                                                z = false;
                                                z4 = true;
                                                break;
                                            }
                                            z2 = true;
                                            break;
                                        case 102:
                                            if (z3) {
                                                if (sb.length() == 0) {
                                                    sb.append(r15);
                                                } else {
                                                    sb.append((char) 29);
                                                }
                                            }
                                            z = false;
                                            break;
                                    }
                                }
                                z5 = true;
                                z = false;
                            } else if (z4 == z2) {
                                sb.append((char) (h - 64));
                            } else {
                                sb.append((char) (h + 64));
                            }
                            z = false;
                            z4 = false;
                            break;
                        default:
                            z = false;
                            break;
                    }
                    if (z7) {
                        c2 = c2 == 'e' ? 'd' : 'e';
                    }
                    z7 = z;
                    i4 = 6;
                    i8 = i9;
                    i9 = i10;
                    i7 = i5;
                    i5 = h;
                    break;
            }
        }
        int i12 = i9 - i8;
        int f = b72.f(i9);
        if (!b72.i(f, Math.min(b72.g(), ((f - i8) / 2) + f), false)) {
            throw o62.a();
        } else if ((i3 - (i6 * i7)) % 103 == i7) {
            int length = sb.length();
            if (length != 0) {
                if (length > 0 && z6) {
                    if (c2 == 'c') {
                        sb.delete(length - 2, length);
                    } else {
                        sb.delete(length - 1, length);
                    }
                }
                float f2 = ((float) (i2[1] + i2[0])) / 2.0f;
                float f3 = ((float) i8) + (((float) i12) / 2.0f);
                int size = arrayList.size();
                byte[] bArr = new byte[size];
                for (int i13 = 0; i13 < size; i13++) {
                    bArr[i13] = ((Byte) arrayList.get(i13)).byteValue();
                }
                float f4 = (float) i;
                return new t62(sb.toString(), bArr, new v62[]{new v62(f2, f4), new v62(f3, f4)}, f62.CODE_128);
            }
            throw o62.a();
        } else {
            throw i62.a();
        }
    }
}
