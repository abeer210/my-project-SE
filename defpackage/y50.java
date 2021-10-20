package defpackage;

import java.util.Arrays;
import vigqyno.C0201;

/* renamed from: y50  reason: default package */
/* compiled from: Objects */
public final class y50 {

    /* renamed from: y50$b */
    /* compiled from: Objects */
    public static final class b {
        private final String a;
        private a b;
        private a c;
        private boolean d;

        /* access modifiers changed from: private */
        /* renamed from: y50$b$a */
        /* compiled from: Objects */
        public static final class a {
            public String a;
            public Object b;
            public a c;

            private a() {
            }
        }

        private a d() {
            a aVar = new a();
            this.c.c = aVar;
            this.c = aVar;
            return aVar;
        }

        private b e(String str, Object obj) {
            a d2 = d();
            d2.b = obj;
            z50.g(str);
            d2.a = str;
            return this;
        }

        public b a(String str, int i) {
            e(str, String.valueOf(i));
            return this;
        }

        public b b(String str, Object obj) {
            e(str, obj);
            return this;
        }

        public b c(String str, boolean z) {
            e(str, String.valueOf(z));
            return this;
        }

        public String toString() {
            boolean z = this.d;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.a);
            sb.append('{');
            String r3 = C0201.m82(35132);
            for (a aVar = this.b.c; aVar != null; aVar = aVar.c) {
                if (!z || aVar.b != null) {
                    sb.append(r3);
                    String str = aVar.a;
                    if (str != null) {
                        sb.append(str);
                        sb.append('=');
                    }
                    sb.append(aVar.b);
                    r3 = C0201.m82(35133);
                }
            }
            sb.append('}');
            return sb.toString();
        }

        private b(String str) {
            a aVar = new a();
            this.b = aVar;
            this.c = aVar;
            this.d = false;
            z50.g(str);
            this.a = str;
        }
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    private static String c(Class<?> cls) {
        String replaceAll = cls.getName().replaceAll(C0201.m82(7900), C0201.m82(7901));
        int lastIndexOf = replaceAll.lastIndexOf(36);
        if (lastIndexOf == -1) {
            lastIndexOf = replaceAll.lastIndexOf(46);
        }
        return replaceAll.substring(lastIndexOf + 1);
    }

    public static b d(Object obj) {
        return new b(c(obj.getClass()));
    }
}
