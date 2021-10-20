package com.facebook.react.modules.network;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import okhttp3.Cache;
import okhttp3.ConnectionSpec;
import okhttp3.OkHttpClient;
import okhttp3.TlsVersion;
import vigqyno.C0201;

/* compiled from: OkHttpClientProvider */
public class g {
    private static OkHttpClient a;
    private static f b;

    public static OkHttpClient a() {
        f fVar = b;
        if (fVar != null) {
            return fVar.a();
        }
        return c().build();
    }

    public static OkHttpClient b(Context context) {
        f fVar = b;
        if (fVar != null) {
            return fVar.a();
        }
        return d(context).build();
    }

    public static OkHttpClient.Builder c() {
        OkHttpClient.Builder cookieJar = new OkHttpClient.Builder().connectTimeout(0, TimeUnit.MILLISECONDS).readTimeout(0, TimeUnit.MILLISECONDS).writeTimeout(0, TimeUnit.MILLISECONDS).cookieJar(new l());
        try {
            Security.insertProviderAt((Provider) Class.forName(C0201.m82(5714)).newInstance(), 1);
            return cookieJar;
        } catch (Exception unused) {
            f(cookieJar);
            return cookieJar;
        }
    }

    public static OkHttpClient.Builder d(Context context) {
        return e(context, 10485760);
    }

    public static OkHttpClient.Builder e(Context context, int i) {
        OkHttpClient.Builder c = c();
        if (i == 0) {
            return c;
        }
        return c.cache(new Cache(new File(context.getCacheDir(), C0201.m82(5715)), (long) i));
    }

    public static OkHttpClient.Builder f(OkHttpClient.Builder builder) {
        if (Build.VERSION.SDK_INT <= 19) {
            try {
                builder.sslSocketFactory(new o());
                ConnectionSpec build = new ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS).tlsVersions(TlsVersion.TLS_1_2).build();
                ArrayList arrayList = new ArrayList();
                arrayList.add(build);
                arrayList.add(ConnectionSpec.COMPATIBLE_TLS);
                arrayList.add(ConnectionSpec.CLEARTEXT);
                builder.connectionSpecs(arrayList);
            } catch (Exception e) {
                f60.j(C0201.m82(5716), C0201.m82(5717), e);
            }
        }
        return builder;
    }

    public static OkHttpClient g() {
        if (a == null) {
            a = a();
        }
        return a;
    }
}
