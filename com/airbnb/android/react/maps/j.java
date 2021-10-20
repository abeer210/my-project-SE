package com.airbnb.android.react.maps;

import android.content.Context;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.maps.c;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.d;
import com.google.android.gms.maps.model.g;
import com.google.android.gms.maps.model.h;
import com.google.android.gms.maps.model.i;
import com.google.android.gms.maps.model.q;
import com.google.android.gms.maps.model.u;
import com.google.android.gms.maps.model.v;
import com.google.android.gms.maps.model.w;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

/* compiled from: AirMapPolyline */
public class j extends c {
    private v a;
    private u b;
    private List<LatLng> c;
    private int d;
    private float e;
    private boolean f;
    private boolean g;
    private float h;
    private d i = new w();
    private ReadableArray j;
    private List<q> k;

    public j(Context context) {
        super(context);
    }

    private void h() {
        q qVar;
        if (this.j != null) {
            this.k = new ArrayList(this.j.size());
            for (int i2 = 0; i2 < this.j.size(); i2++) {
                float f2 = (float) this.j.getDouble(i2);
                if (i2 % 2 != 0) {
                    this.k.add(new i(f2));
                } else {
                    if (this.i instanceof w) {
                        qVar = new h();
                    } else {
                        qVar = new g(f2);
                    }
                    this.k.add(qVar);
                }
            }
            u uVar = this.b;
            if (uVar != null) {
                uVar.g(this.k);
            }
        }
    }

    private v i() {
        v vVar = new v();
        vVar.o(this.c);
        vVar.p(this.d);
        vVar.T(this.e);
        vVar.s(this.g);
        vVar.V(this.h);
        vVar.R(this.i);
        vVar.r(this.i);
        vVar.Q(this.k);
        return vVar;
    }

    @Override // com.airbnb.android.react.maps.c
    public void e(c cVar) {
        this.b.b();
    }

    public void f(c cVar) {
        u e2 = cVar.e(getPolylineOptions());
        this.b = e2;
        e2.c(this.f);
    }

    @Override // com.airbnb.android.react.maps.c
    public Object getFeature() {
        return this.b;
    }

    public v getPolylineOptions() {
        if (this.a == null) {
            this.a = i();
        }
        return this.a;
    }

    public void setColor(int i2) {
        this.d = i2;
        u uVar = this.b;
        if (uVar != null) {
            uVar.d(i2);
        }
    }

    public void setCoordinates(ReadableArray readableArray) {
        this.c = new ArrayList(readableArray.size());
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            ReadableMap map = readableArray.getMap(i2);
            this.c.add(i2, new LatLng(map.getDouble(C0201.m82(37269)), map.getDouble(C0201.m82(37270))));
        }
        u uVar = this.b;
        if (uVar != null) {
            uVar.h(this.c);
        }
    }

    public void setGeodesic(boolean z) {
        this.g = z;
        u uVar = this.b;
        if (uVar != null) {
            uVar.f(z);
        }
    }

    public void setLineCap(d dVar) {
        this.i = dVar;
        u uVar = this.b;
        if (uVar != null) {
            uVar.i(dVar);
            this.b.e(dVar);
        }
        h();
    }

    public void setLineDashPattern(ReadableArray readableArray) {
        this.j = readableArray;
        h();
    }

    public void setTappable(boolean z) {
        this.f = z;
        u uVar = this.b;
        if (uVar != null) {
            uVar.c(z);
        }
    }

    public void setWidth(float f2) {
        this.e = f2;
        u uVar = this.b;
        if (uVar != null) {
            uVar.k(f2);
        }
    }

    public void setZIndex(float f2) {
        this.h = f2;
        u uVar = this.b;
        if (uVar != null) {
            uVar.l(f2);
        }
    }
}
