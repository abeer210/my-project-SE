package com.google.android.gms.maps;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.maps.model.x;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

public class e extends FrameLayout {
    private final b a;

    /* access modifiers changed from: package-private */
    public static class a implements zq0 {
        private final ViewGroup a;
        private final vp1 b;
        private View c;

        public a(ViewGroup viewGroup, vp1 vp1) {
            u.k(vp1);
            this.b = vp1;
            u.k(viewGroup);
            this.a = viewGroup;
        }

        public final void a(g gVar) {
            try {
                this.b.Z2(new l(this, gVar));
            } catch (RemoteException e) {
                throw new x(e);
            }
        }

        @Override // defpackage.zq0
        public final void onCreate(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                dr1.b(bundle, bundle2);
                this.b.onCreate(bundle2);
                dr1.b(bundle2, bundle);
                this.c = (View) ar0.V3(this.b.L2());
                this.a.removeAllViews();
                this.a.addView(this.c);
            } catch (RemoteException e) {
                throw new x(e);
            }
        }

        @Override // defpackage.zq0
        public final void onDestroy() {
            try {
                this.b.onDestroy();
            } catch (RemoteException e) {
                throw new x(e);
            }
        }

        @Override // defpackage.zq0
        public final void onPause() {
            try {
                this.b.onPause();
            } catch (RemoteException e) {
                throw new x(e);
            }
        }

        @Override // defpackage.zq0
        public final void onResume() {
            try {
                this.b.onResume();
            } catch (RemoteException e) {
                throw new x(e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class b extends xq0<a> {
        private final ViewGroup e;
        private final Context f;
        private br0<a> g;
        private final GoogleMapOptions h;
        private final List<g> i = new ArrayList();

        public b(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
            this.e = viewGroup;
            this.f = context;
            this.h = googleMapOptions;
        }

        @Override // defpackage.xq0
        public final void a(br0<a> br0) {
            this.g = br0;
            if (br0 != null && b() == null) {
                try {
                    f.a(this.f);
                    vp1 K0 = er1.a(this.f).K0(ar0.W3(this.f), this.h);
                    if (K0 != null) {
                        this.g.a(new a(this.e, K0));
                        for (g gVar : this.i) {
                            ((a) b()).a(gVar);
                        }
                        this.i.clear();
                    }
                } catch (RemoteException e2) {
                    throw new x(e2);
                } catch (ap0 unused) {
                }
            }
        }

        public final void n(g gVar) {
            if (b() != null) {
                ((a) b()).a(gVar);
            } else {
                this.i.add(gVar);
            }
        }
    }

    public e(Context context, GoogleMapOptions googleMapOptions) {
        super(context);
        this.a = new b(this, context, googleMapOptions);
        setClickable(true);
    }

    public void i(g gVar) {
        u.f(C0201.m82(20227));
        this.a.n(gVar);
    }

    public final void j(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            this.a.c(bundle);
            if (this.a.b() == null) {
                xq0.g(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final void k() {
        this.a.d();
    }

    public final void l() {
        this.a.e();
    }

    public final void m() {
        this.a.f();
    }
}
