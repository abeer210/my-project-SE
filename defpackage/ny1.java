package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: ny1  reason: default package */
public final class ny1 extends hy1 {
    public final /* synthetic */ IBinder b;
    public final /* synthetic */ py1 c;

    public ny1(py1 py1, IBinder iBinder) {
        this.c = py1;
        this.b = iBinder;
    }

    @Override // defpackage.hy1
    public final void a() {
        qy1 qy1 = this.c.a;
        qy1.k = (IInterface) qy1.g.a(this.b);
        qy1.n(this.c.a);
        this.c.a.e = false;
        for (Runnable runnable : this.c.a.d) {
            runnable.run();
        }
        this.c.a.d.clear();
    }
}
