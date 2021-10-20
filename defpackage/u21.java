package defpackage;

import android.os.DeadObjectException;

/* renamed from: u21  reason: default package */
public final class u21 implements o21<s11> {
    private final /* synthetic */ t21 a;

    public u21(t21 t21) {
        this.a = t21;
    }

    @Override // defpackage.o21
    public final void a() {
        this.a.w();
    }

    /* Return type fixed from 'android.os.IInterface' to match base method */
    @Override // defpackage.o21
    public final /* synthetic */ s11 getService() throws DeadObjectException {
        return (s11) this.a.E();
    }
}
