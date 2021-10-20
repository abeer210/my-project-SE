package defpackage;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.location.f;

/* renamed from: k11  reason: default package */
public final class k11 extends m11 {
    private final /* synthetic */ f s;
    private final /* synthetic */ PendingIntent t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k11(j11 j11, com.google.android.gms.common.api.f fVar, f fVar2, PendingIntent pendingIntent) {
        super(fVar);
        this.s = fVar2;
        this.t = pendingIntent;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.common.api.a$b] */
    @Override // com.google.android.gms.common.api.internal.d
    public final /* synthetic */ void u(d21 d21) throws RemoteException {
        d21.s0(this.s, this.t, this);
    }
}
