package defpackage;

import android.text.TextUtils;
import java.util.Locale;

/* renamed from: te2  reason: default package */
/* compiled from: LayoutDirection */
public enum te2 {
    RTL(1),
    LTR(0),
    LOCALE(3),
    DEFAULT(0);
    
    private final int a;

    private te2(int i) {
        this.a = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0044  */
    public static te2 b(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode != -1097462182) {
            if (hashCode != 107498) {
                if (hashCode == 113258 && str.equals("rtl")) {
                    c = 0;
                    if (c != 0) {
                        return RTL;
                    }
                    if (c == 1) {
                        return LTR;
                    }
                    if (c != 2) {
                        return DEFAULT;
                    }
                    return LOCALE;
                }
            } else if (str.equals("ltr")) {
                c = 1;
                if (c != 0) {
                }
            }
        } else if (str.equals("locale")) {
            c = 2;
            if (c != 0) {
            }
        }
        c = 65535;
        if (c != 0) {
        }
    }

    public int d() {
        return this.a;
    }

    public boolean e() {
        return this != DEFAULT;
    }

    public boolean f() {
        int i = this.a;
        if (i == 1) {
            return true;
        }
        if (i == 3 && TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            return true;
        }
        return false;
    }
}
