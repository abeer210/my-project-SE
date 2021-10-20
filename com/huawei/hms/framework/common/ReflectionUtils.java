package com.huawei.hms.framework.common;

import android.text.TextUtils;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import vigqyno.C0201;

public class ReflectionUtils {
    private static final String TAG = null;

    static {
        C0201.m83(ReflectionUtils.class, 362);
    }

    public static Class<?> getClass(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!C0201.m82(3437).equals(str) && !C0201.m82(3438).equals(str)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            Logger.w(C0201.m82(3439), C0201.m82(3440));
            return null;
        }
    }

    private static Method getMethod(Class<?> cls, String str, Class<?>... clsArr) {
        String str2;
        Throwable e;
        String r1 = C0201.m82(3441);
        if (cls == null || str == null) {
            Logger.w(r1, C0201.m82(3446));
            return null;
        } else if (!C0201.m82(3442).equals(str) && !C0201.m82(3443).equals(str)) {
            return null;
        } else {
            try {
                return cls.getDeclaredMethod(str, clsArr);
            } catch (SecurityException e2) {
                e = e2;
                str2 = C0201.m82(3445);
                Logger.e(r1, str2, e);
                return null;
            } catch (NoSuchMethodException e3) {
                e = e3;
                str2 = C0201.m82(3444);
                Logger.e(r1, str2, e);
                return null;
            }
        }
    }

    public static Object getStaticFieldObj(String str, String str2) {
        String str3;
        Throwable e;
        String r0 = C0201.m82(3447);
        Class<?> cls = getClass(str);
        if (cls == null || TextUtils.isEmpty(str2) || !C0201.m82(3448).equals(str) || !C0201.m82(3449).equals(str2)) {
            return null;
        }
        try {
            Field declaredField = cls.getDeclaredField(str2);
            AccessibleObject.setAccessible(new Field[]{declaredField}, true);
            return declaredField.get(cls);
        } catch (IllegalAccessException e2) {
            e = e2;
            str3 = C0201.m82(3453);
        } catch (IllegalArgumentException e3) {
            e = e3;
            str3 = C0201.m82(3452);
        } catch (NoSuchFieldException e4) {
            e = e4;
            str3 = C0201.m82(3451);
        } catch (SecurityException e5) {
            e = e5;
            str3 = C0201.m82(3450);
        }
        Logger.e(r0, str3, e);
        return null;
    }

    private static Object invoke(Object obj, Method method, Object... objArr) {
        String str;
        Throwable e;
        String r0 = C0201.m82(3454);
        if (method == null) {
            return null;
        }
        try {
            return method.invoke(obj, objArr);
        } catch (RuntimeException e2) {
            e = e2;
            str = C0201.m82(3456);
            Logger.e(r0, str, e);
            return null;
        } catch (Exception e3) {
            e = e3;
            str = C0201.m82(3455);
            Logger.e(r0, str, e);
            return null;
        }
    }

    public static Object invokeStaticMethod(String str, String str2, Class<?>[] clsArr, Object... objArr) {
        Method method = getMethod(getClass(str), str2, clsArr);
        if (method == null) {
            return null;
        }
        return invoke(null, method, objArr);
    }

    public static Object invokeStaticMethod(String str, String str2, Object... objArr) {
        Class[] clsArr;
        if (objArr != null) {
            int length = objArr.length;
            clsArr = new Class[length];
            for (int i = 0; i < length; i++) {
                setClassType(clsArr, objArr[i], i);
            }
        } else {
            clsArr = null;
        }
        Method method = getMethod(getClass(str), str2, clsArr);
        if (method == null) {
            return null;
        }
        return invoke(null, method, objArr);
    }

    private static void setClassType(Class<?>[] clsArr, Object obj, int i) {
        if (obj instanceof Integer) {
            clsArr[i] = Integer.TYPE;
        } else if (obj instanceof Long) {
            clsArr[i] = Long.TYPE;
        } else if (obj instanceof Double) {
            clsArr[i] = Double.TYPE;
        } else if (obj instanceof Float) {
            clsArr[i] = Float.TYPE;
        } else if (obj instanceof Boolean) {
            clsArr[i] = Boolean.TYPE;
        } else if (obj instanceof Character) {
            clsArr[i] = Character.TYPE;
        } else if (obj instanceof Byte) {
            clsArr[i] = Byte.TYPE;
        } else if (obj instanceof Void) {
            clsArr[i] = Void.TYPE;
        } else if (obj instanceof Short) {
            clsArr[i] = Short.TYPE;
        } else {
            clsArr[i] = obj.getClass();
        }
    }
}
