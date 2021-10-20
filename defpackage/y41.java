package defpackage;

import android.os.RemoteException;
import defpackage.sh1;

/* renamed from: y41  reason: default package */
public final class y41 extends sh1.a {
    private final /* synthetic */ boolean e;
    private final /* synthetic */ sh1 f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y41(sh1 sh1, boolean z) {
        super(sh1);
        this.f = sh1;
        this.e = z;
    }

    @Override // defpackage.sh1.a
    public final void a() throws RemoteException {
        this.f.g.setDataCollectionEnabled(this.e);
    }
}
