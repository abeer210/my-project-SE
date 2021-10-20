package com.huawei.hms.rn.location.backend.utils;

import com.huawei.hms.location.LocationSettingsResponse;
import com.huawei.hms.rn.location.backend.interfaces.JSONMapper;

/* compiled from: lambda */
public final /* synthetic */ class q implements JSONMapper {
    public static final /* synthetic */ q a = new q();

    private /* synthetic */ q() {
    }

    @Override // com.huawei.hms.rn.location.backend.interfaces.JSONMapper
    public final Object map(Object obj) {
        return LocationUtils.h((LocationSettingsResponse) obj);
    }
}
