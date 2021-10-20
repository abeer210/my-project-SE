package defpackage;

import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.os.Build;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContext;
import vigqyno.C0201;

/* renamed from: n8  reason: default package */
/* compiled from: TargetChosenReceiver */
public class n8 extends BroadcastReceiver {
    private static final Object a = new Object();
    private static String b;
    private static n8 c;
    private static Callback d;
    private static Callback e;

    @TargetApi(22)
    public static IntentSender a(ReactContext reactContext) {
        synchronized (a) {
            if (b == null) {
                b = reactContext.getPackageName() + C0201.m82(29671) + n8.class.getName() + C0201.m82(29672);
            }
            Context applicationContext = reactContext.getApplicationContext();
            if (c != null) {
                applicationContext.unregisterReceiver(c);
            }
            n8 n8Var = new n8();
            c = n8Var;
            applicationContext.registerReceiver(n8Var, new IntentFilter(b));
        }
        Intent intent = new Intent(b);
        intent.setPackage(reactContext.getPackageName());
        intent.putExtra(C0201.m82(29673), c.hashCode());
        return PendingIntent.getBroadcast(reactContext, 0, intent, 1342177280).getIntentSender();
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 22;
    }

    public static void c(Callback callback, Callback callback2) {
        d = callback;
        e = callback2;
    }

    public static void d(boolean z, Object... objArr) {
        if (z) {
            Callback callback = d;
            if (callback != null) {
                callback.invoke(objArr);
            }
        } else {
            Callback callback2 = e;
            if (callback2 != null) {
                callback2.invoke(objArr);
            }
        }
        d = null;
        e = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r6.hasExtra(vigqyno.C0201.m82(29674)) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        if (r6.getIntExtra(vigqyno.C0201.m82(29675), 0) == hashCode()) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        r5 = (android.content.ComponentName) r6.getParcelableExtra(vigqyno.C0201.m82(29676));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        if (r5 == null) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        d(true, java.lang.Boolean.TRUE, r5.flattenToString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0057, code lost:
        d(true, java.lang.Boolean.TRUE, vigqyno.C0201.m82(29677));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    public void onReceive(Context context, Intent intent) {
        synchronized (a) {
            if (c == this) {
                context.getApplicationContext().unregisterReceiver(c);
                c = null;
            }
        }
    }
}
