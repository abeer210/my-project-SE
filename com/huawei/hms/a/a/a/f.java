package com.huawei.hms.a.a.a;

import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;

/* compiled from: SmsRetrieverTaskApiCall */
public class f extends TaskApiCall<c, Void> {
    public f(String str, String str2) {
        super(str, str2);
    }

    /* renamed from: a */
    public void doExecute(c cVar, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource<Void> taskCompletionSource) {
        e b = e.b(str);
        Integer a = b.a();
        String b2 = b.b();
        if (a == null) {
            a = Integer.valueOf(responseErrorCode.getErrorCode());
            b2 = responseErrorCode.getErrorReason();
        }
        if (a(responseErrorCode, b.a())) {
            taskCompletionSource.setResult(null);
        } else {
            taskCompletionSource.setException(new ApiException(new Status(a.intValue(), b2)));
        }
    }

    private boolean a(ResponseErrorCode responseErrorCode, Integer num) {
        if (num == null) {
            return responseErrorCode.getStatusCode() == 0;
        }
        if (num.intValue() == 0) {
            return true;
        }
        return false;
    }
}
