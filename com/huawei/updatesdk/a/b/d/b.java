package com.huawei.updatesdk.a.b.d;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.updatesdk.a.a.a.b;
import com.huawei.updatesdk.a.a.c.g;
import com.huawei.updatesdk.a.b.d.c.a;
import com.huawei.updatesdk.a.b.d.c.c;
import com.huawei.updatesdk.a.b.d.c.d;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.util.concurrent.Executor;
import org.apache.http.conn.ConnectTimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

public class b extends AsyncTask<c, Void, d> {
    public c a = null;
    private d b = null;
    private a c = null;
    private com.huawei.updatesdk.a.a.a.b d = null;
    private int e = 0;

    public b(c cVar, a aVar) {
        this.a = cVar;
        this.c = aVar;
    }

    private d a(String str, String str2, d dVar) {
        try {
            dVar.fromJson(new JSONObject(str2));
            dVar.b(0);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | JSONException e2) {
            com.huawei.updatesdk.a.a.b.a.a.a.a(C0201.m82(31324), C0201.m82(31325), e2);
        }
        return dVar;
    }

    private void a(d dVar, int i, d.a aVar, Throwable th) {
        if (dVar != null) {
            dVar.b(i);
            dVar.a(aVar);
            dVar.a(th.toString());
        }
    }

    private void a(d dVar, Throwable th, String str) {
        d.a aVar;
        int i = 1;
        if (th instanceof ConnectException) {
            aVar = d.a.CONNECT_EXCEPTION;
        } else if ((th instanceof SocketTimeoutException) || (th instanceof ConnectTimeoutException)) {
            aVar = d.a.CONNECT_EXCEPTION;
            i = 2;
        } else if (th instanceof IllegalArgumentException) {
            aVar = d.a.PARAM_ERROR;
            i = 5;
        } else if (th instanceof IllegalAccessException) {
            aVar = d.a.UNKNOWN_EXCEPTION;
        } else if (th instanceof ArrayIndexOutOfBoundsException) {
            aVar = d.a.NO_PROGUARD;
            i = 6;
        } else if ((th instanceof InterruptedException) || (th instanceof InterruptedIOException)) {
            a(dVar, 0, d.a.NORMAL, th);
            Log.e(C0201.m82(31326), C0201.m82(31327));
            a(str, th);
        } else if (th instanceof IOException) {
            aVar = d.a.IO_EXCEPTION;
        } else {
            if (dVar != null) {
                dVar.a(th.toString());
            }
            a(str, th);
        }
        a(dVar, i, aVar, th);
        a(str, th);
    }

    private void a(String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(C0201.m82(31328));
        sb.append(C0201.m82(31329));
        sb.append(th.getClass().getName());
        sb.append(C0201.m82(31330));
        sb.append(str);
        sb.append(C0201.m82(31331));
        sb.append(this.a.b());
        sb.append(C0201.m82(31332) + this.e);
        String sb2 = sb.toString();
        String r0 = C0201.m82(31333);
        com.huawei.updatesdk.a.a.b.a.a.a.a(r0, sb2, th);
        Log.e(r0, C0201.m82(31334) + sb2);
    }

    private boolean a(String str) {
        return TextUtils.isEmpty(str) || !g.d(str);
    }

    private void b(String str) {
        Log.e(C0201.m82(31335), TextUtils.isEmpty(str) ? C0201.m82(31336) : C0201.m82(31337));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0059  */
    private void c(d dVar) {
        String r1;
        d.a aVar;
        StringBuilder sb;
        Throwable e2;
        String r0 = C0201.m82(31338);
        if (!isCancelled() && this.c != null) {
            if (dVar == null) {
                r1 = C0201.m82(31339);
                com.huawei.updatesdk.a.a.b.a.a.a.b(r1, C0201.m82(31340));
                try {
                    dVar = a.a(this.a.b());
                } catch (InstantiationException e3) {
                    e2 = e3;
                    sb = new StringBuilder();
                } catch (IllegalAccessException e4) {
                    e2 = e4;
                    sb = new StringBuilder();
                }
                if (dVar != null) {
                    dVar = new d();
                    aVar = d.a.PARAM_ERROR;
                } else {
                    aVar = d.a.UNKNOWN_EXCEPTION;
                }
                dVar.a(aVar);
                dVar.b(1);
            }
            this.c.b(this.a, dVar);
        }
        return;
        sb.append(r0);
        sb.append(this.a.b());
        com.huawei.updatesdk.a.a.b.a.a.a.a(r1, sb.toString(), e2);
        if (dVar != null) {
        }
        dVar.a(aVar);
        dVar.b(1);
        this.c.b(this.a, dVar);
    }

    private boolean d(d dVar) {
        if (isCancelled()) {
            return false;
        }
        if (dVar.d() != 1 && dVar.d() != 2) {
            return false;
        }
        int i = this.e;
        this.e = i + 1;
        String r4 = C0201.m82(31341);
        String r5 = C0201.m82(31342);
        if (i >= 3) {
            com.huawei.updatesdk.a.a.b.a.a.a.a(r4, C0201.m82(31343) + this.e + r5 + dVar.d());
            return false;
        }
        com.huawei.updatesdk.a.a.b.a.a.a.a(r4, C0201.m82(31344) + this.e + r5 + dVar.d());
        return true;
    }

    private void e() {
        c(this.b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    public d a() {
        d dVar;
        String str;
        Throwable th;
        String r0 = C0201.m82(31345);
        String r1 = C0201.m82(31346);
        String r2 = C0201.m82(31347);
        d dVar2 = null;
        try {
            dVar = a.a(this.a.b());
            try {
                if (!com.huawei.updatesdk.a.a.c.i.b.d(com.huawei.updatesdk.a.b.a.a.c().a())) {
                    dVar.b(3);
                    dVar.a(d.a.NO_NETWORK);
                } else {
                    String a2 = this.a.a();
                    String d2 = this.a.d();
                    com.huawei.updatesdk.a.a.b.a.a.a.a(r2, C0201.m82(31348) + this.a.b() + r1 + d2 + r0 + a2);
                    com.huawei.updatesdk.a.a.a.b bVar = new com.huawei.updatesdk.a.a.a.b();
                    this.d = bVar;
                    b.a a3 = bVar.a(d2, a2, C0201.m82(31349), d(), com.huawei.updatesdk.a.b.a.a.c().a());
                    String b2 = a3.b();
                    dVar.a(a3.a());
                    Log.i(r2, C0201.m82(31350) + dVar.b());
                    if (a3.a() / 100 == 5) {
                        dVar.b(0);
                        return dVar;
                    } else if (a(b2)) {
                        dVar.b(1);
                        dVar.a(d.a.JSON_ERROR);
                        b(b2);
                    } else {
                        dVar = a(a2, b2, dVar);
                        com.huawei.updatesdk.a.a.b.a.a.a.a(r2, C0201.m82(31351) + this.a.b() + r1 + d2 + r0 + a2 + C0201.m82(31352) + dVar.toJson());
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                str = null;
                dVar2 = dVar;
                a(dVar2, th, str);
                dVar = dVar2;
                if (dVar != null) {
                }
            }
        } catch (Throwable th3) {
            th = th3;
            str = null;
            a(dVar2, th, str);
            dVar = dVar2;
            if (dVar != null) {
            }
        }
        if (dVar != null) {
            return dVar;
        }
        d dVar3 = new d();
        dVar3.b(5);
        dVar3.a(d.a.PARAM_ERROR);
        return dVar3;
    }

    /* renamed from: a */
    public d doInBackground(c... cVarArr) {
        com.huawei.updatesdk.a.a.b.a.a.a.a(C0201.m82(31354), C0201.m82(31353) + this.a.b());
        com.huawei.updatesdk.b.e.a.b.a(this);
        d c2 = c();
        a aVar = this.c;
        if (aVar != null) {
            aVar.a(this.a, c2);
        }
        return c2;
    }

    public void a(d dVar) {
    }

    public final void a(Executor executor) {
        executeOnExecutor(executor, this.a);
    }

    public void b() {
        com.huawei.updatesdk.a.a.a.b bVar = this.d;
        if (bVar != null) {
            bVar.a();
            this.d = null;
        }
    }

    /* renamed from: b */
    public void onPostExecute(d dVar) {
        com.huawei.updatesdk.a.a.b.a.a.a.a(C0201.m82(31356), C0201.m82(31355) + this.a.b());
        com.huawei.updatesdk.b.e.a.b.a().remove(this);
        e();
    }

    public final d c() {
        d dVar = null;
        do {
            if (this.e > 0 && dVar != null) {
                com.huawei.updatesdk.a.a.b.a.a.a.a(C0201.m82(31359), C0201.m82(31357) + dVar.d() + C0201.m82(31358) + this.e);
            }
            dVar = a();
            a(dVar);
        } while (d(dVar));
        this.b = dVar;
        return dVar;
    }

    public String d() {
        String a2 = com.huawei.updatesdk.b.e.a.a.a();
        return TextUtils.isEmpty(a2) ? C0201.m82(31360) : a2;
    }
}
