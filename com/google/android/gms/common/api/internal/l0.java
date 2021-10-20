package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class l0 extends p0 {
    private final ArrayList<a.f> b;
    private final /* synthetic */ f0 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l0(f0 f0Var, ArrayList<a.f> arrayList) {
        super(f0Var, null);
        this.c = f0Var;
        this.b = arrayList;
    }

    @Override // com.google.android.gms.common.api.internal.p0
    public final void a() {
        this.c.a.n.q = this.c.q();
        ArrayList<a.f> arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            a.f fVar = arrayList.get(i);
            i++;
            fVar.f(this.c.o, this.c.a.n.q);
        }
    }
}
