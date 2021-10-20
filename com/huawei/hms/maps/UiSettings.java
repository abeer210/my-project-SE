package com.huawei.hms.maps;

import android.os.RemoteException;
import vigqyno.C0201;

public final class UiSettings {
    private final mbs a;

    public UiSettings(mbs mbs) {
        mco.a(C0201.m82(32537), C0201.m82(32538));
        this.a = mbs;
    }

    public final boolean isCompassEnabled() {
        try {
            return this.a.a();
        } catch (RemoteException e) {
            mco.a(C0201.m82(32540), C0201.m82(32539) + e.toString());
            return false;
        }
    }

    public final boolean isIndoorLevelPickerEnabled() {
        try {
            return this.a.b();
        } catch (RemoteException e) {
            mco.a(C0201.m82(32542), C0201.m82(32541) + e.toString());
            return false;
        }
    }

    public final boolean isMapToolbarEnabled() {
        try {
            return this.a.c();
        } catch (RemoteException e) {
            mco.a(C0201.m82(32544), C0201.m82(32543) + e.toString());
            return false;
        }
    }

    public final boolean isMyLocationButtonEnabled() {
        try {
            return this.a.d();
        } catch (RemoteException e) {
            mco.a(C0201.m82(32546), C0201.m82(32545) + e.toString());
            return false;
        }
    }

    public final boolean isRotateGesturesEnabled() {
        try {
            return this.a.e();
        } catch (RemoteException e) {
            mco.a(C0201.m82(32548), C0201.m82(32547) + e.toString());
            return false;
        }
    }

    public final boolean isScrollGesturesEnabled() {
        try {
            return this.a.f();
        } catch (RemoteException e) {
            mco.a(C0201.m82(32550), C0201.m82(32549) + e.toString());
            return false;
        }
    }

    public final boolean isScrollGesturesEnabledDuringRotateOrZoom() {
        try {
            return this.a.g();
        } catch (RemoteException e) {
            mco.d(C0201.m82(32552), C0201.m82(32551) + e.toString());
            return false;
        }
    }

    public final boolean isTiltGesturesEnabled() {
        try {
            return this.a.h();
        } catch (RemoteException e) {
            mco.a(C0201.m82(32554), C0201.m82(32553) + e.toString());
            return false;
        }
    }

    public final boolean isZoomControlsEnabled() {
        try {
            return this.a.i();
        } catch (RemoteException e) {
            mco.a(C0201.m82(32556), C0201.m82(32555) + e.toString());
            return false;
        }
    }

    public final boolean isZoomGesturesEnabled() {
        try {
            return this.a.j();
        } catch (RemoteException e) {
            mco.a(C0201.m82(32558), C0201.m82(32557) + e.toString());
            return false;
        }
    }

    public final void setAllGesturesEnabled(boolean z) {
        try {
            this.a.k(z);
        } catch (RemoteException e) {
            mco.a(C0201.m82(32560), C0201.m82(32559) + e.toString());
        }
    }

    public final void setCompassEnabled(boolean z) {
        try {
            this.a.a(z);
        } catch (RemoteException e) {
            mco.a(C0201.m82(32562), C0201.m82(32561) + e.toString());
        }
    }

    public final void setIndoorLevelPickerEnabled(boolean z) {
        try {
            this.a.b(z);
        } catch (RemoteException e) {
            mco.a(C0201.m82(32564), C0201.m82(32563) + e.toString());
        }
    }

    public final void setMapToolbarEnabled(boolean z) {
        try {
            this.a.c(z);
        } catch (RemoteException e) {
            mco.a(C0201.m82(32566), C0201.m82(32565) + e.toString());
        }
    }

    public final void setMyLocationButtonEnabled(boolean z) {
        try {
            this.a.d(z);
        } catch (RemoteException e) {
            mco.a(C0201.m82(32568), C0201.m82(32567) + e.toString());
        }
    }

    public final void setRotateGesturesEnabled(boolean z) {
        try {
            this.a.e(z);
        } catch (RemoteException e) {
            mco.a(C0201.m82(32570), C0201.m82(32569) + e.toString());
        }
    }

    public final void setScrollGesturesEnabled(boolean z) {
        try {
            this.a.f(z);
        } catch (RemoteException e) {
            mco.a(C0201.m82(32572), C0201.m82(32571) + e.toString());
        }
    }

    public final void setScrollGesturesEnabledDuringRotateOrZoom(boolean z) {
        try {
            this.a.g(z);
        } catch (RemoteException e) {
            mco.d(C0201.m82(32574), C0201.m82(32573) + e.toString());
        }
    }

    public final void setTiltGesturesEnabled(boolean z) {
        try {
            this.a.h(z);
        } catch (RemoteException e) {
            mco.a(C0201.m82(32576), C0201.m82(32575) + e.toString());
        }
    }

    public final void setZoomControlsEnabled(boolean z) {
        try {
            this.a.i(z);
        } catch (RemoteException e) {
            mco.a(C0201.m82(32578), C0201.m82(32577) + e.toString());
        }
    }

    public final void setZoomGesturesEnabled(boolean z) {
        try {
            this.a.j(z);
        } catch (RemoteException e) {
            mco.a(C0201.m82(32580), C0201.m82(32579) + e.toString());
        }
    }
}
