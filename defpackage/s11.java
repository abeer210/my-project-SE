package defpackage;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.location.b0;
import com.google.android.gms.location.f;
import com.google.android.gms.location.j;

/* renamed from: s11  reason: default package */
public interface s11 extends IInterface {
    void B1(x21 x21) throws RemoteException;

    void B2(boolean z) throws RemoteException;

    void F3(f fVar, PendingIntent pendingIntent, q11 q11) throws RemoteException;

    void I3(j jVar, u11 u11, String str) throws RemoteException;

    void O2(k21 k21) throws RemoteException;

    Location R2(String str) throws RemoteException;

    void Y1(b0 b0Var, q11 q11) throws RemoteException;
}
