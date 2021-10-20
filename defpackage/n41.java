package defpackage;

import android.os.RemoteException;
import defpackage.sh1;

/* renamed from: n41  reason: default package */
public final class n41 extends sh1.a {
    private final /* synthetic */ long e;
    private final /* synthetic */ sh1 f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n41(sh1 sh1, long j) {
        super(sh1);
        this.f = sh1;
        this.e = j;
    }

    @Override // defpackage.sh1.a
    public final void a() throws RemoteException {
        this.f.g.setMinimumSessionDuration(this.e);
    }
}
