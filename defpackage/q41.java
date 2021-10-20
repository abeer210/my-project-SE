package defpackage;

import android.os.RemoteException;
import defpackage.sh1;

/* renamed from: q41  reason: default package */
public final class q41 extends sh1.a {
    private final /* synthetic */ rf1 e;
    private final /* synthetic */ sh1 f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q41(sh1 sh1, rf1 rf1) {
        super(sh1);
        this.f = sh1;
        this.e = rf1;
    }

    @Override // defpackage.sh1.a
    public final void a() throws RemoteException {
        this.f.g.getGmpAppId(this.e);
    }

    @Override // defpackage.sh1.a
    public final void b() {
        this.e.q2(null);
    }
}
