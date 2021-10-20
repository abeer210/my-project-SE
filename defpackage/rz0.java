package defpackage;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.api.m;
import vigqyno.C0201;

/* renamed from: rz0  reason: default package */
public final class rz0 extends d<Status, vz0> {
    private final so0 s;

    public rz0(so0 so0, f fVar) {
        super(no0.o, fVar);
        this.s = so0;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ m f(Status status) {
        return status;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.common.api.a$b] */
    @Override // com.google.android.gms.common.api.internal.d
    public final /* synthetic */ void u(vz0 vz0) throws RemoteException {
        vz0 vz02 = vz0;
        uz0 uz0 = new uz0(this);
        try {
            so0 so0 = this.s;
            if (so0.j != null && so0.i.k.length == 0) {
                so0.i.k = so0.j.a();
            }
            if (so0.k != null && so0.i.u.length == 0) {
                so0.i.u = so0.k.a();
            }
            sz0 sz0 = so0.i;
            int c = sz0.c();
            byte[] bArr = new byte[c];
            dz0.b(sz0, bArr, 0, c);
            so0.b = bArr;
            ((zz0) vz02.E()).y0(uz0, this.s);
        } catch (RuntimeException e) {
            Log.e(C0201.m82(15510), C0201.m82(15511), e);
            A(new Status(10, C0201.m82(15512)));
        }
    }
}
