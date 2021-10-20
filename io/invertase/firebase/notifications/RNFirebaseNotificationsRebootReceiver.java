package io.invertase.firebase.notifications;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import vigqyno.C0201;

public class RNFirebaseNotificationsRebootReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Log.i(C0201.m82(38717), C0201.m82(38718));
        new d(context).D();
    }
}
