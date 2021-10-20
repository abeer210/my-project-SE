package com.huawei.hms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.maps.mbj;
import com.huawei.hms.maps.mbk;
import com.huawei.hms.maps.mbl;
import com.huawei.hms.maps.model.LatLng;
import com.huawei.hms.maps.model.StreetViewPanoramaCamera;
import com.huawei.hms.maps.model.StreetViewPanoramaLocation;
import com.huawei.hms.maps.model.StreetViewPanoramaOrientation;
import com.huawei.hms.maps.model.StreetViewSource;
import vigqyno.C0201;

@Deprecated
public class StreetViewPanorama {
    private mbp a;

    public interface OnStreetViewPanoramaCameraChangeListener {
        void onStreetViewPanoramaCameraChange(StreetViewPanoramaCamera streetViewPanoramaCamera);
    }

    public interface OnStreetViewPanoramaChangeListener {
        void onStreetViewPanoramaChange(StreetViewPanoramaLocation streetViewPanoramaLocation);
    }

    public interface OnStreetViewPanoramaClickListener {
        void onStreetViewPanoramaClick(StreetViewPanoramaOrientation streetViewPanoramaOrientation);
    }

    public interface OnStreetViewPanoramaLongClickListener {
        void onStreetViewPanoramaLongClick(StreetViewPanoramaOrientation streetViewPanoramaOrientation);
    }

    public StreetViewPanorama(mbp mbp) {
        this.a = mbp;
    }

    public void animateTo(StreetViewPanoramaCamera streetViewPanoramaCamera, long j) {
    }

    public StreetViewPanoramaLocation getLocation() {
        String r0 = C0201.m82(10913);
        mco.a(r0, C0201.m82(10914));
        try {
            return this.a.h();
        } catch (RemoteException unused) {
            mco.d(r0, C0201.m82(10915));
            return null;
        }
    }

    public StreetViewPanoramaCamera getPanoramaCamera() {
        try {
            return this.a.a();
        } catch (RemoteException e) {
            mco.d(C0201.m82(10917), C0201.m82(10916) + e.toString());
            return null;
        }
    }

    public boolean isPanningGesturesEnabled() {
        try {
            return this.a.b();
        } catch (RemoteException e) {
            mco.d(C0201.m82(10919), C0201.m82(10918) + e.toString());
            return false;
        }
    }

    public boolean isStreetNamesEnabled() {
        try {
            return this.a.c();
        } catch (RemoteException e) {
            mco.d(C0201.m82(10921), C0201.m82(10920) + e.toString());
            return false;
        }
    }

    public boolean isUserNavigationEnabled() {
        try {
            return this.a.d();
        } catch (RemoteException e) {
            mco.d(C0201.m82(10923), C0201.m82(10922) + e.toString());
            return false;
        }
    }

    public boolean isZoomGesturesEnabled() {
        try {
            return this.a.e();
        } catch (RemoteException e) {
            mco.d(C0201.m82(10925), C0201.m82(10924) + e.toString());
            return false;
        }
    }

    public Point orientationToPoint(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        try {
            return (Point) ObjectWrapper.unwrap(this.a.f());
        } catch (RemoteException e) {
            mco.d(C0201.m82(10927), C0201.m82(10926) + e.toString());
            return null;
        }
    }

    public StreetViewPanoramaOrientation pointToOrientation(Point point) {
        try {
            mbp mbp = this.a;
            ObjectWrapper.wrap(point);
            return mbp.g();
        } catch (RemoteException e) {
            mco.d(C0201.m82(10929), C0201.m82(10928) + e.toString());
            return null;
        }
    }

    public final void setOnStreetViewPanoramaCameraChangeListener(final OnStreetViewPanoramaCameraChangeListener onStreetViewPanoramaCameraChangeListener) {
        String r0 = C0201.m82(10930);
        mco.b(r0, C0201.m82(10931));
        try {
            new mbj.maa() {
                /* class com.huawei.hms.maps.StreetViewPanorama.AnonymousClass1 */

                public void onStreetViewPanoramaCameraChange(StreetViewPanoramaCamera streetViewPanoramaCamera) {
                    onStreetViewPanoramaCameraChangeListener.onStreetViewPanoramaCameraChange(streetViewPanoramaCamera);
                }
            };
        } catch (RemoteException e) {
            mco.d(r0, C0201.m82(10932) + e.toString());
        }
    }

    public final void setOnStreetViewPanoramaChangeListener(OnStreetViewPanoramaChangeListener onStreetViewPanoramaChangeListener) {
    }

    public final void setOnStreetViewPanoramaClickListener(final OnStreetViewPanoramaClickListener onStreetViewPanoramaClickListener) {
        try {
            new mbk.maa() {
                /* class com.huawei.hms.maps.StreetViewPanorama.AnonymousClass2 */

                public void onStreetViewPanoramaClick(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
                    onStreetViewPanoramaClickListener.onStreetViewPanoramaClick(streetViewPanoramaOrientation);
                }
            };
        } catch (RemoteException e) {
            mco.a(C0201.m82(10934), C0201.m82(10933) + e.toString());
        }
    }

    public final void setOnStreetViewPanoramaLongClickListener(final OnStreetViewPanoramaLongClickListener onStreetViewPanoramaLongClickListener) {
        try {
            new mbl.maa() {
                /* class com.huawei.hms.maps.StreetViewPanorama.AnonymousClass3 */

                public void onStreetViewPanoramaLongClick(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
                    onStreetViewPanoramaLongClickListener.onStreetViewPanoramaLongClick(streetViewPanoramaOrientation);
                }
            };
        } catch (RemoteException e) {
            mco.d(C0201.m82(10936), C0201.m82(10935) + e.toString());
        }
    }

    public void setPanningGesturesEnabled(boolean z) {
    }

    public void setPosition(LatLng latLng) {
    }

    public void setPosition(LatLng latLng, int i) {
    }

    public void setPosition(LatLng latLng, int i, StreetViewSource streetViewSource) {
    }

    public void setPosition(LatLng latLng, StreetViewSource streetViewSource) {
    }

    public void setPosition(String str) {
    }

    public void setStreetNamesEnabled(boolean z) {
    }

    public void setUserNavigationEnabled(boolean z) {
    }

    public void setZoomGesturesEnabled(boolean z) {
    }
}
