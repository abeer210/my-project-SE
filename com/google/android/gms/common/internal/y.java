package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public class y {
    private final Resources a;
    private final String b;

    public y(Context context) {
        u.k(context);
        Resources resources = context.getResources();
        this.a = resources;
        this.b = resources.getResourcePackageName(fp0.common_google_play_services_unknown_issue);
    }

    public String a(String str) {
        int identifier = this.a.getIdentifier(str, C0201.m82(9012), this.b);
        if (identifier == 0) {
            return null;
        }
        return this.a.getString(identifier);
    }
}
