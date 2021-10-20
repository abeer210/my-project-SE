package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.swmansion.reanimated.b;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

public class EventNode extends m implements RCTEventEmitter {
    private final List<a> mMapping;

    /* access modifiers changed from: private */
    public static class a {
        private final int a;
        private final String[] b;

        public a(ReadableArray readableArray) {
            int size = readableArray.size() - 1;
            this.b = new String[size];
            for (int i = 0; i < size; i++) {
                this.b[i] = readableArray.getString(i);
            }
            this.a = readableArray.getInt(size);
        }

        public Double b(ReadableMap readableMap) {
            int i = 0;
            while (readableMap != null) {
                String[] strArr = this.b;
                if (i >= strArr.length - 1) {
                    break;
                }
                String str = strArr[i];
                readableMap = readableMap.hasKey(str) ? readableMap.getMap(str) : null;
                i++;
            }
            if (readableMap == null) {
                return null;
            }
            String[] strArr2 = this.b;
            String str2 = strArr2[strArr2.length - 1];
            if (readableMap.hasKey(str2)) {
                return Double.valueOf(readableMap.getDouble(str2));
            }
            return null;
        }
    }

    public EventNode(int i, ReadableMap readableMap, b bVar) {
        super(i, readableMap, bVar);
        this.mMapping = processMapping(readableMap.getArray(C0201.m82(31392)));
    }

    private static List<a> processMapping(ReadableArray readableArray) {
        int size = readableArray.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new a(readableArray.getArray(i)));
        }
        return arrayList;
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveEvent(int i, String str, WritableMap writableMap) {
        if (writableMap != null) {
            for (int i2 = 0; i2 < this.mMapping.size(); i2++) {
                a aVar = this.mMapping.get(i2);
                Double b = aVar.b(writableMap);
                if (b != null) {
                    ((u) this.mNodesManager.o(aVar.a, u.class)).c(b);
                }
            }
            return;
        }
        throw new IllegalArgumentException(C0201.m82(31393));
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2) {
        throw new RuntimeException(C0201.m82(31394));
    }

    @Override // com.swmansion.reanimated.nodes.m
    public Double evaluate() {
        return m.ZERO;
    }
}
