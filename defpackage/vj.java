package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: vj  reason: default package */
/* compiled from: LazyHeaders */
public final class vj implements tj {
    private final Map<String, List<uj>> b;
    private volatile Map<String, String> c;

    /* renamed from: vj$a */
    /* compiled from: LazyHeaders */
    public static final class a {
        private static final String d = g();
        private static final Map<String, List<uj>> e;
        private boolean a = true;
        private Map<String, List<uj>> b = e;
        private boolean c = true;

        static {
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(d)) {
                hashMap.put(C0201.m82(29374), Collections.singletonList(new b(d)));
            }
            e = Collections.unmodifiableMap(hashMap);
        }

        private Map<String, List<uj>> d() {
            HashMap hashMap = new HashMap(this.b.size());
            for (Map.Entry<String, List<uj>> entry : this.b.entrySet()) {
                hashMap.put(entry.getKey(), new ArrayList(entry.getValue()));
            }
            return hashMap;
        }

        private void e() {
            if (this.a) {
                this.a = false;
                this.b = d();
            }
        }

        private List<uj> f(String str) {
            List<uj> list = this.b.get(str);
            if (list != null) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            this.b.put(str, arrayList);
            return arrayList;
        }

        public static String g() {
            String property = System.getProperty(C0201.m82(29375));
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char charAt = property.charAt(i);
                if ((charAt > 31 || charAt == '\t') && charAt < 127) {
                    sb.append(charAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }

        public a a(String str, uj ujVar) {
            if (!this.c || !C0201.m82(29376).equalsIgnoreCase(str)) {
                e();
                f(str).add(ujVar);
                return this;
            }
            h(str, ujVar);
            return this;
        }

        public a b(String str, String str2) {
            a(str, new b(str2));
            return this;
        }

        public vj c() {
            this.a = true;
            return new vj(this.b);
        }

        public a h(String str, uj ujVar) {
            e();
            if (ujVar == null) {
                this.b.remove(str);
            } else {
                List<uj> f = f(str);
                f.clear();
                f.add(ujVar);
            }
            if (this.c && C0201.m82(29377).equalsIgnoreCase(str)) {
                this.c = false;
            }
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: vj$b */
    /* compiled from: LazyHeaders */
    public static final class b implements uj {
        private final String a;

        public b(String str) {
            this.a = str;
        }

        @Override // defpackage.uj
        public String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.a.equals(((b) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return C0201.m82(29409) + this.a + '\'' + '}';
        }
    }

    public vj(Map<String, List<uj>> map) {
        this.b = Collections.unmodifiableMap(map);
    }

    private String b(List<uj> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String a2 = list.get(i).a();
            if (!TextUtils.isEmpty(a2)) {
                sb.append(a2);
                if (i != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    private Map<String, String> c() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<uj>> entry : this.b.entrySet()) {
            String b2 = b(entry.getValue());
            if (!TextUtils.isEmpty(b2)) {
                hashMap.put(entry.getKey(), b2);
            }
        }
        return hashMap;
    }

    @Override // defpackage.tj
    public Map<String, String> a() {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    this.c = Collections.unmodifiableMap(c());
                }
            }
        }
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof vj) {
            return this.b.equals(((vj) obj).b);
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        return C0201.m82(12759) + this.b + '}';
    }
}
