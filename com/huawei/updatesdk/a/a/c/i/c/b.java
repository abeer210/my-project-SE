package com.huawei.updatesdk.a.a.c.i.c;

import com.huawei.updatesdk.a.a.c.i.c.a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import vigqyno.C0201;

public class b {
    private static a.EnumC0111a a = a.EnumC0111a.MODE_SUPPORT_UNKNOWN;
    private static a b;

    public static a a() {
        d();
        b = a == a.EnumC0111a.MODE_SUPPORT_MTK_GEMINI ? d.c() : c.c();
        return b;
    }

    public static boolean b() {
        String str;
        StringBuilder sb;
        String str2;
        String r0 = C0201.m82(5274);
        String r1 = C0201.m82(5275);
        boolean z = false;
        try {
            Object b2 = c.b();
            if (b2 != null) {
                Object invoke = b2.getClass().getMethod(C0201.m82(5276), new Class[0]).invoke(b2, new Object[0]);
                if (invoke instanceof Boolean) {
                    z = ((Boolean) invoke).booleanValue();
                }
            }
        } catch (NoSuchMethodException e) {
            str = C0201.m82(5277) + e.toString();
            com.huawei.updatesdk.a.a.b.a.a.a.b(r1, str);
            com.huawei.updatesdk.a.a.b.a.a.a.a(r1, C0201.m82(5278) + z);
            return z;
        } catch (IllegalAccessException e2) {
            sb = new StringBuilder();
            sb.append(r0);
            str2 = e2.toString();
            sb.append(str2);
            str = sb.toString();
            com.huawei.updatesdk.a.a.b.a.a.a.b(r1, str);
            com.huawei.updatesdk.a.a.b.a.a.a.a(r1, C0201.m82(5278) + z);
            return z;
        } catch (InvocationTargetException e3) {
            sb = new StringBuilder();
            sb.append(r0);
            str2 = e3.toString();
            sb.append(str2);
            str = sb.toString();
            com.huawei.updatesdk.a.a.b.a.a.a.b(r1, str);
            com.huawei.updatesdk.a.a.b.a.a.a.a(r1, C0201.m82(5278) + z);
            return z;
        }
        com.huawei.updatesdk.a.a.b.a.a.a.a(r1, C0201.m82(5278) + z);
        return z;
    }

    private static boolean c() {
        boolean z;
        StringBuilder sb;
        String str;
        String r0 = C0201.m82(5279);
        String r1 = C0201.m82(5280);
        try {
            Field declaredField = Class.forName(C0201.m82(5281)).getDeclaredField(C0201.m82(5282));
            declaredField.setAccessible(true);
            z = declaredField.getBoolean(null);
        } catch (ClassNotFoundException e) {
            sb = new StringBuilder();
            sb.append(r0);
            str = e.toString();
        } catch (NoSuchFieldException e2) {
            sb = new StringBuilder();
            sb.append(r0);
            str = e2.toString();
        } catch (IllegalAccessException e3) {
            sb = new StringBuilder();
            sb.append(r0);
            str = e3.toString();
        } catch (Exception e4) {
            sb = new StringBuilder();
            sb.append(r0);
            str = e4.toString();
        }
        com.huawei.updatesdk.a.a.b.a.a.a.a(r1, C0201.m82(5283) + z);
        return z;
        sb.append(str);
        com.huawei.updatesdk.a.a.b.a.a.a.d(r1, sb.toString());
        z = false;
        com.huawei.updatesdk.a.a.b.a.a.a.a(r1, C0201.m82(5283) + z);
        return z;
    }

    public static boolean d() {
        a.EnumC0111a aVar;
        if (a == a.EnumC0111a.MODE_SUPPORT_UNKNOWN) {
            if (c()) {
                aVar = a.EnumC0111a.MODE_SUPPORT_MTK_GEMINI;
            } else if (b()) {
                aVar = a.EnumC0111a.MODE_SUPPORT_HW_GEMINI;
            } else {
                a = a.EnumC0111a.MODE_NOT_SUPPORT_GEMINI;
            }
            a = aVar;
            return true;
        } else if (a == a.EnumC0111a.MODE_SUPPORT_HW_GEMINI || a == a.EnumC0111a.MODE_SUPPORT_MTK_GEMINI) {
            return true;
        }
        return false;
    }
}
