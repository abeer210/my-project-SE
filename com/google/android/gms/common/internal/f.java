package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.i;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class f {
    private static final x0<String, String> a = new x0<>();

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return hq0.a(context).c(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context) {
        return context.getResources().getString(mo0.common_google_play_services_notification_channel_name);
    }

    public static String c(Context context, int i) {
        Resources resources = context.getResources();
        if (i == 1) {
            return resources.getString(mo0.common_google_play_services_install_button);
        }
        if (i == 2) {
            return resources.getString(mo0.common_google_play_services_update_button);
        }
        if (i != 3) {
            return resources.getString(17039370);
        }
        return resources.getString(mo0.common_google_play_services_enable_button);
    }

    public static String d(Context context, int i) {
        Resources resources = context.getResources();
        String a2 = a(context);
        if (i == 1) {
            return resources.getString(mo0.common_google_play_services_install_text, a2);
        } else if (i != 2) {
            if (i == 3) {
                return resources.getString(mo0.common_google_play_services_enable_text, a2);
            } else if (i == 5) {
                return i(context, C0201.m82(7994), a2);
            } else {
                if (i == 7) {
                    return i(context, C0201.m82(7993), a2);
                }
                if (i == 9) {
                    return resources.getString(mo0.common_google_play_services_unsupported_text, a2);
                } else if (i == 20) {
                    return i(context, C0201.m82(7992), a2);
                } else {
                    switch (i) {
                        case 16:
                            return i(context, C0201.m82(7991), a2);
                        case 17:
                            return i(context, C0201.m82(7990), a2);
                        case 18:
                            return resources.getString(mo0.common_google_play_services_updating_text, a2);
                        default:
                            return resources.getString(fp0.common_google_play_services_unknown_issue, a2);
                    }
                }
            }
        } else if (i.c(context)) {
            return resources.getString(mo0.common_google_play_services_wear_update_text);
        } else {
            return resources.getString(mo0.common_google_play_services_update_text, a2);
        }
    }

    public static String e(Context context, int i) {
        if (i != 6 && i != 19) {
            return d(context, i);
        }
        return i(context, C0201.m82(7995), a(context));
    }

    public static String f(Context context, int i) {
        String str;
        if (i == 6) {
            str = h(context, C0201.m82(7996));
        } else {
            str = g(context, i);
        }
        return str == null ? context.getResources().getString(mo0.common_google_play_services_notification_ticker) : str;
    }

    public static String g(Context context, int i) {
        Resources resources = context.getResources();
        String r2 = C0201.m82(7997);
        switch (i) {
            case 1:
                return resources.getString(mo0.common_google_play_services_install_title);
            case 2:
                return resources.getString(mo0.common_google_play_services_update_title);
            case 3:
                return resources.getString(mo0.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e(r2, C0201.m82(8010));
                return h(context, C0201.m82(8011));
            case 7:
                Log.e(r2, C0201.m82(8008));
                return h(context, C0201.m82(8009));
            case 8:
                Log.e(r2, C0201.m82(8007));
                return null;
            case 9:
                Log.e(r2, C0201.m82(8006));
                return null;
            case 10:
                Log.e(r2, C0201.m82(8005));
                return null;
            case 11:
                Log.e(r2, C0201.m82(8004));
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append(C0201.m82(7998));
                sb.append(i);
                Log.e(r2, sb.toString());
                return null;
            case 16:
                Log.e(r2, C0201.m82(8003));
                return null;
            case 17:
                Log.e(r2, C0201.m82(8001));
                return h(context, C0201.m82(8002));
            case 20:
                Log.e(r2, C0201.m82(7999));
                return h(context, C0201.m82(8000));
        }
    }

    private static String h(Context context, String str) {
        synchronized (a) {
            String str2 = a.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources e = cp0.e(context);
            if (e == null) {
                return null;
            }
            int identifier = e.getIdentifier(str, C0201.m82(8012), C0201.m82(8013));
            if (identifier == 0) {
                String r5 = C0201.m82(8014);
                String r2 = C0201.m82(8015);
                String valueOf = String.valueOf(str);
                Log.w(r5, valueOf.length() != 0 ? r2.concat(valueOf) : new String(r2));
                return null;
            }
            String string = e.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                String r52 = C0201.m82(8016);
                String r22 = C0201.m82(8017);
                String valueOf2 = String.valueOf(str);
                Log.w(r52, valueOf2.length() != 0 ? r22.concat(valueOf2) : new String(r22));
                return null;
            }
            a.put(str, string);
            return string;
        }
    }

    private static String i(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String h = h(context, str);
        if (h == null) {
            h = resources.getString(fp0.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, h, str2);
    }
}
