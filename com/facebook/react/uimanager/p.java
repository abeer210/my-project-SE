package com.facebook.react.uimanager;

import androidx.core.util.f;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import vigqyno.C0201;

/* compiled from: OnLayoutEvent */
public class p extends c<p> {
    private static final f<p> j = new f<>(20);
    private int f;
    private int g;
    private int h;
    private int i;

    private p() {
    }

    public static p n(int i2, int i3, int i4, int i5, int i6) {
        p b = j.b();
        if (b == null) {
            b = new p();
        }
        b.m(i2, i3, i4, i5, i6);
        return b;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void c(RCTEventEmitter rCTEventEmitter) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble(C0201.m82(21768), (double) q.a((float) this.f));
        createMap.putDouble(C0201.m82(21769), (double) q.a((float) this.g));
        createMap.putDouble(C0201.m82(21770), (double) q.a((float) this.h));
        createMap.putDouble(C0201.m82(21771), (double) q.a((float) this.i));
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putMap(C0201.m82(21772), createMap);
        createMap2.putInt(C0201.m82(21773), i());
        rCTEventEmitter.receiveEvent(i(), f(), createMap2);
    }

    @Override // com.facebook.react.uimanager.events.c
    public String f() {
        return C0201.m82(21774);
    }

    @Override // com.facebook.react.uimanager.events.c
    public void l() {
        j.a(this);
    }

    public void m(int i2, int i3, int i4, int i5, int i6) {
        super.j(i2);
        this.f = i3;
        this.g = i4;
        this.h = i5;
        this.i = i6;
    }
}
