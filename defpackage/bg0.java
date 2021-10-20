package defpackage;

import android.net.Uri;
import com.facebook.common.time.RealtimeSinceBootClock;
import defpackage.ng0;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: bg0  reason: default package */
/* compiled from: HttpUrlConnectionNetworkFetcher */
public class bg0 extends kf0<c> {
    private int a;
    private final ExecutorService b;
    private final com.facebook.common.time.b c;

    /* access modifiers changed from: package-private */
    /* renamed from: bg0$a */
    /* compiled from: HttpUrlConnectionNetworkFetcher */
    public class a implements Runnable {
        public final /* synthetic */ c a;
        public final /* synthetic */ ng0.a b;

        public a(c cVar, ng0.a aVar) {
            this.a = cVar;
            this.b = aVar;
        }

        public void run() {
            bg0.this.j(this.a, this.b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bg0$b */
    /* compiled from: HttpUrlConnectionNetworkFetcher */
    public class b extends mf0 {
        public final /* synthetic */ Future a;
        public final /* synthetic */ ng0.a b;

        public b(bg0 bg0, Future future, ng0.a aVar) {
            this.a = future;
            this.b = aVar;
        }

        @Override // defpackage.tg0
        public void a() {
            if (this.a.cancel(false)) {
                this.b.b();
            }
        }
    }

    /* renamed from: bg0$c */
    /* compiled from: HttpUrlConnectionNetworkFetcher */
    public static class c extends ag0 {
        private long f;
        private long g;
        private long h;

        public c(sf0<af0> sf0, sg0 sg0) {
            super(sf0, sg0);
        }
    }

    public bg0(int i) {
        this(RealtimeSinceBootClock.get());
        this.a = i;
    }

    private HttpURLConnection g(Uri uri, int i) throws IOException {
        Uri uri2;
        String str;
        HttpURLConnection o = o(uri);
        o.setConnectTimeout(this.a);
        int e = w30.e(o);
        if (m(e)) {
            return o;
        }
        if (l(e)) {
            String headerField = o.getHeaderField(C0201.m82(7438));
            o.disconnect();
            if (headerField == null) {
                uri2 = null;
            } else {
                uri2 = Uri.parse(headerField);
            }
            String scheme = uri.getScheme();
            if (i > 0 && uri2 != null && !uri2.getScheme().equals(scheme)) {
                return g(uri2, i - 1);
            }
            if (i == 0) {
                str = h(C0201.m82(7439), uri.toString());
            } else {
                str = h(C0201.m82(7440), uri.toString(), Integer.valueOf(e));
            }
            throw new IOException(str);
        }
        o.disconnect();
        throw new IOException(String.format(C0201.m82(7441), uri.toString(), Integer.valueOf(e)));
    }

    private static String h(String str, Object... objArr) {
        return String.format(Locale.getDefault(), str, objArr);
    }

    private static boolean l(int i) {
        if (i == 307 || i == 308) {
            return true;
        }
        switch (i) {
            case C0188.f19 /*{ENCODED_INT: 300}*/:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    private static boolean m(int i) {
        return i >= 200 && i < 300;
    }

    public static HttpURLConnection o(Uri uri) throws IOException {
        URLConnection openConnection = h70.m(uri).openConnection();
        w30.E(openConnection);
        return (HttpURLConnection) openConnection;
    }

    /* renamed from: f */
    public c e(sf0<af0> sf0, sg0 sg0) {
        return new c(sf0, sg0);
    }

    /* renamed from: i */
    public void d(c cVar, ng0.a aVar) {
        cVar.f = this.c.now();
        cVar.b().d(new b(this, this.b.submit(new a(cVar, aVar)), aVar));
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0033 A[SYNTHETIC, Splitter:B:20:0x0033] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0041 A[SYNTHETIC, Splitter:B:27:0x0041] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    public void j(c cVar, ng0.a aVar) {
        Throwable th;
        HttpURLConnection httpURLConnection;
        IOException e;
        InputStream inputStream = null;
        try {
            httpURLConnection = g(cVar.h(), 5);
            try {
                cVar.g = this.c.now();
                if (httpURLConnection != null) {
                    inputStream = w30.a(httpURLConnection);
                    aVar.c(inputStream, -1);
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                if (httpURLConnection == null) {
                    return;
                }
            } catch (IOException e2) {
                e = e2;
                try {
                    aVar.a(e);
                    if (0 != 0) {
                        try {
                            inputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    if (httpURLConnection == null) {
                        return;
                    }
                    httpURLConnection.disconnect();
                } catch (Throwable th2) {
                    th = th2;
                    if (0 != 0) {
                        try {
                            inputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            }
        } catch (IOException e3) {
            e = e3;
            httpURLConnection = null;
            aVar.a(e);
            if (0 != 0) {
            }
            if (httpURLConnection == null) {
            }
            httpURLConnection.disconnect();
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
            if (0 != 0) {
            }
            if (httpURLConnection != null) {
            }
            throw th;
        }
        httpURLConnection.disconnect();
    }

    /* renamed from: k */
    public Map<String, String> c(c cVar, int i) {
        HashMap hashMap = new HashMap(4);
        hashMap.put(C0201.m82(7442), Long.toString(cVar.g - cVar.f));
        hashMap.put(C0201.m82(7443), Long.toString(cVar.h - cVar.g));
        hashMap.put(C0201.m82(7444), Long.toString(cVar.h - cVar.f));
        hashMap.put(C0201.m82(7445), Integer.toString(i));
        return hashMap;
    }

    /* renamed from: n */
    public void a(c cVar, int i) {
        cVar.h = this.c.now();
    }

    public bg0(com.facebook.common.time.b bVar) {
        this.b = Executors.newFixedThreadPool(3);
        this.c = bVar;
    }
}
