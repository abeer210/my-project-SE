package com.huawei.hms.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.text.TextUtils;
import com.huawei.hms.support.log.HMSLog;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.List;
import vigqyno.C0201;

public class PackageManagerHelper {
    private final PackageManager a;

    public enum PackageStates {
        ENABLED,
        DISABLED,
        NOT_INSTALLED
    }

    public PackageManagerHelper(Context context) {
        this.a = context.getPackageManager();
    }

    private byte[] a(String str) {
        String r0 = C0201.m82(8228);
        String r1 = C0201.m82(8229);
        try {
            PackageInfo packageInfo = this.a.getPackageInfo(str, 64);
            if (!(packageInfo == null || packageInfo.signatures == null || packageInfo.signatures.length <= 0)) {
                return packageInfo.signatures[0].toByteArray();
            }
        } catch (PackageManager.NameNotFoundException e) {
            HMSLog.e(r1, r0 + e.getMessage());
        }
        HMSLog.e(r1, r0);
        return new byte[0];
    }

    public static boolean isBackground(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (context == null) {
            return false;
        }
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(C0201.m82(8230));
            if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.equals(context.getPackageName()) && runningAppProcessInfo.importance >= 200) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            HMSLog.e(C0201.m82(8231), C0201.m82(8232), e);
        }
    }

    public String getPackageSignature(String str) {
        byte[] a2 = a(str);
        if (a2 == null || a2.length == 0) {
            return null;
        }
        return HEX.encodeHexString(SHA256.digest(a2), true);
    }

    public PackageStates getPackageStates(String str) {
        if (TextUtils.isEmpty(str)) {
            return PackageStates.NOT_INSTALLED;
        }
        try {
            if (this.a.getApplicationInfo(str, 0).enabled) {
                return PackageStates.ENABLED;
            }
            return PackageStates.DISABLED;
        } catch (PackageManager.NameNotFoundException unused) {
            return PackageStates.NOT_INSTALLED;
        }
    }

    public int getPackageVersionCode(String str) {
        try {
            PackageInfo packageInfo = this.a.getPackageInfo(str, 16);
            if (packageInfo != null) {
                return packageInfo.versionCode;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return 0;
    }

    public String getPackageVersionName(String str) {
        String r0 = C0201.m82(8233);
        try {
            PackageInfo packageInfo = this.a.getPackageInfo(str, 16);
            if (!(packageInfo == null || packageInfo.versionName == null)) {
                return packageInfo.versionName;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return r0;
    }

    public boolean hasProvider(String str, String str2) {
        try {
            PackageInfo packageInfo = this.a.getPackageInfo(str, 8);
            if (!(packageInfo == null || packageInfo.providers == null)) {
                for (ProviderInfo providerInfo : packageInfo.providers) {
                    if (str2.equals(providerInfo.authority)) {
                        return true;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public boolean verifyPackageArchive(String str, String str2, String str3) {
        PackageInfo packageArchiveInfo = this.a.getPackageArchiveInfo(str, 64);
        if (packageArchiveInfo == null || packageArchiveInfo.signatures.length <= 0 || !str2.equals(packageArchiveInfo.packageName)) {
            return false;
        }
        InputStream inputStream = null;
        try {
            inputStream = IOUtils.toInputStream(packageArchiveInfo.signatures[0].toByteArray());
            return str3.equalsIgnoreCase(HEX.encodeHexString(SHA256.digest(CertificateFactory.getInstance(C0201.m82(8234)).generateCertificate(inputStream).getEncoded()), true));
        } catch (IOException | CertificateException e) {
            String r7 = C0201.m82(8235);
            HMSLog.e(r7, C0201.m82(8236) + e.getMessage());
        } finally {
            IOUtils.closeQuietly(inputStream);
        }
        return false;
    }
}
