package defpackage;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import vigqyno.C0201;

/* renamed from: ob2  reason: default package */
public class ob2 {
    public static SecretKey a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws NoSuchAlgorithmException, InvalidKeySpecException {
        if (bArr.length == 16 && bArr2.length == 16 && bArr3.length == 16) {
            return new SecretKeySpec(SecretKeyFactory.getInstance(C0201.m82(21358)).generateSecret(new PBEKeySpec(mb2.a(d(bArr, bArr2, bArr3)).toCharArray(), bArr4, 5000, 128)).getEncoded(), C0201.m82(21359));
        }
        throw new IllegalArgumentException(C0201.m82(21360));
    }

    private static byte[] b(byte[] bArr, int i) {
        if (bArr != null) {
            for (int i2 = 0; i2 < bArr.length; i2++) {
                if (i < 0) {
                    bArr[i2] = (byte) (bArr[i2] << (-i));
                } else {
                    bArr[i2] = (byte) (bArr[i2] >> i);
                }
            }
            return bArr;
        }
        throw new NullPointerException(C0201.m82(21361));
    }

    private static byte[] c(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            throw new NullPointerException(C0201.m82(21363));
        } else if (bArr.length == bArr2.length) {
            byte[] bArr3 = new byte[bArr.length];
            for (int i = 0; i < bArr.length; i++) {
                bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
            }
            return bArr3;
        } else {
            throw new IllegalArgumentException(C0201.m82(21362));
        }
    }

    public static byte[] d(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        b(bArr, -4);
        byte[] c = c(bArr, bArr2);
        b(c, 6);
        return c(c, bArr3);
    }
}
