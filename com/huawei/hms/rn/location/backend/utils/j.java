package com.huawei.hms.rn.location.backend.utils;

import com.huawei.hms.location.GeofenceData;
import com.huawei.hms.rn.location.backend.interfaces.JSONMapper;

/* compiled from: lambda */
public final /* synthetic */ class j implements JSONMapper {
    public static final /* synthetic */ j a = new j();

    private /* synthetic */ j() {
    }

    @Override // com.huawei.hms.rn.location.backend.interfaces.JSONMapper
    public final Object map(Object obj) {
        return GeofenceUtils.d((GeofenceData) obj);
    }
}
