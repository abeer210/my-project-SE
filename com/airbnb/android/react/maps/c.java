package com.airbnb.android.react.maps;

import android.content.Context;
import com.facebook.react.views.view.f;

/* compiled from: AirMapFeature */
public abstract class c extends f {
    public c(Context context) {
        super(context);
    }

    public abstract void e(com.google.android.gms.maps.c cVar);

    public abstract Object getFeature();
}
