package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: r10  reason: default package */
/* compiled from: HttpResponse */
public class r10 {
    public final int a;
    public final String b;
    public final String c;
    public final Map<String, List<String>> d;

    public r10(int i, String str, String str2, Map<String, List<String>> map) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = map;
    }

    public boolean a() {
        int i = this.a;
        return i >= 200 && i <= 299;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r10.class != obj.getClass()) {
            return false;
        }
        r10 r10 = (r10) obj;
        if (this.a != r10.a) {
            return false;
        }
        String str = this.b;
        if (str == null ? r10.b != null : !str.equals(r10.b)) {
            return false;
        }
        String str2 = this.c;
        String str3 = r10.c;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 == null) {
            return true;
        }
        return false;
    }
}
