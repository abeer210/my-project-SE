package com.huawei.hms.support.api.a.b;

import android.content.Context;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.support.api.a.a.c.a;
import com.huawei.hms.support.api.a.a.c.b;
import com.huawei.hms.support.api.a.c.c;
import com.huawei.hms.support.api.a.o;
import com.huawei.hms.support.api.a.r;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import org.json.JSONObject;
import vigqyno.C0201;

/* compiled from: RequestLocationUpdatesWithIntentTaskApiCall */
public class p extends b<o, Void> {
    private b b;

    public p(String str, String str2, String str3, b bVar, String str4) {
        super(str, str2, str3, str4);
        this.b = bVar;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x012c */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    public void doExecute(o oVar, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource<Void> taskCompletionSource) {
        String r2;
        int i;
        int i2;
        String r4;
        boolean z;
        Throwable th;
        ApiException e;
        Context context;
        String transactionId;
        String r0 = C0201.m82(5824);
        String str2 = this.a;
        r2 = C0201.m82(5825);
        com.huawei.hms.support.api.a.c.b.b(r2, str2, C0201.m82(5826));
        i = 10000;
        i2 = 1;
        r4 = C0201.m82(5827);
        if (responseErrorCode != null) {
            try {
                if (responseErrorCode.getErrorCode() == 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    b bVar = (b) a.a().b(this.b);
                    this.b = bVar;
                    if (bVar != null) {
                        if (bVar.b() != null) {
                            if (jSONObject.has(r0)) {
                                int size = c.c(jSONObject).getLocations().size();
                                int g = this.b.g();
                                String str3 = this.a;
                                com.huawei.hms.support.api.a.c.b.b(r2, str3, C0201.m82(5828) + g + C0201.m82(5829) + size);
                                if (g > 0) {
                                    if (g >= size) {
                                        if (g == size) {
                                            com.huawei.hms.support.api.a.c.b.b(r2, this.a, C0201.m82(5830));
                                            com.huawei.hms.support.api.a.a.a(oVar.getContext(), (r) null).a(this.b.c());
                                        }
                                        a.a().a(this.b, g - size);
                                        return;
                                    }
                                }
                                com.huawei.hms.support.api.a.c.b.b(r2, this.a, C0201.m82(5831));
                                com.huawei.hms.support.api.a.a.a(oVar.getContext(), (r) null).a(this.b.c());
                                return;
                            } else if (!jSONObject.has(r0) && !jSONObject.has(C0201.m82(5832))) {
                                z = true;
                                com.huawei.hms.support.api.a.c.a.b.a().a(taskCompletionSource, responseErrorCode, null);
                                if (!z) {
                                    HiAnalyticsClient.reportExit(oVar.getContext(), r4, getTransactionId(), 0, 0);
                                    return;
                                }
                                return;
                            }
                        }
                    }
                    com.huawei.hms.support.api.a.c.b.d(r2, this.a, C0201.m82(5833));
                    return;
                }
                z = false;
                try {
                    com.huawei.hms.support.api.a.c.a.b.a().a(taskCompletionSource, responseErrorCode, null);
                    if (!z) {
                    }
                } catch (ApiException e2) {
                    e = e2;
                    try {
                        i = e.getStatusCode();
                        String str4 = this.a;
                        com.huawei.hms.support.api.a.c.b.d(r2, str4, C0201.m82(5835) + e.getMessage());
                        taskCompletionSource.setException(e);
                        if (!z) {
                            context = oVar.getContext();
                            transactionId = getTransactionId();
                            if (i == 0) {
                                i2 = 0;
                            }
                            HiAnalyticsClient.reportExit(context, r4, transactionId, i2, i);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        i = 0;
                        if (z) {
                        }
                        throw th;
                    }
                } catch (Exception unknown) {
                    try {
                        com.huawei.hms.support.api.a.c.b.d(r2, this.a, C0201.m82(5834));
                        taskCompletionSource.setException(new ApiException(new Status(10000, com.huawei.hms.support.api.a.c.a.a.a(10000))));
                        if (z) {
                            context = oVar.getContext();
                            transactionId = getTransactionId();
                            HiAnalyticsClient.reportExit(context, r4, transactionId, i2, i);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (z) {
                        }
                        throw th;
                    }
                }
            } catch (ApiException e3) {
                e = e3;
                z = false;
                i = e.getStatusCode();
                String str42 = this.a;
                com.huawei.hms.support.api.a.c.b.d(r2, str42, C0201.m82(5835) + e.getMessage());
                taskCompletionSource.setException(e);
                if (!z) {
                }
            } catch (Exception unused) {
                z = false;
            } catch (Throwable th4) {
                th = th4;
                z = false;
                i = 0;
                if (z) {
                    Context context2 = oVar.getContext();
                    String transactionId2 = getTransactionId();
                    if (i == 0) {
                        i2 = 0;
                    }
                    HiAnalyticsClient.reportExit(context2, r4, transactionId2, i2, i);
                }
                throw th;
            }
        } else {
            throw new ApiException(new Status(10000, com.huawei.hms.support.api.a.c.a.a.a(10000)));
        }
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getMinApkVersion() {
        return 40000000;
    }
}
