package defpackage;

import vigqyno.C0201;

/* renamed from: nx2  reason: default package */
/* compiled from: StringsJVM.kt */
public class nx2 extends mx2 {
    public static final boolean a(String str, int i, String str2, int i2, int i3, boolean z) {
        ow2.c(str, C0201.m82(4822));
        ow2.c(str2, C0201.m82(4823));
        if (!z) {
            return str.regionMatches(i, str2, i2, i3);
        }
        return str.regionMatches(z, i, str2, i2, i3);
    }
}
