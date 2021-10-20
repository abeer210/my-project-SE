package defpackage;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: q31  reason: default package */
public interface q31 extends IInterface {
    void B0(LatLngBounds latLngBounds) throws RemoteException;

    void J(yq0 yq0) throws RemoteException;

    void e(float f) throws RemoteException;

    void f(float f) throws RemoteException;

    LatLng getPosition() throws RemoteException;

    boolean k2(q31 q31) throws RemoteException;

    void l(boolean z) throws RemoteException;

    void remove() throws RemoteException;

    int s() throws RemoteException;

    void setVisible(boolean z) throws RemoteException;
}
