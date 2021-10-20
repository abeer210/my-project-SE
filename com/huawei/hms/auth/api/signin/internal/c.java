package com.huawei.hms.auth.api.signin.internal;

import android.content.Context;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.common.internal.ClientSettings;
import com.huawei.hms.support.api.hwid.HuaweiIdSignInOptions;

/* compiled from: HuaweiIdHmsClientBuilder */
public class c extends AbstractClientBuilder<b, HuaweiIdSignInOptions> {
    /* renamed from: a */
    public b buildClient(Context context, ClientSettings clientSettings, BaseHmsClient.OnConnectionFailedListener onConnectionFailedListener, BaseHmsClient.ConnectionCallbacks connectionCallbacks) {
        return new b(context, clientSettings, onConnectionFailedListener, connectionCallbacks);
    }
}
