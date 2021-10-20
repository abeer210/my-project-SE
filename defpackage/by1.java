package defpackage;

import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: by1  reason: default package */
public final class by1 {
    private static final Map<Integer, String> a = new HashMap();
    private static final Map<Integer, String> b = new HashMap();

    static {
        a.put(-1, C0201.m82(14468));
        a.put(-2, C0201.m82(14469));
        a.put(-3, C0201.m82(14470));
        a.put(-4, C0201.m82(14471));
        a.put(-5, C0201.m82(14472));
        a.put(-6, C0201.m82(14473));
        a.put(-7, C0201.m82(14474));
        a.put(-10, C0201.m82(14475));
        a.put(-11, C0201.m82(14476));
        a.put(-12, C0201.m82(14477));
        a.put(-13, C0201.m82(14478));
        a.put(-100, C0201.m82(14479));
        b.put(-1, C0201.m82(14480));
        b.put(-2, C0201.m82(14481));
        b.put(-3, C0201.m82(14482));
        b.put(-4, C0201.m82(14483));
        b.put(-5, C0201.m82(14484));
        b.put(-6, C0201.m82(14485));
        b.put(-7, C0201.m82(14486));
        b.put(-10, C0201.m82(14487));
        b.put(-11, C0201.m82(14488));
        b.put(-12, C0201.m82(14489));
        b.put(-13, C0201.m82(14490));
        b.put(-100, C0201.m82(14491));
    }

    public static String a(int i) {
        Map<Integer, String> map = a;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            return C0201.m82(14492);
        }
        String str = a.get(valueOf);
        String str2 = b.get(valueOf);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 113 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(C0201.m82(14493));
        sb.append(str2);
        sb.append(C0201.m82(14494));
        return sb.toString();
    }
}
