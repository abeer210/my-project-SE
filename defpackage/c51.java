package defpackage;

import android.os.RemoteException;
import defpackage.sh1;

/* renamed from: c51  reason: default package */
public final class c51 extends sh1.a {
    private final /* synthetic */ String e;
    private final /* synthetic */ String f;
    private final /* synthetic */ Object g;
    private final /* synthetic */ boolean h;
    private final /* synthetic */ sh1 i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c51(sh1 sh1, String str, String str2, Object obj, boolean z) {
        super(sh1);
        this.i = sh1;
        this.e = str;
        this.f = str2;
        this.g = obj;
        this.h = z;
    }

    @Override // defpackage.sh1.a
    public final void a() throws RemoteException {
        this.i.g.setUserProperty(this.e, this.f, ar0.W3(this.g), this.h, this.a);
    }
}
