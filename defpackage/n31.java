package defpackage;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: n31  reason: default package */
public interface n31 extends IInterface {
    void d(int i) throws RemoteException;

    void e(float f) throws RemoteException;

    void n(int i) throws RemoteException;

    void n3(double d) throws RemoteException;

    void o(float f) throws RemoteException;

    void remove() throws RemoteException;

    int s() throws RemoteException;

    void v3(LatLng latLng) throws RemoteException;

    boolean w0(n31 n31) throws RemoteException;
}
