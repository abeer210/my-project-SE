package com.airbnb.android.react.maps;

import android.content.Context;
import com.google.android.gms.maps.c;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.e;
import com.google.android.gms.maps.model.f;

/* compiled from: AirMapCircle */
public class b extends c {
    private f a;
    private e b;
    private LatLng c;
    private double d;
    private int e;
    private int f;
    private float g;
    private float h;

    public b(Context context) {
        super(context);
    }

    private f h() {
        f fVar = new f();
        fVar.o(this.c);
        fVar.F(this.d);
        fVar.p(this.f);
        fVar.G(this.e);
        fVar.H(this.g);
        fVar.P(this.h);
        return fVar;
    }

    @Override // com.airbnb.android.react.maps.c
    public void e(c cVar) {
        this.b.a();
    }

    public void f(c cVar) {
        this.b = cVar.a(getCircleOptions());
    }

    public f getCircleOptions() {
        if (this.a == null) {
            this.a = h();
        }
        return this.a;
    }

    @Override // com.airbnb.android.react.maps.c
    public Object getFeature() {
        return this.b;
    }

    public void setCenter(LatLng latLng) {
        this.c = latLng;
        e eVar = this.b;
        if (eVar != null) {
            eVar.b(latLng);
        }
    }

    public void setFillColor(int i) {
        this.f = i;
        e eVar = this.b;
        if (eVar != null) {
            eVar.c(i);
        }
    }

    public void setRadius(double d2) {
        this.d = d2;
        e eVar = this.b;
        if (eVar != null) {
            eVar.d(d2);
        }
    }

    public void setStrokeColor(int i) {
        this.e = i;
        e eVar = this.b;
        if (eVar != null) {
            eVar.e(i);
        }
    }

    public void setStrokeWidth(float f2) {
        this.g = f2;
        e eVar = this.b;
        if (eVar != null) {
            eVar.f(f2);
        }
    }

    public void setZIndex(float f2) {
        this.h = f2;
        e eVar = this.b;
        if (eVar != null) {
            eVar.g(f2);
        }
    }
}
