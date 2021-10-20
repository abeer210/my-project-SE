package defpackage;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.g;
import androidx.lifecycle.l;
import androidx.lifecycle.m;
import androidx.lifecycle.p;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import defpackage.q4;
import defpackage.u4;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import vigqyno.C0201;

/* renamed from: r4  reason: default package */
/* compiled from: LoaderManagerImpl */
public class r4 extends q4 {
    public static boolean c;
    private final g a;
    private final c b;

    /* renamed from: r4$a */
    /* compiled from: LoaderManagerImpl */
    public static class a<D> extends l<D> implements u4.c<D> {
        private final int k;
        private final Bundle l;
        private final u4<D> m;
        private g n;
        private b<D> o;
        private u4<D> p;

        public a(int i, Bundle bundle, u4<D> u4Var, u4<D> u4Var2) {
            this.k = i;
            this.l = bundle;
            this.m = u4Var;
            this.p = u4Var2;
            u4Var.u(i, this);
        }

        @Override // defpackage.u4.c
        public void a(u4<D> u4Var, D d) {
            boolean z = r4.c;
            String r0 = C0201.m82(32930);
            if (z) {
                Log.v(r0, C0201.m82(32931) + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                l(d);
                return;
            }
            if (r4.c) {
                Log.w(r0, C0201.m82(32932));
            }
            j(d);
        }

        @Override // androidx.lifecycle.LiveData
        public void h() {
            if (r4.c) {
                Log.v(C0201.m82(32934), C0201.m82(32933) + this);
            }
            this.m.x();
        }

        @Override // androidx.lifecycle.LiveData
        public void i() {
            if (r4.c) {
                Log.v(C0201.m82(32936), C0201.m82(32935) + this);
            }
            this.m.y();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: androidx.lifecycle.m<? super D> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void k(m<? super D> mVar) {
            super.k(mVar);
            this.n = null;
            this.o = null;
        }

        @Override // androidx.lifecycle.LiveData, androidx.lifecycle.l
        public void l(D d) {
            super.l(d);
            u4<D> u4Var = this.p;
            if (u4Var != null) {
                u4Var.v();
                this.p = null;
            }
        }

        public u4<D> m(boolean z) {
            if (r4.c) {
                Log.v(C0201.m82(32938), C0201.m82(32937) + this);
            }
            this.m.c();
            this.m.b();
            b<D> bVar = this.o;
            if (bVar != null) {
                k(bVar);
                if (z) {
                    bVar.d();
                }
            }
            this.m.A(this);
            if ((bVar == null || bVar.c()) && !z) {
                return this.m;
            }
            this.m.v();
            return this.p;
        }

        public void n(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print(C0201.m82(32939));
            printWriter.print(this.k);
            printWriter.print(C0201.m82(32940));
            printWriter.println(this.l);
            printWriter.print(str);
            printWriter.print(C0201.m82(32941));
            printWriter.println(this.m);
            u4<D> u4Var = this.m;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            String r2 = C0201.m82(32942);
            sb.append(r2);
            u4Var.h(sb.toString(), fileDescriptor, printWriter, strArr);
            if (this.o != null) {
                printWriter.print(str);
                printWriter.print(C0201.m82(32943));
                printWriter.println(this.o);
                b<D> bVar = this.o;
                bVar.b(str + r2, printWriter);
            }
            printWriter.print(str);
            printWriter.print(C0201.m82(32944));
            printWriter.println(o().e((D) e()));
            printWriter.print(str);
            printWriter.print(C0201.m82(32945));
            printWriter.println(f());
        }

        public u4<D> o() {
            return this.m;
        }

        public void p() {
            g gVar = this.n;
            b<D> bVar = this.o;
            if (gVar != null && bVar != null) {
                super.k(bVar);
                g(gVar, bVar);
            }
        }

        public u4<D> q(g gVar, q4.a<D> aVar) {
            b<D> bVar = new b<>(this.m, aVar);
            g(gVar, bVar);
            b<D> bVar2 = this.o;
            if (bVar2 != null) {
                k(bVar2);
            }
            this.n = gVar;
            this.o = bVar;
            return this.m;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append(C0201.m82(32946));
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(C0201.m82(32947));
            sb.append(this.k);
            sb.append(C0201.m82(32948));
            androidx.core.util.a.a(this.m, sb);
            sb.append(C0201.m82(32949));
            return sb.toString();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r4$b */
    /* compiled from: LoaderManagerImpl */
    public static class b<D> implements m<D> {
        private final u4<D> a;
        private final q4.a<D> b;
        private boolean c = false;

        public b(u4<D> u4Var, q4.a<D> aVar) {
            this.a = u4Var;
            this.b = aVar;
        }

        @Override // androidx.lifecycle.m
        public void a(D d) {
            if (r4.c) {
                Log.v(C0201.m82(32953), C0201.m82(32951) + this.a + C0201.m82(32952) + this.a.e(d));
            }
            this.b.a(this.a, d);
            this.c = true;
        }

        public void b(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print(C0201.m82(32954));
            printWriter.println(this.c);
        }

        public boolean c() {
            return this.c;
        }

        public void d() {
            if (this.c) {
                if (r4.c) {
                    Log.v(C0201.m82(32956), C0201.m82(32955) + this.a);
                }
                this.b.c(this.a);
            }
        }

        public String toString() {
            return this.b.toString();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r4$c */
    /* compiled from: LoaderManagerImpl */
    public static class c extends p {
        private static final q.a d = new a();
        private y0<a> b = new y0<>();
        private boolean c = false;

        /* renamed from: r4$c$a */
        /* compiled from: LoaderManagerImpl */
        static class a implements q.a {
            @Override // androidx.lifecycle.q.a
            public <T extends p> T a(Class<T> cls) {
                return new c();
            }
        }

        public static c f(r rVar) {
            return (c) new q(rVar, d).a(c.class);
        }

        @Override // androidx.lifecycle.p
        public void c() {
            super.c();
            int n = this.b.n();
            for (int i = 0; i < n; i++) {
                this.b.o(i).m(true);
            }
            this.b.b();
        }

        public void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.b.n() > 0) {
                printWriter.print(str);
                printWriter.println(C0201.m82(33059));
                String str2 = str + C0201.m82(33060);
                for (int i = 0; i < this.b.n(); i++) {
                    a o = this.b.o(i);
                    printWriter.print(str);
                    printWriter.print(C0201.m82(33061));
                    printWriter.print(this.b.j(i));
                    printWriter.print(C0201.m82(33062));
                    printWriter.println(o.toString());
                    o.n(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        public void e() {
            this.c = false;
        }

        public <D> a<D> g(int i) {
            return this.b.e(i);
        }

        public boolean h() {
            return this.c;
        }

        public void i() {
            int n = this.b.n();
            for (int i = 0; i < n; i++) {
                this.b.o(i).p();
            }
        }

        public void j(int i, a aVar) {
            this.b.l(i, aVar);
        }

        public void k() {
            this.c = true;
        }
    }

    static {
        C0201.m83(r4.class, 735);
    }

    public r4(g gVar, r rVar) {
        this.a = gVar;
        this.b = c.f(rVar);
    }

    /* JADX INFO: finally extract failed */
    private <D> u4<D> e(int i, Bundle bundle, q4.a<D> aVar, u4<D> u4Var) {
        try {
            this.b.k();
            u4<D> b2 = aVar.b(i, bundle);
            if (b2 != null) {
                if (b2.getClass().isMemberClass()) {
                    if (!Modifier.isStatic(b2.getClass().getModifiers())) {
                        throw new IllegalArgumentException(C0201.m82(37757) + b2);
                    }
                }
                a aVar2 = new a(i, bundle, b2, u4Var);
                if (c) {
                    String r5 = C0201.m82(37758);
                    Log.v(r5, C0201.m82(37759) + aVar2);
                }
                this.b.j(i, aVar2);
                this.b.e();
                return aVar2.q(this.a, aVar);
            }
            throw new IllegalArgumentException(C0201.m82(37760));
        } catch (Throwable th) {
            this.b.e();
            throw th;
        }
    }

    @Override // defpackage.q4
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.b.d(str, fileDescriptor, printWriter, strArr);
    }

    @Override // defpackage.q4
    public <D> u4<D> c(int i, Bundle bundle, q4.a<D> aVar) {
        if (this.b.h()) {
            throw new IllegalStateException(C0201.m82(37766));
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            a<D> g = this.b.g(i);
            boolean z = c;
            String r2 = C0201.m82(37761);
            if (z) {
                Log.v(r2, C0201.m82(37762) + this + C0201.m82(37763) + bundle);
            }
            if (g == null) {
                return e(i, bundle, aVar, null);
            }
            if (c) {
                Log.v(r2, C0201.m82(37764) + g);
            }
            return g.q(this.a, aVar);
        } else {
            throw new IllegalStateException(C0201.m82(37765));
        }
    }

    @Override // defpackage.q4
    public void d() {
        this.b.i();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(C0201.m82(37767));
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(C0201.m82(37768));
        androidx.core.util.a.a(this.a, sb);
        sb.append(C0201.m82(37769));
        return sb.toString();
    }
}
