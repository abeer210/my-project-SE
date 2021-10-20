package androidx.lifecycle;

import androidx.lifecycle.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import vigqyno.C0201;

/* compiled from: LifecycleRegistry */
public class h extends d {
    private h0<f, b> a = new h0<>();
    private d.b b;
    private final WeakReference<g> c;
    private int d = 0;
    private boolean e = false;
    private boolean f = false;
    private ArrayList<d.b> g = new ArrayList<>();

    /* access modifiers changed from: package-private */
    /* compiled from: LifecycleRegistry */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0063 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0077 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0082 */
        static {
            int[] iArr = new int[d.b.values().length];
            b = iArr;
            try {
                iArr[d.b.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[d.b.CREATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[d.b.STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[d.b.RESUMED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[d.b.DESTROYED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[d.a.values().length];
            a = iArr2;
            iArr2[d.a.ON_CREATE.ordinal()] = 1;
            a[d.a.ON_STOP.ordinal()] = 2;
            a[d.a.ON_START.ordinal()] = 3;
            a[d.a.ON_PAUSE.ordinal()] = 4;
            a[d.a.ON_RESUME.ordinal()] = 5;
            a[d.a.ON_DESTROY.ordinal()] = 6;
            a[d.a.ON_ANY.ordinal()] = 7;
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: LifecycleRegistry */
    public static class b {
        public d.b a;
        public e b;

        public b(f fVar, d.b bVar) {
            this.b = j.f(fVar);
            this.a = bVar;
        }

        public void a(g gVar, d.a aVar) {
            d.b h = h.h(aVar);
            this.a = h.l(this.a, h);
            this.b.c(gVar, aVar);
            this.a = h;
        }
    }

    public h(g gVar) {
        this.c = new WeakReference<>(gVar);
        this.b = d.b.INITIALIZED;
    }

    private void d(g gVar) {
        Iterator<Map.Entry<f, b>> descendingIterator = this.a.descendingIterator();
        while (descendingIterator.hasNext() && !this.f) {
            Map.Entry<f, b> next = descendingIterator.next();
            b value = next.getValue();
            while (value.a.compareTo((Enum) this.b) > 0 && !this.f && this.a.contains(next.getKey())) {
                d.a f2 = f(value.a);
                o(h(f2));
                value.a(gVar, f2);
                n();
            }
        }
    }

    private d.b e(f fVar) {
        Map.Entry<f, b> i = this.a.i(fVar);
        d.b bVar = null;
        d.b bVar2 = i != null ? i.getValue().a : null;
        if (!this.g.isEmpty()) {
            ArrayList<d.b> arrayList = this.g;
            bVar = arrayList.get(arrayList.size() - 1);
        }
        return l(l(this.b, bVar2), bVar);
    }

    private static d.a f(d.b bVar) {
        int i = a.b[bVar.ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException();
        } else if (i == 2) {
            return d.a.ON_DESTROY;
        } else {
            if (i == 3) {
                return d.a.ON_STOP;
            }
            if (i == 4) {
                return d.a.ON_PAUSE;
            }
            if (i != 5) {
                throw new IllegalArgumentException(C0201.m82(14057) + bVar);
            }
            throw new IllegalArgumentException();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: h0<androidx.lifecycle.f, androidx.lifecycle.h$b> */
    /* JADX WARN: Multi-variable type inference failed */
    private void g(g gVar) {
        i0<K, V>.d c2 = this.a.c();
        while (c2.hasNext() && !this.f) {
            Map.Entry entry = (Map.Entry) c2.next();
            b bVar = (b) entry.getValue();
            while (bVar.a.compareTo((Enum) this.b) < 0 && !this.f && this.a.contains(entry.getKey())) {
                o(bVar.a);
                bVar.a(gVar, r(bVar.a));
                n();
            }
        }
    }

    public static d.b h(d.a aVar) {
        switch (a.a[aVar.ordinal()]) {
            case 1:
            case 2:
                return d.b.CREATED;
            case 3:
            case 4:
                return d.b.STARTED;
            case 5:
                return d.b.RESUMED;
            case 6:
                return d.b.DESTROYED;
            default:
                throw new IllegalArgumentException(C0201.m82(14058) + aVar);
        }
    }

    private boolean j() {
        if (this.a.size() == 0) {
            return true;
        }
        d.b bVar = this.a.a().getValue().a;
        d.b bVar2 = this.a.d().getValue().a;
        if (bVar == bVar2 && this.b == bVar2) {
            return true;
        }
        return false;
    }

    public static d.b l(d.b bVar, d.b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    private void m(d.b bVar) {
        if (this.b != bVar) {
            this.b = bVar;
            if (this.e || this.d != 0) {
                this.f = true;
                return;
            }
            this.e = true;
            q();
            this.e = false;
        }
    }

    private void n() {
        ArrayList<d.b> arrayList = this.g;
        arrayList.remove(arrayList.size() - 1);
    }

    private void o(d.b bVar) {
        this.g.add(bVar);
    }

    private void q() {
        g gVar = this.c.get();
        if (gVar != null) {
            while (!j()) {
                this.f = false;
                if (this.b.compareTo((Enum) this.a.a().getValue().a) < 0) {
                    d(gVar);
                }
                Map.Entry<f, b> d2 = this.a.d();
                if (!this.f && d2 != null && this.b.compareTo((Enum) d2.getValue().a) > 0) {
                    g(gVar);
                }
            }
            this.f = false;
            return;
        }
        throw new IllegalStateException(C0201.m82(14059));
    }

    private static d.a r(d.b bVar) {
        int i = a.b[bVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return d.a.ON_START;
            }
            if (i == 3) {
                return d.a.ON_RESUME;
            }
            if (i == 4) {
                throw new IllegalArgumentException();
            } else if (i != 5) {
                throw new IllegalArgumentException(C0201.m82(14060) + bVar);
            }
        }
        return d.a.ON_CREATE;
    }

    @Override // androidx.lifecycle.d
    public void a(f fVar) {
        g gVar;
        d.b bVar = this.b;
        d.b bVar2 = d.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = d.b.INITIALIZED;
        }
        b bVar3 = new b(fVar, bVar2);
        if (this.a.f(fVar, bVar3) == null && (gVar = this.c.get()) != null) {
            boolean z = this.d != 0 || this.e;
            d.b e2 = e(fVar);
            this.d++;
            while (bVar3.a.compareTo((Enum) e2) < 0 && this.a.contains(fVar)) {
                o(bVar3.a);
                bVar3.a(gVar, r(bVar3.a));
                n();
                e2 = e(fVar);
            }
            if (!z) {
                q();
            }
            this.d--;
        }
    }

    @Override // androidx.lifecycle.d
    public d.b b() {
        return this.b;
    }

    @Override // androidx.lifecycle.d
    public void c(f fVar) {
        this.a.g(fVar);
    }

    public void i(d.a aVar) {
        m(h(aVar));
    }

    @Deprecated
    public void k(d.b bVar) {
        p(bVar);
    }

    public void p(d.b bVar) {
        m(bVar);
    }
}
