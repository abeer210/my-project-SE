package defpackage;

/* renamed from: ge2  reason: default package */
/* compiled from: Alignment */
public enum ge2 {
    Center,
    Fill,
    Default;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002f  */
    public static ge2 b(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode != -1364013995) {
            if (hashCode == 3143043 && str.equals("fill")) {
                c = 1;
                if (c == 0) {
                    return Center;
                }
                if (c != 1) {
                    return Default;
                }
                return Fill;
            }
        } else if (str.equals("center")) {
            c = 0;
            if (c == 0) {
            }
        }
        c = 65535;
        if (c == 0) {
        }
    }
}
