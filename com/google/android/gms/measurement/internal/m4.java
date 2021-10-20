package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.u;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import vigqyno.C0201;

public final class m4<V> extends FutureTask<V> implements Comparable<m4> {
    private final long a;
    public final boolean b;
    private final String c;
    private final /* synthetic */ i4 d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m4(i4 i4Var, Callable<V> callable, boolean z, String str) {
        super(callable);
        this.d = i4Var;
        u.k(str);
        long andIncrement = i4.l.getAndIncrement();
        this.a = andIncrement;
        this.c = str;
        this.b = z;
        if (andIncrement == Long.MAX_VALUE) {
            i4Var.e().E().d(C0201.m82(10972));
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(m4 m4Var) {
        m4 m4Var2 = m4Var;
        boolean z = this.b;
        if (z != m4Var2.b) {
            return z ? -1 : 1;
        }
        long j = this.a;
        long j2 = m4Var2.a;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        this.d.e().F().a(C0201.m82(10973), Long.valueOf(this.a));
        return 0;
    }

    public final void setException(Throwable th) {
        this.d.e().E().a(this.c, th);
        super.setException(th);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m4(i4 i4Var, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.d = i4Var;
        u.k(str);
        long andIncrement = i4.l.getAndIncrement();
        this.a = andIncrement;
        this.c = str;
        this.b = false;
        if (andIncrement == Long.MAX_VALUE) {
            i4Var.e().E().d(C0201.m82(10971));
        }
    }
}
