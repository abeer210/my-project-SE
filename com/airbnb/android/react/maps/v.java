package com.airbnb.android.react.maps;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import com.facebook.react.views.view.f;
import vigqyno.C0201;

/* compiled from: ViewAttacherGroup */
public class v extends f {
    public v(Context context) {
        super(context);
        setWillNotDraw(true);
        setVisibility(0);
        setAlpha(0.0f);
        setRemoveClippedSubviews(false);
        if (Build.VERSION.SDK_INT >= 18) {
            setClipBounds(new Rect(0, 0, 0, 0));
        }
        setOverflow(C0201.m82(31773));
    }

    @Override // com.facebook.react.views.view.f
    public boolean hasOverlappingRendering() {
        return false;
    }
}
