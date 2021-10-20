package com.huawei.hms.update.ui;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.ResourceLoaderUtil;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

/* compiled from: HiappWizard */
public class h extends a {
    private boolean d() {
        String r0 = C0201.m82(35614);
        Activity b = b();
        if (b == null || b.isFinishing() || TextUtils.isEmpty(this.g)) {
            return false;
        }
        try {
            Intent intent = new Intent();
            intent.setAction(C0201.m82(35615));
            intent.putExtra(C0201.m82(35616), this.g);
            if (SystemUtils.isTVDevice()) {
                int packageVersionCode = new PackageManagerHelper(b).getPackageVersionCode(C0201.m82(35617));
                HMSLog.i(r0, C0201.m82(35618) + packageVersionCode);
                if (packageVersionCode == 1) {
                    HMSLog.i(r0, C0201.m82(35619));
                    intent.addFlags(268435456);
                    a(intent);
                    b.startActivity(intent);
                    return true;
                }
            }
            HMSLog.i(r0, C0201.m82(35620));
            a(intent);
            b.startActivityForResult(intent, getRequestCode());
            return true;
        } catch (ActivityNotFoundException unused) {
            HMSLog.e(r0, C0201.m82(35621));
            return false;
        }
    }

    @Override // com.huawei.hms.update.ui.a
    public void a(b bVar) {
        HMSLog.i(C0201.m82(35622), C0201.m82(35623));
        if (bVar instanceof i) {
            a();
        }
    }

    @Override // com.huawei.hms.update.ui.a
    public void b(b bVar) {
        HMSLog.i(C0201.m82(35627), C0201.m82(35628));
        if (bVar instanceof i) {
            bVar.c();
            if (d()) {
                return;
            }
            if (!a(false)) {
                b(8, this.f);
            } else {
                a(8, this.f);
            }
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 2005;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate, com.huawei.hms.update.ui.a
    public void onBridgeActivityCreate(Activity activity) {
        super.onBridgeActivityCreate(activity);
        UpdateBean updateBean = this.c;
        if (updateBean != null) {
            this.f = 5;
            if (updateBean.isNeedConfirm() && !TextUtils.isEmpty(this.h)) {
                a(i.class);
            } else if (d()) {
            } else {
                if (!a(false)) {
                    b(8, this.f);
                } else {
                    a(8, this.f);
                }
            }
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate, com.huawei.hms.update.ui.a
    public void onBridgeActivityDestroy() {
        super.onBridgeActivityDestroy();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        IBridgeActivityDelegate iBridgeActivityDelegate;
        if (this.e && (iBridgeActivityDelegate = this.b) != null) {
            return iBridgeActivityDelegate.onBridgeActivityResult(i, i2, intent);
        }
        if (this.f != 5 || i != getRequestCode()) {
            return false;
        }
        if (a(this.g, this.i)) {
            b(0, this.f);
            return true;
        }
        b(8, this.f);
        return true;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate, com.huawei.hms.update.ui.a
    public void onBridgeConfigurationChanged() {
        super.onBridgeConfigurationChanged();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate, com.huawei.hms.update.ui.a
    public void onKeyUp(int i, KeyEvent keyEvent) {
        IBridgeActivityDelegate iBridgeActivityDelegate;
        if (this.e && (iBridgeActivityDelegate = this.b) != null) {
            iBridgeActivityDelegate.onKeyUp(i, keyEvent);
        } else if (4 == i) {
            HMSLog.i(C0201.m82(35629), C0201.m82(35630));
            Activity b = b();
            if (b != null && !b.isFinishing()) {
                b.setResult(0, null);
                b.finish();
            }
        }
    }

    private void a(Intent intent) {
        List<ResolveInfo> queryIntentActivities = b().getPackageManager().queryIntentActivities(intent, 65536);
        if (!(queryIntentActivities == null || queryIntentActivities.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(C0201.m82(35611));
            arrayList.add(C0201.m82(35612));
            arrayList.add(C0201.m82(35613));
            if (queryIntentActivities.size() != 1) {
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    if (arrayList.contains(resolveInfo.activityInfo.packageName)) {
                        intent.setPackage(resolveInfo.activityInfo.packageName);
                        return;
                    }
                }
            }
        }
    }

    @Override // com.huawei.hms.update.ui.a
    public void a(Class<? extends b> cls) {
        c();
        try {
            b bVar = (b) cls.newInstance();
            if (!TextUtils.isEmpty(this.h) && (bVar instanceof i)) {
                String string = ResourceLoaderUtil.getString(C0201.m82(35624));
                this.h = string;
                ((i) bVar).a(string);
            }
            bVar.a(this);
            this.d = bVar;
        } catch (IllegalAccessException | IllegalStateException | InstantiationException e) {
            HMSLog.e(C0201.m82(35626), C0201.m82(35625) + e.getMessage());
        }
    }

    @Override // com.huawei.hms.update.ui.a
    public void a() {
        b(13, this.f);
    }
}
