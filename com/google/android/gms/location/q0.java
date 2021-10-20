package com.google.android.gms.location;

import android.location.Location;
import android.os.IInterface;
import android.os.RemoteException;

public interface q0 extends IInterface {
    void onLocationChanged(Location location) throws RemoteException;
}
