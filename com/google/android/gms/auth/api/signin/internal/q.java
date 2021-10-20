package com.google.android.gms.auth.api.signin.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

public interface q extends IInterface {
    void M(Status status) throws RemoteException;

    void R0(GoogleSignInAccount googleSignInAccount, Status status) throws RemoteException;

    void n0(Status status) throws RemoteException;
}
