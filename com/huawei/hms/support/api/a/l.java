package com.huawei.hms.support.api.a;

import android.content.Context;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.common.internal.ClientSettings;

/* compiled from: LocationGeofenceClientBuilder */
public class l extends AbstractClientBuilder<q, r> {
    /* renamed from: a */
    public q buildClient(Context context, ClientSettings clientSettings, BaseHmsClient.OnConnectionFailedListener onConnectionFailedListener, BaseHmsClient.ConnectionCallbacks connectionCallbacks) {
        return new q(context, clientSettings, onConnectionFailedListener, connectionCallbacks);
    }
}
