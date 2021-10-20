package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import vigqyno.C0201;

/* renamed from: uy1  reason: default package */
public final class uy1 {
    private static final gy1 a = new gy1(C0201.m82(31251));

    public static boolean a(Context context) {
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(C0201.m82(31252), 64).signatures;
            if (signatureArr == null || (r1 = signatureArr.length) == 0) {
                a.g(C0201.m82(31257), new Object[0]);
                return false;
            }
            for (Signature signature : signatureArr) {
                String b = l02.b(signature.toByteArray());
                if (C0201.m82(31253).equals(b)) {
                    return true;
                }
                if ((Build.TAGS.contains(C0201.m82(31254)) || Build.TAGS.contains(C0201.m82(31255))) && C0201.m82(31256).equals(b)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
