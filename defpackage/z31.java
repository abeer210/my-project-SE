package defpackage;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: z31  reason: default package */
public interface z31 extends IInterface {
    void F() throws RemoteException;

    void I2(String str) throws RemoteException;

    void J0(String str) throws RemoteException;

    void O(boolean z) throws RemoteException;

    void P(boolean z) throws RemoteException;

    void S(float f, float f2) throws RemoteException;

    void T1(float f) throws RemoteException;

    void e(float f) throws RemoteException;

    void g1() throws RemoteException;

    LatLng getPosition() throws RemoteException;

    String getTitle() throws RemoteException;

    void h0(float f, float f2) throws RemoteException;

    void i0(LatLng latLng) throws RemoteException;

    boolean l2(z31 z31) throws RemoteException;

    void p2(float f) throws RemoteException;

    void remove() throws RemoteException;

    int s() throws RemoteException;

    void s1(yq0 yq0) throws RemoteException;

    void setVisible(boolean z) throws RemoteException;

    String x3() throws RemoteException;
}
