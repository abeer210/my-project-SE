package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.e;

/* renamed from: sp0  reason: default package */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class sp0 extends mp0 {
    private final e<Status> a;

    public sp0(e<Status> eVar) {
        this.a = eVar;
    }

    @Override // defpackage.wp0
    public final void L0(int i) throws RemoteException {
        this.a.a(new Status(i));
    }
}
