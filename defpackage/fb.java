package defpackage;

import android.annotation.TargetApi;
import android.graphics.Path;
import android.os.Build;
import defpackage.jd;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import vigqyno.C0201;

@TargetApi(19)
/* renamed from: fb  reason: default package */
/* compiled from: MergePathsContent */
public class fb implements gb, db {
    private final Path a = new Path();
    private final Path b = new Path();
    private final Path c = new Path();
    private final String d;
    private final List<gb> e = new ArrayList();
    private final jd f;

    /* renamed from: fb$a */
    /* compiled from: MergePathsContent */
    static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            int[] iArr = new int[jd.a.values().length];
            a = iArr;
            iArr[jd.a.MERGE.ordinal()] = 1;
            a[jd.a.ADD.ordinal()] = 2;
            a[jd.a.SUBTRACT.ordinal()] = 3;
            a[jd.a.INTERSECT.ordinal()] = 4;
            a[jd.a.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
        }
    }

    public fb(jd jdVar) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.d = jdVar.c();
            this.f = jdVar;
            return;
        }
        throw new IllegalStateException(C0201.m82(14221));
    }

    private void b() {
        for (int i = 0; i < this.e.size(); i++) {
            this.c.addPath(this.e.get(i).a());
        }
    }

    @TargetApi(19)
    private void d(Path.Op op) {
        this.b.reset();
        this.a.reset();
        for (int size = this.e.size() - 1; size >= 1; size--) {
            gb gbVar = this.e.get(size);
            if (gbVar instanceof xa) {
                xa xaVar = (xa) gbVar;
                List<gb> j = xaVar.j();
                for (int size2 = j.size() - 1; size2 >= 0; size2--) {
                    Path a2 = j.get(size2).a();
                    a2.transform(xaVar.k());
                    this.b.addPath(a2);
                }
            } else {
                this.b.addPath(gbVar.a());
            }
        }
        gb gbVar2 = this.e.get(0);
        if (gbVar2 instanceof xa) {
            xa xaVar2 = (xa) gbVar2;
            List<gb> j2 = xaVar2.j();
            for (int i = 0; i < j2.size(); i++) {
                Path a3 = j2.get(i).a();
                a3.transform(xaVar2.k());
                this.a.addPath(a3);
            }
        } else {
            this.a.set(gbVar2.a());
        }
        this.c.op(this.a, this.b, op);
    }

    @Override // defpackage.gb
    public Path a() {
        this.c.reset();
        if (this.f.d()) {
            return this.c;
        }
        int i = a.a[this.f.b().ordinal()];
        if (i == 1) {
            b();
        } else if (i == 2) {
            d(Path.Op.UNION);
        } else if (i == 3) {
            d(Path.Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            d(Path.Op.INTERSECT);
        } else if (i == 5) {
            d(Path.Op.XOR);
        }
        return this.c;
    }

    @Override // defpackage.wa
    public void c(List<wa> list, List<wa> list2) {
        for (int i = 0; i < this.e.size(); i++) {
            this.e.get(i).c(list, list2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:2:0x0006  */
    @Override // defpackage.db
    public void f(ListIterator<wa> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
            while (listIterator.hasPrevious()) {
                while (listIterator.hasPrevious()) {
                }
            }
        }
        while (listIterator.hasPrevious()) {
            wa previous = listIterator.previous();
            if (previous instanceof gb) {
                this.e.add((gb) previous);
                listIterator.remove();
            }
        }
    }

    @Override // defpackage.wa
    public String getName() {
        return this.d;
    }
}
