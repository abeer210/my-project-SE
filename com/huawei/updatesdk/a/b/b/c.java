package com.huawei.updatesdk.a.b.b;

import android.text.TextUtils;
import com.huawei.updatesdk.a.a.a.d;
import com.huawei.updatesdk.a.a.c.i.b;
import com.huawei.updatesdk.a.b.a.a;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import javax.net.ssl.HttpsURLConnection;
import org.apache.http.conn.ssl.SSLSocketFactory;
import vigqyno.C0201;

public class c {
    private static volatile c a;

    public static synchronized c a() {
        c cVar;
        synchronized (c.class) {
            if (a == null) {
                a = new c();
            }
            cVar = a;
        }
        return cVar;
    }

    public static String b() {
        String b = a.c().b();
        boolean isEmpty = TextUtils.isEmpty(b);
        String r2 = C0201.m82(7446);
        if (isEmpty) {
            return r2;
        }
        String str = b + C0201.m82(7447);
        File file = new File(str);
        return (file.exists() || file.mkdirs()) ? str : r2;
    }

    private Proxy c() {
        if (b.e(a.c().a())) {
            return b.a();
        }
        return null;
    }

    public HttpURLConnection a(String str) throws IOException, CertificateException, NoSuchAlgorithmException, KeyStoreException, KeyManagementException, IllegalAccessException {
        URLConnection uRLConnection;
        URL url = new URL(str);
        Proxy c = c();
        if (c == null) {
            uRLConnection = url.openConnection();
            w30.E(uRLConnection);
        } else {
            uRLConnection = url.openConnection(c);
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
        httpURLConnection.setConnectTimeout(7000);
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setRequestProperty(C0201.m82(7448), C0201.m82(7449));
        httpURLConnection.setInstanceFollowRedirects(true);
        if (httpURLConnection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            httpsURLConnection.setSSLSocketFactory(d.a(a.c().a()));
            httpsURLConnection.setHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
        }
        return httpURLConnection;
    }
}
