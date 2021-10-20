package defpackage;

import vigqyno.C0201;

/* renamed from: qj1  reason: default package */
public final class qj1 {
    public static int a(int i) {
        if (i > 0 && i <= 14) {
            return i;
        }
        StringBuilder sb = new StringBuilder(45);
        sb.append(i);
        sb.append(C0201.m82(25217));
        throw new IllegalArgumentException(sb.toString());
    }
}
