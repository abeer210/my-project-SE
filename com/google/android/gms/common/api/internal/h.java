package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.internal.x0;
import com.google.android.gms.common.internal.y;
import vigqyno.C0201;

@Deprecated
/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class h {
    private static final Object d = new Object();
    private static h e;
    private final String a;
    private final Status b;
    private final boolean c;

    public h(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(C0201.m82(38869), C0201.m82(38870), resources.getResourcePackageName(fp0.common_google_play_services_unknown_issue));
        boolean z = false;
        if (identifier != 0) {
            this.c = !(resources.getInteger(identifier) != 0 ? true : z);
        } else {
            this.c = false;
        }
        String a2 = x0.a(context);
        a2 = a2 == null ? new y(context).a(C0201.m82(38871)) : a2;
        if (TextUtils.isEmpty(a2)) {
            this.b = new Status(10, C0201.m82(38872));
            this.a = null;
            return;
        }
        this.a = a2;
        this.b = Status.e;
    }

    private static h a(String str) {
        h hVar;
        synchronized (d) {
            if (e != null) {
                hVar = e;
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
                sb.append(C0201.m82(38873));
                sb.append(str);
                sb.append(C0201.m82(38874));
                throw new IllegalStateException(sb.toString());
            }
        }
        return hVar;
    }

    public static String b() {
        return a(C0201.m82(38875)).a;
    }

    public static Status c(Context context) {
        Status status;
        u.l(context, C0201.m82(38876));
        synchronized (d) {
            if (e == null) {
                e = new h(context);
            }
            status = e.b;
        }
        return status;
    }

    public static boolean d() {
        return a(C0201.m82(38877)).c;
    }
}
