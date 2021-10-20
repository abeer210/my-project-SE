package defpackage;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.d;
import com.google.android.gms.maps.model.q;
import java.util.List;

/* renamed from: f41  reason: default package */
public interface f41 extends IInterface {
    void C0(d dVar) throws RemoteException;

    void U(List<q> list) throws RemoteException;

    boolean W0(f41 f41) throws RemoteException;

    void e(float f) throws RemoteException;

    void i1(int i) throws RemoteException;

    void j3(d dVar) throws RemoteException;

    void l(boolean z) throws RemoteException;

    void remove() throws RemoteException;

    int s() throws RemoteException;

    void setVisible(boolean z) throws RemoteException;

    List<LatLng> v() throws RemoteException;

    void v2(float f) throws RemoteException;

    void y(boolean z) throws RemoteException;

    void z(List<LatLng> list) throws RemoteException;
}
