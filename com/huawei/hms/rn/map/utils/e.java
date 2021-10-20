package com.huawei.hms.rn.map.utils;

import com.facebook.react.bridge.ReadableMap;
import com.huawei.hms.rn.map.utils.ReactUtils;

/* compiled from: lambda */
public final /* synthetic */ class e implements ReactUtils.Mapper {
    public static final /* synthetic */ e a = new e();

    private /* synthetic */ e() {
    }

    @Override // com.huawei.hms.rn.map.utils.ReactUtils.Mapper
    public final Object map(Object obj) {
        return ReactUtils.getLatLngFromReadableMap((ReadableMap) obj);
    }
}
