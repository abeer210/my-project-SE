package com.huawei.hms.support.api.a.b;

import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.support.api.a.c.a.a;
import com.huawei.hms.support.api.a.c.b;
import com.huawei.hms.support.api.a.o;
import com.huawei.hms.support.api.client.Status;
import vigqyno.C0201;

/* compiled from: SetMockLocationTaskApiCall */
public class q extends b<o, Void> {
    public q(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    /* renamed from: a */
    public void doExecute(o oVar, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource<Void> taskCompletionSource) {
        String r3 = C0201.m82(5798);
        try {
            b.b(r3, this.a, C0201.m82(5799));
            com.huawei.hms.support.api.a.c.a.b.a().a(taskCompletionSource, responseErrorCode, null);
        } catch (Exception unused) {
            b.d(r3, this.a, C0201.m82(5800));
            taskCompletionSource.setException(new ApiException(new Status(10000, a.a(10000))));
        }
    }
}
