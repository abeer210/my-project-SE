package defpackage;

/* renamed from: hq  reason: default package */
/* compiled from: PngColorType */
public enum hq {
    Greyscale(0, "Greyscale", 1, 2, 4, 8, 16),
    TrueColor(2, "True Color", 8, 16),
    IndexedColor(3, "Indexed Color", 1, 2, 4, 8),
    GreyscaleWithAlpha(4, "Greyscale with Alpha", 8, 16),
    TrueColorWithAlpha(6, "True Color with Alpha", 8, 16);
    
    private final int a;
    private final String b;

    private hq(int i, String str, int... iArr) {
        this.a = i;
        this.b = str;
    }

    public static hq b(int i) {
        hq[] hqVarArr = (hq[]) hq.class.getEnumConstants();
        for (hq hqVar : hqVarArr) {
            if (hqVar.e() == i) {
                return hqVar;
            }
        }
        return null;
    }

    public String d() {
        return this.b;
    }

    public int e() {
        return this.a;
    }
}
