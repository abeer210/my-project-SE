package com.huawei.hms.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Looper;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.adapter.sysobs.SystemObserver;
import com.huawei.hms.adapter.ui.UpdateAdapter;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import vigqyno.C0201;

public class AvailableAdapter {
    private static AtomicBoolean c = new AtomicBoolean(false);
    private static int d = 0;
    private final int a;
    private AvailableCallBack b;
    private SystemObserver e = new SystemObserver() {
        /* class com.huawei.hms.adapter.AvailableAdapter.AnonymousClass1 */

        @Override // com.huawei.hms.adapter.sysobs.SystemObserver
        public boolean onSolutionResult(Intent intent, String str) {
            return false;
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemObserver
        public boolean onUpdateResult(int i) {
            AvailableCallBack c = AvailableAdapter.this.c();
            String r2 = C0201.m82(34333);
            if (c == null) {
                HMSLog.e(r2, C0201.m82(34334));
                return true;
            }
            c.onComplete(i);
            int unused = AvailableAdapter.d = i;
            HMSLog.i(r2, C0201.m82(34335) + AvailableAdapter.d);
            AvailableAdapter.c.set(false);
            return true;
        }
    };

    public interface AvailableCallBack {
        void onComplete(int i);
    }

    public AvailableAdapter(int i) {
        this.a = i;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private AvailableCallBack c() {
        return this.b;
    }

    public int isHuaweiMobileServicesAvailable(Context context) {
        Checker.checkNonNull(context, C0201.m82(34574));
        int i = Build.VERSION.SDK_INT;
        String r1 = C0201.m82(34575);
        if (i < 16) {
            HMSLog.i(r1, C0201.m82(34576));
            return 21;
        }
        HMSPackageManager instance = HMSPackageManager.getInstance(context);
        PackageManagerHelper.PackageStates hMSPackageStates = instance.getHMSPackageStates();
        if (PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(hMSPackageStates)) {
            HMSLog.i(r1, C0201.m82(34577));
            return 1;
        } else if (PackageManagerHelper.PackageStates.DISABLED.equals(hMSPackageStates)) {
            HMSLog.i(r1, C0201.m82(34578));
            return 3;
        } else if (!instance.isApkUpdateNecessary(this.a)) {
            return 0;
        } else {
            HMSLog.i(r1, C0201.m82(34579));
            return 2;
        }
    }

    public boolean isUserResolvableError(int i) {
        return i == 1 || i == 2;
    }

    public void startResolution(Activity activity, AvailableCallBack availableCallBack) {
        boolean z;
        int hmsVersionCode = HMSPackageManager.getInstance(activity).getHmsVersionCode();
        int i = 0;
        String r3 = C0201.m82(34580);
        if (hmsVersionCode >= 40000000) {
            HMSLog.i(r3, C0201.m82(34581));
            z = true;
        } else {
            z = false;
        }
        if (c.compareAndSet(false, true)) {
            HMSLog.i(r3, C0201.m82(34582));
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            HMSLog.i(r3, C0201.m82(34583));
        } else {
            HMSLog.i(r3, C0201.m82(34587));
            while (c.get()) {
                if (i >= 300) {
                    HMSLog.i(r3, C0201.m82(34588));
                    if (availableCallBack != null) {
                        availableCallBack.onComplete(27);
                        return;
                    }
                    return;
                }
                try {
                    HMSLog.d(r3, C0201.m82(34589));
                    Thread.sleep(200);
                    i++;
                } catch (InterruptedException unused) {
                    HMSLog.d(r3, C0201.m82(34590));
                }
            }
            HMSLog.i(r3, C0201.m82(34591));
            if (availableCallBack != null) {
                availableCallBack.onComplete(d);
                return;
            }
            return;
        }
        HMSLog.i(r3, C0201.m82(34584));
        if (activity != null && availableCallBack != null) {
            this.b = availableCallBack;
            SystemManager.getSystemNotifier().registerObserver(this.e);
            Intent intentStartBridgeActivity = BridgeActivity.getIntentStartBridgeActivity(activity, UpdateAdapter.class.getName());
            intentStartBridgeActivity.putExtra(C0201.m82(34585), this.a);
            intentStartBridgeActivity.putExtra(C0201.m82(34586), z);
            activity.startActivity(intentStartBridgeActivity);
        }
    }
}
