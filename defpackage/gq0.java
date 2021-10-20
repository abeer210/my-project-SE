package defpackage;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.util.l;
import vigqyno.C0201;

/* renamed from: gq0  reason: default package */
/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public class gq0 {
    private final Context a;

    public gq0(Context context) {
        this.a = context;
    }

    public int a(String str) {
        return this.a.checkCallingOrSelfPermission(str);
    }

    public ApplicationInfo b(String str, int i) throws PackageManager.NameNotFoundException {
        return this.a.getPackageManager().getApplicationInfo(str, i);
    }

    public CharSequence c(String str) throws PackageManager.NameNotFoundException {
        return this.a.getPackageManager().getApplicationLabel(this.a.getPackageManager().getApplicationInfo(str, 0));
    }

    public PackageInfo d(String str, int i) throws PackageManager.NameNotFoundException {
        return this.a.getPackageManager().getPackageInfo(str, i);
    }

    public final String[] e(int i) {
        return this.a.getPackageManager().getPackagesForUid(i);
    }

    public boolean f() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return fq0.a(this.a);
        }
        if (!l.i() || (nameForUid = this.a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.a.getPackageManager().isInstantApp(nameForUid);
    }

    public final PackageInfo g(String str, int i, int i2) throws PackageManager.NameNotFoundException {
        return this.a.getPackageManager().getPackageInfo(str, 64);
    }

    @TargetApi(19)
    public final boolean h(int i, String str) {
        if (l.e()) {
            try {
                ((AppOpsManager) this.a.getSystemService(C0201.m82(37873))).checkPackage(i, str);
                return true;
            } catch (SecurityException unused) {
                return false;
            }
        } else {
            String[] packagesForUid = this.a.getPackageManager().getPackagesForUid(i);
            if (!(str == null || packagesForUid == null)) {
                for (String str2 : packagesForUid) {
                    if (str.equals(str2)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
