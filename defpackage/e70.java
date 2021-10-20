package defpackage;

import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import vigqyno.C0201;

/* renamed from: e70  reason: default package */
/* compiled from: SecureHashUtil */
public class e70 {
    public static String a(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance(C0201.m82(36396));
            instance.update(bArr, 0, bArr.length);
            return Base64.encodeToString(instance.digest(), 11);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
