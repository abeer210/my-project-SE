package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import defpackage.sh1;

/* renamed from: b51  reason: default package */
public final class b51 extends sh1.a {
    private final /* synthetic */ Bundle e;
    private final /* synthetic */ sh1 f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b51(sh1 sh1, Bundle bundle) {
        super(sh1);
        this.f = sh1;
        this.e = bundle;
    }

    @Override // defpackage.sh1.a
    public final void a() throws RemoteException {
        this.f.g.setConditionalUserProperty(this.e, this.a);
    }
}
