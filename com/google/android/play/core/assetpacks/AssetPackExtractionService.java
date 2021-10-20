package com.google.android.play.core.assetpacks;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import vigqyno.C0201;

public class AssetPackExtractionService extends Service {
    private final gy1 a = new gy1(C0201.m82(7422));
    public Context b;
    public v2 c;
    public b0 d;
    private z e;
    private NotificationManager f;

    private final synchronized void c(Bundle bundle) {
        String string = bundle.getString(C0201.m82(7423));
        String string2 = bundle.getString(C0201.m82(7424));
        long j = bundle.getLong(C0201.m82(7425));
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(C0201.m82(7426));
        Notification.Builder timeoutAfter = Build.VERSION.SDK_INT >= 26 ? new Notification.Builder(this.b, C0201.m82(7427)).setTimeoutAfter(j) : new Notification.Builder(this.b).setPriority(-2);
        if (pendingIntent != null) {
            timeoutAfter.setContentIntent(pendingIntent);
        }
        timeoutAfter.setSmallIcon(17301633).setOngoing(false).setContentTitle(string).setSubText(string2);
        if (Build.VERSION.SDK_INT >= 21) {
            timeoutAfter.setColor(bundle.getInt(C0201.m82(7428))).setVisibility(-1);
        }
        Notification build = timeoutAfter.build();
        this.a.f(C0201.m82(7429), new Object[0]);
        this.c.b(true);
        if (Build.VERSION.SDK_INT >= 26) {
            this.f.createNotificationChannel(new NotificationChannel(C0201.m82(7431), bundle.getString(C0201.m82(7430)), 2));
        }
        startForeground(-1883842196, build);
    }

    public final synchronized Bundle a(Bundle bundle) {
        int i = bundle.getInt(C0201.m82(7432));
        gy1 gy1 = this.a;
        Integer valueOf = Integer.valueOf(i);
        gy1.c(C0201.m82(7433), valueOf);
        if (i == 1) {
            c(bundle);
        } else if (i == 2) {
            b();
        } else {
            this.a.e(C0201.m82(7434), valueOf);
        }
        return new Bundle();
    }

    public final synchronized void b() {
        this.a.f(C0201.m82(7435), new Object[0]);
        this.c.b(false);
        stopForeground(true);
        stopSelf();
    }

    public final IBinder onBind(Intent intent) {
        return this.e;
    }

    public final void onCreate() {
        super.onCreate();
        this.a.c(C0201.m82(7436), new Object[0]);
        v1.a(getApplicationContext()).a(this);
        this.e = new z(this.b, this, this.d);
        this.f = (NotificationManager) this.b.getSystemService(C0201.m82(7437));
    }
}
