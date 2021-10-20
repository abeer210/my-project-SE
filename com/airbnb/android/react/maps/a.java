package com.airbnb.android.react.maps;

import android.content.Context;
import com.facebook.react.views.view.f;

/* compiled from: AirMapCallout */
public class a extends f {
    private boolean a = false;
    public int b;
    public int c;

    public a(Context context) {
        super(context);
    }

    public boolean getTooltip() {
        return this.a;
    }

    public void setTooltip(boolean z) {
        this.a = z;
    }
}
