package com.huawei.hms.framework.network.grs;

import android.content.Context;
import com.huawei.hms.framework.network.grs.a.a;
import com.huawei.hms.framework.network.grs.b.b;
import com.huawei.hms.framework.network.grs.c.l;
import java.util.Map;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public class c implements Callable<Boolean> {
    public final /* synthetic */ Context a;
    public final /* synthetic */ GrsBaseInfo b;
    public final /* synthetic */ d c;

    public c(d dVar, Context context, GrsBaseInfo grsBaseInfo) {
        this.c = dVar;
        this.a = context;
        this.b = grsBaseInfo;
    }

    @Override // java.util.concurrent.Callable
    public Boolean call() {
        this.c.g = new l();
        this.c.i = new com.huawei.hms.framework.network.grs.a.c(this.a);
        d dVar = this.c;
        dVar.h = new a(dVar.i, this.c.g);
        d dVar2 = this.c;
        dVar2.j = new a(dVar2.c, this.c.h, this.c.g);
        new b(this.a, this.b).a(this.b);
        d dVar3 = this.c;
        dVar3.a((d) ((Map<String, ?>) dVar3.i.a()));
        this.c.h.b(this.b, this.a);
        return Boolean.valueOf(this.c.d = true);
    }
}
