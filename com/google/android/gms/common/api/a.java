package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.m;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.u;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import vigqyno.C0188;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class a<O extends d> {
    private final AbstractC0054a<?, O> a;
    private final g<?> b;
    private final String c;

    /* renamed from: com.google.android.gms.common.api.a$a  reason: collision with other inner class name */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static abstract class AbstractC0054a<T extends f, O> extends e<T, O> {
        @Deprecated
        public T c(Context context, Looper looper, com.google.android.gms.common.internal.e eVar, O o, f.b bVar, f.c cVar) {
            return d(context, looper, eVar, o, bVar, cVar);
        }

        public T d(Context context, Looper looper, com.google.android.gms.common.internal.e eVar, O o, com.google.android.gms.common.api.internal.f fVar, m mVar) {
            throw new UnsupportedOperationException(C0201.m82(15410));
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public interface b {
    }

    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static class c<C extends b> {
    }

    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public interface d {

        /* renamed from: com.google.android.gms.common.api.a$d$a  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
        public interface AbstractC0055a extends c, d {
            Account B();
        }

        /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
        public interface b extends c {
            GoogleSignInAccount c();
        }

        /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
        public interface c extends d {
        }

        /* renamed from: com.google.android.gms.common.api.a$d$d  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
        public static final class C0056d implements d {
            private C0056d() {
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static abstract class e<T extends b, O> {
        public List<Scope> a(O o) {
            return Collections.emptyList();
        }

        public int b() {
            return C0188.f24;
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public interface f extends b {
        void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        boolean d();

        void disconnect();

        Set<Scope> e();

        void f(n nVar, Set<Scope> set);

        Intent getSignInIntent();

        String h();

        void i(c.AbstractC0058c cVar);

        boolean isConnected();

        boolean isConnecting();

        void k(c.e eVar);

        boolean o();

        int p();

        xo0[] q();

        boolean r();

        IBinder s();
    }

    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static final class g<C extends f> extends c<C> {
    }

    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public interface h<T extends IInterface> extends b {
        void j(int i, T t);

        String m();

        T n(IBinder iBinder);

        String t();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.google.android.gms.common.api.a$a<C extends com.google.android.gms.common.api.a$f, O extends com.google.android.gms.common.api.a$d> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.google.android.gms.common.api.a$g<C extends com.google.android.gms.common.api.a$f> */
    /* JADX WARN: Multi-variable type inference failed */
    public <C extends f> a(String str, AbstractC0054a<C, O> aVar, g<C> gVar) {
        u.l(aVar, C0201.m82(2934));
        u.l(gVar, C0201.m82(2935));
        this.c = str;
        this.a = aVar;
        this.b = gVar;
    }

    public final c<?> a() {
        g<?> gVar = this.b;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalStateException(C0201.m82(2936));
    }

    public final String b() {
        return this.c;
    }

    public final e<?, O> c() {
        return this.a;
    }

    public final AbstractC0054a<?, O> d() {
        u.o(this.a != null, C0201.m82(2937));
        return this.a;
    }
}
