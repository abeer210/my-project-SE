package com.huawei.hms.framework.network.grs;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.a.b;
import com.huawei.hms.framework.network.grs.c.e;
import com.huawei.hms.framework.network.grs.c.l;
import com.huawei.hms.framework.network.grs.local.model.CountryCodeBean;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

public class a {
    private static final String a = null;
    private GrsBaseInfo b;
    private com.huawei.hms.framework.network.grs.a.a c;
    private l d;

    /* access modifiers changed from: private */
    /* renamed from: com.huawei.hms.framework.network.grs.a$a  reason: collision with other inner class name */
    public static class C0086a implements b {
        public String a;
        public Map<String, String> b;
        public IQueryUrlsCallBack c;

        public C0086a(String str, Map<String, String> map, IQueryUrlsCallBack iQueryUrlsCallBack) {
            this.a = str;
            this.b = map;
            this.c = iQueryUrlsCallBack;
        }

        @Override // com.huawei.hms.framework.network.grs.b
        public void a() {
            Map<String, String> map = this.b;
            if (map == null || map.isEmpty()) {
                this.c.onCallBackFail(-3);
            } else {
                this.c.onCallBackSuccess(this.b);
            }
        }

        @Override // com.huawei.hms.framework.network.grs.b
        public void a(e eVar) {
            Map<String, String> a2 = a.a(eVar.i(), this.a);
            if (!a2.isEmpty()) {
                this.c.onCallBackSuccess(a2);
                return;
            }
            Map<String, String> map = this.b;
            if (map == null || map.isEmpty()) {
                this.c.onCallBackFail(-5);
            } else {
                this.c.onCallBackSuccess(this.b);
            }
        }
    }

    private static class b implements b {
        public String a;
        public String b;
        public IQueryUrlCallBack c;
        public String d;

        public b(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack, String str3) {
            this.a = str;
            this.b = str2;
            this.c = iQueryUrlCallBack;
            this.d = str3;
        }

        @Override // com.huawei.hms.framework.network.grs.b
        public void a() {
            if (!TextUtils.isEmpty(this.d)) {
                this.c.onCallBackSuccess(this.d);
            } else {
                this.c.onCallBackFail(-3);
            }
        }

        @Override // com.huawei.hms.framework.network.grs.b
        public void a(e eVar) {
            String a2 = a.a(eVar.i(), this.a, this.b);
            if (!TextUtils.isEmpty(a2)) {
                this.c.onCallBackSuccess(a2);
            } else if (!TextUtils.isEmpty(this.d)) {
                this.c.onCallBackSuccess(this.d);
            } else {
                this.c.onCallBackFail(-5);
            }
        }
    }

    static {
        C0201.m83(a.class, 549);
    }

    public a(GrsBaseInfo grsBaseInfo, com.huawei.hms.framework.network.grs.a.a aVar, l lVar) {
        this.b = grsBaseInfo;
        this.c = aVar;
        this.d = lVar;
    }

    public static CountryCodeBean a(Context context, boolean z) {
        return new CountryCodeBean(context, z);
    }

    private String a(String str, String str2, b bVar, Context context) {
        String a2 = this.c.a(this.b, str, str2, bVar, context);
        if (TextUtils.isEmpty(a2)) {
            return com.huawei.hms.framework.network.grs.b.b.a(context.getPackageName(), this.b).a(this.b, str, str2);
        }
        Logger.i(a, C0201.m82(15107));
        return a2;
    }

    public static String a(String str, String str2, String str3) {
        boolean isEmpty = TextUtils.isEmpty(str);
        String r1 = C0201.m82(15108);
        if (isEmpty) {
            return r1;
        }
        try {
            return new JSONObject(str).getJSONObject(str2).getString(str3);
        } catch (JSONException e) {
            Logger.w(a, C0201.m82(15109), e);
            return r1;
        }
    }

    public static Map<String, Map<String, String>> a(String str) {
        HashMap hashMap = new HashMap(16);
        if (TextUtils.isEmpty(str)) {
            Logger.v(a, C0201.m82(15110));
            return hashMap;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String obj = keys.next().toString();
                hashMap.put(obj, a(jSONObject.getJSONObject(obj)));
            }
            return hashMap;
        } catch (JSONException e) {
            Logger.w(a, C0201.m82(15111), e);
            return hashMap;
        }
    }

    private Map<String, String> a(String str, b bVar, Context context) {
        Map<String, String> a2 = this.c.a(this.b, str, bVar, context);
        return (a2 == null || a2.isEmpty()) ? com.huawei.hms.framework.network.grs.b.b.a(context.getPackageName(), this.b).a(this.b, str) : a2;
    }

    public static Map<String, String> a(String str, String str2) {
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            Logger.v(a, C0201.m82(15112));
            return hashMap;
        }
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject(str2);
            if (jSONObject == null) {
                Logger.v(a, C0201.m82(15113));
                return hashMap;
            }
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String obj = keys.next().toString();
                hashMap.put(obj, jSONObject.get(obj).toString());
            }
            return hashMap;
        } catch (JSONException e) {
            Logger.w(a, C0201.m82(15114), e);
            return hashMap;
        }
    }

    public static Map<String, String> a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap(16);
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String obj = keys.next().toString();
                hashMap.put(obj, jSONObject.get(obj).toString());
            }
            return hashMap;
        } catch (JSONException e) {
            Logger.w(a, C0201.m82(15115), e);
            return hashMap;
        }
    }

    private void a(String str, Map<String, String> map, IQueryUrlsCallBack iQueryUrlsCallBack, Context context) {
        this.d.a(this.b, context, new C0086a(str, map, iQueryUrlsCallBack), str);
    }

    public String a(Context context, String str) {
        e a2 = this.d.a(this.b, context, str);
        return a2 == null ? C0201.m82(15116) : a2.i();
    }

    public String a(String str, String str2, Context context) {
        b bVar = new b();
        String a2 = a(str, str2, bVar, context);
        if (bVar.a()) {
            Logger.v(a, C0201.m82(15117), a2);
            return a2;
        }
        String a3 = a(a(context, str), str, str2);
        if (TextUtils.isEmpty(a3)) {
            return a2;
        }
        Logger.i(a, C0201.m82(15118));
        return a3;
    }

    public Map<String, String> a(String str, Context context) {
        b bVar = new b();
        Map<String, String> a2 = a(str, bVar, context);
        if (bVar.a()) {
            return a2;
        }
        Map<String, String> a3 = a(a(context, str), str);
        return !a3.isEmpty() ? a3 : a2;
    }

    public void a(String str, IQueryUrlsCallBack iQueryUrlsCallBack, Context context) {
        b bVar = new b();
        Map<String, String> a2 = a(str, bVar, context);
        if (!bVar.a()) {
            a(str, a2, iQueryUrlsCallBack, context);
        } else if (a2 == null || a2.isEmpty()) {
            iQueryUrlsCallBack.onCallBackFail(-5);
        } else {
            iQueryUrlsCallBack.onCallBackSuccess(a2);
        }
    }

    public void a(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack, Context context) {
        b bVar = new b();
        String a2 = a(str, str2, bVar, context);
        if (!bVar.a()) {
            this.d.a(this.b, context, new b(str, str2, iQueryUrlCallBack, a2), str);
        } else if (TextUtils.isEmpty(a2)) {
            iQueryUrlCallBack.onCallBackFail(-5);
        } else {
            iQueryUrlCallBack.onCallBackSuccess(a2);
        }
    }
}
