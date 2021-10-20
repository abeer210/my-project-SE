package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import vigqyno.C0201;

/* renamed from: in  reason: default package */
/* compiled from: RequestTracker */
public class in {
    private final Set<xn> a = Collections.newSetFromMap(new WeakHashMap());
    private final List<xn> b = new ArrayList();
    private boolean c;

    public boolean a(xn xnVar) {
        boolean z = true;
        if (xnVar == null) {
            return true;
        }
        boolean remove = this.a.remove(xnVar);
        if (!this.b.remove(xnVar) && !remove) {
            z = false;
        }
        if (z) {
            xnVar.clear();
        }
        return z;
    }

    public void b() {
        for (xn xnVar : fp.i(this.a)) {
            a(xnVar);
        }
        this.b.clear();
    }

    public void c() {
        this.c = true;
        for (xn xnVar : fp.i(this.a)) {
            if (xnVar.isRunning() || xnVar.k()) {
                xnVar.clear();
                this.b.add(xnVar);
            }
        }
    }

    public void d() {
        this.c = true;
        for (xn xnVar : fp.i(this.a)) {
            if (xnVar.isRunning()) {
                xnVar.f();
                this.b.add(xnVar);
            }
        }
    }

    public void e() {
        for (xn xnVar : fp.i(this.a)) {
            if (!xnVar.k() && !xnVar.h()) {
                xnVar.clear();
                if (!this.c) {
                    xnVar.d();
                } else {
                    this.b.add(xnVar);
                }
            }
        }
    }

    public void f() {
        this.c = false;
        for (xn xnVar : fp.i(this.a)) {
            if (!xnVar.k() && !xnVar.isRunning()) {
                xnVar.d();
            }
        }
        this.b.clear();
    }

    public void g(xn xnVar) {
        this.a.add(xnVar);
        if (!this.c) {
            xnVar.d();
            return;
        }
        xnVar.clear();
        String r1 = C0201.m82(22337);
        if (Log.isLoggable(r1, 2)) {
            Log.v(r1, C0201.m82(22338));
        }
        this.b.add(xnVar);
    }

    public String toString() {
        return super.toString() + C0201.m82(22339) + this.a.size() + C0201.m82(22340) + this.c + C0201.m82(22341);
    }
}
