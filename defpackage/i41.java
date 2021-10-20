package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import defpackage.sh1;

/* renamed from: i41  reason: default package */
public final class i41 extends sh1.a {
    private final /* synthetic */ String e;
    private final /* synthetic */ String f;
    private final /* synthetic */ Bundle g;
    private final /* synthetic */ sh1 h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i41(sh1 sh1, String str, String str2, Bundle bundle) {
        super(sh1);
        this.h = sh1;
        this.e = str;
        this.f = str2;
        this.g = bundle;
    }

    @Override // defpackage.sh1.a
    public final void a() throws RemoteException {
        this.h.g.clearConditionalUserProperty(this.e, this.f, this.g);
    }
}
