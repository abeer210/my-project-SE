package defpackage;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import android.os.UserManager;
import android.util.Log;
import androidx.core.content.c;
import vigqyno.C0201;

/* renamed from: kt0  reason: default package */
public abstract class kt0<T> {
    private static final Object g = new Object();
    @SuppressLint({"StaticFieldLeak"})
    private static Context h;
    private static volatile Boolean i;
    private static volatile Boolean j;
    private final ut0 a;
    public final String b;
    private final String c;
    private final T d;
    private volatile ht0 e;
    private volatile SharedPreferences f;

    private kt0(ut0 ut0, String str, T t) {
        this.e = null;
        this.f = null;
        if (ut0.c(ut0) == null && ut0.d(ut0) == null) {
            throw new IllegalArgumentException(C0201.m82(12596));
        } else if (ut0.c(ut0) == null || ut0.d(ut0) == null) {
            this.a = ut0;
            String valueOf = String.valueOf(ut0.g(ut0));
            String valueOf2 = String.valueOf(str);
            this.c = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
            String valueOf3 = String.valueOf(ut0.i(ut0));
            String valueOf4 = String.valueOf(str);
            this.b = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
            this.d = t;
        } else {
            throw new IllegalArgumentException(C0201.m82(12597));
        }
    }

    public /* synthetic */ kt0(ut0 ut0, String str, Object obj, ot0 ot0) {
        this(ut0, str, obj);
    }

    public static void b(Context context) {
        if (h == null) {
            synchronized (g) {
                if (Build.VERSION.SDK_INT < 24 || !context.isDeviceProtectedStorage()) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                }
                if (h != context) {
                    i = null;
                }
                h = context;
            }
        }
    }

    /* access modifiers changed from: private */
    public static <T> kt0<T> c(ut0 ut0, String str, T t, tt0<T> tt0) {
        return new rt0(ut0, str, t, tt0);
    }

    /* access modifiers changed from: private */
    public static kt0<String> d(ut0 ut0, String str, String str2) {
        return new qt0(ut0, str, str2);
    }

    /* access modifiers changed from: private */
    public static kt0<Boolean> e(ut0 ut0, String str, boolean z) {
        return new pt0(ut0, str, Boolean.valueOf(z));
    }

    private static <V> V g(st0<V> st0) {
        long clearCallingIdentity;
        try {
            return st0.a();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            V a2 = st0.a();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return a2;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }

    public static boolean h(String str, boolean z) {
        if (p()) {
            return ((Boolean) g(new nt0(str, false))).booleanValue();
        }
        return false;
    }

    @TargetApi(24)
    private final T n() {
        boolean z;
        if (h(C0201.m82(12598), false)) {
            String r0 = C0201.m82(12599);
            String valueOf = String.valueOf(this.b);
            Log.w(C0201.m82(12600), valueOf.length() != 0 ? r0.concat(valueOf) : new String(r0));
        } else if (ut0.d(this.a) != null) {
            if (this.e == null) {
                this.e = ht0.a(h.getContentResolver(), ut0.d(this.a));
            }
            String str = (String) g(new lt0(this, this.e));
            if (str != null) {
                return m(str);
            }
        } else if (ut0.c(this.a) != null) {
            if (Build.VERSION.SDK_INT < 24 || h.isDeviceProtectedStorage()) {
                z = true;
            } else {
                if (j == null || !j.booleanValue()) {
                    j = Boolean.valueOf(((UserManager) h.getSystemService(UserManager.class)).isUserUnlocked());
                }
                z = j.booleanValue();
            }
            if (!z) {
                return null;
            }
            if (this.f == null) {
                this.f = h.getSharedPreferences(ut0.c(this.a), 0);
            }
            SharedPreferences sharedPreferences = this.f;
            if (sharedPreferences.contains(this.b)) {
                return f(sharedPreferences);
            }
        }
        return null;
    }

    private final T o() {
        String str;
        if (ut0.k(this.a) || !p() || (str = (String) g(new mt0(this))) == null) {
            return null;
        }
        return m(str);
    }

    private static boolean p() {
        if (i == null) {
            Context context = h;
            boolean z = false;
            if (context == null) {
                return false;
            }
            if (c.a(context, C0201.m82(12601)) == 0) {
                z = true;
            }
            i = Boolean.valueOf(z);
        }
        return i.booleanValue();
    }

    public final T a() {
        if (h != null) {
            if (ut0.j(this.a)) {
                T o = o();
                if (o != null) {
                    return o;
                }
                T n = n();
                if (n != null) {
                    return n;
                }
            } else {
                T n2 = n();
                if (n2 != null) {
                    return n2;
                }
                T o2 = o();
                if (o2 != null) {
                    return o2;
                }
            }
            return this.d;
        }
        throw new IllegalStateException(C0201.m82(12602));
    }

    public abstract T f(SharedPreferences sharedPreferences);

    public abstract T m(String str);

    public final /* synthetic */ String q() {
        return f01.c(h.getContentResolver(), this.c, null);
    }
}
