package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.f;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class j implements Handler.Callback {
    private final a a;
    private final ArrayList<f.b> b = new ArrayList<>();
    private final ArrayList<f.b> c = new ArrayList<>();
    private final ArrayList<f.c> d = new ArrayList<>();
    private volatile boolean e = false;
    private final AtomicInteger f = new AtomicInteger(0);
    private boolean g = false;
    private final Handler h;
    private final Object i = new Object();

    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public interface a {
        boolean isConnected();

        Bundle u();
    }

    public j(Looper looper, a aVar) {
        this.a = aVar;
        this.h = new et0(looper, this);
    }

    public final void a() {
        this.e = false;
        this.f.incrementAndGet();
    }

    public final void b() {
        this.e = true;
    }

    public final void c(vo0 vo0) {
        u.e(this.h, C0201.m82(7768));
        this.h.removeMessages(1);
        synchronized (this.i) {
            ArrayList arrayList = new ArrayList(this.d);
            int i2 = this.f.get();
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                f.c cVar = (f.c) obj;
                if (this.e) {
                    if (this.f.get() == i2) {
                        if (this.d.contains(cVar)) {
                            cVar.onConnectionFailed(vo0);
                        }
                    }
                }
                return;
            }
        }
    }

    public final void d(Bundle bundle) {
        u.e(this.h, C0201.m82(7769));
        synchronized (this.i) {
            boolean z = true;
            u.n(!this.g);
            this.h.removeMessages(1);
            this.g = true;
            if (this.c.size() != 0) {
                z = false;
            }
            u.n(z);
            ArrayList arrayList = new ArrayList(this.b);
            int i2 = this.f.get();
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                f.b bVar = (f.b) obj;
                if (!this.e || !this.a.isConnected() || this.f.get() != i2) {
                    break;
                } else if (!this.c.contains(bVar)) {
                    bVar.onConnected(bundle);
                }
            }
            this.c.clear();
            this.g = false;
        }
    }

    public final void e(int i2) {
        u.e(this.h, C0201.m82(7770));
        this.h.removeMessages(1);
        synchronized (this.i) {
            this.g = true;
            ArrayList arrayList = new ArrayList(this.b);
            int i3 = this.f.get();
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                f.b bVar = (f.b) obj;
                if (!this.e || this.f.get() != i3) {
                    break;
                } else if (this.b.contains(bVar)) {
                    bVar.onConnectionSuspended(i2);
                }
            }
            this.c.clear();
            this.g = false;
        }
    }

    public final void f(f.b bVar) {
        u.k(bVar);
        synchronized (this.i) {
            if (this.b.contains(bVar)) {
                String r1 = C0201.m82(7771);
                String valueOf = String.valueOf(bVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62);
                sb.append(C0201.m82(7772));
                sb.append(valueOf);
                sb.append(C0201.m82(7773));
                Log.w(r1, sb.toString());
            } else {
                this.b.add(bVar);
            }
        }
        if (this.a.isConnected()) {
            Handler handler = this.h;
            handler.sendMessage(handler.obtainMessage(1, bVar));
        }
    }

    public final void g(f.c cVar) {
        u.k(cVar);
        synchronized (this.i) {
            if (this.d.contains(cVar)) {
                String r1 = C0201.m82(7774);
                String valueOf = String.valueOf(cVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 67);
                sb.append(C0201.m82(7775));
                sb.append(valueOf);
                sb.append(C0201.m82(7776));
                Log.w(r1, sb.toString());
            } else {
                this.d.add(cVar);
            }
        }
    }

    public final void h(f.c cVar) {
        u.k(cVar);
        synchronized (this.i) {
            if (!this.d.remove(cVar)) {
                String r1 = C0201.m82(7777);
                String valueOf = String.valueOf(cVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57);
                sb.append(C0201.m82(7778));
                sb.append(valueOf);
                sb.append(C0201.m82(7779));
                Log.w(r1, sb.toString());
            }
        }
    }

    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 1) {
            f.b bVar = (f.b) message.obj;
            synchronized (this.i) {
                if (this.e && this.a.isConnected() && this.b.contains(bVar)) {
                    bVar.onConnected(this.a.u());
                }
            }
            return true;
        }
        String r5 = C0201.m82(7780);
        StringBuilder sb = new StringBuilder(45);
        sb.append(C0201.m82(7781));
        sb.append(i2);
        Log.wtf(r5, sb.toString(), new Exception());
        return false;
    }
}
