package com.huawei.hms.framework.network.grs.b;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.local.model.a;
import com.huawei.hms.framework.network.grs.local.model.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

public class d extends a {
    public d(Context context) {
        String appConfigName = GrsApp.getInstance().getAppConfigName();
        Logger.i(C0201.m82(13394), C0201.m82(13393) + appConfigName);
        if (a(TextUtils.isEmpty(appConfigName) ? C0201.m82(13395) : appConfigName, context, true) == 0) {
            this.d = true;
        }
    }

    @Override // com.huawei.hms.framework.network.grs.b.a
    public int a(String str) {
        String r0 = C0201.m82(13396);
        this.a = new a();
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONArray(C0201.m82(13397)).getJSONObject(0);
            this.a.b(jSONObject.getString(C0201.m82(13398)));
            JSONArray jSONArray = jSONObject.getJSONArray(C0201.m82(13399));
            if (jSONArray == null || jSONArray.length() == 0) {
                return -1;
            }
            if (jSONObject.has(r0)) {
                a(jSONObject.getJSONArray(r0));
            }
            return 0;
        } catch (JSONException e) {
            Logger.w(C0201.m82(13400), C0201.m82(13401), e);
            return -1;
        }
    }

    @Override // com.huawei.hms.framework.network.grs.b.a
    public List<b> a(JSONArray jSONArray, JSONObject jSONObject) {
        String r13 = C0201.m82(13402);
        String r0 = C0201.m82(13403);
        if (jSONArray == null || jSONArray.length() == 0) {
            return new ArrayList();
        }
        try {
            ArrayList arrayList = new ArrayList(16);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                b bVar = new b();
                bVar.b(jSONObject2.getString(C0201.m82(13404)));
                bVar.c(jSONObject2.getString(C0201.m82(13405)));
                bVar.a(jSONObject2.getString(C0201.m82(13406)));
                JSONArray jSONArray2 = null;
                boolean has = jSONObject2.has(r13);
                String r9 = C0201.m82(13407);
                if (has) {
                    r9 = r13;
                } else if (!jSONObject2.has(r9)) {
                    Logger.w(r0, C0201.m82(13408));
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
                jSONArray2 = jSONObject2.getJSONArray(r9);
                HashSet hashSet2 = new HashSet(16);
                if (jSONArray2 != null) {
                }
                return new ArrayList();
            }
            return arrayList;
        } catch (JSONException e) {
            Logger.w(r0, C0201.m82(13409), e);
            return new ArrayList();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004d  */
    @Override // com.huawei.hms.framework.network.grs.b.a
    public int b(String str) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        String r0 = C0201.m82(13410);
        String r1 = C0201.m82(13411);
        String r2 = C0201.m82(13412);
        this.b = new ArrayList(16);
        try {
            JSONObject jSONObject = new JSONObject(str);
            boolean has = jSONObject.has(r1);
            String r6 = C0201.m82(13413);
            if (!has) {
                if (jSONObject.has(r6)) {
                    r1 = r6;
                } else {
                    Logger.e(r2, C0201.m82(13414));
                    jSONArray = null;
                    if (jSONArray != null) {
                        return -1;
                    }
                    if (jSONArray.length() != 0) {
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            b bVar = new b();
                            bVar.b(jSONObject2.getString(C0201.m82(13415)));
                            bVar.c(jSONObject2.getString(C0201.m82(13416)));
                            bVar.a(jSONObject2.getString(C0201.m82(13417)));
                            boolean has2 = jSONObject2.has(r0);
                            String r10 = C0201.m82(13418);
                            if (has2) {
                                r10 = r0;
                            } else if (!jSONObject2.has(r10)) {
                                Logger.w(r2, C0201.m82(13419));
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
        } catch (JSONException e) {
            Logger.w(r2, C0201.m82(13420), e);
            return -1;
        }
    }

    @Override // com.huawei.hms.framework.network.grs.b.a
    public int e(String str) {
        return d(str);
    }
}
