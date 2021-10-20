package com.reactnativenavigation.react;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;
import vigqyno.C0201;

/* compiled from: DevPermissionRequest */
public class r {
    private final boolean a;

    public r(boolean z) {
        this.a = z;
    }

    @TargetApi(23)
    public void a(Activity activity) {
        if (b(activity)) {
            Intent intent = new Intent(C0201.m82(17665));
            intent.addFlags(268435456);
            activity.startActivity(intent);
            String r0 = C0201.m82(17666);
            String r1 = C0201.m82(17667);
            Log.w(r1, C0201.m82(17668));
            Log.w(r1, r0);
            Log.w(r1, C0201.m82(17669));
            Toast.makeText(activity, r0, 1).show();
        }
    }

    public boolean b(Activity activity) {
        boolean z = this.a;
        return false;
    }
}
