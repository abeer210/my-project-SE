package com.huawei.hms.feature.dynamic.a;

import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.common.util.Logger;
import com.huawei.hms.feature.dynamic.DynamicModule;
import vigqyno.C0201;

public class e implements DynamicModule.VersionPolicy {
    private static final String a = null;

    static {
        C0201.m83(e.class, 738);
    }

    @Override // com.huawei.hms.feature.dynamic.DynamicModule.VersionPolicy
    public Bundle getModuleInfo(Context context, String str) throws DynamicModule.LoadingException {
        Bundle remoteModuleInfo = DynamicModule.getRemoteModuleInfo(context, str);
        String r1 = C0201.m82(21628);
        int i = remoteModuleInfo.getInt(r1);
        String r3 = C0201.m82(21629);
        if (i > 0) {
            String str2 = a;
            Logger.i(str2, C0201.m82(21630) + str + r3 + remoteModuleInfo.getInt(r1));
            return remoteModuleInfo;
        }
        Bundle localModuleInfo = DynamicModule.getLocalModuleInfo(context, str);
        String r0 = C0201.m82(21631);
        if (localModuleInfo.getInt(r0) > 0) {
            String str3 = a;
            Logger.i(str3, C0201.m82(21632) + str + r3 + localModuleInfo.getInt(r0));
            return localModuleInfo;
        }
        Logger.i(a, C0201.m82(21633));
        return new Bundle();
    }
}
