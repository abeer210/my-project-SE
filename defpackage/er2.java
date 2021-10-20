package defpackage;

import vigqyno.C0201;

/* renamed from: er2  reason: default package */
/* compiled from: COSObjectKey */
public class er2 implements Comparable<er2> {
    private final long a;
    private final int b;

    public er2(dr2 dr2) {
        this(dr2.A(), dr2.r());
    }

    /* renamed from: b */
    public int compareTo(er2 er2) {
        if (e() < er2.e()) {
            return -1;
        }
        if (e() > er2.e()) {
            return 1;
        }
        if (d() < er2.d()) {
            return -1;
        }
        if (d() > er2.d()) {
            return 1;
        }
        return 0;
    }

    public int d() {
        return this.b;
    }

    public long e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        er2 er2 = obj instanceof er2 ? (er2) obj : null;
        return er2 != null && er2.e() == e() && er2.d() == d();
    }

    public int hashCode() {
        return Long.valueOf(this.a + ((long) this.b)).hashCode();
    }

    public String toString() {
        return Long.toString(this.a) + C0201.m82(11022) + Integer.toString(this.b) + C0201.m82(11023);
    }

    public er2(long j, int i) {
        this.a = j;
        this.b = i;
    }
}
