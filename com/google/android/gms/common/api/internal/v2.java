package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.u;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class v2 implements n1 {
    private final Context a;
    private final r0 b;
    private final Looper c;
    private final a1 d;
    private final a1 e;
    private final Map<a.c<?>, a1> f;
    private final Set<p> g = Collections.newSetFromMap(new WeakHashMap());
    private final a.f h;
    private Bundle i;
    private vo0 j = null;
    private vo0 k = null;
    private boolean l = false;
    private final Lock m;
    private int n = 0;

    private v2(Context context, r0 r0Var, Lock lock, Looper looper, zo0 zo0, Map<a.c<?>, a.f> map, Map<a.c<?>, a.f> map2, e eVar, a.AbstractC0054a<? extends qs1, bs1> aVar, a.f fVar, ArrayList<u2> arrayList, ArrayList<u2> arrayList2, Map<a<?>, Boolean> map3, Map<a<?>, Boolean> map4) {
        this.a = context;
        this.b = r0Var;
        this.m = lock;
        this.c = looper;
        this.h = fVar;
        this.d = new a1(context, r0Var, lock, looper, zo0, map2, null, map4, null, arrayList2, new x2(this, null));
        this.e = new a1(context, this.b, lock, looper, zo0, map, eVar, map3, aVar, arrayList, new z2(this, null));
        r0 r0Var2 = new r0();
        for (a.c<?> cVar : map2.keySet()) {
            r0Var2.put(cVar, this.d);
        }
        for (a.c<?> cVar2 : map.keySet()) {
            r0Var2.put(cVar2, this.e);
        }
        this.f = Collections.unmodifiableMap(r0Var2);
    }

    /* access modifiers changed from: private */
    public final void A() {
        vo0 vo0;
        if (v(this.j)) {
            if (v(this.k) || C()) {
                int i2 = this.n;
                if (i2 != 1) {
                    if (i2 != 2) {
                        Log.wtf(C0201.m82(14988), C0201.m82(14989), new AssertionError());
                        this.n = 0;
                        return;
                    }
                    this.b.b(this.i);
                }
                B();
                this.n = 0;
                return;
            }
            vo0 vo02 = this.k;
            if (vo02 == null) {
                return;
            }
            if (this.n == 1) {
                B();
                return;
            }
            o(vo02);
            this.d.disconnect();
        } else if (this.j == null || !v(this.k)) {
            vo0 vo03 = this.j;
            if (vo03 != null && (vo0 = this.k) != null) {
                if (this.e.m < this.d.m) {
                    vo03 = vo0;
                }
                o(vo03);
            }
        } else {
            this.e.disconnect();
            o(this.j);
        }
    }

    private final void B() {
        for (p pVar : this.g) {
            pVar.a();
        }
        this.g.clear();
    }

    private final boolean C() {
        vo0 vo0 = this.k;
        return vo0 != null && vo0.o() == 4;
    }

    private final PendingIntent D() {
        if (this.h == null) {
            return null;
        }
        return PendingIntent.getActivity(this.a, System.identityHashCode(this.b), this.h.getSignInIntent(), 134217728);
    }

    public static v2 i(Context context, r0 r0Var, Lock lock, Looper looper, zo0 zo0, Map<a.c<?>, a.f> map, e eVar, Map<a<?>, Boolean> map2, a.AbstractC0054a<? extends qs1, bs1> aVar, ArrayList<u2> arrayList) {
        r0 r0Var2 = new r0();
        r0 r0Var3 = new r0();
        a.f fVar = null;
        for (Map.Entry<a.c<?>, a.f> entry : map.entrySet()) {
            a.f value = entry.getValue();
            if (value.d()) {
                fVar = value;
            }
            if (value.r()) {
                r0Var2.put(entry.getKey(), value);
            } else {
                r0Var3.put(entry.getKey(), value);
            }
        }
        u.o(!r0Var2.isEmpty(), C0201.m82(14990));
        r0 r0Var4 = new r0();
        r0 r0Var5 = new r0();
        for (a<?> aVar2 : map2.keySet()) {
            a.c<?> a2 = aVar2.a();
            if (r0Var2.containsKey(a2)) {
                r0Var4.put(aVar2, map2.get(aVar2));
            } else if (r0Var3.containsKey(a2)) {
                r0Var5.put(aVar2, map2.get(aVar2));
            } else {
                throw new IllegalStateException(C0201.m82(14991));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            u2 u2Var = arrayList.get(i2);
            i2++;
            u2 u2Var2 = u2Var;
            if (r0Var4.containsKey(u2Var2.a)) {
                arrayList2.add(u2Var2);
            } else if (r0Var5.containsKey(u2Var2.a)) {
                arrayList3.add(u2Var2);
            } else {
                throw new IllegalStateException(C0201.m82(14992));
            }
        }
        return new v2(context, r0Var, lock, looper, zo0, r0Var2, r0Var3, eVar, aVar, fVar, arrayList2, arrayList3, r0Var4, r0Var5);
    }

    /* access modifiers changed from: private */
    public final void m(int i2, boolean z) {
        this.b.c(i2, z);
        this.k = null;
        this.j = null;
    }

    /* access modifiers changed from: private */
    public final void n(Bundle bundle) {
        Bundle bundle2 = this.i;
        if (bundle2 == null) {
            this.i = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    private final void o(vo0 vo0) {
        int i2 = this.n;
        if (i2 != 1) {
            if (i2 != 2) {
                Log.wtf(C0201.m82(14993), C0201.m82(14994), new Exception());
                this.n = 0;
            }
            this.b.a(vo0);
        }
        B();
        this.n = 0;
    }

    private final boolean r(d<? extends m, ? extends a.b> dVar) {
        a.c<? extends a.b> w = dVar.w();
        u.b(this.f.containsKey(w), C0201.m82(14995));
        return this.f.get(w).equals(this.e);
    }

    private static boolean v(vo0 vo0) {
        return vo0 != null && vo0.u();
    }

    @Override // com.google.android.gms.common.api.internal.n1
    public final void a() {
        this.n = 2;
        this.l = false;
        this.k = null;
        this.j = null;
        this.d.a();
        this.e.a();
    }

    @Override // com.google.android.gms.common.api.internal.n1
    public final void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        PrintWriter append = printWriter.append((CharSequence) str).append((CharSequence) C0201.m82(14996));
        String r1 = C0201.m82(14997);
        append.println(r1);
        a1 a1Var = this.e;
        String valueOf = String.valueOf(str);
        String r3 = C0201.m82(14998);
        a1Var.b(valueOf.concat(r3), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append((CharSequence) C0201.m82(14999)).println(r1);
        this.d.b(String.valueOf(str).concat(r3), fileDescriptor, printWriter, strArr);
    }

    @Override // com.google.android.gms.common.api.internal.n1
    public final boolean c(p pVar) {
        this.m.lock();
        try {
            if ((g() || isConnected()) && !this.e.isConnected()) {
                this.g.add(pVar);
                if (this.n == 0) {
                    this.n = 1;
                }
                this.k = null;
                this.e.a();
                return true;
            }
            this.m.unlock();
            return false;
        } finally {
            this.m.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.n1
    public final void d() {
        this.m.lock();
        try {
            boolean g2 = g();
            this.e.disconnect();
            this.k = new vo0(4);
            if (g2) {
                new et0(this.c).post(new y2(this));
            } else {
                B();
            }
        } finally {
            this.m.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.n1
    public final void disconnect() {
        this.k = null;
        this.j = null;
        this.n = 0;
        this.d.disconnect();
        this.e.disconnect();
        B();
    }

    @Override // com.google.android.gms.common.api.internal.n1
    public final void e() {
        this.d.e();
        this.e.e();
    }

    @Override // com.google.android.gms.common.api.internal.n1
    public final vo0 f() {
        throw new UnsupportedOperationException();
    }

    public final boolean g() {
        this.m.lock();
        try {
            return this.n == 2;
        } finally {
            this.m.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.n1
    public final boolean isConnected() {
        this.m.lock();
        try {
            boolean z = true;
            if (!this.d.isConnected() || (!this.e.isConnected() && !C() && this.n != 1)) {
                z = false;
            }
            return z;
        } finally {
            this.m.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.n1
    public final <A extends a.b, T extends d<? extends m, A>> T j(T t) {
        if (!r(t)) {
            return (T) this.d.j(t);
        }
        if (!C()) {
            return (T) this.e.j(t);
        }
        t.A(new Status(4, null, D()));
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.n1
    public final <A extends a.b, R extends m, T extends d<R, A>> T k(T t) {
        if (!r(t)) {
            return (T) this.d.k(t);
        }
        if (!C()) {
            return (T) this.e.k(t);
        }
        t.A(new Status(4, null, D()));
        return t;
    }
}
