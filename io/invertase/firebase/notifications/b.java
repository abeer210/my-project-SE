package io.invertase.firebase.notifications;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.m;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import io.invertase.firebase.c;
import vigqyno.C0201;

/* compiled from: RNFirebaseBackgroundNotificationActionReceiver */
public class b extends BroadcastReceiver {
    public static boolean a(Intent intent) {
        return intent.getExtras() != null && intent.hasExtra(C0201.m82(28603)) && intent.hasExtra(C0201.m82(28604));
    }

    public static WritableMap b(Intent intent) {
        Bundle extras = intent.getExtras();
        String r1 = C0201.m82(28605);
        WritableNativeMap makeNativeMap = Arguments.makeNativeMap(extras.getBundle(r1));
        WritableMap createMap = Arguments.createMap();
        String r4 = C0201.m82(28606);
        createMap.putString(r4, extras.getString(r4));
        createMap.putMap(r1, makeNativeMap);
        String r12 = C0201.m82(28607);
        Bundle bundle = extras.getBundle(r12);
        if (bundle == null) {
            bundle = m.j(intent);
        }
        if (bundle != null) {
            createMap.putMap(r12, Arguments.makeNativeMap(bundle));
        }
        return createMap;
    }

    public void onReceive(Context context, Intent intent) {
        if (a(intent)) {
            if (c.c(context)) {
                c.k(((qi0) context.getApplicationContext()).a().j().v(), C0201.m82(28608), b(intent));
                return;
            }
            Intent intent2 = new Intent(context, c.class);
            intent2.putExtras(intent.getExtras());
            Bundle j = m.j(intent);
            if (j != null) {
                intent2.putExtra(C0201.m82(28609), j);
            }
            if (context.startService(intent2) != null) {
                di0.acquireWakeLockNow(context);
            }
        }
    }
}
