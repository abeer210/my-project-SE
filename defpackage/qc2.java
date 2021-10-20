package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.util.List;
import vigqyno.C0201;

/* renamed from: qc2  reason: default package */
public class qc2 {
    private static final String a = null;

    static {
        C0201.m83(qc2.class, 314);
    }

    public static boolean a(String str) {
        PackageManager packageManager;
        Context a2 = mc2.a();
        if (!(a2 == null || (packageManager = a2.getPackageManager()) == null)) {
            try {
                List<ApplicationInfo> installedApplications = packageManager.getInstalledApplications(0);
                if (installedApplications != null) {
                    for (ApplicationInfo applicationInfo : installedApplications) {
                        if (applicationInfo.packageName.equals(str)) {
                            return true;
                        }
                    }
                }
            } catch (Exception unused) {
                pc2.e(a, C0201.m82(13847));
            } catch (Throwable unused2) {
                pc2.e(a, C0201.m82(13846));
            }
        }
        return false;
    }

    public static String b(String str) {
        Context a2 = mc2.a();
        String r1 = C0201.m82(13848);
        if (a2 == null) {
            return r1;
        }
        try {
            return a2.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            String str2 = a;
            pc2.e(str2, C0201.m82(13851) + e.getMessage());
            return r1;
        } catch (Exception e2) {
            String str3 = a;
            pc2.e(str3, C0201.m82(13850) + e2.getMessage());
            return r1;
        } catch (Throwable unused) {
            pc2.e(a, C0201.m82(13849));
            return r1;
        }
    }
}
