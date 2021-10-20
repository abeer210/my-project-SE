package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import vigqyno.C0201;

public interface mbm extends IInterface {

    public static abstract class maa extends Binder implements mbm {
        public maa() {
            attachInterface(this, C0201.m82(3428));
        }

        public IBinder asBinder() {
            return this;
        }
    }
}
