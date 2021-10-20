package com.huawei.hms.rn.location.backend.utils;

import com.huawei.hms.rn.location.backend.interfaces.JSONTriMapper;
import org.json.JSONArray;

/* compiled from: lambda */
public final /* synthetic */ class h implements JSONTriMapper {
    public static final /* synthetic */ h a = new h();

    private /* synthetic */ h() {
    }

    @Override // com.huawei.hms.rn.location.backend.interfaces.JSONTriMapper
    public final Object run(Object obj, Object obj2, Object obj3) {
        return GeofenceUtils.c((JSONArray) obj, (Integer) obj2, (Integer) obj3);
    }
}
