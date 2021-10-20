package com.huawei.hms.support.api.a.b;

import android.content.Context;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.support.api.a.a.c.a;
import com.huawei.hms.support.api.a.a.c.b;
import com.huawei.hms.support.api.a.o;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import vigqyno.C0201;

/* compiled from: RemoveLocationUpdatesTaskApiCall */
public class k extends b<o, Void> {
    private b b;

    public k(String str, String str2, String str3, b bVar, String str4) {
        super(str, str2, str3, str4);
        this.b = bVar;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x005d */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0091  */
    /* renamed from: a */
    public void doExecute(o oVar, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource<Void> taskCompletionSource) {
        String r10;
        String r0;
        Throwable th;
        r10 = C0201.m82(5322);
        r0 = C0201.m82(5323);
        int i = 1;
        int i2 = 10000;
        try {
            com.huawei.hms.support.api.a.c.b.b(r10, this.a, C0201.m82(5324));
            if (responseErrorCode != null) {
                if (responseErrorCode.getErrorCode() == 0 || responseErrorCode.getErrorCode() == 10104) {
                    a.a().c(this.b);
                }
                com.huawei.hms.support.api.a.c.a.b.a().a(taskCompletionSource, responseErrorCode, null);
                HiAnalyticsClient.reportExit(oVar.getContext(), r0, getTransactionId(), 0, 0);
                return;
            }
            throw new ApiException(new Status(10000, com.huawei.hms.support.api.a.c.a.a.a(10000)));
        } catch (Exception unknown) {
            try {
                com.huawei.hms.support.api.a.c.b.d(r10, this.a, C0201.m82(5325));
                taskCompletionSource.setException(new ApiException(new Status(10000, com.huawei.hms.support.api.a.c.a.a.a(10000))));
                HiAnalyticsClient.reportExit(oVar.getContext(), r0, getTransactionId(), 1, 10000);
            } catch (Throwable th2) {
                th = th2;
                Context context = oVar.getContext();
                String transactionId = getTransactionId();
                if (i2 == 0) {
                    i = 0;
                }
                HiAnalyticsClient.reportExit(context, r0, transactionId, i, i2);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            i2 = 0;
            Context context2 = oVar.getContext();
            String transactionId2 = getTransactionId();
            if (i2 == 0) {
            }
            HiAnalyticsClient.reportExit(context2, r0, transactionId2, i, i2);
            throw th;
        }
    }
}
