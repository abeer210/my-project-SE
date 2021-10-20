package com.huawei.hms.support.api.a.c.a;

import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.log.HMSLog;
import vigqyno.C0201;

/* compiled from: ServiceErrorCodeAdaptor */
public class b<TResult> {
    private static final byte[] a = new byte[0];
    private static volatile b b;

    public static b a() {
        if (b == null) {
            synchronized (a) {
                if (b == null) {
                    b = new b();
                }
            }
        }
        return b;
    }

    public void a(TaskCompletionSource<TResult> taskCompletionSource, ResponseErrorCode responseErrorCode, TResult tresult) throws Exception {
        int i = 10000;
        if (taskCompletionSource == null || responseErrorCode == null) {
            throw new ApiException(new Status(10000, a.a(10000)));
        }
        int errorCode = responseErrorCode.getErrorCode();
        String errorReason = responseErrorCode.getErrorReason();
        HMSLog.i(C0201.m82(33340), C0201.m82(33338) + responseErrorCode.getErrorCode() + C0201.m82(33339) + responseErrorCode.getErrorReason());
        if (responseErrorCode.getErrorCode() < 10000 || responseErrorCode.getErrorCode() > 10099) {
            i = errorCode;
        } else {
            errorReason = a.a(10000);
        }
        if (i == 0) {
            taskCompletionSource.setResult(tresult);
        } else {
            taskCompletionSource.setException(new ApiException(new Status(i, errorReason)));
        }
    }
}
