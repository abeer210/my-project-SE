package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import defpackage.sh1;

/* renamed from: e51  reason: default package */
public final class e51 extends sh1.a {
    private final /* synthetic */ Activity e;
    private final /* synthetic */ Bundle f;
    private final /* synthetic */ sh1.b g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e51(sh1.b bVar, Activity activity, Bundle bundle) {
        super(sh1.this);
        this.g = bVar;
        this.e = activity;
        this.f = bundle;
    }

    @Override // defpackage.sh1.a
    public final void a() throws RemoteException {
        sh1.this.g.onActivityCreated(ar0.W3(this.e), this.f, this.b);
    }
}
