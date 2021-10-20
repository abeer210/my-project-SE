package com.huawei.hms.support.api.a.b;

import android.content.Context;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.support.api.a.c.a.a;
import com.huawei.hms.support.api.a.c.b;
import com.huawei.hms.support.api.a.q;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import vigqyno.C0201;

/* compiled from: RemoveGeofencesTaskApiCall */
public class j extends b<q, Void> {
    public j(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0048 */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00af  */
    /* renamed from: a */
    public void doExecute(q qVar, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource<Void> taskCompletionSource) {
        String r11;
        String r0;
        int i;
        int i2;
        String str2;
        Context context;
        Throwable th;
        r11 = C0201.m82(5338);
        r0 = C0201.m82(5339);
        i = 10000;
        i2 = 1;
        try {
            b.b(r11, this.a, C0201.m82(5340));
            if (responseErrorCode != null) {
                com.huawei.hms.support.api.a.c.a.b.a().a(taskCompletionSource, responseErrorCode, null);
                HiAnalyticsClient.reportExit(qVar.getContext(), r0, getTransactionId(), 0, 0);
                return;
            }
            throw new ApiException(new Status(10000, a.a(10000)));
        } catch (ApiException e) {
            i = e.getStatusCode();
            String str3 = this.a;
            b.d(r11, str3, C0201.m82(5342) + e.getMessage());
            taskCompletionSource.setException(e);
            context = qVar.getContext();
            str2 = getTransactionId();
            if (i == 0) {
                i2 = 0;
            }
            HiAnalyticsClient.reportExit(context, r0, str2, i2, i);
        } catch (Exception unknown) {
            try {
                b.d(r11, this.a, C0201.m82(5341));
                try {
                    taskCompletionSource.setException(new ApiException(new Status(10000, a.a(10000))));
                    context = qVar.getContext();
                    str2 = getTransactionId();
                    HiAnalyticsClient.reportExit(context, r0, str2, i2, i);
                } catch (Throwable th2) {
                    th = th2;
                    Context context2 = qVar.getContext();
                    String transactionId = getTransactionId();
                    if (i == 0) {
                    }
                    HiAnalyticsClient.reportExit(context2, r0, transactionId, i2, i);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                i = 0;
                Context context22 = qVar.getContext();
                String transactionId2 = getTransactionId();
                if (i == 0) {
                    i2 = 0;
                }
                HiAnalyticsClient.reportExit(context22, r0, transactionId2, i2, i);
                throw th;
            }
        }
    }
}
