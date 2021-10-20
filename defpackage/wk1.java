package defpackage;

import defpackage.kl1;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: wk1  reason: default package */
public class wk1 {
    private static volatile wk1 b;
    public static final wk1 c = new wk1(true);
    private final Map<a, kl1.e<?, ?>> a;

    /* access modifiers changed from: package-private */
    /* renamed from: wk1$a */
    public static final class a {
        private final Object a;
        private final int b;

        public a(Object obj, int i) {
            this.a = obj;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a == aVar.a && this.b == aVar.b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.a) * 65535) + this.b;
        }
    }

    static {
        c();
    }

    public wk1() {
        this.a = new HashMap();
    }

    public static wk1 b() {
        return il1.a(wk1.class);
    }

    private static Class<?> c() {
        try {
            return Class.forName(C0201.m82(28971));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static wk1 d() {
        return vk1.b();
    }

    public static wk1 e() {
        wk1 wk1 = b;
        if (wk1 == null) {
            synchronized (wk1.class) {
                wk1 = b;
                if (wk1 == null) {
                    wk1 = vk1.c();
                    b = wk1;
                }
            }
        }
        return wk1;
    }

    public final <ContainingType extends tm1> kl1.e<ContainingType, ?> a(ContainingType containingtype, int i) {
        return (kl1.e<ContainingType, ?>) this.a.get(new a(containingtype, i));
    }

    private wk1(boolean z) {
        this.a = Collections.emptyMap();
    }
}
