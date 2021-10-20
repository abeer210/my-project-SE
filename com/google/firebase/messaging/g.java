package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.i;
import com.google.android.gms.common.util.l;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class g {
    private final Executor a;
    private final Context b;
    private final f c;
    private final Bundle d;

    public g(Context context, Bundle bundle, Executor executor) {
        this.a = executor;
        this.b = context;
        this.d = bundle;
        this.c = new f(context, context.getPackageName());
    }

    public final boolean a() {
        boolean z;
        if ("1".equals(f.b(this.d, "gcm.n.noui"))) {
            return true;
        }
        if (!((KeyguardManager) this.b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            if (!l.g()) {
                SystemClock.sleep(10);
            }
            int myPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.b.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == myPid) {
                        if (next.importance == 100) {
                            z = true;
                        }
                    }
                }
            }
        }
        z = false;
        if (z) {
            return false;
        }
        h m = h.m(f.b(this.d, "gcm.n.image"));
        if (m != null) {
            m.h(this.a);
        }
        e k = this.c.k(this.d);
        i.d dVar = k.a;
        if (m != null) {
            try {
                Bitmap bitmap = (Bitmap) ct1.b(m.a(), 5, TimeUnit.SECONDS);
                dVar.y(bitmap);
                i.b bVar = new i.b();
                bVar.h(bitmap);
                bVar.g(null);
                dVar.N(bVar);
            } catch (ExecutionException unused) {
            } catch (InterruptedException unused2) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                m.close();
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused3) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                m.close();
            }
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.b.getSystemService("notification")).notify(k.b, 0, k.a.d());
        return true;
    }
}
