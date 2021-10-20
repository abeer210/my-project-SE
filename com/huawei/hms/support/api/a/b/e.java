package com.huawei.hms.support.api.a.b;

import android.content.Context;
import android.location.Location;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.location.HWLocation;
import com.huawei.hms.support.api.a.c.a.a;
import com.huawei.hms.support.api.a.c.b;
import com.huawei.hms.support.api.a.c.c;
import com.huawei.hms.support.api.a.o;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import org.json.JSONObject;
import vigqyno.C0201;

/* compiled from: GetLastLocationTaskApiCall */
public class e extends b<o, Location> {
    public e(String str, String str2, String str3, String str4) {
        super(str, str2, str3, str4);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0069 */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d3  */
    /* renamed from: a */
    public void doExecute(o oVar, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource<Location> taskCompletionSource) {
        String r0;
        String r1;
        int i;
        int i2;
        Throwable th;
        ApiException e;
        Context context;
        String transactionId;
        int i3;
        r0 = C0201.m82(4824);
        r1 = C0201.m82(4825);
        i = 10000;
        i2 = 1;
        try {
            b.b(r0, this.a, C0201.m82(4826));
            if (responseErrorCode != null) {
                i3 = responseErrorCode.getErrorCode();
                HWLocation hWLocation = null;
                try {
                    if (responseErrorCode.getErrorCode() == 0) {
                        hWLocation = c.a(new JSONObject(str));
                    }
                    com.huawei.hms.support.api.a.c.a.b.a().a(taskCompletionSource, responseErrorCode, c.a(hWLocation));
                    Context context2 = oVar.getContext();
                    String transactionId2 = getTransactionId();
                    if (i3 == 0) {
                        i2 = 0;
                    }
                    HiAnalyticsClient.reportExit(context2, r1, transactionId2, i2, i3);
                } catch (ApiException e2) {
                    e = e2;
                    i = e.getStatusCode();
                    String str2 = this.a;
                    b.d(r0, str2, C0201.m82(4828) + e.getMessage());
                    taskCompletionSource.setException(e);
                    context = oVar.getContext();
                    transactionId = getTransactionId();
                    if (i == 0) {
                        i2 = 0;
                    }
                    HiAnalyticsClient.reportExit(context, r1, transactionId, i2, i);
                } catch (Exception unknown) {
                    try {
                        b.d(r0, this.a, C0201.m82(4827));
                        try {
                            taskCompletionSource.setException(new ApiException(new Status(10000, a.a(10000))));
                            context = oVar.getContext();
                            transactionId = getTransactionId();
                            HiAnalyticsClient.reportExit(context, r1, transactionId, i2, i);
                        } catch (Throwable th2) {
                            th = th2;
                            Context context3 = oVar.getContext();
                            String transactionId3 = getTransactionId();
                            if (i == 0) {
                            }
                            HiAnalyticsClient.reportExit(context3, r1, transactionId3, i2, i);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        i = i3;
                        Context context32 = oVar.getContext();
                        String transactionId32 = getTransactionId();
                        if (i == 0) {
                            i2 = 0;
                        }
                        HiAnalyticsClient.reportExit(context32, r1, transactionId32, i2, i);
                        throw th;
                    }
                }
            } else {
                throw new ApiException(new Status(10000, a.a(10000)));
            }
        } catch (ApiException e3) {
            e = e3;
            i = e.getStatusCode();
            String str22 = this.a;
            b.d(r0, str22, C0201.m82(4828) + e.getMessage());
            taskCompletionSource.setException(e);
            context = oVar.getContext();
            transactionId = getTransactionId();
            if (i == 0) {
            }
            HiAnalyticsClient.reportExit(context, r1, transactionId, i2, i);
        } catch (Exception unused) {
            i3 = 0;
        } catch (Throwable th4) {
            th = th4;
            i = 0;
            Context context322 = oVar.getContext();
            String transactionId322 = getTransactionId();
            if (i == 0) {
            }
            HiAnalyticsClient.reportExit(context322, r1, transactionId322, i2, i);
            throw th;
        }
    }
}
