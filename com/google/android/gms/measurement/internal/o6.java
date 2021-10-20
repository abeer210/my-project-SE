package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import vigqyno.C0201;

@TargetApi(14)
public final class o6 implements Application.ActivityLifecycleCallbacks {
    public static final String b = null;
    public static final String c = null;
    public static final String d = null;
    public static final String e = null;
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
    private final /* synthetic */ v5 a;

    static {
        C0201.m83(o6.class, 49);
    }

    private o6(v5 v5Var) {
        this.a = v5Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x015e  */
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        String str;
        Bundle bundle2;
        Bundle bundle3;
        String str2 = d;
        try {
            this.a.e().M().d(b);
            Intent intent = activity.getIntent();
            if (intent != null) {
                Uri data = intent.getData();
                if (data == null || !data.isHierarchical()) {
                    this.a.s().B(activity, bundle);
                    return;
                }
                this.a.m();
                boolean k0 = y8.k0(intent);
                String str3 = s;
                String str4 = k0 ? t : str3;
                String queryParameter = data.getQueryParameter(str2);
                boolean p2 = this.a.g().p(l.D0);
                String str5 = k;
                String str6 = q;
                String str7 = f;
                String str8 = g;
                String str9 = r;
                String str10 = c;
                if ((p2 || this.a.g().p(l.E0)) && !TextUtils.isEmpty(queryParameter)) {
                    if (queryParameter.contains(str10) || queryParameter.contains(str9) || queryParameter.contains(str8) || queryParameter.contains(str6)) {
                        y8 m2 = this.a.m();
                        String str11 = m;
                        str = str5;
                        String valueOf = String.valueOf(queryParameter);
                        bundle2 = m2.u(Uri.parse(valueOf.length() != 0 ? str11.concat(valueOf) : new String(str11)));
                        if (bundle2 != null) {
                            bundle2.putString(str7, str2);
                        }
                        if (bundle != null) {
                            bundle3 = this.a.m().u(data);
                            if (bundle3 != null) {
                                bundle3.putString(str7, j);
                                if (this.a.g().p(l.D0) && !bundle3.containsKey(str10) && bundle2 != null && bundle2.containsKey(str10)) {
                                    bundle3.putString(o, String.format(h, bundle2.getString(str10)));
                                }
                                this.a.I(str4, p, bundle3);
                            }
                        } else {
                            bundle3 = null;
                        }
                        if (this.a.g().p(l.E0) && bundle2 != null && bundle2.containsKey(str10) && (bundle3 == null || !bundle3.containsKey(str10))) {
                            this.a.k0(str3, v, bundle2.getString(str10), true);
                        }
                        if (!TextUtils.isEmpty(queryParameter)) {
                            this.a.s().B(activity, bundle);
                            return;
                        }
                        if (!(queryParameter.contains(str10) && (queryParameter.contains(str9) || queryParameter.contains(str8) || queryParameter.contains(str6) || queryParameter.contains(l) || queryParameter.contains(e)))) {
                            this.a.e().L().d(str);
                            this.a.s().B(activity, bundle);
                            return;
                        }
                        this.a.e().L().a(i, queryParameter);
                        if (!TextUtils.isEmpty(queryParameter)) {
                            this.a.k0(str3, n, queryParameter, true);
                        }
                        this.a.s().B(activity, bundle);
                        return;
                    }
                    this.a.e().L().d(str5);
                }
                str = str5;
                bundle2 = null;
                if (bundle != null) {
                }
                this.a.k0(str3, v, bundle2.getString(str10), true);
                if (!TextUtils.isEmpty(queryParameter)) {
                }
            }
        } catch (Exception e2) {
            this.a.e().E().a(u, e2);
        } finally {
            this.a.s().B(activity, bundle);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        this.a.s().C(activity);
    }

    public final void onActivityPaused(Activity activity) {
        this.a.s().D(activity);
        b8 u2 = this.a.u();
        u2.c().y(new g8(u2, u2.b().b()));
    }

    public final void onActivityResumed(Activity activity) {
        this.a.s().E(activity);
        b8 u2 = this.a.u();
        u2.c().y(new h8(u2, u2.b().b()));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.a.s().F(activity, bundle);
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public /* synthetic */ o6(v5 v5Var, u5 u5Var) {
        this(v5Var);
    }
}
