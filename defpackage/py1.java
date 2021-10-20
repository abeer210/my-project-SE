package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import vigqyno.C0201;

/* renamed from: py1  reason: default package */
public final class py1 implements ServiceConnection {
    public final /* synthetic */ qy1 a;

    public /* synthetic */ py1(qy1 qy1) {
        this.a = qy1;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a.b.f(C0201.m82(32686), componentName);
        this.a.h(new ny1(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.b.f(C0201.m82(32687), componentName);
        this.a.h(new oy1(this));
    }
}
