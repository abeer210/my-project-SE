package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.api.internal.j;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public abstract class g implements DialogInterface.OnClickListener {
    public static g a(Activity activity, Intent intent, int i) {
        return new a0(intent, activity, i);
    }

    public static g b(j jVar, Intent intent, int i) {
        return new b0(intent, jVar, i);
    }

    public abstract void c();

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            c();
        } catch (ActivityNotFoundException e) {
            Log.e(C0201.m82(7921), C0201.m82(7922), e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
