package defpackage;

import android.os.RemoteException;
import defpackage.sh1;

/* renamed from: t41  reason: default package */
public final class t41 extends sh1.a {
    private final /* synthetic */ rf1 e;
    private final /* synthetic */ sh1 f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t41(sh1 sh1, rf1 rf1) {
        super(sh1);
        this.f = sh1;
        this.e = rf1;
    }

    @Override // defpackage.sh1.a
    public final void a() throws RemoteException {
        this.f.g.getCurrentScreenClass(this.e);
    }

    @Override // defpackage.sh1.a
    public final void b() {
        this.e.q2(null);
    }
}
