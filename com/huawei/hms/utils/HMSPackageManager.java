package com.huawei.hms.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.a.a;
import java.security.cert.X509Certificate;
import java.util.List;
import vigqyno.C0201;

public class HMSPackageManager {
    private static HMSPackageManager a;
    private static final Object b = new Object();
    private static final Object c = new Object();
    private final Context d;
    private final PackageManagerHelper e;
    private String f;
    private String g;
    private int h;

    private HMSPackageManager(Context context) {
        this.d = context;
        this.e = new PackageManagerHelper(context);
    }

    private void a() {
        synchronized (c) {
            Pair<String, String> b2 = b();
            if (b2 == null) {
                HMSLog.e(C0201.m82(15356), C0201.m82(15357));
                this.f = null;
                this.g = null;
                this.h = 0;
                return;
            }
            this.f = (String) b2.first;
            this.g = (String) b2.second;
            this.h = this.e.getPackageVersionCode(getHMSPackageName());
            String r1 = C0201.m82(15358);
            HMSLog.i(r1, C0201.m82(15359) + this.f + C0201.m82(15360) + this.h);
        }
    }

    private Pair<String, String> b() {
        List<ResolveInfo> queryIntentServices = this.d.getPackageManager().queryIntentServices(new Intent(C0201.m82(15370)), 128);
        if (queryIntentServices.size() == 0) {
            return null;
        }
        for (ResolveInfo resolveInfo : queryIntentServices) {
            ServiceInfo serviceInfo = resolveInfo.serviceInfo;
            String str = serviceInfo.applicationInfo.packageName;
            Bundle bundle = serviceInfo.metaData;
            String r4 = C0201.m82(15371);
            String r5 = C0201.m82(15372);
            if (bundle == null) {
                HMSLog.e(r5, r4 + str + C0201.m82(15373));
            } else {
                String r6 = C0201.m82(15374);
                if (!bundle.containsKey(r6)) {
                    HMSLog.e(r5, r4 + str + C0201.m82(15375));
                } else {
                    String r7 = C0201.m82(15376);
                    if (!bundle.containsKey(r7)) {
                        HMSLog.e(r5, r4 + str + C0201.m82(15377));
                    } else {
                        String packageSignature = this.e.getPackageSignature(str);
                        if (a(str + C0201.m82(15378) + packageSignature, bundle.getString(r6), bundle.getString(r7))) {
                            return new Pair<>(str, packageSignature);
                        }
                        HMSLog.e(r5, C0201.m82(15379));
                    }
                }
            }
        }
        return null;
    }

    private boolean c() {
        PackageManager packageManager = this.d.getPackageManager();
        String r2 = C0201.m82(15380);
        if (packageManager == null) {
            HMSLog.e(r2, C0201.m82(15381));
            return true;
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getPackageInfo(getHMSPackageName(), 128).applicationInfo;
            if (applicationInfo != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey(C0201.m82(15382)) && (getHmsVersionCode() >= 50000000 || getHmsVersionCode() <= 19999999)) {
                HMSLog.i(r2, C0201.m82(15383));
                return false;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            HMSLog.e(r2, C0201.m82(15384));
        }
        return true;
    }

    public static HMSPackageManager getInstance(Context context) {
        synchronized (b) {
            if (a == null) {
                if (context.getApplicationContext() != null) {
                    a = new HMSPackageManager(context.getApplicationContext());
                } else {
                    a = new HMSPackageManager(context);
                }
                a.a();
            }
        }
        return a;
    }

    public String getHMSFingerprint() {
        String str = this.g;
        return str == null ? C0201.m82(15385) : str;
    }

    public String getHMSPackageName() {
        refresh();
        String str = this.f;
        if (str != null) {
            if (PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(this.e.getPackageStates(str))) {
                HMSLog.i(C0201.m82(15386), C0201.m82(15387));
                a();
            }
            String str2 = this.f;
            if (str2 != null) {
                return str2;
            }
        }
        PackageManagerHelper packageManagerHelper = this.e;
        String r1 = C0201.m82(15388);
        return (PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(packageManagerHelper.getPackageStates(r1)) || !this.e.getPackageSignature(r1).equalsIgnoreCase(C0201.m82(15389))) ? C0201.m82(15390) : r1;
    }

    public PackageManagerHelper.PackageStates getHMSPackageStates() {
        if (TextUtils.isEmpty(this.f) || TextUtils.isEmpty(this.g)) {
            a();
            return this.e.getPackageStates(this.f);
        }
        PackageManagerHelper.PackageStates packageStates = this.e.getPackageStates(this.f);
        return (packageStates != PackageManagerHelper.PackageStates.ENABLED || this.g.equals(this.e.getPackageSignature(this.f))) ? packageStates : PackageManagerHelper.PackageStates.NOT_INSTALLED;
    }

    public int getHmsVersionCode() {
        return this.e.getPackageVersionCode(getHMSPackageName());
    }

    public boolean hmsVerHigherThan(int i) {
        if (this.h >= i || !c()) {
            return true;
        }
        int packageVersionCode = this.e.getPackageVersionCode(getHMSPackageName());
        this.h = packageVersionCode;
        if (packageVersionCode >= i) {
            return true;
        }
        return false;
    }

    public boolean isApkUpdateNecessary(int i) {
        int hmsVersionCode = getHmsVersionCode();
        HMSLog.i(C0201.m82(15393), C0201.m82(15391) + hmsVersionCode + C0201.m82(15392) + i);
        return c() && hmsVersionCode < i;
    }

    public void refresh() {
        if (TextUtils.isEmpty(this.f) || TextUtils.isEmpty(this.g)) {
            a();
        }
    }

    private boolean a(String str, String str2, String str3) {
        boolean isEmpty = TextUtils.isEmpty(str2);
        String r2 = C0201.m82(15361);
        if (isEmpty || TextUtils.isEmpty(str3)) {
            HMSLog.e(r2, C0201.m82(15369));
            return false;
        }
        List<X509Certificate> b2 = a.b(str3);
        if (b2.size() == 0) {
            HMSLog.e(r2, C0201.m82(15362));
            return false;
        } else if (!a.a(a.a(this.d), b2)) {
            HMSLog.e(r2, C0201.m82(15363));
            return false;
        } else {
            X509Certificate x509Certificate = b2.get(b2.size() - 1);
            if (!a.a(x509Certificate, C0201.m82(15364))) {
                HMSLog.e(r2, C0201.m82(15365));
                return false;
            } else if (!a.b(x509Certificate, C0201.m82(15366))) {
                HMSLog.e(r2, C0201.m82(15367));
                return false;
            } else if (a.b(x509Certificate, str, str2)) {
                return true;
            } else {
                HMSLog.e(r2, C0201.m82(15368) + str);
                return false;
            }
        }
    }
}
