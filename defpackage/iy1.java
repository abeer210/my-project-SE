package defpackage;

import android.os.IBinder;

/* renamed from: iy1  reason: default package */
public final /* synthetic */ class iy1 implements IBinder.DeathRecipient {
    private final qy1 a;

    public iy1(qy1 qy1) {
        this.a = qy1;
    }

    public final void binderDied() {
        this.a.k();
    }
}
