package com.huawei.updatesdk.service.otaupdate;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import com.huawei.updatesdk.a.b.d.b;
import com.huawei.updatesdk.a.b.d.c.c;
import com.huawei.updatesdk.a.b.d.c.d;
import com.huawei.updatesdk.service.appmgr.bean.ApkUpgradeInfo;
import com.huawei.updatesdk.service.appmgr.bean.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

public class e extends AsyncTask<Void, Void, d> {
    private Context a;
    private CheckUpdateCallBack b;
    private UpdateParams c;
    private Toast d;
    private boolean e = false;
    private List<String> f = new ArrayList();
    private b g;
    private String h;

    public e(Context context, UpdateParams updateParams, CheckUpdateCallBack checkUpdateCallBack) {
        this.c = updateParams;
        this.a = context;
        this.b = checkUpdateCallBack;
        h.g().b(updateParams.getServiceZone());
        if (TextUtils.isEmpty(h.g().c())) {
            h.g().d(C0201.m82(34873));
        }
        this.h = h.g().c();
    }

    private PackageInfo a(Context context, String str) {
        PackageInfo a2 = com.huawei.updatesdk.b.f.b.a(str, context);
        if (a2 != null) {
            return a2;
        }
        PackageInfo packageInfo = new PackageInfo();
        packageInfo.packageName = str;
        packageInfo.versionName = C0201.m82(34874);
        packageInfo.versionCode = 1;
        ApplicationInfo applicationInfo = new ApplicationInfo();
        applicationInfo.targetSdkVersion = 19;
        packageInfo.applicationInfo = applicationInfo;
        return packageInfo;
    }

    private d a(Context context, List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            arrayList.add(a(context, str));
        }
        a aVar = !i.a(this.c.getParamList()) ? new a(this.c.getParamList()) : a.a(arrayList);
        aVar.a(h.g().e() ? 34 : 0);
        aVar.d(0);
        if (isCancelled()) {
            Log.w(C0201.m82(34875), C0201.m82(34876));
            return null;
        }
        b bVar = new b(aVar, null);
        this.g = bVar;
        return bVar.c();
    }

    private void a() {
        Toast toast = this.d;
        if (toast != null) {
            toast.cancel();
        }
    }

    private void a(Context context, ApkUpgradeInfo apkUpgradeInfo) {
        if (context != null) {
            Intent intent = new Intent(context, AppUpdateActivity.class);
            Bundle bundle = new Bundle();
            bundle.putSerializable(C0201.m82(34877), apkUpgradeInfo);
            bundle.putBoolean(C0201.m82(34878), this.c.isMustBtnOne());
            intent.putExtras(bundle);
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
            try {
                context.startActivity(intent);
            } catch (ActivityNotFoundException e2) {
                com.huawei.updatesdk.a.a.b.a.a.a.b(C0201.m82(34880), C0201.m82(34879) + e2.toString());
            }
        }
    }

    private void a(List<ApkUpgradeInfo> list) {
        if (!i.a(list)) {
            for (ApkUpgradeInfo apkUpgradeInfo : list) {
                if (apkUpgradeInfo != null && !TextUtils.isEmpty(apkUpgradeInfo.getFullDownUrl_())) {
                    if (apkUpgradeInfo.getDiffSize_() > 0) {
                        apkUpgradeInfo.setDiffDownUrl_(apkUpgradeInfo.getDownurl_());
                    }
                    apkUpgradeInfo.setDownurl_(apkUpgradeInfo.getFullDownUrl_());
                }
            }
        }
    }

    private void b(d dVar) {
        if (this.b != null) {
            Intent intent = new Intent();
            intent.putExtra(C0201.m82(34881), 6);
            if (dVar.a() != null) {
                intent.putExtra(C0201.m82(34882), dVar.a().ordinal());
            }
            intent.putExtra(C0201.m82(34883), dVar.c());
            intent.putExtra(C0201.m82(34884), dVar.b());
            this.b.onUpdateInfo(intent);
            this.b.onUpdateStoreError(dVar.d());
        }
    }

    private boolean b() {
        return !this.e && TextUtils.isEmpty(this.c.getTargetPkgName()) && i.a(this.c.getPackageList()) && i.a(this.c.getParamList());
    }

    /* renamed from: a */
    public d doInBackground(Void... voidArr) {
        com.huawei.updatesdk.a.a.b.a.a.a.a(C0201.m82(34885), C0201.m82(34886));
        com.huawei.updatesdk.b.e.a.b.a(this);
        h.g().a(this.a, this.h);
        c.c(com.huawei.updatesdk.a.a.c.h.b.c(this.a, g.f(this.a, h.g().e() ? C0201.m82(34887) : C0201.m82(34888))));
        String targetPkgName = this.c.getTargetPkgName();
        if (TextUtils.isEmpty(targetPkgName)) {
            targetPkgName = this.a.getPackageName();
        }
        if (!i.a(this.c.getPackageList())) {
            this.f.addAll(this.c.getPackageList());
        } else if (!TextUtils.isEmpty(targetPkgName)) {
            this.f.add(targetPkgName);
        }
        com.huawei.updatesdk.b.b.a.c().d(h.g().a());
        return a(this.a, this.f);
    }

    /* renamed from: a */
    public void onPostExecute(d dVar) {
        com.huawei.updatesdk.b.e.a.b.a().remove(this);
        a();
        String r1 = C0201.m82(34889);
        if (dVar != null) {
            int b2 = dVar.b();
            ArrayList<ApkUpgradeInfo> arrayList = null;
            int d2 = dVar.d();
            String r5 = C0201.m82(34890);
            String r7 = C0201.m82(34891);
            if (d2 == 0 && dVar.e() == 0) {
                com.huawei.updatesdk.service.appmgr.bean.b bVar = (com.huawei.updatesdk.service.appmgr.bean.b) dVar;
                arrayList = bVar.list_;
                if (!i.a(bVar.notRcmList_)) {
                    ApkUpgradeInfo apkUpgradeInfo = bVar.notRcmList_.get(0);
                    Log.w(r7, C0201.m82(34892) + apkUpgradeInfo.getNotRcmReason_() + C0201.m82(34893) + apkUpgradeInfo.getSameS_());
                }
                a(arrayList);
                if (i.a(arrayList) && this.b != null) {
                    Intent intent = new Intent();
                    intent.putExtra(r1, 3);
                    intent.putExtra(r5, b2);
                    this.b.onUpdateInfo(intent);
                }
            } else {
                b(dVar);
                Log.e(r7, C0201.m82(34894) + dVar.d() + C0201.m82(34895) + dVar.c());
            }
            if (!i.a(arrayList)) {
                ApkUpgradeInfo apkUpgradeInfo2 = arrayList.get(0);
                if (this.b != null) {
                    Intent intent2 = new Intent();
                    intent2.putExtra(C0201.m82(34896), (Serializable) apkUpgradeInfo2);
                    intent2.putParcelableArrayListExtra(C0201.m82(34897), arrayList);
                    intent2.putExtra(r1, 7);
                    intent2.putExtra(r5, b2);
                    this.b.onUpdateInfo(intent2);
                }
                if (apkUpgradeInfo2 != null) {
                    Log.i(r7, C0201.m82(34898) + apkUpgradeInfo2.getVersion_() + C0201.m82(34899) + apkUpgradeInfo2.getVersionCode_() + C0201.m82(34900) + apkUpgradeInfo2.getDetailId_() + C0201.m82(34901) + apkUpgradeInfo2.getDevType_() + C0201.m82(34902) + apkUpgradeInfo2.getPackage_() + C0201.m82(34903) + apkUpgradeInfo2.getOldVersionCode_());
                } else {
                    Log.e(r7, C0201.m82(34904));
                }
                if (this.c.isShowImmediate()) {
                    a(this.a, apkUpgradeInfo2);
                }
            } else if (b()) {
                Context context = this.a;
                Toast.makeText(context, g.e(context, C0201.m82(34905)), 0).show();
            }
        } else if (this.b != null) {
            Intent intent3 = new Intent();
            intent3.putExtra(r1, 3);
            this.b.onUpdateInfo(intent3);
        }
    }

    public void a(boolean z) {
        this.e = z;
    }

    public void onCancelled() {
        super.onCancelled();
        b bVar = this.g;
        if (bVar != null) {
            bVar.b();
        }
    }

    public void onPreExecute() {
        super.onPreExecute();
        d.a().a(this.b);
        if (b()) {
            Context context = this.a;
            Toast makeText = Toast.makeText(context, g.e(context, C0201.m82(34906)), 1);
            this.d = makeText;
            makeText.show();
        }
    }
}
