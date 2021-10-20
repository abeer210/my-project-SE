package com.facebook.react.modules.fresco;

import android.net.Uri;
import android.os.SystemClock;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import defpackage.ic0;
import defpackage.ng0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* compiled from: ReactOkHttpNetworkFetcher */
public class b extends ic0 {
    private final OkHttpClient d;
    private final Executor e;

    public b(OkHttpClient okHttpClient) {
        super(okHttpClient);
        this.d = okHttpClient;
        this.e = okHttpClient.dispatcher().executorService();
    }

    private Map<String, String> n(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        HashMap hashMap = new HashMap();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            hashMap.put(nextKey, readableMap.getString(nextKey));
        }
        return hashMap;
    }

    @Override // defpackage.ic0
    /* renamed from: i */
    public void d(ic0.c cVar, ng0.a aVar) {
        cVar.f = SystemClock.elapsedRealtime();
        Uri h = cVar.h();
        Map<String, String> n = cVar.b().c() instanceof a ? n(((a) cVar.b().c()).x()) : null;
        if (n == null) {
            n = Collections.emptyMap();
        }
        j(cVar, aVar, new Request.Builder().cacheControl(new CacheControl.Builder().noStore().build()).url(h.toString()).headers(Headers.of(n)).get().build());
    }
}
