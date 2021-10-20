package com.huawei.hms.rn.map.utils;

import com.huawei.hms.maps.model.PatternItem;
import com.huawei.hms.rn.map.utils.ReactUtils;

/* compiled from: lambda */
public final /* synthetic */ class d implements ReactUtils.Mapper {
    public static final /* synthetic */ d a = new d();

    private /* synthetic */ d() {
    }

    @Override // com.huawei.hms.rn.map.utils.ReactUtils.Mapper
    public final Object map(Object obj) {
        return ReactUtils.getWritableMapPatternItem((PatternItem) obj);
    }
}
