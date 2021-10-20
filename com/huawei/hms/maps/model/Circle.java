package com.huawei.hms.maps.model;

import android.os.RemoteException;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.maps.mca;
import com.huawei.hms.maps.mco;
import java.util.List;
import vigqyno.C0201;

public final class Circle {
    private mca a;

    public Circle(mca mca) {
        this.a = mca;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Circle)) {
            return false;
        }
        try {
            return this.a.a(((Circle) obj).a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final LatLng getCenter() {
        try {
            return this.a.h();
        } catch (RemoteException e) {
            mco.a(C0201.m82(15301), C0201.m82(15300) + e.toString());
            return null;
        }
    }

    public final int getFillColor() {
        try {
            return this.a.i();
        } catch (RemoteException e) {
            mco.a(C0201.m82(15303), C0201.m82(15302) + e.toString());
            return 0;
        }
    }

    public final String getId() {
        try {
            return this.a.a();
        } catch (RemoteException e) {
            mco.a(C0201.m82(15305), C0201.m82(15304) + e.toString());
            return null;
        }
    }

    public final double getRadius() {
        try {
            return this.a.j();
        } catch (RemoteException e) {
            mco.a(C0201.m82(15307), C0201.m82(15306) + e.toString());
            return 0.0d;
        }
    }

    public final int getStrokeColor() {
        try {
            return this.a.k();
        } catch (RemoteException e) {
            mco.a(C0201.m82(15309), C0201.m82(15308) + e.toString());
            return 0;
        }
    }

    public final List<PatternItem> getStrokePattern() {
        try {
            return this.a.l();
        } catch (RemoteException e) {
            mco.d(C0201.m82(15311), C0201.m82(15310) + e.toString());
            return null;
        }
    }

    public final float getStrokeWidth() {
        try {
            return this.a.m();
        } catch (RemoteException e) {
            mco.a(C0201.m82(15313), C0201.m82(15312) + e.toString());
            return 0.0f;
        }
    }

    public final Object getTag() {
        try {
            return ObjectWrapper.unwrap(this.a.b());
        } catch (RemoteException e) {
            mco.a(C0201.m82(15315), C0201.m82(15314) + e.toString());
            return null;
        }
    }

    public final float getZIndex() {
        try {
            return this.a.c();
        } catch (RemoteException e) {
            mco.d(C0201.m82(15317), C0201.m82(15316) + e.toString());
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
            mco.a(C0201.m82(15319), C0201.m82(15318) + e.toString());
            return true;
        }
    }

    public final boolean isVisible() {
        try {
            return this.a.f();
        } catch (RemoteException e) {
            mco.d(C0201.m82(15321), C0201.m82(15320) + e.toString());
            return true;
        }
    }

    public final void remove() {
        try {
            this.a.g();
        } catch (RemoteException e) {
            mco.a(C0201.m82(15323), C0201.m82(15322) + e.toString());
        }
    }

    public final void setCenter(LatLng latLng) {
        if (latLng != null) {
            try {
                this.a.a(latLng);
            } catch (RemoteException e) {
                mco.a(C0201.m82(15325), C0201.m82(15324) + e.toString());
            }
        } else {
            throw new NullPointerException(C0201.m82(15326));
        }
    }

    public final void setClickable(boolean z) {
        try {
            this.a.a(z);
        } catch (RemoteException e) {
            mco.a(C0201.m82(15328), C0201.m82(15327) + e.toString());
        }
    }

    public final void setFillColor(int i) {
        try {
            this.a.a(i);
        } catch (RemoteException e) {
            mco.a(C0201.m82(15330), C0201.m82(15329) + e.toString());
        }
    }

    public final void setRadius(double d) {
        try {
            this.a.a(d);
        } catch (RemoteException e) {
            mco.a(C0201.m82(15332), C0201.m82(15331) + e.toString());
        }
    }

    public final void setStrokeColor(int i) {
        try {
            this.a.b(i);
        } catch (RemoteException e) {
            mco.a(C0201.m82(15334), C0201.m82(15333) + e.toString());
        }
    }

    public final void setStrokePattern(List<PatternItem> list) {
        try {
            this.a.a(list);
        } catch (RemoteException e) {
            mco.d(C0201.m82(15336), C0201.m82(15335) + e.toString());
        }
    }

    public final void setStrokeWidth(float f) {
        if (f >= 0.0f) {
            try {
                this.a.b(f);
            } catch (RemoteException e) {
                mco.a(C0201.m82(15338), C0201.m82(15337) + e.toString());
            }
        } else {
            throw new IllegalArgumentException(C0201.m82(15339));
        }
    }

    public final <T> void setTag(T t) {
        try {
            this.a.a(ObjectWrapper.wrap(t));
        } catch (RemoteException e) {
            mco.a(C0201.m82(15341), C0201.m82(15340) + e.toString());
        }
    }

    public final void setVisible(boolean z) {
        try {
            this.a.b(z);
        } catch (RemoteException e) {
            mco.d(C0201.m82(15343), C0201.m82(15342) + e.toString());
        }
    }

    public final void setZIndex(float f) {
        try {
            this.a.a(f);
        } catch (RemoteException e) {
            mco.d(C0201.m82(15345), C0201.m82(15344) + e.toString());
        }
    }
}
