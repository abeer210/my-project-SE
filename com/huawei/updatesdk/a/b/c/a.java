package com.huawei.updatesdk.a.b.c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public abstract class a extends BroadcastReceiver {
    public abstract void a(Context context, b bVar);

    public final void onReceive(Context context, Intent intent) {
        a(context, b.a(intent));
    }
}
