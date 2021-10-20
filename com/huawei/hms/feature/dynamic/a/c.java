package com.huawei.hms.feature.dynamic.a;

import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.common.util.Logger;
import com.huawei.hms.feature.dynamic.DynamicModule;
import vigqyno.C0201;

public class c implements DynamicModule.VersionPolicy {
    private static final String a = null;

    static {
        C0201.m83(c.class, 736);
    }

    @Override // com.huawei.hms.feature.dynamic.DynamicModule.VersionPolicy
    public Bundle getModuleInfo(Context context, String str) throws DynamicModule.LoadingException {
        DynamicModule.LoadingException e;
        Bundle bundle;
        try {
            bundle = DynamicModule.getRemoteModuleInfo(context, str);
            e = null;
        } catch (DynamicModule.LoadingException e2) {
            e = e2;
            String str2 = a;
            Logger.w(str2, C0201.m82(21736) + e.getMessage() + C0201.m82(21737));
            bundle = new Bundle();
        }
        Bundle localModuleInfo = DynamicModule.getLocalModuleInfo(context, str);
        String str3 = a;
        StringBuilder sb = new StringBuilder(C0201.m82(21738));
        sb.append(str);
        String r4 = C0201.m82(21739);
        sb.append(r4);
        String r5 = C0201.m82(21740);
        sb.append(bundle.getInt(r5));
        Logger.i(str3, sb.toString());
        String str4 = a;
        StringBuilder sb2 = new StringBuilder(C0201.m82(21741));
        sb2.append(str);
        sb2.append(r4);
        String r10 = C0201.m82(21742);
        sb2.append(localModuleInfo.getInt(r10));
        Logger.i(str4, sb2.toString());
        if (localModuleInfo.getInt(r10) > 0 && localModuleInfo.getInt(r10) >= bundle.getInt(r5)) {
            Logger.i(a, C0201.m82(21743));
            return localModuleInfo;
        } else if (e == null || bundle.getInt(r5) != 0) {
            Logger.i(a, C0201.m82(21744));
            return bundle;
        } else {
            throw e;
        }
    }
}
