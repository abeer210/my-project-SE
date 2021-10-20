package defpackage;

import vigqyno.C0201;

/* renamed from: ca3  reason: default package */
/* compiled from: Utils */
public class ca3 {
    public static o43 a(String str) {
        if (str.equals(C0201.m82(26846))) {
            return new o43(c43.b, y13.a);
        }
        if (str.equals(C0201.m82(26847))) {
            return new o43(a43.f, y13.a);
        }
        if (str.equals(C0201.m82(26848))) {
            return new o43(a43.c, y13.a);
        }
        if (str.equals(C0201.m82(26849))) {
            return new o43(a43.d, y13.a);
        }
        if (str.equals(C0201.m82(26850))) {
            return new o43(a43.e, y13.a);
        }
        throw new IllegalArgumentException(C0201.m82(26851) + str);
    }

    public static m63 b(o43 o43) {
        if (o43.g().equals(c43.b)) {
            return a73.a();
        }
        if (o43.g().equals(a43.f)) {
            return a73.b();
        }
        if (o43.g().equals(a43.c)) {
            return a73.c();
        }
        if (o43.g().equals(a43.d)) {
            return a73.d();
        }
        if (o43.g().equals(a43.e)) {
            return a73.e();
        }
        throw new IllegalArgumentException(C0201.m82(26852) + o43.g());
    }
}
