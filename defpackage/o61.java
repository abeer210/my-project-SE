package defpackage;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: o61  reason: default package */
public final class o61 extends ContentObserver {
    private final /* synthetic */ m61 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o61(m61 m61, Handler handler) {
        super(null);
        this.a = m61;
    }

    public final void onChange(boolean z) {
        this.a.d();
    }
}
