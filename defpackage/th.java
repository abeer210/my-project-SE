package defpackage;

import android.os.Build;
import android.util.Log;
import com.bumptech.glide.i;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.l;
import com.bumptech.glide.load.m;
import defpackage.gp;
import defpackage.rh;
import defpackage.uh;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: th  reason: default package */
/* compiled from: DecodeJob */
public class th<R> implements rh.a, Runnable, Comparable<th<?>>, gp.f {
    private com.bumptech.glide.load.g A;
    private com.bumptech.glide.load.g B;
    private Object C;
    private com.bumptech.glide.load.a D;
    private vg<?> E;
    private volatile rh F;
    private volatile boolean G;
    private volatile boolean H;
    private final sh<R> a = new sh<>();
    private final List<Throwable> b = new ArrayList();
    private final ip c = ip.a();
    private final e d;
    private final androidx.core.util.e<th<?>> e;
    private final d<?> f = new d<>();
    private final f g = new f();
    private com.bumptech.glide.e h;
    private com.bumptech.glide.load.g i;
    private com.bumptech.glide.g j;
    private zh k;
    private int l;
    private int m;
    private vh n;
    private i o;
    private b<R> p;
    private int q;
    private h u;
    private g v;
    private long w;
    private boolean x;
    private Object y;
    private Thread z;

    /* access modifiers changed from: package-private */
    /* renamed from: th$a */
    /* compiled from: DecodeJob */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0074 */
        static {
            int[] iArr = new int[com.bumptech.glide.load.c.values().length];
            c = iArr;
            try {
                iArr[com.bumptech.glide.load.c.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[com.bumptech.glide.load.c.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[h.values().length];
            b = iArr2;
            iArr2[h.RESOURCE_CACHE.ordinal()] = 1;
            try {
                b[h.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            b[h.SOURCE.ordinal()] = 3;
            b[h.FINISHED.ordinal()] = 4;
            try {
                b[h.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[g.values().length];
            a = iArr3;
            iArr3[g.INITIALIZE.ordinal()] = 1;
            a[g.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            a[g.DECODE_DATA.ordinal()] = 3;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: th$b */
    /* compiled from: DecodeJob */
    public interface b<R> {
        void a(ci ciVar);

        void c(hi<R> hiVar, com.bumptech.glide.load.a aVar);

        void d(th<?> thVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: th$c */
    /* compiled from: DecodeJob */
    public final class c<Z> implements uh.a<Z> {
        private final com.bumptech.glide.load.a a;

        public c(com.bumptech.glide.load.a aVar) {
            this.a = aVar;
        }

        @Override // defpackage.uh.a
        public hi<Z> a(hi<Z> hiVar) {
            return th.this.H(this.a, hiVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: th$d */
    /* compiled from: DecodeJob */
    public static class d<Z> {
        private com.bumptech.glide.load.g a;
        private l<Z> b;
        private gi<Z> c;

        public void a() {
            this.a = null;
            this.b = null;
            this.c = null;
        }

        public void b(e eVar, i iVar) {
            hp.a(C0201.m82(4887));
            try {
                eVar.a().a(this.a, new qh(this.b, this.c, iVar));
            } finally {
                this.c.g();
                hp.d();
            }
        }

        public boolean c() {
            return this.c != null;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bumptech.glide.load.l<X> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: gi<X> */
        /* JADX WARN: Multi-variable type inference failed */
        public <X> void d(com.bumptech.glide.load.g gVar, l<X> lVar, gi<X> giVar) {
            this.a = gVar;
            this.b = lVar;
            this.c = giVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: th$e */
    /* compiled from: DecodeJob */
    public interface e {
        aj a();
    }

    /* access modifiers changed from: private */
    /* renamed from: th$f */
    /* compiled from: DecodeJob */
    public static class f {
        private boolean a;
        private boolean b;
        private boolean c;

        private boolean a(boolean z) {
            return (this.c || z || this.b) && this.a;
        }

        public synchronized boolean b() {
            this.b = true;
            return a(false);
        }

        public synchronized boolean c() {
            this.c = true;
            return a(false);
        }

        public synchronized boolean d(boolean z) {
            this.a = true;
            return a(z);
        }

        public synchronized void e() {
            this.b = false;
            this.a = false;
            this.c = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: th$g */
    /* compiled from: DecodeJob */
    public enum g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* access modifiers changed from: private */
    /* renamed from: th$h */
    /* compiled from: DecodeJob */
    public enum h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    public th(e eVar, androidx.core.util.e<th<?>> eVar2) {
        this.d = eVar;
        this.e = eVar2;
    }

    private void A() {
        N();
        this.p.a(new ci(C0201.m82(7930), new ArrayList(this.b)));
        E();
    }

    private void C() {
        if (this.g.b()) {
            J();
        }
    }

    private void E() {
        if (this.g.c()) {
            J();
        }
    }

    private void J() {
        this.g.e();
        this.f.a();
        this.a.a();
        this.G = false;
        this.h = null;
        this.i = null;
        this.o = null;
        this.j = null;
        this.k = null;
        this.p = null;
        this.u = null;
        this.F = null;
        this.z = null;
        this.A = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.w = 0;
        this.H = false;
        this.y = null;
        this.b.clear();
        this.e.a(this);
    }

    private void K() {
        this.z = Thread.currentThread();
        this.w = ap.b();
        boolean z2 = false;
        while (!this.H && this.F != null && !(z2 = this.F.a())) {
            this.u = m(this.u);
            this.F = l();
            if (this.u == h.SOURCE) {
                d();
                return;
            }
        }
        if ((this.u == h.FINISHED || this.H) && !z2) {
            A();
        }
    }

    private <Data, ResourceType> hi<R> L(Data data, com.bumptech.glide.load.a aVar, fi<Data, ResourceType, R> fiVar) throws ci {
        i n2 = n(aVar);
        wg<Data> l2 = this.h.h().l(data);
        try {
            return fiVar.a(l2, n2, this.l, this.m, new c(aVar));
        } finally {
            l2.b();
        }
    }

    private void M() {
        int i2 = a.a[this.v.ordinal()];
        if (i2 == 1) {
            this.u = m(h.INITIALIZE);
            this.F = l();
            K();
        } else if (i2 == 2) {
            K();
        } else if (i2 == 3) {
            k();
        } else {
            throw new IllegalStateException(C0201.m82(7931) + this.v);
        }
    }

    private void N() {
        Throwable th;
        this.c.c();
        if (this.G) {
            if (this.b.isEmpty()) {
                th = null;
            } else {
                List<Throwable> list = this.b;
                th = list.get(list.size() - 1);
            }
            throw new IllegalStateException(C0201.m82(7932), th);
        }
        this.G = true;
    }

    private <Data> hi<R> i(vg<?> vgVar, Data data, com.bumptech.glide.load.a aVar) throws ci {
        if (data == null) {
            vgVar.b();
            return null;
        }
        try {
            long b2 = ap.b();
            hi<R> j2 = j(data, aVar);
            if (Log.isLoggable(C0201.m82(7933), 2)) {
                r(C0201.m82(7934) + j2, b2);
            }
            return j2;
        } finally {
            vgVar.b();
        }
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: fi<Data, ?, R>, fi<Data, ResourceType, R> */
    private <Data> hi<R> j(Data data, com.bumptech.glide.load.a aVar) throws ci {
        return L(data, aVar, (fi<Data, ?, R>) this.a.h(data.getClass()));
    }

    private void k() {
        if (Log.isLoggable(C0201.m82(7935), 2)) {
            long j2 = this.w;
            t(C0201.m82(7939), j2, C0201.m82(7936) + this.C + C0201.m82(7937) + this.A + C0201.m82(7938) + this.E);
        }
        hi<R> hiVar = null;
        try {
            hiVar = i(this.E, this.C, this.D);
        } catch (ci e2) {
            e2.i(this.B, this.D);
            this.b.add(e2);
        }
        if (hiVar != null) {
            x(hiVar, this.D);
        } else {
            K();
        }
    }

    private rh l() {
        int i2 = a.b[this.u.ordinal()];
        if (i2 == 1) {
            return new ii(this.a, this);
        }
        if (i2 == 2) {
            return new oh(this.a, this);
        }
        if (i2 == 3) {
            return new li(this.a, this);
        }
        if (i2 == 4) {
            return null;
        }
        throw new IllegalStateException(C0201.m82(7940) + this.u);
    }

    private h m(h hVar) {
        int i2 = a.b[hVar.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return this.x ? h.FINISHED : h.SOURCE;
            }
            if (i2 == 3 || i2 == 4) {
                return h.FINISHED;
            }
            if (i2 != 5) {
                throw new IllegalArgumentException(C0201.m82(7941) + hVar);
            } else if (this.n.b()) {
                return h.RESOURCE_CACHE;
            } else {
                return m(h.RESOURCE_CACHE);
            }
        } else if (this.n.a()) {
            return h.DATA_CACHE;
        } else {
            return m(h.DATA_CACHE);
        }
    }

    private i n(com.bumptech.glide.load.a aVar) {
        i iVar = this.o;
        if (Build.VERSION.SDK_INT < 26) {
            return iVar;
        }
        boolean z2 = aVar == com.bumptech.glide.load.a.RESOURCE_DISK_CACHE || this.a.w();
        Boolean bool = (Boolean) iVar.c(fl.i);
        if (bool != null && (!bool.booleanValue() || z2)) {
            return iVar;
        }
        i iVar2 = new i();
        iVar2.d(this.o);
        iVar2.e(fl.i, Boolean.valueOf(z2));
        return iVar2;
    }

    private int p() {
        return this.j.ordinal();
    }

    private void r(String str, long j2) {
        t(str, j2, null);
    }

    private void t(String str, long j2, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(C0201.m82(7942));
        sb.append(ap.a(j2));
        sb.append(C0201.m82(7943));
        sb.append(this.k);
        if (str2 != null) {
            str3 = C0201.m82(7944) + str2;
        } else {
            str3 = C0201.m82(7945);
        }
        sb.append(str3);
        sb.append(C0201.m82(7946));
        sb.append(Thread.currentThread().getName());
        Log.v(C0201.m82(7947), sb.toString());
    }

    private void v(hi<R> hiVar, com.bumptech.glide.load.a aVar) {
        N();
        this.p.c(hiVar, aVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: gi */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: gi */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: gi */
    /* JADX WARN: Multi-variable type inference failed */
    private void x(hi<R> hiVar, com.bumptech.glide.load.a aVar) {
        if (hiVar instanceof di) {
            ((di) hiVar).initialize();
        }
        gi giVar = 0;
        if (this.f.c()) {
            hiVar = gi.d(hiVar);
            giVar = hiVar;
        }
        v(hiVar, aVar);
        this.u = h.ENCODE;
        try {
            if (this.f.c()) {
                this.f.b(this.d, this.o);
            }
            C();
        } finally {
            if (giVar != 0) {
                giVar.g();
            }
        }
    }

    public <Z> hi<Z> H(com.bumptech.glide.load.a aVar, hi<Z> hiVar) {
        m<Z> mVar;
        hi<Z> hiVar2;
        com.bumptech.glide.load.c cVar;
        com.bumptech.glide.load.g gVar;
        Class<?> cls = hiVar.get().getClass();
        l lVar = null;
        if (aVar != com.bumptech.glide.load.a.RESOURCE_DISK_CACHE) {
            m<Z> r = this.a.r(cls);
            mVar = r;
            hiVar2 = r.b(this.h, hiVar, this.l, this.m);
        } else {
            hiVar2 = hiVar;
            mVar = null;
        }
        if (!hiVar.equals(hiVar2)) {
            hiVar.recycle();
        }
        if (this.a.v(hiVar2)) {
            lVar = this.a.n(hiVar2);
            cVar = lVar.b(this.o);
        } else {
            cVar = com.bumptech.glide.load.c.NONE;
        }
        if (!this.n.d(!this.a.x(this.A), aVar, cVar)) {
            return hiVar2;
        }
        if (lVar != null) {
            int i2 = a.c[cVar.ordinal()];
            if (i2 == 1) {
                gVar = new ph(this.A, this.i);
            } else if (i2 == 2) {
                gVar = new ji(this.a.b(), this.A, this.i, this.l, this.m, mVar, cls, this.o);
            } else {
                throw new IllegalArgumentException(C0201.m82(7948) + cVar);
            }
            gi d2 = gi.d(hiVar2);
            this.f.d(gVar, lVar, d2);
            return d2;
        }
        throw new i.d(hiVar2.get().getClass());
    }

    public void I(boolean z2) {
        if (this.g.d(z2)) {
            J();
        }
    }

    public boolean O() {
        h m2 = m(h.INITIALIZE);
        return m2 == h.RESOURCE_CACHE || m2 == h.DATA_CACHE;
    }

    @Override // defpackage.rh.a
    public void b(com.bumptech.glide.load.g gVar, Exception exc, vg<?> vgVar, com.bumptech.glide.load.a aVar) {
        vgVar.b();
        ci ciVar = new ci(C0201.m82(7949), exc);
        ciVar.j(gVar, aVar, vgVar.a());
        this.b.add(ciVar);
        if (Thread.currentThread() != this.z) {
            this.v = g.SWITCH_TO_SOURCE_SERVICE;
            this.p.d(this);
            return;
        }
        K();
    }

    @Override // defpackage.rh.a
    public void d() {
        this.v = g.SWITCH_TO_SOURCE_SERVICE;
        this.p.d(this);
    }

    @Override // defpackage.rh.a
    public void e(com.bumptech.glide.load.g gVar, Object obj, vg<?> vgVar, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.g gVar2) {
        this.A = gVar;
        this.C = obj;
        this.E = vgVar;
        this.D = aVar;
        this.B = gVar2;
        if (Thread.currentThread() != this.z) {
            this.v = g.DECODE_DATA;
            this.p.d(this);
            return;
        }
        hp.a(C0201.m82(7950));
        try {
            k();
        } finally {
            hp.d();
        }
    }

    @Override // defpackage.gp.f
    public ip f() {
        return this.c;
    }

    public void g() {
        this.H = true;
        rh rhVar = this.F;
        if (rhVar != null) {
            rhVar.cancel();
        }
    }

    /* renamed from: h */
    public int compareTo(th<?> thVar) {
        int p2 = p() - thVar.p();
        return p2 == 0 ? this.q - thVar.q : p2;
    }

    public th<R> q(com.bumptech.glide.e eVar, Object obj, zh zhVar, com.bumptech.glide.load.g gVar, int i2, int i3, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar2, vh vhVar, Map<Class<?>, m<?>> map, boolean z2, boolean z3, boolean z4, com.bumptech.glide.load.i iVar, b<R> bVar, int i4) {
        this.a.u(eVar, obj, gVar, i2, i3, vhVar, cls, cls2, gVar2, iVar, map, z2, z3, this.d);
        this.h = eVar;
        this.i = gVar;
        this.j = gVar2;
        this.k = zhVar;
        this.l = i2;
        this.m = i3;
        this.n = vhVar;
        this.x = z4;
        this.o = iVar;
        this.p = bVar;
        this.q = i4;
        this.v = g.INITIALIZE;
        this.y = obj;
        return this;
    }

    public void run() {
        String r0 = C0201.m82(7951);
        hp.b(C0201.m82(7952), this.y);
        vg<?> vgVar = this.E;
        try {
            if (this.H) {
                A();
                if (vgVar != null) {
                    vgVar.b();
                }
                hp.d();
                return;
            }
            M();
            if (vgVar != null) {
                vgVar.b();
            }
            hp.d();
        } catch (nh e2) {
            throw e2;
        } catch (Throwable th) {
            if (vgVar != null) {
                vgVar.b();
            }
            hp.d();
            throw th;
        }
    }
}
