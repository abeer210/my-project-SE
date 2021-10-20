package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: qy1  reason: default package */
public final class qy1<T extends IInterface> {
    private static final Map<String, Handler> l = new HashMap();
    private final Context a;
    private final gy1 b;
    private final String c;
    private final List<hy1> d = new ArrayList();
    private boolean e;
    private final Intent f;
    private final my1<T> g;
    private final WeakReference<ly1> h;
    private final IBinder.DeathRecipient i = new iy1(this);
    private ServiceConnection j;
    private T k;

    public qy1(Context context, gy1 gy1, String str, Intent intent, my1<T> my1) {
        this.a = context;
        this.b = gy1;
        this.c = str;
        this.f = intent;
        this.g = my1;
        this.h = new WeakReference<>(null);
    }

    public static /* synthetic */ void e(qy1 qy1, hy1 hy1) {
        if (qy1.k == null && !qy1.e) {
            qy1.b.f(C0201.m82(20912), new Object[0]);
            qy1.d.add(hy1);
            py1 py1 = new py1(qy1);
            qy1.j = py1;
            qy1.e = true;
            if (!qy1.a.bindService(qy1.f, py1, 1)) {
                qy1.b.f(C0201.m82(20913), new Object[0]);
                qy1.e = false;
                List<hy1> list = qy1.d;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    d12<?> b2 = list.get(i2).b();
                    if (b2 != null) {
                        b2.d(new ry1());
                    }
                }
                qy1.d.clear();
            }
        } else if (qy1.e) {
            qy1.b.f(C0201.m82(20914), new Object[0]);
            qy1.d.add(hy1);
        } else {
            hy1.run();
        }
    }

    /* access modifiers changed from: private */
    public final void h(hy1 hy1) {
        Handler handler;
        synchronized (l) {
            if (!l.containsKey(this.c)) {
                HandlerThread handlerThread = new HandlerThread(this.c, 10);
                handlerThread.start();
                l.put(this.c, new Handler(handlerThread.getLooper()));
            }
            handler = l.get(this.c);
        }
        handler.post(hy1);
    }

    public static /* synthetic */ void n(qy1 qy1) {
        qy1.b.f(C0201.m82(20915), new Object[0]);
        try {
            qy1.k.asBinder().linkToDeath(qy1.i, 0);
        } catch (RemoteException e2) {
            qy1.b.d(e2, C0201.m82(20916), new Object[0]);
        }
    }

    public static /* synthetic */ void p(qy1 qy1) {
        qy1.b.f(C0201.m82(20917), new Object[0]);
        qy1.k.asBinder().unlinkToDeath(qy1.i, 0);
    }

    public final void b() {
        h(new ky1(this));
    }

    public final void c(hy1 hy1) {
        h(new jy1(this, hy1.b(), hy1));
    }

    public final T f() {
        return this.k;
    }

    public final /* bridge */ /* synthetic */ void k() {
        this.b.f(C0201.m82(20918), new Object[0]);
        ly1 ly1 = this.h.get();
        if (ly1 == null) {
            this.b.f(C0201.m82(20919), this.c);
            List<hy1> list = this.d;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                d12<?> b2 = list.get(i2).b();
                if (b2 != null) {
                    b2.d(Build.VERSION.SDK_INT < 15 ? new RemoteException() : new RemoteException(String.valueOf(this.c).concat(C0201.m82(20920))));
                }
            }
            this.d.clear();
            return;
        }
        this.b.f(C0201.m82(20921), new Object[0]);
        ly1.a();
    }
}
