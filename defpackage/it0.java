package defpackage;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: it0  reason: default package */
public final class it0 extends ContentObserver {
    private final /* synthetic */ ht0 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public it0(ht0 ht0, Handler handler) {
        super(null);
        this.a = ht0;
    }

    public final void onChange(boolean z) {
        this.a.d();
        ht0.b(this.a);
    }
}
