package io.invertase.firebase.notifications;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class RNFirebaseNotificationReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        new d(context).p(intent.getExtras());
    }
}
