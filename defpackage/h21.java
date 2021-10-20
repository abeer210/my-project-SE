package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.location.l;
import vigqyno.C0201;

/* renamed from: h21  reason: default package */
public final class h21 extends v11 {
    private e<l> a;

    public h21(e<l> eVar) {
        u.b(eVar != null, C0201.m82(4034));
        this.a = eVar;
    }

    @Override // defpackage.u11
    public final void X0(l lVar) throws RemoteException {
        this.a.a(lVar);
        this.a = null;
    }
}
