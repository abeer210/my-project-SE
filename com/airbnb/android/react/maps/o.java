package com.airbnb.android.react.maps;

import android.content.Context;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.g;
import com.google.android.gms.location.i;
import com.google.android.gms.maps.d;

/* compiled from: FusedLocationSource */
public class o implements d {
    private final com.google.android.gms.location.a a;
    private final LocationRequest b;
    private g c;

    /* compiled from: FusedLocationSource */
    class a implements ws1<Location> {
        public final /* synthetic */ d.a a;

        public a(o oVar, d.a aVar) {
            this.a = aVar;
        }

        /* renamed from: a */
        public void onSuccess(Location location) {
            if (location != null) {
                this.a.onLocationChanged(location);
            }
        }
    }

    /* compiled from: FusedLocationSource */
    class b extends g {
        public final /* synthetic */ d.a a;

        public b(o oVar, d.a aVar) {
            this.a = aVar;
        }

        @Override // com.google.android.gms.location.g
        public void b(LocationResult locationResult) {
            for (Location location : locationResult.p()) {
                this.a.onLocationChanged(location);
            }
        }
    }

    public o(Context context) {
        this.a = i.a(context);
        LocationRequest o = LocationRequest.o();
        this.b = o;
        o.u(100);
        this.b.s(5000);
    }

    @Override // com.google.android.gms.maps.d
    public void a(d.a aVar) {
        this.a.t().f(new a(this, aVar));
        b bVar = new b(this, aVar);
        this.c = bVar;
        this.a.v(this.b, bVar, Looper.myLooper());
    }

    public void b(int i) {
        this.b.r((long) i);
    }

    public void c(int i) {
        this.b.s((long) i);
    }

    public void d(int i) {
        this.b.u(i);
    }

    @Override // com.google.android.gms.maps.d
    public void deactivate() {
        this.a.u(this.c);
    }
}
