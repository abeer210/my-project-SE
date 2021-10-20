package com.huawei.hms.adapter.ui;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.manager.HMSPublishStateHolder;
import com.huawei.hms.update.manager.PackageNameManager;
import com.huawei.hms.update.manager.UpdateManager;
import com.huawei.hms.update.ui.UpdateBean;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.ResourceLoaderUtil;
import java.lang.ref.WeakReference;
import vigqyno.C0201;

public class UpdateAdapter implements IBridgeActivityDelegate, PackageNameManager.QueryPublishCallback {
    private WeakReference<Activity> a;
    private int b;
    private UpdateBean c;
    private String d;

    private void a() {
        PackageNameManager.getInstance(d()).queryPackageName(this);
    }

    private void b() {
        Activity d2 = d();
        UpdateBean updateBean = new UpdateBean();
        updateBean.setHmsOrApkUpgrade(true);
        String r3 = C0201.m82(34110);
        HMSLog.i(r3, C0201.m82(34109) + this.d);
        updateBean.setClientPackageName(this.d);
        updateBean.setClientVersionCode(this.b);
        updateBean.setClientAppId(C0201.m82(34111));
        if (ResourceLoaderUtil.getmContext() == null) {
            ResourceLoaderUtil.setmContext(d2.getApplicationContext());
        }
        updateBean.setClientAppName(ResourceLoaderUtil.getString(C0201.m82(34112)));
        this.c = updateBean;
        HMSLog.i(r3, C0201.m82(34113));
        UpdateManager.startUpdate(d2, 1001, updateBean);
        this.c = null;
    }

    private void c() {
        Activity d2 = d();
        if (d2 != null && !d2.isFinishing()) {
            d2.finish();
        }
    }

    private Activity d() {
        WeakReference<Activity> weakReference = this.a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    private void e() {
        SystemManager.getInstance().notifyUpdateResult(8);
        c();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 1001;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        this.a = new WeakReference<>(activity);
        Intent intent = activity.getIntent();
        if (intent == null) {
            e();
            return;
        }
        int intExtra = intent.getIntExtra(C0201.m82(34114), 0);
        this.b = intExtra;
        if (intExtra == 0) {
            e();
        } else if (intent.getBooleanExtra(C0201.m82(34115), false)) {
            HMSLog.i(C0201.m82(34116), C0201.m82(34117));
            String hMSPackageName = HMSPackageManager.getInstance(activity.getApplicationContext()).getHMSPackageName();
            ComponentName componentName = new ComponentName(hMSPackageName, C0201.m82(34118));
            Intent intent2 = new Intent();
            intent2.putExtra(C0201.m82(34119), activity.getApplicationContext().getPackageName());
            intent2.putExtra(C0201.m82(34120), hMSPackageName);
            intent2.setComponent(componentName);
            activity.startActivityForResult(intent2, 1001);
        } else {
            HMSPackageManager instance = HMSPackageManager.getInstance(activity);
            if (!PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(instance.getHMSPackageStates())) {
                this.d = instance.getHMSPackageName();
                b();
            } else if (HMSPublishStateHolder.getPublishState() == 0) {
                a();
            } else if (HMSPublishStateHolder.getPublishState() == 1) {
                this.d = C0201.m82(34121);
                b();
            } else {
                this.d = C0201.m82(34122);
                b();
            }
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        HMSLog.i(C0201.m82(34123), C0201.m82(34124));
        this.a = null;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        if (i != getRequestCode()) {
            this.c = null;
            return false;
        }
        String r7 = C0201.m82(34125);
        HMSLog.i(r7, C0201.m82(34126));
        if (i2 == 1214) {
            HMSLog.i(r7, C0201.m82(34127));
            Activity d2 = d();
            if (d2 == null) {
                HMSLog.e(r7, C0201.m82(34128));
                this.c = null;
                return true;
            }
            UpdateManager.startUpdate(d2, 1001, this.c);
            this.c = null;
        }
        if (i2 == -1) {
            if (intent != null) {
                if (intent.getIntExtra(C0201.m82(34129), 0) == 1) {
                    HMSLog.i(r7, C0201.m82(34130));
                    SystemManager.getInstance().notifyUpdateResult(0);
                    this.c = null;
                    c();
                    return true;
                }
                int intExtra = intent.getIntExtra(C0201.m82(34131), -1);
                if (intExtra == 0) {
                    HMSLog.i(r7, C0201.m82(34132));
                    SystemManager.getInstance().notifyUpdateResult(0);
                } else if (intExtra == 13) {
                    HMSLog.i(r7, C0201.m82(34133));
                    SystemManager.getInstance().notifyUpdateResult(13);
                } else if (intExtra == 8) {
                    HMSLog.i(r7, C0201.m82(34134));
                    SystemManager.getInstance().notifyUpdateResult(8);
                } else {
                    HMSLog.i(r7, C0201.m82(34135));
                    SystemManager.getInstance().notifyUpdateResult(intExtra);
                }
            }
        } else if (i2 == 0) {
            HMSLog.i(r7, C0201.m82(34136));
            this.c = null;
            Activity d3 = d();
            if (d3 == null) {
                return true;
            }
            if (a(d3, HMSPackageManager.getInstance(d3.getApplicationContext()).getHMSPackageName(), this.b)) {
                HMSLog.i(r7, C0201.m82(34137));
                SystemManager.getInstance().notifyUpdateResult(13);
            } else {
                SystemManager.getInstance().notifyUpdateResult(0);
            }
        } else if (i2 == 1) {
            SystemManager.getInstance().notifyUpdateResult(28);
        }
        c();
        return true;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        HMSLog.i(C0201.m82(34138), C0201.m82(34139));
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i, KeyEvent keyEvent) {
        HMSLog.i(C0201.m82(34140), C0201.m82(34141));
    }

    @Override // com.huawei.hms.update.manager.PackageNameManager.QueryPublishCallback
    public void onQueryResult() {
        if (HMSPublishStateHolder.getPublishState() == 1) {
            this.d = C0201.m82(34142);
        } else {
            this.d = C0201.m82(34143);
        }
        b();
    }

    private boolean a(Context context, String str, int i) {
        if (context == null || TextUtils.isEmpty(str) || i == 0) {
            return false;
        }
        PackageManagerHelper packageManagerHelper = new PackageManagerHelper(context);
        if (!PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(packageManagerHelper.getPackageStates(str)) && packageManagerHelper.getPackageVersionCode(str) >= i) {
            return false;
        }
        return true;
    }
}
