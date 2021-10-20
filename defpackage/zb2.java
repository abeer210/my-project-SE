package defpackage;

import android.os.Build;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.prng.SP800SecureRandomBuilder;
import vigqyno.C0201;

/* renamed from: zb2  reason: default package */
public class zb2 {
    private static boolean a;
    private static boolean b;

    static {
        C0201.m83(zb2.class, 688);
    }

    private static boolean a() {
        return Build.VERSION.SDK_INT >= 26;
    }

    private static SecureRandom b() {
        String r0 = C0201.m82(21382);
        try {
            SecureRandom instanceStrong = SecureRandom.getInstanceStrong();
            AESEngine aESEngine = new AESEngine();
            byte[] bArr = new byte[32];
            instanceStrong.nextBytes(bArr);
            return new SP800SecureRandomBuilder(instanceStrong, true).setEntropyBitsRequired(384).buildCTR(aESEngine, 256, bArr, false);
        } catch (NoSuchAlgorithmException unused) {
            bc2.b(r0, C0201.m82(21385));
            return new SecureRandom();
        } catch (Throwable th) {
            if (b) {
                bc2.b(r0, C0201.m82(21383) + th.getMessage() + C0201.m82(21384));
                b = false;
            }
            return new SecureRandom();
        }
    }

    private static byte[] c(int i) {
        bc2.a(C0201.m82(21386), C0201.m82(21387));
        SecureRandom b2 = b();
        if (b2 == null) {
            return new byte[0];
        }
        byte[] bArr = new byte[i];
        b2.nextBytes(bArr);
        return bArr;
    }

    public static byte[] d(int i) {
        if (a && a()) {
            return c(i);
        }
        try {
            byte[] bArr = new byte[i];
            new SecureRandom().nextBytes(bArr);
            return bArr;
        } catch (Exception e) {
            bc2.b(C0201.m82(21389), C0201.m82(21388) + e.getMessage());
            return new byte[0];
        }
    }

    public static String e(int i) {
        return ac2.a(d(i));
    }
}
