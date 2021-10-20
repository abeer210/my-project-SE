package com.huawei.hms.common.internal;

import android.app.Activity;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.ResourceLoaderUtil;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

public class ConnectionErrorMessages {
    private static final Map<String, String> map = new HashMap();

    public static String getErrorDialogButtonMessage(Activity activity, int i) {
        if (ResourceLoaderUtil.getmContext() == null) {
            ResourceLoaderUtil.setmContext(activity.getApplicationContext());
        }
        if (i == 1) {
            return ResourceLoaderUtil.getString(C0201.m82(8193));
        }
        if (i != 2) {
            return ResourceLoaderUtil.getString(C0201.m82(8191));
        }
        return ResourceLoaderUtil.getString(C0201.m82(8192));
    }

    public static String getErrorMessage(Activity activity, int i) {
        if (ResourceLoaderUtil.getmContext() == null) {
            ResourceLoaderUtil.setmContext(activity.getApplicationContext());
        }
        String string = ResourceLoaderUtil.getString(C0201.m82(8194));
        if (i == 1 || i == 2) {
            return string;
        }
        return null;
    }

    public static String getErrorTitle(Activity activity, int i) {
        if (ResourceLoaderUtil.getmContext() == null) {
            ResourceLoaderUtil.setmContext(activity.getApplicationContext());
        }
        if (i == 1) {
            return ResourceLoaderUtil.getString(C0201.m82(8200));
        }
        if (i == 2) {
            return ResourceLoaderUtil.getString(C0201.m82(8199));
        }
        if (i == 3) {
            return ResourceLoaderUtil.getString(C0201.m82(8198));
        }
        String r1 = C0201.m82(8195);
        if (i != 9) {
            HMSLog.e(r1, C0201.m82(8196) + i);
            return null;
        }
        HMSLog.e(r1, C0201.m82(8197));
        return null;
    }
}
