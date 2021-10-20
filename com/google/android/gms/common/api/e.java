package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.internal.b;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.api.internal.j1;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.common.api.internal.n;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.v1;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.u;
import java.util.Collections;
import java.util.Set;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class e<O extends a.d> implements g<O> {
    private final Context a;
    private final a<O> b;
    private final O c;
    private final b<O> d;
    private final Looper e;
    private final int f;
    private final f g;
    private final q h;
    public final g i;

    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static class a {
        public static final a c = new C0057a().a();
        public final q a;
        public final Looper b;

        /* renamed from: com.google.android.gms.common.api.e$a$a  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
        public static class C0057a {
            private q a;
            private Looper b;

            public a a() {
                if (this.a == null) {
                    this.a = new com.google.android.gms.common.api.internal.a();
                }
                if (this.b == null) {
                    this.b = Looper.getMainLooper();
                }
                return new a(this.a, this.b);
            }

            public C0057a b(q qVar) {
                u.l(qVar, C0201.m82(38687));
                this.a = qVar;
                return this;
            }
        }

        private a(q qVar, Account account, Looper looper) {
            this.a = qVar;
            this.b = looper;
        }
    }

    public e(Context context, a<O> aVar, Looper looper) {
        u.l(context, C0201.m82(36087));
        u.l(aVar, C0201.m82(36088));
        u.l(looper, C0201.m82(36089));
        this.a = context.getApplicationContext();
        this.b = aVar;
        this.c = null;
        this.e = looper;
        this.d = b.c(aVar);
        this.g = new j1(this);
        g m = g.m(this.a);
        this.i = m;
        this.f = m.p();
        this.h = new com.google.android.gms.common.api.internal.a();
    }

    private final <A extends a.b, T extends com.google.android.gms.common.api.internal.d<? extends m, A>> T q(int i2, T t) {
        t.t();
        this.i.j(this, i2, t);
        return t;
    }

    private final <TResult, A extends a.b> zs1<TResult> s(int i2, s<A, TResult> sVar) {
        at1 at1 = new at1();
        this.i.k(this, i2, sVar, at1, this.h);
        return at1.a();
    }

    @Override // com.google.android.gms.common.api.g
    public b<O> b() {
        return this.d;
    }

    public f c() {
        return this.g;
    }

    public e.a d() {
        Account account;
        Set<Scope> set;
        GoogleSignInAccount c2;
        GoogleSignInAccount c3;
        e.a aVar = new e.a();
        O o = this.c;
        if (!(o instanceof a.d.b) || (c3 = ((a.d.b) o).c()) == null) {
            O o2 = this.c;
            account = o2 instanceof a.d.AbstractC0055a ? ((a.d.AbstractC0055a) o2).B() : null;
        } else {
            account = c3.B();
        }
        aVar.c(account);
        O o3 = this.c;
        if (!(o3 instanceof a.d.b) || (c2 = ((a.d.b) o3).c()) == null) {
            set = Collections.emptySet();
        } else {
            set = c2.z();
        }
        aVar.a(set);
        aVar.d(this.a.getClass().getName());
        aVar.e(this.a.getPackageName());
        return aVar;
    }

    public <A extends a.b, T extends com.google.android.gms.common.api.internal.d<? extends m, A>> T e(T t) {
        q(2, t);
        return t;
    }

    public <A extends a.b, T extends com.google.android.gms.common.api.internal.d<? extends m, A>> T f(T t) {
        q(0, t);
        return t;
    }

    public <TResult, A extends a.b> zs1<TResult> g(s<A, TResult> sVar) {
        return s(0, sVar);
    }

    @Deprecated
    public <A extends a.b, T extends n<A, ?>, U extends com.google.android.gms.common.api.internal.u<A, ?>> zs1<Void> h(T t, U u) {
        u.k(t);
        u.k(u);
        k.a b2 = t.b();
        String r1 = C0201.m82(36093);
        u.l(b2, r1);
        u.l(u.a(), r1);
        u.b(t.b().equals(u.a()), C0201.m82(36094));
        return this.i.f(this, t, u);
    }

    public zs1<Boolean> i(k.a<?> aVar) {
        u.l(aVar, C0201.m82(36095));
        return this.i.e(this, aVar);
    }

    public <A extends a.b, T extends com.google.android.gms.common.api.internal.d<? extends m, A>> T j(T t) {
        q(1, t);
        return t;
    }

    public <TResult, A extends a.b> zs1<TResult> k(s<A, TResult> sVar) {
        return s(1, sVar);
    }

    public final a<O> l() {
        return this.b;
    }

    public Context m() {
        return this.a;
    }

    public final int n() {
        return this.f;
    }

    public Looper o() {
        return this.e;
    }

    public a.f p(Looper looper, g.a<O> aVar) {
        return this.b.d().c(this.a, looper, d().b(), this.c, aVar, aVar);
    }

    public v1 r(Context context, Handler handler) {
        return new v1(context, handler, d().b());
    }

    public e(Context context, a<O> aVar, O o, a aVar2) {
        u.l(context, C0201.m82(36090));
        u.l(aVar, C0201.m82(36091));
        u.l(aVar2, C0201.m82(36092));
        this.a = context.getApplicationContext();
        this.b = aVar;
        this.c = o;
        this.e = aVar2.b;
        this.d = b.b(aVar, o);
        this.g = new j1(this);
        g m = g.m(this.a);
        this.i = m;
        this.f = m.p();
        this.h = aVar2.a;
        this.i.i(this);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @Deprecated
    public e(Context context, a<O> aVar, O o, q qVar) {
        this(context, aVar, o, r0.a());
        a.C0057a aVar2 = new a.C0057a();
        aVar2.b(qVar);
    }
}
