package com.facebook.react.views.image;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import vigqyno.C0201;

/* compiled from: ImageLoadEvent */
public class b extends c<b> {
    private final int f;
    private final String g;
    private final int h;
    private final int i;
    private final String j;

    public b(int i2, int i3) {
        this(i2, i3, null);
    }

    public static String m(int i2) {
        if (i2 == 1) {
            return C0201.m82(31861);
        }
        if (i2 == 2) {
            return C0201.m82(31860);
        }
        if (i2 == 3) {
            return C0201.m82(31859);
        }
        if (i2 == 4) {
            return C0201.m82(31858);
        }
        if (i2 == 5) {
            return C0201.m82(31856);
        }
        throw new IllegalStateException(C0201.m82(31857) + Integer.toString(i2));
    }

    @Override // com.facebook.react.uimanager.events.c
    public void c(RCTEventEmitter rCTEventEmitter) {
        WritableMap writableMap;
        int i2;
        if (this.g != null || (i2 = this.f) == 2 || i2 == 1) {
            writableMap = Arguments.createMap();
            String str = this.g;
            if (str != null) {
                writableMap.putString(C0201.m82(31862), str);
            }
            int i3 = this.f;
            if (i3 == 2) {
                WritableMap createMap = Arguments.createMap();
                createMap.putDouble(C0201.m82(31863), (double) this.h);
                createMap.putDouble(C0201.m82(31864), (double) this.i);
                String str2 = this.g;
                if (str2 != null) {
                    createMap.putString(C0201.m82(31865), str2);
                }
                writableMap.putMap(C0201.m82(31866), createMap);
            } else if (i3 == 1) {
                writableMap.putString(C0201.m82(31867), this.j);
            }
        } else {
            writableMap = null;
        }
        rCTEventEmitter.receiveEvent(i(), f(), writableMap);
    }

    @Override // com.facebook.react.uimanager.events.c
    public short e() {
        return (short) this.f;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String f() {
        return m(this.f);
    }

    public b(int i2, int i3, boolean z, String str) {
        this(i2, i3, null, 0, 0, str);
    }

    public b(int i2, int i3, String str) {
        this(i2, i3, str, 0, 0, null);
    }

    public b(int i2, int i3, String str, int i4, int i5) {
        this(i2, i3, str, i4, i5, null);
    }

    public b(int i2, int i3, String str, int i4, int i5, String str2) {
        super(i2);
        this.f = i3;
        this.g = str;
        this.h = i4;
        this.i = i5;
        this.j = str2;
    }
}
