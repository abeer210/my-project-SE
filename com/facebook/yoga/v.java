package com.facebook.yoga;

import vigqyno.C0201;

/* compiled from: YogaValue */
public class v {
    public final float a;
    public final u b;

    /* compiled from: YogaValue */
    static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            int[] iArr = new int[u.values().length];
            a = iArr;
            iArr[u.UNDEFINED.ordinal()] = 1;
            a[u.POINT.ordinal()] = 2;
            a[u.PERCENT.ordinal()] = 3;
            try {
                a[u.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    static {
        u uVar = u.UNDEFINED;
        u uVar2 = u.POINT;
        u uVar3 = u.AUTO;
    }

    public v(float f, u uVar) {
        this.a = f;
        this.b = uVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        u uVar = this.b;
        if (uVar != vVar.b) {
            return false;
        }
        if (uVar == u.UNDEFINED || uVar == u.AUTO || Float.compare(this.a, vVar.a) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.a) + this.b.d();
    }

    public String toString() {
        int i = a.a[this.b.ordinal()];
        if (i == 1) {
            return C0201.m82(35011);
        }
        if (i == 2) {
            return Float.toString(this.a);
        }
        if (i == 3) {
            return this.a + C0201.m82(35010);
        } else if (i == 4) {
            return C0201.m82(35009);
        } else {
            throw new IllegalStateException();
        }
    }

    public v(float f, int i) {
        this(f, u.b(i));
    }
}
