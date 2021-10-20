package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import vigqyno.C0201;

public final class z2 {
    private final Context a;

    public z2(Context context) {
        this.a = context;
    }

    public static String b(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                return null;
            }
            return bundle.getString(C0201.m82(14062));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final Context a() {
        return this.a;
    }
}
