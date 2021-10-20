package defpackage;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import vigqyno.C0201;

/* renamed from: g60  reason: default package */
/* compiled from: FLogDefaultLoggingDelegate */
public class g60 implements h60 {
    public static final g60 c = new g60();
    private String a = C0201.m82(15621);
    private int b = 5;

    private g60() {
    }

    public static g60 l() {
        return c;
    }

    private static String m(String str, Throwable th) {
        return str + '\n' + n(th);
    }

    private static String n(Throwable th) {
        if (th == null) {
            return C0201.m82(15622);
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    private String o(String str) {
        if (this.a == null) {
            return str;
        }
        return this.a + C0201.m82(15623) + str;
    }

    private void p(int i, String str, String str2) {
        Log.println(i, o(str), str2);
    }

    private void q(int i, String str, String str2, Throwable th) {
        Log.println(i, o(str), m(str2, th));
    }

    @Override // defpackage.h60
    public void a(String str, String str2, Throwable th) {
        q(6, str, str2, th);
    }

    @Override // defpackage.h60
    public void b(String str, String str2) {
        p(5, str, str2);
    }

    @Override // defpackage.h60
    public void c(String str, String str2, Throwable th) {
        q(5, str, str2, th);
    }

    @Override // defpackage.h60
    public void d(String str, String str2) {
        p(6, str, str2);
    }

    @Override // defpackage.h60
    public void e(String str, String str2) {
        p(2, str, str2);
    }

    @Override // defpackage.h60
    public void f(String str, String str2) {
        p(6, str, str2);
    }

    @Override // defpackage.h60
    public void g(String str, String str2, Throwable th) {
        q(6, str, str2, th);
    }

    @Override // defpackage.h60
    public void h(String str, String str2) {
        p(3, str, str2);
    }

    @Override // defpackage.h60
    public void i(String str, String str2, Throwable th) {
        q(3, str, str2, th);
    }

    @Override // defpackage.h60
    public boolean j(int i) {
        return this.b <= i;
    }

    @Override // defpackage.h60
    public void k(String str, String str2) {
        p(4, str, str2);
    }
}
