package defpackage;

import defpackage.kv0;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import vigqyno.C0201;

/* renamed from: tw0  reason: default package */
public final class tw0 {
    public static String a(qw0 qw0, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(C0201.m82(37682));
        sb.append(str);
        b(qw0, sb, 0);
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x021b, code lost:
        if (((java.lang.Boolean) r11).booleanValue() == false) goto L_0x021d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x022c, code lost:
        if (((java.lang.Integer) r11).intValue() == 0) goto L_0x021d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x023d, code lost:
        if (((java.lang.Float) r11).floatValue() == 0.0f) goto L_0x021d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x024f, code lost:
        if (((java.lang.Double) r11).doubleValue() == 0.0d) goto L_0x021d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0281  */
    private static void b(qw0 qw0, StringBuilder sb, int i) {
        String r10;
        boolean z;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        Method[] declaredMethods = qw0.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i2 = 0;
        while (true) {
            r10 = C0201.m82(37683);
            if (i2 >= length) {
                break;
            }
            Method method = declaredMethods[i2];
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith(r10)) {
                    treeSet.add(method.getName());
                }
            }
            i2++;
        }
        for (String str : treeSet) {
            String r7 = C0201.m82(37684);
            String replaceFirst = str.replaceFirst(r10, r7);
            String r11 = C0201.m82(37685);
            boolean z2 = true;
            if (replaceFirst.endsWith(r11) && !replaceFirst.endsWith(C0201.m82(37686)) && !replaceFirst.equals(r11)) {
                String valueOf = String.valueOf(replaceFirst.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(replaceFirst.substring(1, replaceFirst.length() - 4));
                String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    c(sb, i, d(concat), kv0.n(method2, qw0, new Object[0]));
                }
            }
            String r112 = C0201.m82(37687);
            if (replaceFirst.endsWith(r112) && !replaceFirst.equals(r112)) {
                String valueOf3 = String.valueOf(replaceFirst.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(replaceFirst.substring(1, replaceFirst.length() - 3));
                String concat2 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    c(sb, i, d(concat2), kv0.n(method3, qw0, new Object[0]));
                }
            }
            String r6 = C0201.m82(37688);
            String valueOf5 = String.valueOf(replaceFirst);
            if (((Method) hashMap2.get(valueOf5.length() != 0 ? r6.concat(valueOf5) : new String(r6))) != null) {
                if (replaceFirst.endsWith(C0201.m82(37689))) {
                    String valueOf6 = String.valueOf(replaceFirst.substring(0, replaceFirst.length() - 5));
                    if (hashMap.containsKey(valueOf6.length() != 0 ? r10.concat(valueOf6) : new String(r10))) {
                    }
                }
                String valueOf7 = String.valueOf(replaceFirst.substring(0, 1).toLowerCase());
                String valueOf8 = String.valueOf(replaceFirst.substring(1));
                String concat3 = valueOf8.length() != 0 ? valueOf7.concat(valueOf8) : new String(valueOf7);
                String valueOf9 = String.valueOf(replaceFirst);
                Method method4 = (Method) hashMap.get(valueOf9.length() != 0 ? r10.concat(valueOf9) : new String(r10));
                String r12 = C0201.m82(37690);
                String valueOf10 = String.valueOf(replaceFirst);
                Method method5 = (Method) hashMap.get(valueOf10.length() != 0 ? r12.concat(valueOf10) : new String(r12));
                if (method4 != null) {
                    Object n = kv0.n(method4, qw0, new Object[0]);
                    if (method5 == null) {
                        if (!(n instanceof Boolean)) {
                            if (!(n instanceof Integer)) {
                                if (!(n instanceof Float)) {
                                    if (!(n instanceof Double)) {
                                        Object obj = r7;
                                        if (!(n instanceof String)) {
                                            if (n instanceof fu0) {
                                                obj = fu0.b;
                                            } else if (!(n instanceof qw0)) {
                                                z = false;
                                                if (z) {
                                                    z2 = false;
                                                }
                                            } else {
                                                z = false;
                                                if (z) {
                                                }
                                            }
                                        }
                                        z = n.equals(obj);
                                        if (z) {
                                        }
                                    }
                                }
                            }
                        }
                        z = true;
                        if (z) {
                        }
                    } else {
                        z2 = ((Boolean) kv0.n(method5, qw0, new Object[0])).booleanValue();
                    }
                    if (z2) {
                        c(sb, i, d(concat3), n);
                    }
                }
            }
        }
        if (qw0 instanceof kv0.c) {
            Iterator<Map.Entry<kv0.d, Object>> e = ((kv0.c) qw0).zzjv.e();
            while (e.hasNext()) {
                Map.Entry<kv0.d, Object> next = e.next();
                int i3 = next.getKey().a;
                StringBuilder sb2 = new StringBuilder(13);
                sb2.append(C0201.m82(37691));
                sb2.append(i3);
                sb2.append(C0201.m82(37692));
                c(sb, i, sb2.toString(), next.getValue());
            }
        }
        by0 by0 = ((kv0) qw0).zzjp;
        if (by0 != null) {
            by0.c(sb, i);
        }
    }

    public static final void c(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                c(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                c(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            boolean z = obj instanceof String;
            String r3 = C0201.m82(37693);
            if (z) {
                sb.append(r3);
                sb.append(wx0.a(fu0.j((String) obj)));
                sb.append('\"');
            } else if (obj instanceof fu0) {
                sb.append(r3);
                sb.append(wx0.a((fu0) obj));
                sb.append('\"');
            } else {
                boolean z2 = obj instanceof kv0;
                String r1 = C0201.m82(37694);
                String r32 = C0201.m82(37695);
                String r4 = C0201.m82(37696);
                if (z2) {
                    sb.append(r4);
                    b((kv0) obj, sb, i + 2);
                    sb.append(r32);
                    while (i2 < i) {
                        sb.append(' ');
                        i2++;
                    }
                    sb.append(r1);
                } else if (obj instanceof Map.Entry) {
                    sb.append(r4);
                    Map.Entry entry2 = (Map.Entry) obj;
                    int i4 = i + 2;
                    c(sb, i4, C0201.m82(37697), entry2.getKey());
                    c(sb, i4, C0201.m82(37698), entry2.getValue());
                    sb.append(r32);
                    while (i2 < i) {
                        sb.append(' ');
                        i2++;
                    }
                    sb.append(r1);
                } else {
                    sb.append(C0201.m82(37699));
                    sb.append(obj.toString());
                }
            }
        }
    }

    private static final String d(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append(C0201.m82(37700));
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }
}
