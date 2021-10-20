package com.huawei.hms.maps;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.common.util.AGCUtils;
import com.huawei.hms.maps.model.RuntimeRemoteException;
import vigqyno.C0201;

public final class mab {
    public static void a(Context context) {
        boolean isEmpty = TextUtils.isEmpty(b(context));
        String r1 = C0201.m82(35002);
        if (isEmpty) {
            String r2 = C0201.m82(35004);
            mco.d(r1, r2);
            throw new RuntimeRemoteException(r2);
        } else if (TextUtils.isEmpty(c(context))) {
            String r22 = C0201.m82(35003);
            mco.d(r1, r22);
            throw new RuntimeRemoteException(r22);
        }
    }

    private static String b(Context context) {
        String appId = AGCUtils.getAppId(context);
        return TextUtils.isEmpty(appId) ? mcq.a(context) : appId;
    }

    private static String c(Context context) {
        String apiKey = MapClientIdentify.getApiKey();
        return TextUtils.isEmpty(apiKey) ? ib2.a(context).c(C0201.m82(35005)) : apiKey;
    }
}
