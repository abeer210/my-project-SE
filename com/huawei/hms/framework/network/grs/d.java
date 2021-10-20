package com.huawei.hms.framework.network.grs;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.a.a;
import com.huawei.hms.framework.network.grs.a.c;
import com.huawei.hms.framework.network.grs.c.l;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import vigqyno.C0201;

public class d {
    private static final String a = null;
    private static ExecutorService b = ExecutorsUtils.newCachedThreadPool(C0201.m82(14248));
    private GrsBaseInfo c;
    private boolean d = false;
    private final Object e = new Object();
    private Context f;
    private l g;
    private a h;
    private c i;
    private a j;
    private Future<Boolean> k;

    static {
        C0201.m83(d.class, 548);
    }

    public d(Context context, GrsBaseInfo grsBaseInfo) {
        this.f = context.getApplicationContext();
        a(grsBaseInfo);
        if (!this.d) {
            synchronized (this.e) {
                if (!this.d) {
                    GrsBaseInfo grsBaseInfo2 = this.c;
                    this.k = b.submit(new c(this, this.f, grsBaseInfo2));
                }
            }
        }
    }

    public d(GrsBaseInfo grsBaseInfo) {
        a(grsBaseInfo);
    }

    private void a(GrsBaseInfo grsBaseInfo) {
        try {
            this.c = grsBaseInfo.clone();
        } catch (CloneNotSupportedException e2) {
            Logger.w(a, C0201.m82(14249), e2);
            this.c = grsBaseInfo.copy();
        }
    }

    /* access modifiers changed from: private */
    public void a(Map<String, ?> map) {
        if (map == null || map.isEmpty()) {
            Logger.v(a, C0201.m82(14255));
            return;
        }
        for (String str : map.keySet()) {
            if (str.endsWith(C0201.m82(14250))) {
                String a2 = this.i.a(str, C0201.m82(14251));
                long j2 = 0;
                if (!TextUtils.isEmpty(a2) && a2.matches(C0201.m82(14252))) {
                    try {
                        j2 = Long.parseLong(a2);
                    } catch (NumberFormatException e2) {
                        Logger.w(a, C0201.m82(14253), e2);
                    }
                }
                if (!a(j2)) {
                    Logger.i(a, C0201.m82(14254));
                    this.i.a(str.substring(0, str.length() - 4));
                    this.i.a(str);
                }
            }
        }
    }

    private boolean a(long j2) {
        return System.currentTimeMillis() - j2 <= 604800000;
    }

    private boolean c() {
        try {
            if (this.k != null) {
                return this.k.get(10, TimeUnit.SECONDS).booleanValue();
            }
            return false;
        } catch (CancellationException unused) {
            Logger.i(a, C0201.m82(14260));
            return false;
        } catch (ExecutionException e2) {
            Logger.w(a, C0201.m82(14259), e2);
            return false;
        } catch (InterruptedException e3) {
            Logger.w(a, C0201.m82(14258), e3);
            return false;
        } catch (TimeoutException unused2) {
            Logger.w(a, C0201.m82(14257));
            return false;
        } catch (Exception e4) {
            Logger.w(a, C0201.m82(14256), e4);
            return false;
        }
    }

    public String a(String str, String str2) {
        if (this.c == null || str == null || str2 == null) {
            Logger.w(a, C0201.m82(14261));
            return null;
        } else if (c()) {
            return this.j.a(str, str2, this.f);
        } else {
            return null;
        }
    }

    public Map<String, String> a(String str) {
        if (this.c != null && str != null) {
            return c() ? this.j.a(str, this.f) : new HashMap();
        }
        Logger.w(a, C0201.m82(14262));
        return new HashMap();
    }

    public void a() {
        if (c()) {
            String grsParasKey = this.c.getGrsParasKey(false, true, this.f);
            this.i.a(grsParasKey);
            c cVar = this.i;
            cVar.a(grsParasKey + C0201.m82(14263));
            this.g.a(grsParasKey);
        }
    }

    public void a(String str, IQueryUrlsCallBack iQueryUrlsCallBack) {
        if (iQueryUrlsCallBack == null) {
            Logger.w(a, C0201.m82(14264));
        } else if (this.c == null || str == null) {
            iQueryUrlsCallBack.onCallBackFail(-6);
        } else if (c()) {
            this.j.a(str, iQueryUrlsCallBack, this.f);
        }
    }

    public void a(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack) {
        if (iQueryUrlCallBack == null) {
            Logger.w(a, C0201.m82(14265));
        } else if (this.c == null || str == null || str2 == null) {
            iQueryUrlCallBack.onCallBackFail(-6);
        } else if (c()) {
            this.j.a(str, str2, iQueryUrlCallBack, this.f);
        }
    }

    public boolean a(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass() || !(obj instanceof d)) {
            return false;
        }
        return this.c.compare(((d) obj).c);
    }

    public boolean b() {
        GrsBaseInfo grsBaseInfo;
        Context context;
        if (!c() || (grsBaseInfo = this.c) == null || (context = this.f) == null) {
            return false;
        }
        this.h.a(grsBaseInfo, context);
        return true;
    }
}
