package com.huawei.hms.rn.location.backend.utils;

import com.huawei.hms.location.ActivityConversionResponse;
import com.huawei.hms.rn.location.backend.interfaces.JSONMapper;

/* compiled from: lambda */
public final /* synthetic */ class c implements JSONMapper {
    public static final /* synthetic */ c a = new c();

    private /* synthetic */ c() {
    }

    @Override // com.huawei.hms.rn.location.backend.interfaces.JSONMapper
    public final Object map(Object obj) {
        return ActivityUtils.f((ActivityConversionResponse) obj);
    }
}
