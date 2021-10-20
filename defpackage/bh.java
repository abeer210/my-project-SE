package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.g;
import com.bumptech.glide.load.e;
import defpackage.vg;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: bh  reason: default package */
/* compiled from: HttpUrlFetcher */
public class bh implements vg<InputStream> {
    public static final b g = new a();
    private final sj a;
    private final int b;
    private final b c;
    private HttpURLConnection d;
    private InputStream e;
    private volatile boolean f;

    /* renamed from: bh$a */
    /* compiled from: HttpUrlFetcher */
    private static class a implements b {
        @Override // defpackage.bh.b
        public HttpURLConnection a(URL url) throws IOException {
            URLConnection openConnection = url.openConnection();
            w30.E(openConnection);
            return (HttpURLConnection) openConnection;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bh$b */
    /* compiled from: HttpUrlFetcher */
    public interface b {
        HttpURLConnection a(URL url) throws IOException;
    }

    public bh(sj sjVar, int i) {
        this(sjVar, i, g);
    }

    private InputStream c(HttpURLConnection httpURLConnection) throws IOException {
        if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
            this.e = xo.c(w30.a(httpURLConnection), (long) httpURLConnection.getContentLength());
        } else {
            String r1 = C0201.m82(5446);
            if (Log.isLoggable(r1, 3)) {
                Log.d(r1, C0201.m82(5447) + httpURLConnection.getContentEncoding());
            }
            this.e = w30.a(httpURLConnection);
        }
        return this.e;
    }

    private static boolean f(int i) {
        return i / 100 == 2;
    }

    private static boolean g(int i) {
        return i / 100 == 3;
    }

    private InputStream h(URL url, int i, URL url2, Map<String, String> map) throws IOException {
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new e(C0201.m82(5448));
                    }
                } catch (URISyntaxException unused) {
                }
            }
            this.d = this.c.a(url);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.d.addRequestProperty(entry.getKey(), entry.getValue());
            }
            this.d.setConnectTimeout(this.b);
            this.d.setReadTimeout(this.b);
            this.d.setUseCaches(false);
            this.d.setDoInput(true);
            this.d.setInstanceFollowRedirects(false);
            this.d.connect();
            this.e = w30.a(this.d);
            if (this.f) {
                return null;
            }
            int e2 = w30.e(this.d);
            if (f(e2)) {
                return c(this.d);
            }
            if (g(e2)) {
                String headerField = this.d.getHeaderField(C0201.m82(5449));
                if (!TextUtils.isEmpty(headerField)) {
                    URL url3 = new URL(url, headerField);
                    b();
                    return h(url3, i + 1, url, map);
                }
                throw new e(C0201.m82(5450));
            } else if (e2 == -1) {
                throw new e(e2);
            } else {
                throw new e(this.d.getResponseMessage(), e2);
            }
        } else {
            throw new e(C0201.m82(5451));
        }
    }

    @Override // defpackage.vg
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // defpackage.vg
    public void b() {
        InputStream inputStream = this.e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.d = null;
    }

    @Override // defpackage.vg
    public void cancel() {
        this.f = true;
    }

    @Override // defpackage.vg
    public com.bumptech.glide.load.a d() {
        return com.bumptech.glide.load.a.REMOTE;
    }

    @Override // defpackage.vg
    public void e(g gVar, vg.a<? super InputStream> aVar) {
        StringBuilder sb;
        String r10 = C0201.m82(5452);
        String r0 = C0201.m82(5453);
        long b2 = ap.b();
        try {
            aVar.f(h(this.a.i(), 0, null, this.a.e()));
            if (Log.isLoggable(r0, 2)) {
                sb = new StringBuilder();
                sb.append(r10);
                sb.append(ap.a(b2));
                Log.v(r0, sb.toString());
            }
        } catch (IOException e2) {
            if (Log.isLoggable(r0, 3)) {
                Log.d(r0, C0201.m82(5454), e2);
            }
            aVar.c(e2);
            if (Log.isLoggable(r0, 2)) {
                sb = new StringBuilder();
            }
        } catch (Throwable th) {
            if (Log.isLoggable(r0, 2)) {
                Log.v(r0, r10 + ap.a(b2));
            }
            throw th;
        }
    }

    public bh(sj sjVar, int i, b bVar) {
        this.a = sjVar;
        this.b = i;
        this.c = bVar;
    }
}
