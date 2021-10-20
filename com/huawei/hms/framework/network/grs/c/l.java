package com.huawei.hms.framework.network.grs.c;

import android.content.Context;
import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.NetworkUtil;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.a.a;
import com.huawei.hms.framework.network.grs.c.b.b;
import com.huawei.hms.framework.network.grs.d.d;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import vigqyno.C0201;

public class l {
    private ExecutorService a = ExecutorsUtils.newCachedThreadPool(C0201.m82(18942));
    private Map<String, b> b = new ConcurrentHashMap(16);
    private final Object c = new Object();
    private a d;

    /* access modifiers changed from: private */
    public void a(e eVar, com.huawei.hms.framework.network.grs.b bVar) {
        if (bVar != null) {
            String r0 = C0201.m82(18943);
            if (eVar == null) {
                Logger.v(r0, C0201.m82(18944));
                bVar.a();
                return;
            }
            Logger.v(r0, C0201.m82(18945));
            bVar.a(eVar);
        }
    }

    public e a(GrsBaseInfo grsBaseInfo, Context context, String str) {
        Future<e> future;
        String str2;
        String str3;
        Throwable e;
        Logger.d(C0201.m82(18947), C0201.m82(18946) + str);
        String grsParasKey = grsBaseInfo.getGrsParasKey(false, true, context);
        synchronized (this.c) {
            if (!NetworkUtil.isNetworkAvailable(context)) {
                return null;
            }
            d.a a2 = d.a(grsParasKey);
            b bVar = this.b.get(grsParasKey);
            if (bVar != null) {
                if (bVar.b()) {
                    future = bVar.a();
                    return future.get();
                }
            }
            if (a2 != null) {
                if (a2.a()) {
                    return null;
                }
            }
            Logger.d(C0201.m82(18948), C0201.m82(18949));
            future = this.a.submit(new j(this, grsBaseInfo, context, str));
            this.b.put(grsParasKey, new b(future));
            try {
                return future.get();
            } catch (CancellationException e2) {
                e = e2;
                str3 = C0201.m82(18954);
                str2 = C0201.m82(18955);
                Logger.w(str3, str2, e);
                return null;
            } catch (ExecutionException e3) {
                e = e3;
                str3 = C0201.m82(18952);
                str2 = C0201.m82(18953);
                Logger.w(str3, str2, e);
                return null;
            } catch (InterruptedException e4) {
                e = e4;
                str3 = C0201.m82(18950);
                str2 = C0201.m82(18951);
                Logger.w(str3, str2, e);
                return null;
            }
        }
    }

    public void a(GrsBaseInfo grsBaseInfo, Context context, com.huawei.hms.framework.network.grs.b bVar, String str) {
        this.a.execute(new k(this, grsBaseInfo, context, str, bVar));
    }

    public void a(a aVar) {
        this.d = aVar;
    }

    public void a(String str) {
        synchronized (this.c) {
            this.b.remove(str);
        }
    }
}
