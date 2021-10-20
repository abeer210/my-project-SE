package com.huawei.hms.rn.location.backend.utils;

import com.huawei.hms.location.Geofence;
import com.huawei.hms.rn.location.backend.interfaces.JSONMapper;

/* compiled from: lambda */
public final /* synthetic */ class g implements JSONMapper {
    public static final /* synthetic */ g a = new g();

    private /* synthetic */ g() {
    }

    @Override // com.huawei.hms.rn.location.backend.interfaces.JSONMapper
    public final Object map(Object obj) {
        return GeofenceUtils.b((Geofence) obj);
    }
}
