package com.facebook.react.views.scroll;

import androidx.core.util.f;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import com.facebook.react.uimanager.q;
import vigqyno.C0201;

/* compiled from: ScrollEvent */
public class h extends c<h> {
    private static final f<h> o = new f<>(3);
    private int f;
    private int g;
    private double h;
    private double i;
    private int j;
    private int k;
    private int l;
    private int m;
    private i n;

    private h() {
    }

    private void m(int i2, i iVar, int i3, int i4, float f2, float f3, int i5, int i6, int i7, int i8) {
        super.j(i2);
        this.n = iVar;
        this.f = i3;
        this.g = i4;
        this.h = (double) f2;
        this.i = (double) f3;
        this.j = i5;
        this.k = i6;
        this.l = i7;
        this.m = i8;
    }

    public static h n(int i2, i iVar, int i3, int i4, float f2, float f3, int i5, int i6, int i7, int i8) {
        h b = o.b();
        if (b == null) {
            b = new h();
        }
        b.m(i2, iVar, i3, i4, f2, f3, i5, i6, i7, i8);
        return b;
    }

    private WritableMap o() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble(C0201.m82(22440), 0.0d);
        createMap.putDouble(C0201.m82(22441), 0.0d);
        createMap.putDouble(C0201.m82(22442), 0.0d);
        createMap.putDouble(C0201.m82(22443), 0.0d);
        WritableMap createMap2 = Arguments.createMap();
        String r4 = C0201.m82(22444);
        createMap2.putDouble(r4, (double) q.a((float) this.f));
        String r5 = C0201.m82(22445);
        createMap2.putDouble(r5, (double) q.a((float) this.g));
        WritableMap createMap3 = Arguments.createMap();
        double a = (double) q.a((float) this.j);
        String r3 = C0201.m82(22446);
        createMap3.putDouble(r3, a);
        String r8 = C0201.m82(22447);
        createMap3.putDouble(r8, (double) q.a((float) this.k));
        WritableMap createMap4 = Arguments.createMap();
        createMap4.putDouble(r3, (double) q.a((float) this.l));
        createMap4.putDouble(r8, (double) q.a((float) this.m));
        WritableMap createMap5 = Arguments.createMap();
        createMap5.putDouble(r4, this.h);
        createMap5.putDouble(r5, this.i);
        WritableMap createMap6 = Arguments.createMap();
        createMap6.putMap(C0201.m82(22448), createMap);
        createMap6.putMap(C0201.m82(22449), createMap2);
        createMap6.putMap(C0201.m82(22450), createMap3);
        createMap6.putMap(C0201.m82(22451), createMap4);
        createMap6.putMap(C0201.m82(22452), createMap5);
        createMap6.putInt(C0201.m82(22453), i());
        createMap6.putBoolean(C0201.m82(22454), true);
        return createMap6;
    }

    @Override // com.facebook.react.uimanager.events.c
    public boolean a() {
        return this.n == i.SCROLL;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void c(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(i(), f(), o());
    }

    @Override // com.facebook.react.uimanager.events.c
    public short e() {
        return 0;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String f() {
        i iVar = this.n;
        yh0.c(iVar);
        return i.b(iVar);
    }

    @Override // com.facebook.react.uimanager.events.c
    public void l() {
        o.a(this);
    }
}
