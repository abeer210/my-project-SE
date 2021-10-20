package defpackage;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import vigqyno.C0201;

/* renamed from: xb2  reason: default package */
public final class xb2 {
    private static final String a = null;
    private static final String[] b = {C0201.m82(34961), C0201.m82(34962), C0201.m82(34963)};

    static {
        C0201.m83(xb2.class, 733);
    }

    private static boolean a(String str) {
        for (String str2 : b) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static String b(String str) {
        return c(str, C0201.m82(34964));
    }

    public static String c(String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str);
        String r1 = C0201.m82(34965);
        if (isEmpty || TextUtils.isEmpty(str2)) {
            bc2.b(a, C0201.m82(34970));
            return r1;
        } else if (!a(str2)) {
            bc2.b(a, C0201.m82(34966));
            return r1;
        } else {
            try {
                MessageDigest instance = MessageDigest.getInstance(str2);
                instance.update(str.getBytes(C0201.m82(34967)));
                return ac2.a(instance.digest());
            } catch (UnsupportedEncodingException unused) {
                bc2.b(a, C0201.m82(34969));
                return r1;
            } catch (NoSuchAlgorithmException unused2) {
                bc2.b(a, C0201.m82(34968));
                return r1;
            }
        }
    }
}
