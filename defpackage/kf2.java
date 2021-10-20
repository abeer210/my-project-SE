package defpackage;

/* renamed from: kf2  reason: default package */
/* compiled from: TabsAttachMode */
public enum kf2 {
    TOGETHER,
    AFTER_INITIAL_TAB,
    ON_SWITCH_TO_TAB,
    UNDEFINED;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0044  */
    public static kf2 b(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode != -1696815897) {
            if (hashCode != -1218133446) {
                if (hashCode == 529250477 && str.equals("afterInitialTab")) {
                    c = 1;
                    if (c != 0) {
                        return TOGETHER;
                    }
                    if (c == 1) {
                        return AFTER_INITIAL_TAB;
                    }
                    if (c != 2) {
                        return UNDEFINED;
                    }
                    return ON_SWITCH_TO_TAB;
                }
            } else if (str.equals("together")) {
                c = 0;
                if (c != 0) {
                }
            }
        } else if (str.equals("onSwitchToTab")) {
            c = 2;
            if (c != 0) {
            }
        }
        c = 65535;
        if (c != 0) {
        }
    }

    public boolean d() {
        return this != UNDEFINED;
    }
}
