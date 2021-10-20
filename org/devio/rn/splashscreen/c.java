package org.devio.rn.splashscreen;

import android.app.Activity;
import android.app.Dialog;
import android.os.Build;
import java.lang.ref.WeakReference;

/* compiled from: SplashScreen */
public class c {
    private static Dialog a;
    private static WeakReference<Activity> b;

    /* access modifiers changed from: package-private */
    /* compiled from: SplashScreen */
    public static class a implements Runnable {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ int b;

        public a(Activity activity, int i) {
            this.a = activity;
            this.b = i;
        }

        public void run() {
            if (!this.a.isFinishing()) {
                Dialog unused = c.a = new Dialog(this.a, this.b);
                c.a.setContentView(a.launch_screen);
                c.a.setCancelable(false);
                if (!c.a.isShowing()) {
                    c.a.show();
                }
            }
        }
    }

    /* compiled from: SplashScreen */
    static class b implements Runnable {
        public final /* synthetic */ Activity a;

        public b(Activity activity) {
            this.a = activity;
        }

        public void run() {
            if (c.a != null && c.a.isShowing()) {
                boolean z = false;
                if (Build.VERSION.SDK_INT >= 17) {
                    z = this.a.isDestroyed();
                }
                if (!this.a.isFinishing() && !z) {
                    c.a.dismiss();
                }
                Dialog unused = c.a = null;
            }
        }
    }

    public static void c(Activity activity) {
        if (activity == null) {
            WeakReference<Activity> weakReference = b;
            if (weakReference != null) {
                activity = weakReference.get();
            } else {
                return;
            }
        }
        if (activity != null) {
            activity.runOnUiThread(new b(activity));
        }
    }

    public static void d(Activity activity) {
        f(activity, false);
    }

    public static void e(Activity activity, int i) {
        if (activity != null) {
            b = new WeakReference<>(activity);
            activity.runOnUiThread(new a(activity, i));
        }
    }

    public static void f(Activity activity, boolean z) {
        e(activity, z ? b.SplashScreen_Fullscreen : b.SplashScreen_SplashTheme);
    }
}
