package defpackage;

import android.content.Context;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import vigqyno.C0201;

/* renamed from: l02  reason: default package */
public final class l02 {
    public static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    public static String b(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance(C0201.m82(5347));
            instance.update(bArr);
            return Base64.encodeToString(instance.digest(), 11);
        } catch (NoSuchAlgorithmException unused) {
            return C0201.m82(5348);
        }
    }
}
