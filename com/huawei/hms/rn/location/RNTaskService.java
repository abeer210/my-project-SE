package com.huawei.hms.rn.location;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;
import androidx.core.app.i;
import com.huawei.hms.rn.location.backend.helpers.Constants;
import com.huawei.hms.rn.location.backend.helpers.HMSBroadcastReceiver;
import com.huawei.hms.rn.location.backend.helpers.Pair;
import com.huawei.hms.rn.location.helpers.ReactUtils;
import org.json.JSONObject;
import vigqyno.C0201;

public class RNTaskService extends di0 {
    private static final String CHANNEL_ID = null;
    private static final String TAG = RNTaskService.class.getName();

    static {
        C0201.m83(RNTaskService.class, 407);
    }

    public Class getMainActivityClass() {
        try {
            return Class.forName(getApplicationContext().getPackageManager().getLaunchIntentForPackage(getApplicationContext().getPackageName()).getComponent().getClassName());
        } catch (ClassNotFoundException e) {
            Log.e(TAG, C0201.m82(7905), e);
            return null;
        }
    }

    public Notification getNotification() {
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences(getApplicationContext().getPackageName(), 0);
        i.d dVar = new i.d(this, C0201.m82(7906));
        dVar.q(sharedPreferences.getString(C0201.m82(7907), C0201.m82(7908)));
        dVar.p(sharedPreferences.getString(C0201.m82(7909), C0201.m82(7910)));
        dVar.o(PendingIntent.getActivity(this, 0, new Intent(this, getMainActivityClass()), 268435456));
        dVar.J(getApplicationContext().getResources().getIdentifier(sharedPreferences.getString(C0201.m82(7911), C0201.m82(7912)), sharedPreferences.getString(C0201.m82(7913), C0201.m82(7914)), getApplicationContext().getPackageName()));
        return dVar.d();
    }

    @Override // defpackage.di0
    public kj0 getTaskConfig(Intent intent) {
        String val;
        Pair<String, JSONObject> handleIntent = HMSBroadcastReceiver.handleIntent(getApplicationContext(), intent);
        if (handleIntent == null) {
            return null;
        }
        if (HMSBroadcastReceiver.getPackageAction(getApplicationContext(), C0201.m82(7915)).equals(handleIntent.get0())) {
            val = Constants.Event.SCANNING_RESULT.getVal();
        } else if (HMSBroadcastReceiver.getPackageAction(getApplicationContext(), C0201.m82(7916)).equals(handleIntent.get0())) {
            val = Constants.Event.ACTIVITY_IDENTIFICATION_RESULT.getVal();
        } else if (HMSBroadcastReceiver.getPackageAction(getApplicationContext(), C0201.m82(7917)).equals(handleIntent.get0())) {
            val = Constants.Event.ACTIVITY_CONVERSION_RESULT.getVal();
        } else if (!HMSBroadcastReceiver.getPackageAction(getApplicationContext(), C0201.m82(7918)).equals(handleIntent.get0())) {
            return null;
        } else {
            val = Constants.Event.GEOFENCE_RESULT.getVal();
        }
        return new kj0(val, ReactUtils.toWM(handleIntent.get1()), 5000, false);
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) getSystemService(NotificationManager.class)).createNotificationChannel(new NotificationChannel(C0201.m82(7919), C0201.m82(7920), 0));
            startForeground(66666, getNotification());
        }
    }
}
