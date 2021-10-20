package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import defpackage.ng0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import vigqyno.C0201;

/* renamed from: ic0  reason: default package */
/* compiled from: OkHttpNetworkFetcher */
public class ic0 extends kf0<c> {
    private final Call.Factory a;
    private final CacheControl b;
    private Executor c;

    /* access modifiers changed from: package-private */
    /* renamed from: ic0$a */
    /* compiled from: OkHttpNetworkFetcher */
    public class a extends mf0 {
        public final /* synthetic */ Call a;

        /* renamed from: ic0$a$a  reason: collision with other inner class name */
        /* compiled from: OkHttpNetworkFetcher */
        class RunnableC0141a implements Runnable {
            public RunnableC0141a() {
            }

            public void run() {
                a.this.a.cancel();
            }
        }

        public a(Call call) {
            this.a = call;
        }

        @Override // defpackage.tg0
        public void a() {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                this.a.cancel();
            } else {
                ic0.this.c.execute(new RunnableC0141a());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ic0$b */
    /* compiled from: OkHttpNetworkFetcher */
    public class b implements Callback {
        public final /* synthetic */ c a;
        public final /* synthetic */ ng0.a b;

        public b(c cVar, ng0.a aVar) {
            this.a = cVar;
            this.b = aVar;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            c40.d(call, iOException);
            try {
                ic0.this.l(call, iOException, this.b);
            } finally {
                c40.e();
            }
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) throws IOException {
            c40.f(call, response);
            try {
                this.a.g = SystemClock.elapsedRealtime();
                ResponseBody body = response.body();
                try {
                    if (!response.isSuccessful()) {
                        ic0.this.l(call, new IOException(C0201.m82(1332) + response), this.b);
                        body.close();
                        return;
                    }
                    nd0 c2 = nd0.c(response.header(C0201.m82(1333)));
                    if (!(c2 == null || (c2.a == 0 && c2.b == Integer.MAX_VALUE))) {
                        this.a.k(c2);
                        this.a.j(8);
                    }
                    long contentLength = body.contentLength();
                    if (contentLength < 0) {
                        contentLength = 0;
                    }
                    this.b.c(body.byteStream(), (int) contentLength);
                    body.close();
                    c40.g();
                } catch (Exception e) {
                    ic0.this.l(call, e, this.b);
                } catch (Throwable th) {
                    body.close();
                    throw th;
                }
            } finally {
                c40.g();
            }
        }
    }

    /* renamed from: ic0$c */
    /* compiled from: OkHttpNetworkFetcher */
    public static class c extends ag0 {
        public long f;
        public long g;
        public long h;

        public c(sf0<af0> sf0, sg0 sg0) {
            super(sf0, sg0);
        }
    }

    public ic0(OkHttpClient okHttpClient) {
        this(okHttpClient, okHttpClient.dispatcher().executorService());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void l(Call call, Exception exc, ng0.a aVar) {
        if (call.isCanceled()) {
            aVar.b();
        } else {
            aVar.a(exc);
        }
    }

    /* renamed from: h */
    public c e(sf0<af0> sf0, sg0 sg0) {
        return new c(sf0, sg0);
    }

    /* renamed from: i */
    public void d(c cVar, ng0.a aVar) {
        cVar.f = SystemClock.elapsedRealtime();
        try {
            Request.Builder builder = new Request.Builder().url(cVar.h().toString()).get();
            if (this.b != null) {
                builder.cacheControl(this.b);
            }
            nd0 b2 = cVar.b().c().b();
            if (b2 != null) {
                builder.addHeader(C0201.m82(27095), b2.d());
            }
            j(cVar, aVar, builder.build());
        } catch (Exception e) {
            aVar.a(e);
        }
    }

    public void j(c cVar, ng0.a aVar, Request request) {
        Call newCall = this.a.newCall(request);
        cVar.b().d(new a(newCall));
        c40.a(newCall, new b(cVar, aVar));
    }

    /* renamed from: k */
    public Map<String, String> c(c cVar, int i) {
        HashMap hashMap = new HashMap(4);
        hashMap.put(C0201.m82(27096), Long.toString(cVar.g - cVar.f));
        hashMap.put(C0201.m82(27097), Long.toString(cVar.h - cVar.g));
        hashMap.put(C0201.m82(27098), Long.toString(cVar.h - cVar.f));
        hashMap.put(C0201.m82(27099), Integer.toString(i));
        return hashMap;
    }

    /* renamed from: m */
    public void a(c cVar, int i) {
        cVar.h = SystemClock.elapsedRealtime();
    }

    public ic0(Call.Factory factory, Executor executor) {
        this(factory, executor, true);
    }

    public ic0(Call.Factory factory, Executor executor, boolean z) {
        this.a = factory;
        this.c = executor;
        this.b = z ? new CacheControl.Builder().noStore().build() : null;
    }
}
