package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.internal.k;
import java.util.HashMap;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class n0 extends k implements Handler.Callback {
    private final HashMap<k.a, p0> c = new HashMap<>();
    private final Context d;
    private final Handler e;
    private final aq0 f;
    private final long g;
    private final long h;

    public n0(Context context) {
        this.d = context.getApplicationContext();
        this.e = new k01(context.getMainLooper(), this);
        this.f = aq0.b();
        this.g = 5000;
        this.h = 300000;
    }

    @Override // com.google.android.gms.common.internal.k
    public final boolean c(k.a aVar, ServiceConnection serviceConnection, String str) {
        boolean d2;
        u.l(serviceConnection, C0201.m82(6239));
        synchronized (this.c) {
            p0 p0Var = this.c.get(aVar);
            if (p0Var == null) {
                p0Var = new p0(this, aVar);
                p0Var.e(serviceConnection, serviceConnection, str);
                p0Var.h(str);
                this.c.put(aVar, p0Var);
            } else {
                this.e.removeMessages(0, aVar);
                if (!p0Var.g(serviceConnection)) {
                    p0Var.e(serviceConnection, serviceConnection, str);
                    int c2 = p0Var.c();
                    if (c2 == 1) {
                        serviceConnection.onServiceConnected(p0Var.b(), p0Var.a());
                    } else if (c2 == 2) {
                        p0Var.h(str);
                    }
                } else {
                    String valueOf = String.valueOf(aVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 81);
                    sb.append(C0201.m82(6240));
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            }
            d2 = p0Var.d();
        }
        return d2;
    }

    @Override // com.google.android.gms.common.internal.k
    public final void d(k.a aVar, ServiceConnection serviceConnection, String str) {
        u.l(serviceConnection, C0201.m82(6241));
        synchronized (this.c) {
            p0 p0Var = this.c.get(aVar);
            if (p0Var == null) {
                String valueOf = String.valueOf(aVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
                sb.append(C0201.m82(6243));
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (p0Var.g(serviceConnection)) {
                p0Var.f(serviceConnection, str);
                if (p0Var.j()) {
                    this.e.sendMessageDelayed(this.e.obtainMessage(0, aVar), this.g);
                }
            } else {
                String valueOf2 = String.valueOf(aVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 76);
                sb2.append(C0201.m82(6242));
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.c) {
                k.a aVar = (k.a) message.obj;
                p0 p0Var = this.c.get(aVar);
                if (p0Var != null && p0Var.j()) {
                    if (p0Var.d()) {
                        p0Var.i(C0201.m82(6247));
                    }
                    this.c.remove(aVar);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            synchronized (this.c) {
                k.a aVar2 = (k.a) message.obj;
                p0 p0Var2 = this.c.get(aVar2);
                if (p0Var2 != null && p0Var2.c() == 3) {
                    String r3 = C0201.m82(6244);
                    String valueOf = String.valueOf(aVar2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append(C0201.m82(6245));
                    sb.append(valueOf);
                    Log.e(r3, sb.toString(), new Exception());
                    ComponentName b = p0Var2.b();
                    if (b == null) {
                        b = aVar2.a();
                    }
                    if (b == null) {
                        b = new ComponentName(aVar2.b(), C0201.m82(6246));
                    }
                    p0Var2.onServiceDisconnected(b);
                }
            }
            return true;
        }
    }
}
