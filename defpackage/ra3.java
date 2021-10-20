package defpackage;

import vigqyno.C0201;

/* renamed from: ra3  reason: default package */
/* compiled from: DigestUtil */
public class ra3 {
    public static m63 a(p03 p03) {
        if (p03.equals(a43.c)) {
            return new t63();
        }
        if (p03.equals(a43.e)) {
            return new v63();
        }
        if (p03.equals(a43.g)) {
            return new w63(128);
        }
        if (p03.equals(a43.h)) {
            return new w63(256);
        }
        throw new IllegalArgumentException(C0201.m82(36010) + p03);
    }
}
