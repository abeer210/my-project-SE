package defpackage;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import vigqyno.C0201;

/* renamed from: ld1  reason: default package */
public final class ld1 {
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
        C0201.m83(ld1.class, 25);
    }

    private static void a(String str, Object obj, StringBuffer stringBuffer, StringBuffer stringBuffer2) throws IllegalAccessException, InvocationTargetException {
        int i2;
        if (obj == null) {
            return;
        }
        if (obj instanceof md1) {
            int length = stringBuffer.length();
            if (str != null) {
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(c(str));
                stringBuffer2.append(i);
                stringBuffer.append(k);
            }
            Class<?> cls = obj.getClass();
            Field[] fields = cls.getFields();
            for (Field field : fields) {
                int modifiers = field.getModifiers();
                String name = field.getName();
                if (!m.equals(name) && (modifiers & 1) == 1 && (modifiers & 8) != 8) {
                    String str2 = l;
                    if (!name.startsWith(str2) && !name.endsWith(str2)) {
                        Class<?> type = field.getType();
                        Object obj2 = field.get(obj);
                        if (!type.isArray() || type.getComponentType() == Byte.TYPE) {
                            a(name, obj2, stringBuffer, stringBuffer2);
                        } else {
                            if (obj2 == null) {
                                i2 = 0;
                            } else {
                                i2 = Array.getLength(obj2);
                            }
                            for (int i3 = 0; i3 < i2; i3++) {
                                a(name, Array.get(obj2, i3), stringBuffer, stringBuffer2);
                            }
                        }
                    }
                }
            }
            for (Method method : cls.getMethods()) {
                String name2 = method.getName();
                if (name2.startsWith(a)) {
                    String substring = name2.substring(3);
                    try {
                        String str3 = j;
                        String valueOf = String.valueOf(substring);
                        if (((Boolean) cls.getMethod(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), new Class[0]).invoke(obj, new Object[0])).booleanValue()) {
                            String str4 = b;
                            String valueOf2 = String.valueOf(substring);
                            a(substring, cls.getMethod(valueOf2.length() != 0 ? str4.concat(valueOf2) : new String(str4), new Class[0]).invoke(obj, new Object[0]), stringBuffer, stringBuffer2);
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                }
            }
            if (str != null) {
                stringBuffer.setLength(length);
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(f);
                return;
            }
            return;
        }
        String c2 = c(str);
        stringBuffer2.append(stringBuffer);
        stringBuffer2.append(c2);
        stringBuffer2.append(d);
        if (obj instanceof String) {
            String str5 = (String) obj;
            if (!str5.startsWith(e) && str5.length() > 200) {
                str5 = String.valueOf(str5.substring(0, 200)).concat(n);
            }
            int length2 = str5.length();
            StringBuilder sb = new StringBuilder(length2);
            for (int i4 = 0; i4 < length2; i4++) {
                char charAt = str5.charAt(i4);
                if (charAt < ' ' || charAt > '~' || charAt == '\"' || charAt == '\'') {
                    sb.append(String.format(o, Integer.valueOf(charAt)));
                } else {
                    sb.append(charAt);
                }
            }
            String sb2 = sb.toString();
            String str6 = c;
            stringBuffer2.append(str6);
            stringBuffer2.append(sb2);
            stringBuffer2.append(str6);
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (bArr == null) {
                stringBuffer2.append(h);
            } else {
                stringBuffer2.append('\"');
                for (byte b2 : bArr) {
                    int i5 = b2 & 255;
                    if (i5 == 92 || i5 == 34) {
                        stringBuffer2.append('\\');
                        stringBuffer2.append((char) i5);
                    } else if (i5 < 32 || i5 >= 127) {
                        stringBuffer2.append(String.format(p, Integer.valueOf(i5)));
                    } else {
                        stringBuffer2.append((char) i5);
                    }
                }
                stringBuffer2.append('\"');
            }
        } else {
            stringBuffer2.append(obj);
        }
        stringBuffer2.append(g);
    }

    public static <T extends md1> String b(T t) {
        String r0 = C0201.m82(7658);
        if (t == null) {
            return C0201.m82(7659);
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            a(null, t, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e2) {
            String valueOf = String.valueOf(e2.getMessage());
            return valueOf.length() != 0 ? r0.concat(valueOf) : new String(r0);
        } catch (InvocationTargetException e3) {
            String valueOf2 = String.valueOf(e3.getMessage());
            return valueOf2.length() != 0 ? r0.concat(valueOf2) : new String(r0);
        }
    }

    private static String c(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (i2 == 0) {
                stringBuffer.append(Character.toLowerCase(charAt));
            } else if (Character.isUpperCase(charAt)) {
                stringBuffer.append('_');
                stringBuffer.append(Character.toLowerCase(charAt));
            } else {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString();
    }
}
