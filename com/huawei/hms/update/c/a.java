package com.huawei.hms.update.c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.huawei.hms.ui.SafeIntent;
import vigqyno.C0201;

/* compiled from: SilentInstallReceive */
public class a extends BroadcastReceiver {
    private Handler a;

    public a(Handler handler) {
        this.a = handler;
    }

    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent != null) {
            SafeIntent safeIntent = new SafeIntent(intent);
            String action = safeIntent.getAction();
            if (C0201.m82(37627).equals(action)) {
                Bundle extras2 = safeIntent.getExtras();
                if (extras2 != null) {
                    Message message = new Message();
                    message.what = 101;
                    message.obj = extras2;
                    this.a.sendMessage(message);
                }
            } else if (C0201.m82(37628).equals(action)) {
                Bundle extras3 = safeIntent.getExtras();
                if (extras3 != null) {
                    Message message2 = new Message();
                    message2.what = 102;
                    message2.obj = extras3;
                    this.a.sendMessage(message2);
                }
            } else if (C0201.m82(37629).equals(action) && (extras = safeIntent.getExtras()) != null) {
                Message message3 = new Message();
                message3.what = 103;
                message3.obj = extras;
                this.a.sendMessage(message3);
            }
        }
    }
}
