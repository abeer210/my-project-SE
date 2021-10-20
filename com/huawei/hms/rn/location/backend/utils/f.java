package com.huawei.hms.rn.location.backend.utils;

import com.huawei.hms.location.ActivityConversionData;
import com.huawei.hms.rn.location.backend.interfaces.JSONMapper;

/* compiled from: lambda */
public final /* synthetic */ class f implements JSONMapper {
    public static final /* synthetic */ f a = new f();

    private /* synthetic */ f() {
    }

    @Override // com.huawei.hms.rn.location.backend.interfaces.JSONMapper
    public final Object map(Object obj) {
        return ActivityUtils.c((ActivityConversionData) obj);
    }
}
