package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.w3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import vigqyno.C0188;
import vigqyno.C0201;

public class StaggeredGridLayoutManager extends RecyclerView.o implements RecyclerView.z.b {
    public boolean A = false;
    private BitSet B;
    public int C = -1;
    public int D = C0188.f23;
    public d E = new d();
    private int F = 2;
    private boolean G;
    private boolean H;
    private e I;
    private int J;
    private final Rect K = new Rect();
    private final b L = new b();
    private boolean M = false;
    private boolean N = true;
    private int[] O;
    private final Runnable P = new a();
    private int s = -1;
    public f[] t;
    public j u;
    public j v;
    private int w;
    private int x;
    private final f y;
    public boolean z = false;

    class a implements Runnable {
        public a() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.S1();
        }
    }

    /* access modifiers changed from: package-private */
    public class b {
        public int a;
        public int b;
        public boolean c;
        public boolean d;
        public boolean e;
        public int[] f;

        public b() {
            c();
        }

        public void a() {
            int i;
            if (this.c) {
                i = StaggeredGridLayoutManager.this.u.i();
            } else {
                i = StaggeredGridLayoutManager.this.u.m();
            }
            this.b = i;
        }

        public void b(int i) {
            if (this.c) {
                this.b = StaggeredGridLayoutManager.this.u.i() - i;
            } else {
                this.b = StaggeredGridLayoutManager.this.u.m() + i;
            }
        }

        public void c() {
            this.a = -1;
            this.b = C0188.f23;
            this.c = false;
            this.d = false;
            this.e = false;
            int[] iArr = this.f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        public void d(f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f;
            if (iArr == null || iArr.length < length) {
                this.f = new int[StaggeredGridLayoutManager.this.t.length];
            }
            for (int i = 0; i < length; i++) {
                this.f[i] = fVarArr[i].p(C0188.f23);
            }
        }
    }

    public static class c extends RecyclerView.p {
        public f e;
        public boolean f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final int e() {
            f fVar = this.e;
            if (fVar == null) {
                return -1;
            }
            return fVar.e;
        }

        public boolean f() {
            return this.f;
        }

        public c(int i, int i2) {
            super(i, i2);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();
        public int a;
        public int b;
        public int c;
        public int[] d;
        public int e;
        public int[] f;
        public List<d.a> g;
        public boolean h;
        public boolean i;
        public boolean j;

        static class a implements Parcelable.Creator<e> {
            /* renamed from: a */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            /* renamed from: b */
            public e[] newArray(int i) {
                return new e[i];
            }
        }

        public e() {
        }

        public void a() {
            this.d = null;
            this.c = 0;
            this.a = -1;
            this.b = -1;
        }

        public void b() {
            this.d = null;
            this.c = 0;
            this.e = 0;
            this.f = null;
            this.g = null;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
            if (this.c > 0) {
                parcel.writeIntArray(this.d);
            }
            parcel.writeInt(this.e);
            if (this.e > 0) {
                parcel.writeIntArray(this.f);
            }
            parcel.writeInt(this.h ? 1 : 0);
            parcel.writeInt(this.i ? 1 : 0);
            parcel.writeInt(this.j ? 1 : 0);
            parcel.writeList(this.g);
        }

        public e(Parcel parcel) {
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            int readInt = parcel.readInt();
            this.c = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.d = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.e = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z = false;
            this.h = parcel.readInt() == 1;
            this.i = parcel.readInt() == 1;
            this.j = parcel.readInt() == 1 ? true : z;
            this.g = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.c = eVar.c;
            this.a = eVar.a;
            this.b = eVar.b;
            this.d = eVar.d;
            this.e = eVar.e;
            this.f = eVar.f;
            this.h = eVar.h;
            this.i = eVar.i;
            this.j = eVar.j;
            this.g = eVar.g;
        }
    }

    /* access modifiers changed from: package-private */
    public class f {
        public ArrayList<View> a = new ArrayList<>();
        public int b = C0188.f23;
        public int c = C0188.f23;
        public int d = 0;
        public final int e;

        public f(int i) {
            this.e = i;
        }

        public void a(View view) {
            c n = n(view);
            n.e = this;
            this.a.add(view);
            this.c = C0188.f23;
            if (this.a.size() == 1) {
                this.b = C0188.f23;
            }
            if (n.c() || n.b()) {
                this.d += StaggeredGridLayoutManager.this.u.e(view);
            }
        }

        public void b(boolean z, int i) {
            int i2;
            if (z) {
                i2 = l(C0188.f23);
            } else {
                i2 = p(C0188.f23);
            }
            e();
            if (i2 != Integer.MIN_VALUE) {
                if (z && i2 < StaggeredGridLayoutManager.this.u.i()) {
                    return;
                }
                if (z || i2 <= StaggeredGridLayoutManager.this.u.m()) {
                    if (i != Integer.MIN_VALUE) {
                        i2 += i;
                    }
                    this.c = i2;
                    this.b = i2;
                }
            }
        }

        public void c() {
            d.a f2;
            ArrayList<View> arrayList = this.a;
            View view = arrayList.get(arrayList.size() - 1);
            c n = n(view);
            this.c = StaggeredGridLayoutManager.this.u.d(view);
            if (n.f && (f2 = StaggeredGridLayoutManager.this.E.f(n.a())) != null && f2.b == 1) {
                this.c += f2.a(this.e);
            }
        }

        public void d() {
            d.a f2;
            View view = this.a.get(0);
            c n = n(view);
            this.b = StaggeredGridLayoutManager.this.u.g(view);
            if (n.f && (f2 = StaggeredGridLayoutManager.this.E.f(n.a())) != null && f2.b == -1) {
                this.b -= f2.a(this.e);
            }
        }

        public void e() {
            this.a.clear();
            q();
            this.d = 0;
        }

        public int f() {
            if (StaggeredGridLayoutManager.this.z) {
                return i(this.a.size() - 1, -1, true);
            }
            return i(0, this.a.size(), true);
        }

        public int g() {
            if (StaggeredGridLayoutManager.this.z) {
                return i(0, this.a.size(), true);
            }
            return i(this.a.size() - 1, -1, true);
        }

        public int h(int i, int i2, boolean z, boolean z2, boolean z3) {
            int m = StaggeredGridLayoutManager.this.u.m();
            int i3 = StaggeredGridLayoutManager.this.u.i();
            int i4 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.a.get(i);
                int g = StaggeredGridLayoutManager.this.u.g(view);
                int d2 = StaggeredGridLayoutManager.this.u.d(view);
                boolean z4 = false;
                boolean z5 = !z3 ? g < i3 : g <= i3;
                if (!z3 ? d2 > m : d2 >= m) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (!z || !z2) {
                        if (z2) {
                            return StaggeredGridLayoutManager.this.h0(view);
                        }
                        if (g < m || d2 > i3) {
                            return StaggeredGridLayoutManager.this.h0(view);
                        }
                    } else if (g >= m && d2 <= i3) {
                        return StaggeredGridLayoutManager.this.h0(view);
                    }
                }
                i += i4;
            }
            return -1;
        }

        public int i(int i, int i2, boolean z) {
            return h(i, i2, false, false, z);
        }

        public int j() {
            return this.d;
        }

        public int k() {
            int i = this.c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            c();
            return this.c;
        }

        public int l(int i) {
            int i2 = this.c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.a.size() == 0) {
                return i;
            }
            c();
            return this.c;
        }

        public View m(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.a.size() - 1;
                while (size >= 0) {
                    View view2 = this.a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.z && staggeredGridLayoutManager.h0(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.z && staggeredGridLayoutManager2.h0(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.z && staggeredGridLayoutManager3.h0(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.z && staggeredGridLayoutManager4.h0(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        public c n(View view) {
            return (c) view.getLayoutParams();
        }

        public int o() {
            int i = this.b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            d();
            return this.b;
        }

        public int p(int i) {
            int i2 = this.b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.a.size() == 0) {
                return i;
            }
            d();
            return this.b;
        }

        public void q() {
            this.b = C0188.f23;
            this.c = C0188.f23;
        }

        public void r(int i) {
            int i2 = this.b;
            if (i2 != Integer.MIN_VALUE) {
                this.b = i2 + i;
            }
            int i3 = this.c;
            if (i3 != Integer.MIN_VALUE) {
                this.c = i3 + i;
            }
        }

        public void s() {
            int size = this.a.size();
            View remove = this.a.remove(size - 1);
            c n = n(remove);
            n.e = null;
            if (n.c() || n.b()) {
                this.d -= StaggeredGridLayoutManager.this.u.e(remove);
            }
            if (size == 1) {
                this.b = C0188.f23;
            }
            this.c = C0188.f23;
        }

        public void t() {
            View remove = this.a.remove(0);
            c n = n(remove);
            n.e = null;
            if (this.a.size() == 0) {
                this.c = C0188.f23;
            }
            if (n.c() || n.b()) {
                this.d -= StaggeredGridLayoutManager.this.u.e(remove);
            }
            this.b = C0188.f23;
        }

        public void u(View view) {
            c n = n(view);
            n.e = this;
            this.a.add(0, view);
            this.b = C0188.f23;
            if (this.a.size() == 1) {
                this.c = C0188.f23;
            }
            if (n.c() || n.b()) {
                this.d += StaggeredGridLayoutManager.this.u.e(view);
            }
        }

        public void v(int i) {
            this.b = i;
            this.c = i;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.o.d i0 = RecyclerView.o.i0(context, attributeSet, i, i2);
        H2(i0.a);
        J2(i0.b);
        I2(i0.c);
        this.y = new f();
        a2();
    }

    private void A2(RecyclerView.v vVar, f fVar) {
        int i;
        int i2;
        if (fVar.a && !fVar.i) {
            if (fVar.b == 0) {
                if (fVar.e == -1) {
                    B2(vVar, fVar.g);
                } else {
                    C2(vVar, fVar.f);
                }
            } else if (fVar.e == -1) {
                int i3 = fVar.f;
                int m2 = i3 - m2(i3);
                if (m2 < 0) {
                    i2 = fVar.g;
                } else {
                    i2 = fVar.g - Math.min(m2, fVar.b);
                }
                B2(vVar, i2);
            } else {
                int n2 = n2(fVar.g) - fVar.g;
                if (n2 < 0) {
                    i = fVar.f;
                } else {
                    i = Math.min(n2, fVar.b) + fVar.f;
                }
                C2(vVar, i);
            }
        }
    }

    private void B2(RecyclerView.v vVar, int i) {
        for (int J2 = J() - 1; J2 >= 0; J2--) {
            View I2 = I(J2);
            if (this.u.g(I2) >= i && this.u.q(I2) >= i) {
                c cVar = (c) I2.getLayoutParams();
                if (cVar.f) {
                    for (int i2 = 0; i2 < this.s; i2++) {
                        if (this.t[i2].a.size() == 1) {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.s; i3++) {
                        this.t[i3].s();
                    }
                } else if (cVar.e.a.size() != 1) {
                    cVar.e.s();
                } else {
                    return;
                }
                m1(I2, vVar);
            } else {
                return;
            }
        }
    }

    private void C2(RecyclerView.v vVar, int i) {
        while (J() > 0) {
            View I2 = I(0);
            if (this.u.d(I2) <= i && this.u.p(I2) <= i) {
                c cVar = (c) I2.getLayoutParams();
                if (cVar.f) {
                    for (int i2 = 0; i2 < this.s; i2++) {
                        if (this.t[i2].a.size() == 1) {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.s; i3++) {
                        this.t[i3].t();
                    }
                } else if (cVar.e.a.size() != 1) {
                    cVar.e.t();
                } else {
                    return;
                }
                m1(I2, vVar);
            } else {
                return;
            }
        }
    }

    private void D2() {
        if (this.v.k() != 1073741824) {
            float f2 = 0.0f;
            int J2 = J();
            for (int i = 0; i < J2; i++) {
                View I2 = I(i);
                float e2 = (float) this.v.e(I2);
                if (e2 >= f2) {
                    if (((c) I2.getLayoutParams()).f()) {
                        e2 = (e2 * 1.0f) / ((float) this.s);
                    }
                    f2 = Math.max(f2, e2);
                }
            }
            int i2 = this.x;
            int round = Math.round(f2 * ((float) this.s));
            if (this.v.k() == Integer.MIN_VALUE) {
                round = Math.min(round, this.v.n());
            }
            P2(round);
            if (this.x != i2) {
                for (int i3 = 0; i3 < J2; i3++) {
                    View I3 = I(i3);
                    c cVar = (c) I3.getLayoutParams();
                    if (!cVar.f) {
                        if (!t2() || this.w != 1) {
                            int i4 = cVar.e.e;
                            int i5 = this.x * i4;
                            int i6 = i4 * i2;
                            if (this.w == 1) {
                                I3.offsetLeftAndRight(i5 - i6);
                            } else {
                                I3.offsetTopAndBottom(i5 - i6);
                            }
                        } else {
                            int i7 = this.s;
                            int i8 = cVar.e.e;
                            I3.offsetLeftAndRight(((-((i7 - 1) - i8)) * this.x) - ((-((i7 - 1) - i8)) * i2));
                        }
                    }
                }
            }
        }
    }

    private void E2() {
        if (this.w == 1 || !t2()) {
            this.A = this.z;
        } else {
            this.A = !this.z;
        }
    }

    private void G2(int i) {
        f fVar = this.y;
        fVar.e = i;
        int i2 = 1;
        if (this.A != (i == -1)) {
            i2 = -1;
        }
        fVar.d = i2;
    }

    private void K2(int i, int i2) {
        for (int i3 = 0; i3 < this.s; i3++) {
            if (!this.t[i3].a.isEmpty()) {
                Q2(this.t[i3], i, i2);
            }
        }
    }

    private boolean L2(RecyclerView.a0 a0Var, b bVar) {
        int i;
        if (this.G) {
            i = g2(a0Var.b());
        } else {
            i = c2(a0Var.b());
        }
        bVar.a = i;
        bVar.b = C0188.f23;
        return true;
    }

    private void M1(View view) {
        for (int i = this.s - 1; i >= 0; i--) {
            this.t[i].a(view);
        }
    }

    private void N1(b bVar) {
        int i;
        e eVar = this.I;
        int i2 = eVar.c;
        if (i2 > 0) {
            if (i2 == this.s) {
                for (int i3 = 0; i3 < this.s; i3++) {
                    this.t[i3].e();
                    e eVar2 = this.I;
                    int i4 = eVar2.d[i3];
                    if (i4 != Integer.MIN_VALUE) {
                        if (eVar2.i) {
                            i = this.u.i();
                        } else {
                            i = this.u.m();
                        }
                        i4 += i;
                    }
                    this.t[i3].v(i4);
                }
            } else {
                eVar.b();
                e eVar3 = this.I;
                eVar3.a = eVar3.b;
            }
        }
        e eVar4 = this.I;
        this.H = eVar4.j;
        I2(eVar4.h);
        E2();
        e eVar5 = this.I;
        int i5 = eVar5.a;
        if (i5 != -1) {
            this.C = i5;
            bVar.c = eVar5.i;
        } else {
            bVar.c = this.A;
        }
        e eVar6 = this.I;
        if (eVar6.e > 1) {
            d dVar = this.E;
            dVar.a = eVar6.f;
            dVar.b = eVar6.g;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    private void O2(int i, RecyclerView.a0 a0Var) {
        int i2;
        int i3;
        int c2;
        f fVar = this.y;
        boolean z2 = false;
        fVar.b = 0;
        fVar.c = i;
        if (!x0() || (c2 = a0Var.c()) == -1) {
            i3 = 0;
        } else {
            if (this.A == (c2 < i)) {
                i3 = this.u.n();
            } else {
                i2 = this.u.n();
                i3 = 0;
                if (!M()) {
                    this.y.f = this.u.m() - i2;
                    this.y.g = this.u.i() + i3;
                } else {
                    this.y.g = this.u.h() + i3;
                    this.y.f = -i2;
                }
                f fVar2 = this.y;
                fVar2.h = false;
                fVar2.a = true;
                if (this.u.k() == 0 && this.u.h() == 0) {
                    z2 = true;
                }
                fVar2.i = z2;
            }
        }
        i2 = 0;
        if (!M()) {
        }
        f fVar22 = this.y;
        fVar22.h = false;
        fVar22.a = true;
        z2 = true;
        fVar22.i = z2;
    }

    private void Q1(View view, c cVar, f fVar) {
        if (fVar.e == 1) {
            if (cVar.f) {
                M1(view);
            } else {
                cVar.e.a(view);
            }
        } else if (cVar.f) {
            z2(view);
        } else {
            cVar.e.u(view);
        }
    }

    private void Q2(f fVar, int i, int i2) {
        int j = fVar.j();
        if (i == -1) {
            if (fVar.o() + j <= i2) {
                this.B.set(fVar.e, false);
            }
        } else if (fVar.k() - j >= i2) {
            this.B.set(fVar.e, false);
        }
    }

    private int R1(int i) {
        if (J() != 0) {
            if ((i < j2()) != this.A) {
                return -1;
            }
            return 1;
        } else if (this.A) {
            return 1;
        } else {
            return -1;
        }
    }

    private int R2(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode);
        }
        return i;
    }

    private boolean T1(f fVar) {
        if (this.A) {
            if (fVar.k() < this.u.i()) {
                ArrayList<View> arrayList = fVar.a;
                return !fVar.n(arrayList.get(arrayList.size() - 1)).f;
            }
        } else if (fVar.o() > this.u.m()) {
            return !fVar.n(fVar.a.get(0)).f;
        }
        return false;
    }

    private int U1(RecyclerView.a0 a0Var) {
        if (J() == 0) {
            return 0;
        }
        return l.a(a0Var, this.u, e2(!this.N), d2(!this.N), this, this.N);
    }

    private int V1(RecyclerView.a0 a0Var) {
        if (J() == 0) {
            return 0;
        }
        return l.b(a0Var, this.u, e2(!this.N), d2(!this.N), this, this.N, this.A);
    }

    private int W1(RecyclerView.a0 a0Var) {
        if (J() == 0) {
            return 0;
        }
        return l.c(a0Var, this.u, e2(!this.N), d2(!this.N), this, this.N);
    }

    private int X1(int i) {
        if (i == 1) {
            return (this.w != 1 && t2()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.w != 1 && t2()) ? -1 : 1;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130 && this.w == 1) {
                        return 1;
                    }
                    return C0188.f23;
                } else if (this.w == 0) {
                    return 1;
                } else {
                    return C0188.f23;
                }
            } else if (this.w == 1) {
                return -1;
            } else {
                return C0188.f23;
            }
        } else if (this.w == 0) {
            return -1;
        } else {
            return C0188.f23;
        }
    }

    private d.a Y1(int i) {
        d.a aVar = new d.a();
        aVar.c = new int[this.s];
        for (int i2 = 0; i2 < this.s; i2++) {
            aVar.c[i2] = i - this.t[i2].l(i);
        }
        return aVar;
    }

    private d.a Z1(int i) {
        d.a aVar = new d.a();
        aVar.c = new int[this.s];
        for (int i2 = 0; i2 < this.s; i2++) {
            aVar.c[i2] = this.t[i2].p(i) - i;
        }
        return aVar;
    }

    private void a2() {
        this.u = j.b(this, this.w);
        this.v = j.b(this, 1 - this.w);
    }

    private int b2(RecyclerView.v vVar, f fVar, RecyclerView.a0 a0Var) {
        int i;
        int i2;
        int i3;
        f fVar2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        int i10;
        int i11;
        int i12;
        boolean z3 = false;
        this.B.set(0, this.s, true);
        if (this.y.i) {
            i = fVar.e == 1 ? C0188.f24 : C0188.f23;
        } else {
            if (fVar.e == 1) {
                i12 = fVar.g + fVar.b;
            } else {
                i12 = fVar.f - fVar.b;
            }
            i = i12;
        }
        K2(fVar.e, i);
        if (this.A) {
            i2 = this.u.i();
        } else {
            i2 = this.u.m();
        }
        boolean z4 = false;
        while (fVar.a(a0Var) && (this.y.i || !this.B.isEmpty())) {
            View b2 = fVar.b(vVar);
            c cVar = (c) b2.getLayoutParams();
            int a2 = cVar.a();
            int g = this.E.g(a2);
            boolean z5 = g == -1;
            if (z5) {
                if (cVar.f) {
                    f[] fVarArr = this.t;
                    char c2 = z3 ? 1 : 0;
                    char c3 = z3 ? 1 : 0;
                    char c4 = z3 ? 1 : 0;
                    fVar2 = fVarArr[c2];
                } else {
                    fVar2 = p2(fVar);
                }
                this.E.n(a2, fVar2);
            } else {
                fVar2 = this.t[g];
            }
            cVar.e = fVar2;
            if (fVar.e == 1) {
                d(b2);
            } else {
                int i13 = z3 ? 1 : 0;
                int i14 = z3 ? 1 : 0;
                int i15 = z3 ? 1 : 0;
                e(b2, i13);
            }
            v2(b2, cVar, z3);
            if (fVar.e == 1) {
                if (cVar.f) {
                    i11 = l2(i2);
                } else {
                    i11 = fVar2.l(i2);
                }
                int e2 = this.u.e(b2) + i11;
                if (z5 && cVar.f) {
                    d.a Y1 = Y1(i11);
                    Y1.b = -1;
                    Y1.a = a2;
                    this.E.a(Y1);
                }
                i4 = e2;
                i5 = i11;
            } else {
                if (cVar.f) {
                    i10 = o2(i2);
                } else {
                    i10 = fVar2.p(i2);
                }
                i5 = i10 - this.u.e(b2);
                if (z5 && cVar.f) {
                    d.a Z1 = Z1(i10);
                    Z1.b = 1;
                    Z1.a = a2;
                    this.E.a(Z1);
                }
                i4 = i10;
            }
            if (cVar.f && fVar.d == -1) {
                if (z5) {
                    this.M = true;
                } else {
                    if (fVar.e == 1) {
                        z2 = O1();
                    } else {
                        z2 = P1();
                    }
                    if (!z2) {
                        d.a f2 = this.E.f(a2);
                        if (f2 != null) {
                            f2.d = true;
                        }
                        this.M = true;
                    }
                }
            }
            Q1(b2, cVar, fVar);
            if (!t2() || this.w != 1) {
                if (cVar.f) {
                    i8 = this.v.m();
                } else {
                    i8 = (fVar2.e * this.x) + this.v.m();
                }
                i7 = i8;
                i6 = this.v.e(b2) + i8;
            } else {
                if (cVar.f) {
                    i9 = this.v.i();
                } else {
                    i9 = this.v.i() - (((this.s - 1) - fVar2.e) * this.x);
                }
                i6 = i9;
                i7 = i9 - this.v.e(b2);
            }
            if (this.w == 1) {
                z0(b2, i7, i5, i6, i4);
            } else {
                z0(b2, i5, i7, i4, i6);
            }
            if (cVar.f) {
                K2(this.y.e, i);
            } else {
                Q2(fVar2, this.y.e, i);
            }
            A2(vVar, this.y);
            if (this.y.h && b2.hasFocusable()) {
                if (cVar.f) {
                    this.B.clear();
                } else {
                    this.B.set(fVar2.e, false);
                    z4 = true;
                    z3 = false;
                }
            }
            z4 = true;
            z3 = false;
        }
        if (!z4) {
            A2(vVar, this.y);
        }
        if (this.y.e == -1) {
            i3 = this.u.m() - o2(this.u.m());
        } else {
            i3 = l2(this.u.i()) - this.u.i();
        }
        if (i3 > 0) {
            return Math.min(fVar.b, i3);
        }
        return 0;
    }

    private int c2(int i) {
        int J2 = J();
        for (int i2 = 0; i2 < J2; i2++) {
            int h0 = h0(I(i2));
            if (h0 >= 0 && h0 < i) {
                return h0;
            }
        }
        return 0;
    }

    private int g2(int i) {
        for (int J2 = J() - 1; J2 >= 0; J2--) {
            int h0 = h0(I(J2));
            if (h0 >= 0 && h0 < i) {
                return h0;
            }
        }
        return 0;
    }

    private void h2(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z2) {
        int i;
        int l2 = l2(C0188.f23);
        if (l2 != Integer.MIN_VALUE && (i = this.u.i() - l2) > 0) {
            int i2 = i - (-F2(-i, vVar, a0Var));
            if (z2 && i2 > 0) {
                this.u.r(i2);
            }
        }
    }

    private void i2(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z2) {
        int m;
        int o2 = o2(C0188.f24);
        if (o2 != Integer.MAX_VALUE && (m = o2 - this.u.m()) > 0) {
            int F2 = m - F2(m, vVar, a0Var);
            if (z2 && F2 > 0) {
                this.u.r(-F2);
            }
        }
    }

    private int l2(int i) {
        int l = this.t[0].l(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int l2 = this.t[i2].l(i);
            if (l2 > l) {
                l = l2;
            }
        }
        return l;
    }

    private int m2(int i) {
        int p = this.t[0].p(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int p2 = this.t[i2].p(i);
            if (p2 > p) {
                p = p2;
            }
        }
        return p;
    }

    private int n2(int i) {
        int l = this.t[0].l(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int l2 = this.t[i2].l(i);
            if (l2 < l) {
                l = l2;
            }
        }
        return l;
    }

    private int o2(int i) {
        int p = this.t[0].p(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int p2 = this.t[i2].p(i);
            if (p2 < p) {
                p = p2;
            }
        }
        return p;
    }

    private f p2(f fVar) {
        int i;
        int i2;
        int i3 = -1;
        if (x2(fVar.e)) {
            i2 = this.s - 1;
            i = -1;
        } else {
            i2 = 0;
            i3 = this.s;
            i = 1;
        }
        f fVar2 = null;
        if (fVar.e == 1) {
            int i4 = C0188.f24;
            int m = this.u.m();
            while (i2 != i3) {
                f fVar3 = this.t[i2];
                int l = fVar3.l(m);
                if (l < i4) {
                    fVar2 = fVar3;
                    i4 = l;
                }
                i2 += i;
            }
            return fVar2;
        }
        int i5 = C0188.f23;
        int i6 = this.u.i();
        while (i2 != i3) {
            f fVar4 = this.t[i2];
            int p = fVar4.p(i6);
            if (p > i5) {
                fVar2 = fVar4;
                i5 = p;
            }
            i2 += i;
        }
        return fVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    private void q2(int i, int i2, int i3) {
        int i4;
        int i5;
        int k2 = this.A ? k2() : j2();
        if (i3 != 8) {
            i5 = i + i2;
        } else if (i < i2) {
            i5 = i2 + 1;
        } else {
            i5 = i + 1;
            i4 = i2;
            this.E.h(i4);
            if (i3 != 1) {
                this.E.j(i, i2);
            } else if (i3 == 2) {
                this.E.k(i, i2);
            } else if (i3 == 8) {
                this.E.k(i, 1);
                this.E.j(i2, 1);
            }
            if (i5 <= k2) {
                if (i4 <= (this.A ? j2() : k2())) {
                    t1();
                    return;
                }
                return;
            }
            return;
        }
        i4 = i;
        this.E.h(i4);
        if (i3 != 1) {
        }
        if (i5 <= k2) {
        }
    }

    private void u2(View view, int i, int i2, boolean z2) {
        boolean z3;
        j(view, this.K);
        c cVar = (c) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.K;
        int R2 = R2(i, i3 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i4 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.K;
        int R22 = R2(i2, i4 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z2) {
            z3 = H1(view, R2, R22, cVar);
        } else {
            z3 = F1(view, R2, R22, cVar);
        }
        if (z3) {
            view.measure(R2, R22);
        }
    }

    private void v2(View view, c cVar, boolean z2) {
        if (cVar.f) {
            if (this.w == 1) {
                u2(view, this.J, RecyclerView.o.K(W(), X(), g0() + d0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z2);
            } else {
                u2(view, RecyclerView.o.K(o0(), p0(), e0() + f0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.J, z2);
            }
        } else if (this.w == 1) {
            u2(view, RecyclerView.o.K(this.x, p0(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false), RecyclerView.o.K(W(), X(), g0() + d0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z2);
        } else {
            u2(view, RecyclerView.o.K(o0(), p0(), e0() + f0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.o.K(this.x, X(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false), z2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0157, code lost:
        if (S1() != false) goto L_0x015b;
     */
    private void w2(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z2) {
        e eVar;
        b bVar = this.L;
        if (!(this.I == null && this.C == -1) && a0Var.b() == 0) {
            k1(vVar);
            bVar.c();
            return;
        }
        boolean z3 = true;
        boolean z4 = (bVar.e && this.C == -1 && this.I == null) ? false : true;
        if (z4) {
            bVar.c();
            if (this.I != null) {
                N1(bVar);
            } else {
                E2();
                bVar.c = this.A;
            }
            N2(a0Var, bVar);
            bVar.e = true;
        }
        if (this.I == null && this.C == -1 && !(bVar.c == this.G && t2() == this.H)) {
            this.E.b();
            bVar.d = true;
        }
        if (J() > 0 && ((eVar = this.I) == null || eVar.c < 1)) {
            if (bVar.d) {
                for (int i = 0; i < this.s; i++) {
                    this.t[i].e();
                    int i2 = bVar.b;
                    if (i2 != Integer.MIN_VALUE) {
                        this.t[i].v(i2);
                    }
                }
            } else if (z4 || this.L.f == null) {
                for (int i3 = 0; i3 < this.s; i3++) {
                    this.t[i3].b(this.A, bVar.b);
                }
                this.L.d(this.t);
            } else {
                for (int i4 = 0; i4 < this.s; i4++) {
                    f fVar = this.t[i4];
                    fVar.e();
                    fVar.v(this.L.f[i4]);
                }
            }
        }
        w(vVar);
        this.y.a = false;
        this.M = false;
        P2(this.v.n());
        O2(bVar.a, a0Var);
        if (bVar.c) {
            G2(-1);
            b2(vVar, this.y, a0Var);
            G2(1);
            f fVar2 = this.y;
            fVar2.c = bVar.a + fVar2.d;
            b2(vVar, fVar2, a0Var);
        } else {
            G2(1);
            b2(vVar, this.y, a0Var);
            G2(-1);
            f fVar3 = this.y;
            fVar3.c = bVar.a + fVar3.d;
            b2(vVar, fVar3, a0Var);
        }
        D2();
        if (J() > 0) {
            if (this.A) {
                h2(vVar, a0Var, true);
                i2(vVar, a0Var, false);
            } else {
                i2(vVar, a0Var, true);
                h2(vVar, a0Var, false);
            }
        }
        if (z2 && !a0Var.e()) {
            if (this.F != 0 && J() > 0 && (this.M || r2() != null)) {
                o1(this.P);
            }
        }
        z3 = false;
        if (a0Var.e()) {
            this.L.c();
        }
        this.G = bVar.c;
        this.H = t2();
        if (z3) {
            this.L.c();
            w2(vVar, a0Var, false);
        }
    }

    private boolean x2(int i) {
        if (this.w == 0) {
            if ((i == -1) != this.A) {
                return true;
            }
            return false;
        }
        if (((i == -1) == this.A) == t2()) {
            return true;
        }
        return false;
    }

    private void z2(View view) {
        for (int i = this.s - 1; i >= 0; i--) {
            this.t[i].u(view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void C0(int i) {
        super.C0(i);
        for (int i2 = 0; i2 < this.s; i2++) {
            this.t[i2].r(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void C1(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int e0 = e0() + f0();
        int g0 = g0() + d0();
        if (this.w == 1) {
            i4 = RecyclerView.o.n(i2, rect.height() + g0, b0());
            i3 = RecyclerView.o.n(i, (this.x * this.s) + e0, c0());
        } else {
            i3 = RecyclerView.o.n(i, rect.width() + e0, c0());
            i4 = RecyclerView.o.n(i2, (this.x * this.s) + g0, b0());
        }
        B1(i3, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p D() {
        if (this.w == 0) {
            return new c(-2, -1);
        }
        return new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void D0(int i) {
        super.D0(i);
        for (int i2 = 0; i2 < this.s; i2++) {
            this.t[i2].r(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p E(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p F(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new c(layoutParams);
    }

    public int F2(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (J() == 0 || i == 0) {
            return 0;
        }
        y2(i, a0Var);
        int b2 = b2(vVar, this.y, a0Var);
        if (this.y.b >= b2) {
            i = i < 0 ? -b2 : b2;
        }
        this.u.r(-i);
        this.G = this.A;
        f fVar = this.y;
        fVar.b = 0;
        A2(vVar, fVar);
        return i;
    }

    public void H2(int i) {
        if (i == 0 || i == 1) {
            g(null);
            if (i != this.w) {
                this.w = i;
                j jVar = this.u;
                this.u = this.v;
                this.v = jVar;
                t1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(C0201.m82(15244));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void I0(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.I0(recyclerView, vVar);
        o1(this.P);
        for (int i = 0; i < this.s; i++) {
            this.t[i].e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void I1(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i) {
        g gVar = new g(recyclerView.getContext());
        gVar.p(i);
        J1(gVar);
    }

    public void I2(boolean z2) {
        g(null);
        e eVar = this.I;
        if (!(eVar == null || eVar.h == z2)) {
            eVar.h = z2;
        }
        this.z = z2;
        t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View J0(View view, int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        View B2;
        int i2;
        int i3;
        int i4;
        int i5;
        View m;
        if (J() == 0 || (B2 = B(view)) == null) {
            return null;
        }
        E2();
        int X1 = X1(i);
        if (X1 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) B2.getLayoutParams();
        boolean z2 = cVar.f;
        f fVar = cVar.e;
        if (X1 == 1) {
            i2 = k2();
        } else {
            i2 = j2();
        }
        O2(i2, a0Var);
        G2(X1);
        f fVar2 = this.y;
        fVar2.c = fVar2.d + i2;
        fVar2.b = (int) (((float) this.u.n()) * 0.33333334f);
        f fVar3 = this.y;
        fVar3.h = true;
        fVar3.a = false;
        b2(vVar, fVar3, a0Var);
        this.G = this.A;
        if (!(z2 || (m = fVar.m(i2, X1)) == null || m == B2)) {
            return m;
        }
        if (x2(X1)) {
            for (int i6 = this.s - 1; i6 >= 0; i6--) {
                View m2 = this.t[i6].m(i2, X1);
                if (!(m2 == null || m2 == B2)) {
                    return m2;
                }
            }
        } else {
            for (int i7 = 0; i7 < this.s; i7++) {
                View m3 = this.t[i7].m(i2, X1);
                if (!(m3 == null || m3 == B2)) {
                    return m3;
                }
            }
        }
        boolean z3 = (this.z ^ true) == (X1 == -1);
        if (!z2) {
            if (z3) {
                i5 = fVar.f();
            } else {
                i5 = fVar.g();
            }
            View C2 = C(i5);
            if (!(C2 == null || C2 == B2)) {
                return C2;
            }
        }
        if (x2(X1)) {
            for (int i8 = this.s - 1; i8 >= 0; i8--) {
                if (i8 != fVar.e) {
                    if (z3) {
                        i4 = this.t[i8].f();
                    } else {
                        i4 = this.t[i8].g();
                    }
                    View C3 = C(i4);
                    if (!(C3 == null || C3 == B2)) {
                        return C3;
                    }
                }
            }
        } else {
            for (int i9 = 0; i9 < this.s; i9++) {
                if (z3) {
                    i3 = this.t[i9].f();
                } else {
                    i3 = this.t[i9].g();
                }
                View C4 = C(i3);
                if (!(C4 == null || C4 == B2)) {
                    return C4;
                }
            }
        }
        return null;
    }

    public void J2(int i) {
        g(null);
        if (i != this.s) {
            s2();
            this.s = i;
            this.B = new BitSet(this.s);
            this.t = new f[this.s];
            for (int i2 = 0; i2 < this.s; i2++) {
                this.t[i2] = new f(i2);
            }
            t1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void K0(AccessibilityEvent accessibilityEvent) {
        super.K0(accessibilityEvent);
        if (J() > 0) {
            View e2 = e2(false);
            View d2 = d2(false);
            if (e2 != null && d2 != null) {
                int h0 = h0(e2);
                int h02 = h0(d2);
                if (h0 < h02) {
                    accessibilityEvent.setFromIndex(h0);
                    accessibilityEvent.setToIndex(h02);
                    return;
                }
                accessibilityEvent.setFromIndex(h02);
                accessibilityEvent.setToIndex(h0);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean L1() {
        return this.I == null;
    }

    public boolean M2(RecyclerView.a0 a0Var, b bVar) {
        int i;
        int i2;
        int i3;
        boolean z2 = false;
        if (!a0Var.e() && (i = this.C) != -1) {
            if (i < 0 || i >= a0Var.b()) {
                this.C = -1;
                this.D = C0188.f23;
            } else {
                e eVar = this.I;
                if (eVar == null || eVar.a == -1 || eVar.c < 1) {
                    View C2 = C(this.C);
                    if (C2 != null) {
                        if (this.A) {
                            i2 = k2();
                        } else {
                            i2 = j2();
                        }
                        bVar.a = i2;
                        if (this.D != Integer.MIN_VALUE) {
                            if (bVar.c) {
                                bVar.b = (this.u.i() - this.D) - this.u.d(C2);
                            } else {
                                bVar.b = (this.u.m() + this.D) - this.u.g(C2);
                            }
                            return true;
                        } else if (this.u.e(C2) > this.u.n()) {
                            if (bVar.c) {
                                i3 = this.u.i();
                            } else {
                                i3 = this.u.m();
                            }
                            bVar.b = i3;
                            return true;
                        } else {
                            int g = this.u.g(C2) - this.u.m();
                            if (g < 0) {
                                bVar.b = -g;
                                return true;
                            }
                            int i4 = this.u.i() - this.u.d(C2);
                            if (i4 < 0) {
                                bVar.b = i4;
                                return true;
                            }
                            bVar.b = C0188.f23;
                        }
                    } else {
                        int i5 = this.C;
                        bVar.a = i5;
                        int i6 = this.D;
                        if (i6 == Integer.MIN_VALUE) {
                            if (R1(i5) == 1) {
                                z2 = true;
                            }
                            bVar.c = z2;
                            bVar.a();
                        } else {
                            bVar.b(i6);
                        }
                        bVar.d = true;
                    }
                } else {
                    bVar.b = C0188.f23;
                    bVar.a = this.C;
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int N(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.w == 1) {
            return this.s;
        }
        return super.N(vVar, a0Var);
    }

    public void N2(RecyclerView.a0 a0Var, b bVar) {
        if (!M2(a0Var, bVar) && !L2(a0Var, bVar)) {
            bVar.a();
            bVar.a = 0;
        }
    }

    public boolean O1() {
        int l = this.t[0].l(C0188.f23);
        for (int i = 1; i < this.s; i++) {
            if (this.t[i].l(C0188.f23) != l) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void P0(RecyclerView.v vVar, RecyclerView.a0 a0Var, View view, w3 w3Var) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            super.O0(view, w3Var);
            return;
        }
        c cVar = (c) layoutParams;
        if (this.w == 0) {
            w3Var.c0(w3.c.b(cVar.e(), cVar.f ? this.s : 1, -1, -1, false, false));
        } else {
            w3Var.c0(w3.c.b(-1, -1, cVar.e(), cVar.f ? this.s : 1, false, false));
        }
    }

    public boolean P1() {
        int p = this.t[0].p(C0188.f23);
        for (int i = 1; i < this.s; i++) {
            if (this.t[i].p(C0188.f23) != p) {
                return false;
            }
        }
        return true;
    }

    public void P2(int i) {
        this.x = i / this.s;
        this.J = View.MeasureSpec.makeMeasureSpec(i, this.v.k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void R0(RecyclerView recyclerView, int i, int i2) {
        q2(i, i2, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void S0(RecyclerView recyclerView) {
        this.E.b();
        t1();
    }

    public boolean S1() {
        int i;
        int i2;
        if (J() == 0 || this.F == 0 || !r0()) {
            return false;
        }
        if (this.A) {
            i2 = k2();
            i = j2();
        } else {
            i2 = j2();
            i = k2();
        }
        if (i2 == 0 && r2() != null) {
            this.E.b();
            u1();
            t1();
            return true;
        } else if (!this.M) {
            return false;
        } else {
            int i3 = this.A ? -1 : 1;
            int i4 = i + 1;
            d.a e2 = this.E.e(i2, i4, i3, true);
            if (e2 == null) {
                this.M = false;
                this.E.d(i4);
                return false;
            }
            d.a e3 = this.E.e(i2, e2.a, i3 * -1, true);
            if (e3 == null) {
                this.E.d(e2.a);
            } else {
                this.E.d(e3.a + 1);
            }
            u1();
            t1();
            return true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void T0(RecyclerView recyclerView, int i, int i2, int i3) {
        q2(i, i2, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void U0(RecyclerView recyclerView, int i, int i2) {
        q2(i, i2, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void W0(RecyclerView recyclerView, int i, int i2, Object obj) {
        q2(i, i2, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void X0(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        w2(vVar, a0Var, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Y0(RecyclerView.a0 a0Var) {
        super.Y0(a0Var);
        this.C = -1;
        this.D = C0188.f23;
        this.I = null;
        this.L.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public PointF a(int i) {
        int R1 = R1(i);
        PointF pointF = new PointF();
        if (R1 == 0) {
            return null;
        }
        if (this.w == 0) {
            pointF.x = (float) R1;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) R1;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void c1(Parcelable parcelable) {
        if (parcelable instanceof e) {
            this.I = (e) parcelable;
            t1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable d1() {
        int i;
        int i2;
        int i3;
        int[] iArr;
        if (this.I != null) {
            return new e(this.I);
        }
        e eVar = new e();
        eVar.h = this.z;
        eVar.i = this.G;
        eVar.j = this.H;
        d dVar = this.E;
        if (dVar == null || (iArr = dVar.a) == null) {
            eVar.e = 0;
        } else {
            eVar.f = iArr;
            eVar.e = iArr.length;
            eVar.g = dVar.b;
        }
        if (J() > 0) {
            if (this.G) {
                i = k2();
            } else {
                i = j2();
            }
            eVar.a = i;
            eVar.b = f2();
            int i4 = this.s;
            eVar.c = i4;
            eVar.d = new int[i4];
            for (int i5 = 0; i5 < this.s; i5++) {
                if (this.G) {
                    i2 = this.t[i5].l(C0188.f23);
                    if (i2 != Integer.MIN_VALUE) {
                        i3 = this.u.i();
                    } else {
                        eVar.d[i5] = i2;
                    }
                } else {
                    i2 = this.t[i5].p(C0188.f23);
                    if (i2 != Integer.MIN_VALUE) {
                        i3 = this.u.m();
                    } else {
                        eVar.d[i5] = i2;
                    }
                }
                i2 -= i3;
                eVar.d[i5] = i2;
            }
        } else {
            eVar.a = -1;
            eVar.b = -1;
            eVar.c = 0;
        }
        return eVar;
    }

    public View d2(boolean z2) {
        int m = this.u.m();
        int i = this.u.i();
        View view = null;
        for (int J2 = J() - 1; J2 >= 0; J2--) {
            View I2 = I(J2);
            int g = this.u.g(I2);
            int d2 = this.u.d(I2);
            if (d2 > m && g < i) {
                if (d2 <= i || !z2) {
                    return I2;
                }
                if (view == null) {
                    view = I2;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void e1(int i) {
        if (i == 0) {
            S1();
        }
    }

    public View e2(boolean z2) {
        int m = this.u.m();
        int i = this.u.i();
        int J2 = J();
        View view = null;
        for (int i2 = 0; i2 < J2; i2++) {
            View I2 = I(i2);
            int g = this.u.g(I2);
            if (this.u.d(I2) > m && g < i) {
                if (g >= m || !z2) {
                    return I2;
                }
                if (view == null) {
                    view = I2;
                }
            }
        }
        return view;
    }

    public int f2() {
        View view;
        if (this.A) {
            view = d2(true);
        } else {
            view = e2(true);
        }
        if (view == null) {
            return -1;
        }
        return h0(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g(String str) {
        if (this.I == null) {
            super.g(str);
        }
    }

    public int j2() {
        if (J() == 0) {
            return 0;
        }
        return h0(I(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean k() {
        return this.w == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int k0(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.w == 0) {
            return this.s;
        }
        return super.k0(vVar, a0Var);
    }

    public int k2() {
        int J2 = J();
        if (J2 == 0) {
            return 0;
        }
        return h0(I(J2 - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean l() {
        return this.w == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean m(RecyclerView.p pVar) {
        return pVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void o(int i, int i2, RecyclerView.a0 a0Var, RecyclerView.o.c cVar) {
        int i3;
        int i4;
        if (this.w != 0) {
            i = i2;
        }
        if (!(J() == 0 || i == 0)) {
            y2(i, a0Var);
            int[] iArr = this.O;
            if (iArr == null || iArr.length < this.s) {
                this.O = new int[this.s];
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.s; i6++) {
                f fVar = this.y;
                if (fVar.d == -1) {
                    i4 = fVar.f;
                    i3 = this.t[i6].p(i4);
                } else {
                    i4 = this.t[i6].l(fVar.g);
                    i3 = this.y.g;
                }
                int i7 = i4 - i3;
                if (i7 >= 0) {
                    this.O[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.O, 0, i5);
            for (int i8 = 0; i8 < i5 && this.y.a(a0Var); i8++) {
                cVar.a(this.y.c, this.O[i8]);
                f fVar2 = this.y;
                fVar2.c += fVar2.d;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int q(RecyclerView.a0 a0Var) {
        return U1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int r(RecyclerView.a0 a0Var) {
        return V1(a0Var);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0086, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        r10 = false;
     */
    public View r2() {
        int i;
        int i2;
        int J2 = J() - 1;
        BitSet bitSet = new BitSet(this.s);
        bitSet.set(0, this.s, true);
        int i3 = -1;
        char c2 = (this.w != 1 || !t2()) ? (char) 65535 : 1;
        if (this.A) {
            i = -1;
        } else {
            i = J2 + 1;
            J2 = 0;
        }
        if (J2 < i) {
            i3 = 1;
        }
        while (J2 != i) {
            View I2 = I(J2);
            c cVar = (c) I2.getLayoutParams();
            if (bitSet.get(cVar.e.e)) {
                if (T1(cVar.e)) {
                    return I2;
                }
                bitSet.clear(cVar.e.e);
            }
            if (!cVar.f && (i2 = J2 + i3) != i) {
                View I3 = I(i2);
                if (this.A) {
                    int d2 = this.u.d(I2);
                    int d3 = this.u.d(I3);
                    if (d2 < d3) {
                        return I2;
                    }
                } else {
                    int g = this.u.g(I2);
                    int g2 = this.u.g(I3);
                    if (g > g2) {
                        return I2;
                    }
                }
                boolean z2 = true;
                if (!z2) {
                    continue;
                } else {
                    if ((cVar.e.e - ((c) I3.getLayoutParams()).e.e < 0) != (c2 < 0)) {
                        return I2;
                    }
                }
            }
            J2 += i3;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int s(RecyclerView.a0 a0Var) {
        return W1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean s0() {
        return this.F != 0;
    }

    public void s2() {
        this.E.b();
        t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int t(RecyclerView.a0 a0Var) {
        return U1(a0Var);
    }

    public boolean t2() {
        return Z() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int u(RecyclerView.a0 a0Var) {
        return V1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int v(RecyclerView.a0 a0Var) {
        return W1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int w1(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return F2(i, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void x1(int i) {
        e eVar = this.I;
        if (!(eVar == null || eVar.a == i)) {
            eVar.a();
        }
        this.C = i;
        this.D = C0188.f23;
        t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int y1(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return F2(i, vVar, a0Var);
    }

    public void y2(int i, RecyclerView.a0 a0Var) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = k2();
            i2 = 1;
        } else {
            i3 = j2();
            i2 = -1;
        }
        this.y.a = true;
        O2(i3, a0Var);
        G2(i2);
        f fVar = this.y;
        fVar.c = i3 + fVar.d;
        fVar.b = Math.abs(i);
    }

    /* access modifiers changed from: package-private */
    public static class d {
        public int[] a;
        public List<a> b;

        private int i(int i) {
            if (this.b == null) {
                return -1;
            }
            a f = f(i);
            if (f != null) {
                this.b.remove(f);
            }
            int size = this.b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (this.b.get(i2).a >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return -1;
            }
            this.b.remove(i2);
            return this.b.get(i2).a;
        }

        private void l(int i, int i2) {
            List<a> list = this.b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    a aVar = this.b.get(size);
                    int i3 = aVar.a;
                    if (i3 >= i) {
                        aVar.a = i3 + i2;
                    }
                }
            }
        }

        private void m(int i, int i2) {
            List<a> list = this.b;
            if (list != null) {
                int i3 = i + i2;
                for (int size = list.size() - 1; size >= 0; size--) {
                    a aVar = this.b.get(size);
                    int i4 = aVar.a;
                    if (i4 >= i) {
                        if (i4 < i3) {
                            this.b.remove(size);
                        } else {
                            aVar.a = i4 - i2;
                        }
                    }
                }
            }
        }

        public void a(a aVar) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                a aVar2 = this.b.get(i);
                if (aVar2.a == aVar.a) {
                    this.b.remove(i);
                }
                if (aVar2.a >= aVar.a) {
                    this.b.add(i, aVar);
                    return;
                }
            }
            this.b.add(aVar);
        }

        public void b() {
            int[] iArr = this.a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.b = null;
        }

        public void c(int i) {
            int[] iArr = this.a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i, 10) + 1)];
                this.a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int[] iArr3 = new int[o(i)];
                this.a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public int d(int i) {
            List<a> list = this.b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.b.get(size).a >= i) {
                        this.b.remove(size);
                    }
                }
            }
            return h(i);
        }

        public a e(int i, int i2, int i3, boolean z) {
            List<a> list = this.b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                a aVar = this.b.get(i4);
                int i5 = aVar.a;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || aVar.b == i3 || (z && aVar.d))) {
                    return aVar;
                }
            }
            return null;
        }

        public a f(int i) {
            List<a> list = this.b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.b.get(size);
                if (aVar.a == i) {
                    return aVar;
                }
            }
            return null;
        }

        public int g(int i) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        public int h(int i) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int i2 = i(i);
            if (i2 == -1) {
                int[] iArr2 = this.a;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.a.length;
            }
            int i3 = i2 + 1;
            Arrays.fill(this.a, i, i3, -1);
            return i3;
        }

        public void j(int i, int i2) {
            int[] iArr = this.a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                c(i3);
                int[] iArr2 = this.a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.a, i, i3, -1);
                l(i, i2);
            }
        }

        public void k(int i, int i2) {
            int[] iArr = this.a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                c(i3);
                int[] iArr2 = this.a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.a;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                m(i, i2);
            }
        }

        public void n(int i, f fVar) {
            c(i);
            this.a[i] = fVar.e;
        }

        public int o(int i) {
            int length = this.a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        /* access modifiers changed from: package-private */
        @SuppressLint({"BanParcelableUsage"})
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0019a();
            public int a;
            public int b;
            public int[] c;
            public boolean d;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a  reason: collision with other inner class name */
            static class C0019a implements Parcelable.Creator<a> {
                /* renamed from: a */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                /* renamed from: b */
                public a[] newArray(int i) {
                    return new a[i];
                }
            }

            public a(Parcel parcel) {
                this.a = parcel.readInt();
                this.b = parcel.readInt();
                this.d = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            public int a(int i) {
                int[] iArr = this.c;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                return C0201.m82(13517) + this.a + C0201.m82(13518) + this.b + C0201.m82(13519) + this.d + C0201.m82(13520) + Arrays.toString(this.c) + '}';
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.a);
                parcel.writeInt(this.b);
                parcel.writeInt(this.d ? 1 : 0);
                int[] iArr = this.c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.c);
            }

            public a() {
            }
        }
    }
}
