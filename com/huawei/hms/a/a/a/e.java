package com.huawei.hms.a.a.a;

import android.text.TextUtils;
import com.huawei.hms.support.log.HMSLog;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

/* compiled from: SmsRetrieverOutputBean */
public class e {
    private Integer a;
    private String b;

    public Integer a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public static e b(String str) {
        String r0 = C0201.m82(12645);
        String r1 = C0201.m82(12646);
        if (TextUtils.isEmpty(str)) {
            return new e();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String str2 = null;
            Integer valueOf = jSONObject.has(r1) ? Integer.valueOf(jSONObject.getInt(r1)) : null;
            if (jSONObject.has(r0)) {
                str2 = jSONObject.getString(r0);
            }
            e eVar = new e();
            eVar.a(valueOf);
            eVar.a(str2);
            return eVar;
        } catch (JSONException unused) {
            HMSLog.e(C0201.m82(12647), C0201.m82(12648));
            return new e();
        }
    }

    public void a(Integer num) {
        this.a = num;
    }

    public void a(String str) {
        this.b = str;
    }
}
