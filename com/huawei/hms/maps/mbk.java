package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import vigqyno.C0201;

public interface mbk extends IInterface {

    public static abstract class maa extends Binder implements mbk {
        public maa() {
            attachInterface(this, C0201.m82(10814));
        }

        public IBinder asBinder() {
            return this;
        }
    }
}
