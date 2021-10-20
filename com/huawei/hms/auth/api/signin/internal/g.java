package com.huawei.hms.auth.api.signin.internal;

import android.text.TextUtils;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.hwid.SignOutResult;
import com.huawei.hms.support.log.HMSLog;
import org.json.JSONException;
import vigqyno.C0201;

/* compiled from: HuaweiIdSignOutTaskApiCall */
public class g extends TaskApiCall<b, Void> {
    public g(String str, String str2) {
        super(str, str2);
    }

    /* renamed from: a */
    public void doExecute(b bVar, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource<Void> taskCompletionSource) {
        a(responseErrorCode, str);
        if (!TextUtils.isEmpty(str)) {
            try {
                SignOutResult fromJson = new SignOutResult().fromJson(str);
                if (fromJson.isSuccess()) {
                    taskCompletionSource.setResult(null);
                } else {
                    taskCompletionSource.setException(new ApiException(fromJson.getStatus()));
                }
            } catch (JSONException unused) {
                taskCompletionSource.setException(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
            }
        } else {
            taskCompletionSource.setException(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
        }
    }

    private void a(ResponseErrorCode responseErrorCode, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(C0201.m82(31371) + responseErrorCode.getErrorCode());
        if (str == null) {
            str = C0201.m82(31372);
        }
        sb.append(C0201.m82(31373) + str);
        HMSLog.i(C0201.m82(31374), sb.toString());
    }
}
