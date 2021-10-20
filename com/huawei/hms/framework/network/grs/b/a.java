package com.huawei.hms.framework.network.grs.b;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.d.c;
import com.huawei.hms.framework.network.grs.local.model.b;
import com.huawei.hms.framework.network.grs.local.model.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

public abstract class a {
    public com.huawei.hms.framework.network.grs.local.model.a a;
    public List<b> b;
    public Map<String, String> c = new ConcurrentHashMap(16);
    public boolean d = false;
    public Set<String> e = new HashSet(16);

    private int a(Context context) {
        String r0 = C0201.m82(13610);
        int i = -1;
        try {
            String[] list = context.getAssets().list(C0201.m82(13611));
            if (list != null && list.length > 0) {
                for (String str : list) {
                    if (Pattern.matches(C0201.m82(13612), str) && g(c.a(str, context)) == 0) {
                        Logger.i(r0, C0201.m82(13613));
                        i = 0;
                    }
                }
            }
        } catch (IOException unused) {
            Logger.w(r0, C0201.m82(13614));
        }
        return i;
    }

    private int a(String str, Context context) {
        if (f(c.a(str, context)) != 0) {
            return -1;
        }
        Logger.i(C0201.m82(13615), C0201.m82(13616));
        return 0;
    }

    private Map<String, String> a(List<b> list, GrsBaseInfo grsBaseInfo) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
        concurrentHashMap.put(C0201.m82(13617), C0201.m82(13618));
        for (b bVar : list) {
            if (bVar.a().contains(grsBaseInfo.getIssueCountry())) {
                concurrentHashMap.put(grsBaseInfo.getIssueCountry(), bVar.b());
            }
            if (bVar.a().contains(grsBaseInfo.getRegCountry())) {
                concurrentHashMap.put(grsBaseInfo.getRegCountry(), bVar.b());
            }
            if (bVar.a().contains(grsBaseInfo.getSerCountry())) {
                concurrentHashMap.put(grsBaseInfo.getSerCountry(), bVar.b());
            }
        }
        return concurrentHashMap;
    }

    private int f(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        int b2 = b(str);
        if (b2 != 0) {
            return b2;
        }
        int a2 = a(str);
        return a2 != 0 ? a2 : e(str);
    }

    private int g(String str) {
        int c2;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        List<b> list = this.b;
        return ((list == null || list.isEmpty()) && (c2 = c(str)) != 0) ? c2 : d(str);
    }

    public abstract int a(String str);

    public int a(String str, Context context, boolean z) {
        if (a(str, context) != 0 && z) {
            return -1;
        }
        a(context);
        return 0;
    }

    public com.huawei.hms.framework.network.grs.local.model.a a() {
        return this.a;
    }

    public String a(GrsBaseInfo grsBaseInfo, String str, String str2) {
        Map<String, String> a2 = a(grsBaseInfo, str);
        if (a2 != null) {
            return a2.get(str2);
        }
        Logger.w(C0201.m82(13619), C0201.m82(13620), str);
        return null;
    }

    public abstract List<b> a(JSONArray jSONArray, JSONObject jSONObject);

    public Map<String, String> a(GrsBaseInfo grsBaseInfo, String str) {
        if (!this.d) {
            return null;
        }
        com.huawei.hms.framework.network.grs.local.model.a aVar = this.a;
        String r2 = C0201.m82(13621);
        if (aVar == null) {
            Logger.w(r2, C0201.m82(13622));
            return null;
        }
        com.huawei.hms.framework.network.grs.local.model.c a2 = aVar.a(str);
        if (a2 == null) {
            Logger.w(r2, C0201.m82(13623), str);
            return null;
        }
        String a3 = f.a(a2.c(), grsBaseInfo);
        if (a3 == null) {
            Logger.w(r2, C0201.m82(13624), a2.c());
            return null;
        }
        List<b> a4 = a2.a();
        d a5 = a2.a(((a4 == null || a4.size() == 0) ? this.c : a(a4, grsBaseInfo)).get(a3));
        if (a5 == null) {
            return null;
        }
        return a5.a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b8 A[LOOP:2: B:18:0x00b2->B:20:0x00b8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x010a  */
    public void a(JSONArray jSONArray) {
        String r8;
        String str;
        Iterator<String> keys;
        if (!(jSONArray == null || jSONArray.length() == 0)) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                com.huawei.hms.framework.network.grs.local.model.c cVar = new com.huawei.hms.framework.network.grs.local.model.c();
                String string = jSONObject.getString(C0201.m82(13625));
                cVar.b(string);
                if (!this.e.contains(string)) {
                    this.e.add(string);
                    cVar.c(jSONObject.getString(C0201.m82(13626)));
                    JSONArray jSONArray2 = jSONObject.getJSONArray(C0201.m82(13627));
                    int i2 = 0;
                    while (true) {
                        int length = jSONArray2.length();
                        r8 = C0201.m82(13628);
                        if (i2 >= length) {
                            break;
                        }
                        JSONObject jSONObject2 = (JSONObject) jSONArray2.get(i2);
                        d dVar = new d();
                        String r10 = C0201.m82(13629);
                        if (!jSONObject2.has(r10)) {
                            r10 = C0201.m82(13630);
                            if (!jSONObject2.has(r10)) {
                                Logger.v(r8, C0201.m82(13631));
                                str = C0201.m82(13632);
                                dVar.a(str);
                                JSONObject jSONObject3 = jSONObject2.getJSONObject(C0201.m82(13633));
                                HashMap hashMap = new HashMap(16);
                                keys = jSONObject3.keys();
                                while (keys.hasNext()) {
                                    String next = keys.next();
                                    hashMap.put(next, jSONObject3.getString(next));
                                }
                                dVar.a(hashMap);
                                cVar.a(dVar.b(), dVar);
                                i2++;
                            }
                        }
                        str = jSONObject2.getString(r10);
                        dVar.a(str);
                        JSONObject jSONObject32 = jSONObject2.getJSONObject(C0201.m82(13633));
                        HashMap hashMap2 = new HashMap(16);
                        keys = jSONObject32.keys();
                        while (keys.hasNext()) {
                        }
                        dVar.a(hashMap2);
                        cVar.a(dVar.b(), dVar);
                        i2++;
                    }
                    String r5 = C0201.m82(13634);
                    List<b> list = null;
                    if (!jSONObject.has(r5)) {
                        r5 = C0201.m82(13635);
                        if (!jSONObject.has(r5)) {
                            Logger.i(r8, C0201.m82(13636));
                            cVar.a(list);
                            if (this.a == null) {
                                this.a = new com.huawei.hms.framework.network.grs.local.model.a();
                            }
                            this.a.a(string, cVar);
                        }
                    }
                    list = a(jSONObject.getJSONArray(r5), (JSONObject) null);
                    cVar.a(list);
                    if (this.a == null) {
                    }
                    this.a.a(string, cVar);
                }
            }
        }
    }

    public boolean a(GrsBaseInfo grsBaseInfo) {
        List<b> list = this.b;
        if (list == null || list.isEmpty()) {
            return false;
        }
        this.c.put(C0201.m82(13637), C0201.m82(13638));
        for (b bVar : this.b) {
            if (bVar.a().contains(grsBaseInfo.getIssueCountry())) {
                this.c.put(grsBaseInfo.getIssueCountry(), bVar.b());
            }
            if (bVar.a().contains(grsBaseInfo.getRegCountry())) {
                this.c.put(grsBaseInfo.getRegCountry(), bVar.b());
            }
            if (bVar.a().contains(grsBaseInfo.getSerCountry())) {
                this.c.put(grsBaseInfo.getSerCountry(), bVar.b());
            }
        }
        return true;
    }

    public abstract int b(String str);

    public boolean b() {
        return this.d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004d  */
    public int c(String str) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        String r0 = C0201.m82(13639);
        String r1 = C0201.m82(13640);
        String r2 = C0201.m82(13641);
        this.b = new ArrayList(16);
        try {
            JSONObject jSONObject = new JSONObject(str);
            boolean has = jSONObject.has(r1);
            String r6 = C0201.m82(13642);
            if (!has) {
                if (jSONObject.has(r6)) {
                    r1 = r6;
                } else {
                    Logger.e(r2, C0201.m82(13643));
                    jSONArray = null;
                    if (jSONArray != null) {
                        return -1;
                    }
                    if (jSONArray.length() != 0) {
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            b bVar = new b();
                            bVar.b(jSONObject2.getString(C0201.m82(13644)));
                            bVar.c(jSONObject2.getString(C0201.m82(13645)));
                            bVar.a(jSONObject2.getString(C0201.m82(13646)));
                            boolean has2 = jSONObject2.has(r0);
                            String r10 = C0201.m82(13647);
                            if (has2) {
                                r10 = r0;
                            } else if (!jSONObject2.has(r10)) {
                                Logger.w(r2, C0201.m82(13648));
                                jSONArray2 = null;
                                HashSet hashSet = new HashSet(16);
                                if (jSONArray2 != null || jSONArray2.length() == 0) {
                                    return -1;
                                }
                                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                                    hashSet.add((String) jSONArray2.get(i2));
                                }
                                bVar.a(hashSet);
                                this.b.add(bVar);
                            }
                            jSONArray2 = jSONObject2.getJSONArray(r10);
                            HashSet hashSet2 = new HashSet(16);
                            if (jSONArray2 != null) {
                            }
                            return -1;
                        }
                    }
                    return 0;
                }
            }
            jSONArray = jSONObject.getJSONArray(r1);
            if (jSONArray != null) {
            }
        } catch (JSONException e2) {
            Logger.w(r2, C0201.m82(13649), e2);
            return -1;
        }
    }

    public int d(String str) {
        try {
            a(new JSONObject(str).getJSONArray(C0201.m82(13650)));
            return 0;
        } catch (JSONException e2) {
            Logger.w(C0201.m82(13651), C0201.m82(13652), e2);
            return -1;
        }
    }

    public abstract int e(String str);
}
