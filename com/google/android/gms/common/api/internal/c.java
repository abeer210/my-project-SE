package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.common.util.l;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    private static final c e = new c();
    private final AtomicBoolean a = new AtomicBoolean();
    private final AtomicBoolean b = new AtomicBoolean();
    private final ArrayList<a> c = new ArrayList<>();
    private boolean d = false;

    /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
    public interface a {
        void a(boolean z);
    }

    private c() {
    }

    public static c b() {
        return e;
    }

    public static void c(Application application) {
        synchronized (e) {
            if (!e.d) {
                application.registerActivityLifecycleCallbacks(e);
                application.registerComponentCallbacks(e);
                e.d = true;
            }
        }
    }

    private final void e(boolean z) {
        synchronized (e) {
            ArrayList<a> arrayList = this.c;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                a aVar = arrayList.get(i);
                i++;
                aVar.a(z);
            }
        }
    }

    public final void a(a aVar) {
        synchronized (e) {
            this.c.add(aVar);
        }
    }

    public final boolean d() {
        return this.a.get();
    }

    @TargetApi(16)
    public final boolean f(boolean z) {
        if (!this.b.get()) {
            if (!l.c()) {
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.b.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.a.set(true);
            }
        }
        return d();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.a.compareAndSet(true, false);
        this.b.set(true);
        if (compareAndSet) {
            e(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.a.compareAndSet(true, false);
        this.b.set(true);
        if (compareAndSet) {
            e(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.a.compareAndSet(false, true)) {
            this.b.set(true);
            e(true);
        }
    }
}
