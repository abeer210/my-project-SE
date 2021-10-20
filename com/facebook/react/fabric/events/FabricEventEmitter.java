package com.facebook.react.fabric.events;

import android.util.Pair;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.fabric.c;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.systrace.a;
import java.util.HashSet;
import vigqyno.C0201;

public class FabricEventEmitter implements RCTEventEmitter {
    private static final String TAG = null;
    private final c mUIManager;

    static {
        C0201.m83(FabricEventEmitter.class, 718);
    }

    public FabricEventEmitter(c cVar) {
        this.mUIManager = cVar;
    }

    private WritableArray copyWritableArray(WritableArray writableArray) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (int i = 0; i < writableArray.size(); i++) {
            writableNativeArray.pushMap(getWritableMap(writableArray.getMap(i)));
        }
        return writableNativeArray;
    }

    private WritableMap getWritableMap(ReadableMap readableMap) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.merge(readableMap);
        return writableNativeMap;
    }

    private Pair<WritableArray, WritableArray> removeTouchesAtIndices(WritableArray writableArray, WritableArray writableArray2) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        WritableNativeArray writableNativeArray2 = new WritableNativeArray();
        HashSet hashSet = new HashSet();
        for (int i = 0; i < writableArray2.size(); i++) {
            int i2 = writableArray2.getInt(i);
            writableNativeArray.pushMap(getWritableMap(writableArray.getMap(i2)));
            hashSet.add(Integer.valueOf(i2));
        }
        for (int i3 = 0; i3 < writableArray.size(); i3++) {
            if (!hashSet.contains(Integer.valueOf(i3))) {
                writableNativeArray2.pushMap(getWritableMap(writableArray.getMap(i3)));
            }
        }
        return new Pair<>(writableNativeArray, writableNativeArray2);
    }

    private Pair<WritableArray, WritableArray> touchSubsequence(WritableArray writableArray, WritableArray writableArray2) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (int i = 0; i < writableArray2.size(); i++) {
            writableNativeArray.pushMap(getWritableMap(writableArray.getMap(writableArray2.getInt(i))));
        }
        return new Pair<>(writableNativeArray, writableArray);
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveEvent(int i, String str, WritableMap writableMap) {
        a.c(0, C0201.m82(7315) + str + C0201.m82(7316));
        this.mUIManager.g(i, str, writableMap);
        throw null;
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2) {
        Pair<WritableArray, WritableArray> pair;
        if (C0201.m82(7317).equalsIgnoreCase(str) || C0201.m82(7318).equalsIgnoreCase(str)) {
            pair = removeTouchesAtIndices(writableArray, writableArray2);
        } else {
            pair = touchSubsequence(writableArray, writableArray2);
        }
        WritableArray writableArray3 = (WritableArray) pair.first;
        WritableArray writableArray4 = (WritableArray) pair.second;
        for (int i = 0; i < writableArray3.size(); i++) {
            WritableMap writableMap = getWritableMap(writableArray3.getMap(i));
            writableMap.putArray(C0201.m82(7319), copyWritableArray(writableArray3));
            writableMap.putArray(C0201.m82(7320), copyWritableArray(writableArray4));
            int i2 = writableMap.getInt(C0201.m82(7321));
            if (i2 < 1) {
                f60.i(C0201.m82(7322), C0201.m82(7323));
                i2 = 0;
            }
            receiveEvent(i2, str, writableMap);
        }
    }
}
