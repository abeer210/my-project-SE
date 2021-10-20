package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.core.content.b;
import java.util.concurrent.atomic.AtomicBoolean;
import vigqyno.C0201;

/* renamed from: y12  reason: default package */
/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
public class y12 {
    private final Context a;
    private final SharedPreferences b;
    private final AtomicBoolean c = new AtomicBoolean(c());

    public y12(Context context, String str, u12 u12) {
        this.a = a(context);
        this.b = context.getSharedPreferences(C0201.m82(36873) + str, 0);
    }

    private static Context a(Context context) {
        return (Build.VERSION.SDK_INT < 24 || b.j(context)) ? context : b.b(context);
    }

    private boolean c() {
        ApplicationInfo applicationInfo;
        SharedPreferences sharedPreferences = this.b;
        String r1 = C0201.m82(36874);
        if (sharedPreferences.contains(r1)) {
            return this.b.getBoolean(r1, true);
        }
        try {
            PackageManager packageManager = this.a.getPackageManager();
            if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.a.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey(r1))) {
                return applicationInfo.metaData.getBoolean(r1);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return true;
    }

    public boolean b() {
        return this.c.get();
    }
}
