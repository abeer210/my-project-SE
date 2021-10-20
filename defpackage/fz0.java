package defpackage;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import vigqyno.C0201;

/* renamed from: fz0  reason: default package */
public final class fz0 {
    public static final String a = null;
    public static final String b = null;
    public static final String c = null;
    public static final String d = null;
    public static final String e = null;
    public static final String f = null;
    public static final String g = null;
    public static final String h = null;
    public static final String i = null;
    public static final String j = null;
    public static final String k = null;
    public static final String l = null;
    public static final String m = null;
    public static final String n = null;
    public static final String o = null;
    public static final String p = null;

    static {
        C0201.m83(fz0.class, 86);
    }

    public static <T extends dz0> String a(T t) {
        String r0 = C0201.m82(28075);
        if (t == null) {
            return C0201.m82(28076);
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            b(null, t, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e2) {
            String valueOf = String.valueOf(e2.getMessage());
            return valueOf.length() != 0 ? r0.concat(valueOf) : new String(r0);
        } catch (InvocationTargetException e3) {
            String valueOf2 = String.valueOf(e3.getMessage());
            return valueOf2.length() != 0 ? r0.concat(valueOf2) : new String(r0);
        }
    }

    private static void b(String str, Object obj, StringBuffer stringBuffer, StringBuffer stringBuffer2) throws IllegalAccessException, InvocationTargetException {
        if (obj == null) {
            return;
        }
        if (obj instanceof dz0) {
            int length = stringBuffer.length();
            if (str != null) {
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(c(str));
                stringBuffer2.append(e);
                stringBuffer.append(n);
            }
            Class<?> cls = obj.getClass();
            Field[] fields = cls.getFields();
            for (Field field : fields) {
                int modifiers = field.getModifiers();
                String name = field.getName();
                if (!d.equals(name) && (modifiers & 1) == 1 && (modifiers & 8) != 8) {
                    String str2 = p;
                    if (!name.startsWith(str2) && !name.endsWith(str2)) {
                        Class<?> type = field.getType();
                        Object obj2 = field.get(obj);
                        if (!type.isArray() || type.getComponentType() == Byte.TYPE) {
                            b(name, obj2, stringBuffer, stringBuffer2);
                        } else {
                            int length2 = obj2 == null ? 0 : Array.getLength(obj2);
                            for (int i2 = 0; i2 < length2; i2++) {
                                b(name, Array.get(obj2, i2), stringBuffer, stringBuffer2);
                            }
                        }
                    }
                }
            }
            for (Method method : cls.getMethods()) {
                String name2 = method.getName();
                if (name2.startsWith(b)) {
                    String substring = name2.substring(3);
                    try {
                        String str3 = j;
                        String valueOf = String.valueOf(substring);
                        if (((Boolean) cls.getMethod(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), new Class[0]).invoke(obj, new Object[0])).booleanValue()) {
                            String str4 = l;
                            String valueOf2 = String.valueOf(substring);
                            b(substring, cls.getMethod(valueOf2.length() != 0 ? str4.concat(valueOf2) : new String(str4), new Class[0]).invoke(obj, new Object[0]), stringBuffer, stringBuffer2);
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                }
            }
            if (str != null) {
                stringBuffer.setLength(length);
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(i);
                return;
            }
            return;
        }
        String c2 = c(str);
        stringBuffer2.append(stringBuffer);
        stringBuffer2.append(c2);
        stringBuffer2.append(f);
        if (obj instanceof String) {
            String str5 = (String) obj;
            if (!str5.startsWith(a) && str5.length() > 200) {
                str5 = String.valueOf(str5.substring(0, 200)).concat(o);
            }
            int length3 = str5.length();
            StringBuilder sb = new StringBuilder(length3);
            for (int i3 = 0; i3 < length3; i3++) {
                char charAt = str5.charAt(i3);
                if (charAt < ' ' || charAt > '~' || charAt == '\"' || charAt == '\'') {
                    sb.append(String.format(k, Integer.valueOf(charAt)));
                } else {
                    sb.append(charAt);
                }
            }
            String sb2 = sb.toString();
            String str6 = m;
            stringBuffer2.append(str6);
            stringBuffer2.append(sb2);
            stringBuffer2.append(str6);
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (bArr == null) {
                stringBuffer2.append(g);
            } else {
                stringBuffer2.append('\"');
                for (byte b2 : bArr) {
                    int i4 = b2 & 255;
                    if (i4 == 92 || i4 == 34) {
                        stringBuffer2.append('\\');
                    } else if (i4 < 32 || i4 >= 127) {
                        stringBuffer2.append(String.format(h, Integer.valueOf(i4)));
                    }
                    stringBuffer2.append((char) i4);
                }
                stringBuffer2.append('\"');
            }
        } else {
            stringBuffer2.append(obj);
        }
        stringBuffer2.append(c);
    }

    private static String c(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (i2 != 0) {
                if (Character.isUpperCase(charAt)) {
                    stringBuffer.append('_');
                }
                stringBuffer.append(charAt);
            }
            charAt = Character.toLowerCase(charAt);
            stringBuffer.append(charAt);
        }
        return stringBuffer.toString();
    }
}
