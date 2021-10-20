package defpackage;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import vigqyno.C0201;

/* renamed from: zo1  reason: default package */
public final class zo1 {
    public static final String d = null;
    public static final String e = null;
    public static final String f = null;
    private final ByteBuffer a;
    private qk1 b;
    private int c;

    static {
        C0201.m83(zo1.class, 34);
    }

    private zo1(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, i, i2));
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
                                sb.append(C0201.m82(10953));
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
        sb2.append(C0201.m82(10954));
        sb2.append(((long) i3) + 4294967296L);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static int e(int i) {
        return j(i << 3);
    }

    public static int f(int i) {
        if (i >= 0) {
            return j(i);
        }
        return 10;
    }

    public static int g(int i, hp1 hp1) {
        int e2 = e(i);
        int f2 = hp1.f();
        return e2 + j(f2) + f2;
    }

    public static int h(int i, String str) {
        return e(i) + x(str);
    }

    public static int j(int i) {
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

    private final void k(int i) throws IOException {
        byte b2 = (byte) i;
        if (this.a.hasRemaining()) {
            this.a.put(b2);
            return;
        }
        throw new ap1(this.a.position(), this.a.limit());
    }

    public static int m(int i, long j) {
        return e(i) + ((-128 & j) == 0 ? 1 : (-16384 & j) == 0 ? 2 : (-2097152 & j) == 0 ? 3 : (-268435456 & j) == 0 ? 4 : (-34359738368L & j) == 0 ? 5 : (-4398046511104L & j) == 0 ? 6 : (-562949953421312L & j) == 0 ? 7 : (-72057594037927936L & j) == 0 ? 8 : (j & Long.MIN_VALUE) == 0 ? 9 : 10);
    }

    private final void n(int i, int i2) throws IOException {
        l((i << 3) | i2);
    }

    private static void o(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i;
        int i2;
        char charAt;
        if (!byteBuffer.isReadOnly()) {
            boolean hasArray = byteBuffer.hasArray();
            String str = f;
            int i3 = 0;
            if (hasArray) {
                try {
                    byte[] array = byteBuffer.array();
                    int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                    int remaining = byteBuffer.remaining();
                    int length = charSequence.length();
                    int i4 = remaining + arrayOffset;
                    while (i3 < length) {
                        int i5 = i3 + arrayOffset;
                        if (i5 >= i4 || (charAt = charSequence.charAt(i3)) >= 128) {
                            break;
                        }
                        array[i5] = (byte) charAt;
                        i3++;
                    }
                    if (i3 == length) {
                        i = arrayOffset + length;
                    } else {
                        i = arrayOffset + i3;
                        while (i3 < length) {
                            char charAt2 = charSequence.charAt(i3);
                            if (charAt2 < 128 && i < i4) {
                                i2 = i + 1;
                                array[i] = (byte) charAt2;
                            } else if (charAt2 < 2048 && i <= i4 - 2) {
                                int i6 = i + 1;
                                array[i] = (byte) ((charAt2 >>> 6) | 960);
                                i = i6 + 1;
                                array[i6] = (byte) ((charAt2 & '?') | 128);
                                i3++;
                            } else if ((charAt2 < 55296 || 57343 < charAt2) && i <= i4 - 3) {
                                int i7 = i + 1;
                                array[i] = (byte) ((charAt2 >>> '\f') | 480);
                                int i8 = i7 + 1;
                                array[i7] = (byte) (((charAt2 >>> 6) & 63) | 128);
                                i2 = i8 + 1;
                                array[i8] = (byte) ((charAt2 & '?') | 128);
                            } else if (i <= i4 - 4) {
                                int i9 = i3 + 1;
                                if (i9 != charSequence.length()) {
                                    char charAt3 = charSequence.charAt(i9);
                                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                                        int i10 = i + 1;
                                        array[i] = (byte) ((codePoint >>> 18) | 240);
                                        int i11 = i10 + 1;
                                        array[i10] = (byte) (((codePoint >>> 12) & 63) | 128);
                                        int i12 = i11 + 1;
                                        array[i11] = (byte) (((codePoint >>> 6) & 63) | 128);
                                        i = i12 + 1;
                                        array[i12] = (byte) ((codePoint & 63) | 128);
                                        i3 = i9;
                                        i3++;
                                    } else {
                                        i3 = i9;
                                    }
                                }
                                StringBuilder sb = new StringBuilder(39);
                                sb.append(str);
                                sb.append(i3 - 1);
                                throw new IllegalArgumentException(sb.toString());
                            } else {
                                StringBuilder sb2 = new StringBuilder(37);
                                sb2.append(e);
                                sb2.append(charAt2);
                                sb2.append(d);
                                sb2.append(i);
                                throw new ArrayIndexOutOfBoundsException(sb2.toString());
                            }
                            i = i2;
                            i3++;
                        }
                    }
                    byteBuffer.position(i - byteBuffer.arrayOffset());
                } catch (ArrayIndexOutOfBoundsException e2) {
                    BufferOverflowException bufferOverflowException = new BufferOverflowException();
                    bufferOverflowException.initCause(e2);
                    throw bufferOverflowException;
                }
            } else {
                int length2 = charSequence.length();
                while (i3 < length2) {
                    char charAt4 = charSequence.charAt(i3);
                    if (charAt4 < 128) {
                        byteBuffer.put((byte) charAt4);
                    } else if (charAt4 < 2048) {
                        byteBuffer.put((byte) ((charAt4 >>> 6) | 960));
                        byteBuffer.put((byte) ((charAt4 & '?') | 128));
                    } else if (charAt4 < 55296 || 57343 < charAt4) {
                        byteBuffer.put((byte) ((charAt4 >>> '\f') | 480));
                        byteBuffer.put((byte) (((charAt4 >>> 6) & 63) | 128));
                        byteBuffer.put((byte) ((charAt4 & '?') | 128));
                    } else {
                        int i13 = i3 + 1;
                        if (i13 != charSequence.length()) {
                            char charAt5 = charSequence.charAt(i13);
                            if (Character.isSurrogatePair(charAt4, charAt5)) {
                                int codePoint2 = Character.toCodePoint(charAt4, charAt5);
                                byteBuffer.put((byte) ((codePoint2 >>> 18) | 240));
                                byteBuffer.put((byte) (((codePoint2 >>> 12) & 63) | 128));
                                byteBuffer.put((byte) (((codePoint2 >>> 6) & 63) | 128));
                                byteBuffer.put((byte) ((codePoint2 & 63) | 128));
                                i3 = i13;
                            } else {
                                i3 = i13;
                            }
                        }
                        StringBuilder sb3 = new StringBuilder(39);
                        sb3.append(str);
                        sb3.append(i3 - 1);
                        throw new IllegalArgumentException(sb3.toString());
                    }
                    i3++;
                }
            }
        } else {
            throw new ReadOnlyBufferException();
        }
    }

    public static int s(int i, int i2) {
        return e(i) + f(i2);
    }

    public static zo1 u(byte[] bArr) {
        return v(bArr, 0, bArr.length);
    }

    public static zo1 v(byte[] bArr, int i, int i2) {
        return new zo1(bArr, 0, i2);
    }

    public static int x(String str) {
        int a2 = a(str);
        return j(a2) + a2;
    }

    private final void y(long j) throws IOException {
        while ((-128 & j) != 0) {
            k((((int) j) & 127) | 128);
            j >>>= 7;
        }
        k((int) j);
    }

    public final void b(int i, float f2) throws IOException {
        n(i, 5);
        int floatToIntBits = Float.floatToIntBits(f2);
        if (this.a.remaining() >= 4) {
            this.a.putInt(floatToIntBits);
            return;
        }
        throw new ap1(this.a.position(), this.a.limit());
    }

    public final void c(int i, hp1 hp1) throws IOException {
        n(i, 2);
        if (hp1.a < 0) {
            hp1.f();
        }
        l(hp1.a);
        hp1.c(this);
    }

    public final void d(int i, String str) throws IOException {
        n(i, 2);
        try {
            int j = j(str.length());
            if (j == j(str.length() * 3)) {
                int position = this.a.position();
                if (this.a.remaining() >= j) {
                    this.a.position(position + j);
                    o(str, this.a);
                    int position2 = this.a.position();
                    this.a.position(position);
                    l((position2 - position) - j);
                    this.a.position(position2);
                    return;
                }
                throw new ap1(position + j, this.a.limit());
            }
            l(a(str));
            o(str, this.a);
        } catch (BufferOverflowException e2) {
            ap1 ap1 = new ap1(this.a.position(), this.a.limit());
            ap1.initCause(e2);
            throw ap1;
        }
    }

    public final void i(int i, boolean z) throws IOException {
        n(i, 0);
        byte b2 = z ? (byte) 1 : 0;
        if (this.a.hasRemaining()) {
            this.a.put(b2);
            return;
        }
        throw new ap1(this.a.position(), this.a.limit());
    }

    public final void l(int i) throws IOException {
        while ((i & -128) != 0) {
            k((i & 127) | 128);
            i >>>= 7;
        }
        k(i);
    }

    public final void p(int i, int i2) throws IOException {
        n(i, 0);
        if (i2 >= 0) {
            l(i2);
        } else {
            y((long) i2);
        }
    }

    public final void q(int i, tm1 tm1) throws IOException {
        if (this.b == null) {
            this.b = qk1.f(this.a);
            this.c = this.a.position();
        } else if (this.c != this.a.position()) {
            this.b.c(this.a.array(), this.c, this.a.position() - this.c);
            this.c = this.a.position();
        }
        qk1 qk1 = this.b;
        qk1.l(2, tm1);
        qk1.b();
        this.c = this.a.position();
    }

    public final void r() {
        if (this.a.remaining() != 0) {
            throw new IllegalStateException(String.format(C0201.m82(10955), Integer.valueOf(this.a.remaining())));
        }
    }

    public final void t(int i, long j) throws IOException {
        n(i, 0);
        y(j);
    }

    public final void w(byte[] bArr) throws IOException {
        int length = bArr.length;
        if (this.a.remaining() >= length) {
            this.a.put(bArr, 0, length);
            return;
        }
        throw new ap1(this.a.position(), this.a.limit());
    }

    private zo1(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }
}
