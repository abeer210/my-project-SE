package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.fragment.app.d;
import com.google.android.gms.common.internal.u;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public class i {
    private final Object a;

    public i(Activity activity) {
        u.l(activity, C0201.m82(38824));
        this.a = activity;
    }

    public Activity a() {
        return (Activity) this.a;
    }

    public d b() {
        return (d) this.a;
    }

    public boolean c() {
        return this.a instanceof d;
    }

    public final boolean d() {
        return this.a instanceof Activity;
    }
}
