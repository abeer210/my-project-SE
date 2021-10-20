package com.huawei.hms.support.api.a;

import android.content.Context;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.common.internal.ClientSettings;

/* compiled from: LocationArClientBuilder */
public class c extends AbstractClientBuilder<n, r> {
    /* renamed from: a */
    public n buildClient(Context context, ClientSettings clientSettings, BaseHmsClient.OnConnectionFailedListener onConnectionFailedListener, BaseHmsClient.ConnectionCallbacks connectionCallbacks) {
        return new n(context, clientSettings, onConnectionFailedListener, connectionCallbacks);
    }
}
