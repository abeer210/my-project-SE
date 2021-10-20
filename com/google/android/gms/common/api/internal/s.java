package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.internal.u;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public abstract class s<A extends a.b, ResultT> {
    private final xo0[] a;
    private final boolean b;

    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static class a<A extends a.b, ResultT> {
        private o<A, at1<ResultT>> a;
        private boolean b;
        private xo0[] c;

        private a() {
            this.b = true;
        }

        public s<A, ResultT> a() {
            u.b(this.a != null, C0201.m82(27493));
            return new z1(this, this.c, this.b);
        }

        public a<A, ResultT> b(o<A, at1<ResultT>> oVar) {
            this.a = oVar;
            return this;
        }

        public a<A, ResultT> c(xo0... xo0Arr) {
            this.c = xo0Arr;
            return this;
        }
    }

    @Deprecated
    public s() {
        this.a = null;
        this.b = false;
    }

    public static <A extends a.b, ResultT> a<A, ResultT> a() {
        return new a<>();
    }

    public abstract void b(A a2, at1<ResultT> at1) throws RemoteException;

    public boolean c() {
        return this.b;
    }

    public final xo0[] d() {
        return this.a;
    }

    private s(xo0[] xo0Arr, boolean z) {
        this.a = xo0Arr;
        this.b = z;
    }
}
