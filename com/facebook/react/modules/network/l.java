package com.facebook.react.modules.network;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;

/* compiled from: ReactCookieJarContainer */
public class l implements a {
    private CookieJar a = null;

    @Override // com.facebook.react.modules.network.a
    public void a() {
        this.a = null;
    }

    @Override // com.facebook.react.modules.network.a
    public void b(CookieJar cookieJar) {
        this.a = cookieJar;
    }

    @Override // okhttp3.CookieJar
    public List<Cookie> loadForRequest(HttpUrl httpUrl) {
        CookieJar cookieJar = this.a;
        if (cookieJar == null) {
            return Collections.emptyList();
        }
        List<Cookie> loadForRequest = cookieJar.loadForRequest(httpUrl);
        ArrayList arrayList = new ArrayList();
        for (Cookie cookie : loadForRequest) {
            try {
                new Headers.Builder().add(cookie.name(), cookie.value());
                arrayList.add(cookie);
            } catch (IllegalArgumentException unused) {
            }
        }
        return arrayList;
    }

    @Override // okhttp3.CookieJar
    public void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        CookieJar cookieJar = this.a;
        if (cookieJar != null) {
            cookieJar.saveFromResponse(httpUrl, list);
        }
    }
}
