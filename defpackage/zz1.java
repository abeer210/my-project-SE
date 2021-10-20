package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: zz1  reason: default package */
public abstract class zz1<StateT> {
    public final gy1 a;
    private final IntentFilter b;
    private final Context c;
    public final Set<xz1<StateT>> d = new HashSet();
    private yz1 e = null;
    private volatile boolean f = false;

    public zz1(gy1 gy1, IntentFilter intentFilter, Context context) {
        this.a = gy1;
        this.b = intentFilter;
        this.c = l02.a(context);
    }

    private final void e() {
        yz1 yz1;
        if ((this.f || !this.d.isEmpty()) && this.e == null) {
            yz1 yz12 = new yz1(this);
            this.e = yz12;
            this.c.registerReceiver(yz12, this.b);
        }
        if (!this.f && this.d.isEmpty() && (yz1 = this.e) != null) {
            this.c.unregisterReceiver(yz1);
            this.e = null;
        }
    }

    public abstract void a(Context context, Intent intent);

    public final synchronized void b(StateT statet) {
        Iterator it = new HashSet(this.d).iterator();
        while (it.hasNext()) {
            ((xz1) it.next()).a(statet);
        }
    }

    public final synchronized void c(boolean z) {
        this.f = z;
        e();
    }

    public final synchronized boolean d() {
        return this.e != null;
    }
}
