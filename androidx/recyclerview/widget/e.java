package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import vigqyno.C0201;

/* compiled from: GapWorker */
public final class e implements Runnable {
    public static final ThreadLocal<e> e = new ThreadLocal<>();
    public static Comparator<c> f = new a();
    public ArrayList<RecyclerView> a = new ArrayList<>();
    public long b;
    public long c;
    private ArrayList<c> d = new ArrayList<>();

    /* compiled from: GapWorker */
    static class a implements Comparator<c> {
        /* renamed from: a */
        public int compare(c cVar, c cVar2) {
            if ((cVar.d == null) == (cVar2.d == null)) {
                boolean z = cVar.a;
                if (z == cVar2.a) {
                    int i = cVar2.b - cVar.b;
                    if (i != 0) {
                        return i;
                    }
                    int i2 = cVar.c - cVar2.c;
                    if (i2 != 0) {
                        return i2;
                    }
                    return 0;
                } else if (z) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (cVar.d == null) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"VisibleForTests"})
    /* compiled from: GapWorker */
    public static class b implements RecyclerView.o.c {
        public int a;
        public int b;
        public int[] c;
        public int d;

        @Override // androidx.recyclerview.widget.RecyclerView.o.c
        public void a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException(C0201.m82(17184));
            } else if (i2 >= 0) {
                int i3 = this.d * 2;
                int[] iArr = this.c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i3 >= iArr.length) {
                    int[] iArr3 = new int[(i3 * 2)];
                    this.c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.c;
                iArr4[i3] = i;
                iArr4[i3 + 1] = i2;
                this.d++;
            } else {
                throw new IllegalArgumentException(C0201.m82(17183));
            }
        }

        public void b() {
            int[] iArr = this.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.d = 0;
        }

        public void c(RecyclerView recyclerView, boolean z) {
            this.d = 0;
            int[] iArr = this.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.o oVar = recyclerView.mLayout;
            if (recyclerView.mAdapter != null && oVar != null && oVar.u0()) {
                if (z) {
                    if (!recyclerView.mAdapterHelper.p()) {
                        oVar.p(recyclerView.mAdapter.c(), this);
                    }
                } else if (!recyclerView.hasPendingAdapterUpdates()) {
                    oVar.o(this.a, this.b, recyclerView.mState, this);
                }
                int i = this.d;
                if (i > oVar.m) {
                    oVar.m = i;
                    oVar.n = z;
                    recyclerView.mRecycler.K();
                }
            }
        }

        public boolean d(int i) {
            if (this.c != null) {
                int i2 = this.d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        public void e(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: GapWorker */
    public static class c {
        public boolean a;
        public int b;
        public int c;
        public RecyclerView d;
        public int e;

        public void a() {
            this.a = false;
            this.b = 0;
            this.c = 0;
            this.d = null;
            this.e = 0;
        }
    }

    private void b() {
        c cVar;
        int size = this.a.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = this.a.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.mPrefetchRegistry.c(recyclerView, false);
                i += recyclerView.mPrefetchRegistry.d;
            }
        }
        this.d.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = this.a.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.mPrefetchRegistry;
                int abs = Math.abs(bVar.a) + Math.abs(bVar.b);
                for (int i5 = 0; i5 < bVar.d * 2; i5 += 2) {
                    if (i3 >= this.d.size()) {
                        cVar = new c();
                        this.d.add(cVar);
                    } else {
                        cVar = this.d.get(i3);
                    }
                    int i6 = bVar.c[i5 + 1];
                    cVar.a = i6 <= abs;
                    cVar.b = abs;
                    cVar.c = i6;
                    cVar.d = recyclerView2;
                    cVar.e = bVar.c[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.d, f);
    }

    private void c(c cVar, long j) {
        RecyclerView.d0 i = i(cVar.d, cVar.e, cVar.a ? Long.MAX_VALUE : j);
        if (i != null && i.b != null && i.s() && !i.t()) {
            h(i.b.get(), j);
        }
    }

    private void d(long j) {
        for (int i = 0; i < this.d.size(); i++) {
            c cVar = this.d.get(i);
            if (cVar.d != null) {
                c(cVar, j);
                cVar.a();
            } else {
                return;
            }
        }
    }

    public static boolean e(RecyclerView recyclerView, int i) {
        int j = recyclerView.mChildHelper.j();
        for (int i2 = 0; i2 < j; i2++) {
            RecyclerView.d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.i(i2));
            if (childViewHolderInt.c == i && !childViewHolderInt.t()) {
                return true;
            }
        }
        return false;
    }

    private void h(RecyclerView recyclerView, long j) {
        if (recyclerView != null) {
            if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.j() != 0) {
                recyclerView.removeAndRecycleViews();
            }
            b bVar = recyclerView.mPrefetchRegistry;
            bVar.c(recyclerView, true);
            if (bVar.d != 0) {
                try {
                    g2.a(C0201.m82(15351));
                    recyclerView.mState.f(recyclerView.mAdapter);
                    for (int i = 0; i < bVar.d * 2; i += 2) {
                        i(recyclerView, bVar.c[i], j);
                    }
                } finally {
                    g2.b();
                }
            }
        }
    }

    private RecyclerView.d0 i(RecyclerView recyclerView, int i, long j) {
        if (e(recyclerView, i)) {
            return null;
        }
        RecyclerView.v vVar = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.d0 I = vVar.I(i, false, j);
            if (I != null) {
                if (!I.s() || I.t()) {
                    vVar.a(I, false);
                } else {
                    vVar.B(I.a);
                }
            }
            return I;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    public void a(RecyclerView recyclerView) {
        this.a.add(recyclerView);
    }

    public void f(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.b == 0) {
            this.b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.mPrefetchRegistry.e(i, i2);
    }

    public void g(long j) {
        b();
        d(j);
    }

    public void j(RecyclerView recyclerView) {
        this.a.remove(recyclerView);
    }

    public void run() {
        try {
            g2.a(C0201.m82(15352));
            if (!this.a.isEmpty()) {
                int size = this.a.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = this.a.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(j) + this.c);
                    this.b = 0;
                    g2.b();
                }
            }
        } finally {
            this.b = 0;
            g2.b();
        }
    }
}
