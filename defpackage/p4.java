package defpackage;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import vigqyno.C0201;

@Deprecated
/* renamed from: p4  reason: default package */
/* compiled from: WakefulBroadcastReceiver */
public abstract class p4 extends BroadcastReceiver {
    private static final SparseArray<PowerManager.WakeLock> a = new SparseArray<>();
    private static int b = 1;

    public static boolean c(Intent intent) {
        int intExtra = intent.getIntExtra(C0201.m82(33727), 0);
        if (intExtra == 0) {
            return false;
        }
        synchronized (a) {
            PowerManager.WakeLock wakeLock = a.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                a.remove(intExtra);
                return true;
            }
            String r1 = C0201.m82(33728);
            Log.w(r1, C0201.m82(33729) + intExtra);
            return true;
        }
    }

    public static ComponentName d(Context context, Intent intent) {
        synchronized (a) {
            int i = b;
            int i2 = b + 1;
            b = i2;
            if (i2 <= 0) {
                b = 1;
            }
            intent.putExtra(C0201.m82(33730), i);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService(C0201.m82(33731))).newWakeLock(1, C0201.m82(33732) + startService.flattenToShortString());
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(60000);
            a.put(i, newWakeLock);
            return startService;
        }
    }
}
