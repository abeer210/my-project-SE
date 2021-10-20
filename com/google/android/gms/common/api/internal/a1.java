package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class a1 implements n1, w2 {
    private final Lock a;
    private final Condition b;
    private final Context c;
    private final zo0 d;
    private final c1 e;
    public final Map<a.c<?>, a.f> f;
    public final Map<a.c<?>, vo0> g = new HashMap();
    private final e h;
    private final Map<a<?>, Boolean> i;
    private final a.AbstractC0054a<? extends qs1, bs1> j;
    private volatile x0 k;
    private vo0 l = null;
    public int m;
    public final r0 n;
    public final o1 o;

    public a1(Context context, r0 r0Var, Lock lock, Looper looper, zo0 zo0, Map<a.c<?>, a.f> map, e eVar, Map<a<?>, Boolean> map2, a.AbstractC0054a<? extends qs1, bs1> aVar, ArrayList<u2> arrayList, o1 o1Var) {
        this.c = context;
        this.a = lock;
        this.d = zo0;
        this.f = map;
        this.h = eVar;
        this.i = map2;
        this.j = aVar;
        this.n = r0Var;
        this.o = o1Var;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            u2 u2Var = arrayList.get(i2);
            i2++;
            u2Var.a(this);
        }
        this.e = new c1(this, looper);
        this.b = lock.newCondition();
        this.k = new o0(this);
    }

    @Override // com.google.android.gms.common.api.internal.n1
    public final void a() {
        this.k.a();
    }

    @Override // com.google.android.gms.common.api.internal.n1
    public final void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat(C0201.m82(24545));
        printWriter.append((CharSequence) str).append((CharSequence) C0201.m82(24546)).println(this.k);
        for (a<?> aVar : this.i.keySet()) {
            printWriter.append((CharSequence) str).append((CharSequence) aVar.b()).println(C0201.m82(24547));
            this.f.get(aVar.a()).b(concat, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.n1
    public final boolean c(p pVar) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.n1
    public final void d() {
    }

    @Override // com.google.android.gms.common.api.internal.n1
    public final void disconnect() {
        if (this.k.disconnect()) {
            this.g.clear();
        }
    }

    @Override // com.google.android.gms.common.api.internal.n1
    public final void e() {
        if (isConnected()) {
            ((a0) this.k).c();
        }
    }

    @Override // com.google.android.gms.common.api.internal.n1
    public final vo0 f() {
        a();
        while (g()) {
            try {
                this.b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new vo0(15, null);
            }
        }
        if (isConnected()) {
            return vo0.e;
        }
        vo0 vo0 = this.l;
        if (vo0 != null) {
            return vo0;
        }
        return new vo0(13, null);
    }

    public final boolean g() {
        return this.k instanceof f0;
    }

    public final void h(z0 z0Var) {
        this.e.sendMessage(this.e.obtainMessage(1, z0Var));
    }

    @Override // com.google.android.gms.common.api.internal.w2
    public final void i(vo0 vo0, a<?> aVar, boolean z) {
        this.a.lock();
        try {
            this.k.i(vo0, aVar, z);
        } finally {
            this.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.n1
    public final boolean isConnected() {
        return this.k instanceof a0;
    }

    @Override // com.google.android.gms.common.api.internal.n1
    public final <A extends a.b, T extends d<? extends m, A>> T j(T t) {
        t.t();
        return (T) this.k.j(t);
    }

    @Override // com.google.android.gms.common.api.internal.n1
    public final <A extends a.b, R extends m, T extends d<R, A>> T k(T t) {
        t.t();
        return (T) this.k.k(t);
    }

    public final void l() {
        this.a.lock();
        try {
            this.k = new f0(this, this.h, this.i, this.d, this.j, this.a, this.c);
            this.k.d();
            this.b.signalAll();
        } finally {
            this.a.unlock();
        }
    }

    public final void m() {
        this.a.lock();
        try {
            this.n.D();
            this.k = new a0(this);
            this.k.d();
            this.b.signalAll();
        } finally {
            this.a.unlock();
        }
    }

    public final void o(RuntimeException runtimeException) {
        this.e.sendMessage(this.e.obtainMessage(2, runtimeException));
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void onConnected(Bundle bundle) {
        this.a.lock();
        try {
            this.k.onConnected(bundle);
        } finally {
            this.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void onConnectionSuspended(int i2) {
        this.a.lock();
        try {
            this.k.onConnectionSuspended(i2);
        } finally {
            this.a.unlock();
        }
    }

    public final void q(vo0 vo0) {
        this.a.lock();
        try {
            this.l = vo0;
            this.k = new o0(this);
            this.k.d();
            this.b.signalAll();
        } finally {
            this.a.unlock();
        }
    }
}
