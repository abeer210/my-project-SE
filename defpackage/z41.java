package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import defpackage.sh1;

/* renamed from: z41  reason: default package */
public final class z41 extends sh1.a {
    private final /* synthetic */ Long e;
    private final /* synthetic */ String f;
    private final /* synthetic */ String g;
    private final /* synthetic */ Bundle h;
    private final /* synthetic */ boolean i;
    private final /* synthetic */ boolean j;
    private final /* synthetic */ sh1 k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z41(sh1 sh1, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(sh1);
        this.k = sh1;
        this.e = l;
        this.f = str;
        this.g = str2;
        this.h = bundle;
        this.i = z;
        this.j = z2;
    }

    @Override // defpackage.sh1.a
    public final void a() throws RemoteException {
        Long l = this.e;
        this.k.g.logEvent(this.f, this.g, this.h, this.i, this.j, l == null ? this.a : l.longValue());
    }
}
