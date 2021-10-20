package com.huawei.hms.framework.network.grs.c;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* access modifiers changed from: package-private */
public class c implements Callable<e> {
    public final /* synthetic */ ExecutorService a;
    public final /* synthetic */ String b;
    public final /* synthetic */ d c;

    public c(d dVar, ExecutorService executorService, String str) {
        this.c = dVar;
        this.a = executorService;
        this.b = str;
    }

    @Override // java.util.concurrent.Callable
    public e call() {
        return this.c.b(this.a, this.b);
    }
}
