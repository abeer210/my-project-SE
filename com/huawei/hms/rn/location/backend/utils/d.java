package com.huawei.hms.rn.location.backend.utils;

import com.huawei.hms.location.ActivityIdentificationResponse;
import com.huawei.hms.rn.location.backend.interfaces.JSONMapper;

/* compiled from: lambda */
public final /* synthetic */ class d implements JSONMapper {
    public static final /* synthetic */ d a = new d();

    private /* synthetic */ d() {
    }

    @Override // com.huawei.hms.rn.location.backend.interfaces.JSONMapper
    public final Object map(Object obj) {
        return ActivityUtils.e((ActivityIdentificationResponse) obj);
    }
}
