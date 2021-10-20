package defpackage;

/* renamed from: yi1  reason: default package */
public enum yi1 implements ol1 {
    FORMAT_UNKNOWN(0),
    FORMAT_LUMINANCE(1),
    FORMAT_RGB8(2),
    FORMAT_MONOCHROME(3);
    
    private final int a;

    private yi1(int i) {
        this.a = i;
    }

    public static yi1 b(int i) {
        if (i == 0) {
            return FORMAT_UNKNOWN;
        }
        if (i == 1) {
            return FORMAT_LUMINANCE;
        }
        if (i == 2) {
            return FORMAT_RGB8;
        }
        if (i != 3) {
            return null;
        }
        return FORMAT_MONOCHROME;
    }

    @Override // defpackage.ol1
    public final int a() {
        return this.a;
    }
}
