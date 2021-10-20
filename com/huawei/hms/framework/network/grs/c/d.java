package com.huawei.hms.framework.network.grs.c;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.a.a;
import com.huawei.hms.framework.network.grs.b.b;
import com.huawei.hms.framework.network.grs.c.b.c;
import com.huawei.hms.framework.network.grs.d.d;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import vigqyno.C0201;

public class d implements a {
    private static final String a = null;
    public static final String m = null;
    public static final String n = null;
    public static final String o = null;
    public static final String p = null;
    public static final String q = null;
    public static final String r = null;
    private GrsBaseInfo b;
    private Context c;
    private a d;
    private e e;
    private ArrayList<Future<e>> f = new ArrayList<>();
    private ArrayList<e> g = new ArrayList<>();
    private JSONArray h = new JSONArray();
    private ArrayList<String> i = new ArrayList<>();
    private ArrayList<String> j = new ArrayList<>();
    private c k;
    private long l = 1;

    static {
        C0201.m83(d.class, 64);
    }

    public d(GrsBaseInfo grsBaseInfo, Context context, a aVar) {
        this.b = grsBaseInfo;
        this.c = context;
        this.d = aVar;
        b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x008d A[LOOP:0: B:1:0x0005->B:36:0x008d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0085 A[SYNTHETIC] */
    private e a(ExecutorService executorService, ArrayList<String> arrayList, String str) {
        ExecutionException e2;
        InterruptedException e3;
        e eVar = null;
        int i2 = 0;
        while (true) {
            if (i2 >= arrayList.size()) {
                break;
            }
            String str2 = arrayList.get(i2);
            boolean z = true;
            if (!TextUtils.isEmpty(str2)) {
                Future<e> submit = executorService.submit(new b(str2, i2, this, this.c, str, this.b).f());
                this.f.add(submit);
                try {
                    e eVar2 = submit.get(this.l, TimeUnit.SECONDS);
                    if (eVar2 != null) {
                        try {
                            if (eVar2.m()) {
                                Logger.i(a, m);
                                eVar = eVar2;
                            }
                        } catch (CancellationException unused) {
                            eVar = eVar2;
                            Logger.i(a, o);
                            if (z) {
                            }
                        } catch (ExecutionException e4) {
                            e2 = e4;
                            eVar = eVar2;
                            Logger.w(a, q, e2);
                            z = false;
                            if (z) {
                            }
                        } catch (InterruptedException e5) {
                            e3 = e5;
                            eVar = eVar2;
                            Logger.w(a, p, e3);
                            if (z) {
                            }
                        } catch (TimeoutException unused2) {
                            eVar = eVar2;
                            Logger.w(a, n);
                            z = false;
                            if (z) {
                            }
                        }
                    }
                    z = false;
                    eVar = eVar2;
                } catch (CancellationException unused3) {
                    Logger.i(a, o);
                    if (z) {
                    }
                } catch (ExecutionException e6) {
                    e2 = e6;
                    Logger.w(a, q, e2);
                    z = false;
                    if (z) {
                    }
                } catch (InterruptedException e7) {
                    e3 = e7;
                    Logger.w(a, p, e3);
                    if (z) {
                    }
                } catch (TimeoutException unused4) {
                    Logger.w(a, n);
                    z = false;
                    if (z) {
                    }
                }
            } else {
                z = false;
            }
            if (z) {
                Logger.v(a, r);
                break;
            }
            i2++;
        }
        return b(eVar);
    }

    private e b(e eVar) {
        String str;
        String str2;
        Throwable e2;
        int size = this.f.size();
        for (int i2 = 0; i2 < size && (eVar == null || !eVar.m()); i2++) {
            try {
                eVar = this.f.get(i2).get(40000, TimeUnit.MILLISECONDS);
            } catch (CancellationException unused) {
                Logger.i(a, C0201.m82(20978));
            } catch (ExecutionException e3) {
                e2 = e3;
                str2 = a;
                str = C0201.m82(20977);
                Logger.w(str2, str, e2);
            } catch (InterruptedException e4) {
                e2 = e4;
                str2 = a;
                str = C0201.m82(20976);
                Logger.w(str2, str, e2);
            } catch (TimeoutException unused2) {
                Logger.w(a, C0201.m82(20975));
                if (!this.f.get(i2).isCancelled()) {
                    this.f.get(i2).cancel(true);
                }
            }
        }
        return eVar;
    }

    /* access modifiers changed from: private */
    public e b(ExecutorService executorService, String str) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        e a2 = a(executorService, this.j, str);
        int b2 = a2 == null ? 0 : a2.b();
        Logger.v(a, C0201.m82(20979), Integer.valueOf(b2));
        if (b2 == 404 || b2 == 401) {
            if (!TextUtils.isEmpty(c()) || !TextUtils.isEmpty(this.b.getAppName())) {
                this.f.clear();
                Logger.i(a, C0201.m82(20981));
                a2 = a(executorService, this.i, str);
            } else {
                Logger.i(a, C0201.m82(20980));
                return null;
            }
        }
        g.a(this.g, SystemClock.elapsedRealtime() - elapsedRealtime, this.h, this.c);
        return a2;
    }

    private void b() {
        c a2 = com.huawei.hms.framework.network.grs.c.a.a.a(this.c);
        if (a2 == null) {
            Logger.w(a, C0201.m82(20982));
            return;
        }
        a(a2);
        List<String> a3 = a2.a();
        if (a3 == null || a3.size() <= 0) {
            Logger.v(a, C0201.m82(20989));
        } else if (a3.size() <= 10) {
            String c2 = a2.c();
            String b2 = a2.b();
            if (a3.size() > 0) {
                for (String str : a3) {
                    if (!str.startsWith(C0201.m82(20983))) {
                        Logger.w(a, C0201.m82(20984));
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        Locale locale = Locale.ROOT;
                        Object[] objArr = new Object[1];
                        objArr[0] = TextUtils.isEmpty(c()) ? this.b.getAppName() : c();
                        sb.append(String.format(locale, c2, objArr));
                        String grsReqParamJoint = this.b.getGrsReqParamJoint(false, false, C0201.m82(20985), this.c);
                        boolean isEmpty = TextUtils.isEmpty(grsReqParamJoint);
                        String r9 = C0201.m82(20986);
                        if (!isEmpty) {
                            sb.append(r9);
                            sb.append(grsReqParamJoint);
                        }
                        this.i.add(sb.toString());
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(b2);
                        String grsReqParamJoint2 = this.b.getGrsReqParamJoint(false, false, c(), this.c);
                        if (!TextUtils.isEmpty(grsReqParamJoint2)) {
                            sb2.append(r9);
                            sb2.append(grsReqParamJoint2);
                        }
                        this.j.add(sb2.toString());
                    }
                }
            }
            Logger.v(a, C0201.m82(20987), this.i, this.j);
        } else {
            throw new IllegalArgumentException(C0201.m82(20988));
        }
    }

    private String c() {
        com.huawei.hms.framework.network.grs.local.model.a a2 = b.a(this.c.getPackageName(), this.b).a();
        if (a2 == null) {
            return C0201.m82(20991);
        }
        String a3 = a2.a();
        Logger.v(a, C0201.m82(20990), a3);
        return a3;
    }

    public c a() {
        return this.k;
    }

    public e a(ExecutorService executorService, String str) {
        String str2;
        Throwable e2;
        String str3;
        if (this.i == null || this.j == null) {
            return null;
        }
        try {
            c a2 = a();
            return (e) executorService.submit(new c(this, executorService, str)).get((long) (a2 != null ? a2.d() : 10), TimeUnit.SECONDS);
        } catch (CancellationException unused) {
            Logger.i(a, C0201.m82(20996));
            return null;
        } catch (ExecutionException e3) {
            e2 = e3;
            str2 = a;
            str3 = C0201.m82(20995);
            Logger.w(str2, str3, e2);
            return null;
        } catch (InterruptedException e4) {
            e2 = e4;
            str2 = a;
            str3 = C0201.m82(20994);
            Logger.w(str2, str3, e2);
            return null;
        } catch (TimeoutException unused2) {
            Logger.w(a, C0201.m82(20993));
            return null;
        } catch (Exception e5) {
            e2 = e5;
            str2 = a;
            str3 = C0201.m82(20992);
            Logger.w(str2, str3, e2);
            return null;
        }
    }

    public void a(c cVar) {
        this.k = cVar;
    }

    @Override // com.huawei.hms.framework.network.grs.c.a
    public synchronized void a(e eVar) {
        this.g.add(eVar);
        e eVar2 = this.e;
        if (eVar2 == null || !eVar2.m()) {
            if (eVar.l()) {
                Logger.i(a, C0201.m82(20998));
                com.huawei.hms.framework.network.grs.d.d.a(this.b.getGrsParasKey(false, true, this.c), new d.a(eVar.j(), SystemClock.elapsedRealtime()));
            } else if (!eVar.m()) {
                Logger.v(a, C0201.m82(20999));
            } else {
                this.e = eVar;
                this.d.a(this.b, eVar, this.c);
                for (int i2 = 0; i2 < this.f.size(); i2++) {
                    if (!this.i.get(i2).equals(eVar.k()) && !this.j.get(i2).equals(eVar.k()) && !this.f.get(i2).isCancelled()) {
                        Logger.i(a, C0201.m82(21000));
                        this.f.get(i2).cancel(true);
                    }
                }
            }
        } else {
            Logger.v(a, C0201.m82(20997));
        }
    }
}
