package defpackage;

import vigqyno.C0201;

/* renamed from: jd  reason: default package */
/* compiled from: MergePaths */
public class jd implements dd {
    private final String a;
    private final a b;
    private final boolean c;

    /* renamed from: jd$a */
    /* compiled from: MergePaths */
    public enum a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static a b(int i) {
            a aVar = MERGE;
            if (i == 1) {
                return aVar;
            }
            if (i == 2) {
                return ADD;
            }
            if (i == 3) {
                return SUBTRACT;
            }
            if (i == 4) {
                return INTERSECT;
            }
            if (i != 5) {
                return aVar;
            }
            return EXCLUDE_INTERSECTIONS;
        }
    }

    public jd(String str, a aVar, boolean z) {
        this.a = str;
        this.b = aVar;
        this.c = z;
    }

    @Override // defpackage.dd
    public wa a(ga gaVar, td tdVar) {
        if (gaVar.l()) {
            return new fb(this);
        }
        wf.c(C0201.m82(24272));
        return null;
    }

    public a b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public boolean d() {
        return this.c;
    }

    public String toString() {
        return C0201.m82(24273) + this.b + '}';
    }
}
