package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.pm.PackageManager;
import vigqyno.C0201;

public final class f2 {
    private static final gy1 c = new gy1(C0201.m82(22438));
    private final Context a;
    private int b = -1;

    public f2(Context context) {
        this.a = context;
    }

    public final synchronized int a() {
        if (this.b == -1) {
            try {
                this.b = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                c.e(C0201.m82(22439), new Object[0]);
            }
        }
        return this.b;
    }
}
