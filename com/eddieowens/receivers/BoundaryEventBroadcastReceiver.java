package com.eddieowens.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.core.app.f;
import com.eddieowens.services.BoundaryEventJobIntentService;
import vigqyno.C0201;

public class BoundaryEventBroadcastReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Log.i(C0201.m82(37163), C0201.m82(37164));
        f.d(context, BoundaryEventJobIntentService.class, 0, intent);
    }
}
