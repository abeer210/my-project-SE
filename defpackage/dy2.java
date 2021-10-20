package defpackage;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import vigqyno.C0201;

/* renamed from: dy2  reason: default package */
/* compiled from: ByteString */
public class dy2 implements Serializable, Comparable<dy2> {
    public static final char[] d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final dy2 e = q(new byte[0]);
    public final byte[] a;
    public transient int b;
    public transient String c;

    public dy2(byte[] bArr) {
        this.a = bArr;
    }

    public static int d(String str, int i) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            if (i3 == i) {
                return i2;
            }
            int codePointAt = str.codePointAt(i2);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i3++;
            i2 += Character.charCount(codePointAt);
        }
        return str.length();
    }

    public static dy2 f(String str) {
        if (str != null) {
            byte[] a2 = zx2.a(str);
            if (a2 != null) {
                return new dy2(a2);
            }
            return null;
        }
        throw new IllegalArgumentException(C0201.m82(39008));
    }

    public static dy2 g(String str) {
        if (str == null) {
            throw new IllegalArgumentException(C0201.m82(39010));
        } else if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) ((h(str.charAt(i2)) << 4) + h(str.charAt(i2 + 1)));
            }
            return q(bArr);
        } else {
            throw new IllegalArgumentException(C0201.m82(39009) + str);
        }
    }

    private static int h(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        char c3 = 'a';
        if (c2 < 'a' || c2 > 'f') {
            c3 = 'A';
            if (c2 < 'A' || c2 > 'F') {
                throw new IllegalArgumentException(C0201.m82(39011) + c2);
            }
        }
        return (c2 - c3) + 10;
    }

    private dy2 i(String str) {
        try {
            return q(MessageDigest.getInstance(str).digest(this.a));
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public static dy2 j(String str, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException(C0201.m82(39013));
        } else if (charset != null) {
            return new dy2(str.getBytes(charset));
        } else {
            throw new IllegalArgumentException(C0201.m82(39012));
        }
    }

    public static dy2 k(String str) {
        if (str != null) {
            dy2 dy2 = new dy2(str.getBytes(vy2.a));
            dy2.c = str;
            return dy2;
        }
        throw new IllegalArgumentException(C0201.m82(39014));
    }

    public static dy2 q(byte... bArr) {
        if (bArr != null) {
            return new dy2((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException(C0201.m82(39015));
    }

    public int A() {
        return this.a.length;
    }

    public final boolean C(dy2 dy2) {
        return r(0, dy2, 0, dy2.A());
    }

    public dy2 E(int i, int i2) {
        if (i >= 0) {
            byte[] bArr = this.a;
            if (i2 <= bArr.length) {
                int i3 = i2 - i;
                if (i3 < 0) {
                    throw new IllegalArgumentException(C0201.m82(39016));
                } else if (i == 0 && i2 == bArr.length) {
                    return this;
                } else {
                    byte[] bArr2 = new byte[i3];
                    System.arraycopy(this.a, i, bArr2, 0, i3);
                    return new dy2(bArr2);
                }
            } else {
                throw new IllegalArgumentException(C0201.m82(39017) + this.a.length + C0201.m82(39018));
            }
        } else {
            throw new IllegalArgumentException(C0201.m82(39019));
        }
    }

    public dy2 H() {
        int i = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i];
            if (b2 < 65 || b2 > 90) {
                i++;
            } else {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b3 = bArr2[i2];
                    if (b3 >= 65 && b3 <= 90) {
                        bArr2[i2] = (byte) (b3 + 32);
                    }
                }
                return new dy2(bArr2);
            }
        }
    }

    public byte[] I() {
        return (byte[]) this.a.clone();
    }

    public String J() {
        String str = this.c;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.a, vy2.a);
        this.c = str2;
        return str2;
    }

    public void K(ay2 ay2) {
        byte[] bArr = this.a;
        ay2.a0(bArr, 0, bArr.length);
    }

    public String b() {
        return zx2.b(this.a);
    }

    /* renamed from: e */
    public int compareTo(dy2 dy2) {
        int A = A();
        int A2 = dy2.A();
        int min = Math.min(A, A2);
        for (int i = 0; i < min; i++) {
            int l = l(i) & 255;
            int l2 = dy2.l(i) & 255;
            if (l != l2) {
                if (l < l2) {
                    return -1;
                } else {
                    return 1;
                }
            }
        }
        if (A == A2) {
            return 0;
        }
        if (A < A2) {
            return -1;
        }
        return 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dy2) {
            dy2 dy2 = (dy2) obj;
            int A = dy2.A();
            byte[] bArr = this.a;
            if (A != bArr.length || !dy2.t(0, bArr, 0, bArr.length)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.a);
        this.b = hashCode;
        return hashCode;
    }

    public byte l(int i) {
        return this.a[i];
    }

    public String m() {
        byte[] bArr = this.a;
        char[] cArr = new char[(bArr.length * 2)];
        int i = 0;
        for (byte b2 : bArr) {
            int i2 = i + 1;
            char[] cArr2 = d;
            cArr[i] = cArr2[(b2 >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public byte[] n() {
        return this.a;
    }

    public dy2 p() {
        return i(C0201.m82(39020));
    }

    public boolean r(int i, dy2 dy2, int i2, int i3) {
        return dy2.t(i2, this.a, i, i3);
    }

    public boolean t(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0) {
            byte[] bArr2 = this.a;
            return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && vy2.a(bArr2, i, bArr, i2, i3);
        }
    }

    public String toString() {
        if (this.a.length == 0) {
            return C0201.m82(39021);
        }
        String J = J();
        int d2 = d(J, 64);
        String r4 = C0201.m82(39022);
        String r5 = C0201.m82(39023);
        String r6 = C0201.m82(39024);
        if (d2 != -1) {
            String replace = J.substring(0, d2).replace(C0201.m82(39027), C0201.m82(39028)).replace(C0201.m82(39029), C0201.m82(39030)).replace(C0201.m82(39031), C0201.m82(39032));
            if (d2 < J.length()) {
                return r5 + this.a.length + C0201.m82(39033) + replace + r4;
            }
            return C0201.m82(39034) + replace + r6;
        } else if (this.a.length <= 64) {
            return C0201.m82(39025) + m() + r6;
        } else {
            return r5 + this.a.length + C0201.m82(39026) + E(0, 64).m() + r4;
        }
    }

    public dy2 v() {
        return i(C0201.m82(39035));
    }

    public dy2 x() {
        return i(C0201.m82(39036));
    }
}
