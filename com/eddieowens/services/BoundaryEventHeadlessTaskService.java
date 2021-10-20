package com.eddieowens.services;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.i;
import com.eddieowens.a;
import com.eddieowens.b;
import com.facebook.react.bridge.Arguments;
import vigqyno.C0201;

public class BoundaryEventHeadlessTaskService extends di0 {
    private void a(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(C0201.m82(8840), C0201.m82(8841), 2);
            notificationChannel.setDescription(C0201.m82(8842));
            ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
        }
    }

    private void b() {
        Context applicationContext = getApplicationContext();
        a(applicationContext);
        i.d dVar = new i.d(applicationContext, C0201.m82(8843));
        dVar.J(b.common_google_signin_btn_icon_light_normal);
        dVar.q(C0201.m82(8844));
        dVar.p(C0201.m82(8845));
        dVar.C(true);
        dVar.l(androidx.core.content.b.d(applicationContext, a.accent_material_light));
        startForeground(999999999, dVar.d());
        di0.acquireWakeLockNow(applicationContext);
    }

    @Override // defpackage.di0
    public kj0 getTaskConfig(Intent intent) {
        Bundle extras = intent.getExtras();
        return new kj0(C0201.m82(8846), extras != null ? Arguments.fromBundle(extras) : null, 5000, true);
    }

    public void onCreate() {
        super.onCreate();
        b();
    }

    @Override // defpackage.di0
    public int onStartCommand(Intent intent, int i, int i2) {
        int onStartCommand = super.onStartCommand(intent, i, i2);
        b();
        return onStartCommand;
    }
}
