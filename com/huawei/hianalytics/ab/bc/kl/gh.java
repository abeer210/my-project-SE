package com.huawei.hianalytics.ab.bc.kl;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.UserManager;
import com.huawei.hianalytics.ab.ab.bc;
import vigqyno.C0201;

public class gh {
    private static gh cd = new gh();
    private boolean ab = false;
    private Context bc = bc.fg();

    private gh() {
    }

    public static gh bc() {
        return cd;
    }

    @TargetApi(24)
    public boolean ab() {
        boolean z;
        if (!this.ab) {
            Context context = this.bc;
            if (context == null) {
                return false;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                UserManager userManager = (UserManager) context.getSystemService(C0201.m82(31036));
                if (userManager != null) {
                    z = userManager.isUserUnlocked();
                } else {
                    this.ab = false;
                }
            } else {
                z = true;
            }
            this.ab = z;
        }
        return this.ab;
    }
}
