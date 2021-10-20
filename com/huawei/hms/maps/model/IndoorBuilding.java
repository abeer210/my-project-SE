package com.huawei.hms.maps.model;

import android.os.IBinder;
import android.os.RemoteException;
import com.huawei.hms.maps.mcc;
import com.huawei.hms.maps.mcd;
import java.util.ArrayList;
import java.util.List;

public final class IndoorBuilding {
    private mcc a;

    public IndoorBuilding(mcc mcc) {
        this.a = mcc;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof IndoorBuilding)) {
            return false;
        }
        try {
            return this.a.a(((IndoorBuilding) obj).a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int getActiveLevelIndex() {
        try {
            return this.a.a();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int getDefaultLevelIndex() {
        try {
            return this.a.b();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final List<IndoorLevel> getLevels() {
        try {
            List<IBinder> c = this.a.c();
            ArrayList arrayList = new ArrayList(c.size());
            for (IBinder iBinder : c) {
                IBinder iBinder2 = null;
                if (iBinder instanceof IBinder) {
                    iBinder2 = iBinder;
                }
                arrayList.add(new IndoorLevel(mcd.maa.a(iBinder2)));
            }
            return arrayList;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            return this.a.e();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean isUnderground() {
        try {
            return this.a.d();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
