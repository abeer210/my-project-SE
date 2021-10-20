package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.u;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

public final class s6 implements Runnable {
    private final URL a;
    private final p6 b;
    private final String c;
    private final Map<String, String> d = null;
    private final /* synthetic */ q6 e;

    public s6(q6 q6Var, String str, URL url, byte[] bArr, Map<String, String> map, p6 p6Var) {
        this.e = q6Var;
        u.g(str);
        u.k(url);
        u.k(p6Var);
        this.a = url;
        this.b = p6Var;
        this.c = str;
    }

    private final void a(int i, Exception exc, byte[] bArr, Map<String, List<String>> map) {
        this.e.c().y(new r6(this, i, exc, bArr, map));
    }

    public final /* synthetic */ void b(int i, Exception exc, byte[] bArr, Map map) {
        this.b.a(this.c, i, exc, bArr, map);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0071  */
    public final void run() {
        Map<String, List<String>> map;
        IOException e2;
        HttpURLConnection httpURLConnection;
        Map<String, List<String>> map2;
        Throwable th;
        Map<String, List<String>> headerFields;
        this.e.i();
        int i = 0;
        try {
            httpURLConnection = this.e.t(this.a);
            try {
                if (this.d != null) {
                    for (Map.Entry<String, String> entry : this.d.entrySet()) {
                        httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                    }
                }
                i = w30.e(httpURLConnection);
                headerFields = httpURLConnection.getHeaderFields();
            } catch (IOException e3) {
                e2 = e3;
                map = null;
                if (httpURLConnection != null) {
                }
                a(i, e2, null, map);
            } catch (Throwable th2) {
                th = th2;
                map2 = null;
                if (httpURLConnection != null) {
                }
                a(i, null, null, map2);
                throw th;
            }
            try {
                q6 q6Var = this.e;
                byte[] bArr = q6.v(httpURLConnection);
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                a(i, null, bArr, headerFields);
            } catch (IOException e4) {
                map = headerFields;
                e2 = e4;
                if (httpURLConnection != null) {
                }
                a(i, e2, null, map);
            } catch (Throwable th3) {
                map2 = headerFields;
                th = th3;
                if (httpURLConnection != null) {
                }
                a(i, null, null, map2);
                throw th;
            }
        } catch (IOException e5) {
            e2 = e5;
            httpURLConnection = null;
            map = null;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            a(i, e2, null, map);
        } catch (Throwable th4) {
            th = th4;
            httpURLConnection = null;
            map2 = null;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            a(i, null, null, map2);
            throw th;
        }
    }
}
