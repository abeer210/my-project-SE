package defpackage;

import android.graphics.PointF;
import defpackage.qf;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import vigqyno.C0201;

/* renamed from: hf  reason: default package */
/* compiled from: ShapeDataParser */
public class hf implements nf<nd> {
    public static final hf a = new hf();
    private static final qf.a b = qf.a.a(C0201.m82(19788), C0201.m82(19789), C0201.m82(19790), C0201.m82(19791));

    private hf() {
    }

    /* renamed from: b */
    public nd a(qf qfVar, float f) throws IOException {
        if (qfVar.y() == qf.b.BEGIN_ARRAY) {
            qfVar.c();
        }
        qfVar.h();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z = false;
        while (qfVar.o()) {
            int A = qfVar.A(b);
            if (A == 0) {
                z = qfVar.p();
            } else if (A == 1) {
                list = te.f(qfVar, f);
            } else if (A == 2) {
                list2 = te.f(qfVar, f);
            } else if (A != 3) {
                qfVar.B();
                qfVar.D();
            } else {
                list3 = te.f(qfVar, f);
            }
        }
        qfVar.m();
        if (qfVar.y() == qf.b.END_ARRAY) {
            qfVar.k();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException(C0201.m82(19792));
        } else if (list.isEmpty()) {
            return new nd(new PointF(), false, Collections.emptyList());
        } else {
            int size = list.size();
            PointF pointF = list.get(0);
            ArrayList arrayList = new ArrayList(size);
            for (int i = 1; i < size; i++) {
                PointF pointF2 = list.get(i);
                int i2 = i - 1;
                arrayList.add(new fc(zf.a(list.get(i2), list3.get(i2)), zf.a(pointF2, list2.get(i)), pointF2));
            }
            if (z) {
                PointF pointF3 = list.get(0);
                int i3 = size - 1;
                arrayList.add(new fc(zf.a(list.get(i3), list3.get(i3)), zf.a(pointF3, list2.get(0)), pointF3));
            }
            return new nd(pointF, z, arrayList);
        }
    }
}
