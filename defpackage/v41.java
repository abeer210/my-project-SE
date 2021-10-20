package defpackage;

import android.os.RemoteException;
import defpackage.sh1;

/* renamed from: v41  reason: default package */
public final class v41 extends sh1.a {
    private final /* synthetic */ int e = 5;
    private final /* synthetic */ String f;
    private final /* synthetic */ Object g;
    private final /* synthetic */ Object h;
    private final /* synthetic */ Object i;
    private final /* synthetic */ sh1 j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v41(sh1 sh1, boolean z, int i2, String str, Object obj, Object obj2, Object obj3) {
        super(false);
        this.j = sh1;
        this.f = str;
        this.g = obj;
        this.h = null;
        this.i = null;
    }

    @Override // defpackage.sh1.a
    public final void a() throws RemoteException {
        this.j.g.logHealthData(this.e, this.f, ar0.W3(this.g), ar0.W3(this.h), ar0.W3(this.i));
    }
}
