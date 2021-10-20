package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.f;
import com.google.android.gms.location.b0;

/* renamed from: l11  reason: default package */
public final class l11 extends m11 {
    private final /* synthetic */ b0 s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l11(j11 j11, f fVar, b0 b0Var) {
        super(fVar);
        this.s = b0Var;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.common.api.a$b] */
    @Override // com.google.android.gms.common.api.internal.d
    public final /* synthetic */ void u(d21 d21) throws RemoteException {
        d21.u0(this.s, this);
    }
}
