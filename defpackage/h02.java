package defpackage;

import android.os.RemoteException;
import com.google.android.play.core.common.b;
import vigqyno.C0201;

/* renamed from: h02  reason: default package */
public final class h02 extends hy1 {
    public final /* synthetic */ d12 b;
    public final /* synthetic */ k02 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h02(k02 k02, d12 d12, d12 d122) {
        super(d12);
        this.c = k02;
        this.b = d122;
    }

    @Override // defpackage.hy1
    public final void a() {
        try {
            this.c.a.f().p(this.c.b, b.a(), new j02(this.c, this.b));
        } catch (RemoteException e) {
            k02.c.d(e, C0201.m82(38346), this.c.b);
            this.b.d(new RuntimeException(e));
        }
    }
}
