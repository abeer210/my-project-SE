package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.RemoteException;
import vigqyno.C0201;

/* renamed from: j02  reason: default package */
public final class j02 extends i02<a02> {
    public j02(k02 k02, d12 d12) {
        super(k02, new gy1(C0201.m82(20338)), d12);
    }

    @Override // defpackage.i02, defpackage.fy1
    public final void a(Bundle bundle) throws RemoteException {
        super.a(bundle);
        this.b.e((T) a02.b((PendingIntent) bundle.get(C0201.m82(20339))));
    }
}
