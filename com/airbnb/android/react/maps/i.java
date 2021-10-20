package com.airbnb.android.react.maps;

import android.content.Context;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.maps.c;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.s;
import com.google.android.gms.maps.model.t;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

/* compiled from: AirMapPolygon */
public class i extends c {
    private t a;
    private s b;
    private List<LatLng> c;
    private List<List<LatLng>> d;
    private int e;
    private int f;
    private float g;
    private boolean h;
    private boolean i;
    private float j;

    public i(Context context) {
        super(context);
    }

    private t h() {
        t tVar = new t();
        tVar.o(this.c);
        tVar.r(this.f);
        tVar.P(this.e);
        tVar.Q(this.g);
        tVar.s(this.h);
        tVar.R(this.j);
        if (this.d != null) {
            for (int i2 = 0; i2 < this.d.size(); i2++) {
                tVar.p(this.d.get(i2));
            }
        }
        return tVar;
    }

    @Override // com.airbnb.android.react.maps.c
    public void e(c cVar) {
        this.b.b();
    }

    public void f(c cVar) {
        s d2 = cVar.d(getPolygonOptions());
        this.b = d2;
        d2.c(this.i);
    }

    @Override // com.airbnb.android.react.maps.c
    public Object getFeature() {
        return this.b;
    }

    public t getPolygonOptions() {
        if (this.a == null) {
            this.a = h();
        }
        return this.a;
    }

    public void setCoordinates(ReadableArray readableArray) {
        this.c = new ArrayList(readableArray.size());
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            ReadableMap map = readableArray.getMap(i2);
            this.c.add(i2, new LatLng(map.getDouble(C0201.m82(37332)), map.getDouble(C0201.m82(37333))));
        }
        s sVar = this.b;
        if (sVar != null) {
            sVar.g(this.c);
        }
    }

    public void setFillColor(int i2) {
        this.f = i2;
        s sVar = this.b;
        if (sVar != null) {
            sVar.d(i2);
        }
    }

    public void setGeodesic(boolean z) {
        this.h = z;
        s sVar = this.b;
        if (sVar != null) {
            sVar.e(z);
        }
    }

    public void setHoles(ReadableArray readableArray) {
        if (readableArray != null) {
            this.d = new ArrayList(readableArray.size());
            for (int i2 = 0; i2 < readableArray.size(); i2++) {
                ReadableArray array = readableArray.getArray(i2);
                if (array.size() >= 3) {
                    ArrayList arrayList = new ArrayList();
                    for (int i3 = 0; i3 < array.size(); i3++) {
                        ReadableMap map = array.getMap(i3);
                        arrayList.add(new LatLng(map.getDouble(C0201.m82(37334)), map.getDouble(C0201.m82(37335))));
                    }
                    if (arrayList.size() == 3) {
                        arrayList.add(arrayList.get(0));
                    }
                    this.d.add(arrayList);
                }
            }
            s sVar = this.b;
            if (sVar != null) {
                sVar.f(this.d);
            }
        }
    }

    public void setStrokeColor(int i2) {
        this.e = i2;
        s sVar = this.b;
        if (sVar != null) {
            sVar.h(i2);
        }
    }

    public void setStrokeWidth(float f2) {
        this.g = f2;
        s sVar = this.b;
        if (sVar != null) {
            sVar.i(f2);
        }
    }

    public void setTappable(boolean z) {
        this.i = z;
        s sVar = this.b;
        if (sVar != null) {
            sVar.c(z);
        }
    }

    public void setZIndex(float f2) {
        this.j = f2;
        s sVar = this.b;
        if (sVar != null) {
            sVar.k(f2);
        }
    }
}
