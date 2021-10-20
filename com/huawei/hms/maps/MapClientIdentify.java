package com.huawei.hms.maps;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.hms.common.util.AGCUtils;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import vigqyno.C0201;

public class MapClientIdentify {
    private static Context a;
    private static String b;
    private static long c;
    private mak d;

    public static long a() {
        return c;
    }

    private static String a(byte[] bArr) {
        try {
            byte[] digest = MessageDigest.getInstance(C0201.m82(7467)).digest(bArr);
            if (digest == null) {
                return null;
            }
            int length = digest.length;
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < length; i++) {
                stringBuffer.append((digest[i] & 255) < 16 ? C0201.m82(7468) + Integer.toHexString(digest[i] & 255) : Integer.toHexString(digest[i] & 255));
            }
            return stringBuffer.toString().toUpperCase(Locale.ENGLISH);
        } catch (NoSuchAlgorithmException unused) {
            mco.d(C0201.m82(7469), C0201.m82(7470));
            return C0201.m82(7471);
        }
    }

    public static void a(long j) {
        c = j;
    }

    public static void a(Context context) {
        a = context;
    }

    public static void a(String str) {
        b = str;
    }

    private static byte[] a(Context context, String str) {
        PackageInfo packageInfo;
        String r0 = C0201.m82(7472);
        if (context == null || TextUtils.isEmpty(str)) {
            mco.d(r0, C0201.m82(7474));
            return new byte[0];
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (!(packageManager == null || (packageInfo = packageManager.getPackageInfo(str, 64)) == null)) {
                return packageInfo.signatures[0].toByteArray();
            }
        } catch (PackageManager.NameNotFoundException unused) {
            mco.d(r0, C0201.m82(7473));
        }
        return new byte[0];
    }

    public static Context b() {
        return a;
    }

    private static String b(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        try {
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 0)).toString();
        } catch (PackageManager.NameNotFoundException | Resources.NotFoundException unused) {
            mco.d(C0201.m82(7475), C0201.m82(7476));
            return C0201.m82(7477);
        }
    }

    public static String getApiKey() {
        return b;
    }

    public final boolean a(Context context, maf maf) {
        String r0 = C0201.m82(7478);
        mco.a(r0, C0201.m82(7479));
        String packageName = context.getApplicationContext().getPackageName();
        String b2 = b(context, packageName);
        String appId = AGCUtils.getAppId(context);
        if (TextUtils.isEmpty(appId)) {
            appId = mcq.a(context);
        }
        String r4 = C0201.m82(7480);
        if (r4.equals(appId)) {
            mco.d(r0, C0201.m82(7481));
        }
        byte[] a2 = a(context, packageName);
        if (a2 != null && a2.length > 0) {
            r4 = a(a2);
        }
        mbw mbw = new mbw();
        mbw.a = appId;
        mbw.b = packageName;
        mbw.c = b2;
        mbw.d = r4;
        if (TextUtils.isEmpty(b)) {
            b = ib2.a(context).c(C0201.m82(7482));
        }
        mbw.e = b;
        mbw.f = c;
        if (this.d == null) {
            if (maf == null) {
                return false;
            }
            try {
                this.d = maf.b(ObjectWrapper.wrap(mbu.b(context)));
            } catch (RemoteException unused) {
                mco.d(r0, C0201.m82(7483));
            }
        }
        mak mak = this.d;
        if (mak == null) {
            mco.d(r0, C0201.m82(7484));
            return false;
        }
        try {
            mak.a(mbw);
            mco.a(r0, C0201.m82(7485));
            return true;
        } catch (RemoteException unused2) {
            mco.d(r0, C0201.m82(7486));
            return true;
        }
    }
}
