package com.huawei.hms.support.api.a.b;

import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.support.api.a.a.a.a;
import com.huawei.hms.support.api.a.a.a.b;
import com.huawei.hms.support.api.a.n;
import com.huawei.hms.support.api.client.Status;
import vigqyno.C0201;

/* compiled from: RemoveActivityTransitionUpdatesTaskApiCall */
public class h extends b<n, Void> {
    private a b;

    public h(String str, String str2, a aVar) {
        super(str, str2, aVar.a());
        this.b = aVar;
    }

    /* renamed from: a */
    public void doExecute(n nVar, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource<Void> taskCompletionSource) {
        String r4 = C0201.m82(5218);
        if (responseErrorCode != null) {
            try {
                if (responseErrorCode.getErrorCode() == 0) {
                    b.a().c(this.b);
                }
                com.huawei.hms.support.api.a.c.b.b(r4, this.a, C0201.m82(5219));
                com.huawei.hms.support.api.a.c.a.b.a().a(taskCompletionSource, responseErrorCode, null);
            } catch (Exception unused) {
                com.huawei.hms.support.api.a.c.b.d(r4, this.a, C0201.m82(5220));
                taskCompletionSource.setException(new ApiException(new Status(10000, com.huawei.hms.support.api.a.c.a.a.a(10000))));
            }
        } else {
            throw new ApiException(new Status(10000, com.huawei.hms.support.api.a.c.a.a.a(10000)));
        }
    }
}
