package com.huawei.hms.rn.location.backend.utils;

import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.hms.rn.location.backend.interfaces.JSONMapper;

/* compiled from: lambda */
public final /* synthetic */ class b implements JSONMapper {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // com.huawei.hms.rn.location.backend.interfaces.JSONMapper
    public final Object map(Object obj) {
        return ActivityUtils.b((ActivityIdentificationData) obj);
    }
}
