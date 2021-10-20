package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public abstract class p2 extends LifecycleCallback implements DialogInterface.OnCancelListener {
    public volatile boolean b;
    public final AtomicReference<r2> c;
    private final Handler d;
    public final yo0 e;

    public p2(j jVar) {
        this(jVar, yo0.q());
    }

    private static int l(r2 r2Var) {
        if (r2Var == null) {
            return -1;
        }
        return r2Var.b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0069  */
    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void e(int i, int i2, Intent intent) {
        r2 r2Var = this.c.get();
        boolean z = true;
        if (i == 1) {
            if (i2 != -1) {
                if (i2 == 0) {
                    int i3 = 13;
                    if (intent != null) {
                        i3 = intent.getIntExtra(C0201.m82(28567), 13);
                    }
                    r2 r2Var2 = new r2(new vo0(i3, null, r2Var.a().toString()), l(r2Var));
                    this.c.set(r2Var2);
                    r2Var = r2Var2;
                }
            }
            if (z) {
            }
        } else if (i == 2) {
            int i4 = this.e.i(b());
            if (i4 != 0) {
                z = false;
            }
            if (r2Var != null) {
                if (r2Var.a().o() == 18 && i4 == 18) {
                    return;
                }
                if (z) {
                    p();
                    return;
                } else if (r2Var != null) {
                    m(r2Var.a(), r2Var.b());
                    return;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        z = false;
        if (z) {
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void f(Bundle bundle) {
        super.f(bundle);
        if (bundle != null) {
            this.c.set(bundle.getBoolean(C0201.m82(28568), false) ? new r2(new vo0(bundle.getInt(C0201.m82(28569)), (PendingIntent) bundle.getParcelable(C0201.m82(28570))), bundle.getInt(C0201.m82(28571), -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void i(Bundle bundle) {
        super.i(bundle);
        r2 r2Var = this.c.get();
        if (r2Var != null) {
            bundle.putBoolean(C0201.m82(28572), true);
            bundle.putInt(C0201.m82(28573), r2Var.b());
            bundle.putInt(C0201.m82(28574), r2Var.a().o());
            bundle.putParcelable(C0201.m82(28575), r2Var.a().r());
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void j() {
        super.j();
        this.b = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void k() {
        super.k();
        this.b = false;
    }

    public abstract void m(vo0 vo0, int i);

    public final void n(vo0 vo0, int i) {
        r2 r2Var = new r2(vo0, i);
        if (this.c.compareAndSet(null, r2Var)) {
            this.d.post(new q2(this, r2Var));
        }
    }

    public abstract void o();

    public void onCancel(DialogInterface dialogInterface) {
        m(new vo0(13, null), l(this.c.get()));
        p();
    }

    public final void p() {
        this.c.set(null);
        o();
    }

    private p2(j jVar, yo0 yo0) {
        super(jVar);
        this.c = new AtomicReference<>(null);
        this.d = new et0(Looper.getMainLooper());
        this.e = yo0;
    }
}
