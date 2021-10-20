package com.huawei.updatesdk.service.appmgr.bean;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import com.huawei.updatesdk.a.a.c.h.a;
import com.huawei.updatesdk.a.b.d.c.b;
import com.huawei.updatesdk.b.b.c;
import com.huawei.updatesdk.service.otaupdate.h;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

public class a extends c {
    public static final String APIMETHOD = null;
    public static final int DEFAULT_UPGRADE_RESULT = 0;
    public static final int FULL_UPGRADE_RESULT = 0;
    public static final int INSTALL_CHECK_DEFAULT = 0;
    private String agVersion_;
    private String buildNumber_;
    private String density_;
    private com.huawei.updatesdk.a.a.c.h.a deviceSpecParams_;
    private int emuiApiLevel_;
    private String firmwareVersion_;
    private int getSafeGame_;
    private int gmsSupport_;
    private int installCheck_;
    private int isFullUpgrade_;
    private int mapleVer_;
    private String packageName_;
    private String phoneType_;
    private C0117a pkgInfo_;
    private String resolution_;
    private String serviceCountry_;
    private int supportMaple_;
    private int versionCode_;
    private String version_;

    /* renamed from: com.huawei.updatesdk.service.appmgr.bean.a$a  reason: collision with other inner class name */
    public static class C0117a extends b {
        private List<Param> params_;

        public void a(List<Param> list) {
            this.params_ = list;
        }
    }

    static {
        C0201.m83(a.class, 576);
    }

    public a() {
        this.emuiApiLevel_ = 0;
        this.installCheck_ = 0;
        this.isFullUpgrade_ = 0;
        this.getSafeGame_ = 1;
        this.supportMaple_ = 0;
        Context a = com.huawei.updatesdk.a.b.a.a.c().a();
        a(C0201.m82(5019));
        b(C0201.m82(5020));
        h(Build.VERSION.RELEASE.trim());
        d(com.huawei.updatesdk.a.a.c.h.b.f());
        m(com.huawei.updatesdk.a.a.c.h.b.h(a));
        f(com.huawei.updatesdk.a.a.c.h.b.c());
        j(Build.MODEL);
        g(com.huawei.updatesdk.a.a.c.h.b.f(a));
        h(com.huawei.updatesdk.a.a.c.h.b.g(a));
        c(com.huawei.updatesdk.a.a.c.h.b.i(a) ? 1 : 0);
        k(com.huawei.updatesdk.a.a.c.h.b.e(a));
        i(com.huawei.updatesdk.a.b.a.a.c().a().getPackageName());
        b(com.huawei.updatesdk.b.f.a.d().a());
        l(com.huawei.updatesdk.b.b.a.c().a());
        g(com.huawei.updatesdk.a.a.c.h.b.d().a());
        f(com.huawei.updatesdk.a.a.c.h.b.d().b());
        this.deviceSpecParams_ = new a.b(a).a(true).a();
        e(com.huawei.updatesdk.a.a.c.h.b.b(a, h.g().c()));
    }

    public a(List<Param> list) {
        this();
        C0117a aVar = new C0117a();
        aVar.a(list);
        a(aVar);
    }

    public static a a(List<PackageInfo> list) {
        a aVar = new a();
        C0117a aVar2 = new C0117a();
        aVar.a(aVar2);
        ArrayList arrayList = new ArrayList();
        aVar2.a(arrayList);
        for (PackageInfo packageInfo : list) {
            arrayList.add(new Param(packageInfo));
        }
        return aVar;
    }

    public static a n(String str) {
        PackageInfo packageInfo = new PackageInfo();
        packageInfo.packageName = str;
        packageInfo.versionName = C0201.m82(5021);
        packageInfo.versionCode = 1;
        ApplicationInfo applicationInfo = new ApplicationInfo();
        applicationInfo.targetSdkVersion = 19;
        packageInfo.applicationInfo = applicationInfo;
        ArrayList arrayList = new ArrayList();
        arrayList.add(packageInfo);
        a a = a(arrayList);
        a.e(1);
        return a;
    }

    public void a(C0117a aVar) {
        this.pkgInfo_ = aVar;
    }

    public void b(int i) {
        this.emuiApiLevel_ = i;
    }

    public void c(int i) {
        this.gmsSupport_ = i;
    }

    public void d(int i) {
        this.installCheck_ = i;
    }

    public void e(int i) {
        this.isFullUpgrade_ = i;
    }

    public void e(String str) {
        this.agVersion_ = str;
    }

    public void f(int i) {
        this.mapleVer_ = i;
    }

    public void f(String str) {
        this.buildNumber_ = str;
    }

    public void g(int i) {
        this.supportMaple_ = i;
    }

    public void g(String str) {
        this.density_ = str;
    }

    public void h(int i) {
        this.versionCode_ = i;
    }

    public void h(String str) {
        this.firmwareVersion_ = str;
    }

    public void i(String str) {
        this.packageName_ = str;
    }

    public void j(String str) {
        this.phoneType_ = str;
    }

    public void k(String str) {
        this.resolution_ = str;
    }

    public void l(String str) {
        this.serviceCountry_ = str;
    }

    public void m(String str) {
        this.version_ = str;
    }
}
