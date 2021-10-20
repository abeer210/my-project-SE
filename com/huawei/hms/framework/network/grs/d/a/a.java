package com.huawei.hms.framework.network.grs.d.a;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.d.b.c;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import vigqyno.C0201;

public class a {
    public static HttpsURLConnection a(String str, Context context, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        URLConnection openConnection = new URL(str).openConnection();
        w30.E(openConnection);
        boolean z = openConnection instanceof HttpsURLConnection;
        String r2 = C0201.m82(23779);
        if (z) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
            try {
                httpsURLConnection.setSSLSocketFactory(com.huawei.hms.framework.network.grs.d.b.a.a(context));
                httpsURLConnection.setHostnameVerifier(c.b);
            } catch (IllegalArgumentException unused) {
                Logger.w(r2, C0201.m82(23780));
            }
            httpsURLConnection.setConnectTimeout(10000);
            httpsURLConnection.setReadTimeout(10000);
            String b = com.huawei.hms.framework.network.grs.d.a.b(context, C0201.m82(23781), str2);
            Logger.d(r2, C0201.m82(23782) + b);
            httpsURLConnection.setRequestProperty(C0201.m82(23783), b);
            return httpsURLConnection;
        }
        Logger.w(r2, C0201.m82(23784));
        return null;
    }
}
