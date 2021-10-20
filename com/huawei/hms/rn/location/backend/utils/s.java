package com.huawei.hms.rn.location.backend.utils;

import com.huawei.hms.location.LocationAvailability;
import com.huawei.hms.rn.location.backend.interfaces.JSONMapper;

/* compiled from: lambda */
public final /* synthetic */ class s implements JSONMapper {
    public static final /* synthetic */ s a = new s();

    private /* synthetic */ s() {
    }

    @Override // com.huawei.hms.rn.location.backend.interfaces.JSONMapper
    public final Object map(Object obj) {
        return LocationUtils.g((LocationAvailability) obj);
    }
}
