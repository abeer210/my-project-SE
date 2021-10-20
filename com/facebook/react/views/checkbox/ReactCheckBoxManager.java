package com.facebook.react.views.checkbox;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.TypedValue;
import android.widget.CompoundButton;
import androidx.appcompat.widget.u0;
import androidx.core.widget.c;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.k0;
import vigqyno.C0201;

public class ReactCheckBoxManager extends SimpleViewManager<a> {
    private static final CompoundButton.OnCheckedChangeListener ON_CHECKED_CHANGE_LISTENER = new a();
    public static final String REACT_CLASS = null;

    static class a implements CompoundButton.OnCheckedChangeListener {
        private ReactContext a(CompoundButton compoundButton) {
            Context context = compoundButton.getContext();
            if (context instanceof u0) {
                return (ReactContext) ((u0) context).getBaseContext();
            }
            return (ReactContext) compoundButton.getContext();
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            ((UIManagerModule) a(compoundButton).getNativeModule(UIManagerModule.class)).getEventDispatcher().v(new b(compoundButton.getId(), z));
        }
    }

    static {
        C0201.m83(ReactCheckBoxManager.class, 674);
    }

    private static int getIdentifier(Context context, String str) {
        return context.getResources().getIdentifier(str, C0201.m82(27569), context.getPackageName());
    }

    private static int getThemeColor(Context context, String str) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(getIdentifier(context, str), typedValue, true);
        return typedValue.data;
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return C0201.m82(27570);
    }

    @xj0(defaultBoolean = true, name = "enabled")
    public void setEnabled(a aVar, boolean z) {
        aVar.setEnabled(z);
    }

    @xj0(name = "on")
    public void setOn(a aVar, boolean z) {
        aVar.setOnCheckedChangeListener(null);
        aVar.b(z);
        aVar.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0026  */
    @xj0(name = "tintColors")
    public void setTintColors(a aVar, ReadableMap readableMap) {
        int i;
        int i2;
        if (readableMap != null) {
            String r0 = C0201.m82(27572);
            if (readableMap.hasKey(r0)) {
                i = readableMap.getInt(r0);
                if (readableMap != null) {
                    String r1 = C0201.m82(27574);
                    if (readableMap.hasKey(r1)) {
                        i2 = readableMap.getInt(r1);
                        c.c(aVar, new ColorStateList(new int[][]{new int[]{16842912}, new int[]{-16842912}}, new int[]{i, i2}));
                    }
                }
                i2 = getThemeColor(aVar.getContext(), C0201.m82(27575));
                c.c(aVar, new ColorStateList(new int[][]{new int[]{16842912}, new int[]{-16842912}}, new int[]{i, i2}));
            }
        }
        i = getThemeColor(aVar.getContext(), C0201.m82(27573));
        if (readableMap != null) {
        }
        i2 = getThemeColor(aVar.getContext(), C0201.m82(27575));
        c.c(aVar, new ColorStateList(new int[][]{new int[]{16842912}, new int[]{-16842912}}, new int[]{i, i2}));
    }

    public void addEventEmitters(k0 k0Var, a aVar) {
        aVar.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(k0 k0Var) {
        return new a(k0Var);
    }

    public void receiveCommand(a aVar, String str, ReadableArray readableArray) {
        if (((str.hashCode() == -669744680 && str.equals(C0201.m82(27571))) ? (char) 0 : 65535) == 0 && readableArray != null) {
            setOn(aVar, readableArray.getBoolean(0));
        }
    }
}
