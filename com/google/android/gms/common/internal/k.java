package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public abstract class k {
    private static final Object a = new Object();
    private static k b;

    /* access modifiers changed from: protected */
    /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
    public static final class a {
        private static final Uri f = new Uri.Builder().scheme(C0201.m82(9150)).authority(C0201.m82(9151)).build();
        private final String a;
        private final String b;
        private final ComponentName c;
        private final int d;
        private final boolean e;

        public a(String str, String str2, int i) {
            this(str, str2, i, false);
        }

        public final ComponentName a() {
            return this.c;
        }

        public final String b() {
            return this.b;
        }

        public final Intent c(Context context) {
            if (this.a == null) {
                return new Intent().setComponent(this.c);
            }
            Intent intent = null;
            if (this.e) {
                Bundle bundle = new Bundle();
                bundle.putString(C0201.m82(9152), this.a);
                Bundle call = context.getContentResolver().call(f, C0201.m82(9153), (String) null, bundle);
                if (call != null) {
                    intent = (Intent) call.getParcelable(C0201.m82(9154));
                }
                if (intent == null) {
                    String r5 = C0201.m82(9155);
                    String valueOf = String.valueOf(this.a);
                    Log.w(C0201.m82(9156), valueOf.length() != 0 ? r5.concat(valueOf) : new String(r5));
                }
            }
            if (intent == null) {
                return new Intent(this.a).setPackage(this.b);
            }
            return intent;
        }

        public final int d() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return s.a(this.a, aVar.a) && s.a(this.b, aVar.b) && s.a(this.c, aVar.c) && this.d == aVar.d && this.e == aVar.e;
        }

        public final int hashCode() {
            return s.b(this.a, this.b, this.c, Integer.valueOf(this.d), Boolean.valueOf(this.e));
        }

        public final String toString() {
            String str = this.a;
            return str == null ? this.c.flattenToString() : str;
        }

        public a(String str, String str2, int i, boolean z) {
            u.g(str);
            this.a = str;
            u.g(str2);
            this.b = str2;
            this.c = null;
            this.d = i;
            this.e = z;
        }
    }

    public static k a(Context context) {
        synchronized (a) {
            if (b == null) {
                b = new n0(context.getApplicationContext());
            }
        }
        return b;
    }

    public final void b(String str, String str2, int i, ServiceConnection serviceConnection, String str3) {
        d(new a(str, str2, i), serviceConnection, str3);
    }

    public abstract boolean c(a aVar, ServiceConnection serviceConnection, String str);

    public abstract void d(a aVar, ServiceConnection serviceConnection, String str);
}
