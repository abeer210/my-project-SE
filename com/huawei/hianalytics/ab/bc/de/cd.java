package com.huawei.hianalytics.ab.bc.de;

import android.os.Build;
import android.text.TextUtils;
import com.huawei.hianalytics.ab.bc.cd.bc.ef;
import com.huawei.hianalytics.ab.bc.ef.ab;
import com.huawei.hianalytics.ab.ef.bc;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

public class cd {
    public static ef ab() {
        String r0 = C0201.m82(23888);
        ab.cd(r0, C0201.m82(23889));
        fg.ef().de();
        if (!TextUtils.isEmpty(fg.ef().ab())) {
            return new ef(fg.ef().cd());
        }
        ab.fg(r0, C0201.m82(23890));
        return null;
    }

    public static com.huawei.hianalytics.ab.ef.ab ab(String str, String str2) {
        com.huawei.hianalytics.ab.ef.ab abVar = new com.huawei.hianalytics.ab.ef.ab();
        abVar.ab(com.huawei.hianalytics.ab.cd.bc.ab.ab().ab(str, str2));
        return abVar;
    }

    public static bc ab(String str, String str2, String str3, String str4) {
        bc bcVar = new bc();
        bcVar.ab(str);
        bcVar.bc(com.huawei.hianalytics.ab.ab.bc.cd());
        bcVar.ef(str2);
        bcVar.cd(str4);
        StringBuffer stringBuffer = new StringBuffer(C0201.m82(23891));
        stringBuffer.append(str3);
        stringBuffer.append(C0201.m82(23892));
        bcVar.de(stringBuffer.toString());
        return bcVar;
    }

    public static com.huawei.hianalytics.ab.ef.cd ab(String str, String str2, String str3) {
        com.huawei.hianalytics.ab.ef.cd cdVar = new com.huawei.hianalytics.ab.ef.cd();
        cdVar.cd(com.huawei.hianalytics.ab.ab.bc.gh());
        cdVar.ef(com.huawei.hianalytics.ab.ab.bc.ij());
        cdVar.ab(str3);
        cdVar.bc(com.huawei.hianalytics.ab.cd.bc.ab.ab().bc(str2, str));
        return cdVar;
    }

    public static Map<String, String> bc(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(C0201.m82(23893), com.huawei.hianalytics.ab.ab.bc.cd());
        hashMap.put(C0201.m82(23894), com.huawei.hianalytics.ab.ab.bc.de());
        hashMap.put(C0201.m82(23895), C0201.m82(23896));
        hashMap.put(C0201.m82(23897), C0201.m82(23898));
        hashMap.put(C0201.m82(23899), Build.MODEL);
        hashMap.put(C0201.m82(23900), str);
        ab.ab(C0201.m82(23901), C0201.m82(23902), str2);
        hashMap.put(C0201.m82(23903), str2);
        return hashMap;
    }
}
