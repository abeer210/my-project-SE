package com.huawei.hms.api;

import android.os.Bundle;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.RequestHeader;
import com.huawei.hms.core.aidl.a;
import com.huawei.hms.core.aidl.b;
import com.huawei.hms.core.aidl.c;
import com.huawei.hms.core.aidl.e;
import com.huawei.hms.support.api.client.AidlApiClient;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.transport.DatagramTransport;
import com.huawei.hms.support.log.HMSLog;
import vigqyno.C0201;

public class IPCTransport implements DatagramTransport {
    private final String a;
    private final IMessageEntity b;
    private final Class<? extends IMessageEntity> c;
    private int d;

    public IPCTransport(String str, IMessageEntity iMessageEntity, Class<? extends IMessageEntity> cls) {
        this.a = str;
        this.b = iMessageEntity;
        this.c = cls;
    }

    private int a(ApiClient apiClient, c cVar) {
        boolean z = apiClient instanceof HuaweiApiClientImpl;
        String r2 = C0201.m82(9934);
        String r3 = C0201.m82(9935);
        if (z) {
            b bVar = new b(this.a, ProtocolNegotiate.getInstance().getVersion());
            e a2 = a.a(bVar.c());
            bVar.a(a2.a(this.b, new Bundle()));
            RequestHeader requestHeader = new RequestHeader();
            requestHeader.setAppID(apiClient.getAppID());
            requestHeader.setPackageName(apiClient.getPackageName());
            requestHeader.setSdkVersion(50004301);
            requestHeader.setApiNameList(((HuaweiApiClientImpl) apiClient).getApiNameList());
            requestHeader.setSessionId(apiClient.getSessionId());
            requestHeader.setApiLevel(this.d);
            bVar.b = a2.a(requestHeader, new Bundle());
            try {
                HuaweiApiClientImpl huaweiApiClientImpl = (HuaweiApiClientImpl) apiClient;
                if (huaweiApiClientImpl.getService() == null) {
                    HMSLog.e(r3, C0201.m82(9936));
                    return 907135001;
                }
                huaweiApiClientImpl.getService().a(bVar, cVar);
                return 0;
            } catch (Exception e) {
                HMSLog.e(r3, r2 + e);
                return 907135001;
            }
        } else {
            if (apiClient instanceof AidlApiClient) {
                AidlApiClient aidlApiClient = (AidlApiClient) apiClient;
                b bVar2 = new b(this.a, ProtocolNegotiate.getInstance().getVersion());
                bVar2.a(a.a(bVar2.c()).a(this.b, new Bundle()));
                try {
                    aidlApiClient.getService().a(bVar2, cVar);
                    return 0;
                } catch (Exception e2) {
                    HMSLog.e(r3, r2 + e2);
                }
            }
            return 907135001;
        }
    }

    @Override // com.huawei.hms.support.api.transport.DatagramTransport
    public final void post(ApiClient apiClient, DatagramTransport.CallBack callBack) {
        send(apiClient, callBack);
    }

    @Override // com.huawei.hms.support.api.transport.DatagramTransport
    public final void send(ApiClient apiClient, DatagramTransport.CallBack callBack) {
        int a2 = a(apiClient, new IPCCallback(this.c, callBack));
        if (a2 != 0) {
            callBack.onCallback(a2, null);
        }
    }

    public IPCTransport(String str, IMessageEntity iMessageEntity, Class<? extends IMessageEntity> cls, int i) {
        this.a = str;
        this.b = iMessageEntity;
        this.c = cls;
        this.d = i;
    }
}
