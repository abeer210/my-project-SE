package com.facebook.react.devsupport;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;

/* compiled from: LogBoxDialog */
public class d extends Dialog {
    public d(Activity activity, View view) {
        super(activity, li0.Theme_Catalyst_LogBox);
        requestWindowFeature(1);
        setContentView(view);
    }
}
