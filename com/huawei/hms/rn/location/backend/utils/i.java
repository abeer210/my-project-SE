package com.huawei.hms.rn.location.backend.utils;

import com.huawei.hms.rn.location.backend.interfaces.JSONMapper;
import org.json.JSONObject;

/* compiled from: lambda */
public final /* synthetic */ class i implements JSONMapper {
    public static final /* synthetic */ i a = new i();

    private /* synthetic */ i() {
    }

    @Override // com.huawei.hms.rn.location.backend.interfaces.JSONMapper
    public final Object map(Object obj) {
        return GeofenceUtils.a((JSONObject) obj);
    }
}
