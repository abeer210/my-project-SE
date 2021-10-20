package com.huawei.hms.rn.location.backend.utils;

import com.huawei.hms.rn.location.backend.interfaces.JSONMapper;
import com.huawei.hms.rn.location.backend.interfaces.Mapper;

/* compiled from: lambda */
public final /* synthetic */ class u implements Mapper {
    public final /* synthetic */ JSONMapper a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u(JSONMapper jSONMapper, Object obj) {
        this.a = jSONMapper;
        this.b = obj;
    }

    @Override // com.huawei.hms.rn.location.backend.interfaces.Mapper
    public final Object map(Object obj) {
        return PlatformUtils.b(this.a, this.b, obj);
    }
}
