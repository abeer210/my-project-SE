package io.invertase.firebase.notifications;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import io.invertase.firebase.c;
import io.invertase.firebase.messaging.a;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

/* compiled from: RNFirebaseNotificationManager */
public class d {
    public static final String A = null;
    public static final String f = null;
    public static final String g = null;
    public static final String h = null;
    public static final String i = null;
    public static final String j = null;
    public static final String k = null;
    public static final String l = null;
    public static final String m = null;
    public static final String n = null;
    public static final String o = null;
    public static final String p = null;
    public static final String q = null;
    public static final String r = null;
    public static final String s = null;
    public static final String t = null;
    public static final String u = null;
    public static final String v = null;
    public static final String w = null;
    public static final String x = null;
    public static final String y = null;
    public static final String z = null;
    private AlarmManager a;
    private Context b;
    private ReactApplicationContext c;
    private NotificationManager d;
    private SharedPreferences e;

    static {
        C0201.m83(d.class, 85);
    }

    public d(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext.getApplicationContext());
        this.c = reactApplicationContext;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @SuppressLint({"ShortAlarm"})
    private void E(Bundle bundle, Promise promise) {
        char c2;
        Long l2;
        char c3;
        String str = j;
        boolean containsKey = bundle.containsKey(str);
        String str2 = i;
        String str3 = w;
        if (!containsKey) {
            String str4 = r;
            if (promise == null) {
                Log.e(str3, str4);
            } else {
                promise.reject(str2, str4);
            }
        } else {
            String str5 = k;
            boolean containsKey2 = bundle.containsKey(str5);
            String str6 = l;
            if (containsKey2) {
                String string = bundle.getString(str);
                Bundle bundle2 = bundle.getBundle(str5);
                Long l3 = -1L;
                Object obj = bundle2.get(f);
                if (obj instanceof Long) {
                    l3 = (Long) obj;
                } else if (obj instanceof Double) {
                    l3 = Long.valueOf(((Double) obj).longValue());
                }
                if (l3.longValue() != -1) {
                    try {
                        this.e.edit().putString(string, a.b(bundle).toString()).apply();
                        Intent intent = new Intent(this.b, RNFirebaseNotificationReceiver.class);
                        intent.putExtras(bundle);
                        PendingIntent broadcast = PendingIntent.getBroadcast(this.b, string.hashCode(), intent, 134217728);
                        String str7 = n;
                        if (bundle2.containsKey(str7)) {
                            long longValue = l3.longValue();
                            long currentTimeMillis = System.currentTimeMillis();
                            String str8 = v;
                            String str9 = p;
                            if (longValue < currentTimeMillis) {
                                Log.w(str3, s);
                                Calendar instance = Calendar.getInstance();
                                Calendar instance2 = Calendar.getInstance();
                                instance2.setTimeInMillis(l3.longValue());
                                instance.set(13, instance2.get(13));
                                String string2 = bundle2.getString(str7);
                                switch (string2.hashCode()) {
                                    case -1074026988:
                                        if (string2.equals(str9)) {
                                            c3 = 0;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 99228:
                                        if (string2.equals(str8)) {
                                            c3 = 2;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 3208676:
                                        if (string2.equals(g)) {
                                            c3 = 1;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 3645428:
                                        if (string2.equals(A)) {
                                            c3 = 3;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    default:
                                        c3 = 65535;
                                        break;
                                }
                                if (c3 == 0) {
                                    instance.add(12, 1);
                                } else if (c3 == 1) {
                                    instance.set(12, instance2.get(12));
                                    instance.add(10, 1);
                                } else if (c3 == 2) {
                                    instance.set(12, instance2.get(12));
                                    instance.set(11, instance2.get(11));
                                    instance.add(5, 1);
                                } else if (c3 == 3) {
                                    instance.set(12, instance2.get(12));
                                    instance.set(11, instance2.get(11));
                                    instance.set(5, instance2.get(5));
                                    instance.add(5, 7);
                                }
                                l3 = Long.valueOf(instance.getTimeInMillis());
                            }
                            String string3 = bundle2.getString(str7);
                            switch (string3.hashCode()) {
                                case -1074026988:
                                    if (string3.equals(str9)) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 99228:
                                    if (string3.equals(str8)) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 3208676:
                                    if (string3.equals(o)) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 3645428:
                                    if (string3.equals(y)) {
                                        c2 = 3;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                default:
                                    c2 = 65535;
                                    break;
                            }
                            if (c2 == 0) {
                                l2 = 60000L;
                            } else if (c2 == 1) {
                                l2 = 3600000L;
                            } else if (c2 == 2) {
                                l2 = 86400000L;
                            } else if (c2 != 3) {
                                Log.e(str3, q + bundle2.getString(u));
                                l2 = null;
                            } else {
                                l2 = 604800000L;
                            }
                            if (l2 != null) {
                                this.a.setRepeating(0, l3.longValue(), l2.longValue(), broadcast);
                            } else if (promise == null) {
                                Log.e(str3, t);
                                return;
                            } else {
                                promise.reject(str2, z);
                                return;
                            }
                        } else {
                            String str10 = m;
                            if (!bundle2.containsKey(str10) || !bundle2.getBoolean(str10) || Build.VERSION.SDK_INT < 19) {
                                this.a.set(0, l3.longValue(), broadcast);
                            } else {
                                this.a.setExact(0, l3.longValue(), broadcast);
                            }
                        }
                        if (promise != null) {
                            promise.resolve(null);
                        }
                    } catch (JSONException e2) {
                        String str11 = h;
                        if (promise == null) {
                            Log.e(str3, str11);
                        } else {
                            promise.reject(str2, str11, e2);
                        }
                    }
                } else if (promise == null) {
                    Log.e(str3, str6);
                } else {
                    promise.reject(str2, x);
                }
            } else if (promise == null) {
                Log.e(str3, str6);
            } else {
                promise.reject(str2, str6);
            }
        }
    }

    private void a(String str) {
        this.a.cancel(PendingIntent.getBroadcast(this.b, str.hashCode(), new Intent(this.b, RNFirebaseNotificationReceiver.class), 134217728));
    }

    private WritableMap f(NotificationChannelGroup notificationChannelGroup) {
        WritableMap createMap = Arguments.createMap();
        if (Build.VERSION.SDK_INT >= 26) {
            createMap.putString(C0201.m82(27103), notificationChannelGroup.getId());
            createMap.putString(C0201.m82(27104), notificationChannelGroup.getName().toString());
            createMap.putArray(C0201.m82(27105), k(notificationChannelGroup.getChannels()));
            if (Build.VERSION.SDK_INT >= 28) {
                createMap.putString(C0201.m82(27106), notificationChannelGroup.getDescription());
            }
        }
        return createMap;
    }

    private WritableArray h(List<NotificationChannelGroup> list) {
        WritableArray createArray = Arguments.createArray();
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                createArray.pushMap(f(list.get(i2)));
            }
        }
        return createArray;
    }

    private WritableMap i(NotificationChannel notificationChannel) {
        if (notificationChannel == null) {
            return null;
        }
        WritableMap createMap = Arguments.createMap();
        if (Build.VERSION.SDK_INT >= 26) {
            createMap.putString(C0201.m82(27107), notificationChannel.getId());
            createMap.putString(C0201.m82(27108), notificationChannel.getName().toString());
            createMap.putInt(C0201.m82(27109), notificationChannel.getImportance());
            createMap.putString(C0201.m82(27110), notificationChannel.getDescription());
            createMap.putBoolean(C0201.m82(27111), notificationChannel.canBypassDnd());
            createMap.putString(C0201.m82(27112), notificationChannel.getGroup());
            createMap.putString(C0201.m82(27114), String.format(C0201.m82(27113), Integer.valueOf(16777215 & notificationChannel.getLightColor())));
            createMap.putBoolean(C0201.m82(27115), notificationChannel.shouldShowLights());
            int lockscreenVisibility = notificationChannel.getLockscreenVisibility();
            String r4 = C0201.m82(27116);
            if (lockscreenVisibility == -1000) {
                createMap.putNull(r4);
            } else {
                createMap.putInt(r4, lockscreenVisibility);
            }
            createMap.putBoolean(C0201.m82(27117), notificationChannel.canShowBadge());
            createMap.putString(C0201.m82(27118), u(notificationChannel.getSound()));
            createMap.putBoolean(C0201.m82(27119), notificationChannel.shouldVibrate());
            long[] vibrationPattern = notificationChannel.getVibrationPattern();
            WritableArray createArray = Arguments.createArray();
            if (vibrationPattern != null) {
                for (long j2 : vibrationPattern) {
                    createArray.pushDouble((double) j2);
                }
            }
            createMap.putArray(C0201.m82(27120), createArray);
        }
        return createMap;
    }

    private WritableArray k(List<NotificationChannel> list) {
        WritableArray createArray = Arguments.createArray();
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                createArray.pushMap(i(list.get(i2)));
            }
        }
        return createArray;
    }

    private void n(Bundle bundle, Promise promise) {
        new a(this.b, this.c, this.d, bundle, promise).execute(new Void[0]);
    }

    private String u(Uri uri) {
        String str = null;
        if (uri.getScheme() == C0201.m82(27121)) {
            Cursor query = this.c.getContentResolver().query(uri, null, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow(C0201.m82(27122)));
                    }
                } catch (Throwable th) {
                    if (query != null) {
                        query.close();
                    }
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
        }
        String r0 = C0201.m82(27123);
        if (str == null && (str = uri.getPath()) != null) {
            int lastIndexOf = str.lastIndexOf(47);
            str = lastIndexOf != -1 ? str.substring(lastIndexOf + 1) : r0;
        }
        return str.equals(C0201.m82(27124)) ? r0 : str;
    }

    public static int v(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str2, str, context.getPackageName());
    }

    public static Uri x(Context context, String str) {
        if (str == null) {
            return null;
        }
        if (str.contains(C0201.m82(27125))) {
            return Uri.parse(str);
        }
        if (str.equalsIgnoreCase(C0201.m82(27126))) {
            return RingtoneManager.getDefaultUri(2);
        }
        String r0 = C0201.m82(27127);
        int v2 = v(context, r0, str);
        if (v2 == 0) {
            v2 = v(context, r0, str.substring(0, str.lastIndexOf(46)));
        }
        return Uri.parse(C0201.m82(27128) + context.getPackageName() + C0201.m82(27129) + v2);
    }

    private NotificationChannelGroup y(ReadableMap readableMap) {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        NotificationChannelGroup notificationChannelGroup = new NotificationChannelGroup(readableMap.getString(C0201.m82(27130)), readableMap.getString(C0201.m82(27131)));
        if (Build.VERSION.SDK_INT >= 28) {
            String r0 = C0201.m82(27132);
            if (readableMap.hasKey(r0)) {
                notificationChannelGroup.setDescription(readableMap.getString(r0));
            }
        }
        return notificationChannelGroup;
    }

    private NotificationChannel z(ReadableMap readableMap) {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        NotificationChannel notificationChannel = new NotificationChannel(readableMap.getString(C0201.m82(27133)), readableMap.getString(C0201.m82(27134)), readableMap.getInt(C0201.m82(27135)));
        String r0 = C0201.m82(27136);
        if (readableMap.hasKey(r0)) {
            notificationChannel.setBypassDnd(readableMap.getBoolean(r0));
        }
        String r02 = C0201.m82(27137);
        if (readableMap.hasKey(r02)) {
            notificationChannel.setDescription(readableMap.getString(r02));
        }
        String r03 = C0201.m82(27138);
        if (readableMap.hasKey(r03)) {
            notificationChannel.setGroup(readableMap.getString(r03));
        }
        String r04 = C0201.m82(27139);
        if (readableMap.hasKey(r04)) {
            notificationChannel.setLightColor(Color.parseColor(readableMap.getString(r04)));
        }
        String r05 = C0201.m82(27140);
        if (readableMap.hasKey(r05)) {
            notificationChannel.enableLights(readableMap.getBoolean(r05));
        }
        String r06 = C0201.m82(27141);
        if (readableMap.hasKey(r06)) {
            notificationChannel.setLockscreenVisibility(readableMap.getInt(r06));
        }
        String r07 = C0201.m82(27142);
        if (readableMap.hasKey(r07)) {
            notificationChannel.setShowBadge(readableMap.getBoolean(r07));
        }
        String r08 = C0201.m82(27143);
        if (readableMap.hasKey(r08)) {
            notificationChannel.setSound(x(this.b, readableMap.getString(r08)), null);
        }
        String r09 = C0201.m82(27144);
        if (readableMap.hasKey(r09)) {
            notificationChannel.enableVibration(readableMap.getBoolean(r09));
        }
        String r010 = C0201.m82(27145);
        if (readableMap.hasKey(r010)) {
            ReadableArray array = readableMap.getArray(r010);
            long[] jArr = new long[array.size()];
            for (int i2 = 0; i2 < array.size(); i2++) {
                jArr[i2] = (long) array.getDouble(i2);
            }
            notificationChannel.setVibrationPattern(jArr);
        }
        return notificationChannel;
    }

    public void A(Promise promise) {
        this.d.cancelAll();
        promise.resolve(null);
    }

    public void B(String str, Promise promise) {
        this.d.cancel(str.hashCode());
        promise.resolve(null);
    }

    public void C(String str, Promise promise) {
        if (Build.VERSION.SDK_INT >= 23) {
            StatusBarNotification[] activeNotifications = this.d.getActiveNotifications();
            for (StatusBarNotification statusBarNotification : activeNotifications) {
                if (str.equals(statusBarNotification.getTag())) {
                    this.d.cancel(statusBarNotification.getTag(), statusBarNotification.getId());
                }
            }
        }
        promise.resolve(null);
    }

    public void D() {
        Iterator<Bundle> it = w().iterator();
        while (it.hasNext()) {
            E(it.next(), null);
        }
    }

    public void F(ReadableMap readableMap, Promise promise) {
        E(Arguments.toBundle(readableMap), promise);
    }

    public void b(Promise promise) {
        try {
            for (String str : this.e.getAll().keySet()) {
                a(str);
            }
            this.e.edit().clear().apply();
            promise.resolve(null);
        } catch (SecurityException e2) {
            Log.e(C0201.m82(27146), e2.getMessage());
            promise.reject(C0201.m82(27147), C0201.m82(27148), e2);
        }
    }

    public void c(String str, Promise promise) {
        try {
            a(str);
            this.e.edit().remove(str).apply();
            promise.resolve(null);
        } catch (SecurityException e2) {
            Log.e(C0201.m82(27149), e2.getMessage());
            promise.reject(C0201.m82(27150), C0201.m82(27151), e2);
        }
    }

    public void d(ReadableMap readableMap) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.d.createNotificationChannel(z(readableMap));
        }
    }

    public void e(ReadableMap readableMap) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.d.createNotificationChannelGroup(y(readableMap));
        }
    }

    public void g(ReadableArray readableArray) {
        if (Build.VERSION.SDK_INT >= 26) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < readableArray.size(); i2++) {
                arrayList.add(y(readableArray.getMap(i2)));
            }
            this.d.createNotificationChannelGroups(arrayList);
        }
    }

    public void j(ReadableArray readableArray) {
        if (Build.VERSION.SDK_INT >= 26) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < readableArray.size(); i2++) {
                arrayList.add(z(readableArray.getMap(i2)));
            }
            this.d.createNotificationChannels(arrayList);
        }
    }

    public void l(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.d.deleteNotificationChannel(str);
        }
    }

    public void m(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.d.deleteNotificationChannelGroup(str);
        }
    }

    public void o(ReadableMap readableMap, Promise promise) {
        n(Arguments.toBundle(readableMap), promise);
    }

    public void p(Bundle bundle) {
        String r0 = C0201.m82(27152);
        Bundle bundle2 = bundle.getBundle(r0);
        String r2 = C0201.m82(27153);
        if (!bundle2.containsKey(r2) || !bundle.getBundle(r0).getBoolean(r2)) {
            this.e.edit().remove(bundle.getString(C0201.m82(27154))).apply();
        }
        if (c.c(this.b)) {
            Intent intent = new Intent(C0201.m82(27155));
            intent.putExtra(C0201.m82(27156), bundle);
            w4.b(this.b).d(intent);
            return;
        }
        n(bundle, null);
    }

    public WritableMap q(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return i(this.d.getNotificationChannel(str));
        }
        return null;
    }

    public WritableMap r(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            return f(this.d.getNotificationChannelGroup(str));
        }
        return null;
    }

    public WritableArray s() {
        if (Build.VERSION.SDK_INT >= 26) {
            return h(this.d.getNotificationChannelGroups());
        }
        return null;
    }

    public WritableArray t() {
        if (Build.VERSION.SDK_INT >= 26) {
            return k(this.d.getNotificationChannels());
        }
        return null;
    }

    public ArrayList<Bundle> w() {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        Map<String, ?> all = this.e.getAll();
        for (String str : all.keySet()) {
            try {
                arrayList.add(a.a(new JSONObject((String) all.get(str))));
            } catch (JSONException e2) {
                Log.e(C0201.m82(27157), e2.getMessage());
            }
        }
        return arrayList;
    }

    public d(Context context) {
        this.a = (AlarmManager) context.getSystemService(C0201.m82(27100));
        this.b = context;
        this.d = (NotificationManager) context.getSystemService(C0201.m82(27101));
        this.e = context.getSharedPreferences(C0201.m82(27102), 0);
    }
}
