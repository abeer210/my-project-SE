package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.u;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class c {
    private static final Lock c = new ReentrantLock();
    private static c d;
    private final Lock a = new ReentrantLock();
    private final SharedPreferences b;

    private c(Context context) {
        this.b = context.getSharedPreferences(C0201.m82(2442), 0);
    }

    public static c b(Context context) {
        u.k(context);
        c.lock();
        try {
            if (d == null) {
                d = new c(context.getApplicationContext());
            }
            return d;
        } finally {
            c.unlock();
        }
    }

    private final void g(String str, String str2) {
        this.a.lock();
        try {
            this.b.edit().putString(str, str2).apply();
        } finally {
            this.a.unlock();
        }
    }

    private static String h(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(C0201.m82(2443));
        sb.append(str2);
        return sb.toString();
    }

    private final GoogleSignInAccount i(String str) {
        String k;
        if (!TextUtils.isEmpty(str) && (k = k(h(C0201.m82(2444), str))) != null) {
            try {
                return GoogleSignInAccount.E(k);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    private final GoogleSignInOptions j(String str) {
        String k;
        if (!TextUtils.isEmpty(str) && (k = k(h(C0201.m82(2445), str))) != null) {
            try {
                return GoogleSignInOptions.D(k);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    private final String k(String str) {
        this.a.lock();
        try {
            return this.b.getString(str, null);
        } finally {
            this.a.unlock();
        }
    }

    private final void m(String str) {
        this.a.lock();
        try {
            this.b.edit().remove(str).apply();
        } finally {
            this.a.unlock();
        }
    }

    public void a() {
        this.a.lock();
        try {
            this.b.edit().clear().apply();
        } finally {
            this.a.unlock();
        }
    }

    public GoogleSignInAccount c() {
        return i(k(C0201.m82(2446)));
    }

    public GoogleSignInOptions d() {
        return j(k(C0201.m82(2447)));
    }

    public String e() {
        return k(C0201.m82(2448));
    }

    public void f(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        u.k(googleSignInAccount);
        u.k(googleSignInOptions);
        g(C0201.m82(2449), googleSignInAccount.G());
        u.k(googleSignInAccount);
        u.k(googleSignInOptions);
        String G = googleSignInAccount.G();
        g(h(C0201.m82(2450), G), googleSignInAccount.H());
        g(h(C0201.m82(2451), G), googleSignInOptions.Q());
    }

    public final void l() {
        String r0 = C0201.m82(2452);
        String k = k(r0);
        m(r0);
        if (!TextUtils.isEmpty(k)) {
            m(h(C0201.m82(2453), k));
            m(h(C0201.m82(2454), k));
        }
    }
}
