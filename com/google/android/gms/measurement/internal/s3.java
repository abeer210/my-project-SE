package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.u;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import vigqyno.C0201;

public final class s3 implements Runnable {
    private final URL a;
    private final byte[] b;
    private final q3 c;
    private final String d;
    private final Map<String, String> e;
    private final /* synthetic */ o3 f;

    public s3(o3 o3Var, String str, URL url, byte[] bArr, Map<String, String> map, q3 q3Var) {
        this.f = o3Var;
        u.g(str);
        u.k(url);
        u.k(q3Var);
        this.a = url;
        this.b = bArr;
        this.c = q3Var;
        this.d = str;
        this.e = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e5 A[SYNTHETIC, Splitter:B:46:0x00e5] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0120 A[SYNTHETIC, Splitter:B:59:0x0120] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x013a  */
    public final void run() {
        Map<String, List<String>> map;
        IOException iOException;
        int i;
        HttpURLConnection httpURLConnection;
        IOException e2;
        Map<String, List<String>> map2;
        int i2;
        Throwable th;
        Throwable th2;
        int e3;
        IOException e4;
        String r0 = C0201.m82(3484);
        this.f.i();
        OutputStream outputStream = null;
        try {
            httpURLConnection = this.f.v(this.a);
            try {
                if (this.e != null) {
                    for (Map.Entry<String, String> entry : this.e.entrySet()) {
                        httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                    }
                }
                if (this.b != null) {
                    byte[] R = this.f.n().R(this.b);
                    this.f.e().M().a(C0201.m82(3485), Integer.valueOf(R.length));
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.addRequestProperty(C0201.m82(3486), C0201.m82(3487));
                    httpURLConnection.setFixedLengthStreamingMode(R.length);
                    httpURLConnection.connect();
                    OutputStream c2 = w30.c(httpURLConnection);
                    try {
                        c2.write(R);
                        c2.close();
                    } catch (IOException e5) {
                        map = null;
                        iOException = e5;
                        outputStream = c2;
                    } catch (Throwable th3) {
                        map2 = null;
                        th = th3;
                        outputStream = c2;
                        i2 = 0;
                        if (outputStream != null) {
                        }
                        if (httpURLConnection != null) {
                        }
                        this.f.c().y(new p3(this.d, this.c, i2, null, null, map2));
                        throw th;
                    }
                }
                e3 = w30.e(httpURLConnection);
            } catch (IOException e6) {
                e2 = e6;
                map = null;
                iOException = e2;
                i = 0;
                if (outputStream != null) {
                }
                if (httpURLConnection != null) {
                }
                this.f.c().y(new p3(this.d, this.c, i, iOException, null, map));
            } catch (Throwable th4) {
                th2 = th4;
                map2 = null;
                th = th2;
                i2 = 0;
                if (outputStream != null) {
                }
                if (httpURLConnection != null) {
                }
                this.f.c().y(new p3(this.d, this.c, i2, null, null, map2));
                throw th;
            }
            try {
                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                try {
                    o3 o3Var = this.f;
                    byte[] bArr = o3.x(httpURLConnection);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    this.f.c().y(new p3(this.d, this.c, e3, null, bArr, headerFields));
                } catch (IOException e7) {
                    e4 = e7;
                    i = e3;
                    map = headerFields;
                    iOException = e4;
                    if (outputStream != null) {
                    }
                    if (httpURLConnection != null) {
                    }
                    this.f.c().y(new p3(this.d, this.c, i, iOException, null, map));
                } catch (Throwable th5) {
                    th = th5;
                    i2 = e3;
                    map2 = headerFields;
                    if (outputStream != null) {
                    }
                    if (httpURLConnection != null) {
                    }
                    this.f.c().y(new p3(this.d, this.c, i2, null, null, map2));
                    throw th;
                }
            } catch (IOException e8) {
                e4 = e8;
                map = null;
                i = e3;
                iOException = e4;
                if (outputStream != null) {
                }
                if (httpURLConnection != null) {
                }
                this.f.c().y(new p3(this.d, this.c, i, iOException, null, map));
            } catch (Throwable th6) {
                map2 = null;
                th = th6;
                i2 = e3;
                if (outputStream != null) {
                }
                if (httpURLConnection != null) {
                }
                this.f.c().y(new p3(this.d, this.c, i2, null, null, map2));
                throw th;
            }
        } catch (IOException e9) {
            e2 = e9;
            httpURLConnection = null;
            map = null;
            iOException = e2;
            i = 0;
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e10) {
                    this.f.e().E().b(r0, k3.B(this.d), e10);
                }
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            this.f.c().y(new p3(this.d, this.c, i, iOException, null, map));
        } catch (Throwable th7) {
            th2 = th7;
            httpURLConnection = null;
            map2 = null;
            th = th2;
            i2 = 0;
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e11) {
                    this.f.e().E().b(r0, k3.B(this.d), e11);
                }
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            this.f.c().y(new p3(this.d, this.c, i2, null, null, map2));
            throw th;
        }
    }
}
