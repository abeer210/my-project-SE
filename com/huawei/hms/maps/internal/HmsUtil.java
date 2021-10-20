package com.huawei.hms.maps.internal;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import com.huawei.hms.adapter.AvailableAdapter;
import com.huawei.hms.maps.mbu;
import com.huawei.hms.maps.mco;
import vigqyno.C0201;

public class HmsUtil {
    private static boolean a;
    private static boolean b;
    private static int c;

    static {
        C0201.m83(HmsUtil.class, 374);
    }

    public static Activity findActivity(Context context) {
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (Activity) context;
    }

    public static int isHmsAvailable(Context context) {
        String str;
        String[] split;
        if (c == 0) {
            return 0;
        }
        String r2 = C0201.m82(36765);
        mco.a(r2, C0201.m82(36763) + a + C0201.m82(36764) + b);
        if (a || !b) {
            return 1;
        }
        String str2 = null;
        try {
            str2 = context.getPackageManager().getApplicationInfo(context.getApplicationContext().getPackageName(), 128).metaData.getString(C0201.m82(36766));
        } catch (PackageManager.NameNotFoundException unused) {
            mco.d(r2, C0201.m82(36767));
        }
        int i = 40001300;
        if (str2 != null && !C0201.m82(36768).equals(str2) && (split = str2.split(C0201.m82(36769))) != null && split.length == 4) {
            StringBuilder sb = new StringBuilder();
            sb.append(split[0]);
            String r1 = C0201.m82(36770);
            sb.append(r1);
            sb.append(split[1]);
            sb.append(r1);
            sb.append(split[2]);
            sb.append(split[3]);
            mco.b(r2, C0201.m82(36771).concat(String.valueOf(str2)));
            i = Integer.parseInt(sb.toString());
            mco.b(r2, C0201.m82(36772).concat(String.valueOf(i)));
        }
        AvailableAdapter availableAdapter = new AvailableAdapter(i);
        int isHuaweiMobileServicesAvailable = availableAdapter.isHuaweiMobileServicesAvailable(context);
        mco.b(r2, C0201.m82(36773).concat(String.valueOf(isHuaweiMobileServicesAvailable)));
        a = true;
        if (isHuaweiMobileServicesAvailable == 0) {
            mco.b(r2, C0201.m82(36774));
        } else {
            if (availableAdapter.isUserResolvableError(isHuaweiMobileServicesAvailable)) {
                mco.a(r2, C0201.m82(36775));
                Activity findActivity = findActivity(context);
                if (findActivity == null) {
                    str = C0201.m82(36776);
                } else {
                    availableAdapter.startResolution(findActivity, new AvailableAdapter.AvailableCallBack() {
                        /* class com.huawei.hms.maps.internal.HmsUtil.AnonymousClass1 */

                        @Override // com.huawei.hms.adapter.AvailableAdapter.AvailableCallBack
                        public final void onComplete(int i) {
                            String r0 = C0201.m82(11514);
                            if (i == 0) {
                                int unused = HmsUtil.c = i;
                                mco.b(r0, C0201.m82(11515));
                                return;
                            }
                            mco.d(r0, C0201.m82(11516).concat(String.valueOf(i)));
                            boolean unused2 = HmsUtil.a = false;
                            boolean unused3 = HmsUtil.b = false;
                        }
                    });
                }
            } else {
                str = C0201.m82(36777);
            }
            mco.d(r2, str);
        }
        c = isHuaweiMobileServicesAvailable;
        return isHuaweiMobileServicesAvailable;
    }

    public static void setRepeatFlag(boolean z) {
        b = z;
        mbu.a(z);
    }
}
