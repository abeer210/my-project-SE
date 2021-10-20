package com.huawei.hms.update.ui;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.a.a.a;
import com.huawei.hms.update.a.a.b;
import com.huawei.hms.update.a.a.c;
import com.huawei.hms.update.a.d;
import com.huawei.hms.update.provider.UpdateProvider;
import com.huawei.hms.update.ui.e;
import com.huawei.hms.update.ui.j;
import com.huawei.hms.utils.FileUtil;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.ResourceLoaderUtil;
import com.huawei.updatesdk.UpdateSdkAPI;
import com.huawei.updatesdk.service.appmgr.bean.ApkUpgradeInfo;
import com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack;
import java.io.File;
import java.io.Serializable;
import vigqyno.C0188;
import vigqyno.C0201;

/* compiled from: UpdateWizard */
public class l extends a implements b {
    private a k;
    private c l;
    private int m = 0;

    private void d() {
        Activity b = b();
        String netType = b != null ? SystemUtils.getNetType(b.getBaseContext()) : C0201.m82(35814);
        String r2 = C0201.m82(35816);
        HMSLog.i(r2, C0201.m82(35815) + netType);
        if (C0201.m82(35817).equals(netType)) {
            a(f.class);
            f();
            HMSLog.i(r2, C0201.m82(35818));
            return;
        }
        a(e.b.class);
        HMSLog.i(r2, C0201.m82(35819));
    }

    private void e() {
        if (!a(false)) {
            b(8, this.f);
        } else {
            a(8, this.f);
        }
    }

    private void f() {
        Activity b = b();
        if (b == null || b.isFinishing()) {
            a(j.c.class);
        } else if (a(b)) {
            g();
            com.huawei.hms.update.a.c cVar = new com.huawei.hms.update.a.c(new d(b));
            this.k = cVar;
            cVar.a(this, this.l);
        }
    }

    private void g() {
        a aVar = this.k;
        if (aVar != null) {
            aVar.a();
            this.k = null;
        }
    }

    @Override // com.huawei.hms.update.ui.a
    public void b(b bVar) {
        HMSLog.i(C0201.m82(35832), C0201.m82(35833));
        if (bVar instanceof i) {
            bVar.c();
            a(d.class);
            a(this);
        } else if (bVar instanceof e.d) {
            bVar.c();
            a();
        } else if (bVar instanceof e.c) {
            a(f.class);
            f();
        } else if (bVar instanceof e.b) {
            a(f.class);
            f();
        } else if (bVar instanceof j.b) {
            e();
        } else if (bVar instanceof j.c) {
            e();
        } else if (bVar instanceof j.d) {
            e();
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 2006;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate, com.huawei.hms.update.ui.a
    public void onBridgeActivityCreate(Activity activity) {
        super.onBridgeActivityCreate(activity);
        if (this.c != null) {
            this.f = 6;
            if (a(activity)) {
                if (!this.c.isNeedConfirm() || TextUtils.isEmpty(this.h)) {
                    a(d.class);
                    a(this);
                    return;
                }
                a(i.class);
            }
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate, com.huawei.hms.update.ui.a
    public void onBridgeActivityDestroy() {
        g();
        super.onBridgeActivityDestroy();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        IBridgeActivityDelegate iBridgeActivityDelegate;
        if (this.e && (iBridgeActivityDelegate = this.b) != null) {
            return iBridgeActivityDelegate.onBridgeActivityResult(i, i2, intent);
        }
        if (this.f != 6 || i != getRequestCode()) {
            return false;
        }
        if (a(this.g, this.i)) {
            b(0, this.f);
            return true;
        }
        e();
        return true;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate, com.huawei.hms.update.ui.a
    public void onKeyUp(int i, KeyEvent keyEvent) {
        IBridgeActivityDelegate iBridgeActivityDelegate;
        if (this.e && (iBridgeActivityDelegate = this.b) != null) {
            iBridgeActivityDelegate.onKeyUp(i, keyEvent);
        } else if (4 == i) {
            HMSLog.i(C0201.m82(35834), C0201.m82(35835));
            Activity b = b();
            if (b != null && !b.isFinishing()) {
                b.setResult(0, null);
                b.finish();
            }
        }
    }

    private static Uri a(Context context, File file) {
        PackageManagerHelper packageManagerHelper = new PackageManagerHelper(context);
        String packageName = context.getPackageName();
        String str = packageName + C0201.m82(35798);
        boolean z = true;
        if (Build.VERSION.SDK_INT <= 23 || (context.getApplicationInfo().targetSdkVersion <= 23 && !packageManagerHelper.hasProvider(packageName, str))) {
            z = false;
        }
        if (z) {
            return UpdateProvider.getUriForFile(context, str, file);
        }
        return Uri.fromFile(file);
    }

    private static void a(final b bVar, final int i, final c cVar) {
        if (bVar != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                /* class com.huawei.hms.update.ui.l.AnonymousClass1 */

                public void run() {
                    bVar.a(i, cVar);
                }
            });
        }
    }

    private boolean a(Activity activity) {
        if (HMSPackageManager.getInstance(activity).isApkUpdateNecessary(this.c.c())) {
            return true;
        }
        c();
        SystemManager.getInstance().notifyUpdateResult(0);
        return false;
    }

    @Override // com.huawei.hms.update.a.a.b
    public void a(int i, c cVar) {
        HMSLog.i(C0201.m82(35826), C0201.m82(35825) + com.huawei.hms.update.a.a.d.a(i));
        if (i != 1000) {
            switch (i) {
                case 1201:
                case 1202:
                case 1203:
                    a(j.b.class);
                    return;
                default:
                    a(j.b.class);
                    return;
            }
        } else {
            this.l = cVar;
            d();
        }
    }

    @Override // com.huawei.hms.update.a.a.b
    public void a(int i, int i2, int i3, File file) {
        String r1 = C0201.m82(35823);
        HMSLog.i(r1, C0201.m82(35820) + com.huawei.hms.update.a.a.d.a(i) + C0201.m82(35821) + i2 + C0201.m82(35822) + i3);
        if (i == 2000) {
            c();
            if (file == null) {
                e();
            } else if (FileUtil.verifyHash(this.l.e, file)) {
                a(file);
            } else {
                HMSLog.i(r1, C0201.m82(35824));
            }
        } else if (i != 2100) {
            switch (i) {
                case 2201:
                    a(j.c.class);
                    return;
                case 2202:
                    a(e.c.class);
                    return;
                case 2203:
                case 2204:
                    a(j.d.class);
                    return;
                default:
                    return;
            }
        } else {
            b bVar = this.d;
            if (bVar != null && (bVar instanceof f)) {
                int i4 = 0;
                if (i2 >= 0 && i3 > 0) {
                    i4 = (int) ((((long) i2) * 100) / ((long) i3));
                }
                this.m = i4;
                ((f) this.d).b(i4);
            }
        }
    }

    private void a(File file) {
        Activity b = b();
        if (b != null && !b.isFinishing()) {
            Uri a = a(b, file);
            String r1 = C0201.m82(35808);
            if (a == null) {
                HMSLog.e(r1, C0201.m82(35809));
                e();
            } else if (a(b)) {
                Intent intent = new Intent(C0201.m82(35810));
                intent.setDataAndType(a, C0201.m82(35811));
                intent.setFlags(3);
                intent.putExtra(C0201.m82(35812), true);
                try {
                    b.startActivityForResult(intent, getRequestCode());
                } catch (ActivityNotFoundException e) {
                    HMSLog.e(r1, C0201.m82(35813) + e.getMessage());
                    e();
                }
            }
        }
    }

    @Override // com.huawei.hms.update.ui.a
    public void a(b bVar) {
        HMSLog.i(C0201.m82(35827), C0201.m82(35828));
        if (bVar instanceof i) {
            a();
        } else if (bVar instanceof d) {
            g();
            a();
        } else if (bVar instanceof f) {
            g();
            a(e.d.class);
        } else if (bVar instanceof e.d) {
            a(f.class);
            f();
        } else if (bVar instanceof e.c) {
            a();
        } else if (bVar instanceof e.b) {
            a();
        } else {
            e();
        }
    }

    @Override // com.huawei.hms.update.ui.a
    public void a(Class<? extends b> cls) {
        if (a(b())) {
            c();
            try {
                b bVar = (b) cls.newInstance();
                if (!TextUtils.isEmpty(this.h) && (bVar instanceof i)) {
                    String string = ResourceLoaderUtil.getString(C0201.m82(35829));
                    this.h = string;
                    ((i) bVar).a(string);
                }
                if (this.m > 0 && (bVar instanceof f)) {
                    ((f) bVar).a(this.m);
                }
                bVar.a(this);
                this.d = bVar;
            } catch (IllegalAccessException | IllegalStateException | InstantiationException e) {
                HMSLog.e(C0201.m82(35831), C0201.m82(35830) + e.getMessage());
            }
        }
    }

    @Override // com.huawei.hms.update.ui.a
    public void a() {
        b(13, this.f);
    }

    private void a(final b bVar) {
        if (bVar != null) {
            Activity b = b();
            if (b == null || b.isFinishing()) {
                a(bVar, 1201, (c) null);
            } else if (a(b)) {
                UpdateSdkAPI.checkTargetAppUpdate(b, this.c.b(), new CheckUpdateCallBack() {
                    /* class com.huawei.hms.update.ui.l.AnonymousClass2 */

                    @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
                    public void onMarketInstallInfo(Intent intent) {
                    }

                    @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
                    public void onMarketStoreError(int i) {
                        HMSLog.e(C0201.m82(19251), C0201.m82(19250) + i);
                    }

                    @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
                    public void onUpdateInfo(Intent intent) {
                        if (intent != null) {
                            l.this.a((l) intent, (Intent) bVar);
                        }
                    }

                    @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
                    public void onUpdateStoreError(int i) {
                        HMSLog.e(C0201.m82(19253), C0201.m82(19252) + i);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void a(Intent intent, b bVar) {
        String r0 = C0201.m82(35799);
        try {
            int intExtra = intent.getIntExtra(C0201.m82(35800), -99);
            HMSLog.i(r0, C0201.m82(35801) + intExtra);
            String stringExtra = intent.getStringExtra(C0201.m82(35802));
            if (!TextUtils.isEmpty(stringExtra)) {
                HMSLog.e(r0, C0201.m82(35803) + stringExtra);
            }
            if (intExtra == 7) {
                Serializable serializableExtra = intent.getSerializableExtra(C0201.m82(35804));
                if (serializableExtra instanceof ApkUpgradeInfo) {
                    ApkUpgradeInfo apkUpgradeInfo = (ApkUpgradeInfo) serializableExtra;
                    String package_ = apkUpgradeInfo.getPackage_();
                    int versionCode_ = apkUpgradeInfo.getVersionCode_();
                    String downurl_ = apkUpgradeInfo.getDownurl_();
                    int size_ = apkUpgradeInfo.getSize_();
                    String sha256_ = apkUpgradeInfo.getSha256_();
                    if (TextUtils.isEmpty(package_) || !package_.equals(this.c.b())) {
                        a(bVar, 1201, (c) null);
                    } else if (versionCode_ < this.c.c()) {
                        HMSLog.e(r0, C0201.m82(35805) + versionCode_ + C0201.m82(35806) + this.c.c());
                        a(bVar, 1203, (c) null);
                    } else if (TextUtils.isEmpty(downurl_) || TextUtils.isEmpty(sha256_)) {
                        a(bVar, 1201, (c) null);
                    } else {
                        a(bVar, (int) C0188.f18, new c(package_, versionCode_, downurl_, size_, sha256_));
                    }
                }
            } else if (intExtra == 3) {
                a(bVar, 1202, (c) null);
            } else {
                a(bVar, 1201, (c) null);
            }
        } catch (Exception e) {
            HMSLog.e(r0, C0201.m82(35807) + e.getMessage());
            a(bVar, 1201, (c) null);
        }
    }
}
