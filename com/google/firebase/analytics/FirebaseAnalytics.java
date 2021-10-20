package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.measurement.internal.h9;
import com.google.android.gms.measurement.internal.n6;
import com.google.android.gms.measurement.internal.o4;
import com.google.firebase.iid.FirebaseInstanceId;

public final class FirebaseAnalytics {
    private static volatile FirebaseAnalytics d;
    private final o4 a;
    private final sh1 b;
    private final boolean c;

    private FirebaseAnalytics(o4 o4Var) {
        u.k(o4Var);
        this.a = o4Var;
        this.b = null;
        this.c = false;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (d == null) {
            synchronized (FirebaseAnalytics.class) {
                if (d == null) {
                    if (sh1.R(context)) {
                        d = new FirebaseAnalytics(sh1.x(context));
                    } else {
                        d = new FirebaseAnalytics(o4.g(context, null));
                    }
                }
            }
        }
        return d;
    }

    @Keep
    public static n6 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        sh1 y;
        if (sh1.R(context) && (y = sh1.y(context, null, null, null, bundle)) != null) {
            return new a(y);
        }
        return null;
    }

    public final void a(String str, Bundle bundle) {
        if (this.c) {
            this.b.k(str, bundle);
        } else {
            this.a.L().b0("app", str, bundle, true);
        }
    }

    public final void b(boolean z) {
        if (this.c) {
            this.b.p(z);
        } else {
            this.a.L().N(z);
        }
    }

    @Deprecated
    public final void c(long j) {
        if (this.c) {
            this.b.q(j);
        } else {
            this.a.L().O(j);
        }
    }

    public final void d(long j) {
        if (this.c) {
            this.b.r(j);
        } else {
            this.a.L().P(j);
        }
    }

    public final void e(String str) {
        if (this.c) {
            this.b.s(str);
        } else {
            this.a.L().k0("app", "_id", str, true);
        }
    }

    public final void f(String str, String str2) {
        if (this.c) {
            this.b.t(str, str2);
        } else {
            this.a.L().k0("app", str, str2, false);
        }
    }

    @Keep
    public final String getFirebaseInstanceId() {
        return FirebaseInstanceId.d().c();
    }

    @Keep
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        if (this.c) {
            this.b.n(activity, str, str2);
        } else if (!h9.a()) {
            this.a.e().H().d("setCurrentScreen must be called from the main thread");
        } else {
            this.a.O().G(activity, str, str2);
        }
    }

    private FirebaseAnalytics(sh1 sh1) {
        u.k(sh1);
        this.a = null;
        this.b = sh1;
        this.c = true;
    }
}
