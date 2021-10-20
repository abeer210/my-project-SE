package com.huawei.hms.framework.network.grs.a;

import android.content.Context;
import android.content.pm.PackageManager;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.PLSharedPreferences;
import java.util.Map;
import vigqyno.C0201;

public class c {
    private static final String a = null;
    private PLSharedPreferences b = null;

    static {
        C0201.m83(c.class, 619);
    }

    public c(Context context) {
        String packageName = context.getPackageName();
        Logger.d(a, C0201.m82(6072), packageName);
        this.b = new PLSharedPreferences(context, C0201.m82(6073) + packageName);
        a(context);
    }

    private void a(Context context) {
        try {
            String l = Long.toString((long) context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionCode);
            String r0 = C0201.m82(6074);
            String a2 = a(r0, C0201.m82(6075));
            if (!l.equals(a2)) {
                Logger.i(a, C0201.m82(6076), a2, l);
                c();
                b(r0, l);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Logger.w(a, C0201.m82(6077));
        }
    }

    public String a(String str, String str2) {
        return this.b.getString(str, str2);
    }

    public Map<String, ?> a() {
        return this.b.getAll();
    }

    public void a(String str) {
        this.b.remove(str);
    }

    public String b() {
        return a(C0201.m82(6078), C0201.m82(6079));
    }

    public void b(String str, String str2) {
        this.b.putString(str, str2);
    }

    public void c() {
        this.b.clear();
    }
}
