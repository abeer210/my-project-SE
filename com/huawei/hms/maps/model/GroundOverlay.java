package com.huawei.hms.maps.model;

import android.os.RemoteException;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.maps.mcb;
import com.huawei.hms.maps.mco;
import vigqyno.C0201;

public final class GroundOverlay {
    private final mcb a;

    public GroundOverlay(mcb mcb) {
        this.a = mcb;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof GroundOverlay)) {
            return false;
        }
        try {
            return this.a.a(((GroundOverlay) obj).a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final float getBearing() {
        try {
            return this.a.a();
        } catch (RemoteException e) {
            mco.a(C0201.m82(8853), C0201.m82(8852) + e.toString());
            return 0.0f;
        }
    }

    public final LatLngBounds getBounds() {
        try {
            return this.a.b();
        } catch (RemoteException e) {
            mco.a(C0201.m82(8855), C0201.m82(8854) + e.toString());
            return null;
        }
    }

    public final float getHeight() {
        try {
            return this.a.c();
        } catch (RemoteException e) {
            mco.a(C0201.m82(8857), C0201.m82(8856) + e.toString());
            return 0.0f;
        }
    }

    public final String getId() {
        try {
            return this.a.d();
        } catch (RemoteException e) {
            mco.a(C0201.m82(8859), C0201.m82(8858) + e.toString());
            return null;
        }
    }

    public final LatLng getPosition() {
        try {
            return this.a.e();
        } catch (RemoteException e) {
            mco.a(C0201.m82(8861), C0201.m82(8860) + e.toString());
            return null;
        }
    }

    public final Object getTag() {
        try {
            return ObjectWrapper.unwrap(this.a.f());
        } catch (RemoteException e) {
            mco.a(C0201.m82(8863), C0201.m82(8862) + e.toString());
            return null;
        }
    }

    public final float getTransparency() {
        try {
            return this.a.g();
        } catch (RemoteException e) {
            mco.d(C0201.m82(8865), C0201.m82(8864) + e.toString());
            return -1.0f;
        }
    }

    public final float getWidth() {
        try {
            return this.a.h();
        } catch (RemoteException e) {
            mco.a(C0201.m82(8867), C0201.m82(8866) + e.toString());
            return 0.0f;
        }
    }

    public final float getZIndex() {
        try {
            return this.a.i();
        } catch (RemoteException e) {
            mco.d(C0201.m82(8869), C0201.m82(8868) + e.toString());
            return -1.0f;
        }
    }

    public final int hashCode() {
        try {
            return this.a.j();
        } catch (RemoteException e) {
            mco.d(C0201.m82(8871), C0201.m82(8870) + e.toString());
            return 0;
        }
    }

    public final boolean isClickable() {
        try {
            return this.a.k();
        } catch (RemoteException e) {
            mco.a(C0201.m82(8873), C0201.m82(8872) + e.toString());
            return false;
        }
    }

    public final boolean isVisible() {
        try {
            return this.a.l();
        } catch (RemoteException e) {
            mco.a(C0201.m82(8875), C0201.m82(8874) + e.toString());
            return true;
        }
    }

    public final void remove() {
        try {
            if (this.a != null) {
                this.a.m();
            }
        } catch (RemoteException e) {
            mco.d(C0201.m82(8877), C0201.m82(8876) + e.toString());
        }
    }

    public final void setBearing(float f) {
        try {
            this.a.a(f);
        } catch (RemoteException e) {
            mco.a(C0201.m82(8879), C0201.m82(8878) + e.toString());
        }
    }

    public final void setClickable(boolean z) {
        try {
            this.a.a(z);
        } catch (RemoteException e) {
            mco.d(C0201.m82(8881), C0201.m82(8880) + e.toString());
        }
    }

    public final void setDimensions(float f) {
        try {
            this.a.d(f);
        } catch (RemoteException e) {
            mco.a(C0201.m82(8883), C0201.m82(8882) + e.toString());
        }
    }

    public final void setDimensions(float f, float f2) {
        try {
            this.a.a(f, f2);
        } catch (RemoteException e) {
            mco.a(C0201.m82(8885), C0201.m82(8884) + e.toString());
        }
    }

    public final void setImage(BitmapDescriptor bitmapDescriptor) {
        Preconditions.checkNotNull(bitmapDescriptor, C0201.m82(8886));
        try {
            this.a.b(bitmapDescriptor.getObject());
        } catch (RemoteException e) {
            mco.a(C0201.m82(8888), C0201.m82(8887) + e.toString());
        }
    }

    public final void setPosition(LatLng latLng) {
        try {
            this.a.a(latLng);
        } catch (RemoteException e) {
            mco.a(C0201.m82(8890), C0201.m82(8889) + e.toString());
        }
    }

    public final void setPositionFromBounds(LatLngBounds latLngBounds) {
        try {
            this.a.a(latLngBounds);
        } catch (RemoteException e) {
            mco.a(C0201.m82(8892), C0201.m82(8891) + e.toString());
        }
    }

    public final void setTag(Object obj) {
        try {
            this.a.a(ObjectWrapper.wrap(obj));
        } catch (RemoteException e) {
            mco.a(C0201.m82(8894), C0201.m82(8893) + e.toString());
        }
    }

    public final void setTransparency(float f) {
        try {
            this.a.b(f);
        } catch (RemoteException e) {
            mco.d(C0201.m82(8896), C0201.m82(8895) + e.toString());
        }
    }

    public final void setVisible(boolean z) {
        try {
            this.a.b(z);
        } catch (RemoteException e) {
            mco.a(C0201.m82(8898), C0201.m82(8897) + e.toString());
        }
    }

    public final void setZIndex(float f) {
        try {
            this.a.c(f);
        } catch (RemoteException e) {
            mco.d(C0201.m82(8900), C0201.m82(8899) + e.toString());
        }
    }
}
