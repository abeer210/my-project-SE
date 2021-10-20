package defpackage;

/* renamed from: f60  reason: default package */
/* compiled from: FLog */
public class f60 {
    private static h60 a = g60.l();

    public static void A(String str, String str2) {
        if (a.j(5)) {
            a.b(str, str2);
        }
    }

    public static void B(String str, String str2, Throwable th) {
        if (a.j(5)) {
            a.c(str, str2, th);
        }
    }

    public static void C(String str, String str2, Object... objArr) {
        if (a.j(5)) {
            a.b(str, l(str2, objArr));
        }
    }

    public static void D(String str, Throwable th, String str2, Object... objArr) {
        if (a.j(5)) {
            a.c(str, l(str2, objArr), th);
        }
    }

    public static void E(Class<?> cls, String str, Throwable th) {
        if (a.j(6)) {
            a.a(m(cls), str, th);
        }
    }

    public static void F(String str, String str2) {
        if (a.j(6)) {
            a.f(str, str2);
        }
    }

    public static void G(String str, String str2, Throwable th) {
        if (a.j(6)) {
            a.a(str, str2, th);
        }
    }

    public static void H(String str, String str2, Object... objArr) {
        if (a.j(6)) {
            a.f(str, l(str2, objArr));
        }
    }

    public static void a(Class<?> cls, String str, Object obj) {
        if (a.j(3)) {
            a.h(m(cls), l(str, obj));
        }
    }

    public static void b(String str, String str2) {
        if (a.j(3)) {
            a.h(str, str2);
        }
    }

    public static void c(String str, String str2, Object obj) {
        if (a.j(3)) {
            a.h(str, l(str2, obj));
        }
    }

    public static void d(String str, String str2, Throwable th) {
        if (a.j(3)) {
            a.i(str, str2, th);
        }
    }

    public static void e(Class<?> cls, String str) {
        if (a.j(6)) {
            a.d(m(cls), str);
        }
    }

    public static void f(Class<?> cls, String str, Throwable th) {
        if (a.j(6)) {
            a.g(m(cls), str, th);
        }
    }

    public static void g(Class<?> cls, String str, Object... objArr) {
        if (a.j(6)) {
            a.d(m(cls), l(str, objArr));
        }
    }

    public static void h(Class<?> cls, Throwable th, String str, Object... objArr) {
        if (a.j(6)) {
            a.g(m(cls), l(str, objArr), th);
        }
    }

    public static void i(String str, String str2) {
        if (a.j(6)) {
            a.d(str, str2);
        }
    }

    public static void j(String str, String str2, Throwable th) {
        if (a.j(6)) {
            a.g(str, str2, th);
        }
    }

    public static void k(String str, String str2, Object... objArr) {
        if (a.j(6)) {
            a.d(str, l(str2, objArr));
        }
    }

    private static String l(String str, Object... objArr) {
        return String.format(null, str, objArr);
    }

    private static String m(Class<?> cls) {
        return cls.getSimpleName();
    }

    public static void n(String str, String str2) {
        if (a.j(4)) {
            a.k(str, str2);
        }
    }

    public static boolean o(int i) {
        return a.j(i);
    }

    public static void p(Class<?> cls, String str) {
        if (a.j(2)) {
            a.e(m(cls), str);
        }
    }

    public static void q(Class<?> cls, String str, Object obj) {
        if (a.j(2)) {
            a.e(m(cls), l(str, obj));
        }
    }

    public static void r(Class<?> cls, String str, Object obj, Object obj2) {
        if (a.j(2)) {
            a.e(m(cls), l(str, obj, obj2));
        }
    }

    public static void s(Class<?> cls, String str, Object obj, Object obj2, Object obj3) {
        if (o(2)) {
            p(cls, l(str, obj, obj2, obj3));
        }
    }

    public static void t(Class<?> cls, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (a.j(2)) {
            a.e(m(cls), l(str, obj, obj2, obj3, obj4));
        }
    }

    public static void u(Class<?> cls, String str, Object... objArr) {
        if (a.j(2)) {
            a.e(m(cls), l(str, objArr));
        }
    }

    public static void v(String str, String str2, Object... objArr) {
        if (a.j(2)) {
            a.e(str, l(str2, objArr));
        }
    }

    public static void w(Class<?> cls, String str) {
        if (a.j(5)) {
            a.b(m(cls), str);
        }
    }

    public static void x(Class<?> cls, String str, Throwable th) {
        if (a.j(5)) {
            a.c(m(cls), str, th);
        }
    }

    public static void y(Class<?> cls, String str, Object... objArr) {
        if (a.j(5)) {
            a.b(m(cls), l(str, objArr));
        }
    }

    public static void z(Class<?> cls, Throwable th, String str, Object... objArr) {
        if (o(5)) {
            x(cls, l(str, objArr), th);
        }
    }
}
