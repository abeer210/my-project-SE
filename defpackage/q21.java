package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.m;
import com.google.android.gms.location.i;
import com.google.android.gms.location.j;
import com.google.android.gms.location.l;

/* renamed from: q21  reason: default package */
public final class q21 extends i.a<l> {
    private final /* synthetic */ j s;
    private final /* synthetic */ String t = null;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q21(p21 p21, f fVar, j jVar, String str) {
        super(fVar);
        this.s = jVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ m f(Status status) {
        return new l(status);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.common.api.a$b] */
    @Override // com.google.android.gms.common.api.internal.d
    public final /* synthetic */ void u(d21 d21) throws RemoteException {
        d21.t0(this.s, this, this.t);
    }
}
