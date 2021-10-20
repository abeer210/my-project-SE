package com.huawei.hms.maps.model;

import android.os.RemoteException;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.maps.mcg;
import com.huawei.hms.maps.mco;
import java.util.List;
import vigqyno.C0201;

public final class Polyline {
    private mcg a;

    public Polyline(mcg mcg) {
        this.a = mcg;
    }

    public final boolean equals(Object obj) {
        try {
            if (obj instanceof Polyline) {
                return this.a.a(((Polyline) obj).a);
            }
            return false;
        } catch (RemoteException e) {
            mco.a(C0201.m82(11168), C0201.m82(11167) + e.toString());
            return false;
        }
    }

    public final int getColor() {
        try {
            return this.a.h();
        } catch (RemoteException e) {
            mco.a(C0201.m82(11170), C0201.m82(11169) + e.toString());
            return 0;
        }
    }

    public final Cap getEndCap() {
        try {
            return this.a.i();
        } catch (RemoteException e) {
            mco.d(C0201.m82(11172), C0201.m82(11171) + e.toString());
            return null;
        }
    }

    public final String getId() {
        try {
            return this.a.a();
        } catch (RemoteException e) {
            mco.a(C0201.m82(11174), C0201.m82(11173) + e.toString());
            return null;
        }
    }

    public final int getJointType() {
        try {
            return this.a.j();
        } catch (RemoteException e) {
            mco.d(C0201.m82(11176), C0201.m82(11175) + e.toString());
            return -1;
        }
    }

    public final List<PatternItem> getPattern() {
        try {
            return this.a.k();
        } catch (RemoteException e) {
            mco.d(C0201.m82(11178), C0201.m82(11177) + e.toString());
            return null;
        }
    }

    public final List<LatLng> getPoints() {
        try {
            return this.a.l();
        } catch (RemoteException e) {
            mco.a(C0201.m82(11180), C0201.m82(11179) + e.toString());
            return null;
        }
    }

    public final Cap getStartCap() {
        try {
            return this.a.m();
        } catch (RemoteException e) {
            mco.d(C0201.m82(11182), C0201.m82(11181) + e.toString());
            return null;
        }
    }

    public final Object getTag() {
        try {
            return ObjectWrapper.unwrap(this.a.b());
        } catch (RemoteException e) {
            mco.a(C0201.m82(11184), C0201.m82(11183) + e.toString());
            return null;
        }
    }

    public final float getWidth() {
        try {
            return this.a.n();
        } catch (RemoteException e) {
            mco.a(C0201.m82(11186), C0201.m82(11185) + e.toString());
            return 0.0f;
        }
    }

    public final float getZIndex() {
        try {
            return this.a.c();
        } catch (RemoteException e) {
            mco.d(C0201.m82(11188), C0201.m82(11187) + e.toString());
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
            mco.a(C0201.m82(11190), C0201.m82(11189) + e.toString());
            return true;
        }
    }

    public final boolean isGeodesic() {
        try {
            return this.a.o();
        } catch (RemoteException e) {
            mco.d(C0201.m82(11192), C0201.m82(11191) + e.toString());
            return true;
        }
    }

    public final boolean isVisible() {
        try {
            return this.a.f();
        } catch (RemoteException e) {
            mco.d(C0201.m82(11194), C0201.m82(11193) + e.toString());
            return true;
        }
    }

    public final void remove() {
        try {
            this.a.g();
        } catch (RemoteException e) {
            mco.a(C0201.m82(11196), C0201.m82(11195) + e.toString());
        }
    }

    public final void setClickable(boolean z) {
        try {
            this.a.a(z);
        } catch (RemoteException e) {
            mco.a(C0201.m82(11198), C0201.m82(11197) + e.toString());
        }
    }

    public final void setColor(int i) {
        try {
            this.a.a(i);
        } catch (RemoteException e) {
            mco.a(C0201.m82(11200), C0201.m82(11199) + e.toString());
        }
    }

    public final void setEndCap(Cap cap) {
        try {
            this.a.a(cap);
        } catch (RemoteException e) {
            mco.d(C0201.m82(11202), C0201.m82(11201) + e.toString());
        }
    }

    public final void setGeodesic(boolean z) {
        try {
            this.a.c(z);
        } catch (RemoteException e) {
            mco.d(C0201.m82(11204), C0201.m82(11203) + e.toString());
        }
    }

    public final void setJointType(int i) {
        try {
            this.a.b(i);
        } catch (RemoteException e) {
            mco.d(C0201.m82(11206), C0201.m82(11205) + e.toString());
        }
    }

    public final void setPattern(List<PatternItem> list) {
        try {
            this.a.a(list);
        } catch (RemoteException e) {
            mco.d(C0201.m82(11208), C0201.m82(11207) + e.toString());
        }
    }

    public final void setPoints(List<LatLng> list) {
        try {
            this.a.b(list);
        } catch (RemoteException e) {
            mco.a(C0201.m82(11210), C0201.m82(11209) + e.toString());
        }
    }

    public final void setStartCap(Cap cap) {
        try {
            this.a.b(cap);
        } catch (RemoteException e) {
            mco.d(C0201.m82(11212), C0201.m82(11211) + e.toString());
        }
    }

    public final void setTag(Object obj) {
        Preconditions.checkNotNull(obj, C0201.m82(11213));
        try {
            this.a.a(ObjectWrapper.wrap(obj));
        } catch (RemoteException e) {
            mco.a(C0201.m82(11215), C0201.m82(11214) + e.toString());
        }
    }

    public final void setVisible(boolean z) {
        try {
            this.a.b(z);
        } catch (RemoteException e) {
            mco.d(C0201.m82(11217), C0201.m82(11216) + e.toString());
        }
    }

    public final void setWidth(float f) {
        try {
            this.a.b(f);
        } catch (RemoteException e) {
            mco.a(C0201.m82(11219), C0201.m82(11218) + e.toString());
        }
    }

    public final void setZIndex(float f) {
        try {
            this.a.a(f);
        } catch (RemoteException e) {
            mco.d(C0201.m82(11221), C0201.m82(11220) + e.toString());
        }
    }
}
