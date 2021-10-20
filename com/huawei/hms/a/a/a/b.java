package com.huawei.hms.a.a.a;

import android.content.Context;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.common.internal.ClientSettings;

/* compiled from: SmsRetrieverClientBuilder */
public class b extends AbstractClientBuilder<c, a> {
    /* renamed from: a */
    public c buildClient(Context context, ClientSettings clientSettings, BaseHmsClient.OnConnectionFailedListener onConnectionFailedListener, BaseHmsClient.ConnectionCallbacks connectionCallbacks) {
        return new c(context, clientSettings, onConnectionFailedListener, connectionCallbacks);
    }
}
