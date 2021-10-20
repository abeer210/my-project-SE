package com.huawei.updatesdk.service.appmgr.bean;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.text.TextUtils;
import com.huawei.updatesdk.a.a.c.a;
import com.huawei.updatesdk.a.a.c.g;
import com.huawei.updatesdk.a.b.d.c.b;
import java.util.List;
import java.util.Locale;
import vigqyno.C0201;

public class Param extends b {
    private String fSha2_;
    private int isPre_;
    private List<String> keySets_;
    private int maple_;
    private String oldVersion_;
    private String package_;
    private String sSha2_;
    private int targetSdkVersion_;
    private int versionCode_;

    public Param() {
    }

    public Param(PackageInfo packageInfo) {
        this.package_ = packageInfo.packageName;
        this.versionCode_ = packageInfo.versionCode;
        String str = packageInfo.versionName;
        this.oldVersion_ = str == null ? C0201.m82(35343) : str;
        this.targetSdkVersion_ = packageInfo.applicationInfo.targetSdkVersion;
        this.isPre_ = com.huawei.updatesdk.b.f.b.a(packageInfo);
        this.maple_ = com.huawei.updatesdk.b.f.b.a(this.package_);
        this.keySets_ = com.huawei.updatesdk.b.a.b.b.a().a(packageInfo);
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null && signatureArr.length > 0) {
            setApkSignature(signatureArr[0].toCharsString());
        }
        this.fSha2_ = com.huawei.updatesdk.b.a.a.b.a().a(packageInfo);
    }

    public void setApkFileSha256(String str) {
        this.fSha2_ = str;
    }

    public void setApkSignature(String str) {
        String b = g.b(a.a(g.c(str)));
        if (!TextUtils.isEmpty(b)) {
            this.sSha2_ = b.toLowerCase(Locale.getDefault());
        }
    }

    public void setMapleState(int i) {
        this.maple_ = i;
    }

    public void setPackageName(String str) {
        this.package_ = str;
    }

    public void setTargetSdkVersion(int i) {
        this.targetSdkVersion_ = i;
    }

    public void setVersionCode(int i) {
        this.versionCode_ = i;
    }

    public void setVersionName(String str) {
        this.oldVersion_ = str;
    }
}
