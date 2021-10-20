package defpackage;

import android.app.Activity;
import android.os.RemoteException;
import defpackage.sh1;

/* renamed from: j51  reason: default package */
public final class j51 extends sh1.a {
    private final /* synthetic */ Activity e;
    private final /* synthetic */ sh1.b f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j51(sh1.b bVar, Activity activity) {
        super(sh1.this);
        this.f = bVar;
        this.e = activity;
    }

    @Override // defpackage.sh1.a
    public final void a() throws RemoteException {
        sh1.this.g.onActivityDestroyed(ar0.W3(this.e), this.b);
    }
}
