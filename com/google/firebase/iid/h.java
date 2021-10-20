package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.u;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

public final class h implements ServiceConnection {
    public int a;
    public final Messenger b;
    public k c;
    public final Queue<m<?>> d;
    public final SparseArray<m<?>> e;
    public final /* synthetic */ f f;

    private h(f fVar) {
        this.f = fVar;
        this.a = 0;
        this.b = new Messenger(new p01(Looper.getMainLooper(), new g(this)));
        this.d = new ArrayDeque();
        this.e = new SparseArray<>();
    }

    private final void f() {
        f.e(this.f).execute(new i(this));
    }

    public final synchronized void a(int i) {
        m<?> mVar = this.e.get(i);
        if (mVar != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i);
            Log.w("MessengerIpcClient", sb.toString());
            this.e.remove(i);
            mVar.b(new p(3, "Timed out waiting for response"));
            g();
        }
    }

    public final synchronized void b(int i, String str) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            Log.d("MessengerIpcClient", valueOf.length() != 0 ? "Disconnected: ".concat(valueOf) : new String("Disconnected: "));
        }
        int i2 = this.a;
        if (i2 == 0) {
            throw new IllegalStateException();
        } else if (i2 == 1 || i2 == 2) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.a = 4;
            aq0.b().c(f.a(this.f), this);
            p pVar = new p(i, str);
            for (m<?> mVar : this.d) {
                mVar.b(pVar);
            }
            this.d.clear();
            for (int i3 = 0; i3 < this.e.size(); i3++) {
                this.e.valueAt(i3).b(pVar);
            }
            this.e.clear();
        } else if (i2 == 3) {
            this.a = 4;
        } else if (i2 != 4) {
            int i4 = this.a;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Unknown state: ");
            sb.append(i4);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0052, code lost:
        r5 = r5.getData();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005d, code lost:
        if (r5.getBoolean("unsupported", false) == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005f, code lost:
        r1.b(new com.google.firebase.iid.p(4, "Not supported by GmsCore"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006b, code lost:
        r1.d(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006e, code lost:
        return true;
     */
    public final boolean c(Message message) {
        int i = message.arg1;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            StringBuilder sb = new StringBuilder(41);
            sb.append("Received response to request: ");
            sb.append(i);
            Log.d("MessengerIpcClient", sb.toString());
        }
        synchronized (this) {
            m<?> mVar = this.e.get(i);
            if (mVar == null) {
                StringBuilder sb2 = new StringBuilder(50);
                sb2.append("Received response for unknown request: ");
                sb2.append(i);
                Log.w("MessengerIpcClient", sb2.toString());
                return true;
            }
            this.e.remove(i);
            g();
        }
    }

    public final synchronized void d() {
        if (this.a == 1) {
            b(1, "Timed out while binding");
        }
    }

    public final synchronized boolean e(m mVar) {
        int i = this.a;
        if (i == 0) {
            this.d.add(mVar);
            u.n(this.a == 0);
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.a = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            if (!aq0.b().a(f.a(this.f), intent, this, 1)) {
                b(0, "Unable to bind to service");
            } else {
                f.e(this.f).schedule(new j(this), 30, TimeUnit.SECONDS);
            }
            return true;
        } else if (i == 1) {
            this.d.add(mVar);
            return true;
        } else if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    int i2 = this.a;
                    StringBuilder sb = new StringBuilder(26);
                    sb.append("Unknown state: ");
                    sb.append(i2);
                    throw new IllegalStateException(sb.toString());
                }
            }
            return false;
        } else {
            this.d.add(mVar);
            f();
            return true;
        }
    }

    public final synchronized void g() {
        if (this.a == 2 && this.d.isEmpty() && this.e.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.a = 3;
            aq0.b().c(f.a(this.f), this);
        }
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        if (iBinder == null) {
            b(0, "Null service connection");
            return;
        }
        try {
            this.c = new k(iBinder);
            this.a = 2;
            f();
        } catch (RemoteException e2) {
            b(0, e2.getMessage());
        }
    }

    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        b(2, "Service disconnected");
    }
}
