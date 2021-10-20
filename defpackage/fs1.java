package defpackage;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* renamed from: fs1  reason: default package */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public interface fs1 extends IInterface {
    void G(Status status, GoogleSignInAccount googleSignInAccount) throws RemoteException;

    void H1(Status status) throws RemoteException;

    void S1(Status status) throws RemoteException;

    void Y2(vo0 vo0, es1 es1) throws RemoteException;

    void t0(ns1 ns1) throws RemoteException;
}
