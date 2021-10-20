package com.facebook.react.views.picker;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

/* compiled from: ReactPickerItem */
public class c {
    public final String a;
    public final Integer b;

    public c(ReadableMap readableMap) {
        this.a = readableMap.getString(C0201.m82(9694));
        String r0 = C0201.m82(9695);
        if (!readableMap.hasKey(r0) || readableMap.isNull(r0)) {
            this.b = null;
        } else {
            this.b = Integer.valueOf(readableMap.getInt(r0));
        }
    }

    public static List<c> a(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(readableArray.size());
        for (int i = 0; i < readableArray.size(); i++) {
            arrayList.add(new c(readableArray.getMap(i)));
        }
        return arrayList;
    }
}
