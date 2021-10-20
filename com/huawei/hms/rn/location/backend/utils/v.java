package com.huawei.hms.rn.location.backend.utils;

import com.huawei.hms.rn.location.backend.interfaces.JSONTriMapper;
import com.huawei.hms.rn.location.backend.interfaces.TriMapper;

/* compiled from: lambda */
public final /* synthetic */ class v implements TriMapper {
    public final /* synthetic */ JSONTriMapper a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v(JSONTriMapper jSONTriMapper, Object obj) {
        this.a = jSONTriMapper;
        this.b = obj;
    }

    @Override // com.huawei.hms.rn.location.backend.interfaces.TriMapper
    public final Object map(Object obj, Object obj2, Object obj3) {
        return PlatformUtils.f(this.a, this.b, obj, obj2, obj3);
    }
}
