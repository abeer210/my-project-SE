package com.huawei.hms.rn.location.helpers;

import com.facebook.react.modules.core.f;
import com.huawei.hms.rn.location.backend.interfaces.HMSProvider;

/* compiled from: lambda */
public final /* synthetic */ class b implements f {
    public final /* synthetic */ HMSProvider a;

    public /* synthetic */ b(HMSProvider hMSProvider) {
        this.a = hMSProvider;
    }

    @Override // com.facebook.react.modules.core.f
    public final boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        return this.a.onRequestPermissionsResult(i, strArr, iArr);
    }
}
