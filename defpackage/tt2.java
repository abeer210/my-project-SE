package defpackage;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import vigqyno.C0201;

/* renamed from: tt2  reason: default package */
/* compiled from: StandardSecurityHandler */
public final class tt2 extends pt2 {
    private static final byte[] i = {40, -65, 78, 94, 78, 117, -118, 65, 100, 0, 78, 86, -1, -6, 1, 8, 46, 46, 0, -74, -48, 104, 62, Byte.MIN_VALUE, 47, 12, -87, -2, 100, 83, 105, 122};
    private static final String[] j = {C0201.m82(27600), C0201.m82(27601), C0201.m82(27602)};

    private static void D() {
        try {
            if (Cipher.getMaxAllowedKeyLength(C0201.m82(27603)) != Integer.MAX_VALUE) {
                Log.w(C0201.m82(27604), C0201.m82(27605));
            }
        } catch (NoSuchAlgorithmException unused) {
        }
    }

    private static byte[] E(byte[] bArr) {
        if (bArr.length <= 127) {
            return bArr;
        }
        byte[] bArr2 = new byte[127];
        System.arraycopy(bArr, 0, bArr2, 0, 127);
        return bArr2;
    }

    private byte[] F(byte[] bArr) {
        int length = i.length;
        byte[] bArr2 = new byte[length];
        int min = Math.min(bArr.length, length);
        System.arraycopy(bArr, 0, bArr2, 0, min);
        byte[] bArr3 = i;
        System.arraycopy(bArr3, 0, bArr2, min, bArr3.length - min);
        return bArr2;
    }

    private void G(jt2 jt2, int i2, boolean z) throws IOException {
        try {
            Cipher instance = Cipher.getInstance(C0201.m82(27606));
            instance.init(2, new SecretKeySpec(this.b, C0201.m82(27607)));
            byte[] doFinal = instance.doFinal(jt2.g());
            byte b = doFinal[9];
            String r3 = C0201.m82(27608);
            if (!(b == 97 && doFinal[10] == 100 && doFinal[11] == 98)) {
                Log.w(r3, C0201.m82(27609));
            }
            int i3 = (doFinal[0] & 255) | (doFinal[1] & 65280) | (doFinal[2] & 16711680) | (doFinal[3] & -16777216);
            if (i3 != i2) {
                Log.w(r3, C0201.m82(27610) + i3 + C0201.m82(27611) + i2 + C0201.m82(27612));
            }
            if ((z && doFinal[8] != 84) || (!z && doFinal[8] != 70)) {
                Log.w(r3, C0201.m82(27613));
            }
        } catch (GeneralSecurityException e) {
            D();
            throw new IOException(e);
        }
    }

    private byte[] r(byte[] bArr, byte[] bArr2, int i2, byte[] bArr3, boolean z, int i3, int i4) {
        byte[] F = F(bArr);
        MessageDigest a = ht2.a();
        a.update(F);
        a.update(bArr2);
        a.update((byte) i2);
        a.update((byte) (i2 >>> 8));
        a.update((byte) (i2 >>> 16));
        a.update((byte) (i2 >>> 24));
        a.update(bArr3);
        if (i4 == 4 && !z) {
            a.update(new byte[]{-1, -1, -1, -1});
        }
        byte[] digest = a.digest();
        if (i4 == 3 || i4 == 4) {
            for (int i5 = 0; i5 < 50; i5++) {
                a.update(digest, 0, i3);
                digest = a.digest();
            }
        }
        byte[] bArr4 = new byte[i3];
        System.arraycopy(digest, 0, bArr4, 0, i3);
        return bArr4;
    }

    private byte[] s(byte[] bArr, boolean z, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i2) throws IOException {
        byte[] bArr6;
        if (z) {
            byte[] bArr7 = new byte[8];
            System.arraycopy(bArr2, 40, bArr7, 0, 8);
            if (i2 == 5) {
                bArr6 = w(bArr, bArr7, bArr3);
            } else {
                bArr6 = t(bArr, bArr7, bArr3);
            }
        } else {
            byte[] bArr8 = new byte[8];
            System.arraycopy(bArr3, 40, bArr8, 0, 8);
            if (i2 == 5) {
                bArr6 = w(bArr, bArr8, null);
            } else {
                bArr6 = t(bArr, bArr8, null);
            }
            bArr4 = bArr5;
        }
        try {
            Cipher instance = Cipher.getInstance(C0201.m82(27614));
            instance.init(2, new SecretKeySpec(bArr6, C0201.m82(27615)), new IvParameterSpec(new byte[16]));
            return instance.doFinal(bArr4);
        } catch (GeneralSecurityException e) {
            D();
            throw new IOException(e);
        }
    }

    private byte[] t(byte[] bArr, byte[] bArr2, byte[] bArr3) throws IOException {
        if (bArr3 == null) {
            bArr3 = new byte[0];
        } else if (bArr3.length < 48) {
            throw new IOException(C0201.m82(27616));
        } else if (bArr3.length > 48) {
            byte[] bArr4 = new byte[48];
            System.arraycopy(bArr3, 0, bArr4, 0, 48);
            bArr3 = bArr4;
        }
        byte[] E = E(bArr);
        return u(y(E, bArr2, bArr3), E, bArr3);
    }

    private static byte[] u(byte[] bArr, byte[] bArr2, byte[] bArr3) throws IOException {
        byte[] bArr4;
        try {
            byte[] digest = MessageDigest.getInstance(C0201.m82(27617)).digest(bArr);
            byte[] bArr5 = null;
            int i2 = 0;
            while (true) {
                if (i2 >= 64) {
                    if ((bArr5[bArr5.length - 1] & 255) <= i2 - 32) {
                        break;
                    }
                }
                if (bArr3 == null || bArr3.length < 48) {
                    bArr4 = new byte[((bArr2.length + digest.length) * 64)];
                } else {
                    bArr4 = new byte[((bArr2.length + digest.length + 48) * 64)];
                }
                int i3 = 0;
                for (int i4 = 0; i4 < 64; i4++) {
                    System.arraycopy(bArr2, 0, bArr4, i3, bArr2.length);
                    int length = i3 + bArr2.length;
                    System.arraycopy(digest, 0, bArr4, length, digest.length);
                    i3 = length + digest.length;
                    if (bArr3 != null && bArr3.length >= 48) {
                        System.arraycopy(bArr3, 0, bArr4, i3, 48);
                        i3 += 48;
                    }
                }
                byte[] bArr6 = new byte[16];
                byte[] bArr7 = new byte[16];
                System.arraycopy(digest, 0, bArr6, 0, 16);
                System.arraycopy(digest, 16, bArr7, 0, 16);
                Cipher instance = Cipher.getInstance(C0201.m82(27618));
                instance.init(1, new SecretKeySpec(bArr6, C0201.m82(27619)), new IvParameterSpec(bArr7));
                byte[] doFinal = instance.doFinal(bArr4);
                byte[] bArr8 = new byte[16];
                System.arraycopy(doFinal, 0, bArr8, 0, 16);
                i2++;
                bArr5 = doFinal;
                digest = MessageDigest.getInstance(j[new BigInteger(1, bArr8).mod(new BigInteger(C0201.m82(27620))).intValue()]).digest(doFinal);
            }
            if (digest.length <= 32) {
                return digest;
            }
            byte[] bArr9 = new byte[32];
            System.arraycopy(digest, 0, bArr9, 0, 32);
            return bArr9;
        } catch (GeneralSecurityException e) {
            D();
            throw new IOException(e);
        }
    }

    private byte[] v(byte[] bArr, int i2, int i3) {
        MessageDigest a = ht2.a();
        byte[] digest = a.digest(F(bArr));
        if (i2 == 3 || i2 == 4) {
            for (int i4 = 0; i4 < 50; i4++) {
                a.update(digest, 0, i3);
                digest = a.digest();
            }
        }
        byte[] bArr2 = new byte[i3];
        System.arraycopy(digest, 0, bArr2, 0, i3);
        return bArr2;
    }

    private static byte[] w(byte[] bArr, byte[] bArr2, byte[] bArr3) throws IOException {
        try {
            MessageDigest instance = MessageDigest.getInstance(C0201.m82(27621));
            instance.update(bArr);
            instance.update(bArr2);
            return bArr3 == null ? instance.digest() : instance.digest(bArr3);
        } catch (NoSuchAlgorithmException e) {
            throw new IOException(e);
        }
    }

    private static byte[] y(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[(bArr.length + bArr2.length + bArr3.length)];
        System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr4, bArr.length, bArr2.length);
        System.arraycopy(bArr3, 0, bArr4, bArr.length + bArr2.length, bArr3.length);
        return bArr4;
    }

    private byte[] z(sq2 sq2) {
        return (sq2 == null || sq2.size() < 1) ? new byte[0] : ((gr2) sq2.E(0)).r();
    }

    public byte[] A(byte[] bArr, byte[] bArr2, int i2, int i3) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] v = v(bArr, i2, i3);
        if (i2 == 2) {
            k(v, bArr2, byteArrayOutputStream);
        } else if (i2 == 3 || i2 == 4) {
            int length = v.length;
            byte[] bArr3 = new byte[length];
            byte[] bArr4 = new byte[bArr2.length];
            System.arraycopy(bArr2, 0, bArr4, 0, bArr2.length);
            for (int i4 = 19; i4 >= 0; i4--) {
                System.arraycopy(v, 0, bArr3, 0, v.length);
                for (int i5 = 0; i5 < length; i5++) {
                    bArr3[i5] = (byte) (bArr3[i5] ^ ((byte) i4));
                }
                byteArrayOutputStream.reset();
                k(bArr3, bArr4, byteArrayOutputStream);
                bArr4 = byteArrayOutputStream.toByteArray();
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public boolean B(byte[] bArr, byte[] bArr2, byte[] bArr3, int i2, byte[] bArr4, int i3, int i4, boolean z) throws IOException {
        byte[] bArr5;
        if (i3 != 6 && i3 != 5) {
            return C(A(bArr, bArr3, i3, i4), bArr2, bArr3, i2, bArr4, i3, i4, z);
        }
        byte[] E = E(bArr);
        byte[] bArr6 = new byte[32];
        byte[] bArr7 = new byte[8];
        System.arraycopy(bArr3, 0, bArr6, 0, 32);
        System.arraycopy(bArr3, 32, bArr7, 0, 8);
        if (i3 == 5) {
            bArr5 = w(E, bArr7, bArr2);
        } else {
            bArr5 = t(E, bArr7, bArr2);
        }
        return Arrays.equals(bArr5, bArr6);
    }

    public boolean C(byte[] bArr, byte[] bArr2, byte[] bArr3, int i2, byte[] bArr4, int i3, int i4, boolean z) throws IOException {
        byte[] bArr5;
        if (i3 == 2) {
            return Arrays.equals(bArr2, x(bArr, bArr3, i2, bArr4, i3, i4, z));
        }
        if (i3 == 3 || i3 == 4) {
            return Arrays.equals(Arrays.copyOf(bArr2, 16), Arrays.copyOf(x(bArr, bArr3, i2, bArr4, i3, i4, z), 16));
        } else if (i3 == 6 || i3 == 5) {
            byte[] E = E(bArr);
            byte[] bArr6 = new byte[32];
            byte[] bArr7 = new byte[8];
            System.arraycopy(bArr2, 0, bArr6, 0, 32);
            System.arraycopy(bArr2, 32, bArr7, 0, 8);
            if (i3 == 5) {
                bArr5 = w(E, bArr7, null);
            } else {
                bArr5 = t(E, bArr7, null);
            }
            return Arrays.equals(bArr5, bArr6);
        } else {
            throw new IOException(C0201.m82(27622) + i3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0104, code lost:
        if (r14 == 5) goto L_0x010a;
     */
    @Override // defpackage.pt2
    public void m(jt2 jt2, sq2 sq2, ft2 ft2) throws IOException {
        int i2;
        sq2 sq22;
        byte[] bArr;
        byte[] bArr2;
        Charset charset;
        int i3;
        it2 l;
        ar2 a;
        boolean z;
        jt2 jt22;
        byte[] bArr3;
        byte[] bArr4;
        if (ft2 instanceof rt2) {
            p(jt2.p());
            String a2 = ((rt2) ft2).a();
            if (a2 == null) {
                a2 = C0201.m82(27623);
            }
            int f = jt2.f();
            int j2 = jt2.j();
            if (jt2.o() == 1) {
                sq22 = sq2;
                i2 = 5;
            } else {
                i2 = jt2.c() / 8;
                sq22 = sq2;
            }
            byte[] z2 = z(sq22);
            boolean p = jt2.p();
            byte[] n = jt2.n();
            byte[] e = jt2.e();
            Charset charset2 = ut2.c;
            if (j2 == 6 || j2 == 5) {
                charset = ut2.d;
                bArr = jt2.m();
                bArr2 = jt2.d();
            } else {
                charset = charset2;
                bArr2 = null;
                bArr = null;
            }
            if (B(a2.getBytes(charset), n, e, f, z2, j2, i2, p)) {
                o(et2.a());
                if (j2 == 6) {
                    bArr3 = e;
                } else if (j2 == 5) {
                    bArr3 = e;
                } else {
                    bArr3 = e;
                    bArr4 = A(a2.getBytes(charset), bArr3, j2, i2);
                    this.b = q(bArr4, bArr3, n, bArr2, bArr, f, z2, j2, i2, p, true);
                }
                bArr4 = a2.getBytes(charset);
                this.b = q(bArr4, bArr3, n, bArr2, bArr, f, z2, j2, i2, p, true);
            } else if (C(a2.getBytes(charset), n, e, f, z2, j2, i2, p)) {
                o(new et2(f));
                this.b = q(a2.getBytes(charset), e, n, bArr2, bArr, f, z2, j2, i2, p, false);
            } else {
                throw new gt2(C0201.m82(27626));
            }
            if (j2 != 6) {
                i3 = 5;
                jt22 = jt2;
            } else {
                i3 = 5;
                jt22 = jt2;
            }
            G(jt22, f, p);
            if ((jt2.o() == 4 || jt2.o() == i3) && (l = jt2.l()) != null && (a = l.a()) != null) {
                if (!C0201.m82(27624).equalsIgnoreCase(a.x())) {
                    if (!C0201.m82(27625).equalsIgnoreCase(a.x())) {
                        z = false;
                        n(z);
                        return;
                    }
                }
                z = true;
                n(z);
                return;
            }
            return;
        }
        throw new IOException(C0201.m82(27627));
    }

    public byte[] q(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i2, byte[] bArr6, int i3, int i4, boolean z, boolean z2) throws IOException {
        if (i3 == 6 || i3 == 5) {
            return s(bArr, z2, bArr2, bArr3, bArr4, bArr5, i3);
        }
        return r(bArr, bArr2, i2, bArr6, z, i4, i3);
    }

    public byte[] x(byte[] bArr, byte[] bArr2, int i2, byte[] bArr3, int i3, int i4, boolean z) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] q = q(bArr, bArr2, null, null, null, i2, bArr3, i3, i4, z, true);
        if (i3 == 2) {
            k(q, i, byteArrayOutputStream);
        } else if (i3 == 3 || i3 == 4) {
            MessageDigest a = ht2.a();
            a.update(i);
            a.update(bArr3);
            byteArrayOutputStream.write(a.digest());
            int length = q.length;
            byte[] bArr4 = new byte[length];
            for (int i5 = 0; i5 < 20; i5++) {
                System.arraycopy(q, 0, bArr4, 0, length);
                for (int i6 = 0; i6 < length; i6++) {
                    bArr4[i6] = (byte) (bArr4[i6] ^ i5);
                }
                InputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                byteArrayOutputStream.reset();
                j(bArr4, byteArrayInputStream, byteArrayOutputStream);
            }
            byte[] bArr5 = new byte[32];
            System.arraycopy(byteArrayOutputStream.toByteArray(), 0, bArr5, 0, 16);
            System.arraycopy(i, 0, bArr5, 16, 16);
            byteArrayOutputStream.reset();
            byteArrayOutputStream.write(bArr5);
        }
        return byteArrayOutputStream.toByteArray();
    }
}
