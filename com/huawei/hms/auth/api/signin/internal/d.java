package com.huawei.hms.auth.api.signin.internal;

import android.text.TextUtils;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.auth.api.signin.internal.c.a;
import com.huawei.hms.auth.api.signin.internal.c.b;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.hwid.RevokeAccessResult;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import com.huawei.hms.support.log.HMSLog;
import vigqyno.C0201;

/* compiled from: HuaweiIdRevokeAccessTaskApiCall */
public class d extends TaskApiCall<b, Void> {
    public d(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    /* renamed from: a */
    public void doExecute(b bVar, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource<Void> taskCompletionSource) {
        int i;
        HMSLog.i(C0201.m82(31152), C0201.m82(31153));
        i.a();
        if (!TextUtils.isEmpty(str)) {
            RevokeAccessResult beanFromJsonStr = new RevokeAccessResult().getBeanFromJsonStr(str);
            if (beanFromJsonStr.getErrorCode() != null) {
                i = beanFromJsonStr.getErrorCode().intValue();
                taskCompletionSource.setException(new ApiException(new Status(beanFromJsonStr.getErrorCode().intValue(), beanFromJsonStr.getErrorMsg())));
            } else {
                taskCompletionSource.setResult(null);
                i = 0;
            }
        } else {
            i = responseErrorCode.getErrorCode();
            taskCompletionSource.setException(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
        }
        HiAnalyticsClient.reportExit(bVar.getContext(), C0201.m82(31154), getTransactionId(), b.a(i), i, a.a());
    }
}
