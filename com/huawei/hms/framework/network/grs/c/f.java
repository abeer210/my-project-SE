package com.huawei.hms.framework.network.grs.c;

import android.content.Context;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.NetworkUtil;
import com.huawei.hms.framework.common.hianalytics.HianalyticsHelper;
import com.huawei.hms.framework.network.grs.c.b.a;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import vigqyno.C0201;

/* access modifiers changed from: package-private */
public class f implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ JSONArray d;

    public f(long j, Context context, ArrayList arrayList, JSONArray jSONArray) {
        this.a = j;
        this.b = context;
        this.c = arrayList;
        this.d = jSONArray;
    }

    public void run() {
        boolean z;
        a aVar = new a();
        aVar.put(C0201.m82(19688), this.a);
        aVar.put(C0201.m82(19689), (long) NetworkUtil.getNetworkType(this.b));
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            e eVar = (e) it.next();
            if (eVar.m()) {
                aVar.put(g.b(eVar));
                it.remove();
                z = true;
                break;
            }
        }
        if (!z && this.c.size() > 0) {
            ArrayList arrayList = this.c;
            e eVar2 = (e) arrayList.get(arrayList.size() - 1);
            aVar.put(g.b(eVar2));
            this.c.remove(eVar2);
        }
        if (this.c.size() > 0) {
            Iterator it2 = this.c.iterator();
            while (it2.hasNext()) {
                this.d.put(new JSONObject(g.b((e) it2.next())));
            }
        }
        if (this.d.length() > 0) {
            aVar.put(C0201.m82(19690), this.d.toString());
        }
        Logger.d(C0201.m82(19691), C0201.m82(19692), new JSONObject(aVar.get()));
        HianalyticsHelper.getInstance().onEvent(aVar.get(), C0201.m82(19693));
    }
}
