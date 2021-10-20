package com.huawei.updatesdk.a.a.c.i.c;

import com.huawei.updatesdk.a.a.b.a.a.a;
import java.lang.reflect.InvocationTargetException;
import vigqyno.C0201;

public final class d implements a {
    private static final Object a = new Object();
    private static d b;

    private d() {
    }

    private static Object b() {
        StringBuilder sb;
        String str;
        String r0 = C0201.m82(5349);
        try {
            Class<?> cls = Class.forName(C0201.m82(5350));
            return cls.getDeclaredMethod(C0201.m82(5351), new Class[0]).invoke(cls, new Object[0]);
        } catch (ClassNotFoundException e) {
            sb = new StringBuilder();
            sb.append(r0);
            str = e.toString();
            sb.append(str);
            a.b(C0201.m82(5352), sb.toString());
            return null;
        } catch (SecurityException e2) {
            sb = new StringBuilder();
            sb.append(r0);
            str = e2.toString();
            sb.append(str);
            a.b(C0201.m82(5352), sb.toString());
            return null;
        } catch (NoSuchMethodException e3) {
            sb = new StringBuilder();
            sb.append(r0);
            str = e3.toString();
            sb.append(str);
            a.b(C0201.m82(5352), sb.toString());
            return null;
        } catch (IllegalAccessException e4) {
            sb = new StringBuilder();
            sb.append(r0);
            str = e4.toString();
            sb.append(str);
            a.b(C0201.m82(5352), sb.toString());
            return null;
        } catch (IllegalArgumentException e5) {
            sb = new StringBuilder();
            sb.append(r0);
            str = e5.toString();
            sb.append(str);
            a.b(C0201.m82(5352), sb.toString());
            return null;
        } catch (InvocationTargetException e6) {
            sb = new StringBuilder();
            sb.append(r0);
            str = e6.toString();
            sb.append(str);
            a.b(C0201.m82(5352), sb.toString());
            return null;
        } catch (Exception e7) {
            sb = new StringBuilder();
            sb.append(r0);
            str = e7.toString();
            sb.append(str);
            a.b(C0201.m82(5352), sb.toString());
            return null;
        }
    }

    public static d c() {
        d dVar;
        synchronized (a) {
            if (b == null) {
                b = new d();
            }
            dVar = b;
        }
        return dVar;
    }

    @Override // com.huawei.updatesdk.a.a.c.i.c.a
    public int a() {
        StringBuilder sb;
        String str;
        String r0 = C0201.m82(5353);
        String r1 = C0201.m82(5354);
        Object b2 = b();
        if (b2 != null) {
            try {
                Object invoke = b2.getClass().getMethod(C0201.m82(5355), new Class[0]).invoke(b2, new Object[0]);
                if (invoke instanceof Integer) {
                    return ((Integer) invoke).intValue();
                }
            } catch (NoSuchMethodException e) {
                sb = new StringBuilder();
                sb.append(r1);
                str = e.toString();
                sb.append(str);
                a.b(r0, sb.toString());
                return -1;
            } catch (InvocationTargetException e2) {
                sb = new StringBuilder();
                sb.append(r1);
                str = e2.toString();
                sb.append(str);
                a.b(r0, sb.toString());
                return -1;
            } catch (IllegalAccessException e3) {
                sb = new StringBuilder();
                sb.append(r1);
                str = e3.toString();
                sb.append(str);
                a.b(r0, sb.toString());
                return -1;
            }
        }
        return 0;
    }
}
