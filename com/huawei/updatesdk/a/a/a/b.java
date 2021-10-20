package com.huawei.updatesdk.a.a.a;

import android.content.Context;
import com.huawei.updatesdk.a.a.c.d;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import org.apache.http.conn.ssl.SSLSocketFactory;
import vigqyno.C0201;

public class b {
    private HttpURLConnection a = null;

    public static class a {
        private String a;
        private int b;

        public int a() {
            return this.b;
        }

        public String b() {
            return this.a;
        }
    }

    private HttpURLConnection a(String str, Context context) throws IOException, CertificateException, NoSuchAlgorithmException, KeyStoreException, KeyManagementException, IllegalAccessException {
        HttpsURLConnection httpsURLConnection;
        URLConnection uRLConnection;
        URL url = new URL(str);
        Proxy b = com.huawei.updatesdk.a.a.c.i.b.b(context);
        if (C0201.m82(37248).equals(url.getProtocol())) {
            if (b == null) {
                uRLConnection = url.openConnection();
                w30.E(uRLConnection);
            } else {
                uRLConnection = url.openConnection(b);
            }
            httpsURLConnection = (HttpsURLConnection) uRLConnection;
            httpsURLConnection.setSSLSocketFactory(d.a(context));
            httpsURLConnection.setHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
        } else {
            httpsURLConnection = null;
        }
        if (!C0201.m82(37249).equals(url.getProtocol())) {
            return httpsURLConnection;
        }
        URLConnection openConnection = url.openConnection();
        w30.E(openConnection);
        return (HttpURLConnection) openConnection;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004b A[SYNTHETIC, Splitter:B:27:0x004b] */
    private byte[] a(byte[] bArr) {
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream;
        IOException e;
        DataOutputStream dataOutputStream;
        String r0 = C0201.m82(37250);
        String r1 = C0201.m82(37251);
        DataOutputStream dataOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                dataOutputStream = new DataOutputStream(new GZIPOutputStream(byteArrayOutputStream, bArr.length));
            } catch (IOException e2) {
                e = e2;
                try {
                    com.huawei.updatesdk.a.a.b.a.a.a.a(r1, r0, e);
                    if (dataOutputStream2 != null) {
                    }
                    return byteArrayOutputStream.toByteArray();
                } catch (Throwable th2) {
                    th = th2;
                    if (dataOutputStream2 != null) {
                        try {
                            dataOutputStream2.close();
                        } catch (IOException e3) {
                            com.huawei.updatesdk.a.a.b.a.a.a.a(r1, r0, e3);
                        }
                    }
                    throw th;
                }
            }
            try {
                dataOutputStream.write(bArr, 0, bArr.length);
                dataOutputStream.flush();
                try {
                    dataOutputStream.close();
                } catch (IOException e4) {
                    com.huawei.updatesdk.a.a.b.a.a.a.a(r1, r0, e4);
                }
            } catch (IOException e5) {
                e = e5;
                dataOutputStream2 = dataOutputStream;
                com.huawei.updatesdk.a.a.b.a.a.a.a(r1, r0, e);
                if (dataOutputStream2 != null) {
                }
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th3) {
                th = th3;
                dataOutputStream2 = dataOutputStream;
                if (dataOutputStream2 != null) {
                }
                throw th;
            }
        } catch (IOException e6) {
            e = e6;
            byteArrayOutputStream = null;
            com.huawei.updatesdk.a.a.b.a.a.a.a(r1, r0, e);
            if (dataOutputStream2 != null) {
                dataOutputStream2.close();
            }
            return byteArrayOutputStream.toByteArray();
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00e6  */
    public a a(String str, String str2, String str3, String str4, Context context) throws IOException, CertificateException, IllegalAccessException, NoSuchAlgorithmException, KeyStoreException, KeyManagementException {
        DataOutputStream dataOutputStream;
        Throwable th;
        HttpURLConnection httpURLConnection;
        a aVar = new a();
        BufferedInputStream bufferedInputStream = null;
        try {
            httpURLConnection = a(str, context);
            if (httpURLConnection == null) {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                d.a((Closeable) null);
            } else {
                try {
                    this.a = httpURLConnection;
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setUseCaches(false);
                    httpURLConnection.setConnectTimeout(5000);
                    httpURLConnection.setReadTimeout(10000);
                    httpURLConnection.setRequestMethod(C0201.m82(37252));
                    httpURLConnection.setRequestProperty(C0201.m82(37253), C0201.m82(37254));
                    httpURLConnection.setRequestProperty(C0201.m82(37255), C0201.m82(37256));
                    httpURLConnection.setRequestProperty(C0201.m82(37257), C0201.m82(37258));
                    httpURLConnection.setRequestProperty(C0201.m82(37259), str4);
                    dataOutputStream = new DataOutputStream(w30.c(httpURLConnection));
                    try {
                        dataOutputStream.write(a(str2.getBytes(str3)));
                        dataOutputStream.flush();
                        int e = w30.e(httpURLConnection);
                        aVar.b = e;
                        bufferedInputStream = e == 200 ? new BufferedInputStream(w30.a(httpURLConnection)) : new BufferedInputStream(httpURLConnection.getErrorStream());
                        com.huawei.updatesdk.a.a.c.b bVar = new com.huawei.updatesdk.a.a.c.b();
                        byte[] a2 = a.b().a();
                        while (true) {
                            int read = bufferedInputStream.read(a2);
                            if (read == -1) {
                                break;
                            }
                            bVar.a(a2, read);
                        }
                        a.b().a(a2);
                        aVar.a = bVar.a();
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        d.a(dataOutputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        if (httpURLConnection != null) {
                        }
                        d.a(dataOutputStream);
                        d.a((Closeable) null);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    dataOutputStream = null;
                    if (httpURLConnection != null) {
                    }
                    d.a(dataOutputStream);
                    d.a((Closeable) null);
                    throw th;
                }
            }
            d.a(bufferedInputStream);
            return aVar;
        } catch (Throwable th4) {
            th = th4;
            httpURLConnection = null;
            dataOutputStream = null;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            d.a(dataOutputStream);
            d.a((Closeable) null);
            throw th;
        }
    }

    public void a() {
        HttpURLConnection httpURLConnection = this.a;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }
}
