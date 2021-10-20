package com.huawei.hms.support.api.a;

import android.content.Context;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.common.internal.ClientSettings;

/* compiled from: LocationEnhanceClientBuilder */
public class i extends AbstractClientBuilder<p, r> {
    /* renamed from: a */
    public p buildClient(Context context, ClientSettings clientSettings, BaseHmsClient.OnConnectionFailedListener onConnectionFailedListener, BaseHmsClient.ConnectionCallbacks connectionCallbacks) {
        return new p(context, clientSettings, onConnectionFailedListener, connectionCallbacks);
    }
}
