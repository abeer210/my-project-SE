package defpackage;

import android.content.Context;
import androidx.core.util.d;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.ZipInputStream;
import vigqyno.C0201;

/* renamed from: de  reason: default package */
/* compiled from: NetworkFetcher */
public class de {
    private final Context a;
    private final String b;
    private final ce c;

    private de(Context context, String str, String str2) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = str;
        if (str2 == null) {
            this.c = null;
        } else {
            this.c = new ce(applicationContext);
        }
    }

    private ea a() {
        d<be, InputStream> a2;
        ma<ea> maVar;
        ce ceVar = this.c;
        if (ceVar == null || (a2 = ceVar.a(this.b)) == null) {
            return null;
        }
        F f = a2.a;
        S s = a2.b;
        if (f == be.ZIP) {
            maVar = fa.r(new ZipInputStream(s), this.b);
        } else {
            maVar = fa.h(s, this.b);
        }
        if (maVar.b() != null) {
            return maVar.b();
        }
        return null;
    }

    private ma<ea> b() {
        try {
            return c();
        } catch (IOException e) {
            return new ma<>(e);
        }
    }

    private ma<ea> c() throws IOException {
        wf.a(C0201.m82(10188) + this.b);
        URLConnection openConnection = new URL(this.b).openConnection();
        w30.E(openConnection);
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setRequestMethod(C0201.m82(10189));
        try {
            httpURLConnection.connect();
            if (httpURLConnection.getErrorStream() == null) {
                if (w30.e(httpURLConnection) == 200) {
                    ma<ea> g = g(httpURLConnection);
                    StringBuilder sb = new StringBuilder();
                    sb.append(C0201.m82(10190));
                    sb.append(g.b() != null);
                    wf.a(sb.toString());
                    httpURLConnection.disconnect();
                    return g;
                }
            }
            String f = f(httpURLConnection);
            return new ma<>(new IllegalArgumentException(C0201.m82(10191) + this.b + C0201.m82(10192) + w30.e(httpURLConnection) + C0201.m82(10193) + f));
        } catch (Exception e) {
            return new ma<>(e);
        } finally {
            httpURLConnection.disconnect();
        }
    }

    public static ma<ea> e(Context context, String str, String str2) {
        return new de(context, str, str2).d();
    }

    private String f(HttpURLConnection httpURLConnection) throws IOException {
        w30.e(httpURLConnection);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e) {
                throw e;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        }
        bufferedReader.close();
        return sb.toString();
    }

    private ma<ea> g(HttpURLConnection httpURLConnection) throws IOException {
        ma<ea> maVar;
        be beVar;
        String contentType = httpURLConnection.getContentType();
        if (contentType == null) {
            contentType = C0201.m82(10194);
        }
        if (contentType.contains(C0201.m82(10195))) {
            wf.a(C0201.m82(10196));
            beVar = be.ZIP;
            ce ceVar = this.c;
            if (ceVar == null) {
                maVar = fa.r(new ZipInputStream(w30.a(httpURLConnection)), null);
            } else {
                maVar = fa.r(new ZipInputStream(new FileInputStream(ceVar.f(this.b, w30.a(httpURLConnection), beVar))), this.b);
            }
        } else {
            wf.a(C0201.m82(10197));
            beVar = be.JSON;
            ce ceVar2 = this.c;
            if (ceVar2 == null) {
                maVar = fa.h(w30.a(httpURLConnection), null);
            } else {
                maVar = fa.h(new FileInputStream(new File(ceVar2.f(this.b, w30.a(httpURLConnection), beVar).getAbsolutePath())), this.b);
            }
        }
        if (!(this.c == null || maVar.b() == null)) {
            this.c.e(this.b, beVar);
        }
        return maVar;
    }

    public ma<ea> d() {
        ea a2 = a();
        if (a2 != null) {
            return new ma<>(a2);
        }
        wf.a(C0201.m82(10198) + this.b + C0201.m82(10199));
        return b();
    }
}
