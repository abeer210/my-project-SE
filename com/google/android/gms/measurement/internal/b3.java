package com.google.android.gms.measurement.internal;

import android.os.IInterface;
import android.os.RemoteException;
import java.util.List;

public interface b3 extends IInterface {
    String G0(d9 d9Var) throws RemoteException;

    void I(g9 g9Var) throws RemoteException;

    void K(j jVar, String str, String str2) throws RemoteException;

    List<t8> O1(String str, String str2, boolean z, d9 d9Var) throws RemoteException;

    List<t8> P1(d9 d9Var, boolean z) throws RemoteException;

    void R1(d9 d9Var) throws RemoteException;

    void g2(t8 t8Var, d9 d9Var) throws RemoteException;

    void j1(long j, String str, String str2, String str3) throws RemoteException;

    List<t8> k0(String str, String str2, String str3, boolean z) throws RemoteException;

    void n1(d9 d9Var) throws RemoteException;

    void p3(j jVar, d9 d9Var) throws RemoteException;

    void q0(g9 g9Var, d9 d9Var) throws RemoteException;

    List<g9> q1(String str, String str2, d9 d9Var) throws RemoteException;

    byte[] r3(j jVar, String str) throws RemoteException;

    void t2(d9 d9Var) throws RemoteException;

    List<g9> u2(String str, String str2, String str3) throws RemoteException;
}
