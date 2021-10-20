package defpackage;

import android.os.RemoteException;
import defpackage.sh1;

/* renamed from: k41  reason: default package */
public final class k41 extends sh1.a {
    private final /* synthetic */ String e;
    private final /* synthetic */ sh1 f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k41(sh1 sh1, String str) {
        super(sh1);
        this.f = sh1;
        this.e = str;
    }

    @Override // defpackage.sh1.a
    public final void a() throws RemoteException {
        this.f.g.setUserId(this.e, this.a);
    }
}
