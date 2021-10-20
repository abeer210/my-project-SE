package com.huawei.hms.api;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.activity.internal.BusResponseCallback;
import com.huawei.hms.activity.internal.ForegroundBusResponseMgr;
import com.huawei.hms.support.log.HMSLog;
import java.lang.ref.WeakReference;
import vigqyno.C0201;

public class ResolutionDelegate implements IBridgeActivityDelegate {
    public static final String CALLBACK_METHOD = null;
    private WeakReference<Activity> a;

    static {
        C0201.m83(ResolutionDelegate.class, 147);
    }

    private void a() {
        Activity b = b();
        if (b != null && !b.isFinishing()) {
            b.finish();
        }
    }

    private Activity b() {
        WeakReference<Activity> weakReference = this.a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 1002;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        this.a = new WeakReference<>(activity);
        Bundle extras = activity.getIntent().getExtras();
        if (extras != null) {
            activity.startActivityForResult((Intent) extras.getParcelable(C0201.m82(33718)), 1002);
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        this.a = null;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        if (i != getRequestCode()) {
            return false;
        }
        BusResponseCallback a2 = a(C0201.m82(33719));
        int isHuaweiMobileServicesAvailable = HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(this.a.get(), 30000000);
        if (i2 == -1 && isHuaweiMobileServicesAvailable == 0) {
            HMSLog.i(C0201.m82(33720), C0201.m82(33721));
        } else {
            a2.innerError(this.a.get(), i2, C0201.m82(33722));
        }
        a();
        return true;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i, KeyEvent keyEvent) {
    }

    private BusResponseCallback a(String str) {
        return ForegroundBusResponseMgr.getInstance().get(str);
    }
}
