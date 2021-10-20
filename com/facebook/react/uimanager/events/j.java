package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.q;
import vigqyno.C0201;

/* compiled from: TouchesHelper */
public class j {
    private static WritableArray a(int i, g gVar) {
        WritableArray createArray = Arguments.createArray();
        MotionEvent m = gVar.m();
        float x = m.getX() - gVar.n();
        float y = m.getY() - gVar.o();
        for (int i2 = 0; i2 < m.getPointerCount(); i2++) {
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble(C0201.m82(25015), (double) q.a(m.getX(i2)));
            createMap.putDouble(C0201.m82(25016), (double) q.a(m.getY(i2)));
            createMap.putDouble(C0201.m82(25017), (double) q.a(m.getX(i2) - x));
            createMap.putDouble(C0201.m82(25018), (double) q.a(m.getY(i2) - y));
            createMap.putInt(C0201.m82(25019), i);
            createMap.putDouble(C0201.m82(25020), (double) gVar.g());
            createMap.putDouble(C0201.m82(25021), (double) m.getPointerId(i2));
            createArray.pushMap(createMap);
        }
        return createArray;
    }

    public static void b(RCTEventEmitter rCTEventEmitter, i iVar, int i, g gVar) {
        WritableArray a = a(i, gVar);
        MotionEvent m = gVar.m();
        WritableArray createArray = Arguments.createArray();
        if (iVar == i.MOVE || iVar == i.CANCEL) {
            for (int i2 = 0; i2 < m.getPointerCount(); i2++) {
                createArray.pushInt(i2);
            }
        } else if (iVar == i.START || iVar == i.END) {
            createArray.pushInt(m.getActionIndex());
        } else {
            throw new RuntimeException(C0201.m82(25022) + iVar);
        }
        rCTEventEmitter.receiveTouches(i.b(iVar), a, createArray);
    }
}
