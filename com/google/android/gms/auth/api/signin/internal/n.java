package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

public final class n {
    private static n b;
    private c a;

    private n(Context context) {
        c b2 = c.b(context);
        this.a = b2;
        b2.c();
        this.a.d();
    }

    public static synchronized n c(Context context) {
        n d;
        synchronized (n.class) {
            d = d(context.getApplicationContext());
        }
        return d;
    }

    private static synchronized n d(Context context) {
        n nVar;
        synchronized (n.class) {
            if (b == null) {
                b = new n(context);
            }
            nVar = b;
        }
        return nVar;
    }

    public final synchronized void a() {
        this.a.a();
    }

    public final synchronized void b(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.a.f(googleSignInAccount, googleSignInOptions);
    }
}
