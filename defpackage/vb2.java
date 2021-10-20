package defpackage;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import vigqyno.C0201;

/* renamed from: vb2  reason: default package */
public final class vb2 {
    private static final String a = null;

    static {
        C0201.m83(vb2.class, 697);
    }

    private static byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[(bArr.length + bArr2.length)];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr.length == 0 || bArr2 == null || bArr2.length < 16 || bArr3 == null || bArr3.length < 16) {
            bc2.b(a, C0201.m82(10170));
            return new byte[0];
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, C0201.m82(10162));
        try {
            Cipher instance = Cipher.getInstance(C0201.m82(10163));
            instance.init(2, secretKeySpec, new IvParameterSpec(bArr3));
            return instance.doFinal(bArr);
        } catch (NoSuchAlgorithmException e) {
            String str = a;
            bc2.b(str, C0201.m82(10169) + e.getMessage());
            return new byte[0];
        } catch (NoSuchPaddingException e2) {
            String str2 = a;
            bc2.b(str2, C0201.m82(10168) + e2.getMessage());
            return new byte[0];
        } catch (InvalidKeyException e3) {
            String str3 = a;
            bc2.b(str3, C0201.m82(10167) + e3.getMessage());
            return new byte[0];
        } catch (InvalidAlgorithmParameterException e4) {
            String str4 = a;
            bc2.b(str4, C0201.m82(10166) + e4.getMessage());
            return new byte[0];
        } catch (IllegalBlockSizeException e5) {
            String str5 = a;
            bc2.b(str5, C0201.m82(10165) + e5.getMessage());
            return new byte[0];
        } catch (BadPaddingException e6) {
            String str6 = a;
            bc2.b(str6, C0201.m82(10164) + e6.getMessage());
            return new byte[0];
        }
    }

    public static byte[] c(byte[] bArr, byte[] bArr2) {
        byte[] d = zb2.d(16);
        return a(d, d(bArr, bArr2, d));
    }

    public static byte[] d(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr.length == 0 || bArr2 == null || bArr2.length < 16 || bArr3 == null || bArr3.length < 16) {
            bc2.b(a, C0201.m82(10179));
            return new byte[0];
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, C0201.m82(10171));
        try {
            Cipher instance = Cipher.getInstance(C0201.m82(10172));
            instance.init(1, secretKeySpec, new IvParameterSpec(bArr3));
            return instance.doFinal(bArr);
        } catch (NoSuchAlgorithmException e) {
            String str = a;
            bc2.b(str, C0201.m82(10178) + e.getMessage());
            return new byte[0];
        } catch (NoSuchPaddingException e2) {
            String str2 = a;
            bc2.b(str2, C0201.m82(10177) + e2.getMessage());
            return new byte[0];
        } catch (InvalidKeyException e3) {
            String str3 = a;
            bc2.b(str3, C0201.m82(10176) + e3.getMessage());
            return new byte[0];
        } catch (InvalidAlgorithmParameterException e4) {
            String str4 = a;
            bc2.b(str4, C0201.m82(10175) + e4.getMessage());
            return new byte[0];
        } catch (IllegalBlockSizeException e5) {
            String str5 = a;
            bc2.b(str5, C0201.m82(10174) + e5.getMessage());
            return new byte[0];
        } catch (BadPaddingException e6) {
            String str6 = a;
            bc2.b(str6, C0201.m82(10173) + e6.getMessage());
            return new byte[0];
        }
    }
}
