package com.huawei.hms.rn.location.helpers;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.e;
import com.huawei.hms.rn.location.backend.interfaces.HMSProvider;
import com.huawei.hms.rn.location.backend.interfaces.PermissionHandler;
import java.util.Objects;

/* compiled from: lambda */
public final /* synthetic */ class c implements PermissionHandler {
    public final /* synthetic */ ReactContext a;
    public final /* synthetic */ HMSProvider b;

    public /* synthetic */ c(ReactContext reactContext, HMSProvider hMSProvider) {
        this.a = reactContext;
        this.b = hMSProvider;
    }

    @Override // com.huawei.hms.rn.location.backend.interfaces.PermissionHandler
    public final void requestPermissions(int i, String[] strArr) {
        ((e) Objects.requireNonNull(this.a.getCurrentActivity())).i(strArr, i, new b(this.b));
    }
}
