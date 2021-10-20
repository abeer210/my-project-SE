package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: i93  reason: default package */
/* compiled from: WOTSPlusOid */
public final class i93 implements r93 {
    private static final Map<String, i93> b;
    private final String a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(a(C0201.m82(13725), 32, 16, 67), new i93(16777217, C0201.m82(13726)));
        hashMap.put(a(C0201.m82(13727), 64, 16, 131), new i93(33554434, C0201.m82(13728)));
        hashMap.put(a(C0201.m82(13729), 32, 16, 67), new i93(50331651, C0201.m82(13730)));
        hashMap.put(a(C0201.m82(13731), 64, 16, 131), new i93(67108868, C0201.m82(13732)));
        b = Collections.unmodifiableMap(hashMap);
    }

    private i93(int i, String str) {
        this.a = str;
    }

    private static String a(String str, int i, int i2, int i3) {
        if (str != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            String r1 = C0201.m82(13733);
            sb.append(r1);
            sb.append(i);
            sb.append(r1);
            sb.append(i2);
            sb.append(r1);
            sb.append(i3);
            return sb.toString();
        }
        throw new NullPointerException(C0201.m82(13734));
    }

    public static i93 b(String str, int i, int i2, int i3) {
        if (str != null) {
            return b.get(a(str, i, i2, i3));
        }
        throw new NullPointerException(C0201.m82(13735));
    }

    public String toString() {
        return this.a;
    }
}
