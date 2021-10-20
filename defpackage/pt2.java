package defpackage;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import vigqyno.C0201;

/* renamed from: pt2  reason: default package */
/* compiled from: SecurityHandler */
public abstract class pt2 {
    private static final byte[] h = {115, 65, 108, 84};
    public int a = 40;
    public byte[] b;
    private final ot2 c = new ot2();
    private boolean d;
    private final Set<tq2> e = new HashSet();
    private boolean f;
    private et2 g = null;

    private byte[] a(long j, long j2) {
        byte[] bArr = this.b;
        int length = bArr.length + 5;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        bArr2[length - 5] = (byte) ((int) (j & 255));
        bArr2[length - 4] = (byte) ((int) ((j >> 8) & 255));
        bArr2[length - 3] = (byte) ((int) ((j >> 16) & 255));
        bArr2[length - 2] = (byte) ((int) (j2 & 255));
        bArr2[length - 1] = (byte) ((int) ((j2 >> 8) & 255));
        MessageDigest a2 = ht2.a();
        a2.update(bArr2);
        if (this.f) {
            a2.update(h);
        }
        byte[] digest = a2.digest();
        int min = Math.min(length, 16);
        byte[] bArr3 = new byte[min];
        System.arraycopy(digest, 0, bArr3, 0, min);
        return bArr3;
    }

    private void c(sq2 sq2, long j, long j2) throws IOException {
        for (int i = 0; i < sq2.size(); i++) {
            b(sq2.x(i), j, j2);
        }
    }

    private void d(vq2 vq2, long j, long j2) throws IOException {
        if (vq2.G0(ar2.o) == null && !ar2.s0.equals(vq2.G0(ar2.x0)) && !ar2.s0.equals(vq2.G0(ar2.M))) {
            for (Map.Entry<ar2, tq2> entry : vq2.A()) {
                tq2 value = entry.getValue();
                if ((value instanceof gr2) || (value instanceof sq2) || (value instanceof vq2)) {
                    b(value, j, j2);
                }
            }
        }
    }

    private void f(gr2 gr2, long j, long j2) throws IOException {
        InputStream byteArrayInputStream = new ByteArrayInputStream(gr2.r());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        g(j, j2, byteArrayInputStream, byteArrayOutputStream, true);
        gr2.E(byteArrayOutputStream.toByteArray());
    }

    private void g(long j, long j2, InputStream inputStream, OutputStream outputStream, boolean z) throws IOException {
        if (this.f && this.b.length == 32) {
            h(inputStream, outputStream, z);
        } else if (!this.f || z) {
            byte[] a2 = a(j, j2);
            if (this.f) {
                i(a2, inputStream, outputStream, z);
            } else {
                j(a2, inputStream, outputStream);
            }
        } else {
            throw new IllegalArgumentException(C0201.m82(16105));
        }
        outputStream.flush();
    }

    private void h(InputStream inputStream, OutputStream outputStream, boolean z) throws IOException {
        byte[] bArr = new byte[16];
        if (z) {
            inputStream.read(bArr);
        } else {
            new SecureRandom().nextBytes(bArr);
            outputStream.write(bArr);
        }
        try {
            Cipher instance = Cipher.getInstance(C0201.m82(16106));
            instance.init(z ? 2 : 1, new SecretKeySpec(this.b, C0201.m82(16107)), new IvParameterSpec(bArr));
            CipherInputStream cipherInputStream = new CipherInputStream(inputStream, instance);
            try {
                bs2.b(cipherInputStream, outputStream);
            } catch (IOException e2) {
                if (e2.getCause() instanceof GeneralSecurityException) {
                    Log.d(C0201.m82(16108), C0201.m82(16109), e2);
                } else {
                    throw e2;
                }
            } catch (Throwable th) {
                cipherInputStream.close();
                throw th;
            }
            cipherInputStream.close();
        } catch (GeneralSecurityException e3) {
            throw new IOException(e3);
        }
    }

    private void i(byte[] bArr, InputStream inputStream, OutputStream outputStream, boolean z) throws IOException {
        byte[] bArr2 = new byte[16];
        int read = inputStream.read(bArr2);
        if (read == 16) {
            try {
                Cipher instance = Cipher.getInstance(C0201.m82(16110));
                instance.init(z ? 2 : 1, new SecretKeySpec(bArr, C0201.m82(16111)), new IvParameterSpec(bArr2));
                byte[] bArr3 = new byte[256];
                while (true) {
                    int read2 = inputStream.read(bArr3);
                    if (read2 != -1) {
                        outputStream.write(instance.update(bArr3, 0, read2));
                    } else {
                        outputStream.write(instance.doFinal());
                        return;
                    }
                }
            } catch (NoSuchAlgorithmException e2) {
                throw new RuntimeException(e2);
            } catch (InvalidKeyException e3) {
                throw new IOException(e3);
            } catch (InvalidAlgorithmParameterException e4) {
                throw new IOException(e4);
            } catch (NoSuchPaddingException e5) {
                throw new IOException(e5);
            } catch (IllegalBlockSizeException e6) {
                throw new IOException(e6);
            } catch (BadPaddingException e7) {
                throw new IOException(e7);
            }
        } else {
            throw new IOException(C0201.m82(16112) + read + C0201.m82(16113) + 16);
        }
    }

    public void b(tq2 tq2, long j, long j2) throws IOException {
        if (!this.e.contains(tq2)) {
            this.e.add(tq2);
            if (tq2 instanceof gr2) {
                f((gr2) tq2, j, j2);
            } else if (tq2 instanceof fr2) {
                e((fr2) tq2, j, j2);
            } else if (tq2 instanceof vq2) {
                d((vq2) tq2, j, j2);
            } else if (tq2 instanceof sq2) {
                c((sq2) tq2, j, j2);
            }
        }
    }

    public void e(fr2 fr2, long j, long j2) throws IOException {
        if ((this.d || !ar2.a0.equals(fr2.g0(ar2.x0))) && !ar2.C0.equals(fr2.g0(ar2.x0))) {
            d(fr2, j, j2);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bs2.c(fr2.z1()));
            OutputStream x1 = fr2.x1();
            try {
                g(j, j2, byteArrayInputStream, x1, true);
            } finally {
                x1.close();
            }
        }
    }

    public void j(byte[] bArr, InputStream inputStream, OutputStream outputStream) throws IOException {
        this.c.b(bArr);
        this.c.e(inputStream, outputStream);
    }

    public void k(byte[] bArr, byte[] bArr2, OutputStream outputStream) throws IOException {
        this.c.b(bArr);
        this.c.g(bArr2, outputStream);
    }

    public et2 l() {
        return this.g;
    }

    public abstract void m(jt2 jt2, sq2 sq2, ft2 ft2) throws IOException;

    public void n(boolean z) {
        this.f = z;
    }

    public void o(et2 et2) {
        this.g = et2;
    }

    public void p(boolean z) {
        this.d = z;
    }
}
