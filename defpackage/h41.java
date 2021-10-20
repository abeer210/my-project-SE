package defpackage;

import android.os.RemoteException;
import defpackage.sh1;

/* renamed from: h41  reason: default package */
public final class h41 extends sh1.a {
    private final /* synthetic */ String e;
    private final /* synthetic */ String f;
    private final /* synthetic */ rf1 g;
    private final /* synthetic */ sh1 h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h41(sh1 sh1, String str, String str2, rf1 rf1) {
        super(sh1);
        this.h = sh1;
        this.e = str;
        this.f = str2;
        this.g = rf1;
    }

    @Override // defpackage.sh1.a
    public final void a() throws RemoteException {
        this.h.g.getConditionalUserProperties(this.e, this.f, this.g);
    }

    @Override // defpackage.sh1.a
    public final void b() {
        this.g.q2(null);
    }
}
