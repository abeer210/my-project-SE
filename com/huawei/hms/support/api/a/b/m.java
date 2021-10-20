package com.huawei.hms.support.api.a.b;

import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.support.api.a.a.a.c;
import com.huawei.hms.support.api.a.a.a.d;
import com.huawei.hms.support.api.a.c.a.a;
import com.huawei.hms.support.api.a.c.b;
import com.huawei.hms.support.api.a.n;
import com.huawei.hms.support.api.client.Status;
import vigqyno.C0201;

/* compiled from: RequestActivityUpdatesTaskApiCall */
public class m extends b<n, Void> {
    private c b;

    public m(String str, String str2, c cVar) {
        super(str, str2, cVar.a());
        this.b = cVar;
    }

    /* renamed from: a */
    public void doExecute(n nVar, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource<Void> taskCompletionSource) {
        String r4 = C0201.m82(5504);
        try {
            b.b(r4, this.a, C0201.m82(5505));
            if (responseErrorCode != null) {
                if (responseErrorCode.getErrorCode() == 0) {
                    d.a().a(this.b);
                }
                com.huawei.hms.support.api.a.c.a.b.a().a(taskCompletionSource, responseErrorCode, null);
                return;
            }
            throw new ApiException(new Status(10000, a.a(10000)));
        } catch (Exception unused) {
            b.d(r4, this.a, C0201.m82(5506));
            taskCompletionSource.setException(new ApiException(new Status(10000, a.a(10000))));
        }
    }
}
