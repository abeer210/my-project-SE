package defpackage;

import java.util.HashMap;
import vigqyno.C0201;

/* renamed from: jj2  reason: default package */
/* compiled from: IdFactory.kt */
public final class jj2 {
    private static final HashMap<String, Integer> a = new HashMap<>();
    private static int b;
    public static final a c = new a(null);

    /* renamed from: jj2$a */
    /* compiled from: IdFactory.kt */
    public static final class a {
        private a() {
        }

        public final int a(String str) {
            ow2.c(str, C0201.m82(36875));
            if (jj2.a.containsKey(str)) {
                Object obj = jj2.a.get(str);
                if (obj != null) {
                    ow2.b(obj, C0201.m82(36876));
                    return ((Number) obj).intValue();
                }
                ow2.f();
                throw null;
            }
            jj2.b++;
            int i = jj2.b;
            jj2.a.put(str, Integer.valueOf(jj2.b));
            return i;
        }

        public /* synthetic */ a(lw2 lw2) {
            this();
        }
    }
}
