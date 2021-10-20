package defpackage;

import java.util.regex.Pattern;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: nd0  reason: default package */
/* compiled from: BytesRange */
public class nd0 {
    private static Pattern c;
    public final int a;
    public final int b;

    public nd0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static nd0 b(int i) {
        z50.b(i >= 0);
        return new nd0(i, C0188.f24);
    }

    public static nd0 c(String str) throws IllegalArgumentException {
        if (str == null) {
            return null;
        }
        if (c == null) {
            c = Pattern.compile(C0201.m82(36843));
        }
        try {
            String[] split = c.split(str);
            z50.b(split.length == 4);
            z50.b(split[0].equals(C0201.m82(36844)));
            int parseInt = Integer.parseInt(split[1]);
            int parseInt2 = Integer.parseInt(split[2]);
            int parseInt3 = Integer.parseInt(split[3]);
            z50.b(parseInt2 > parseInt);
            z50.b(parseInt3 > parseInt2);
            if (parseInt2 < parseInt3 - 1) {
                return new nd0(parseInt, parseInt2);
            }
            return new nd0(parseInt, C0188.f24);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(String.format(null, C0201.m82(36845), str), e);
        }
    }

    public static nd0 e(int i) {
        z50.b(i > 0);
        return new nd0(0, i);
    }

    private static String f(int i) {
        return i == Integer.MAX_VALUE ? C0201.m82(36846) : Integer.toString(i);
    }

    public boolean a(nd0 nd0) {
        return nd0 != null && this.a <= nd0.a && this.b >= nd0.b;
    }

    public String d() {
        return String.format(null, C0201.m82(36847), f(this.a), f(this.b));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nd0)) {
            return false;
        }
        nd0 nd0 = (nd0) obj;
        if (this.a == nd0.a && this.b == nd0.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return d70.a(this.a, this.b);
    }

    public String toString() {
        return String.format(null, C0201.m82(36848), f(this.a), f(this.b));
    }
}
