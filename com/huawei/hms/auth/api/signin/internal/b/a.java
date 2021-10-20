package com.huawei.hms.auth.api.signin.internal.b;

import com.huawei.hms.support.api.hwid.HuaweiIdSignInOptions;
import com.huawei.hms.support.api.hwid.SignInHuaweiId;
import com.huawei.hms.support.log.HMSLog;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import vigqyno.C0201;

/* compiled from: LightStorage */
public class a {
    private static final a a = new a();
    private Map<String, String> b = new ConcurrentHashMap();

    private a() {
    }

    public static a a() {
        return a;
    }

    public final SignInHuaweiId b() {
        try {
            String str = this.b.get(C0201.m82(7155));
            if (str != null) {
                return SignInHuaweiId.fromJson(str);
            }
            return null;
        } catch (Throwable th) {
            HMSLog.e(C0201.m82(7157), C0201.m82(7156) + th.getClass().getSimpleName());
            return null;
        }
    }

    public void c() {
        this.b.clear();
    }

    public void a(SignInHuaweiId signInHuaweiId, HuaweiIdSignInOptions huaweiIdSignInOptions) {
        String str;
        String str2 = null;
        if (signInHuaweiId != null) {
            try {
                str = signInHuaweiId.toJson();
            } catch (Throwable th) {
                HMSLog.e(C0201.m82(7152), C0201.m82(7151) + th.getMessage());
                return;
            }
        } else {
            str = null;
        }
        if (huaweiIdSignInOptions != null) {
            str2 = huaweiIdSignInOptions.toJson();
        }
        a(str, str2);
    }

    public void a(String str, String str2) {
        Map<String, String> map = this.b;
        String r1 = C0201.m82(7153);
        map.remove(r1);
        Map<String, String> map2 = this.b;
        String r2 = C0201.m82(7154);
        map2.remove(r2);
        if (str != null) {
            this.b.put(r1, str);
        }
        if (str2 != null) {
            this.b.put(r2, str2);
        }
    }
}
