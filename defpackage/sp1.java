package defpackage;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: sp1  reason: default package */
public interface sp1 extends IInterface {
    yq0 A0(LatLng latLng) throws RemoteException;

    yq0 c2(LatLngBounds latLngBounds, int i, int i2, int i3) throws RemoteException;

    yq0 n2(CameraPosition cameraPosition) throws RemoteException;

    yq0 q3(LatLng latLng, float f) throws RemoteException;

    yq0 r(LatLngBounds latLngBounds, int i) throws RemoteException;
}
