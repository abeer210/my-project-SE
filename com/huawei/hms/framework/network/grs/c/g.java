package com.huawei.hms.framework.network.grs.c;

import android.content.Context;
import com.huawei.hms.framework.common.ExceptionCode;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.common.hianalytics.HianalyticsHelper;
import com.huawei.hms.framework.common.hianalytics.LinkedHashMapPack;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import vigqyno.C0201;

public class g {
    public static void a(ArrayList<e> arrayList, long j, JSONArray jSONArray, Context context) {
        if (context != null && arrayList != null && arrayList.size() > 0 && HianalyticsHelper.getInstance().isEnableReportNoSeed(context)) {
            HianalyticsHelper.getInstance().getReportExecutor().execute(new f(j, context, arrayList, jSONArray));
        }
    }

    /* access modifiers changed from: private */
    public static LinkedHashMap<String, String> b(e eVar) {
        LinkedHashMapPack linkedHashMapPack = new LinkedHashMapPack();
        Exception d = eVar.d();
        String r2 = C0201.m82(19564);
        String r3 = C0201.m82(19565);
        if (d != null) {
            linkedHashMapPack.put(r3, (long) ExceptionCode.getErrorCodeFromException(d));
            linkedHashMapPack.put(r2, d.getClass().getSimpleName());
            linkedHashMapPack.put(C0201.m82(19566), StringUtils.anonymizeMessage(d.getMessage()));
        } else {
            linkedHashMapPack.put(r3, (long) eVar.b());
            linkedHashMapPack.put(r2, (long) eVar.c());
        }
        try {
            linkedHashMapPack.put(C0201.m82(19567), new URL(eVar.k()).getHost());
        } catch (MalformedURLException e) {
            Logger.w(C0201.m82(19568), C0201.m82(19569), e);
        }
        linkedHashMapPack.put(C0201.m82(19570), eVar.g());
        linkedHashMapPack.put(C0201.m82(19571), eVar.f());
        linkedHashMapPack.put(C0201.m82(19572), eVar.h());
        return linkedHashMapPack.getAll();
    }
}
