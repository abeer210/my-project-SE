package com.facebook.react.modules.network;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.ValueCallback;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.GuardedResultAsyncTask;
import com.facebook.react.bridge.ReactContext;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import vigqyno.C0201;

/* compiled from: ForwardingCookieHandler */
public class c extends CookieHandler {
    private static final boolean d = (Build.VERSION.SDK_INT < 21);
    private final e a = new e();
    private final ReactContext b;
    private CookieManager c;

    /* compiled from: ForwardingCookieHandler */
    class a extends GuardedResultAsyncTask<Boolean> {
        public final /* synthetic */ Callback a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ReactContext reactContext, Callback callback) {
            super(reactContext);
            this.a = callback;
        }

        /* renamed from: a */
        public Boolean doInBackgroundGuarded() {
            CookieManager j = c.this.j();
            if (j != null) {
                j.removeAllCookie();
            }
            c.this.a.c();
            return Boolean.TRUE;
        }

        /* renamed from: b */
        public void onPostExecuteGuarded(Boolean bool) {
            this.a.invoke(bool);
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: ForwardingCookieHandler */
    public class b implements ValueCallback<Boolean> {
        public final /* synthetic */ Callback a;

        public b(Callback callback) {
            this.a = callback;
        }

        /* renamed from: a */
        public void onReceiveValue(Boolean bool) {
            c.this.a.c();
            this.a.invoke(bool);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.react.modules.network.c$c  reason: collision with other inner class name */
    /* compiled from: ForwardingCookieHandler */
    public class RunnableC0046c implements Runnable {
        public final /* synthetic */ List a;
        public final /* synthetic */ CookieManager b;
        public final /* synthetic */ String c;

        public RunnableC0046c(List list, CookieManager cookieManager, String str) {
            this.a = list;
            this.b = cookieManager;
            this.c = str;
        }

        public void run() {
            for (String str : this.a) {
                this.b.setCookie(this.c, str);
            }
            c.this.a.c();
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: ForwardingCookieHandler */
    public class d extends GuardedAsyncTask<Void, Void> {
        public final /* synthetic */ Runnable a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(c cVar, ReactContext reactContext, Runnable runnable) {
            super(reactContext);
            this.a = runnable;
        }

        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            this.a.run();
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: ForwardingCookieHandler */
    public class e {
        private final Handler a;

        /* compiled from: ForwardingCookieHandler */
        class a implements Handler.Callback {
            public a(c cVar) {
            }

            public boolean handleMessage(Message message) {
                if (message.what != 1) {
                    return false;
                }
                e.this.d();
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* compiled from: ForwardingCookieHandler */
        public class b implements Runnable {
            public b() {
            }

            public void run() {
                if (c.d) {
                    CookieSyncManager.getInstance().sync();
                } else {
                    e.this.b();
                }
            }
        }

        public e() {
            this.a = new Handler(Looper.getMainLooper(), new a(c.this));
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        @TargetApi(21)
        private void b() {
            CookieManager j = c.this.j();
            if (j != null) {
                j.flush();
            }
        }

        public void c() {
            if (c.d) {
                this.a.sendEmptyMessageDelayed(1, 30000);
            }
        }

        public void d() {
            this.a.removeMessages(1);
            c.this.m(new b());
        }
    }

    public c(ReactContext reactContext) {
        this.b = reactContext;
    }

    @TargetApi(21)
    private void e(String str, String str2) {
        CookieManager j = j();
        if (j != null) {
            j.setCookie(str, str2, null);
        }
    }

    private void h(Callback callback) {
        CookieManager j = j();
        if (j != null) {
            j.removeAllCookies(new b(callback));
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private CookieManager j() {
        if (this.c == null) {
            l(this.b);
            try {
                CookieManager instance = CookieManager.getInstance();
                this.c = instance;
                if (d) {
                    instance.removeExpiredCookie();
                }
            } catch (IllegalArgumentException unused) {
                return null;
            } catch (Exception e2) {
                if (e2.getMessage() != null && e2.getClass().getCanonicalName().equals(C0201.m82(5858))) {
                    return null;
                }
                throw e2;
            }
        }
        return this.c;
    }

    private static boolean k(String str) {
        return str.equalsIgnoreCase(C0201.m82(5859)) || str.equalsIgnoreCase(C0201.m82(5860));
    }

    private static void l(Context context) {
        if (d) {
            CookieSyncManager.createInstance(context).sync();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void m(Runnable runnable) {
        new d(this, this.b, runnable).execute(new Void[0]);
    }

    public void f(String str, List<String> list) {
        CookieManager j = j();
        if (j != null) {
            if (d) {
                m(new RunnableC0046c(list, j, str));
                return;
            }
            for (String str2 : list) {
                e(str, str2);
            }
            j.flush();
            this.a.c();
        }
    }

    public void g(Callback callback) {
        if (d) {
            new a(this.b, callback).execute(new Void[0]);
        } else {
            h(callback);
        }
    }

    @Override // java.net.CookieHandler
    public Map<String, List<String>> get(URI uri, Map<String, List<String>> map) throws IOException {
        CookieManager j = j();
        if (j == null) {
            return Collections.emptyMap();
        }
        String cookie = j.getCookie(uri.toString());
        if (TextUtils.isEmpty(cookie)) {
            return Collections.emptyMap();
        }
        return Collections.singletonMap(C0201.m82(5861), Collections.singletonList(cookie));
    }

    public void i() {
        if (d) {
            CookieManager j = j();
            if (j != null) {
                j.removeExpiredCookie();
            }
            this.a.d();
        }
    }

    @Override // java.net.CookieHandler
    public void put(URI uri, Map<String, List<String>> map) throws IOException {
        String uri2 = uri.toString();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key != null && k(key)) {
                f(uri2, entry.getValue());
            }
        }
    }
}
