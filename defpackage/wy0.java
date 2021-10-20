package defpackage;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import vigqyno.C0201;

/* renamed from: wy0  reason: default package */
public final class wy0 {
    public static final String d = null;
    public static final String e = null;
    public static final String f = null;
    private final ByteBuffer a;
    private ru0 b;
    private int c;

    static {
        C0201.m83(wy0.class, 50);
    }

    private wy0(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    private wy0(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, i, i2));
    }

    private static int A(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    private static int a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                StringBuilder sb = new StringBuilder(39);
                                sb.append(C0201.m82(16990));
                                sb.append(i2);
                                throw new IllegalArgumentException(sb.toString());
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append(C0201.m82(16991));
        sb2.append(((long) i3) + 4294967296L);
        throw new IllegalArgumentException(sb2.toString());
    }

    private final void e(int i) throws IOException {
        byte b2 = (byte) i;
        if (this.a.hasRemaining()) {
            this.a.put(b2);
            return;
        }
        throw new xy0(this.a.position(), this.a.limit());
    }

    private final void f(int i) throws IOException {
        while ((i & -128) != 0) {
            e((i & 127) | 128);
            i >>>= 7;
        }
        e(i);
    }

    public static int g(int i, dz0 dz0) {
        int y = y(i);
        int c2 = dz0.c();
        return y + A(c2) + c2;
    }

    public static int h(int i, String str) {
        return y(i) + r(str);
    }

    public static int i(int i, byte[] bArr) {
        return y(i) + s(bArr);
    }

    public static int m(int i, long j) {
        return y(i) + x(j);
    }

    private static void n(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i;
        int i2;
        int i3;
        char charAt;
        if (!byteBuffer.isReadOnly()) {
            boolean hasArray = byteBuffer.hasArray();
            String str = f;
            int i4 = 0;
            if (hasArray) {
                try {
                    byte[] array = byteBuffer.array();
                    int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                    int remaining = byteBuffer.remaining();
                    int length = charSequence.length();
                    int i5 = remaining + arrayOffset;
                    while (i4 < length) {
                        int i6 = i4 + arrayOffset;
                        if (i6 >= i5 || (charAt = charSequence.charAt(i4)) >= 128) {
                            break;
                        }
                        array[i6] = (byte) charAt;
                        i4++;
                    }
                    if (i4 == length) {
                        i2 = arrayOffset + length;
                    } else {
                        i2 = arrayOffset + i4;
                        while (i4 < length) {
                            char charAt2 = charSequence.charAt(i4);
                            if (charAt2 < 128 && i2 < i5) {
                                i3 = i2 + 1;
                                array[i2] = (byte) charAt2;
                            } else if (charAt2 < 2048 && i2 <= i5 - 2) {
                                int i7 = i2 + 1;
                                array[i2] = (byte) ((charAt2 >>> 6) | 960);
                                i2 = i7 + 1;
                                array[i7] = (byte) ((charAt2 & '?') | 128);
                                i4++;
                            } else if ((charAt2 < 55296 || 57343 < charAt2) && i2 <= i5 - 3) {
                                int i8 = i2 + 1;
                                array[i2] = (byte) ((charAt2 >>> '\f') | 480);
                                int i9 = i8 + 1;
                                array[i8] = (byte) (((charAt2 >>> 6) & 63) | 128);
                                i3 = i9 + 1;
                                array[i9] = (byte) ((charAt2 & '?') | 128);
                            } else if (i2 <= i5 - 4) {
                                int i10 = i4 + 1;
                                if (i10 != charSequence.length()) {
                                    char charAt3 = charSequence.charAt(i10);
                                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                                        int i11 = i2 + 1;
                                        array[i2] = (byte) ((codePoint >>> 18) | 240);
                                        int i12 = i11 + 1;
                                        array[i11] = (byte) (((codePoint >>> 12) & 63) | 128);
                                        int i13 = i12 + 1;
                                        array[i12] = (byte) (((codePoint >>> 6) & 63) | 128);
                                        i2 = i13 + 1;
                                        array[i13] = (byte) ((codePoint & 63) | 128);
                                        i4 = i10;
                                        i4++;
                                    } else {
                                        i4 = i10;
                                    }
                                }
                                StringBuilder sb = new StringBuilder(39);
                                sb.append(str);
                                sb.append(i4 - 1);
                                throw new IllegalArgumentException(sb.toString());
                            } else {
                                StringBuilder sb2 = new StringBuilder(37);
                                sb2.append(d);
                                sb2.append(charAt2);
                                sb2.append(e);
                                sb2.append(i2);
                                throw new ArrayIndexOutOfBoundsException(sb2.toString());
                            }
                            i2 = i3;
                            i4++;
                        }
                    }
                    byteBuffer.position(i2 - byteBuffer.arrayOffset());
                } catch (ArrayIndexOutOfBoundsException e2) {
                    BufferOverflowException bufferOverflowException = new BufferOverflowException();
                    bufferOverflowException.initCause(e2);
                    throw bufferOverflowException;
                }
            } else {
                int length2 = charSequence.length();
                while (i4 < length2) {
                    char charAt4 = charSequence.charAt(i4);
                    char c2 = charAt4;
                    if (charAt4 >= 128) {
                        if (charAt4 < 2048) {
                            i = (charAt4 >>> 6) | 960;
                        } else if (charAt4 < 55296 || 57343 < charAt4) {
                            byteBuffer.put((byte) ((charAt4 >>> '\f') | 480));
                            i = ((charAt4 >>> 6) & 63) | 128;
                        } else {
                            int i14 = i4 + 1;
                            if (i14 != charSequence.length()) {
                                char charAt5 = charSequence.charAt(i14);
                                if (Character.isSurrogatePair(charAt4, charAt5)) {
                                    int codePoint2 = Character.toCodePoint(charAt4, charAt5);
                                    byteBuffer.put((byte) ((codePoint2 >>> 18) | 240));
                                    byteBuffer.put((byte) (((codePoint2 >>> 12) & 63) | 128));
                                    byteBuffer.put((byte) (((codePoint2 >>> 6) & 63) | 128));
                                    byteBuffer.put((byte) ((codePoint2 & 63) | 128));
                                    i4 = i14;
                                    i4++;
                                } else {
                                    i4 = i14;
                                }
                            }
                            StringBuilder sb3 = new StringBuilder(39);
                            sb3.append(str);
                            sb3.append(i4 - 1);
                            throw new IllegalArgumentException(sb3.toString());
                        }
                        byteBuffer.put((byte) i);
                        c2 = (charAt4 & '?') | 128;
                    }
                    byteBuffer.put(c2 == 1 ? (byte) 1 : 0);
                    i4++;
                }
            }
        } else {
            throw new ReadOnlyBufferException();
        }
    }

    public static wy0 q(byte[] bArr) {
        return t(bArr, 0, bArr.length);
    }

    public static int r(String str) {
        int a2 = a(str);
        return A(a2) + a2;
    }

    public static int s(byte[] bArr) {
        return A(bArr.length) + bArr.length;
    }

    public static wy0 t(byte[] bArr, int i, int i2) {
        return new wy0(bArr, 0, i2);
    }

    public static long v(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int x(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if ((-16384 & j) == 0) {
            return 2;
        }
        if ((-2097152 & j) == 0) {
            return 3;
        }
        if ((-268435456 & j) == 0) {
            return 4;
        }
        if ((-34359738368L & j) == 0) {
            return 5;
        }
        if ((-4398046511104L & j) == 0) {
            return 6;
        }
        if ((-562949953421312L & j) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int y(int i) {
        return A(i << 3);
    }

    public static int z(int i) {
        if (i >= 0) {
            return A(i);
        }
        return 10;
    }

    public final void b(int i, dz0 dz0) throws IOException {
        j(i, 2);
        if (dz0.a < 0) {
            dz0.c();
        }
        f(dz0.a);
        dz0.a(this);
    }

    public final void c(int i, String str) throws IOException {
        j(i, 2);
        try {
            int A = A(str.length());
            if (A == A(str.length() * 3)) {
                int position = this.a.position();
                if (this.a.remaining() >= A) {
                    this.a.position(position + A);
                    n(str, this.a);
                    int position2 = this.a.position();
                    this.a.position(position);
                    f((position2 - position) - A);
                    this.a.position(position2);
                    return;
                }
                throw new xy0(position + A, this.a.limit());
            }
            f(a(str));
            n(str, this.a);
        } catch (BufferOverflowException e2) {
            xy0 xy0 = new xy0(this.a.position(), this.a.limit());
            xy0.initCause(e2);
            throw xy0;
        }
    }

    public final void d(int i, byte[] bArr) throws IOException {
        j(i, 2);
        f(bArr.length);
        int length = bArr.length;
        if (this.a.remaining() >= length) {
            this.a.put(bArr, 0, length);
            return;
        }
        throw new xy0(this.a.position(), this.a.limit());
    }

    public final void j(int i, int i2) throws IOException {
        f((i << 3) | i2);
    }

    public final void k(int i, boolean z) throws IOException {
        j(25, 0);
        byte b2 = z ? (byte) 1 : 0;
        if (this.a.hasRemaining()) {
            this.a.put(b2);
            return;
        }
        throw new xy0(this.a.position(), this.a.limit());
    }

    public final void l(int i, int i2) throws IOException {
        j(i, 0);
        if (i2 >= 0) {
            f(i2);
        } else {
            w((long) i2);
        }
    }

    public final void o(int i, qw0 qw0) throws IOException {
        if (this.b == null) {
            this.b = ru0.f(this.a);
        } else {
            if (this.c != this.a.position()) {
                this.b.c(this.a.array(), this.c, this.a.position() - this.c);
            }
            ru0 ru0 = this.b;
            ru0.n(i, qw0);
            ru0.b();
            this.c = this.a.position();
        }
        this.c = this.a.position();
        ru0 ru02 = this.b;
        ru02.n(i, qw0);
        ru02.b();
        this.c = this.a.position();
    }

    public final void p() {
        if (this.a.remaining() != 0) {
            throw new IllegalStateException(String.format(C0201.m82(16992), Integer.valueOf(this.a.remaining())));
        }
    }

    public final void u(int i, long j) throws IOException {
        j(i, 0);
        w(j);
    }

    public final void w(long j) throws IOException {
        while ((-128 & j) != 0) {
            e((((int) j) & 127) | 128);
            j >>>= 7;
        }
        e((int) j);
    }
}
