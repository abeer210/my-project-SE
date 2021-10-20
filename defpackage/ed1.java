package defpackage;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import vigqyno.C0201;

/* renamed from: ed1  reason: default package */
public final class ed1 {
    public static final String d = null;
    public static final String e = null;
    public static final String f = null;
    private final ByteBuffer a;
    private r81 b;
    private int c;

    static {
        C0201.m83(ed1.class, 73);
    }

    private ed1(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, 0, i2));
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
                                sb.append(C0201.m82(23738));
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
        sb2.append(C0201.m82(23739));
        sb2.append(((long) i3) + 4294967296L);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static int c(int i, md1 md1) {
        int g = g(i);
        int d2 = md1.d();
        return g + i(d2) + d2;
    }

    public static int g(int i) {
        return i(i << 3);
    }

    public static int h(int i) {
        if (i >= 0) {
            return i(i);
        }
        return 10;
    }

    public static int i(int i) {
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

    public static int k(int i, String str) {
        int g = g(i);
        int a2 = a(str);
        return g + i(a2) + a2;
    }

    private final void m(int i) throws IOException {
        byte b2 = (byte) i;
        if (this.a.hasRemaining()) {
            this.a.put(b2);
            return;
        }
        throw new dd1(this.a.position(), this.a.limit());
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
                                sb2.append(d);
                                sb2.append(charAt2);
                                sb2.append(e);
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

    public static int q(int i, int i2) {
        return g(i) + h(i2);
    }

    public static ed1 r(byte[] bArr) {
        return new ed1(bArr, 0, bArr.length);
    }

    public static ed1 s(byte[] bArr, int i, int i2) {
        return new ed1(bArr, 0, i2);
    }

    public final void b(int i, md1 md1) throws IOException {
        d(i, 2);
        if (md1.a < 0) {
            md1.d();
        }
        n(md1.a);
        md1.b(this);
    }

    public final void d(int i, int i2) throws IOException {
        n((i << 3) | i2);
    }

    public final void e(int i, String str) throws IOException {
        d(i, 2);
        try {
            int i2 = i(str.length());
            if (i2 == i(str.length() * 3)) {
                int position = this.a.position();
                if (this.a.remaining() >= i2) {
                    this.a.position(position + i2);
                    o(str, this.a);
                    int position2 = this.a.position();
                    this.a.position(position);
                    n((position2 - position) - i2);
                    this.a.position(position2);
                    return;
                }
                throw new dd1(position + i2, this.a.limit());
            }
            n(a(str));
            o(str, this.a);
        } catch (BufferOverflowException e2) {
            dd1 dd1 = new dd1(this.a.position(), this.a.limit());
            dd1.initCause(e2);
            throw dd1;
        }
    }

    public final void f(int i, boolean z) throws IOException {
        d(i, 0);
        byte b2 = z ? (byte) 1 : 0;
        if (this.a.hasRemaining()) {
            this.a.put(b2);
            return;
        }
        throw new dd1(this.a.position(), this.a.limit());
    }

    public final void j(long j) throws IOException {
        while ((-128 & j) != 0) {
            m((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m((int) j);
    }

    public final void l(int i, int i2) throws IOException {
        d(i, 0);
        if (i2 >= 0) {
            n(i2);
        } else {
            j((long) i2);
        }
    }

    public final void n(int i) throws IOException {
        while ((i & -128) != 0) {
            m((i & 127) | 128);
            i >>>= 7;
        }
        m(i);
    }

    public final void p(int i, wa1 wa1) throws IOException {
        if (this.b == null) {
            this.b = r81.f(this.a);
            this.c = this.a.position();
        } else if (this.c != this.a.position()) {
            this.b.c(this.a.array(), this.c, this.a.position() - this.c);
            this.c = this.a.position();
        }
        r81 r81 = this.b;
        r81.l(i, wa1);
        r81.b();
        this.c = this.a.position();
    }

    public final void t(byte[] bArr) throws IOException {
        int length = bArr.length;
        if (this.a.remaining() >= length) {
            this.a.put(bArr, 0, length);
            return;
        }
        throw new dd1(this.a.position(), this.a.limit());
    }

    private ed1(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }
}
