package defpackage;

import android.content.Context;
import android.util.SparseArray;
import com.google.android.gms.vision.b;
import vigqyno.C0201;

/* renamed from: xt1  reason: default package */
public final class xt1 extends com.google.android.gms.vision.a<wt1> {
    private final ml1 c;

    /* renamed from: xt1$a */
    public static class a {
        private Context a;
        private pj1 b = new pj1();

        public a(Context context) {
            this.a = context;
        }

        public xt1 a() {
            return new xt1(new ml1(this.a, this.b));
        }

        public a b(int i) {
            this.b.a = i;
            return this;
        }
    }

    private xt1(ml1 ml1) {
        this.c = ml1;
    }

    @Override // com.google.android.gms.vision.a
    public final void a() {
        super.a();
        this.c.d();
    }

    public final SparseArray<wt1> b(b bVar) {
        wt1[] wt1Arr;
        if (bVar != null) {
            np1 o = np1.o(bVar);
            if (bVar.a() != null) {
                wt1Arr = this.c.f(bVar.a(), o);
                if (wt1Arr == null) {
                    throw new IllegalArgumentException(C0201.m82(2483));
                }
            } else {
                wt1Arr = this.c.g(bVar.b(), o);
            }
            SparseArray<wt1> sparseArray = new SparseArray<>(wt1Arr.length);
            for (wt1 wt1 : wt1Arr) {
                sparseArray.append(wt1.b.hashCode(), wt1);
            }
            return sparseArray;
        }
        throw new IllegalArgumentException(C0201.m82(2484));
    }

    public final boolean c() {
        return this.c.a();
    }
}
