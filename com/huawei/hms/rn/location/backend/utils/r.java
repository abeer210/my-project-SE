package com.huawei.hms.rn.location.backend.utils;

import com.huawei.hms.location.LocationSettingsStates;
import com.huawei.hms.rn.location.backend.interfaces.JSONMapper;

/* compiled from: lambda */
public final /* synthetic */ class r implements JSONMapper {
    public static final /* synthetic */ r a = new r();

    private /* synthetic */ r() {
    }

    @Override // com.huawei.hms.rn.location.backend.interfaces.JSONMapper
    public final Object map(Object obj) {
        return LocationUtils.f((LocationSettingsStates) obj);
    }
}
