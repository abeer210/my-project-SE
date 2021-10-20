package defpackage;

import java.nio.ByteBuffer;
import vigqyno.C0201;

/* renamed from: ny0  reason: default package */
public final class ny0 extends ky0 {
    private static int f(byte[] bArr, int i, long j, int i2) {
        if (i2 == 0) {
            return jy0.d(i);
        }
        if (i2 == 1) {
            return jy0.l(i, hy0.a(bArr, j));
        }
        if (i2 == 2) {
            return jy0.f(i, hy0.a(bArr, j), hy0.a(bArr, j + 1));
        }
        throw new AssertionError();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0061, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00b6, code lost:
        return -1;
     */
    @Override // defpackage.ky0
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
                    if (hy0.a(bArr, j3) < 0) {
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
                    b = hy0.a(bArr, j5);
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
                            byte a = hy0.a(bArr, j5);
                            if (a > -65 || (((b << 28) + (a + 112)) >> 30) != 0) {
                                break;
                            }
                            long j8 = j7 + 1;
                            if (hy0.a(bArr, j7) > -65) {
                                break;
                            }
                            j = j8 + 1;
                            if (hy0.a(bArr, j8) > -65) {
                                break;
                            }
                        } else {
                            return f(bArr, b, j5, i7);
                        }
                    } else if (i7 >= 2) {
                        i6 = i7 - 2;
                        long j9 = j5 + 1;
                        byte a2 = hy0.a(bArr, j5);
                        if (a2 > -65 || ((b == -32 && a2 < -96) || (b == -19 && a2 >= -96))) {
                            break;
                        }
                        j5 = j9 + 1;
                        if (hy0.a(bArr, j9) > -65) {
                            break;
                        }
                    } else {
                        return f(bArr, b, j5, i7);
                    }
                } else if (i7 != 0) {
                    i6 = i7 - 1;
                    if (b < -62) {
                        break;
                    }
                    j = j5 + 1;
                    if (hy0.a(bArr, j5) > -65) {
                        break;
                    }
                } else {
                    return b;
                }
                j5 = j;
            }
            return -1;
        }
        throw new ArrayIndexOutOfBoundsException(String.format(C0201.m82(2172), Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003d A[LOOP:1: B:13:0x003d->B:38:0x0105, LOOP_START, PHI: r2 r3 r4 r11 
      PHI: (r2v4 int) = (r2v3 int), (r2v6 int) binds: [B:10:0x0039, B:38:0x0105] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r3v3 char) = (r3v2 char), (r3v4 char) binds: [B:10:0x0039, B:38:0x0105] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r4v3 long) = (r4v2 long), (r4v5 long) binds: [B:10:0x0039, B:38:0x0105] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r11v3 long) = (r11v2 long), (r11v4 long) binds: [B:10:0x0039, B:38:0x0105] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.ky0
    public final int b(CharSequence charSequence, byte[] bArr, int i, int i2) {
        long j;
        long j2;
        int i3;
        char charAt;
        long j3 = (long) i;
        long j4 = ((long) i2) + j3;
        int length = charSequence.length();
        String r9 = C0201.m82(2173);
        String r10 = C0201.m82(2174);
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
                hy0.k(bArr, j3, (byte) charAt);
                i4++;
                j3 = 1 + j3;
            } else if (i4 != length) {
                return (int) j3;
            } else {
                while (i4 < length) {
                    char charAt3 = charSequence.charAt(i4);
                    if (charAt3 < c && j3 < j4) {
                        long j6 = j3 + j5;
                        hy0.k(bArr, j3, (byte) charAt3);
                        j2 = j5;
                        j = j6;
                    } else if (charAt3 < 2048 && j3 <= j4 - 2) {
                        long j7 = j3 + j5;
                        hy0.k(bArr, j3, (byte) ((charAt3 >>> 6) | 960));
                        hy0.k(bArr, j7, (byte) ((charAt3 & '?') | 128));
                        j = j7 + j5;
                        j2 = j5;
                        i4++;
                        c = 128;
                        j3 = j;
                        j5 = j2;
                    } else if ((charAt3 < 55296 || 57343 < charAt3) && j3 <= j4 - 3) {
                        long j8 = j3 + j5;
                        hy0.k(bArr, j3, (byte) ((charAt3 >>> '\f') | 480));
                        long j9 = j8 + j5;
                        hy0.k(bArr, j8, (byte) (((charAt3 >>> 6) & 63) | 128));
                        hy0.k(bArr, j9, (byte) ((charAt3 & '?') | 128));
                        j = j9 + 1;
                        j2 = 1;
                    } else if (j3 <= j4 - 4) {
                        int i5 = i4 + 1;
                        if (i5 != length) {
                            char charAt4 = charSequence.charAt(i5);
                            if (Character.isSurrogatePair(charAt3, charAt4)) {
                                int codePoint = Character.toCodePoint(charAt3, charAt4);
                                long j10 = j3 + 1;
                                hy0.k(bArr, j3, (byte) ((codePoint >>> 18) | 240));
                                long j11 = j10 + 1;
                                hy0.k(bArr, j10, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j12 = j11 + 1;
                                hy0.k(bArr, j11, (byte) (((codePoint >>> 6) & 63) | 128));
                                j2 = 1;
                                j = j12 + 1;
                                hy0.k(bArr, j12, (byte) ((codePoint & 63) | 128));
                                i4 = i5;
                                i4++;
                                c = 128;
                                j3 = j;
                                j5 = j2;
                            } else {
                                i4 = i5;
                            }
                        }
                        throw new my0(i4 - 1, length);
                    } else if (55296 > charAt3 || charAt3 > 57343 || ((i3 = i4 + 1) != length && Character.isSurrogatePair(charAt3, charSequence.charAt(i3)))) {
                        StringBuilder sb2 = new StringBuilder(46);
                        sb2.append(r10);
                        sb2.append(charAt3);
                        sb2.append(r9);
                        sb2.append(j3);
                        throw new ArrayIndexOutOfBoundsException(sb2.toString());
                    } else {
                        throw new my0(i4, length);
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

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004b A[LOOP:1: B:12:0x004b->B:37:0x010a, LOOP_START, PHI: r2 r4 r9 r10 
      PHI: (r2v2 long) = (r2v0 long), (r2v3 long) binds: [B:8:0x0043, B:37:0x010a] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r4v5 long) = (r4v4 long), (r4v7 long) binds: [B:8:0x0043, B:37:0x010a] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r9v3 int) = (r9v2 int), (r9v5 int) binds: [B:8:0x0043, B:37:0x010a] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r10v1 char) = (r10v0 char), (r10v2 char) binds: [B:8:0x0043, B:37:0x010a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0045  */
    @Override // defpackage.ky0
    public final void c(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i;
        long j;
        int i2;
        char charAt;
        ByteBuffer byteBuffer2 = byteBuffer;
        long o = hy0.o(byteBuffer);
        long position = ((long) byteBuffer.position()) + o;
        long limit = ((long) byteBuffer.limit()) + o;
        int length = charSequence.length();
        String r13 = C0201.m82(2175);
        String r14 = C0201.m82(2176);
        if (((long) length) <= limit - position) {
            int i3 = 0;
            while (true) {
                char c = 128;
                if (i3 < length && (charAt = charSequence.charAt(i3)) < 128) {
                    hy0.c(position, (byte) charAt);
                    i3++;
                    position = 1 + position;
                } else if (i3 != length) {
                    i = (int) (position - o);
                } else {
                    while (i3 < length) {
                        char charAt2 = charSequence.charAt(i3);
                        if (charAt2 < c && position < limit) {
                            hy0.c(position, (byte) charAt2);
                            position++;
                            j = o;
                        } else if (charAt2 >= 2048 || position > limit - 2) {
                            j = o;
                            if ((charAt2 < 55296 || 57343 < charAt2) && position <= limit - 3) {
                                long j2 = position + 1;
                                hy0.c(position, (byte) ((charAt2 >>> '\f') | 480));
                                long j3 = j2 + 1;
                                hy0.c(j2, (byte) (((charAt2 >>> 6) & 63) | 128));
                                hy0.c(j3, (byte) ((charAt2 & '?') | 128));
                                position = j3 + 1;
                            } else if (position <= limit - 4) {
                                int i4 = i3 + 1;
                                if (i4 != length) {
                                    char charAt3 = charSequence.charAt(i4);
                                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                                        long j4 = position + 1;
                                        hy0.c(position, (byte) ((codePoint >>> 18) | 240));
                                        long j5 = j4 + 1;
                                        hy0.c(j4, (byte) (((codePoint >>> 12) & 63) | 128));
                                        long j6 = j5 + 1;
                                        hy0.c(j5, (byte) (((codePoint >>> 6) & 63) | 128));
                                        long j7 = j6 + 1;
                                        hy0.c(j6, (byte) ((codePoint & 63) | 128));
                                        i3 = i4;
                                        position = j7;
                                    } else {
                                        i3 = i4;
                                    }
                                }
                                throw new my0(i3 - 1, length);
                            } else if (55296 > charAt2 || charAt2 > 57343 || ((i2 = i3 + 1) != length && Character.isSurrogatePair(charAt2, charSequence.charAt(i2)))) {
                                StringBuilder sb = new StringBuilder(46);
                                sb.append(r14);
                                sb.append(charAt2);
                                sb.append(r13);
                                sb.append(position);
                                throw new ArrayIndexOutOfBoundsException(sb.toString());
                            } else {
                                throw new my0(i3, length);
                            }
                        } else {
                            j = o;
                            long j8 = position + 1;
                            hy0.c(position, (byte) ((charAt2 >>> 6) | 960));
                            hy0.c(j8, (byte) ((charAt2 & '?') | 128));
                            position = j8 + 1;
                        }
                        i3++;
                        o = j;
                        c = 128;
                    }
                    i = (int) (position - o);
                    byteBuffer2 = byteBuffer;
                }
            }
            if (i3 != length) {
            }
            byteBuffer2.position(i);
            return;
        }
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
