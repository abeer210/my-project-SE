package com.huawei.hms.framework.network.grs.c;

import android.content.Context;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.b;

/* access modifiers changed from: package-private */
public class k implements Runnable {
    public final /* synthetic */ GrsBaseInfo a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ b d;
    public final /* synthetic */ l e;

    public k(l lVar, GrsBaseInfo grsBaseInfo, Context context, String str, b bVar) {
        this.e = lVar;
        this.a = grsBaseInfo;
        this.b = context;
        this.c = str;
        this.d = bVar;
    }

    public void run() {
        l lVar = this.e;
        lVar.a(lVar.a(this.a, this.b, this.c), this.d);
    }
}
