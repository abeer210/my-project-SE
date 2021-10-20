package com.facebook.react.views.text;

import com.facebook.react.uimanager.b0;
import vigqyno.C0201;

/* compiled from: ReactRawTextShadowNode */
public class k extends b0 {
    private String a = null;

    public String b() {
        return this.a;
    }

    @Override // com.facebook.react.uimanager.a0, com.facebook.react.uimanager.b0
    public boolean isVirtual() {
        return true;
    }

    @xj0(name = "text")
    public void setText(String str) {
        this.a = str;
        markUpdated();
    }

    @Override // com.facebook.react.uimanager.b0
    public String toString() {
        return getViewClass() + C0201.m82(1193) + this.a + C0201.m82(1194);
    }
}
