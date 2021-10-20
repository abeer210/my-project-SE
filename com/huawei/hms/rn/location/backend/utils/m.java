package com.huawei.hms.rn.location.backend.utils;

import android.location.Location;
import com.huawei.hms.rn.location.backend.interfaces.JSONMapper;

/* compiled from: lambda */
public final /* synthetic */ class m implements JSONMapper {
    public static final /* synthetic */ m a = new m();

    private /* synthetic */ m() {
    }

    @Override // com.huawei.hms.rn.location.backend.interfaces.JSONMapper
    public final Object map(Object obj) {
        return LocationUtils.d((Location) obj);
    }
}
