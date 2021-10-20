package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import vigqyno.C0201;

/* renamed from: v93  reason: default package */
/* compiled from: XMSSUtil */
public class v93 {
    public static long a(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = 0;
            for (int i3 = i; i3 < i + i2; i3++) {
                j = (j << 8) | ((long) (bArr[i3] & 255));
            }
            return j;
        }
        throw new NullPointerException(C0201.m82(37399));
    }

    public static int b(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (((i >> i3) & 1) == 0) {
                return i3;
            }
        }
        return 0;
    }

    public static byte[] c(byte[] bArr) {
        if (bArr != null) {
            byte[] bArr2 = new byte[bArr.length];
            for (int i = 0; i < bArr.length; i++) {
                bArr2[i] = bArr[i];
            }
            return bArr2;
        }
        throw new NullPointerException(C0201.m82(37400));
    }

    public static byte[][] d(byte[][] bArr) {
        if (!k(bArr)) {
            byte[][] bArr2 = new byte[bArr.length][];
            for (int i = 0; i < bArr.length; i++) {
                bArr2[i] = new byte[bArr[i].length];
                for (int i2 = 0; i2 < bArr[i].length; i2++) {
                    bArr2[i][i2] = bArr[i][i2];
                }
            }
            return bArr2;
        }
        throw new NullPointerException(C0201.m82(37401));
    }

    public static void e(byte[] bArr, byte[] bArr2, int i) {
        if (bArr == null) {
            throw new NullPointerException(C0201.m82(37405));
        } else if (bArr2 == null) {
            throw new NullPointerException(C0201.m82(37404));
        } else if (i < 0) {
            throw new IllegalArgumentException(C0201.m82(37403));
        } else if (bArr2.length + i <= bArr.length) {
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                bArr[i + i2] = bArr2[i2];
            }
        } else {
            throw new IllegalArgumentException(C0201.m82(37402));
        }
    }

    public static Object f(byte[] bArr) throws IOException, ClassNotFoundException {
        return new ObjectInputStream(new ByteArrayInputStream(bArr)).readObject();
    }

    public static byte[] g(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException(C0201.m82(37409));
        } else if (i < 0) {
            throw new IllegalArgumentException(C0201.m82(37408));
        } else if (i2 < 0) {
            throw new IllegalArgumentException(C0201.m82(37407));
        } else if (i + i2 <= bArr.length) {
            byte[] bArr2 = new byte[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                bArr2[i3] = bArr[i + i3];
            }
            return bArr2;
        } else {
            throw new IllegalArgumentException(C0201.m82(37406));
        }
    }

    public static int h(m63 m63) {
        if (m63 != null) {
            String d = m63.d();
            if (d.equals(C0201.m82(37410))) {
                return 32;
            }
            if (d.equals(C0201.m82(37411))) {
                return 64;
            }
            return m63.e();
        }
        throw new NullPointerException(C0201.m82(37412));
    }

    public static int i(long j, int i) {
        return (int) (j & ((1 << i) - 1));
    }

    public static long j(long j, int i) {
        return j >> i;
    }

    public static boolean k(byte[][] bArr) {
        if (bArr == null) {
            return true;
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2 == null) {
                return true;
            }
        }
        return false;
    }

    public static boolean l(int i, long j) {
        if (j >= 0) {
            return j < (1 << i);
        }
        throw new IllegalStateException(C0201.m82(37413));
    }

    public static boolean m(long j, int i, int i2) {
        return j != 0 && (j + 1) % ((long) Math.pow((double) (1 << i), (double) i2)) == 0;
    }

    public static int n(int i) {
        int i2 = 0;
        while (true) {
            i >>= 1;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    public static byte[] o(Object obj) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(obj);
        objectOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] p(long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = i - 1; i2 >= 0; i2--) {
            bArr[i2] = (byte) ((int) j);
            j >>>= 8;
        }
        return bArr;
    }
}
