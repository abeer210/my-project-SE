package com.airbnb.android.react.maps;

import android.content.Context;
import android.graphics.Bitmap;
import com.facebook.react.bridge.ReadableArray;
import com.google.android.gms.maps.c;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.a;
import com.google.android.gms.maps.model.b;
import com.google.android.gms.maps.model.j;
import com.google.android.gms.maps.model.k;

/* compiled from: AirMapOverlay */
public class h extends c implements p {
    private k a;
    private j b;
    private LatLngBounds c;
    private a d;
    private Bitmap e;
    private boolean f;
    private float g;
    private float h;
    private final q i;
    private c j;

    public h(Context context) {
        super(context);
        this.i = new q(context, getResources(), this);
    }

    private j getGroundOverlay() {
        k groundOverlayOptions;
        j jVar = this.b;
        if (jVar != null) {
            return jVar;
        }
        if (this.j == null || (groundOverlayOptions = getGroundOverlayOptions()) == null) {
            return null;
        }
        return this.j.b(groundOverlayOptions);
    }

    private k h() {
        k kVar = this.a;
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k();
        a aVar = this.d;
        if (aVar != null) {
            kVar2.E(aVar);
        } else {
            kVar2.E(b.a());
            kVar2.P(false);
        }
        kVar2.H(this.c);
        kVar2.Q(this.g);
        return kVar2;
    }

    @Override // com.airbnb.android.react.maps.p
    public void a() {
        j groundOverlay = getGroundOverlay();
        this.b = groundOverlay;
        if (groundOverlay != null) {
            groundOverlay.g(true);
            this.b.d(this.d);
            this.b.f(this.h);
            this.b.c(this.f);
        }
    }

    @Override // com.airbnb.android.react.maps.c
    public void e(c cVar) {
        this.j = null;
        j jVar = this.b;
        if (jVar != null) {
            jVar.b();
            this.b = null;
            this.a = null;
        }
    }

    public void f(c cVar) {
        k groundOverlayOptions = getGroundOverlayOptions();
        if (groundOverlayOptions != null) {
            j b2 = cVar.b(groundOverlayOptions);
            this.b = b2;
            b2.c(this.f);
            return;
        }
        this.j = cVar;
    }

    @Override // com.airbnb.android.react.maps.c
    public Object getFeature() {
        return this.b;
    }

    public k getGroundOverlayOptions() {
        if (this.a == null) {
            this.a = h();
        }
        return this.a;
    }

    public void setBounds(ReadableArray readableArray) {
        LatLngBounds latLngBounds = new LatLngBounds(new LatLng(readableArray.getArray(0).getDouble(0), readableArray.getArray(0).getDouble(1)), new LatLng(readableArray.getArray(1).getDouble(0), readableArray.getArray(1).getDouble(1)));
        this.c = latLngBounds;
        j jVar = this.b;
        if (jVar != null) {
            jVar.e(latLngBounds);
        }
    }

    @Override // com.airbnb.android.react.maps.p
    public void setIconBitmap(Bitmap bitmap) {
        this.e = bitmap;
    }

    @Override // com.airbnb.android.react.maps.p
    public void setIconBitmapDescriptor(a aVar) {
        this.d = aVar;
    }

    public void setImage(String str) {
        this.i.f(str);
    }

    public void setTappable(boolean z) {
        this.f = z;
        j jVar = this.b;
        if (jVar != null) {
            jVar.c(z);
        }
    }

    public void setTransparency(float f2) {
        this.h = f2;
        j jVar = this.b;
        if (jVar != null) {
            jVar.f(f2);
        }
    }

    public void setZIndex(float f2) {
        this.g = f2;
        j jVar = this.b;
        if (jVar != null) {
            jVar.h(f2);
        }
    }
}
