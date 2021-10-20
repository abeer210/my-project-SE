package com.huawei.hms.rn.location.backend.utils;

import com.huawei.hms.rn.location.backend.interfaces.JSONTriMapper;

/* compiled from: lambda */
public final /* synthetic */ class t implements JSONTriMapper {
    public static final /* synthetic */ t a = new t();

    private /* synthetic */ t() {
    }

    @Override // com.huawei.hms.rn.location.backend.interfaces.JSONTriMapper
    public final Object run(Object obj, Object obj2, Object obj3) {
        return PermissionUtils.a((Integer) obj, (String[]) obj2, (int[]) obj3);
    }
}
