package defpackage;

/* renamed from: ye2  reason: default package */
/* compiled from: ModalPresentationStyle */
public enum ye2 {
    Unspecified("unspecified"),
    None("none"),
    OverCurrentContext("overCurrentContext");

    private ye2(String str) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002f  */
    public static ye2 b(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode != 3387192) {
            if (hashCode == 168405994 && str.equals("overCurrentContext")) {
                c = 1;
                if (c == 0) {
                    return None;
                }
                if (c != 1) {
                    return Unspecified;
                }
                return OverCurrentContext;
            }
        } else if (str.equals("none")) {
            c = 0;
            if (c == 0) {
            }
        }
        c = 65535;
        if (c == 0) {
        }
    }
}
