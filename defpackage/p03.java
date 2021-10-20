package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import vigqyno.C0201;

/* renamed from: p03  reason: default package */
/* compiled from: ASN1ObjectIdentifier */
public class p03 extends u03 {
    private static final ConcurrentMap<a, p03> c = new ConcurrentHashMap();
    private final String a;
    private byte[] b;

    /* access modifiers changed from: private */
    /* renamed from: p03$a */
    /* compiled from: ASN1ObjectIdentifier */
    public static class a {
        private final int a;
        private final byte[] b;

        public a(byte[] bArr) {
            this.a = hb3.h(bArr);
            this.b = bArr;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return hb3.a(this.b, ((a) obj).b);
            }
            return false;
        }

        public int hashCode() {
            return this.a;
        }
    }

    public p03(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = true;
        long j = 0;
        BigInteger bigInteger = null;
        for (int i = 0; i != bArr.length; i++) {
            int i2 = bArr[i] & 255;
            if (j <= 72057594037927808L) {
                long j2 = j + ((long) (i2 & 127));
                if ((i2 & 128) == 0) {
                    if (z) {
                        if (j2 < 40) {
                            stringBuffer.append('0');
                        } else if (j2 < 80) {
                            stringBuffer.append('1');
                            j2 -= 40;
                        } else {
                            stringBuffer.append('2');
                            j2 -= 80;
                        }
                        z = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(j2);
                    j = 0;
                } else {
                    j = j2 << 7;
                }
            } else {
                BigInteger or = (bigInteger == null ? BigInteger.valueOf(j) : bigInteger).or(BigInteger.valueOf((long) (i2 & 127)));
                if ((i2 & 128) == 0) {
                    if (z) {
                        stringBuffer.append('2');
                        or = or.subtract(BigInteger.valueOf(80));
                        z = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(or);
                    j = 0;
                    bigInteger = null;
                } else {
                    bigInteger = or.shiftLeft(7);
                }
            }
        }
        this.a = stringBuffer.toString();
        this.b = hb3.d(bArr);
    }

    private void A(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int bitLength = (bigInteger.bitLength() + 6) / 7;
        if (bitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[bitLength];
        int i = bitLength - 1;
        for (int i2 = i; i2 >= 0; i2--) {
            bArr[i2] = (byte) ((bigInteger.intValue() & 127) | 128);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i] = (byte) (bArr[i] & Byte.MAX_VALUE);
        byteArrayOutputStream.write(bArr, 0, bitLength);
    }

    private void r(ByteArrayOutputStream byteArrayOutputStream) {
        z23 z23 = new z23(this.a);
        int parseInt = Integer.parseInt(z23.b()) * 40;
        String b2 = z23.b();
        if (b2.length() <= 18) {
            z(byteArrayOutputStream, ((long) parseInt) + Long.parseLong(b2));
        } else {
            A(byteArrayOutputStream, new BigInteger(b2).add(BigInteger.valueOf((long) parseInt)));
        }
        while (z23.a()) {
            String b3 = z23.b();
            if (b3.length() <= 18) {
                z(byteArrayOutputStream, Long.parseLong(b3));
            } else {
                A(byteArrayOutputStream, new BigInteger(b3));
            }
        }
    }

    public static p03 s(byte[] bArr) {
        p03 p03 = c.get(new a(bArr));
        return p03 == null ? new p03(bArr) : p03;
    }

    private synchronized byte[] t() {
        if (this.b == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            r(byteArrayOutputStream);
            this.b = byteArrayOutputStream.toByteArray();
        }
        return this.b;
    }

    public static p03 v(Object obj) {
        if (obj == null || (obj instanceof p03)) {
            return (p03) obj;
        }
        if (obj instanceof g03) {
            g03 g03 = (g03) obj;
            if (g03.b() instanceof p03) {
                return (p03) g03.b();
            }
        }
        if (obj instanceof byte[]) {
            try {
                return (p03) u03.k((byte[]) obj);
            } catch (IOException e) {
                throw new IllegalArgumentException(C0201.m82(16141) + e.getMessage());
            }
        } else {
            throw new IllegalArgumentException(C0201.m82(16142) + obj.getClass().getName());
        }
    }

    private static boolean x(String str, int i) {
        boolean z;
        char charAt;
        int length = str.length();
        do {
            z = false;
            while (true) {
                length--;
                if (length < i) {
                    return z;
                }
                charAt = str.charAt(length);
                if ('0' <= charAt && charAt <= '9') {
                    z = true;
                }
            }
            if (charAt != '.') {
                break;
            }
        } while (z);
        return false;
    }

    private static boolean y(String str) {
        char charAt;
        if (str.length() < 3 || str.charAt(1) != '.' || (charAt = str.charAt(0)) < '0' || charAt > '2') {
            return false;
        }
        return x(str, 2);
    }

    private void z(ByteArrayOutputStream byteArrayOutputStream, long j) {
        byte[] bArr = new byte[9];
        int i = 8;
        bArr[8] = (byte) (((int) j) & 127);
        while (j >= 128) {
            j >>= 7;
            i--;
            bArr[i] = (byte) ((((int) j) & 127) | 128);
        }
        byteArrayOutputStream.write(bArr, i, 9 - i);
    }

    @Override // defpackage.u03
    public boolean g(u03 u03) {
        if (u03 == this) {
            return true;
        }
        if (!(u03 instanceof p03)) {
            return false;
        }
        return this.a.equals(((p03) u03).a);
    }

    @Override // defpackage.o03
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.u03
    public void i(s03 s03) throws IOException {
        byte[] t = t();
        s03.c(6);
        s03.i(t.length);
        s03.d(t);
    }

    @Override // defpackage.u03
    public int j() throws IOException {
        int length = t().length;
        return a33.a(length) + 1 + length;
    }

    @Override // defpackage.u03
    public boolean l() {
        return false;
    }

    public p03 q(String str) {
        return new p03(this, str);
    }

    public String toString() {
        return u();
    }

    public String u() {
        return this.a;
    }

    public p03 w() {
        a aVar = new a(t());
        p03 p03 = c.get(aVar);
        if (p03 != null) {
            return p03;
        }
        p03 putIfAbsent = c.putIfAbsent(aVar, this);
        return putIfAbsent == null ? this : putIfAbsent;
    }

    public p03(String str) {
        if (str == null) {
            throw new IllegalArgumentException(C0201.m82(16137));
        } else if (y(str)) {
            this.a = str;
        } else {
            throw new IllegalArgumentException(C0201.m82(16135) + str + C0201.m82(16136));
        }
    }

    public p03(p03 p03, String str) {
        if (x(str, 0)) {
            this.a = p03.u() + C0201.m82(16138) + str;
            return;
        }
        throw new IllegalArgumentException(C0201.m82(16139) + str + C0201.m82(16140));
    }
}
