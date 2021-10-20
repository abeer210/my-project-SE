package com.huawei.hms.support.api.core;

import android.text.TextUtils;
import com.huawei.hms.support.api.PendingResultImpl;
import com.huawei.hms.support.api.ResolvePendingResult;
import com.huawei.hms.support.api.ResolveResult;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.InnerPendingResult;
import com.huawei.hms.support.api.client.PendingResult;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.core.CheckConnectInfo;
import com.huawei.hms.support.api.entity.core.CheckConnectResp;
import com.huawei.hms.support.api.entity.core.ConnectInfo;
import com.huawei.hms.support.api.entity.core.ConnectResp;
import com.huawei.hms.support.api.entity.core.DisconnectInfo;
import com.huawei.hms.support.api.entity.core.DisconnectResp;
import com.huawei.hms.support.api.entity.core.JosGetNoticeReq;
import com.huawei.hms.support.api.entity.core.JosGetNoticeResp;
import com.huawei.hms.support.log.HMSLog;
import vigqyno.C0201;

public final class ConnectService {
    private static final String TAG = null;

    static {
        C0201.m83(ConnectService.class, 630);
    }

    private ConnectService() {
    }

    public static InnerPendingResult<ResolveResult<CheckConnectResp>> checkconnect(ApiClient apiClient, CheckConnectInfo checkConnectInfo) {
        return ResolvePendingResult.build(apiClient, C0201.m82(1086), checkConnectInfo, CheckConnectResp.class);
    }

    public static PendingResult<ResolveResult<ConnectResp>> connect(ApiClient apiClient, ConnectInfo connectInfo) {
        return new PendingResultImpl<ResolveResult<ConnectResp>, ConnectResp>(apiClient, C0201.m82(1087), connectInfo) {
            /* class com.huawei.hms.support.api.core.ConnectService.AnonymousClass1 */

            @Override // com.huawei.hms.support.api.PendingResultImpl
            public boolean checkApiClient(ApiClient apiClient) {
                return apiClient != null;
            }

            public ResolveResult<ConnectResp> onComplete(ConnectResp connectResp) {
                ResolveResult<ConnectResp> resolveResult = new ResolveResult<>(connectResp);
                resolveResult.setStatus(Status.SUCCESS);
                HMSLog.d(C0201.m82(8515), C0201.m82(8516));
                return resolveResult;
            }
        };
    }

    public static ResolvePendingResult<DisconnectResp> disconnect(ApiClient apiClient, DisconnectInfo disconnectInfo) {
        return ResolvePendingResult.build(apiClient, C0201.m82(1088), disconnectInfo, DisconnectResp.class);
    }

    public static PendingResult<ResolveResult<ConnectResp>> forceConnect(ApiClient apiClient, ConnectInfo connectInfo) {
        return new PendingResultImpl<ResolveResult<ConnectResp>, ConnectResp>(apiClient, C0201.m82(1089), connectInfo) {
            /* class com.huawei.hms.support.api.core.ConnectService.AnonymousClass2 */

            @Override // com.huawei.hms.support.api.PendingResultImpl
            public boolean checkApiClient(ApiClient apiClient) {
                return apiClient != null;
            }

            public ResolveResult<ConnectResp> onComplete(ConnectResp connectResp) {
                ResolveResult<ConnectResp> resolveResult = new ResolveResult<>(connectResp);
                resolveResult.setStatus(Status.SUCCESS);
                HMSLog.d(C0201.m82(8447), C0201.m82(8448));
                return resolveResult;
            }
        };
    }

    public static PendingResult<ResolveResult<JosGetNoticeResp>> getNotice(ApiClient apiClient, int i, String str) {
        JosGetNoticeReq josGetNoticeReq = new JosGetNoticeReq();
        josGetNoticeReq.setNoticeType(i);
        josGetNoticeReq.setHmsSdkVersionName(str);
        if (!TextUtils.isEmpty(apiClient.getCpID())) {
            josGetNoticeReq.setCpID(apiClient.getCpID());
        }
        return new PendingResultImpl<ResolveResult<JosGetNoticeResp>, JosGetNoticeResp>(apiClient, C0201.m82(1090), josGetNoticeReq) {
            /* class com.huawei.hms.support.api.core.ConnectService.AnonymousClass3 */

            public ResolveResult<JosGetNoticeResp> onComplete(JosGetNoticeResp josGetNoticeResp) {
                String r0 = C0201.m82(8269);
                if (josGetNoticeResp == null) {
                    HMSLog.e(r0, C0201.m82(8270));
                    return null;
                }
                HMSLog.i(r0, C0201.m82(8271) + josGetNoticeResp.getStatusCode());
                ResolveResult<JosGetNoticeResp> resolveResult = new ResolveResult<>(josGetNoticeResp);
                resolveResult.setStatus(Status.SUCCESS);
                return resolveResult;
            }
        };
    }
}
