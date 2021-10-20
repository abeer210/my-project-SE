package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import vigqyno.C0201;

public interface mbj extends IInterface {

    public static abstract class maa extends Binder implements mbj {
        public maa() {
            attachInterface(this, C0201.m82(34847));
        }

        public IBinder asBinder() {
            return this;
        }
    }
}
