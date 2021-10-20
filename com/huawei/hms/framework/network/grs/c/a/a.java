package com.huawei.hms.framework.network.grs.c.a;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.c.b.c;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

public class a {
    private static final String a = null;
    private static c b;

    static {
        C0201.m83(a.class, 690);
    }

    public static synchronized c a(Context context) {
        synchronized (a.class) {
            c cVar = b;
            if (cVar != null) {
                return cVar;
            }
            String a2 = com.huawei.hms.framework.network.grs.d.c.a(C0201.m82(18960), context);
            ArrayList arrayList = null;
            if (TextUtils.isEmpty(a2)) {
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(a2).getJSONObject(C0201.m82(18961));
                JSONArray jSONArray = jSONObject.getJSONArray(C0201.m82(18962));
                if (jSONArray != null && jSONArray.length() > 0) {
                    arrayList = new ArrayList();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        arrayList.add(jSONArray.get(i).toString());
                    }
                }
                c cVar2 = new c();
                b = cVar2;
                cVar2.a(arrayList);
                b.b(jSONObject.getString(C0201.m82(18963)));
                b.a(jSONObject.getString(C0201.m82(18964)));
                b.a(jSONObject.getInt(C0201.m82(18965)));
            } catch (JSONException e) {
                Logger.w(a, C0201.m82(18966), e);
            }
            return b;
        }
    }
}
