package androidx.core.app;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* compiled from: ActivityCompat */
public class a extends androidx.core.content.b {
    private static c c;

    /* renamed from: androidx.core.app.a$a  reason: collision with other inner class name */
    /* compiled from: ActivityCompat */
    static class RunnableC0012a implements Runnable {
        public final /* synthetic */ String[] a;
        public final /* synthetic */ Activity b;
        public final /* synthetic */ int c;

        public RunnableC0012a(String[] strArr, Activity activity, int i) {
            this.a = strArr;
            this.b = activity;
            this.c = i;
        }

        public void run() {
            int[] iArr = new int[this.a.length];
            PackageManager packageManager = this.b.getPackageManager();
            String packageName = this.b.getPackageName();
            int length = this.a.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.a[i], packageName);
            }
            ((b) this.b).onRequestPermissionsResult(this.c, this.a, iArr);
        }
    }

    /* compiled from: ActivityCompat */
    public interface b {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* compiled from: ActivityCompat */
    public interface c {
        boolean a(Activity activity, String[] strArr, int i);

        boolean onActivityResult(Activity activity, int i, int i2, Intent intent);
    }

    /* compiled from: ActivityCompat */
    public interface d {
        void a(int i);
    }

    public static void l(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    public static c m() {
        return c;
    }

    public static void n(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else if (!b.i(activity)) {
            activity.recreate();
        }
    }

    public static void o(Activity activity, String[] strArr, int i) {
        c cVar = c;
        if (cVar != null && cVar.a(activity, strArr, i)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof d) {
                ((d) activity).a(i);
            }
            activity.requestPermissions(strArr, i);
        } else if (activity instanceof b) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0012a(strArr, activity, i));
        }
    }

    public static boolean p(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    public static void q(Activity activity, Intent intent, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }

    public static void r(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
        }
    }
}
