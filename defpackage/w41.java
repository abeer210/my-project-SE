package defpackage;

import android.os.RemoteException;
import defpackage.sh1;

/* renamed from: w41  reason: default package */
public final class w41 extends sh1.a {
    private final /* synthetic */ String e;
    private final /* synthetic */ String f;
    private final /* synthetic */ boolean g;
    private final /* synthetic */ rf1 h;
    private final /* synthetic */ sh1 i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w41(sh1 sh1, String str, String str2, boolean z, rf1 rf1) {
        super(sh1);
        this.i = sh1;
        this.e = str;
        this.f = str2;
        this.g = z;
        this.h = rf1;
    }

    @Override // defpackage.sh1.a
    public final void a() throws RemoteException {
        this.i.g.getUserProperties(this.e, this.f, this.g, this.h);
    }

    @Override // defpackage.sh1.a
    public final void b() {
        this.h.q2(null);
    }
}
