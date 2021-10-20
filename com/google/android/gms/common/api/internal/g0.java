package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.m;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class g0 extends p0 {
    private final Map<a.f, h0> b;
    public final /* synthetic */ f0 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g0(f0 f0Var, Map<a.f, h0> map) {
        super(f0Var, null);
        this.c = f0Var;
        this.b = map;
    }

    @Override // com.google.android.gms.common.api.internal.p0
    public final void a() {
        m mVar = new m(this.c.d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (a.f fVar : this.b.keySet()) {
            if (!fVar.o() || h0.b(this.b.get(fVar))) {
                arrayList2.add(fVar);
            } else {
                arrayList.add(fVar);
            }
        }
        int i = -1;
        int i2 = 0;
        if (arrayList.isEmpty()) {
            int size = arrayList2.size();
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                i = mVar.b(this.c.c, (a.f) obj);
                if (i == 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList.size();
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                i = mVar.b(this.c.c, (a.f) obj2);
                if (i != 0) {
                    break;
                }
            }
        }
        if (i != 0) {
            this.c.a.h(new j0(this, this.c, new vo0(i, null)));
            return;
        }
        if ((this.c.m) && this.c.k != null) {
            this.c.k.a();
        }
        for (a.f fVar2 : this.b.keySet()) {
            h0 h0Var = this.b.get(fVar2);
            if (!fVar2.o() || mVar.b(this.c.c, fVar2) == 0) {
                fVar2.i(h0Var);
            } else {
                this.c.a.h(new i0(this, this.c, h0Var));
            }
        }
    }
}
