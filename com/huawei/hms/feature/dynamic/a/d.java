package com.huawei.hms.feature.dynamic.a;

import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.common.util.Logger;
import com.huawei.hms.feature.dynamic.DynamicModule;
import vigqyno.C0201;

public class d implements DynamicModule.VersionPolicy {
    private static final String a = null;

    static {
        C0201.m83(d.class, 737);
    }

    @Override // com.huawei.hms.feature.dynamic.DynamicModule.VersionPolicy
    public Bundle getModuleInfo(Context context, String str) throws DynamicModule.LoadingException {
        Bundle remoteModuleInfo = DynamicModule.getRemoteModuleInfo(context, str);
        Bundle localModuleInfo = DynamicModule.getLocalModuleInfo(context, str);
        String str2 = a;
        StringBuilder sb = new StringBuilder(C0201.m82(21759));
        sb.append(str);
        String r3 = C0201.m82(21760);
        sb.append(r3);
        String r4 = C0201.m82(21761);
        sb.append(remoteModuleInfo.getInt(r4));
        Logger.i(str2, sb.toString());
        String str3 = a;
        StringBuilder sb2 = new StringBuilder(C0201.m82(21762));
        sb2.append(str);
        sb2.append(r3);
        String r8 = C0201.m82(21763);
        sb2.append(localModuleInfo.getInt(r8));
        Logger.i(str3, sb2.toString());
        if (remoteModuleInfo.getInt(r4) >= localModuleInfo.getInt(r8)) {
            Logger.i(a, C0201.m82(21764));
            return remoteModuleInfo;
        }
        Logger.i(a, C0201.m82(21765));
        return localModuleInfo;
    }
}
