package com.huawei.updatesdk.a.a.c.i.c;

import com.huawei.updatesdk.a.a.b.a.a.a;
import java.lang.reflect.InvocationTargetException;
import vigqyno.C0201;

public class c implements a {
    private static final Object a = new Object();
    private static c b;

    public static Object b() {
        StringBuilder sb;
        String str;
        String r0 = C0201.m82(5326);
        String r1 = C0201.m82(5327);
        try {
            Class<?> cls = Class.forName(C0201.m82(5328));
            return cls.getDeclaredMethod(C0201.m82(5329), new Class[0]).invoke(cls, new Object[0]);
        } catch (NoSuchMethodException e) {
            sb = new StringBuilder();
            sb.append(r1);
            str = e.toString();
            sb.append(str);
            a.b(r0, sb.toString());
            return null;
        } catch (IllegalAccessException e2) {
            sb = new StringBuilder();
            sb.append(r1);
            str = e2.toString();
            sb.append(str);
            a.b(r0, sb.toString());
            return null;
        } catch (IllegalArgumentException e3) {
            sb = new StringBuilder();
            sb.append(r1);
            str = e3.toString();
            sb.append(str);
            a.b(r0, sb.toString());
            return null;
        } catch (InvocationTargetException e4) {
            sb = new StringBuilder();
            sb.append(r1);
            str = e4.toString();
            sb.append(str);
            a.b(r0, sb.toString());
            return null;
        } catch (ClassNotFoundException e5) {
            sb = new StringBuilder();
            sb.append(r1);
            str = e5.toString();
            sb.append(str);
            a.b(r0, sb.toString());
            return null;
        } catch (Exception e6) {
            sb = new StringBuilder();
            sb.append(r1);
            str = e6.toString();
            sb.append(str);
            a.b(r0, sb.toString());
            return null;
        }
    }

    public static c c() {
        c cVar;
        synchronized (a) {
            if (b == null) {
                b = new c();
            }
            cVar = b;
        }
        return cVar;
    }

    @Override // com.huawei.updatesdk.a.a.c.i.c.a
    public int a() {
        StringBuilder sb;
        String str;
        String r0 = C0201.m82(5330);
        String r1 = C0201.m82(5331);
        try {
            Object b2 = b();
            if (b2 != null) {
                Object invoke = b2.getClass().getMethod(C0201.m82(5332), new Class[0]).invoke(b2, new Object[0]);
                if (invoke instanceof Integer) {
                    return ((Integer) invoke).intValue();
                }
            }
            return 0;
        } catch (NoSuchMethodException e) {
            sb = new StringBuilder();
            sb.append(r1);
            str = e.toString();
            sb.append(str);
            a.b(r0, sb.toString());
            return -1;
        } catch (IllegalAccessException e2) {
            sb = new StringBuilder();
            sb.append(r1);
            str = e2.toString();
            sb.append(str);
            a.b(r0, sb.toString());
            return -1;
        } catch (InvocationTargetException e3) {
            sb = new StringBuilder();
            sb.append(r1);
            str = e3.toString();
            sb.append(str);
            a.b(r0, sb.toString());
            return -1;
        }
    }
}
