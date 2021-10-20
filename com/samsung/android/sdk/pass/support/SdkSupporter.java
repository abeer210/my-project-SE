package com.samsung.android.sdk.pass.support;

import android.util.Log;
import java.lang.reflect.Field;
import java.util.HashMap;
import vigqyno.C0201;

public class SdkSupporter {
    public static final String CLASSNAME_FINGERPRINT_MANAGER = null;

    static {
        C0201.m83(SdkSupporter.class, 714);
    }

    public static boolean copyStaticFields(Object obj, Class cls, String str, String str2) {
        Field field;
        try {
            Field[] fields = Class.forName(str).getFields();
            HashMap hashMap = new HashMap();
            for (Field field2 : fields) {
                hashMap.put(field2.getName(), field2);
            }
            Field[] fields2 = cls.getFields();
            for (Field field3 : fields2) {
                String name = field3.getName();
                if ((str2 == null || name.startsWith(str2)) && (field = (Field) hashMap.get(name)) != null && field.getType().equals(field3.getType())) {
                    field3.set(obj, field.get(null));
                }
            }
            return true;
        } catch (Exception e) {
            Log.w(C0201.m82(13081), C0201.m82(13080) + e);
            return true;
        }
    }
}
