package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import vigqyno.C0201;

/* compiled from: ActivityRecreator */
public final class b {
    public static final Class<?> a = a();
    public static final Field b = b();
    public static final Field c = f();
    public static final Method d = d(a);
    public static final Method e = c(a);
    public static final Method f = e(a);
    private static final Handler g = new Handler(Looper.getMainLooper());

    /* access modifiers changed from: package-private */
    /* compiled from: ActivityRecreator */
    public static class a implements Runnable {
        public final /* synthetic */ d a;
        public final /* synthetic */ Object b;

        public a(d dVar, Object obj) {
            this.a = dVar;
            this.b = obj;
        }

        public void run() {
            this.a.a = this.b;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.b$b  reason: collision with other inner class name */
    /* compiled from: ActivityRecreator */
    public static class RunnableC0013b implements Runnable {
        public final /* synthetic */ Application a;
        public final /* synthetic */ d b;

        public RunnableC0013b(Application application, d dVar) {
            this.a = application;
            this.b = dVar;
        }

        public void run() {
            this.a.unregisterActivityLifecycleCallbacks(this.b);
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: ActivityRecreator */
    public static class c implements Runnable {
        public final /* synthetic */ Object a;
        public final /* synthetic */ Object b;

        public c(Object obj, Object obj2) {
            this.a = obj;
            this.b = obj2;
        }

        public void run() {
            try {
                if (b.d != null) {
                    b.d.invoke(this.a, this.b, Boolean.FALSE, C0201.m82(36995));
                    return;
                }
                b.e.invoke(this.a, this.b, Boolean.FALSE);
            } catch (RuntimeException e) {
                if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith(C0201.m82(36998))) {
                    throw e;
                }
            } catch (Throwable th) {
                Log.e(C0201.m82(36996), C0201.m82(36997), th);
            }
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: ActivityRecreator */
    public static final class d implements Application.ActivityLifecycleCallbacks {
        public Object a;
        private Activity b;
        private boolean c = false;
        private boolean d = false;
        private boolean e = false;

        public d(Activity activity) {
            this.b = activity;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.b == activity) {
                this.b = null;
                this.d = true;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (this.d && !this.e && !this.c && b.h(this.a, activity)) {
                this.e = true;
                this.a = null;
            }
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.b == activity) {
                this.c = true;
            }
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    private static Class<?> a() {
        try {
            return Class.forName(C0201.m82(21116));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField(C0201.m82(21117));
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod(C0201.m82(21118), IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod(C0201.m82(21119), IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class<?> cls) {
        if (g() && cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(C0201.m82(21120), IBinder.class, List.class, List.class, Integer.TYPE, Boolean.TYPE, Configuration.class, Configuration.class, Boolean.TYPE, Boolean.TYPE);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField(C0201.m82(21121));
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    public static boolean h(Object obj, Activity activity) {
        try {
            Object obj2 = c.get(activity);
            if (obj2 != obj) {
                return false;
            }
            g.postAtFrontOfQueue(new c(b.get(activity), obj2));
            return true;
        } catch (Throwable th) {
            Log.e(C0201.m82(21122), C0201.m82(21123), th);
            return false;
        }
    }

    public static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (g() && f == null) {
            return false;
        } else {
            if (e == null && d == null) {
                return false;
            }
            try {
                Object obj2 = c.get(activity);
                if (obj2 == null || (obj = b.get(activity)) == null) {
                    return false;
                }
                Application application = activity.getApplication();
                d dVar = new d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                g.post(new a(dVar, obj2));
                try {
                    if (g()) {
                        f.invoke(obj, obj2, null, null, 0, Boolean.FALSE, null, null, Boolean.FALSE, Boolean.FALSE);
                    } else {
                        activity.recreate();
                    }
                    return true;
                } finally {
                    g.post(new RunnableC0013b(application, dVar));
                }
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
