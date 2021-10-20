package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: c93  reason: default package */
/* compiled from: DefaultXMSSOid */
public final class c93 implements r93 {
    private static final Map<String, c93> b;
    private final String a;

    static {
        HashMap hashMap = new HashMap();
        String r1 = C0201.m82(12006);
        hashMap.put(a(r1, 32, 16, 67, 10), new c93(16777217, C0201.m82(12007)));
        hashMap.put(a(r1, 32, 16, 67, 16), new c93(33554434, C0201.m82(12008)));
        hashMap.put(a(r1, 32, 16, 67, 20), new c93(50331651, C0201.m82(12009)));
        String r12 = C0201.m82(12010);
        hashMap.put(a(r12, 64, 16, 131, 10), new c93(67108868, C0201.m82(12011)));
        hashMap.put(a(r12, 64, 16, 131, 16), new c93(83886085, C0201.m82(12012)));
        hashMap.put(a(r12, 64, 16, 131, 20), new c93(100663302, C0201.m82(12013)));
        String r13 = C0201.m82(12014);
        hashMap.put(a(r13, 32, 16, 67, 10), new c93(117440519, C0201.m82(12015)));
        hashMap.put(a(r13, 32, 16, 67, 16), new c93(134217736, C0201.m82(12016)));
        hashMap.put(a(r13, 32, 16, 67, 20), new c93(150994953, C0201.m82(12017)));
        String r14 = C0201.m82(12018);
        hashMap.put(a(r14, 64, 16, 131, 10), new c93(167772170, C0201.m82(12019)));
        hashMap.put(a(r14, 64, 16, 131, 16), new c93(184549387, C0201.m82(12020)));
        hashMap.put(a(r14, 64, 16, 131, 20), new c93(201326604, C0201.m82(12021)));
        b = Collections.unmodifiableMap(hashMap);
    }

    private c93(int i, String str) {
        this.a = str;
    }

    private static String a(String str, int i, int i2, int i3, int i4) {
        if (str != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            String r1 = C0201.m82(12022);
            sb.append(r1);
            sb.append(i);
            sb.append(r1);
            sb.append(i2);
            sb.append(r1);
            sb.append(i3);
            sb.append(r1);
            sb.append(i4);
            return sb.toString();
        }
        throw new NullPointerException(C0201.m82(12023));
    }

    public static c93 b(String str, int i, int i2, int i3, int i4) {
        if (str != null) {
            return b.get(a(str, i, i2, i3, i4));
        }
        throw new NullPointerException(C0201.m82(12024));
    }

    public String toString() {
        return this.a;
    }
}
