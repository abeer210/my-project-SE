package com.google.android.gms.maps;

import android.graphics.Bitmap;
import android.location.Location;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.a0;
import com.google.android.gms.maps.model.b0;
import com.google.android.gms.maps.model.t;
import com.google.android.gms.maps.model.u;
import com.google.android.gms.maps.model.v;
import com.google.android.gms.maps.model.x;

public final class c {
    private final tp1 a;
    private i b;

    public interface a {
        void onCancel();

        void onFinish();
    }

    public interface b {
        View a(com.google.android.gms.maps.model.o oVar);

        View d(com.google.android.gms.maps.model.o oVar);
    }

    /* renamed from: com.google.android.gms.maps.c$c  reason: collision with other inner class name */
    public interface AbstractC0062c {
        void onCameraIdle();
    }

    public interface d {
        void onCameraMove();
    }

    public interface e {
        void onCameraMoveStarted(int i);
    }

    public interface f {
        void a(com.google.android.gms.maps.model.j jVar);
    }

    public interface g {
        void h(com.google.android.gms.maps.model.l lVar);

        void onIndoorBuildingFocused();
    }

    public interface h {
        void a(com.google.android.gms.maps.model.o oVar);
    }

    public interface i {
        void j(LatLng latLng);
    }

    public interface j {
        void onMapLoaded();
    }

    public interface k {
        void h(LatLng latLng);
    }

    public interface l {
        boolean a(com.google.android.gms.maps.model.o oVar);
    }

    public interface m {
        void b(com.google.android.gms.maps.model.o oVar);

        void c(com.google.android.gms.maps.model.o oVar);

        void f(com.google.android.gms.maps.model.o oVar);
    }

    @Deprecated
    public interface n {
        void a(Location location);
    }

    public interface o {
        void e(com.google.android.gms.maps.model.r rVar);
    }

    public interface p {
        void a(com.google.android.gms.maps.model.s sVar);
    }

    public interface q {
        void a(u uVar);
    }

    public interface r {
        void onSnapshotReady(Bitmap bitmap);
    }

    /* access modifiers changed from: private */
    public static final class s extends gr1 {
        private final a a;

        public s(a aVar) {
            this.a = aVar;
        }

        @Override // defpackage.fr1
        public final void onCancel() {
            this.a.onCancel();
        }

        @Override // defpackage.fr1
        public final void onFinish() {
            this.a.onFinish();
        }
    }

    public c(tp1 tp1) {
        com.google.android.gms.common.internal.u.k(tp1);
        this.a = tp1;
    }

    public final void A(f fVar) {
        if (fVar == null) {
            try {
                this.a.h1(null);
            } catch (RemoteException e2) {
                throw new x(e2);
            }
        } else {
            this.a.h1(new u(this, fVar));
        }
    }

    public final void B(g gVar) {
        if (gVar == null) {
            try {
                this.a.M2(null);
            } catch (RemoteException e2) {
                throw new x(e2);
            }
        } else {
            this.a.M2(new j(this, gVar));
        }
    }

    public final void C(h hVar) {
        if (hVar == null) {
            try {
                this.a.e1(null);
            } catch (RemoteException e2) {
                throw new x(e2);
            }
        } else {
            this.a.e1(new o(this, hVar));
        }
    }

    public final void D(i iVar) {
        if (iVar == null) {
            try {
                this.a.Y(null);
            } catch (RemoteException e2) {
                throw new x(e2);
            }
        } else {
            this.a.Y(new c0(this, iVar));
        }
    }

    public final void E(j jVar) {
        if (jVar == null) {
            try {
                this.a.o0(null);
            } catch (RemoteException e2) {
                throw new x(e2);
            }
        } else {
            this.a.o0(new r(this, jVar));
        }
    }

    public final void F(k kVar) {
        if (kVar == null) {
            try {
                this.a.w3(null);
            } catch (RemoteException e2) {
                throw new x(e2);
            }
        } else {
            this.a.w3(new d0(this, kVar));
        }
    }

    public final void G(l lVar) {
        if (lVar == null) {
            try {
                this.a.t3(null);
            } catch (RemoteException e2) {
                throw new x(e2);
            }
        } else {
            this.a.t3(new m(this, lVar));
        }
    }

    public final void H(m mVar) {
        if (mVar == null) {
            try {
                this.a.M3(null);
            } catch (RemoteException e2) {
                throw new x(e2);
            }
        } else {
            this.a.M3(new n(this, mVar));
        }
    }

    @Deprecated
    public final void I(n nVar) {
        if (nVar == null) {
            try {
                this.a.P3(null);
            } catch (RemoteException e2) {
                throw new x(e2);
            }
        } else {
            this.a.P3(new q(this, nVar));
        }
    }

    public final void J(o oVar) {
        if (oVar == null) {
            try {
                this.a.P2(null);
            } catch (RemoteException e2) {
                throw new x(e2);
            }
        } else {
            this.a.P2(new y(this, oVar));
        }
    }

    public final void K(p pVar) {
        if (pVar == null) {
            try {
                this.a.O3(null);
            } catch (RemoteException e2) {
                throw new x(e2);
            }
        } else {
            this.a.O3(new v(this, pVar));
        }
    }

    public final void L(q qVar) {
        if (qVar == null) {
            try {
                this.a.j0(null);
            } catch (RemoteException e2) {
                throw new x(e2);
            }
        } else {
            this.a.j0(new w(this, qVar));
        }
    }

    public final void M(int i2, int i3, int i4, int i5) {
        try {
            this.a.v0(i2, i3, i4, i5);
        } catch (RemoteException e2) {
            throw new x(e2);
        }
    }

    public final void N(boolean z) {
        try {
            this.a.A1(z);
        } catch (RemoteException e2) {
            throw new x(e2);
        }
    }

    public final void O(r rVar) {
        P(rVar, null);
    }

    public final void P(r rVar, Bitmap bitmap) {
        try {
            this.a.d1(new x(this, rVar), (ar0) (bitmap != null ? ar0.W3(bitmap) : null));
        } catch (RemoteException e2) {
            throw new x(e2);
        }
    }

    public final com.google.android.gms.maps.model.e a(com.google.android.gms.maps.model.f fVar) {
        try {
            return new com.google.android.gms.maps.model.e(this.a.g0(fVar));
        } catch (RemoteException e2) {
            throw new x(e2);
        }
    }

    public final com.google.android.gms.maps.model.j b(com.google.android.gms.maps.model.k kVar) {
        try {
            q31 m1 = this.a.m1(kVar);
            if (m1 != null) {
                return new com.google.android.gms.maps.model.j(m1);
            }
            return null;
        } catch (RemoteException e2) {
            throw new x(e2);
        }
    }

    public final com.google.android.gms.maps.model.o c(com.google.android.gms.maps.model.p pVar) {
        try {
            z31 H3 = this.a.H3(pVar);
            if (H3 != null) {
                return new com.google.android.gms.maps.model.o(H3);
            }
            return null;
        } catch (RemoteException e2) {
            throw new x(e2);
        }
    }

    public final com.google.android.gms.maps.model.s d(t tVar) {
        try {
            return new com.google.android.gms.maps.model.s(this.a.V1(tVar));
        } catch (RemoteException e2) {
            throw new x(e2);
        }
    }

    public final u e(v vVar) {
        try {
            return new u(this.a.g3(vVar));
        } catch (RemoteException e2) {
            throw new x(e2);
        }
    }

    public final a0 f(b0 b0Var) {
        try {
            c31 A3 = this.a.A3(b0Var);
            if (A3 != null) {
                return new a0(A3);
            }
            return null;
        } catch (RemoteException e2) {
            throw new x(e2);
        }
    }

    public final void g(a aVar) {
        try {
            this.a.U2(aVar.a());
        } catch (RemoteException e2) {
            throw new x(e2);
        }
    }

    public final void h(a aVar, int i2, a aVar2) {
        s sVar;
        try {
            tp1 tp1 = this.a;
            yq0 a2 = aVar.a();
            if (aVar2 == null) {
                sVar = null;
            } else {
                sVar = new s(aVar2);
            }
            tp1.u1(a2, i2, sVar);
        } catch (RemoteException e2) {
            throw new x(e2);
        }
    }

    public final CameraPosition i() {
        try {
            return this.a.I0();
        } catch (RemoteException e2) {
            throw new x(e2);
        }
    }

    public final com.google.android.gms.maps.model.l j() {
        try {
            t31 B3 = this.a.B3();
            if (B3 != null) {
                return new com.google.android.gms.maps.model.l(B3);
            }
            return null;
        } catch (RemoteException e2) {
            throw new x(e2);
        }
    }

    public final h k() {
        try {
            return new h(this.a.F2());
        } catch (RemoteException e2) {
            throw new x(e2);
        }
    }

    public final i l() {
        try {
            if (this.b == null) {
                this.b = new i(this.a.i2());
            }
            return this.b;
        } catch (RemoteException e2) {
            throw new x(e2);
        }
    }

    public final void m(a aVar) {
        try {
            this.a.H0(aVar.a());
        } catch (RemoteException e2) {
            throw new x(e2);
        }
    }

    public final void n(boolean z) {
        try {
            this.a.q(z);
        } catch (RemoteException e2) {
            throw new x(e2);
        }
    }

    public final boolean o(boolean z) {
        try {
            return this.a.T(z);
        } catch (RemoteException e2) {
            throw new x(e2);
        }
    }

    public final void p(b bVar) {
        if (bVar == null) {
            try {
                this.a.m3(null);
            } catch (RemoteException e2) {
                throw new x(e2);
            }
        } else {
            this.a.m3(new p(this, bVar));
        }
    }

    public final void q(LatLngBounds latLngBounds) {
        try {
            this.a.Z(latLngBounds);
        } catch (RemoteException e2) {
            throw new x(e2);
        }
    }

    public final void r(d dVar) {
        if (dVar == null) {
            try {
                this.a.z0(null);
            } catch (RemoteException e2) {
                throw new x(e2);
            }
        } else {
            this.a.z0(new s(this, dVar));
        }
    }

    public final boolean s(com.google.android.gms.maps.model.n nVar) {
        try {
            return this.a.M0(nVar);
        } catch (RemoteException e2) {
            throw new x(e2);
        }
    }

    public final void t(int i2) {
        try {
            this.a.L1(i2);
        } catch (RemoteException e2) {
            throw new x(e2);
        }
    }

    public final void u(float f2) {
        try {
            this.a.t1(f2);
        } catch (RemoteException e2) {
            throw new x(e2);
        }
    }

    public final void v(float f2) {
        try {
            this.a.D1(f2);
        } catch (RemoteException e2) {
            throw new x(e2);
        }
    }

    public final void w(boolean z) {
        try {
            this.a.l3(z);
        } catch (RemoteException e2) {
            throw new x(e2);
        }
    }

    public final void x(AbstractC0062c cVar) {
        if (cVar == null) {
            try {
                this.a.W1(null);
            } catch (RemoteException e2) {
                throw new x(e2);
            }
        } else {
            this.a.W1(new b0(this, cVar));
        }
    }

    public final void y(d dVar) {
        if (dVar == null) {
            try {
                this.a.D2(null);
            } catch (RemoteException e2) {
                throw new x(e2);
            }
        } else {
            this.a.D2(new a0(this, dVar));
        }
    }

    public final void z(e eVar) {
        if (eVar == null) {
            try {
                this.a.N(null);
            } catch (RemoteException e2) {
                throw new x(e2);
            }
        } else {
            this.a.N(new z(this, eVar));
        }
    }
}
