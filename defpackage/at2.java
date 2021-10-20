package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import vigqyno.C0201;

/* renamed from: at2  reason: default package */
/* compiled from: PDPageTree */
public class at2 implements ct2, Iterable<zs2> {
    private final vq2 a;
    private final xs2 b;

    /* renamed from: at2$b */
    /* compiled from: PDPageTree */
    private final class b implements Iterator<zs2> {
        private final Queue<vq2> a;

        private void a(vq2 vq2) {
            if (at2.this.f(vq2)) {
                for (vq2 vq22 : at2.this.e(vq2)) {
                    a(vq22);
                }
                return;
            }
            this.a.add(vq2);
        }

        /* renamed from: b */
        public zs2 next() {
            vq2 poll = this.a.poll();
            if (poll.g0(ar2.x0) == ar2.g0) {
                return new zs2(poll, at2.this.b != null ? at2.this.b.k() : null);
            }
            throw new IllegalStateException(C0201.m82(38959) + poll);
        }

        public boolean hasNext() {
            return !this.a.isEmpty();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        private b(vq2 vq2) {
            this.a = new ArrayDeque();
            a(vq2);
        }
    }

    public at2(vq2 vq2, xs2 xs2) {
        if (vq2 != null) {
            this.a = vq2;
            this.b = xs2;
            return;
        }
        throw new IllegalArgumentException(C0201.m82(5140));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private List<vq2> e(vq2 vq2) {
        ArrayList arrayList = new ArrayList();
        sq2 sq2 = (sq2) vq2.k0(ar2.V);
        if (sq2 == null) {
            return arrayList;
        }
        int size = sq2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add((vq2) sq2.E(i));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean f(vq2 vq2) {
        return vq2.g0(ar2.x0) == ar2.h0 || vq2.x(ar2.V);
    }

    /* renamed from: d */
    public vq2 k() {
        return this.a;
    }

    public int getCount() {
        return this.a.t0(ar2.w, 0);
    }

    @Override // java.lang.Iterable
    public Iterator<zs2> iterator() {
        return new b(this.a);
    }
}
