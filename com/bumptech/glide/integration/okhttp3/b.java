package com.bumptech.glide.integration.okhttp3;

import android.util.Log;
import com.bumptech.glide.g;
import com.bumptech.glide.load.a;
import com.bumptech.glide.load.e;
import defpackage.vg;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import vigqyno.C0201;

/* compiled from: OkHttpStreamFetcher */
public class b implements vg<InputStream>, Callback {
    private final Call.Factory a;
    private final sj b;
    private InputStream c;
    private ResponseBody d;
    private vg.a<? super InputStream> e;
    private volatile Call f;

    public b(Call.Factory factory, sj sjVar) {
        this.a = factory;
        this.b = sjVar;
    }

    @Override // defpackage.vg
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // defpackage.vg
    public void b() {
        try {
            if (this.c != null) {
                this.c.close();
            }
        } catch (IOException unused) {
        }
        ResponseBody responseBody = this.d;
        if (responseBody != null) {
            responseBody.close();
        }
        this.e = null;
    }

    @Override // defpackage.vg
    public void cancel() {
        Call call = this.f;
        if (call != null) {
            call.cancel();
        }
    }

    @Override // defpackage.vg
    public a d() {
        return a.REMOTE;
    }

    @Override // defpackage.vg
    public void e(g gVar, vg.a<? super InputStream> aVar) {
        Request.Builder url = new Request.Builder().url(this.b.h());
        for (Map.Entry<String, String> entry : this.b.e().entrySet()) {
            url.addHeader(entry.getKey(), entry.getValue());
        }
        Request build = url.build();
        this.e = aVar;
        this.f = this.a.newCall(build);
        c40.a(this.f, this);
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException iOException) {
        String r0 = C0201.m82(29783);
        c40.d(call, iOException);
        try {
            if (Log.isLoggable(r0, 3)) {
                Log.d(r0, C0201.m82(29784), iOException);
            }
            this.e.c(iOException);
        } finally {
            c40.e();
        }
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        c40.f(call, response);
        try {
            this.d = response.body();
            if (response.isSuccessful()) {
                ResponseBody responseBody = this.d;
                ep.d(responseBody);
                InputStream c2 = xo.c(this.d.byteStream(), responseBody.contentLength());
                this.c = c2;
                this.e.f(c2);
            } else {
                this.e.c(new e(response.message(), response.code()));
            }
        } finally {
            c40.g();
        }
    }
}
