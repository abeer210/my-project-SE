package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.u;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class n2 extends p2 {
    private final SparseArray<a> f = new SparseArray<>();

    /* access modifiers changed from: private */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public class a implements f.c {
        public final int a;
        public final f b;
        public final f.c c;

        public a(int i, f fVar, f.c cVar) {
            this.a = i;
            this.b = fVar;
            this.c = cVar;
            fVar.p(this);
        }

        @Override // com.google.android.gms.common.api.internal.m
        public final void onConnectionFailed(vo0 vo0) {
            String valueOf = String.valueOf(vo0);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append(C0201.m82(4872));
            sb.append(valueOf);
            Log.d(C0201.m82(4873), sb.toString());
            n2.this.n(vo0, this.a);
        }
    }

    private n2(j jVar) {
        super(jVar);
        this.a.e(C0201.m82(33408), this);
    }

    public static n2 q(i iVar) {
        j d = LifecycleCallback.d(iVar);
        n2 n2Var = (n2) d.g(C0201.m82(33409), n2.class);
        if (n2Var != null) {
            return n2Var;
        }
        return new n2(d);
    }

    private final a t(int i) {
        if (this.f.size() <= i) {
            return null;
        }
        SparseArray<a> sparseArray = this.f;
        return sparseArray.get(sparseArray.keyAt(i));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.f.size(); i++) {
            a t = t(i);
            if (t != null) {
                printWriter.append((CharSequence) str).append((CharSequence) C0201.m82(33410)).print(t.a);
                printWriter.println(C0201.m82(33411));
                t.b.h(String.valueOf(str).concat(C0201.m82(33412)), fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.p2, com.google.android.gms.common.api.internal.LifecycleCallback
    public void j() {
        super.j();
        boolean z = this.b;
        String valueOf = String.valueOf(this.f);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append(C0201.m82(33413));
        sb.append(z);
        sb.append(C0201.m82(33414));
        sb.append(valueOf);
        Log.d(C0201.m82(33415), sb.toString());
        if (this.c.get() == null) {
            for (int i = 0; i < this.f.size(); i++) {
                a t = t(i);
                if (t != null) {
                    t.b.f();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.p2, com.google.android.gms.common.api.internal.LifecycleCallback
    public void k() {
        super.k();
        for (int i = 0; i < this.f.size(); i++) {
            a t = t(i);
            if (t != null) {
                t.b.g();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.p2
    public final void m(vo0 vo0, int i) {
        String r0 = C0201.m82(33416);
        Log.w(r0, C0201.m82(33417));
        if (i < 0) {
            Log.wtf(r0, C0201.m82(33418), new Exception());
            return;
        }
        a aVar = this.f.get(i);
        if (aVar != null) {
            r(i);
            f.c cVar = aVar.c;
            if (cVar != null) {
                cVar.onConnectionFailed(vo0);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.p2
    public final void o() {
        for (int i = 0; i < this.f.size(); i++) {
            a t = t(i);
            if (t != null) {
                t.b.f();
            }
        }
    }

    public final void r(int i) {
        a aVar = this.f.get(i);
        this.f.remove(i);
        if (aVar != null) {
            aVar.b.q(aVar);
            aVar.b.g();
        }
    }

    public final void s(int i, f fVar, f.c cVar) {
        u.l(fVar, C0201.m82(33419));
        boolean z = this.f.indexOfKey(i) < 0;
        StringBuilder sb = new StringBuilder(54);
        sb.append(C0201.m82(33420));
        sb.append(i);
        u.o(z, sb.toString());
        r2 r2Var = this.c.get();
        boolean z2 = this.b;
        String valueOf = String.valueOf(r2Var);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 49);
        sb2.append(C0201.m82(33421));
        sb2.append(i);
        String r3 = C0201.m82(33422);
        sb2.append(r3);
        sb2.append(z2);
        sb2.append(r3);
        sb2.append(valueOf);
        String sb3 = sb2.toString();
        String r2 = C0201.m82(33423);
        Log.d(r2, sb3);
        this.f.put(i, new a(i, fVar, cVar));
        if (this.b && r2Var == null) {
            String valueOf2 = String.valueOf(fVar);
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf2).length() + 11);
            sb4.append(C0201.m82(33424));
            sb4.append(valueOf2);
            Log.d(r2, sb4.toString());
            fVar.f();
        }
    }
}
