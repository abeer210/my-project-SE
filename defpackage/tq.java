package defpackage;

import vigqyno.C0201;

/* renamed from: tq  reason: default package */
/* compiled from: TiffDataFormat */
public class tq {
    public static final tq c = new tq(C0201.m82(8483), 1, 1);
    public static final tq d = new tq(C0201.m82(8484), 2, 1);
    public static final tq e = new tq(C0201.m82(8485), 3, 2);
    public static final tq f = new tq(C0201.m82(8486), 4, 4);
    public static final tq g = new tq(C0201.m82(8487), 5, 8);
    public static final tq h = new tq(C0201.m82(8488), 6, 1);
    public static final tq i = new tq(C0201.m82(8489), 7, 1);
    public static final tq j = new tq(C0201.m82(8490), 8, 2);
    public static final tq k = new tq(C0201.m82(8491), 9, 4);
    public static final tq l = new tq(C0201.m82(8492), 10, 8);
    public static final tq m = new tq(C0201.m82(8493), 11, 4);
    public static final tq n = new tq(C0201.m82(8494), 12, 8);
    private final String a;
    private final int b;

    private tq(String str, int i2, int i3) {
        this.a = str;
        this.b = i3;
    }

    public static tq a(int i2) {
        switch (i2) {
            case 1:
                return c;
            case 2:
                return d;
            case 3:
                return e;
            case 4:
                return f;
            case 5:
                return g;
            case 6:
                return h;
            case 7:
                return i;
            case 8:
                return j;
            case 9:
                return k;
            case 10:
                return l;
            case 11:
                return m;
            case 12:
                return n;
            default:
                return null;
        }
    }

    public int b() {
        return this.b;
    }

    public String toString() {
        return this.a;
    }
}
