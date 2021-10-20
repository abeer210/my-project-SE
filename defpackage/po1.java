package defpackage;

import java.nio.ByteBuffer;
import vigqyno.C0201;

/* renamed from: po1  reason: default package */
public final class po1 extends lo1 {
    private static int g(byte[] bArr, int i, long j, int i2) {
        if (i2 == 0) {
            return jo1.d(i);
        }
        if (i2 == 1) {
            return jo1.m(i, ho1.a(bArr, j));
        }
        if (i2 == 2) {
            return jo1.f(i, ho1.a(bArr, j), ho1.a(bArr, j + 1));
        }
        throw new AssertionError();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0061, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00b6, code lost:
        return -1;
     */
    @Override // defpackage.lo1
    public final int a(int i, byte[] bArr, int i2, int i3) {
        int i4;
        long j;
        if ((i2 | i3 | (bArr.length - i3)) >= 0) {
            long j2 = (long) i2;
            int i5 = (int) (((long) i3) - j2);
            if (i5 >= 16) {
                long j3 = j2;
                i4 = 0;
                while (true) {
                    if (i4 >= i5) {
                        i4 = i5;
                        break;
                    }
                    long j4 = j3 + 1;
                    if (ho1.a(bArr, j3) < 0) {
                        break;
                    }
                    i4++;
                    j3 = j4;
                }
            } else {
                i4 = 0;
            }
            int i6 = i5 - i4;
            long j5 = j2 + ((long) i4);
            while (true) {
                byte b = 0;
                while (true) {
                    if (i6 <= 0) {
                        break;
                    }
                    long j6 = j5 + 1;
                    b = ho1.a(bArr, j5);
                    if (b < 0) {
                        j5 = j6;
                        break;
                    }
                    i6--;
                    j5 = j6;
                }
                if (i6 == 0) {
                    return 0;
                }
                int i7 = i6 - 1;
                if (b >= -32) {
                    if (b >= -16) {
                        if (i7 >= 3) {
                            i6 = i7 - 3;
                            long j7 = j5 + 1;
                            byte a = ho1.a(bArr, j5);
                            if (a > -65 || (((b << 28) + (a + 112)) >> 30) != 0) {
                                break;
                            }
                            long j8 = j7 + 1;
                            if (ho1.a(bArr, j7) > -65) {
                                break;
                            }
                            j = j8 + 1;
                            if (ho1.a(bArr, j8) > -65) {
                                break;
                            }
                        } else {
                            return g(bArr, b, j5, i7);
                        }
                    } else if (i7 >= 2) {
                        i6 = i7 - 2;
                        long j9 = j5 + 1;
                        byte a2 = ho1.a(bArr, j5);
                        if (a2 > -65 || ((b == -32 && a2 < -96) || (b == -19 && a2 >= -96))) {
                            break;
                        }
                        j5 = j9 + 1;
                        if (ho1.a(bArr, j9) > -65) {
                            break;
                        }
                    } else {
                        return g(bArr, b, j5, i7);
                    }
                } else if (i7 != 0) {
                    i6 = i7 - 1;
                    if (b < -62) {
                        break;
                    }
                    j = j5 + 1;
                    if (ho1.a(bArr, j5) > -65) {
                        break;
                    }
                } else {
                    return b;
                }
                j5 = j;
            }
            return -1;
        }
        throw new ArrayIndexOutOfBoundsException(String.format(C0201.m82(9160), Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003d A[LOOP:1: B:13:0x003d->B:38:0x0105, LOOP_START, PHI: r2 r3 r4 r11 
      PHI: (r2v4 int) = (r2v3 int), (r2v6 int) binds: [B:10:0x0039, B:38:0x0105] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r3v3 char) = (r3v2 char), (r3v4 char) binds: [B:10:0x0039, B:38:0x0105] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r4v3 long) = (r4v2 long), (r4v5 long) binds: [B:10:0x0039, B:38:0x0105] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r11v3 long) = (r11v2 long), (r11v4 long) binds: [B:10:0x0039, B:38:0x0105] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.lo1
    public final int b(CharSequence charSequence, byte[] bArr, int i, int i2) {
        long j;
        long j2;
        int i3;
        char charAt;
        long j3 = (long) i;
        long j4 = ((long) i2) + j3;
        int length = charSequence.length();
        String r9 = C0201.m82(9161);
        String r10 = C0201.m82(9162);
        if (length > i2 || bArr.length - i2 < i) {
            char charAt2 = charSequence.charAt(length - 1);
            StringBuilder sb = new StringBuilder(37);
            sb.append(r10);
            sb.append(charAt2);
            sb.append(r9);
            sb.append(i + i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        int i4 = 0;
        while (true) {
            char c = 128;
            long j5 = 1;
            if (i4 < length && (charAt = charSequence.charAt(i4)) < 128) {
                ho1.i(bArr, j3, (byte) charAt);
                i4++;
                j3 = 1 + j3;
            } else if (i4 != length) {
                return (int) j3;
            } else {
                while (i4 < length) {
                    char charAt3 = charSequence.charAt(i4);
                    if (charAt3 < c && j3 < j4) {
                        long j6 = j3 + j5;
                        ho1.i(bArr, j3, (byte) charAt3);
                        j2 = j5;
                        j = j6;
                    } else if (charAt3 < 2048 && j3 <= j4 - 2) {
                        long j7 = j3 + j5;
                        ho1.i(bArr, j3, (byte) ((charAt3 >>> 6) | 960));
                        ho1.i(bArr, j7, (byte) ((charAt3 & '?') | 128));
                        j = j7 + j5;
                        j2 = j5;
                        i4++;
                        c = 128;
                        j3 = j;
                        j5 = j2;
                    } else if ((charAt3 < 55296 || 57343 < charAt3) && j3 <= j4 - 3) {
                        long j8 = j3 + j5;
                        ho1.i(bArr, j3, (byte) ((charAt3 >>> '\f') | 480));
                        long j9 = j8 + j5;
                        ho1.i(bArr, j8, (byte) (((charAt3 >>> 6) & 63) | 128));
                        ho1.i(bArr, j9, (byte) ((charAt3 & '?') | 128));
                        j = j9 + 1;
                        j2 = 1;
                    } else if (j3 <= j4 - 4) {
                        int i5 = i4 + 1;
                        if (i5 != length) {
                            char charAt4 = charSequence.charAt(i5);
                            if (Character.isSurrogatePair(charAt3, charAt4)) {
                                int codePoint = Character.toCodePoint(charAt3, charAt4);
                                long j10 = j3 + 1;
                                ho1.i(bArr, j3, (byte) ((codePoint >>> 18) | 240));
                                long j11 = j10 + 1;
                                ho1.i(bArr, j10, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j12 = j11 + 1;
                                ho1.i(bArr, j11, (byte) (((codePoint >>> 6) & 63) | 128));
                                j2 = 1;
                                j = j12 + 1;
                                ho1.i(bArr, j12, (byte) ((codePoint & 63) | 128));
                                i4 = i5;
                                i4++;
                                c = 128;
                                j3 = j;
                                j5 = j2;
                            } else {
                                i4 = i5;
                            }
                        }
                        throw new oo1(i4 - 1, length);
                    } else if (55296 > charAt3 || charAt3 > 57343 || ((i3 = i4 + 1) != length && Character.isSurrogatePair(charAt3, charSequence.charAt(i3)))) {
                        StringBuilder sb2 = new StringBuilder(46);
                        sb2.append(r10);
                        sb2.append(charAt3);
                        sb2.append(r9);
                        sb2.append(j3);
                        throw new ArrayIndexOutOfBoundsException(sb2.toString());
                    } else {
                        throw new oo1(i4, length);
                    }
                    i4++;
                    c = 128;
                    j3 = j;
                    j5 = j2;
                }
                return (int) j3;
            }
        }
        if (i4 != length) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004b A[LOOP:1: B:11:0x004b->B:36:0x010a, LOOP_START, PHI: r2 r4 r9 r10 
      PHI: (r2v2 long) = (r2v0 long), (r2v3 long) binds: [B:8:0x0043, B:36:0x010a] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r4v5 long) = (r4v4 long), (r4v7 long) binds: [B:8:0x0043, B:36:0x010a] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r9v3 int) = (r9v2 int), (r9v5 int) binds: [B:8:0x0043, B:36:0x010a] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r10v1 char) = (r10v0 char), (r10v2 char) binds: [B:8:0x0043, B:36:0x010a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0045  */
    @Override // defpackage.lo1
    public final void c(CharSequence charSequence, ByteBuffer byteBuffer) {
        long j;
        int i;
        char charAt;
        long k = ho1.k(byteBuffer);
        long position = ((long) byteBuffer.position()) + k;
        long limit = ((long) byteBuffer.limit()) + k;
        int length = charSequence.length();
        String r13 = C0201.m82(9163);
        String r14 = C0201.m82(9164);
        if (((long) length) <= limit - position) {
            int i2 = 0;
            while (true) {
                char c = 128;
                if (i2 < length && (charAt = charSequence.charAt(i2)) < 128) {
                    ho1.b(position, (byte) charAt);
                    i2++;
                    position = 1 + position;
                } else if (i2 != length) {
                    byteBuffer.position((int) (position - k));
                    return;
                } else {
                    while (i2 < length) {
                        char charAt2 = charSequence.charAt(i2);
                        if (charAt2 < c && position < limit) {
                            ho1.b(position, (byte) charAt2);
                            position++;
                            j = k;
                        } else if (charAt2 >= 2048 || position > limit - 2) {
                            j = k;
                            if ((charAt2 < 55296 || 57343 < charAt2) && position <= limit - 3) {
                                long j2 = position + 1;
                                ho1.b(position, (byte) ((charAt2 >>> '\f') | 480));
                                long j3 = j2 + 1;
                                ho1.b(j2, (byte) (((charAt2 >>> 6) & 63) | 128));
                                ho1.b(j3, (byte) ((charAt2 & '?') | 128));
                                position = j3 + 1;
                            } else if (position <= limit - 4) {
                                int i3 = i2 + 1;
                                if (i3 != length) {
                                    char charAt3 = charSequence.charAt(i3);
                                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                                        long j4 = position + 1;
                                        ho1.b(position, (byte) ((codePoint >>> 18) | 240));
                                        long j5 = j4 + 1;
                                        ho1.b(j4, (byte) (((codePoint >>> 12) & 63) | 128));
                                        long j6 = j5 + 1;
                                        ho1.b(j5, (byte) (((codePoint >>> 6) & 63) | 128));
                                        long j7 = j6 + 1;
                                        ho1.b(j6, (byte) ((codePoint & 63) | 128));
                                        i2 = i3;
                                        position = j7;
                                    } else {
                                        i2 = i3;
                                    }
                                }
                                throw new oo1(i2 - 1, length);
                            } else if (55296 > charAt2 || charAt2 > 57343 || ((i = i2 + 1) != length && Character.isSurrogatePair(charAt2, charSequence.charAt(i)))) {
                                StringBuilder sb = new StringBuilder(46);
                                sb.append(r14);
                                sb.append(charAt2);
                                sb.append(r13);
                                sb.append(position);
                                throw new ArrayIndexOutOfBoundsException(sb.toString());
                            } else {
                                throw new oo1(i2, length);
                            }
                        } else {
                            j = k;
                            long j8 = position + 1;
                            ho1.b(position, (byte) ((charAt2 >>> 6) | 960));
                            ho1.b(j8, (byte) ((charAt2 & '?') | 128));
                            position = j8 + 1;
                        }
                        i2++;
                        k = j;
                        c = 128;
                    }
                    byteBuffer.position((int) (position - k));
                    return;
                }
            }
            if (i2 != length) {
            }
        } else {
            char charAt4 = charSequence.charAt(length - 1);
            int limit2 = byteBuffer.limit();
            StringBuilder sb2 = new StringBuilder(37);
            sb2.append(r14);
            sb2.append(charAt4);
            sb2.append(r13);
            sb2.append(limit2);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
    }

    @Override // defpackage.lo1
    public final String f(byte[] bArr, int i, int i2) throws sl1 {
        if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte a = ho1.a(bArr, (long) i);
                if (!ko1.m(a)) {
                    break;
                }
                i++;
                ko1.h(a, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte a2 = ho1.a(bArr, (long) i);
                if (ko1.m(a2)) {
                    int i7 = i5 + 1;
                    ko1.h(a2, cArr, i5);
                    while (i6 < i3) {
                        byte a3 = ho1.a(bArr, (long) i6);
                        if (!ko1.m(a3)) {
                            break;
                        }
                        i6++;
                        ko1.h(a3, cArr, i7);
                        i7++;
                    }
                    i = i6;
                    i5 = i7;
                } else if (ko1.n(a2)) {
                    if (i6 < i3) {
                        int i8 = i6 + 1;
                        ko1.g(a2, ho1.a(bArr, (long) i6), cArr, i5);
                        i = i8;
                        i5++;
                    } else {
                        throw sl1.i();
                    }
                } else if (ko1.o(a2)) {
                    if (i6 < i3 - 1) {
                        int i9 = i6 + 1;
                        int i10 = i9 + 1;
                        ko1.f(a2, ho1.a(bArr, (long) i6), ho1.a(bArr, (long) i9), cArr, i5);
                        i = i10;
                        i5++;
                    } else {
                        throw sl1.i();
                    }
                } else if (i6 < i3 - 2) {
                    int i11 = i6 + 1;
                    int i12 = i11 + 1;
                    ko1.e(a2, ho1.a(bArr, (long) i6), ho1.a(bArr, (long) i11), ho1.a(bArr, (long) i12), cArr, i5);
                    i = i12 + 1;
                    i5 = i5 + 1 + 1;
                } else {
                    throw sl1.i();
                }
            }
            return new String(cArr, 0, i5);
        }
        throw new ArrayIndexOutOfBoundsException(String.format(C0201.m82(9165), Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
    }
}
