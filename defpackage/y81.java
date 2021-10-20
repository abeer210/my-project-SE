package defpackage;

import defpackage.l91;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: y81  reason: default package */
public class y81 {
    private static volatile y81 b;
    private static volatile y81 c;
    public static final y81 d = new y81(true);
    private final Map<a, l91.e<?, ?>> a;

    /* renamed from: y81$a */
    static final class a {
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

    public y81() {
        this.a = new HashMap();
    }

    public static y81 b() {
        return k91.a(y81.class);
    }

    private static Class<?> c() {
        try {
            return Class.forName(C0201.m82(15057));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static y81 d() {
        y81 y81 = b;
        if (y81 == null) {
            synchronized (y81.class) {
                y81 = b;
                if (y81 == null) {
                    y81 = w81.c();
                    b = y81;
                }
            }
        }
        return y81;
    }

    public static y81 e() {
        y81 y81 = c;
        if (y81 == null) {
            synchronized (y81.class) {
                y81 = c;
                if (y81 == null) {
                    y81 = w81.d();
                    c = y81;
                }
            }
        }
        return y81;
    }

    public final <ContainingType extends wa1> l91.e<ContainingType, ?> a(ContainingType containingtype, int i) {
        return (l91.e<ContainingType, ?>) this.a.get(new a(containingtype, i));
    }

    private y81(boolean z) {
        this.a = Collections.emptyMap();
    }
}
