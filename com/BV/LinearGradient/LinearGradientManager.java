package com.BV.LinearGradient;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.k0;
import vigqyno.C0201;

public class LinearGradientManager extends SimpleViewManager<b> {
    public static final String PROP_ANGLE = null;
    public static final String PROP_ANGLE_CENTER = null;
    public static final String PROP_BORDER_RADII = null;
    public static final String PROP_COLORS = null;
    public static final String PROP_END_POS = null;
    public static final String PROP_LOCATIONS = null;
    public static final String PROP_START_POS = null;
    public static final String PROP_USE_ANGLE = null;
    public static final String REACT_CLASS = null;

    static {
        C0201.m83(LinearGradientManager.class, 401);
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return C0201.m82(29327);
    }

    @xj0(defaultFloat = 45.0f, name = "angle")
    public void setAngle(b bVar, float f) {
        bVar.setAngle(f);
    }

    @xj0(name = "angleCenter")
    public void setAngleCenter(b bVar, ReadableArray readableArray) {
        bVar.setAngleCenter(readableArray);
    }

    @xj0(name = "borderRadii")
    public void setBorderRadii(b bVar, ReadableArray readableArray) {
        bVar.setBorderRadii(readableArray);
    }

    @xj0(name = "colors")
    public void setColors(b bVar, ReadableArray readableArray) {
        bVar.setColors(readableArray);
    }

    @xj0(name = "endPoint")
    public void setEndPosition(b bVar, ReadableArray readableArray) {
        bVar.setEndPosition(readableArray);
    }

    @xj0(name = "locations")
    public void setLocations(b bVar, ReadableArray readableArray) {
        if (readableArray != null) {
            bVar.setLocations(readableArray);
        }
    }

    @xj0(name = "startPoint")
    public void setStartPosition(b bVar, ReadableArray readableArray) {
        bVar.setStartPosition(readableArray);
    }

    @xj0(defaultBoolean = false, name = "useAngle")
    public void setUseAngle(b bVar, boolean z) {
        bVar.setUseAngle(z);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public b createViewInstance(k0 k0Var) {
        return new b(k0Var);
    }
}
