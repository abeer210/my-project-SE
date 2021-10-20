package com.facebook.react.uimanager.events;

import android.util.SparseArray;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftException;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import vigqyno.C0201;

public class ReactEventEmitter implements RCTEventEmitter {
    private static final String TAG = null;
    private final SparseArray<RCTEventEmitter> mEventEmitters = new SparseArray<>();
    private final ReactApplicationContext mReactContext;

    static {
        C0201.m83(ReactEventEmitter.class, 363);
    }

    public ReactEventEmitter(ReactApplicationContext reactApplicationContext) {
        this.mReactContext = reactApplicationContext;
    }

    private RCTEventEmitter getEventEmitter(int i) {
        int a = zj0.a(i);
        RCTEventEmitter rCTEventEmitter = this.mEventEmitters.get(a);
        if (rCTEventEmitter != null) {
            return rCTEventEmitter;
        }
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(a)};
        String r3 = C0201.m82(23904);
        f60.k(r3, C0201.m82(23905), objArr);
        if (this.mReactContext.hasActiveCatalystInstance()) {
            return (RCTEventEmitter) this.mReactContext.getJSModule(RCTEventEmitter.class);
        }
        ReactSoftException.logSoftException(r3, new ReactNoCrashSoftException(C0201.m82(23906) + i + C0201.m82(23907) + a + C0201.m82(23908)));
        return rCTEventEmitter;
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveEvent(int i, String str, WritableMap writableMap) {
        RCTEventEmitter eventEmitter = getEventEmitter(i);
        if (eventEmitter != null) {
            eventEmitter.receiveEvent(i, str, writableMap);
        }
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2) {
        yh0.a(writableArray.size() > 0);
        RCTEventEmitter eventEmitter = getEventEmitter(writableArray.getMap(0).getInt(C0201.m82(23909)));
        if (eventEmitter != null) {
            eventEmitter.receiveTouches(str, writableArray, writableArray2);
        }
    }

    public void register(int i, RCTEventEmitter rCTEventEmitter) {
        this.mEventEmitters.put(i, rCTEventEmitter);
    }

    public void unregister(int i) {
        this.mEventEmitters.remove(i);
    }
}
