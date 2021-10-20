package com.huawei.hms.support.api.a.b;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.location.LocationAvailability;
import com.huawei.hms.location.LocationResult;
import com.huawei.hms.support.api.a.a.c.a;
import com.huawei.hms.support.api.a.a.c.b;
import com.huawei.hms.support.api.a.c.c;
import com.huawei.hms.support.api.a.o;
import com.huawei.hms.support.api.a.r;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import org.json.JSONObject;
import vigqyno.C0201;

/* compiled from: RequestLocationExUpdatesTaskApiCall */
public class n extends b<o, Void> {
    public static final String d = null;
    public static final String e = null;
    public static final String f = null;
    public static final String g = null;
    public static final String h = null;
    public static final String i = null;
    public static final String j = null;
    public static final String k = null;
    public static final String l = null;
    public static final String m = null;
    public static final String n = null;
    public static final String o = null;
    private b b;
    private Handler c;

    static {
        C0201.m83(n.class, 20);
    }

    public n(String str, String str2, String str3, b bVar, Looper looper, String str4) {
        super(str, str2, str3, str4);
        this.b = bVar;
        if (looper == null) {
            this.c = new Handler() {
                /* class com.huawei.hms.support.api.a.b.n.AnonymousClass1 */

                public void handleMessage(Message message) {
                    n.this.a(message);
                }
            };
        } else {
            this.c = new Handler(looper) {
                /* class com.huawei.hms.support.api.a.b.n.AnonymousClass2 */

                public void handleMessage(Message message) {
                    n.this.a(message);
                }
            };
        }
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getMinApkVersion() {
        return 40003318;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void a(Message message) {
        String r2 = C0201.m82(5729);
        com.huawei.hms.support.api.a.c.b.b(r2, this.a, C0201.m82(5728) + message.what);
        try {
            int i2 = message.what;
            if (i2 == 1) {
                this.b.d().onLocationResult((LocationResult) message.obj);
            } else if (i2 == 2) {
                this.b.d().onLocationAvailability((LocationAvailability) message.obj);
            }
        } catch (Exception unused) {
            com.huawei.hms.support.api.a.c.b.d(r2, this.a, C0201.m82(5730));
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x011c */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    public void doExecute(o oVar, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource<Void> taskCompletionSource) {
        String str2;
        int i2;
        String str3;
        int i3;
        boolean z;
        Throwable th;
        ApiException e2;
        Context context;
        String transactionId;
        String str4 = this.a;
        str2 = o;
        com.huawei.hms.support.api.a.c.b.b(str2, str4, i);
        i2 = 10000;
        str3 = h;
        i3 = 1;
        if (responseErrorCode != null) {
            try {
                if (responseErrorCode.getErrorCode() == 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    b bVar = (b) a.a().b(this.b);
                    this.b = bVar;
                    if (!(bVar == null || bVar.b() == null)) {
                        if (this.b.d() != null) {
                            if (jSONObject.has(d)) {
                                com.huawei.hms.support.api.a.c.b.b(str2, this.a, e);
                                LocationResult c2 = c.c(jSONObject);
                                int g2 = this.b.g();
                                int size = c2.getLocations().size();
                                String str5 = this.a;
                                com.huawei.hms.support.api.a.c.b.b(str2, str5, k + g2 + l + size);
                                if (g2 > 0) {
                                    if (g2 >= size) {
                                        if (g2 == size) {
                                            com.huawei.hms.support.api.a.a.a(oVar.getContext(), (r) null).a(this.b.d());
                                        }
                                        Message obtain = Message.obtain();
                                        obtain.what = 1;
                                        obtain.obj = c2;
                                        this.c.sendMessage(obtain);
                                        a.a().a(this.b, g2 - size);
                                        return;
                                    }
                                }
                                com.huawei.hms.support.api.a.a.a(oVar.getContext(), (r) null).a(this.b.d());
                                return;
                            } else if (jSONObject.has(n)) {
                                LocationAvailability a = c.a(str);
                                com.huawei.hms.support.api.a.c.b.b(str2, this.a, m);
                                Message obtain2 = Message.obtain();
                                obtain2.what = 2;
                                obtain2.obj = a;
                                this.c.sendMessage(obtain2);
                                return;
                            } else {
                                z = true;
                            }
                        }
                    }
                    com.huawei.hms.support.api.a.c.b.d(str2, this.a, f);
                    return;
                }
                z = false;
                try {
                    com.huawei.hms.support.api.a.c.a.b.a().a(taskCompletionSource, responseErrorCode, null);
                    if (z) {
                        HiAnalyticsClient.reportExit(oVar.getContext(), str3, getTransactionId(), 0, 0);
                    }
                } catch (ApiException e3) {
                    e2 = e3;
                    try {
                        i2 = e2.getStatusCode();
                        String str6 = this.a;
                        com.huawei.hms.support.api.a.c.b.d(str2, str6, j + e2.getMessage());
                        taskCompletionSource.setException(e2);
                        if (!z) {
                            context = oVar.getContext();
                            transactionId = getTransactionId();
                            if (i2 == 0) {
                                i3 = 0;
                            }
                            HiAnalyticsClient.reportExit(context, str3, transactionId, i3, i2);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        i2 = 0;
                        if (z) {
                        }
                        throw th;
                    }
                } catch (Exception unknown) {
                    try {
                        com.huawei.hms.support.api.a.c.b.d(str2, this.a, g);
                        taskCompletionSource.setException(new ApiException(new Status(10000, com.huawei.hms.support.api.a.c.a.a.a(10000))));
                        if (z) {
                            context = oVar.getContext();
                            transactionId = getTransactionId();
                            HiAnalyticsClient.reportExit(context, str3, transactionId, i3, i2);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (z) {
                        }
                        throw th;
                    }
                }
            } catch (ApiException e4) {
                e2 = e4;
                z = false;
                i2 = e2.getStatusCode();
                String str62 = this.a;
                com.huawei.hms.support.api.a.c.b.d(str2, str62, j + e2.getMessage());
                taskCompletionSource.setException(e2);
                if (!z) {
                }
            } catch (Exception unused) {
                z = false;
            } catch (Throwable th4) {
                th = th4;
                z = false;
                i2 = 0;
                if (z) {
                    Context context2 = oVar.getContext();
                    String transactionId2 = getTransactionId();
                    if (i2 == 0) {
                        i3 = 0;
                    }
                    HiAnalyticsClient.reportExit(context2, str3, transactionId2, i3, i2);
                }
                throw th;
            }
        } else {
            throw new ApiException(new Status(10000, com.huawei.hms.support.api.a.c.a.a.a(10000)));
        }
    }
}
