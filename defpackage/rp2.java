package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.sp2;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

/* renamed from: rp2  reason: default package */
/* compiled from: RecyclingPagerAdapter */
public abstract class rp2<VH extends sp2> extends androidx.viewpager.widget.a {
    private static final String e = null;
    private SparseArray<a> c = new SparseArray<>();
    private SparseArray<Parcelable> d = new SparseArray<>();

    /* access modifiers changed from: private */
    /* renamed from: rp2$a */
    /* compiled from: RecyclingPagerAdapter */
    public static class a {
        private final rp2 a;
        private final List<sp2> b = new ArrayList();

        public a(rp2 rp2) {
            this.a = rp2;
        }

        public sp2 b(ViewGroup viewGroup, int i) {
            int size = this.b.size();
            for (int i2 = 0; i2 < size; i2++) {
                sp2 sp2 = this.b.get(i2);
                if (!sp2.b) {
                    return sp2;
                }
            }
            sp2 C = this.a.C(viewGroup, i);
            this.b.add(C);
            return C;
        }
    }

    static {
        C0201.m83(rp2.class, 538);
    }

    private List<sp2> x() {
        ArrayList arrayList = new ArrayList();
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            SparseArray<a> sparseArray = this.c;
            for (sp2 sp2 : sparseArray.get(sparseArray.keyAt(i)).b) {
                if (sp2.b) {
                    arrayList.add(sp2);
                }
            }
        }
        return arrayList;
    }

    public int A(int i) {
        return 0;
    }

    public abstract void B(VH vh, int i);

    public abstract VH C(ViewGroup viewGroup, int i);

    public void D(sp2 sp2) {
    }

    @Override // androidx.viewpager.widget.a
    public void e(ViewGroup viewGroup, int i, Object obj) {
        if (obj instanceof sp2) {
            ((sp2) obj).c(viewGroup);
        }
    }

    @Override // androidx.viewpager.widget.a
    public int h() {
        return y();
    }

    @Override // androidx.viewpager.widget.a
    public int i(Object obj) {
        return -2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: rp2<VH extends sp2> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.viewpager.widget.a
    public Object l(ViewGroup viewGroup, int i) {
        int A = A(i);
        if (this.c.get(A) == null) {
            this.c.put(A, new a(this));
        }
        sp2 b = this.c.get(A).b(viewGroup, A);
        b.b(viewGroup, i);
        B(b, i);
        SparseArray<Parcelable> sparseArray = this.d;
        z(i);
        b.d(sparseArray.get(i));
        return b;
    }

    @Override // androidx.viewpager.widget.a
    public boolean m(View view, Object obj) {
        return (obj instanceof sp2) && ((sp2) obj).a == view;
    }

    @Override // androidx.viewpager.widget.a
    public void n() {
        super.n();
        for (sp2 sp2 : x()) {
            D(sp2);
        }
    }

    @Override // androidx.viewpager.widget.a
    public void p(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            SparseArray<Parcelable> sparseParcelableArray = bundle.containsKey(e) ? bundle.getSparseParcelableArray(e) : null;
            if (sparseParcelableArray == null) {
                sparseParcelableArray = new SparseArray<>();
            }
            this.d = sparseParcelableArray;
        }
        super.p(parcelable, classLoader);
    }

    @Override // androidx.viewpager.widget.a
    public Parcelable q() {
        Bundle bundle = new Bundle();
        for (sp2 sp2 : x()) {
            SparseArray<Parcelable> sparseArray = this.d;
            int i = sp2.c;
            z(i);
            sparseArray.put(i, sp2.e());
        }
        bundle.putSparseParcelableArray(e, this.d);
        return bundle;
    }

    public abstract int y();

    public int z(int i) {
        return i;
    }
}
