package com.huawei.hms.rn.location.backend.utils;

import com.huawei.hms.location.HWLocation;
import com.huawei.hms.rn.location.backend.interfaces.JSONMapper;

/* compiled from: lambda */
public final /* synthetic */ class o implements JSONMapper {
    public static final /* synthetic */ o a = new o();

    private /* synthetic */ o() {
    }

    @Override // com.huawei.hms.rn.location.backend.interfaces.JSONMapper
    public final Object map(Object obj) {
        return LocationUtils.e((HWLocation) obj);
    }
}
