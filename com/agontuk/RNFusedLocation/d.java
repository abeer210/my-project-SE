package com.agontuk.RNFusedLocation;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.g;
import vigqyno.C0201;

/* compiled from: SingleLocationUpdate */
public class d {
    private final com.google.android.gms.location.a a;
    private final LocationRequest b;
    private final long c;
    private final Callback d;
    private final Callback e;
    private final Handler f = new Handler(Looper.getMainLooper());
    private final Runnable g = new a();
    private final g h = new b();

    /* compiled from: SingleLocationUpdate */
    class a implements Runnable {
        public a() {
        }

        public void run() {
            synchronized (d.this) {
                d.this.h(a.TIMEOUT.b(), C0201.m82(27439));
                if (!(d.this.a == null || d.this.h == null)) {
                    d.this.a.u(d.this.h);
                }
                Log.i(C0201.m82(27440), C0201.m82(27441));
            }
        }
    }

    /* compiled from: SingleLocationUpdate */
    class b extends g {
        public b() {
        }

        @Override // com.google.android.gms.location.g
        public void b(LocationResult locationResult) {
            synchronized (d.this) {
                d.this.i(b.e(locationResult.o()));
                d.this.f.removeCallbacks(d.this.g);
                if (!(d.this.a == null || d.this.h == null)) {
                    d.this.a.u(d.this.h);
                }
            }
        }
    }

    public d(com.google.android.gms.location.a aVar, LocationRequest locationRequest, long j, Callback callback, Callback callback2) {
        this.a = aVar;
        this.b = locationRequest;
        this.c = j;
        this.d = callback;
        this.e = callback2;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void h(int i, String str) {
        try {
            if (this.e != null) {
                this.e.invoke(b.a(i, str));
            }
        } catch (RuntimeException e2) {
            Log.w(C0201.m82(7749), e2.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void i(WritableMap writableMap) {
        try {
            if (this.d != null) {
                this.d.invoke(writableMap);
            }
        } catch (RuntimeException e2) {
            Log.w(C0201.m82(7750), e2.getMessage());
        }
    }

    public void g() {
        com.google.android.gms.location.a aVar = this.a;
        if (aVar != null) {
            aVar.v(this.b, this.h, Looper.getMainLooper());
            this.f.postDelayed(this.g, this.c);
        }
    }
}
