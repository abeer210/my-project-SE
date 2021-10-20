package com.facebook.react.views.modal;

import android.graphics.Point;
import com.facebook.react.uimanager.b0;
import com.facebook.react.uimanager.i;

/* compiled from: ModalHostShadowNode */
public class b extends i {
    @Override // com.facebook.react.uimanager.b0
    public void addChildAt(b0 b0Var, int i) {
        super.addChildAt(b0Var, i);
        Point a = a.a(getThemedContext());
        b0Var.setStyleWidth((float) a.x);
        b0Var.setStyleHeight((float) a.y);
    }
}
