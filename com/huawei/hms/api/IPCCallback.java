package com.huawei.hms.api;

import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.ResponseHeader;
import com.huawei.hms.core.aidl.a;
import com.huawei.hms.core.aidl.b;
import com.huawei.hms.core.aidl.c;
import com.huawei.hms.core.aidl.e;
import com.huawei.hms.support.api.transport.DatagramTransport;
import com.huawei.hms.support.log.HMSLog;
import vigqyno.C0201;

public class IPCCallback extends c.a {
    private final Class<? extends IMessageEntity> a;
    private final DatagramTransport.CallBack b;

    public IPCCallback(Class<? extends IMessageEntity> cls, DatagramTransport.CallBack callBack) {
        this.a = cls;
        this.b = callBack;
    }

    @Override // com.huawei.hms.core.aidl.c
    public void call(b bVar) throws RemoteException {
        if (bVar == null || TextUtils.isEmpty(bVar.a)) {
            HMSLog.e(C0201.m82(5005), C0201.m82(5006));
            throw new RemoteException();
        }
        e a2 = a.a(bVar.c());
        IMessageEntity iMessageEntity = null;
        if (bVar.b() > 0 && (iMessageEntity = newResponseInstance()) != null) {
            a2.a(bVar.a(), iMessageEntity);
        }
        if (bVar.b != null) {
            ResponseHeader responseHeader = new ResponseHeader();
            a2.a(bVar.b, responseHeader);
            this.b.onCallback(responseHeader.getStatusCode(), iMessageEntity);
            return;
        }
        this.b.onCallback(0, iMessageEntity);
    }

    public IMessageEntity newResponseInstance() {
        Class<? extends IMessageEntity> cls = this.a;
        if (cls == null) {
            return null;
        }
        try {
            return (IMessageEntity) cls.newInstance();
        } catch (IllegalAccessException | InstantiationException e) {
            HMSLog.e(C0201.m82(5008), C0201.m82(5007) + e.getMessage());
            return null;
        }
    }
}
