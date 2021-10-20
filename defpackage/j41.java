package defpackage;

import android.app.Activity;
import android.os.RemoteException;
import defpackage.sh1;

/* renamed from: j41  reason: default package */
public final class j41 extends sh1.a {
    private final /* synthetic */ Activity e;
    private final /* synthetic */ String f;
    private final /* synthetic */ String g;
    private final /* synthetic */ sh1 h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j41(sh1 sh1, Activity activity, String str, String str2) {
        super(sh1);
        this.h = sh1;
        this.e = activity;
        this.f = str;
        this.g = str2;
    }

    @Override // defpackage.sh1.a
    public final void a() throws RemoteException {
        this.h.g.setCurrentScreen(ar0.W3(this.e), this.f, this.g, this.a);
    }
}
