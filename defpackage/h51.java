package defpackage;

import android.app.Activity;
import android.os.RemoteException;
import defpackage.sh1;

/* renamed from: h51  reason: default package */
public final class h51 extends sh1.a {
    private final /* synthetic */ Activity e;
    private final /* synthetic */ rf1 f;
    private final /* synthetic */ sh1.b g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h51(sh1.b bVar, Activity activity, rf1 rf1) {
        super(sh1.this);
        this.g = bVar;
        this.e = activity;
        this.f = rf1;
    }

    @Override // defpackage.sh1.a
    public final void a() throws RemoteException {
        sh1.this.g.onActivitySaveInstanceState(ar0.W3(this.e), this.f, this.b);
    }
}
