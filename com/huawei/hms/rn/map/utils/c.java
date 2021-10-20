package com.huawei.hms.rn.map.utils;

import com.facebook.react.bridge.ReadableArray;
import com.huawei.hms.rn.map.utils.ReactUtils;

/* compiled from: lambda */
public final /* synthetic */ class c implements ReactUtils.Mapper {
    public static final /* synthetic */ c a = new c();

    private /* synthetic */ c() {
    }

    @Override // com.huawei.hms.rn.map.utils.ReactUtils.Mapper
    public final Object map(Object obj) {
        return ReactUtils.getLatLngListFromReadableArray((ReadableArray) obj);
    }
}
