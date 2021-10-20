package com.huawei.hms.auth.api.signin.internal;

import android.app.Activity;
import android.content.Context;
import com.huawei.hms.adapter.AvailableAdapter;
import com.huawei.hms.support.log.HMSLog;
import vigqyno.C0201;

/* compiled from: HuaweiIdVersionCheck */
public class h {
    public static int a() {
        return 30000000;
    }

    public static void a(Activity activity, AvailableAdapter.AvailableCallBack availableCallBack) {
        String r0 = C0201.m82(31409);
        HMSLog.i(r0, C0201.m82(31410));
        Context applicationContext = activity.getApplicationContext();
        int a = a();
        HMSLog.i(r0, C0201.m82(31411) + a);
        AvailableAdapter availableAdapter = new AvailableAdapter(a);
        int isHuaweiMobileServicesAvailable = availableAdapter.isHuaweiMobileServicesAvailable(applicationContext);
        if (isHuaweiMobileServicesAvailable == 0) {
            availableCallBack.onComplete(isHuaweiMobileServicesAvailable);
        } else if (availableAdapter.isUserResolvableError(isHuaweiMobileServicesAvailable)) {
            a(activity, availableAdapter, availableCallBack);
        } else {
            availableCallBack.onComplete(isHuaweiMobileServicesAvailable);
        }
    }

    private static void a(Activity activity, AvailableAdapter availableAdapter, AvailableAdapter.AvailableCallBack availableCallBack) {
        if (activity == null) {
            HMSLog.i(C0201.m82(31412), C0201.m82(31413));
        }
        availableAdapter.startResolution(activity, availableCallBack);
    }
}
