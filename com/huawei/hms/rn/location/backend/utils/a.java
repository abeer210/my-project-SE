package com.huawei.hms.rn.location.backend.utils;

import com.huawei.hms.rn.location.backend.interfaces.JSONMapper;
import org.json.JSONArray;

/* compiled from: lambda */
public final /* synthetic */ class a implements JSONMapper {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // com.huawei.hms.rn.location.backend.interfaces.JSONMapper
    public final Object map(Object obj) {
        return ActivityUtils.d((JSONArray) obj);
    }
}
