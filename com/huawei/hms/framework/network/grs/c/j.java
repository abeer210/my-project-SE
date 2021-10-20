package com.huawei.hms.framework.network.grs.c;

import android.content.Context;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public class j implements Callable<e> {
    public final /* synthetic */ GrsBaseInfo a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ l d;

    public j(l lVar, GrsBaseInfo grsBaseInfo, Context context, String str) {
        this.d = lVar;
        this.a = grsBaseInfo;
        this.b = context;
        this.c = str;
    }

    @Override // java.util.concurrent.Callable
    public e call() {
        return new d(this.a, this.b, this.d.d).a(this.d.a, this.c);
    }
}
