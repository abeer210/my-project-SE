package com.huawei.hms.support.api.a.b;

import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.support.api.a.a.a.a;
import com.huawei.hms.support.api.a.c.b;
import com.huawei.hms.support.api.a.n;
import com.huawei.hms.support.api.client.Status;
import vigqyno.C0201;

/* compiled from: RequestActivityTransitionUpdatesTaskApiCall */
public class l extends b<n, Void> {
    private a b;

    public l(String str, String str2, a aVar) {
        super(str, str2, aVar.a());
        this.b = aVar;
    }

    /* renamed from: a */
    public void doExecute(n nVar, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource<Void> taskCompletionSource) {
        String r4 = C0201.m82(5523);
        try {
            b.b(r4, this.a, C0201.m82(5524));
            if (responseErrorCode != null) {
                if (responseErrorCode.getErrorCode() == 0) {
                    com.huawei.hms.support.api.a.a.a.b.a().a(this.b);
                }
                com.huawei.hms.support.api.a.c.a.b.a().a(taskCompletionSource, responseErrorCode, null);
                return;
            }
            throw new ApiException(new Status(10000, com.huawei.hms.support.api.a.c.a.a.a(10000)));
        } catch (Exception unused) {
            b.d(r4, this.a, C0201.m82(5525));
            taskCompletionSource.setException(new ApiException(new Status(10000, com.huawei.hms.support.api.a.c.a.a.a(10000))));
        }
    }
}
