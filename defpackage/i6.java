package defpackage;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import defpackage.e6;
import java.util.ArrayList;
import java.util.Iterator;
import vigqyno.C0201;

/* renamed from: i6  reason: default package */
/* compiled from: TransitionSet */
public class i6 extends e6 {
    private ArrayList<e6> M = new ArrayList<>();
    private boolean N = true;
    public int O;
    public boolean P = false;
    private int Q = 0;

    /* renamed from: i6$a */
    /* compiled from: TransitionSet */
    class a extends f6 {
        public final /* synthetic */ e6 a;

        public a(e6 e6Var) {
            this.a = e6Var;
        }

        @Override // defpackage.e6.f
        public void c(e6 e6Var) {
            this.a.a0();
            e6Var.W(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i6$b */
    /* compiled from: TransitionSet */
    public static class b extends f6 {
        public i6 a;

        public b(i6 i6Var) {
            this.a = i6Var;
        }

        @Override // defpackage.f6, defpackage.e6.f
        public void a(e6 e6Var) {
            i6 i6Var = this.a;
            if (!i6Var.P) {
                i6Var.i0();
                this.a.P = true;
            }
        }

        @Override // defpackage.e6.f
        public void c(e6 e6Var) {
            i6 i6Var = this.a;
            int i = i6Var.O - 1;
            i6Var.O = i;
            if (i == 0) {
                i6Var.P = false;
                i6Var.s();
            }
            e6Var.W(this);
        }
    }

    private void B0() {
        b bVar = new b(this);
        Iterator<e6> it = this.M.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        this.O = this.M.size();
    }

    private void o0(e6 e6Var) {
        this.M.add(e6Var);
        e6Var.u = this;
    }

    /* renamed from: A0 */
    public i6 h0(long j) {
        super.h0(j);
        return this;
    }

    @Override // defpackage.e6
    public void U(View view) {
        super.U(view);
        int size = this.M.size();
        for (int i = 0; i < size; i++) {
            this.M.get(i).U(view);
        }
    }

    @Override // defpackage.e6
    public void Y(View view) {
        super.Y(view);
        int size = this.M.size();
        for (int i = 0; i < size; i++) {
            this.M.get(i).Y(view);
        }
    }

    @Override // defpackage.e6
    public void a0() {
        if (this.M.isEmpty()) {
            i0();
            s();
            return;
        }
        B0();
        if (!this.N) {
            for (int i = 1; i < this.M.size(); i++) {
                this.M.get(i - 1).a(new a(this.M.get(i)));
            }
            e6 e6Var = this.M.get(0);
            if (e6Var != null) {
                e6Var.a0();
                return;
            }
            return;
        }
        Iterator<e6> it = this.M.iterator();
        while (it.hasNext()) {
            it.next().a0();
        }
    }

    @Override // defpackage.e6
    public /* bridge */ /* synthetic */ e6 b0(long j) {
        x0(j);
        return this;
    }

    @Override // defpackage.e6
    public void c0(e6.e eVar) {
        super.c0(eVar);
        this.Q |= 8;
        int size = this.M.size();
        for (int i = 0; i < size; i++) {
            this.M.get(i).c0(eVar);
        }
    }

    @Override // defpackage.e6
    public void cancel() {
        super.cancel();
        int size = this.M.size();
        for (int i = 0; i < size; i++) {
            this.M.get(i).cancel();
        }
    }

    @Override // defpackage.e6
    public void e0(w5 w5Var) {
        super.e0(w5Var);
        this.Q |= 4;
        if (this.M != null) {
            for (int i = 0; i < this.M.size(); i++) {
                this.M.get(i).e0(w5Var);
            }
        }
    }

    @Override // defpackage.e6
    public void f(k6 k6Var) {
        if (N(k6Var.b)) {
            Iterator<e6> it = this.M.iterator();
            while (it.hasNext()) {
                e6 next = it.next();
                if (next.N(k6Var.b)) {
                    next.f(k6Var);
                    k6Var.c.add(next);
                }
            }
        }
    }

    @Override // defpackage.e6
    public void f0(h6 h6Var) {
        super.f0(h6Var);
        this.Q |= 2;
        int size = this.M.size();
        for (int i = 0; i < size; i++) {
            this.M.get(i).f0(h6Var);
        }
    }

    @Override // defpackage.e6
    public void i(k6 k6Var) {
        super.i(k6Var);
        int size = this.M.size();
        for (int i = 0; i < size; i++) {
            this.M.get(i).i(k6Var);
        }
    }

    @Override // defpackage.e6
    public void j(k6 k6Var) {
        if (N(k6Var.b)) {
            Iterator<e6> it = this.M.iterator();
            while (it.hasNext()) {
                e6 next = it.next();
                if (next.N(k6Var.b)) {
                    next.j(k6Var);
                    k6Var.c.add(next);
                }
            }
        }
    }

    @Override // defpackage.e6
    public String j0(String str) {
        String j0 = super.j0(str);
        for (int i = 0; i < this.M.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(j0);
            sb.append(C0201.m82(18243));
            sb.append(this.M.get(i).j0(str + C0201.m82(18244)));
            j0 = sb.toString();
        }
        return j0;
    }

    /* renamed from: l0 */
    public i6 a(e6.f fVar) {
        super.a(fVar);
        return this;
    }

    /* renamed from: m0 */
    public i6 b(View view) {
        for (int i = 0; i < this.M.size(); i++) {
            this.M.get(i).b(view);
        }
        super.b(view);
        return this;
    }

    @Override // defpackage.e6
    /* renamed from: n */
    public e6 clone() {
        i6 i6Var = (i6) super.clone();
        i6Var.M = new ArrayList<>();
        int size = this.M.size();
        for (int i = 0; i < size; i++) {
            i6Var.o0(this.M.get(i).clone());
        }
        return i6Var;
    }

    public i6 n0(e6 e6Var) {
        o0(e6Var);
        long j = this.c;
        if (j >= 0) {
            e6Var.b0(j);
        }
        if ((this.Q & 1) != 0) {
            e6Var.d0(w());
        }
        if ((this.Q & 2) != 0) {
            e6Var.f0(B());
        }
        if ((this.Q & 4) != 0) {
            e6Var.e0(z());
        }
        if ((this.Q & 8) != 0) {
            e6Var.c0(v());
        }
        return this;
    }

    public e6 p0(int i) {
        if (i < 0 || i >= this.M.size()) {
            return null;
        }
        return this.M.get(i);
    }

    @Override // defpackage.e6
    public void q(ViewGroup viewGroup, l6 l6Var, l6 l6Var2, ArrayList<k6> arrayList, ArrayList<k6> arrayList2) {
        long D = D();
        int size = this.M.size();
        for (int i = 0; i < size; i++) {
            e6 e6Var = this.M.get(i);
            if (D > 0 && (this.N || i == 0)) {
                long D2 = e6Var.D();
                if (D2 > 0) {
                    e6Var.h0(D2 + D);
                } else {
                    e6Var.h0(D);
                }
            }
            e6Var.q(viewGroup, l6Var, l6Var2, arrayList, arrayList2);
        }
    }

    public int r0() {
        return this.M.size();
    }

    /* renamed from: v0 */
    public i6 W(e6.f fVar) {
        super.W(fVar);
        return this;
    }

    /* renamed from: w0 */
    public i6 X(View view) {
        for (int i = 0; i < this.M.size(); i++) {
            this.M.get(i).X(view);
        }
        super.X(view);
        return this;
    }

    public i6 x0(long j) {
        ArrayList<e6> arrayList;
        super.b0(j);
        if (this.c >= 0 && (arrayList = this.M) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.M.get(i).b0(j);
            }
        }
        return this;
    }

    /* renamed from: y0 */
    public i6 d0(TimeInterpolator timeInterpolator) {
        this.Q |= 1;
        ArrayList<e6> arrayList = this.M;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.M.get(i).d0(timeInterpolator);
            }
        }
        super.d0(timeInterpolator);
        return this;
    }

    public i6 z0(int i) {
        if (i == 0) {
            this.N = true;
        } else if (i == 1) {
            this.N = false;
        } else {
            throw new AndroidRuntimeException(C0201.m82(18245) + i);
        }
        return this;
    }
}
