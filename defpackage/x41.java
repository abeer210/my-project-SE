package defpackage;

import android.os.RemoteException;
import defpackage.sh1;

/* renamed from: x41  reason: default package */
public final class x41 extends sh1.a {
    private final /* synthetic */ String e;
    private final /* synthetic */ rf1 f;
    private final /* synthetic */ sh1 g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x41(sh1 sh1, String str, rf1 rf1) {
        super(sh1);
        this.g = sh1;
        this.e = str;
        this.f = rf1;
    }

    @Override // defpackage.sh1.a
    public final void a() throws RemoteException {
        this.g.g.getMaxUserProperties(this.e, this.f);
    }

    @Override // defpackage.sh1.a
    public final void b() {
        this.f.q2(null);
    }
}
