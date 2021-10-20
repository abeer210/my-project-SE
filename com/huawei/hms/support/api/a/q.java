package com.huawei.hms.support.api.a;

import android.content.Context;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.common.internal.ClientSettings;
import com.huawei.hms.common.internal.HmsClient;
import vigqyno.C0201;

/* compiled from: LocationHmsGeofenceClient */
public class q extends HmsClient {
    public q(Context context, ClientSettings clientSettings, BaseHmsClient.OnConnectionFailedListener onConnectionFailedListener, BaseHmsClient.ConnectionCallbacks connectionCallbacks) {
        super(context, clientSettings, onConnectionFailedListener, connectionCallbacks);
    }

    @Override // com.huawei.hms.common.internal.BaseHmsClient
    public int getMinApkVersion() {
        return 40000210;
    }

    @Override // com.huawei.hms.common.internal.BaseHmsClient
    public String getServiceAction() {
        return C0201.m82(35266);
    }
}
