package com.huawei.hms.rn.location.backend.utils;

import com.huawei.hms.rn.location.backend.interfaces.JSONMapper;
import org.json.JSONObject;

/* compiled from: lambda */
public final /* synthetic */ class e implements JSONMapper {
    public static final /* synthetic */ e a = new e();

    private /* synthetic */ e() {
    }

    @Override // com.huawei.hms.rn.location.backend.interfaces.JSONMapper
    public final Object map(Object obj) {
        return ActivityUtils.a((JSONObject) obj);
    }
}
