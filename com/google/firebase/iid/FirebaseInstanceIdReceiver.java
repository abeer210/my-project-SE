package com.google.firebase.iid;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.l;

public final class FirebaseInstanceIdReceiver extends p4 {
    private static l0 c;

    @SuppressLint({"InlinedApi"})
    public static int e(BroadcastReceiver broadcastReceiver, Context context, Intent intent) {
        boolean z = true;
        boolean z2 = l.i() && context.getApplicationInfo().targetSdkVersion >= 26;
        if ((intent.getFlags() & 268435456) == 0) {
            z = false;
        }
        if (z2 && !z) {
            return h(broadcastReceiver, context, intent);
        }
        int c2 = z.a().c(context, intent);
        if (!l.i() || c2 != 402) {
            return c2;
        }
        h(broadcastReceiver, context, intent);
        return 403;
    }

    private static synchronized l0 f(Context context, String str) {
        l0 l0Var;
        synchronized (FirebaseInstanceIdReceiver.class) {
            if (c == null) {
                c = new l0(context, str);
            }
            l0Var = c;
        }
        return l0Var;
    }

    private final void g(Context context, Intent intent) {
        int i;
        intent.setComponent(null);
        intent.setPackage(context.getPackageName());
        if (Build.VERSION.SDK_INT <= 18) {
            intent.removeCategory(context.getPackageName());
        }
        if ("google.com/iid".equals(intent.getStringExtra("from"))) {
            String stringExtra = intent.getStringExtra("CMD");
            if (stringExtra != null) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(intent.getExtras());
                    StringBuilder sb = new StringBuilder(String.valueOf(stringExtra).length() + 21 + String.valueOf(valueOf).length());
                    sb.append("Received command: ");
                    sb.append(stringExtra);
                    sb.append(" - ");
                    sb.append(valueOf);
                    Log.d("FirebaseInstanceId", sb.toString());
                }
                if ("RST".equals(stringExtra) || "RST_FULL".equals(stringExtra)) {
                    FirebaseInstanceId.d().C();
                } else if ("SYNC".equals(stringExtra)) {
                    FirebaseInstanceId.d().E();
                }
            }
            i = -1;
        } else {
            String stringExtra2 = intent.getStringExtra("gcm.rawData64");
            if (stringExtra2 != null) {
                intent.putExtra("rawData", Base64.decode(stringExtra2, 0));
                intent.removeExtra("gcm.rawData64");
            }
            i = e(this, context, intent);
        }
        if (isOrderedBroadcast()) {
            setResultCode(i);
        }
    }

    private static int h(BroadcastReceiver broadcastReceiver, Context context, Intent intent) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Binding to service");
        }
        if (broadcastReceiver.isOrderedBroadcast()) {
            broadcastReceiver.setResultCode(-1);
        }
        f(context, "com.google.firebase.MESSAGING_EVENT").a(intent, broadcastReceiver.goAsync());
        return -1;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                g(context, intent2);
            } else {
                g(context, intent);
            }
        }
    }
}
