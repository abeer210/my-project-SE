package com.google.firebase.iid;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Executor;

public final class v0 implements b {
    private final l12 a;
    private final q b;
    private final x c;
    private final Executor d;
    private final f22 e;

    public v0(l12 l12, q qVar, Executor executor, f22 f22) {
        this(l12, qVar, executor, new x(l12.i(), qVar), f22);
    }

    private final zs1<Bundle> h(String str, String str2, String str3, Bundle bundle) {
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.a.n().c());
        bundle.putString("gmsv", Integer.toString(this.b.f()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.b.d());
        bundle.putString("app_ver_name", this.b.e());
        bundle.putString("cliv", "fiid-12451000");
        bundle.putString("Firebase-Client", this.e.a());
        at1 at1 = new at1();
        this.d.execute(new u0(this, bundle, at1));
        return at1.a();
    }

    /* access modifiers changed from: private */
    public static String i(Bundle bundle) throws IOException {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if ("RST".equals(string3)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string3 != null) {
                throw new IOException(string3);
            } else {
                String valueOf = String.valueOf(bundle);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                sb.append("Unexpected response: ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString(), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    private final <T> zs1<Void> l(zs1<T> zs1) {
        return zs1.i(k0.c(), new x0(this));
    }

    private final zs1<String> m(zs1<Bundle> zs1) {
        return zs1.i(this.d, new w0(this));
    }

    @Override // com.google.firebase.iid.b
    public final zs1<Void> a(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        bundle.putString("delete", "1");
        String valueOf2 = String.valueOf(str3);
        return l(m(h(str, str2, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle)));
    }

    @Override // com.google.firebase.iid.b
    public final zs1<Void> b(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        String valueOf2 = String.valueOf(str3);
        return l(m(h(str, str2, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle)));
    }

    @Override // com.google.firebase.iid.b
    public final zs1<Void> c(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("iid-operation", "delete");
        bundle.putString("delete", "1");
        return l(m(h(str, "*", "*", bundle)));
    }

    @Override // com.google.firebase.iid.b
    public final zs1<String> d(String str, String str2, String str3, String str4) {
        return m(h(str, str3, str4, new Bundle()));
    }

    @Override // com.google.firebase.iid.b
    public final boolean e() {
        return false;
    }

    @Override // com.google.firebase.iid.b
    public final zs1<Void> f(String str, String str2, String str3, String str4) {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return l(m(h(str, str3, str4, bundle)));
    }

    @Override // com.google.firebase.iid.b
    public final boolean g() {
        return this.b.c() != 0;
    }

    public final /* synthetic */ void k(Bundle bundle, at1 at1) {
        try {
            at1.c(this.c.f(bundle));
        } catch (IOException e2) {
            at1.b(e2);
        }
    }

    private v0(l12 l12, q qVar, Executor executor, x xVar, f22 f22) {
        this.a = l12;
        this.b = qVar;
        this.c = xVar;
        this.d = executor;
        this.e = f22;
    }
}
