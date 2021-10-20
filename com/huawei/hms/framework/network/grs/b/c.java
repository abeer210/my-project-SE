package com.huawei.hms.framework.network.grs.b;

import android.content.Context;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.local.model.a;
import com.huawei.hms.framework.network.grs.local.model.b;
import com.huawei.hms.framework.network.grs.local.model.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

public class c extends a {
    public static final String f = null;
    public static final String g = null;
    public static final String h = null;
    public static final String i = null;
    public static final String j = null;
    public static final String k = null;
    public static final String l = null;
    public static final String m = null;
    public static final String n = null;
    public static final String o = null;
    public static final String p = null;
    public static final String q = null;
    public static final String r = null;

    static {
        C0201.m83(c.class, 44);
    }

    public c(Context context) {
        if (a(C0201.m82(13477), context, false) == 0) {
            this.d = true;
        }
    }

    @Override // com.huawei.hms.framework.network.grs.b.a
    public int a(String str) {
        this.a = new a();
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject(C0201.m82(13478));
            String string = jSONObject.getString(C0201.m82(13479));
            long j2 = jSONObject.getLong(C0201.m82(13480));
            JSONArray jSONArray = jSONObject.getJSONArray(C0201.m82(13481));
            this.a.b(string);
            this.a.a(j2);
            return (jSONArray == null || jSONArray.length() == 0) ? -1 : 0;
        } catch (JSONException e) {
            Logger.w(C0201.m82(13482), C0201.m82(13483), e);
            return -1;
        }
    }

    @Override // com.huawei.hms.framework.network.grs.b.a
    public List<b> a(JSONArray jSONArray, JSONObject jSONObject) {
        String r11 = C0201.m82(13484);
        String r0 = C0201.m82(13485);
        if (jSONObject == null || jSONObject.length() == 0) {
            return new ArrayList();
        }
        try {
            ArrayList arrayList = new ArrayList(16);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                b bVar = new b();
                bVar.b(next);
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                bVar.c(jSONObject2.getString(C0201.m82(13486)));
                bVar.a(jSONObject2.getString(C0201.m82(13487)));
                JSONArray jSONArray2 = null;
                boolean has = jSONObject2.has(r11);
                String r8 = C0201.m82(13488);
                if (has) {
                    r8 = r11;
                } else if (!jSONObject2.has(r8)) {
                    Logger.w(r0, C0201.m82(13489));
                    HashSet hashSet = new HashSet(16);
                    if (jSONArray2 != null || jSONArray2.length() == 0) {
                        return new ArrayList();
                    }
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        hashSet.add((String) jSONArray2.get(i2));
                    }
                    bVar.a(hashSet);
                    arrayList.add(bVar);
                }
                jSONArray2 = jSONObject2.getJSONArray(r8);
                HashSet hashSet2 = new HashSet(16);
                if (jSONArray2 != null) {
                }
                return new ArrayList();
            }
            return arrayList;
        } catch (JSONException e) {
            Logger.w(r0, C0201.m82(13490), e);
            return new ArrayList();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004d  */
    @Override // com.huawei.hms.framework.network.grs.b.a
    public int b(String str) {
        JSONObject jSONObject;
        JSONArray jSONArray;
        String r0 = C0201.m82(13491);
        String r1 = C0201.m82(13492);
        String r2 = C0201.m82(13493);
        this.b = new ArrayList(16);
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            boolean has = jSONObject2.has(r1);
            String r6 = C0201.m82(13494);
            if (!has) {
                if (jSONObject2.has(r6)) {
                    r1 = r6;
                } else {
                    Logger.e(r2, C0201.m82(13495));
                    jSONObject = null;
                    if (jSONObject != null) {
                        return -1;
                    }
                    if (jSONObject.length() != 0) {
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            b bVar = new b();
                            bVar.b(next);
                            JSONObject jSONObject3 = jSONObject.getJSONObject(next);
                            bVar.c(jSONObject3.getString(C0201.m82(13496)));
                            bVar.a(jSONObject3.getString(C0201.m82(13497)));
                            boolean has2 = jSONObject3.has(r0);
                            String r10 = C0201.m82(13498);
                            if (has2) {
                                r10 = r0;
                            } else if (!jSONObject3.has(r10)) {
                                Logger.w(r2, C0201.m82(13499));
                                jSONArray = null;
                                HashSet hashSet = new HashSet(16);
                                if (jSONArray != null || jSONArray.length() == 0) {
                                    return -1;
                                }
                                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                                    hashSet.add((String) jSONArray.get(i2));
                                }
                                bVar.a(hashSet);
                                this.b.add(bVar);
                            }
                            jSONArray = jSONObject3.getJSONArray(r10);
                            HashSet hashSet2 = new HashSet(16);
                            if (jSONArray != null) {
                            }
                            return -1;
                        }
                    }
                    return 0;
                }
            }
            jSONObject = jSONObject2.getJSONObject(r1);
            if (jSONObject != null) {
            }
        } catch (JSONException e) {
            Logger.w(r2, C0201.m82(13500), e);
            return -1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0097 A[LOOP:2: B:19:0x0091->B:21:0x0097, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ef  */
    @Override // com.huawei.hms.framework.network.grs.b.a
    public int e(String str) {
        JSONObject jSONObject;
        String str2;
        Iterator<String> keys;
        String str3 = l;
        String str4 = q;
        String str5 = j;
        String str6 = g;
        try {
            JSONObject jSONObject2 = new JSONObject(str).getJSONObject(m);
            Iterator<String> keys2 = jSONObject2.keys();
            while (true) {
                int i2 = 0;
                if (!keys2.hasNext()) {
                    return 0;
                }
                String next = keys2.next();
                com.huawei.hms.framework.network.grs.local.model.c cVar = new com.huawei.hms.framework.network.grs.local.model.c();
                cVar.b(next);
                if (!this.e.contains(next)) {
                    this.e.add(next);
                    JSONObject jSONObject3 = jSONObject2.getJSONObject(next);
                    cVar.c(jSONObject3.getString(k));
                    JSONArray jSONArray = jSONObject3.getJSONArray(f);
                    while (i2 < jSONArray.length()) {
                        JSONObject jSONObject4 = (JSONObject) jSONArray.get(i2);
                        d dVar = new d();
                        boolean has = jSONObject4.has(str3);
                        String str7 = o;
                        if (has) {
                            str7 = str3;
                        } else if (!jSONObject4.has(str7)) {
                            Logger.v(str6, h);
                            str2 = i;
                            dVar.a(str2);
                            JSONObject jSONObject5 = jSONObject4.getJSONObject(r);
                            HashMap hashMap = new HashMap(16);
                            keys = jSONObject5.keys();
                            while (keys.hasNext()) {
                                String next2 = keys.next();
                                hashMap.put(next2, jSONObject5.getString(next2));
                                jSONObject2 = jSONObject2;
                                str3 = str3;
                            }
                            dVar.a(hashMap);
                            cVar.a(dVar.b(), dVar);
                            i2++;
                            jSONObject2 = jSONObject2;
                            str3 = str3;
                        }
                        str2 = jSONObject4.getString(str7);
                        dVar.a(str2);
                        JSONObject jSONObject52 = jSONObject4.getJSONObject(r);
                        HashMap hashMap2 = new HashMap(16);
                        keys = jSONObject52.keys();
                        while (keys.hasNext()) {
                        }
                        dVar.a(hashMap2);
                        cVar.a(dVar.b(), dVar);
                        i2++;
                        jSONObject2 = jSONObject2;
                        str3 = str3;
                    }
                    List<b> list = null;
                    if (jSONObject3.has(str5)) {
                        jSONObject = jSONObject3.getJSONObject(str5);
                    } else if (jSONObject3.has(str4)) {
                        jSONObject = jSONObject3.getJSONObject(str4);
                    } else {
                        Logger.v(str6, n);
                        cVar.a(list);
                        if (this.a == null) {
                            this.a = new a();
                        }
                        this.a.a(next, cVar);
                        jSONObject2 = jSONObject2;
                        str3 = str3;
                    }
                    list = a((JSONArray) null, jSONObject);
                    cVar.a(list);
                    if (this.a == null) {
                    }
                    this.a.a(next, cVar);
                    jSONObject2 = jSONObject2;
                    str3 = str3;
                }
            }
        } catch (JSONException e) {
            Logger.w(str6, p, e);
            return -1;
        }
    }
}
