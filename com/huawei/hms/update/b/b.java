package com.huawei.hms.update.b;

import android.content.Context;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.IOUtils;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import vigqyno.C0201;

/* compiled from: HttpRequestHelper */
public class b implements d {
    private HttpURLConnection a;
    private volatile int b = -1;

    @Override // com.huawei.hms.update.b.d
    public void a() {
        this.b = -1;
        HttpURLConnection httpURLConnection = this.a;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // com.huawei.hms.update.b.d
    public void b() {
        this.b = 1;
    }

    @Override // com.huawei.hms.update.b.d
    public int a(String str, OutputStream outputStream, int i, int i2, Context context) throws IOException, a {
        InputStream inputStream = null;
        try {
            a(str, context);
            this.a.setRequestMethod(C0201.m82(7260));
            if (i > 0) {
                HttpURLConnection httpURLConnection = this.a;
                String r9 = C0201.m82(7261);
                httpURLConnection.addRequestProperty(r9, C0201.m82(7262) + i + C0201.m82(7263) + i2);
            }
            int e = w30.e(this.a);
            if ((i > 0 && e == 206) || (i <= 0 && e == 200)) {
                inputStream = w30.a(this.a);
                a(new BufferedInputStream(inputStream, 4096), outputStream);
                outputStream.flush();
            }
            return e;
        } finally {
            IOUtils.closeQuietly(inputStream);
        }
    }

    private void a(String str, Context context) throws IOException {
        if (this.b == 0) {
            HMSLog.e(C0201.m82(7258), C0201.m82(7259));
        }
        URLConnection openConnection = new URL(str).openConnection();
        w30.E(openConnection);
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        this.a = httpURLConnection;
        if (httpURLConnection instanceof HttpsURLConnection) {
            c.a((HttpsURLConnection) httpURLConnection, context);
        }
        this.a.setConnectTimeout(30000);
        this.a.setReadTimeout(30000);
        this.a.setDoInput(true);
        this.a.setDoOutput(true);
        this.a.setUseCaches(false);
        this.a.setInstanceFollowRedirects(true);
        this.b = 0;
    }

    private void a(InputStream inputStream, OutputStream outputStream) throws IOException, a {
        byte[] bArr = new byte[4096];
        do {
            int read = inputStream.read(bArr);
            if (-1 != read) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        } while (this.b != 1);
        throw new a(C0201.m82(7257));
    }
}
