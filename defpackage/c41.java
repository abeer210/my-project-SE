package defpackage;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

/* renamed from: c41  reason: default package */
public interface c41 extends IInterface {
    boolean E3(c41 c41) throws RemoteException;

    void d(int i) throws RemoteException;

    void e(float f) throws RemoteException;

    void l(boolean z) throws RemoteException;

    void n(int i) throws RemoteException;

    void o(float f) throws RemoteException;

    void remove() throws RemoteException;

    int s() throws RemoteException;

    void s0(List list) throws RemoteException;

    void setVisible(boolean z) throws RemoteException;

    List<LatLng> v() throws RemoteException;

    void y(boolean z) throws RemoteException;

    void z(List<LatLng> list) throws RemoteException;
}
