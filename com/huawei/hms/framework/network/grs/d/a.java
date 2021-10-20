package com.huawei.hms.framework.network.grs.d;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import java.util.Locale;
import vigqyno.C0201;

public class a {
    public static String a() {
        return C0201.m82(28327);
    }

    public static String a(Context context) {
        String r0 = C0201.m82(28328);
        if (context == null) {
            return r0;
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            Logger.w(C0201.m82(28329), r0, e);
            return r0;
        }
    }

    public static String a(Context context, String str, String str2) {
        if (context == null) {
            return String.format(Locale.ROOT, str + C0201.m82(28330), a());
        }
        String packageName = context.getPackageName();
        String a = a(context);
        String str3 = Build.VERSION.RELEASE;
        String str4 = Build.MODEL;
        Locale locale = Locale.ROOT;
        String str5 = C0201.m82(28331) + str + C0201.m82(28332);
        Object[] objArr = new Object[6];
        objArr[0] = packageName;
        objArr[1] = a;
        objArr[2] = str3;
        objArr[3] = str4;
        objArr[4] = a();
        if (TextUtils.isEmpty(str2)) {
            str2 = C0201.m82(28333);
        }
        objArr[5] = str2;
        return String.format(locale, str5, objArr);
    }

    public static String b(Context context, String str, String str2) {
        return a(context, str, str2);
    }
}
