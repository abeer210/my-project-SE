package com.dylanvann.fastimage;

import android.content.Context;
import com.bumptech.glide.i;
import com.bumptech.glide.integration.okhttp3.c;
import com.facebook.react.modules.network.g;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* compiled from: FastImageOkHttpProgressGlideModule */
public class b extends nn {
    private static C0034b a = new C0034b(null);

    /* access modifiers changed from: package-private */
    /* compiled from: FastImageOkHttpProgressGlideModule */
    public static class a implements Interceptor {
        public final /* synthetic */ d a;

        public a(d dVar) {
            this.a = dVar;
        }

        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) throws IOException {
            Request request = chain.request();
            Response proceed = chain.proceed(request);
            return proceed.newBuilder().body(new c(request.url().toString(), proceed.body(), this.a)).build();
        }
    }

    /* compiled from: FastImageOkHttpProgressGlideModule */
    private static class c extends ResponseBody {
        private final String a;
        private final ResponseBody b;
        private final d c;
        private cy2 d;

        /* access modifiers changed from: package-private */
        /* compiled from: FastImageOkHttpProgressGlideModule */
        public class a extends fy2 {
            public long a = 0;

            public a(ty2 ty2) {
                super(ty2);
            }

            @Override // defpackage.ty2, defpackage.fy2
            public long read(ay2 ay2, long j) throws IOException {
                long read = super.read(ay2, j);
                long contentLength = c.this.b.contentLength();
                if (read == -1) {
                    this.a = contentLength;
                } else {
                    this.a += read;
                }
                c.this.c.a(c.this.a, this.a, contentLength);
                return read;
            }
        }

        public c(String str, ResponseBody responseBody, d dVar) {
            this.a = str;
            this.b = responseBody;
            this.c = dVar;
        }

        private ty2 k(ty2 ty2) {
            return new a(ty2);
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            return this.b.contentLength();
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            return this.b.contentType();
        }

        @Override // okhttp3.ResponseBody
        public cy2 source() {
            if (this.d == null) {
                this.d = jy2.d(k(this.b.source()));
            }
            return this.d;
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: FastImageOkHttpProgressGlideModule */
    public interface d {
        void a(String str, long j, long j2);
    }

    private static Interceptor b(d dVar) {
        return new a(dVar);
    }

    public static void c(String str, c cVar) {
        a.b(str, cVar);
    }

    public static void d(String str) {
        a.c(str);
    }

    @Override // defpackage.nn
    public void a(Context context, com.bumptech.glide.c cVar, i iVar) {
        iVar.r(sj.class, InputStream.class, new c.a(g.g().newBuilder().addInterceptor(b(a)).build()));
    }

    /* renamed from: com.dylanvann.fastimage.b$b  reason: collision with other inner class name */
    /* compiled from: FastImageOkHttpProgressGlideModule */
    private static class C0034b implements d {
        private final Map<String, c> a;
        private final Map<String, Long> b;

        private C0034b() {
            this.a = new WeakHashMap();
            this.b = new HashMap();
        }

        private boolean d(String str, long j, long j2, float f) {
            if (!(f == 0.0f || j == 0 || j2 == j)) {
                long j3 = (long) (((((float) j) * 100.0f) / ((float) j2)) / f);
                Long l = this.b.get(str);
                if (l != null && j3 == l.longValue()) {
                    return false;
                }
                this.b.put(str, Long.valueOf(j3));
            }
            return true;
        }

        @Override // com.dylanvann.fastimage.b.d
        public void a(String str, long j, long j2) {
            c cVar = this.a.get(str);
            if (cVar != null) {
                if (j2 <= j) {
                    c(str);
                }
                if (d(str, j, j2, cVar.getGranularityPercentage())) {
                    cVar.onProgress(str, j, j2);
                }
            }
        }

        public void b(String str, c cVar) {
            this.a.put(str, cVar);
        }

        public void c(String str) {
            this.a.remove(str);
            this.b.remove(str);
        }

        public /* synthetic */ C0034b(a aVar) {
            this();
        }
    }
}
