package defpackage;

import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

/* renamed from: nb  reason: default package */
/* compiled from: BaseKeyframeAnimation */
public abstract class nb<K, A> {
    public final List<b> a = new ArrayList(1);
    private boolean b = false;
    private final d<K> c;
    public float d = 0.0f;
    public dg<A> e;
    private A f = null;
    private float g = -1.0f;
    private float h = -1.0f;

    /* renamed from: nb$b */
    /* compiled from: BaseKeyframeAnimation */
    public interface b {
        void b();
    }

    /* access modifiers changed from: private */
    /* renamed from: nb$c */
    /* compiled from: BaseKeyframeAnimation */
    public static final class c<T> implements d<T> {
        private c() {
        }

        @Override // defpackage.nb.d
        public boolean a(float f) {
            throw new IllegalStateException(C0201.m82(9907));
        }

        @Override // defpackage.nb.d
        public bg<T> b() {
            throw new IllegalStateException(C0201.m82(9908));
        }

        @Override // defpackage.nb.d
        public boolean c(float f) {
            return false;
        }

        @Override // defpackage.nb.d
        public float d() {
            return 1.0f;
        }

        @Override // defpackage.nb.d
        public float e() {
            return 0.0f;
        }

        @Override // defpackage.nb.d
        public boolean isEmpty() {
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: nb$d */
    /* compiled from: BaseKeyframeAnimation */
    public interface d<T> {
        boolean a(float f);

        bg<T> b();

        boolean c(float f);

        float d();

        float e();

        boolean isEmpty();
    }

    /* access modifiers changed from: private */
    /* renamed from: nb$e */
    /* compiled from: BaseKeyframeAnimation */
    public static final class e<T> implements d<T> {
        private final List<? extends bg<T>> a;
        private bg<T> b;
        private bg<T> c = null;
        private float d = -1.0f;

        public e(List<? extends bg<T>> list) {
            this.a = list;
            this.b = f(0.0f);
        }

        private bg<T> f(float f) {
            List<? extends bg<T>> list = this.a;
            bg<T> bgVar = (bg) list.get(list.size() - 1);
            if (f >= bgVar.e()) {
                return bgVar;
            }
            for (int size = this.a.size() - 2; size >= 1; size--) {
                bg<T> bgVar2 = (bg) this.a.get(size);
                if (this.b != bgVar2 && bgVar2.a(f)) {
                    return bgVar2;
                }
            }
            return (bg) this.a.get(0);
        }

        @Override // defpackage.nb.d
        public boolean a(float f) {
            if (this.c == this.b && this.d == f) {
                return true;
            }
            this.c = this.b;
            this.d = f;
            return false;
        }

        @Override // defpackage.nb.d
        public bg<T> b() {
            return this.b;
        }

        @Override // defpackage.nb.d
        public boolean c(float f) {
            if (this.b.a(f)) {
                return !this.b.h();
            }
            this.b = f(f);
            return true;
        }

        @Override // defpackage.nb.d
        public float d() {
            List<? extends bg<T>> list = this.a;
            return ((bg) list.get(list.size() - 1)).b();
        }

        @Override // defpackage.nb.d
        public float e() {
            return ((bg) this.a.get(0)).e();
        }

        @Override // defpackage.nb.d
        public boolean isEmpty() {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: nb$f */
    /* compiled from: BaseKeyframeAnimation */
    public static final class f<T> implements d<T> {
        private final bg<T> a;
        private float b = -1.0f;

        public f(List<? extends bg<T>> list) {
            this.a = (bg) list.get(0);
        }

        @Override // defpackage.nb.d
        public boolean a(float f) {
            if (this.b == f) {
                return true;
            }
            this.b = f;
            return false;
        }

        @Override // defpackage.nb.d
        public bg<T> b() {
            return this.a;
        }

        @Override // defpackage.nb.d
        public boolean c(float f) {
            return !this.a.h();
        }

        @Override // defpackage.nb.d
        public float d() {
            return this.a.b();
        }

        @Override // defpackage.nb.d
        public float e() {
            return this.a.e();
        }

        @Override // defpackage.nb.d
        public boolean isEmpty() {
            return false;
        }
    }

    public nb(List<? extends bg<K>> list) {
        this.c = n(list);
    }

    private float g() {
        if (this.g == -1.0f) {
            this.g = this.c.e();
        }
        return this.g;
    }

    private static <T> d<T> n(List<? extends bg<T>> list) {
        if (list.isEmpty()) {
            return new c();
        }
        if (list.size() == 1) {
            return new f(list);
        }
        return new e(list);
    }

    public void a(b bVar) {
        this.a.add(bVar);
    }

    public bg<K> b() {
        String r0 = C0201.m82(32950);
        ca.a(r0);
        bg<K> b2 = this.c.b();
        ca.b(r0);
        return b2;
    }

    public float c() {
        if (this.h == -1.0f) {
            this.h = this.c.d();
        }
        return this.h;
    }

    public float d() {
        bg<K> b2 = b();
        if (b2.h()) {
            return 0.0f;
        }
        return b2.d.getInterpolation(e());
    }

    public float e() {
        if (this.b) {
            return 0.0f;
        }
        bg<K> b2 = b();
        if (b2.h()) {
            return 0.0f;
        }
        return (this.d - b2.e()) / (b2.b() - b2.e());
    }

    public float f() {
        return this.d;
    }

    public A h() {
        float d2 = d();
        if (this.e == null && this.c.a(d2)) {
            return this.f;
        }
        A i = i(b(), d2);
        this.f = i;
        return i;
    }

    public abstract A i(bg<K> bgVar, float f2);

    public void j() {
        for (int i = 0; i < this.a.size(); i++) {
            this.a.get(i).b();
        }
    }

    public void k() {
        this.b = true;
    }

    public void l(float f2) {
        if (!this.c.isEmpty()) {
            if (f2 < g()) {
                f2 = g();
            } else if (f2 > c()) {
                f2 = c();
            }
            if (f2 != this.d) {
                this.d = f2;
                if (this.c.c(f2)) {
                    j();
                }
            }
        }
    }

    public void m(dg<A> dgVar) {
        dg<A> dgVar2 = this.e;
        if (dgVar2 != null) {
            dgVar2.c(null);
        }
        this.e = dgVar;
        if (dgVar != null) {
            dgVar.c(this);
        }
    }
}
