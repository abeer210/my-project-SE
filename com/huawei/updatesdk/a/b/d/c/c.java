package com.huawei.updatesdk.a.b.d.c;

import com.huawei.updatesdk.a.a.c.f;
import com.huawei.updatesdk.a.a.c.g;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

public class c {
    public static final String CLIENT_API = null;
    private static final String END_FLAG = null;
    private static String url;
    private String method_;
    private String ver_ = C0201.m82(28322);

    static {
        C0201.m83(c.class, 258);
    }

    private String a(Field field) throws IllegalAccessException, IllegalArgumentException {
        Object obj = field.get(this);
        if (obj != null && (obj instanceof b)) {
            return ((b) obj).toJson();
        }
        if (obj != null) {
            return String.valueOf(obj);
        }
        return null;
    }

    public static void c(String str) {
        url = str;
    }

    public String a() throws IllegalAccessException, IllegalArgumentException, ArrayIndexOutOfBoundsException {
        e();
        Map<String, Field> c = c();
        int size = c.size();
        String[] strArr = new String[size];
        c.keySet().toArray(strArr);
        Arrays.sort(strArr);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        do {
            String a = a(c.get(strArr[i]));
            if (a != null) {
                String a2 = g.a(a);
                sb.append(strArr[i]);
                sb.append(C0201.m82(28323));
                sb.append(a2);
                sb.append(C0201.m82(28324));
            }
            i++;
        } while (i < size);
        int length = sb.length();
        if (length > 0) {
            int i2 = length - 1;
            if (sb.charAt(i2) == '&') {
                sb.deleteCharAt(i2);
            }
        }
        return sb.toString();
    }

    public void a(String str) {
        this.method_ = str;
    }

    public String b() {
        return this.method_;
    }

    public void b(String str) {
        this.ver_ = str;
    }

    public Map<String, Field> c() {
        HashMap hashMap = new HashMap();
        Field[] a = f.a(getClass());
        for (Field field : a) {
            field.setAccessible(true);
            String name = field.getName();
            if (name.endsWith(C0201.m82(28325))) {
                hashMap.put(name.substring(0, name.length() - 1), field);
            }
        }
        return hashMap;
    }

    public String d() {
        return url + C0201.m82(28326);
    }

    public void e() {
    }
}
