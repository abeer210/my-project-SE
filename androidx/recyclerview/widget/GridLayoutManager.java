package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.w3;
import java.util.Arrays;
import vigqyno.C0201;

public class GridLayoutManager extends LinearLayoutManager {
    public boolean I = false;
    public int J = -1;
    public int[] K;
    public View[] L;
    public final SparseIntArray M = new SparseIntArray();
    public final SparseIntArray N = new SparseIntArray();
    public c O = new a();
    public final Rect P = new Rect();
    private boolean Q;

    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int e(int i, int i2) {
            return i % i2;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i) {
            return 1;
        }
    }

    public static abstract class c {
        public final SparseIntArray a = new SparseIntArray();
        public final SparseIntArray b = new SparseIntArray();
        private boolean c = false;
        private boolean d = false;

        public static int a(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i4);
        }

        public int b(int i, int i2) {
            if (!this.d) {
                return d(i, i2);
            }
            int i3 = this.b.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int d2 = d(i, i2);
            this.b.put(i, d2);
            return d2;
        }

        public int c(int i, int i2) {
            if (!this.c) {
                return e(i, i2);
            }
            int i3 = this.a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int e = e(i, i2);
            this.a.put(i, e);
            return e;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        public int d(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int a2;
            if (!this.d || (a2 = a(this.b, i)) == -1) {
                i5 = 0;
                i4 = 0;
            } else {
                i5 = this.b.get(a2);
                i4 = a2 + 1;
                i3 = c(a2, i2) + f(a2);
                if (i3 == i2) {
                    i5++;
                }
                int f = f(i);
                while (i4 < i) {
                    int f2 = f(i4);
                    i3 += f2;
                    if (i3 == i2) {
                        i5++;
                        i3 = 0;
                    } else if (i3 > i2) {
                        i5++;
                        i3 = f2;
                    }
                    i4++;
                }
                return i3 + f <= i2 ? i5 + 1 : i5;
            }
            i3 = 0;
            int f3 = f(i);
            while (i4 < i) {
            }
            if (i3 + f3 <= i2) {
            }
        }

        public abstract int e(int i, int i2);

        public abstract int f(int i);

        public void g() {
            this.b.clear();
        }

        public void h() {
            this.a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        e3(RecyclerView.o.i0(context, attributeSet, i, i2).b);
    }

    private void N2(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i, boolean z) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = -1;
        if (z) {
            i5 = i;
            i3 = 0;
            i2 = 1;
        } else {
            i3 = i - 1;
            i2 = -1;
        }
        while (i3 != i5) {
            View view = this.L[i3];
            b bVar = (b) view.getLayoutParams();
            int a3 = a3(vVar, a0Var, h0(view));
            bVar.f = a3;
            bVar.e = i4;
            i4 += a3;
            i3 += i2;
        }
    }

    private void O2() {
        int J2 = J();
        for (int i = 0; i < J2; i++) {
            b bVar = (b) I(i).getLayoutParams();
            int a2 = bVar.a();
            this.M.put(a2, bVar.f());
            this.N.put(a2, bVar.e());
        }
    }

    private void P2(int i) {
        this.K = Q2(this.K, this.J, i);
    }

    public static int[] Q2(int[] iArr, int i, int i2) {
        int i3;
        if (!(iArr != null && iArr.length == i + 1 && iArr[iArr.length - 1] == i2)) {
            iArr = new int[(i + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    private void R2() {
        this.M.clear();
        this.N.clear();
    }

    private int S2(RecyclerView.a0 a0Var) {
        int i;
        if (!(J() == 0 || a0Var.b() == 0)) {
            T1();
            boolean r2 = r2();
            View Y1 = Y1(!r2, true);
            View X1 = X1(!r2, true);
            if (!(Y1 == null || X1 == null)) {
                int b2 = this.O.b(h0(Y1), this.J);
                int b3 = this.O.b(h0(X1), this.J);
                int min = Math.min(b2, b3);
                int max = Math.max(b2, b3);
                int b4 = this.O.b(a0Var.b() - 1, this.J) + 1;
                if (this.x) {
                    i = Math.max(0, (b4 - max) - 1);
                } else {
                    i = Math.max(0, min);
                }
                if (!r2) {
                    return i;
                }
                return Math.round((((float) i) * (((float) Math.abs(this.u.d(X1) - this.u.g(Y1))) / ((float) ((this.O.b(h0(X1), this.J) - this.O.b(h0(Y1), this.J)) + 1)))) + ((float) (this.u.m() - this.u.g(Y1))));
            }
        }
        return 0;
    }

    private int T2(RecyclerView.a0 a0Var) {
        if (!(J() == 0 || a0Var.b() == 0)) {
            T1();
            View Y1 = Y1(!r2(), true);
            View X1 = X1(!r2(), true);
            if (!(Y1 == null || X1 == null)) {
                if (!r2()) {
                    return this.O.b(a0Var.b() - 1, this.J) + 1;
                }
                int d = this.u.d(X1) - this.u.g(Y1);
                int b2 = this.O.b(h0(Y1), this.J);
                return (int) ((((float) d) / ((float) ((this.O.b(h0(X1), this.J) - b2) + 1))) * ((float) (this.O.b(a0Var.b() - 1, this.J) + 1)));
            }
        }
        return 0;
    }

    private void U2(RecyclerView.v vVar, RecyclerView.a0 a0Var, LinearLayoutManager.a aVar, int i) {
        boolean z = i == 1;
        int Z2 = Z2(vVar, a0Var, aVar.b);
        if (z) {
            while (Z2 > 0) {
                int i2 = aVar.b;
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    aVar.b = i3;
                    Z2 = Z2(vVar, a0Var, i3);
                } else {
                    return;
                }
            }
            return;
        }
        int b2 = a0Var.b() - 1;
        int i4 = aVar.b;
        while (i4 < b2) {
            int i5 = i4 + 1;
            int Z22 = Z2(vVar, a0Var, i5);
            if (Z22 <= Z2) {
                break;
            }
            i4 = i5;
            Z2 = Z22;
        }
        aVar.b = i4;
    }

    private void V2() {
        View[] viewArr = this.L;
        if (viewArr == null || viewArr.length != this.J) {
            this.L = new View[this.J];
        }
    }

    private int Y2(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i) {
        if (!a0Var.e()) {
            return this.O.b(i, this.J);
        }
        int f = vVar.f(i);
        if (f != -1) {
            return this.O.b(f, this.J);
        }
        Log.w(C0201.m82(7871), C0201.m82(7870) + i);
        return 0;
    }

    private int Z2(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i) {
        if (!a0Var.e()) {
            return this.O.c(i, this.J);
        }
        int i2 = this.N.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int f = vVar.f(i);
        if (f != -1) {
            return this.O.c(f, this.J);
        }
        Log.w(C0201.m82(7873), C0201.m82(7872) + i);
        return 0;
    }

    private int a3(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i) {
        if (!a0Var.e()) {
            return this.O.f(i);
        }
        int i2 = this.M.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int f = vVar.f(i);
        if (f != -1) {
            return this.O.f(f);
        }
        Log.w(C0201.m82(7875), C0201.m82(7874) + i);
        return 1;
    }

    private void b3(float f, int i) {
        P2(Math.max(Math.round(f * ((float) this.J)), i));
    }

    private void c3(View view, int i, boolean z) {
        int i2;
        int i3;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int W2 = W2(bVar.e, bVar.f);
        if (this.s == 1) {
            i2 = RecyclerView.o.K(W2, i, i5, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            i3 = RecyclerView.o.K(this.u.n(), X(), i4, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int K2 = RecyclerView.o.K(W2, i, i4, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int K3 = RecyclerView.o.K(this.u.n(), p0(), i5, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            i3 = K2;
            i2 = K3;
        }
        d3(view, i2, i3, z);
    }

    private void d3(View view, int i, int i2, boolean z) {
        boolean z2;
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        if (z) {
            z2 = H1(view, i, i2, pVar);
        } else {
            z2 = F1(view, i, i2, pVar);
        }
        if (z2) {
            view.measure(i, i2);
        }
    }

    private void f3() {
        int i;
        int i2;
        if (p2() == 1) {
            i2 = o0() - f0();
            i = e0();
        } else {
            i2 = W() - d0();
            i = g0();
        }
        P2(i2 - i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void C1(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.K == null) {
            super.C1(rect, i, i2);
        }
        int e0 = e0() + f0();
        int g0 = g0() + d0();
        if (this.s == 1) {
            i4 = RecyclerView.o.n(i2, rect.height() + g0, b0());
            int[] iArr = this.K;
            i3 = RecyclerView.o.n(i, iArr[iArr.length - 1] + e0, c0());
        } else {
            i3 = RecyclerView.o.n(i, rect.width() + e0, c0());
            int[] iArr2 = this.K;
            i4 = RecyclerView.o.n(i2, iArr2[iArr2.length - 1] + g0, b0());
        }
        B1(i3, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o, androidx.recyclerview.widget.LinearLayoutManager
    public RecyclerView.p D() {
        if (this.s == 0) {
            return new b(-2, -1);
        }
        return new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p E(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void E2(boolean z) {
        if (!z) {
            super.E2(false);
            return;
        }
        throw new UnsupportedOperationException(C0201.m82(7876));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p F(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new b(layoutParams);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d6, code lost:
        if (r13 == (r2 > r15)) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f6, code lost:
        if (r13 == r11) goto L_0x00b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0107  */
    @Override // androidx.recyclerview.widget.RecyclerView.o, androidx.recyclerview.widget.LinearLayoutManager
    public View J0(View view, int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        int i2;
        int i3;
        int i4;
        int i5;
        View view2;
        View view3;
        int i6;
        int i7;
        int i8;
        boolean z;
        RecyclerView.v vVar2 = vVar;
        RecyclerView.a0 a0Var2 = a0Var;
        View B = B(view);
        View view4 = null;
        if (B == null) {
            return null;
        }
        b bVar = (b) B.getLayoutParams();
        int i9 = bVar.e;
        int i10 = bVar.f + i9;
        if (super.J0(view, i, vVar, a0Var) == null) {
            return null;
        }
        if ((R1(i) == 1) != this.x) {
            i4 = J() - 1;
            i3 = -1;
            i2 = -1;
        } else {
            i3 = J();
            i4 = 0;
            i2 = 1;
        }
        boolean z2 = this.s == 1 && q2();
        int Y2 = Y2(vVar2, a0Var2, i4);
        int i11 = i4;
        int i12 = 0;
        int i13 = -1;
        int i14 = -1;
        int i15 = 0;
        View view5 = null;
        while (i11 != i3) {
            int Y22 = Y2(vVar2, a0Var2, i11);
            View I2 = I(i11);
            if (I2 == B) {
                break;
            }
            if (!I2.hasFocusable() || Y22 == Y2) {
                b bVar2 = (b) I2.getLayoutParams();
                int i16 = bVar2.e;
                view2 = B;
                int i17 = bVar2.f + i16;
                if (I2.hasFocusable() && i16 == i9 && i17 == i10) {
                    return I2;
                }
                if ((!I2.hasFocusable() || view4 != null) && (I2.hasFocusable() || view5 != null)) {
                    view3 = view5;
                    int min = Math.min(i17, i10) - Math.max(i16, i9);
                    if (I2.hasFocusable()) {
                        if (min <= i12) {
                            if (min == i12) {
                            }
                        }
                    } else if (view4 == null) {
                        i6 = i12;
                        i5 = i3;
                        z = true;
                        if (y0(I2, false, true)) {
                            i7 = i15;
                            if (min > i7) {
                                i8 = i14;
                                if (z) {
                                    if (I2.hasFocusable()) {
                                        i13 = bVar2.e;
                                        i14 = i8;
                                        i15 = i7;
                                        view5 = view3;
                                        view4 = I2;
                                        i12 = Math.min(i17, i10) - Math.max(i16, i9);
                                    } else {
                                        int i18 = bVar2.e;
                                        i15 = Math.min(i17, i10) - Math.max(i16, i9);
                                        i14 = i18;
                                        i12 = i6;
                                        view5 = I2;
                                    }
                                    i11 += i2;
                                    vVar2 = vVar;
                                    a0Var2 = a0Var;
                                    B = view2;
                                    i3 = i5;
                                }
                            } else {
                                if (min == i7) {
                                    i8 = i14;
                                    if (i16 <= i8) {
                                        z = false;
                                    }
                                } else {
                                    i8 = i14;
                                }
                                z = false;
                                if (z) {
                                }
                            }
                        }
                        i8 = i14;
                        i7 = i15;
                        z = false;
                        if (z) {
                        }
                    }
                    i6 = i12;
                    i5 = i3;
                    i8 = i14;
                    i7 = i15;
                    z = false;
                    if (z) {
                    }
                } else {
                    view3 = view5;
                }
                i6 = i12;
                i5 = i3;
                i8 = i14;
                i7 = i15;
                z = true;
                if (z) {
                }
            } else if (view4 != null) {
                break;
            } else {
                view2 = B;
                view3 = view5;
                i6 = i12;
                i5 = i3;
                i8 = i14;
                i7 = i15;
            }
            i14 = i8;
            i15 = i7;
            i12 = i6;
            view5 = view3;
            i11 += i2;
            vVar2 = vVar;
            a0Var2 = a0Var;
            B = view2;
            i3 = i5;
        }
        return view4 != null ? view4 : view5;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o, androidx.recyclerview.widget.LinearLayoutManager
    public boolean L1() {
        return this.D == null && !this.I;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int N(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.s == 1) {
            return this.J;
        }
        if (a0Var.b() < 1) {
            return 0;
        }
        return Y2(vVar, a0Var, a0Var.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void N1(RecyclerView.a0 a0Var, LinearLayoutManager.c cVar, RecyclerView.o.c cVar2) {
        int i = this.J;
        for (int i2 = 0; i2 < this.J && cVar.c(a0Var) && i > 0; i2++) {
            int i3 = cVar.d;
            cVar2.a(i3, Math.max(0, cVar.g));
            i -= this.O.f(i3);
            cVar.d += cVar.e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void P0(RecyclerView.v vVar, RecyclerView.a0 a0Var, View view, w3 w3Var) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.O0(view, w3Var);
            return;
        }
        b bVar = (b) layoutParams;
        int Y2 = Y2(vVar, a0Var, bVar.a());
        if (this.s == 0) {
            w3Var.c0(w3.c.b(bVar.e(), bVar.f(), Y2, 1, false, false));
        } else {
            w3Var.c0(w3.c.b(Y2, 1, bVar.e(), bVar.f(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void R0(RecyclerView recyclerView, int i, int i2) {
        this.O.h();
        this.O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void S0(RecyclerView recyclerView) {
        this.O.h();
        this.O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void T0(RecyclerView recyclerView, int i, int i2, int i3) {
        this.O.h();
        this.O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void U0(RecyclerView recyclerView, int i, int i2) {
        this.O.h();
        this.O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void W0(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.O.h();
        this.O.g();
    }

    public int W2(int i, int i2) {
        if (this.s != 1 || !q2()) {
            int[] iArr = this.K;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.K;
        int i3 = this.J;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o, androidx.recyclerview.widget.LinearLayoutManager
    public void X0(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (a0Var.e()) {
            O2();
        }
        super.X0(vVar, a0Var);
        R2();
    }

    public int X2() {
        return this.J;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o, androidx.recyclerview.widget.LinearLayoutManager
    public void Y0(RecyclerView.a0 a0Var) {
        super.Y0(a0Var);
        this.I = false;
    }

    public void e3(int i) {
        if (i != this.J) {
            this.I = true;
            if (i >= 1) {
                this.J = i;
                this.O.h();
                t1();
                return;
            }
            throw new IllegalArgumentException(C0201.m82(7877) + i);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public View h2(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i, int i2, int i3) {
        T1();
        int m = this.u.m();
        int i4 = this.u.i();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View I2 = I(i);
            int h0 = h0(I2);
            if (h0 >= 0 && h0 < i3 && Z2(vVar, a0Var, h0) == 0) {
                if (((RecyclerView.p) I2.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = I2;
                    }
                } else if (this.u.g(I2) < i4 && this.u.d(I2) >= m) {
                    return I2;
                } else {
                    if (view == null) {
                        view = I2;
                    }
                }
            }
            i += i5;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int k0(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.s == 0) {
            return this.J;
        }
        if (a0Var.b() < 1) {
            return 0;
        }
        return Y2(vVar, a0Var, a0Var.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean m(RecyclerView.p pVar) {
        return pVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o, androidx.recyclerview.widget.LinearLayoutManager
    public int r(RecyclerView.a0 a0Var) {
        if (this.Q) {
            return S2(a0Var);
        }
        return super.r(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o, androidx.recyclerview.widget.LinearLayoutManager
    public int s(RecyclerView.a0 a0Var) {
        if (this.Q) {
            return T2(a0Var);
        }
        return super.s(a0Var);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r17v0, resolved type: androidx.recyclerview.widget.GridLayoutManager */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void s2(RecyclerView.v vVar, RecyclerView.a0 a0Var, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        View d;
        int l = this.u.l();
        ?? r5 = 0;
        boolean z = l != 1073741824;
        int i11 = J() > 0 ? this.K[this.J] : 0;
        if (z) {
            f3();
        }
        boolean z2 = cVar.e == 1;
        int i12 = this.J;
        if (!z2) {
            i12 = Z2(vVar, a0Var, cVar.d) + a3(vVar, a0Var, cVar.d);
        }
        int i13 = 0;
        while (i13 < this.J && cVar.c(a0Var) && i12 > 0) {
            int i14 = cVar.d;
            int a3 = a3(vVar, a0Var, i14);
            if (a3 <= this.J) {
                i12 -= a3;
                if (i12 < 0 || (d = cVar.d(vVar)) == null) {
                    break;
                }
                this.L[i13] = d;
                i13++;
            } else {
                throw new IllegalArgumentException(C0201.m82(7878) + i14 + C0201.m82(7879) + a3 + C0201.m82(7880) + this.J + C0201.m82(7881));
            }
        }
        if (i13 == 0) {
            bVar.b = true;
            return;
        }
        float f = 0.0f;
        N2(vVar, a0Var, i13, z2);
        int i15 = 0;
        int i16 = 0;
        while (i15 < i13) {
            View view = this.L[i15];
            if (cVar.l == null) {
                if (z2) {
                    d(view);
                } else {
                    e(view, r5);
                }
            } else if (z2) {
                b(view);
            } else {
                int i17 = r5 == true ? 1 : 0;
                int i18 = r5 == true ? 1 : 0;
                int i19 = r5 == true ? 1 : 0;
                c(view, i17);
            }
            j(view, this.P);
            c3(view, l, r5);
            int e = this.u.e(view);
            if (e > i16) {
                i16 = e;
            }
            float f2 = (((float) this.u.f(view)) * 1.0f) / ((float) ((b) view.getLayoutParams()).f);
            if (f2 > f) {
                f = f2;
            }
            i15++;
            r5 = 0;
        }
        if (z) {
            b3(f, i11);
            i16 = 0;
            for (int i20 = 0; i20 < i13; i20++) {
                View view2 = this.L[i20];
                c3(view2, 1073741824, true);
                int e2 = this.u.e(view2);
                if (e2 > i16) {
                    i16 = e2;
                }
            }
        }
        for (int i21 = 0; i21 < i13; i21++) {
            View view3 = this.L[i21];
            if (this.u.e(view3) != i16) {
                b bVar2 = (b) view3.getLayoutParams();
                Rect rect = bVar2.b;
                int i22 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar2).topMargin + ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin;
                int i23 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar2).leftMargin + ((ViewGroup.MarginLayoutParams) bVar2).rightMargin;
                int W2 = W2(bVar2.e, bVar2.f);
                if (this.s == 1) {
                    i10 = RecyclerView.o.K(W2, 1073741824, i23, ((ViewGroup.MarginLayoutParams) bVar2).width, false);
                    i9 = View.MeasureSpec.makeMeasureSpec(i16 - i22, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - i23, 1073741824);
                    i9 = RecyclerView.o.K(W2, 1073741824, i22, ((ViewGroup.MarginLayoutParams) bVar2).height, false);
                    i10 = makeMeasureSpec;
                }
                d3(view3, i10, i9, true);
            }
        }
        int i24 = 0;
        bVar.a = i16;
        if (this.s == 1) {
            if (cVar.f == -1) {
                i4 = cVar.b;
                i2 = i4 - i16;
            } else {
                int i25 = cVar.b;
                i2 = i25;
                i4 = i16 + i25;
            }
            i3 = 0;
            i = 0;
        } else if (cVar.f == -1) {
            int i26 = cVar.b;
            i = i26 - i16;
            i2 = 0;
            i3 = i26;
            i4 = 0;
        } else {
            int i27 = cVar.b;
            i3 = i16 + i27;
            i = i27;
            i4 = 0;
            i2 = 0;
        }
        while (i24 < i13) {
            View view4 = this.L[i24];
            b bVar3 = (b) view4.getLayoutParams();
            if (this.s != 1) {
                int g0 = g0() + this.K[bVar3.e];
                i6 = g0;
                i7 = i3;
                i8 = this.u.f(view4) + g0;
            } else if (q2()) {
                int e0 = e0() + this.K[this.J - bVar3.e];
                i = e0 - this.u.f(view4);
                i8 = i4;
                i7 = e0;
                i6 = i2;
            } else {
                int e02 = e0() + this.K[bVar3.e];
                i8 = i4;
                i5 = e02;
                i6 = i2;
                i7 = this.u.f(view4) + e02;
                z0(view4, i5, i6, i7, i8);
                if (!bVar3.c() || bVar3.b()) {
                    bVar.c = true;
                }
                bVar.d |= view4.hasFocusable();
                i24++;
                i4 = i8;
                i3 = i7;
                i2 = i6;
                i = i5;
            }
            i5 = i;
            z0(view4, i5, i6, i7, i8);
            if (!bVar3.c()) {
            }
            bVar.c = true;
            bVar.d |= view4.hasFocusable();
            i24++;
            i4 = i8;
            i3 = i7;
            i2 = i6;
            i = i5;
        }
        Arrays.fill(this.L, (Object) null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o, androidx.recyclerview.widget.LinearLayoutManager
    public int u(RecyclerView.a0 a0Var) {
        if (this.Q) {
            return S2(a0Var);
        }
        return super.u(a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void u2(RecyclerView.v vVar, RecyclerView.a0 a0Var, LinearLayoutManager.a aVar, int i) {
        super.u2(vVar, a0Var, aVar, i);
        f3();
        if (a0Var.b() > 0 && !a0Var.e()) {
            U2(vVar, a0Var, aVar, i);
        }
        V2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o, androidx.recyclerview.widget.LinearLayoutManager
    public int v(RecyclerView.a0 a0Var) {
        if (this.Q) {
            return T2(a0Var);
        }
        return super.v(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o, androidx.recyclerview.widget.LinearLayoutManager
    public int w1(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        f3();
        V2();
        return super.w1(i, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o, androidx.recyclerview.widget.LinearLayoutManager
    public int y1(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        f3();
        V2();
        return super.y1(i, vVar, a0Var);
    }

    public static class b extends RecyclerView.p {
        public int e = -1;
        public int f = 0;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public int e() {
            return this.e;
        }

        public int f() {
            return this.f;
        }

        public b(int i, int i2) {
            super(i, i2);
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        e3(i);
    }
}
