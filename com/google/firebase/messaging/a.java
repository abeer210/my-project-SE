package com.google.firebase.messaging;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.regex.Pattern;

public class a {
    private static final Pattern b = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    private static a c;
    private final FirebaseInstanceId a;

    private a(FirebaseInstanceId firebaseInstanceId) {
        this.a = firebaseInstanceId;
    }

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            if (c == null) {
                c = new a(FirebaseInstanceId.d());
            }
            aVar = c;
        }
        return aVar;
    }

    public void b(c cVar) {
        if (!TextUtils.isEmpty(cVar.z())) {
            Context i = l12.k().i();
            Intent intent = new Intent("com.google.android.gcm.intent.SEND");
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            intent.putExtra("app", PendingIntent.getBroadcast(i, 0, intent2, 0));
            intent.setPackage("com.google.android.gms");
            intent.putExtras(cVar.a);
            i.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
            return;
        }
        throw new IllegalArgumentException("Missing 'to'");
    }

    public zs1<Void> c(String str) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in subscribeToTopic.");
            str = str.substring(8);
        }
        if (str == null || !b.matcher(str).matches()) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 78);
            sb.append("Invalid topic name: ");
            sb.append(str);
            sb.append(" does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}");
            throw new IllegalArgumentException(sb.toString());
        }
        FirebaseInstanceId firebaseInstanceId = this.a;
        String valueOf = String.valueOf(str);
        return firebaseInstanceId.g(valueOf.length() != 0 ? "S!".concat(valueOf) : new String("S!"));
    }

    public zs1<Void> d(String str) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in unsubscribeFromTopic.");
            str = str.substring(8);
        }
        if (str == null || !b.matcher(str).matches()) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 78);
            sb.append("Invalid topic name: ");
            sb.append(str);
            sb.append(" does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}");
            throw new IllegalArgumentException(sb.toString());
        }
        FirebaseInstanceId firebaseInstanceId = this.a;
        String valueOf = String.valueOf(str);
        return firebaseInstanceId.g(valueOf.length() != 0 ? "U!".concat(valueOf) : new String("U!"));
    }
}
