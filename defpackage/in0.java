package defpackage;

import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: in0  reason: default package */
/* compiled from: UmmalquraCalendar */
public class in0 extends GregorianCalendar {
    public int[] a;

    public in0() {
        this(TimeZone.getDefault(), Locale.getDefault());
    }

    private Map<String, Integer> b(int i, int i2, Locale locale) {
        String[] d = d(i, i2, new jn0(locale));
        if (d == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i3 = 0; i3 < d.length; i3++) {
            if (d[i3].length() != 0) {
                hashMap.put(d[i3], Integer.valueOf(i3));
            }
        }
        return hashMap;
    }

    private String[] d(int i, int i2, jn0 jn0) {
        if (i != 2) {
            return null;
        }
        if (1 == i2) {
            return jn0.b();
        }
        if (2 == i2) {
            return jn0.a();
        }
        return null;
    }

    public static int e(int i, int i2) {
        return kn0.e(i, i2);
    }

    public void computeFields() {
        super.computeFields();
        if (this.a == null) {
            this.a = new int[((GregorianCalendar) this).fields.length];
        }
        int[] k = kn0.k(((GregorianCalendar) this).time);
        int[] iArr = this.a;
        iArr[1] = k[0];
        iArr[2] = k[1];
        iArr[5] = k[2];
    }

    public boolean equals(Object obj) {
        return (obj instanceof in0) && super.equals(obj);
    }

    public int get(int i) {
        if (i == 1 || i == 2 || i == 5) {
            return this.a[i];
        }
        return super.get(i);
    }

    public String getDisplayName(int i, int i2, Locale locale) {
        int i3;
        if (i != 2) {
            return super.getDisplayName(i, i2, locale);
        }
        String[] d = d(i, i2, new jn0(locale));
        if (d == null || (i3 = get(i)) >= d.length) {
            return null;
        }
        return d[i3];
    }

    @Override // java.util.Calendar
    public Map<String, Integer> getDisplayNames(int i, int i2, Locale locale) {
        if (i != 2) {
            return super.getDisplayNames(i, i2, locale);
        }
        if (i2 != 0) {
            return b(i, i2, locale);
        }
        Map<String, Integer> b = b(i, 1, locale);
        Map<String, Integer> b2 = b(i, 2, locale);
        if (b == null) {
            return b2;
        }
        if (b2 != null) {
            b.putAll(b2);
        }
        return b;
    }

    public int hashCode() {
        return super.hashCode() ^ 622;
    }

    public void set(int i, int i2) {
        if (i == 1 || i == 2 || i == 5) {
            int[] l = kn0.l(getTime());
            if (i == 1) {
                l[0] = i2;
            } else if (i == 2) {
                l[1] = i2;
            } else {
                l[2] = i2;
            }
            int[] j = kn0.j(l[0], l[1], l[2]);
            super.set(1, j[0]);
            super.set(2, j[1]);
            super.set(5, j[2]);
            complete();
            return;
        }
        super.set(i, i2);
    }

    public in0(TimeZone timeZone, Locale locale) {
        super(timeZone, locale);
    }
}
