package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: b93  reason: default package */
/* compiled from: DefaultXMSSMTOid */
public final class b93 implements r93 {
    private static final Map<String, b93> b;
    private final String a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(a(C0201.m82(24813), 32, 16, 67, 20, 2), new b93(16777217, C0201.m82(24814)));
        hashMap.put(a(C0201.m82(24815), 32, 16, 67, 20, 4), new b93(16777217, C0201.m82(24816)));
        hashMap.put(a(C0201.m82(24817), 32, 16, 67, 40, 2), new b93(16777217, C0201.m82(24818)));
        hashMap.put(a(C0201.m82(24819), 32, 16, 67, 40, 2), new b93(16777217, C0201.m82(24820)));
        hashMap.put(a(C0201.m82(24821), 32, 16, 67, 40, 4), new b93(16777217, C0201.m82(24822)));
        hashMap.put(a(C0201.m82(24823), 32, 16, 67, 60, 8), new b93(16777217, C0201.m82(24824)));
        hashMap.put(a(C0201.m82(24825), 32, 16, 67, 60, 6), new b93(16777217, C0201.m82(24826)));
        hashMap.put(a(C0201.m82(24827), 32, 16, 67, 60, 12), new b93(16777217, C0201.m82(24828)));
        hashMap.put(a(C0201.m82(24829), 64, 16, 131, 20, 2), new b93(16777217, C0201.m82(24830)));
        hashMap.put(a(C0201.m82(24831), 64, 16, 131, 20, 4), new b93(16777217, C0201.m82(24832)));
        hashMap.put(a(C0201.m82(24833), 64, 16, 131, 40, 2), new b93(16777217, C0201.m82(24834)));
        hashMap.put(a(C0201.m82(24835), 64, 16, 131, 40, 4), new b93(16777217, C0201.m82(24836)));
        hashMap.put(a(C0201.m82(24837), 64, 16, 131, 40, 8), new b93(16777217, C0201.m82(24838)));
        hashMap.put(a(C0201.m82(24839), 64, 16, 131, 60, 3), new b93(16777217, C0201.m82(24840)));
        hashMap.put(a(C0201.m82(24841), 64, 16, 131, 60, 6), new b93(16777217, C0201.m82(24842)));
        hashMap.put(a(C0201.m82(24843), 64, 16, 131, 60, 12), new b93(16777217, C0201.m82(24844)));
        hashMap.put(a(C0201.m82(24845), 32, 16, 67, 20, 2), new b93(16777217, C0201.m82(24846)));
        hashMap.put(a(C0201.m82(24847), 32, 16, 67, 20, 4), new b93(16777217, C0201.m82(24848)));
        hashMap.put(a(C0201.m82(24849), 32, 16, 67, 40, 2), new b93(16777217, C0201.m82(24850)));
        hashMap.put(a(C0201.m82(24851), 32, 16, 67, 40, 4), new b93(16777217, C0201.m82(24852)));
        hashMap.put(a(C0201.m82(24853), 32, 16, 67, 40, 8), new b93(16777217, C0201.m82(24854)));
        hashMap.put(a(C0201.m82(24855), 32, 16, 67, 60, 3), new b93(16777217, C0201.m82(24856)));
        hashMap.put(a(C0201.m82(24857), 32, 16, 67, 60, 6), new b93(16777217, C0201.m82(24858)));
        hashMap.put(a(C0201.m82(24859), 32, 16, 67, 60, 12), new b93(16777217, C0201.m82(24860)));
        hashMap.put(a(C0201.m82(24861), 64, 16, 131, 20, 2), new b93(16777217, C0201.m82(24862)));
        hashMap.put(a(C0201.m82(24863), 64, 16, 131, 20, 4), new b93(16777217, C0201.m82(24864)));
        hashMap.put(a(C0201.m82(24865), 64, 16, 131, 40, 2), new b93(16777217, C0201.m82(24866)));
        hashMap.put(a(C0201.m82(24867), 64, 16, 131, 40, 4), new b93(16777217, C0201.m82(24868)));
        hashMap.put(a(C0201.m82(24869), 64, 16, 131, 40, 8), new b93(16777217, C0201.m82(24870)));
        hashMap.put(a(C0201.m82(24871), 64, 16, 131, 60, 3), new b93(16777217, C0201.m82(24872)));
        hashMap.put(a(C0201.m82(24873), 64, 16, 131, 60, 6), new b93(16777217, C0201.m82(24874)));
        hashMap.put(a(C0201.m82(24875), 64, 16, 131, 60, 12), new b93(16777217, C0201.m82(24876)));
        b = Collections.unmodifiableMap(hashMap);
    }

    private b93(int i, String str) {
        this.a = str;
    }

    private static String a(String str, int i, int i2, int i3, int i4, int i5) {
        if (str != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            String r1 = C0201.m82(24877);
            sb.append(r1);
            sb.append(i);
            sb.append(r1);
            sb.append(i2);
            sb.append(r1);
            sb.append(i3);
            sb.append(r1);
            sb.append(i4);
            sb.append(r1);
            sb.append(i5);
            return sb.toString();
        }
        throw new NullPointerException(C0201.m82(24878));
    }

    public static b93 b(String str, int i, int i2, int i3, int i4, int i5) {
        if (str != null) {
            return b.get(a(str, i, i2, i3, i4, i5));
        }
        throw new NullPointerException(C0201.m82(24879));
    }

    public String toString() {
        return this.a;
    }
}
