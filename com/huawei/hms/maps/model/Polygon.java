package com.huawei.hms.maps.model;

import android.os.RemoteException;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.maps.mcf;
import com.huawei.hms.maps.mco;
import java.util.List;
import vigqyno.C0201;

public final class Polygon {
    private mcf a;

    public Polygon(mcf mcf) {
        mco.a(C0201.m82(31617), C0201.m82(31618));
        this.a = mcf;
    }

    public final boolean equals(Object obj) {
        try {
            if (obj instanceof Polygon) {
                return this.a.a(((Polygon) obj).a);
            }
            return false;
        } catch (RemoteException e) {
            mco.a(C0201.m82(31620), C0201.m82(31619) + e.toString());
            return false;
        }
    }

    public final int getFillColor() {
        try {
            return this.a.h();
        } catch (RemoteException e) {
            mco.a(C0201.m82(31622), C0201.m82(31621) + e.toString());
            return 0;
        }
    }

    public final List<List<LatLng>> getHoles() {
        try {
            return this.a.i();
        } catch (RemoteException e) {
            mco.d(C0201.m82(31624), C0201.m82(31623) + e.toString());
            return null;
        }
    }

    public final String getId() {
        try {
            return this.a.a();
        } catch (RemoteException e) {
            mco.a(C0201.m82(31626), C0201.m82(31625) + e.toString());
            return null;
        }
    }

    public final List<LatLng> getPoints() {
        try {
            return this.a.j();
        } catch (RemoteException e) {
            mco.a(C0201.m82(31628), C0201.m82(31627) + e.toString());
            return null;
        }
    }

    public final int getStrokeColor() {
        try {
            return this.a.k();
        } catch (RemoteException e) {
            mco.a(C0201.m82(31630), C0201.m82(31629) + e.toString());
            return 0;
        }
    }

    public final int getStrokeJointType() {
        try {
            return this.a.l();
        } catch (RemoteException e) {
            mco.a(C0201.m82(31632), C0201.m82(31631) + e.toString());
            return 0;
        }
    }

    public final List<PatternItem> getStrokePattern() {
        try {
            return this.a.m();
        } catch (RemoteException e) {
            mco.d(C0201.m82(31634), C0201.m82(31633) + e.toString());
            return null;
        }
    }

    public final float getStrokeWidth() {
        try {
            return this.a.n();
        } catch (RemoteException e) {
            mco.a(C0201.m82(31636), C0201.m82(31635) + e.toString());
            return -1.0f;
        }
    }

    public final Object getTag() {
        try {
            return ObjectWrapper.unwrap(this.a.b());
        } catch (RemoteException e) {
            mco.a(C0201.m82(31638), C0201.m82(31637) + e.toString());
            return null;
        }
    }

    public final float getZIndex() {
        try {
            return this.a.c();
        } catch (RemoteException e) {
            mco.d(C0201.m82(31640), C0201.m82(31639) + e.toString());
            return -1.0f;
        }
    }

    public final int hashCode() {
        try {
            return this.a.d();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean isClickable() {
        try {
            return this.a.e();
        } catch (RemoteException e) {
            mco.a(C0201.m82(31642), C0201.m82(31641) + e.toString());
            return true;
        }
    }

    public final boolean isGeodesic() {
        try {
            return this.a.o();
        } catch (RemoteException e) {
            mco.d(C0201.m82(31644), C0201.m82(31643) + e.toString());
            return true;
        }
    }

    public final boolean isVisible() {
        try {
            return this.a.f();
        } catch (RemoteException e) {
            mco.d(C0201.m82(31646), C0201.m82(31645) + e.toString());
            return true;
        }
    }

    public final void remove() {
        try {
            this.a.g();
        } catch (RemoteException e) {
            mco.a(C0201.m82(31648), C0201.m82(31647) + e.toString());
        }
    }

    public final void setClickable(boolean z) {
        try {
            this.a.a(z);
        } catch (RemoteException e) {
            mco.a(C0201.m82(31650), C0201.m82(31649) + e.toString());
        }
    }

    public final void setFillColor(int i) {
        try {
            this.a.a(i);
        } catch (RemoteException e) {
            mco.a(C0201.m82(31652), C0201.m82(31651) + e.toString());
        }
    }

    public final void setGeodesic(boolean z) {
        try {
            this.a.c(z);
        } catch (RemoteException e) {
            mco.d(C0201.m82(31654), C0201.m82(31653) + e.toString());
        }
    }

    public final void setHoles(List<? extends List<LatLng>> list) {
        try {
            this.a.a(list);
        } catch (RemoteException e) {
            mco.d(C0201.m82(31656), C0201.m82(31655) + e.toString());
        }
    }

    public final void setPoints(List<LatLng> list) {
        try {
            this.a.b(list);
        } catch (RemoteException e) {
            mco.a(C0201.m82(31658), C0201.m82(31657) + e.toString());
        }
    }

    public final void setStrokeColor(int i) {
        try {
            this.a.b(i);
        } catch (RemoteException e) {
            mco.a(C0201.m82(31660), C0201.m82(31659) + e.toString());
        }
    }

    public final void setStrokeJointType(int i) {
        try {
            this.a.c(i);
        } catch (RemoteException e) {
            mco.d(C0201.m82(31662), C0201.m82(31661) + e.toString());
        }
    }

    public final void setStrokePattern(List<PatternItem> list) {
        try {
            this.a.c(list);
        } catch (RemoteException e) {
            mco.d(C0201.m82(31664), C0201.m82(31663) + e.toString());
        }
    }

    public final void setStrokeWidth(float f) {
        try {
            this.a.b(f);
        } catch (RemoteException e) {
            mco.a(C0201.m82(31666), C0201.m82(31665) + e.toString());
        }
    }

    public final void setTag(Object obj) {
        try {
            this.a.a(ObjectWrapper.wrap(obj));
        } catch (RemoteException e) {
            mco.a(C0201.m82(31668), C0201.m82(31667) + e.toString());
        }
    }

    public final void setVisible(boolean z) {
        try {
            this.a.b(z);
        } catch (RemoteException e) {
            mco.d(C0201.m82(31670), C0201.m82(31669) + e.toString());
        }
    }

    public final void setZIndex(float f) {
        try {
            this.a.a(f);
        } catch (RemoteException e) {
            mco.d(C0201.m82(31672), C0201.m82(31671) + e.toString());
        }
    }
}
