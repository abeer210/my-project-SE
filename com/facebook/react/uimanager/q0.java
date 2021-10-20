package com.facebook.react.uimanager;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.JSIModuleType;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftException;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.uimanager.events.d;
import vigqyno.C0201;

/* compiled from: UIManagerHelper */
public class q0 {
    public static d a(ReactContext reactContext, int i) {
        UIManager e = e(reactContext, i, false);
        if (e == null) {
            return null;
        }
        return (d) e.getEventDispatcher();
    }

    public static d b(ReactContext reactContext, int i) {
        return a(reactContext, zj0.a(i));
    }

    public static ReactContext c(View view) {
        Context context = view.getContext();
        if (!(context instanceof ReactContext) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (ReactContext) context;
    }

    public static UIManager d(ReactContext reactContext, int i) {
        return e(reactContext, i, true);
    }

    private static UIManager e(ReactContext reactContext, int i, boolean z) {
        if (reactContext.isBridgeless()) {
            return (UIManager) reactContext.getJSIModule(JSIModuleType.UIManager);
        }
        boolean hasCatalystInstance = reactContext.hasCatalystInstance();
        String r2 = C0201.m82(19932);
        if (!hasCatalystInstance) {
            ReactSoftException.logSoftException(r2, new ReactNoCrashSoftException(C0201.m82(19933)));
            return null;
        }
        if (!reactContext.hasActiveCatalystInstance()) {
            ReactSoftException.logSoftException(r2, new ReactNoCrashSoftException(C0201.m82(19934)));
            if (z) {
                return null;
            }
        }
        CatalystInstance catalystInstance = reactContext.getCatalystInstance();
        if (i == 2) {
            return (UIManager) catalystInstance.getJSIModule(JSIModuleType.UIManager);
        }
        return (UIManager) catalystInstance.getNativeModule(UIManagerModule.class);
    }
}
