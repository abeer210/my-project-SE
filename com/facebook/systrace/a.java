package com.facebook.systrace;

import android.os.Build;
import android.os.Trace;

/* compiled from: Systrace */
public class a {

    /* renamed from: com.facebook.systrace.a$a  reason: collision with other inner class name */
    /* compiled from: Systrace */
    public enum EnumC0052a {
        THREAD('t'),
        PROCESS('p'),
        GLOBAL('g');

        private EnumC0052a(char c) {
        }
    }

    public static void a(long j, String str, int i) {
    }

    public static void b(long j, String str, int i, long j2) {
    }

    public static void c(long j, String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void d(long j, String str, int i) {
    }

    public static void e(long j, String str, int i) {
    }

    public static void f(long j, String str, int i, long j2) {
    }

    public static void g(long j) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }

    public static boolean h(long j) {
        return false;
    }

    public static void i(TraceListener traceListener) {
    }

    public static void j(long j, String str, int i) {
    }

    public static void k(long j, String str, int i) {
    }

    public static void l(long j, String str, EnumC0052a aVar) {
    }

    public static void m(TraceListener traceListener) {
    }
}
