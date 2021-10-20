package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

/* compiled from: ChildHelper */
public class b {
    public final AbstractC0021b a;
    public final a b = new a();
    public final List<View> c = new ArrayList();

    /* access modifiers changed from: package-private */
    /* compiled from: ChildHelper */
    public static class a {
        public long a = 0;
        public a b;

        private void c() {
            if (this.b == null) {
                this.b = new a();
            }
        }

        public void a(int i) {
            if (i >= 64) {
                a aVar = this.b;
                if (aVar != null) {
                    aVar.a(i - 64);
                    return;
                }
                return;
            }
            this.a &= (1 << i) ^ -1;
        }

        public int b(int i) {
            a aVar = this.b;
            if (aVar == null) {
                if (i >= 64) {
                    return Long.bitCount(this.a);
                }
                return Long.bitCount(this.a & ((1 << i) - 1));
            } else if (i < 64) {
                return Long.bitCount(this.a & ((1 << i) - 1));
            } else {
                return aVar.b(i - 64) + Long.bitCount(this.a);
            }
        }

        public boolean d(int i) {
            if (i < 64) {
                return (this.a & (1 << i)) != 0;
            }
            c();
            return this.b.d(i - 64);
        }

        public void e(int i, boolean z) {
            if (i >= 64) {
                c();
                this.b.e(i - 64, z);
                return;
            }
            boolean z2 = (this.a & Long.MIN_VALUE) != 0;
            long j = (1 << i) - 1;
            long j2 = this.a;
            this.a = ((j2 & (j ^ -1)) << 1) | (j2 & j);
            if (z) {
                h(i);
            } else {
                a(i);
            }
            if (z2 || this.b != null) {
                c();
                this.b.e(0, z2);
            }
        }

        public boolean f(int i) {
            if (i >= 64) {
                c();
                return this.b.f(i - 64);
            }
            long j = 1 << i;
            boolean z = (this.a & j) != 0;
            long j2 = this.a & (j ^ -1);
            this.a = j2;
            long j3 = j - 1;
            this.a = (j2 & j3) | Long.rotateRight((j3 ^ -1) & j2, 1);
            a aVar = this.b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.b.f(0);
            }
            return z;
        }

        public void g() {
            this.a = 0;
            a aVar = this.b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public void h(int i) {
            if (i >= 64) {
                c();
                this.b.h(i - 64);
                return;
            }
            this.a |= 1 << i;
        }

        public String toString() {
            if (this.b == null) {
                return Long.toBinaryString(this.a);
            }
            return this.b.toString() + C0201.m82(35432) + Long.toBinaryString(this.a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.b$b  reason: collision with other inner class name */
    /* compiled from: ChildHelper */
    public interface AbstractC0021b {
        void a(View view);

        void b();

        int c(View view);

        RecyclerView.d0 d(View view);

        void e(int i);

        void f(View view);

        void g(View view, int i);

        View getChildAt(int i);

        int getChildCount();

        void h(int i);

        void i(View view, int i, ViewGroup.LayoutParams layoutParams);
    }

    public b(AbstractC0021b bVar) {
        this.a = bVar;
    }

    private int h(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = this.a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            int b2 = i - (i2 - this.b.b(i2));
            if (b2 == 0) {
                while (this.b.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b2;
        }
        return -1;
    }

    private void l(View view) {
        this.c.add(view);
        this.a.a(view);
    }

    private boolean t(View view) {
        if (!this.c.remove(view)) {
            return false;
        }
        this.a.f(view);
        return true;
    }

    public void a(View view, int i, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.a.getChildCount();
        } else {
            i2 = h(i);
        }
        this.b.e(i2, z);
        if (z) {
            l(view);
        }
        this.a.g(view, i2);
    }

    public void b(View view, boolean z) {
        a(view, -1, z);
    }

    public void c(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.a.getChildCount();
        } else {
            i2 = h(i);
        }
        this.b.e(i2, z);
        if (z) {
            l(view);
        }
        this.a.i(view, i2, layoutParams);
    }

    public void d(int i) {
        int h = h(i);
        this.b.f(h);
        this.a.e(h);
    }

    public View e(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.c.get(i2);
            RecyclerView.d0 d = this.a.d(view);
            if (!(d.m() != i || d.t() || d.v())) {
                return view;
            }
        }
        return null;
    }

    public View f(int i) {
        return this.a.getChildAt(h(i));
    }

    public int g() {
        return this.a.getChildCount() - this.c.size();
    }

    public View i(int i) {
        return this.a.getChildAt(i);
    }

    public int j() {
        return this.a.getChildCount();
    }

    public void k(View view) {
        int c2 = this.a.c(view);
        if (c2 >= 0) {
            this.b.h(c2);
            l(view);
            return;
        }
        throw new IllegalArgumentException(C0201.m82(17205) + view);
    }

    public int m(View view) {
        int c2 = this.a.c(view);
        if (c2 != -1 && !this.b.d(c2)) {
            return c2 - this.b.b(c2);
        }
        return -1;
    }

    public boolean n(View view) {
        return this.c.contains(view);
    }

    public void o() {
        this.b.g();
        for (int size = this.c.size() - 1; size >= 0; size--) {
            this.a.f(this.c.get(size));
            this.c.remove(size);
        }
        this.a.b();
    }

    public void p(View view) {
        int c2 = this.a.c(view);
        if (c2 >= 0) {
            if (this.b.f(c2)) {
                t(view);
            }
            this.a.h(c2);
        }
    }

    public void q(int i) {
        int h = h(i);
        View childAt = this.a.getChildAt(h);
        if (childAt != null) {
            if (this.b.f(h)) {
                t(childAt);
            }
            this.a.h(h);
        }
    }

    public boolean r(View view) {
        int c2 = this.a.c(view);
        if (c2 == -1) {
            t(view);
            return true;
        } else if (!this.b.d(c2)) {
            return false;
        } else {
            this.b.f(c2);
            t(view);
            this.a.h(c2);
            return true;
        }
    }

    public void s(View view) {
        int c2 = this.a.c(view);
        if (c2 < 0) {
            throw new IllegalArgumentException(C0201.m82(17207) + view);
        } else if (this.b.d(c2)) {
            this.b.a(c2);
            t(view);
        } else {
            throw new RuntimeException(C0201.m82(17206) + view);
        }
    }

    public String toString() {
        return this.b.toString() + C0201.m82(17208) + this.c.size();
    }
}
