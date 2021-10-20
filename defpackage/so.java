package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.bumptech.glide.load.g;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import vigqyno.C0201;

/* renamed from: so  reason: default package */
/* compiled from: ApplicationVersionSignature */
public final class so {
    private static final ConcurrentMap<String, g> a = new ConcurrentHashMap();

    private static PackageInfo a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(C0201.m82(5950), C0201.m82(5949) + context.getPackageName(), e);
            return null;
        }
    }

    private static String b(PackageInfo packageInfo) {
        if (packageInfo != null) {
            return String.valueOf(packageInfo.versionCode);
        }
        return UUID.randomUUID().toString();
    }

    public static g c(Context context) {
        String packageName = context.getPackageName();
        g gVar = a.get(packageName);
        if (gVar != null) {
            return gVar;
        }
        g d = d(context);
        g putIfAbsent = a.putIfAbsent(packageName, d);
        return putIfAbsent == null ? d : putIfAbsent;
    }

    private static g d(Context context) {
        return new uo(b(a(context)));
    }
}
