package defpackage;

import defpackage.e62.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: e62  reason: default package */
/* compiled from: PointQuadTree */
public class e62<T extends a> {
    private final x52 a;
    private final int b;
    private List<T> c;
    private List<e62<T>> d;

    /* renamed from: e62$a */
    /* compiled from: PointQuadTree */
    public interface a {
        y52 a();
    }

    public e62(x52 x52) {
        this(x52, 0);
    }

    private void b(double d2, double d3, T t) {
        List<e62<T>> list = this.d;
        if (list != null) {
            x52 x52 = this.a;
            if (d3 < x52.f) {
                if (d2 < x52.e) {
                    list.get(0).b(d2, d3, t);
                } else {
                    list.get(1).b(d2, d3, t);
                }
            } else if (d2 < x52.e) {
                list.get(2).b(d2, d3, t);
            } else {
                list.get(3).b(d2, d3, t);
            }
        } else {
            if (this.c == null) {
                this.c = new ArrayList();
            }
            this.c.add(t);
            if (this.c.size() > 50 && this.b < 40) {
                e();
            }
        }
    }

    private void d(x52 x52, Collection<T> collection) {
        if (this.a.e(x52)) {
            List<e62<T>> list = this.d;
            if (list != null) {
                for (e62<T> e62 : list) {
                    e62.d(x52, collection);
                }
            } else if (this.c != null) {
                if (x52.b(this.a)) {
                    collection.addAll(this.c);
                    return;
                }
                for (T t : this.c) {
                    if (x52.c(t.a())) {
                        collection.add(t);
                    }
                }
            }
        }
    }

    private void e() {
        ArrayList arrayList = new ArrayList(4);
        this.d = arrayList;
        x52 x52 = this.a;
        arrayList.add(new e62(x52.a, x52.e, x52.b, x52.f, this.b + 1));
        List<e62<T>> list = this.d;
        x52 x522 = this.a;
        list.add(new e62<>(x522.e, x522.c, x522.b, x522.f, this.b + 1));
        List<e62<T>> list2 = this.d;
        x52 x523 = this.a;
        list2.add(new e62<>(x523.a, x523.e, x523.f, x523.d, this.b + 1));
        List<e62<T>> list3 = this.d;
        x52 x524 = this.a;
        list3.add(new e62<>(x524.e, x524.c, x524.f, x524.d, this.b + 1));
        List<T> list4 = this.c;
        this.c = null;
        for (T t : list4) {
            b(t.a().a, t.a().b, t);
        }
    }

    public void a(T t) {
        y52 a2 = t.a();
        if (this.a.a(a2.a, a2.b)) {
            b(a2.a, a2.b, t);
        }
    }

    public Collection<T> c(x52 x52) {
        ArrayList arrayList = new ArrayList();
        d(x52, arrayList);
        return arrayList;
    }

    private e62(double d2, double d3, double d4, double d5, int i) {
        this(new x52(d2, d3, d4, d5), i);
    }

    private e62(x52 x52, int i) {
        this.d = null;
        this.a = x52;
        this.b = i;
    }
}
