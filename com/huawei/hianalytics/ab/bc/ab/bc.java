package com.huawei.hianalytics.ab.bc.ab;

import com.huawei.hianalytics.ab.bc.ef.ab;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import vigqyno.C0201;

public class bc {
    public static String ab(String str, String str2) {
        try {
            return ab(str, str2.getBytes(C0201.m82(9999)));
        } catch (UnsupportedEncodingException unused) {
            ab.cd(C0201.m82(10000), C0201.m82(10001));
            return C0201.m82(10002);
        }
    }

    public static String ab(String str, byte[] bArr) {
        String str2;
        String r0 = C0201.m82(10003);
        String r1 = C0201.m82(10004);
        if (bArr == null || bArr.length == 0) {
            ab.fg(r1, C0201.m82(10007));
            return r0;
        }
        try {
            return ac2.a(ab(bArr, ab(ac2.b(str))));
        } catch (NoSuchAlgorithmException unused) {
            str2 = C0201.m82(10006);
            ab.fg(r1, str2);
            return r0;
        } catch (InvalidKeySpecException unused2) {
            str2 = C0201.m82(10005);
            ab.fg(r1, str2);
            return r0;
        }
    }

    private static PublicKey ab(byte[] bArr) {
        return KeyFactory.getInstance(C0201.m82(10008)).generatePublic(new X509EncodedKeySpec(bArr));
    }

    private static byte[] ab(byte[] bArr, PublicKey publicKey) {
        String str;
        String r0 = C0201.m82(10009);
        if (publicKey != null) {
            try {
                Cipher instance = Cipher.getInstance(C0201.m82(10010));
                instance.init(1, publicKey);
                return instance.doFinal(bArr);
            } catch (UnsupportedEncodingException unused) {
                str = C0201.m82(10017);
                ab.fg(r0, str);
                return new byte[0];
            } catch (NoSuchAlgorithmException unused2) {
                str = C0201.m82(10016);
                ab.fg(r0, str);
                return new byte[0];
            } catch (InvalidKeyException unused3) {
                str = C0201.m82(10015);
                ab.fg(r0, str);
                return new byte[0];
            } catch (NoSuchPaddingException unused4) {
                str = C0201.m82(10014);
                ab.fg(r0, str);
                return new byte[0];
            } catch (BadPaddingException unused5) {
                str = C0201.m82(10013);
                ab.fg(r0, str);
                return new byte[0];
            } catch (IllegalBlockSizeException unused6) {
                str = C0201.m82(10012);
                ab.fg(r0, str);
                return new byte[0];
            }
        } else {
            throw new UnsupportedEncodingException(C0201.m82(10011));
        }
    }
}
