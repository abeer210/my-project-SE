package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.i;
import androidx.core.content.b;
import com.google.android.gms.common.util.l;
import java.util.Arrays;
import java.util.Iterator;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;

public final class f {
    private static final AtomicInteger d = new AtomicInteger((int) SystemClock.elapsedRealtime());
    private final Context a;
    private final String b;
    private Bundle c;

    public f(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    private final PendingIntent a(int i, Intent intent) {
        return PendingIntent.getBroadcast(this.a, i, new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(this.a, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), 1073741824);
    }

    public static String b(Bundle bundle, String str) {
        String string = bundle.getString(str);
        return string == null ? bundle.getString(str.replace("gcm.n.", "gcm.notification.")) : string;
    }

    private static void c(Intent intent, Bundle bundle) {
        for (String str : bundle.keySet()) {
            if (str.startsWith("google.c.a.") || str.equals("from")) {
                intent.putExtra(str, bundle.getString(str));
            }
        }
    }

    private final synchronized Bundle d() {
        if (this.c != null) {
            return this.c;
        }
        try {
            ApplicationInfo g = g(128);
            if (!(g == null || g.metaData == null)) {
                Bundle bundle = g.metaData;
                this.c = bundle;
                return bundle;
            }
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
            sb.append("Couldn't get own application info: ");
            sb.append(valueOf);
            Log.w("FirebaseMessaging", sb.toString());
        }
        return Bundle.EMPTY;
    }

    @TargetApi(26)
    private final boolean e(int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(this.a.getResources().getDrawable(i, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            StringBuilder sb = new StringBuilder(77);
            sb.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
            sb.append(i);
            Log.e("FirebaseMessaging", sb.toString());
            return false;
        } catch (Resources.NotFoundException unused) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Couldn't find resource ");
            sb2.append(i);
            sb2.append(", treating it as an invalid icon");
            Log.e("FirebaseMessaging", sb2.toString());
            return false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.lang.String[] */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object[] f(Bundle bundle, String str) {
        String valueOf = String.valueOf(str);
        String b2 = b(bundle, "_loc_args".length() != 0 ? valueOf.concat("_loc_args") : new String(valueOf));
        if (TextUtils.isEmpty(b2)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(b2);
            int length = jSONArray.length();
            String[] strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = jSONArray.opt(i);
            }
            return strArr;
        } catch (JSONException unused) {
            String valueOf2 = String.valueOf(str);
            String substring = ("_loc_args".length() != 0 ? valueOf2.concat("_loc_args") : new String(valueOf2)).substring(6);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 41 + String.valueOf(b2).length());
            sb.append("Malformed ");
            sb.append(substring);
            sb.append(": ");
            sb.append(b2);
            sb.append("  Default value will be used.");
            Log.w("FirebaseMessaging", sb.toString());
            return null;
        }
    }

    private final ApplicationInfo g(int i) throws PackageManager.NameNotFoundException {
        return this.a.getPackageManager().getApplicationInfo(this.b, i);
    }

    private final String h(Bundle bundle, String str) {
        String b2 = b(bundle, str);
        if (!TextUtils.isEmpty(b2)) {
            return b2;
        }
        return j(bundle, str);
    }

    public static String i(Bundle bundle, String str) {
        String valueOf = String.valueOf(str);
        return b(bundle, "_loc_key".length() != 0 ? valueOf.concat("_loc_key") : new String(valueOf));
    }

    private final String j(Bundle bundle, String str) {
        String i = i(bundle, str);
        if (TextUtils.isEmpty(i)) {
            return null;
        }
        Resources resources = this.a.getResources();
        int identifier = resources.getIdentifier(i, "string", this.b);
        if (identifier == 0) {
            String valueOf = String.valueOf(str);
            String substring = ("_loc_key".length() != 0 ? valueOf.concat("_loc_key") : new String(valueOf)).substring(6);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 49 + String.valueOf(str).length());
            sb.append(substring);
            sb.append(" resource not found: ");
            sb.append(str);
            sb.append(" Default value will be used.");
            Log.w("FirebaseMessaging", sb.toString());
            return null;
        }
        Object[] f = f(bundle, str);
        if (f == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, f);
        } catch (MissingFormatArgumentException e) {
            String arrays = Arrays.toString(f);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 58 + String.valueOf(arrays).length());
            sb2.append("Missing format argument for ");
            sb2.append(str);
            sb2.append(": ");
            sb2.append(arrays);
            sb2.append(" Default value will be used.");
            Log.w("FirebaseMessaging", sb2.toString(), e);
            return null;
        }
    }

    private final CharSequence l(Bundle bundle) {
        String h = h(bundle, "gcm.n.title");
        if (!TextUtils.isEmpty(h)) {
            return h;
        }
        try {
            return g(0).loadLabel(this.a.getPackageManager());
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
            sb.append("Couldn't get own application info: ");
            sb.append(valueOf);
            Log.e("FirebaseMessaging", sb.toString());
            return "";
        }
    }

    public static boolean m(Bundle bundle) {
        return "1".equals(b(bundle, "gcm.n.e")) || b(bundle, "gcm.n.icon") != null;
    }

    public static String n(Bundle bundle) {
        String b2 = b(bundle, "gcm.n.sound2");
        return TextUtils.isEmpty(b2) ? b(bundle, "gcm.n.sound") : b2;
    }

    public static Uri o(Bundle bundle) {
        String b2 = b(bundle, "gcm.n.link_android");
        if (TextUtils.isEmpty(b2)) {
            b2 = b(bundle, "gcm.n.link");
        }
        if (!TextUtils.isEmpty(b2)) {
            return Uri.parse(b2);
        }
        return null;
    }

    private static boolean p(Bundle bundle) {
        return bundle != null && "1".equals(bundle.getString("google.c.a.e"));
    }

    private final int q(String str) {
        if (!TextUtils.isEmpty(str)) {
            Resources resources = this.a.getResources();
            int identifier = resources.getIdentifier(str, "drawable", this.b);
            if (identifier != 0 && e(identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str, "mipmap", this.b);
            if (identifier2 != 0 && e(identifier2)) {
                return identifier2;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("Icon resource ");
            sb.append(str);
            sb.append(" not found. Notification will use default icon.");
            Log.w("FirebaseMessaging", sb.toString());
        }
        int i = d().getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i == 0 || !e(i)) {
            try {
                i = g(0).icon;
            } catch (PackageManager.NameNotFoundException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 35);
                sb2.append("Couldn't get own application info: ");
                sb2.append(valueOf);
                Log.w("FirebaseMessaging", sb2.toString());
            }
        }
        if (i == 0 || !e(i)) {
            return 17301651;
        }
        return i;
    }

    private final Integer r(String str) {
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 54);
                sb.append("Color ");
                sb.append(str);
                sb.append(" not valid. Notification will use default color.");
                Log.w("FirebaseMessaging", sb.toString());
            }
        }
        int i = d().getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i != 0) {
            try {
                return Integer.valueOf(b.d(this.a, i));
            } catch (Resources.NotFoundException unused2) {
                Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            }
        }
        return null;
    }

    @TargetApi(26)
    private final String s(String str) {
        if (!l.i()) {
            return null;
        }
        int i = 0;
        try {
            i = g(0).targetSdkVersion;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (i < 26) {
            return null;
        }
        NotificationManager notificationManager = (NotificationManager) this.a.getSystemService(NotificationManager.class);
        if (!TextUtils.isEmpty(str)) {
            if (notificationManager.getNotificationChannel(str) != null) {
                return str;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 122);
            sb.append("Notification Channel requested (");
            sb.append(str);
            sb.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
            Log.w("FirebaseMessaging", sb.toString());
        }
        String string = d().getString("com.google.firebase.messaging.default_notification_channel_id");
        if (TextUtils.isEmpty(string)) {
            Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
        } else if (notificationManager.getNotificationChannel(string) != null) {
            return string;
        } else {
            Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
        }
        if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", this.a.getString(this.a.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", this.b)), 3));
        }
        return "fcm_fallback_notification_channel";
    }

    public final e k(Bundle bundle) {
        Uri uri;
        Intent intent;
        PendingIntent pendingIntent;
        i.d dVar = new i.d(this.a, s(b(bundle, "gcm.n.android_channel_id")));
        dVar.h(true);
        dVar.q(l(bundle));
        String h = h(bundle, "gcm.n.body");
        if (!TextUtils.isEmpty(h)) {
            dVar.p(h);
            i.c cVar = new i.c();
            cVar.g(h);
            dVar.N(cVar);
        }
        dVar.J(q(b(bundle, "gcm.n.icon")));
        String n = n(bundle);
        PendingIntent pendingIntent2 = null;
        if (TextUtils.isEmpty(n)) {
            uri = null;
        } else if ("default".equals(n) || this.a.getResources().getIdentifier(n, "raw", this.b) == 0) {
            uri = RingtoneManager.getDefaultUri(2);
        } else {
            String str = this.b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 24 + String.valueOf(n).length());
            sb.append("android.resource://");
            sb.append(str);
            sb.append("/raw/");
            sb.append(n);
            uri = Uri.parse(sb.toString());
        }
        if (uri != null) {
            dVar.M(uri);
        }
        String b2 = b(bundle, "gcm.n.click_action");
        if (!TextUtils.isEmpty(b2)) {
            intent = new Intent(b2);
            intent.setPackage(this.b);
            intent.setFlags(268435456);
        } else {
            Uri o = o(bundle);
            if (o != null) {
                intent = new Intent("android.intent.action.VIEW");
                intent.setPackage(this.b);
                intent.setData(o);
            } else {
                intent = this.a.getPackageManager().getLaunchIntentForPackage(this.b);
                if (intent == null) {
                    Log.w("FirebaseMessaging", "No activity found to launch app");
                }
            }
        }
        if (intent == null) {
            pendingIntent = null;
        } else {
            intent.addFlags(67108864);
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next != null && next.startsWith("google.c.")) {
                    it.remove();
                }
            }
            intent.putExtras(bundle2);
            for (String str2 : bundle2.keySet()) {
                if (str2.startsWith("gcm.n.") || str2.startsWith("gcm.notification.")) {
                    intent.removeExtra(str2);
                }
            }
            pendingIntent = PendingIntent.getActivity(this.a, d.incrementAndGet(), intent, 1073741824);
            if (p(bundle)) {
                Intent intent2 = new Intent("com.google.firebase.messaging.NOTIFICATION_OPEN");
                c(intent2, bundle);
                intent2.putExtra("pending_intent", pendingIntent);
                pendingIntent = a(d.incrementAndGet(), intent2);
            }
        }
        dVar.o(pendingIntent);
        if (p(bundle)) {
            Intent intent3 = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS");
            c(intent3, bundle);
            pendingIntent2 = a(d.incrementAndGet(), intent3);
        }
        if (pendingIntent2 != null) {
            dVar.s(pendingIntent2);
        }
        Integer r = r(b(bundle, "gcm.n.color"));
        if (r != null) {
            dVar.l(r.intValue());
        }
        String b3 = b(bundle, "gcm.n.tag");
        if (TextUtils.isEmpty(b3)) {
            long uptimeMillis = SystemClock.uptimeMillis();
            StringBuilder sb2 = new StringBuilder(37);
            sb2.append("FCM-Notification:");
            sb2.append(uptimeMillis);
            b3 = sb2.toString();
        }
        return new e(dVar, b3, 0);
    }
}
