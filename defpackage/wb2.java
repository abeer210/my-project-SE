package defpackage;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import vigqyno.C0201;

/* renamed from: wb2  reason: default package */
public abstract class wb2 {
    private static final String a = null;

    static {
        C0201.m83(wb2.class, 482);
    }

    private static byte[] a(char[] cArr, byte[] bArr, int i, int i2, boolean z) {
        SecretKeyFactory secretKeyFactory;
        try {
            PBEKeySpec pBEKeySpec = new PBEKeySpec(cArr, bArr, i, i2);
            if (z) {
                secretKeyFactory = SecretKeyFactory.getInstance(C0201.m82(8026));
            } else {
                secretKeyFactory = SecretKeyFactory.getInstance(C0201.m82(8027));
            }
            return secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            String str = a;
            bc2.b(str, C0201.m82(8028) + e.getMessage());
            return new byte[0];
        }
    }

    public static byte[] b(char[] cArr, byte[] bArr, int i, int i2) {
        return a(cArr, bArr, i, i2, false);
    }
}
