package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import vigqyno.C0188;
import vigqyno.C0201;

/* compiled from: SnapHelper */
public abstract class n extends RecyclerView.r {
    public RecyclerView a;
    private Scroller b;
    private final RecyclerView.t c = new a();

    /* compiled from: SnapHelper */
    class a extends RecyclerView.t {
        public boolean a = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, int i) {
            super.a(recyclerView, i);
            if (i == 0 && this.a) {
                this.a = false;
                n.this.l();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void b(RecyclerView recyclerView, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.a = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: SnapHelper */
    public class b extends g {
        public b(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.z
        public void o(View view, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
            n nVar = n.this;
            RecyclerView recyclerView = nVar.a;
            if (recyclerView != null) {
                int[] c = nVar.c(recyclerView.getLayoutManager(), view);
                int i = c[0];
                int i2 = c[1];
                int w = w(Math.max(Math.abs(i), Math.abs(i2)));
                if (w > 0) {
                    aVar.d(i, i2, w, this.j);
                }
            }
        }

        @Override // androidx.recyclerview.widget.g
        public float v(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    private void g() {
        this.a.removeOnScrollListener(this.c);
        this.a.setOnFlingListener(null);
    }

    private void j() throws IllegalStateException {
        if (this.a.getOnFlingListener() == null) {
            this.a.addOnScrollListener(this.c);
            this.a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException(C0201.m82(15948));
    }

    private boolean k(RecyclerView.o oVar, int i, int i2) {
        RecyclerView.z e;
        int i3;
        if (!(oVar instanceof RecyclerView.z.b) || (e = e(oVar)) == null || (i3 = i(oVar, i, i2)) == -1) {
            return false;
        }
        e.p(i3);
        oVar.J1(e);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public boolean a(int i, int i2) {
        RecyclerView.o layoutManager = this.a.getLayoutManager();
        if (layoutManager == null || this.a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.a.getMinFlingVelocity();
        if ((Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && k(layoutManager, i, i2)) {
            return true;
        }
        return false;
    }

    public void b(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                g();
            }
            this.a = recyclerView;
            if (recyclerView != null) {
                j();
                this.b = new Scroller(this.a.getContext(), new DecelerateInterpolator());
                l();
            }
        }
    }

    public abstract int[] c(RecyclerView.o oVar, View view);

    public int[] d(int i, int i2) {
        this.b.fling(0, 0, i, i2, C0188.f23, C0188.f24, C0188.f23, C0188.f24);
        return new int[]{this.b.getFinalX(), this.b.getFinalY()};
    }

    public RecyclerView.z e(RecyclerView.o oVar) {
        return f(oVar);
    }

    @Deprecated
    public g f(RecyclerView.o oVar) {
        if (!(oVar instanceof RecyclerView.z.b)) {
            return null;
        }
        return new b(this.a.getContext());
    }

    public abstract View h(RecyclerView.o oVar);

    public abstract int i(RecyclerView.o oVar, int i, int i2);

    public void l() {
        RecyclerView.o layoutManager;
        View h;
        RecyclerView recyclerView = this.a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (h = h(layoutManager)) != null) {
            int[] c2 = c(layoutManager, h);
            if (c2[0] != 0 || c2[1] != 0) {
                this.a.smoothScrollBy(c2[0], c2[1]);
            }
        }
    }
}
