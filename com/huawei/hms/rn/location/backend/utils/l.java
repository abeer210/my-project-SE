package com.huawei.hms.rn.location.backend.utils;

import com.huawei.hms.location.NavigationResult;
import com.huawei.hms.rn.location.backend.interfaces.JSONMapper;

/* compiled from: lambda */
public final /* synthetic */ class l implements JSONMapper {
    public static final /* synthetic */ l a = new l();

    private /* synthetic */ l() {
    }

    @Override // com.huawei.hms.rn.location.backend.interfaces.JSONMapper
    public final Object map(Object obj) {
        return LocationUtils.i((NavigationResult) obj);
    }
}
