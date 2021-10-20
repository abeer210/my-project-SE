package com.huawei.hms.rn.location.backend.utils;

import com.huawei.hms.location.LocationResult;
import com.huawei.hms.rn.location.backend.interfaces.JSONMapper;

/* compiled from: lambda */
public final /* synthetic */ class n implements JSONMapper {
    public static final /* synthetic */ n a = new n();

    private /* synthetic */ n() {
    }

    @Override // com.huawei.hms.rn.location.backend.interfaces.JSONMapper
    public final Object map(Object obj) {
        return LocationUtils.c((LocationResult) obj);
    }
}
