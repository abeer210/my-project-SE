package com.huawei.hms.framework.network.grs.a;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.c.l;
import com.huawei.hms.framework.network.grs.d.e;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import vigqyno.C0201;

public class a {
    private static final String a = null;
    private Map<String, Map<String, Map<String, String>>> b = new ConcurrentHashMap(16);
    private Map<String, Long> c = new ConcurrentHashMap(16);
    private c d;
    private l e;

    static {
        C0201.m83(a.class, 622);
    }

    public a(c cVar, l lVar) {
        this.d = cVar;
        this.e = lVar;
        lVar.a(this);
    }

    private void a(GrsBaseInfo grsBaseInfo, b bVar, Context context, String str) {
        Long l = this.c.get(grsBaseInfo.getGrsParasKey(false, true, context));
        if (e.a(l)) {
            bVar.a(2);
            return;
        }
        if (e.a(l, 300000)) {
            this.e.a(grsBaseInfo, context, null, str);
        }
        bVar.a(1);
    }

    private void a(GrsBaseInfo grsBaseInfo, String str, Context context) {
        if (e.a(this.c.get(str), 300000)) {
            this.e.a(grsBaseInfo, context, null, null);
        }
    }

    public String a(GrsBaseInfo grsBaseInfo, String str, String str2, b bVar, Context context) {
        Map<String, String> a2 = a(grsBaseInfo, str, bVar, context);
        if (a2 == null) {
            return null;
        }
        return a2.get(str2);
    }

    public Map<String, String> a(GrsBaseInfo grsBaseInfo, String str, b bVar, Context context) {
        Map<String, Map<String, String>> map = this.b.get(grsBaseInfo.getGrsParasKey(false, true, context));
        if (map == null || map.isEmpty()) {
            return new HashMap();
        }
        a(grsBaseInfo, bVar, context, str);
        return map.get(str);
    }

    public void a(GrsBaseInfo grsBaseInfo, Context context) {
        String grsParasKey = grsBaseInfo.getGrsParasKey(false, true, context);
        c cVar = this.d;
        StringBuilder sb = new StringBuilder();
        sb.append(grsParasKey);
        String r1 = C0201.m82(4972);
        sb.append(r1);
        cVar.b(sb.toString(), C0201.m82(4973));
        Map<String, Long> map = this.c;
        map.remove(grsParasKey + r1);
        this.b.remove(grsParasKey);
        this.e.a(grsParasKey);
    }

    public void a(GrsBaseInfo grsBaseInfo, com.huawei.hms.framework.network.grs.c.e eVar, Context context) {
        if (eVar.e() == 2) {
            Logger.w(a, C0201.m82(4974));
            return;
        }
        String grsParasKey = grsBaseInfo.getGrsParasKey(false, true, context);
        this.d.b(grsParasKey, eVar.i());
        c cVar = this.d;
        cVar.b(grsParasKey + C0201.m82(4975), eVar.a());
        this.b.put(grsParasKey, com.huawei.hms.framework.network.grs.a.a(eVar.i()));
        this.c.put(grsParasKey, Long.valueOf(Long.parseLong(eVar.a())));
    }

    public void b(GrsBaseInfo grsBaseInfo, Context context) {
        String grsParasKey = grsBaseInfo.getGrsParasKey(false, true, context);
        String a2 = this.d.a(grsParasKey, C0201.m82(4976));
        c cVar = this.d;
        String a3 = cVar.a(grsParasKey + C0201.m82(4977), C0201.m82(4978));
        long j = 0;
        if (!TextUtils.isEmpty(a3) && a3.matches(C0201.m82(4979))) {
            try {
                j = Long.parseLong(a3);
            } catch (NumberFormatException e2) {
                Logger.w(a, C0201.m82(4980), e2);
            }
        }
        this.b.put(grsParasKey, com.huawei.hms.framework.network.grs.a.a(a2));
        this.c.put(grsParasKey, Long.valueOf(j));
        a(grsBaseInfo, grsParasKey, context);
    }
}
