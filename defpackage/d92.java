package defpackage;

import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

/* renamed from: d92  reason: default package */
/* compiled from: ExpandedRow */
public final class d92 {
    private final List<c92> a;
    private final int b;
    private final boolean c;

    public d92(List<c92> list, int i, boolean z) {
        this.a = new ArrayList(list);
        this.b = i;
        this.c = z;
    }

    public List<c92> a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public boolean c(List<c92> list) {
        return this.a.equals(list);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d92)) {
            return false;
        }
        d92 d92 = (d92) obj;
        if (!this.a.equals(d92.a()) || this.c != d92.c) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.a.hashCode() ^ Boolean.valueOf(this.c).hashCode();
    }

    public String toString() {
        return C0201.m82(9987) + this.a + C0201.m82(9988);
    }
}
