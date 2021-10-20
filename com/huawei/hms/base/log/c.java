package com.huawei.hms.base.log;

import android.os.Process;
import android.util.Log;
import java.text.SimpleDateFormat;
import java.util.Locale;
import vigqyno.C0201;

/* compiled from: LogRecord */
public class c {
    private final StringBuilder a = new StringBuilder();
    private String b = null;
    private String c = C0201.m82(33342);
    private int d = 0;
    private long e = 0;
    private long f = 0;
    private String g;
    private int h;
    private int i;
    private int j = 0;

    public c(int i2, String str, int i3, String str2) {
        this.j = i2;
        this.b = str;
        this.d = i3;
        if (str2 != null) {
            this.c = str2;
        }
        c();
    }

    public static String a(int i2) {
        if (i2 == 3) {
            return C0201.m82(33346);
        }
        if (i2 == 4) {
            return C0201.m82(33345);
        }
        if (i2 != 5) {
            return i2 != 6 ? String.valueOf(i2) : C0201.m82(33343);
        }
        return C0201.m82(33344);
    }

    private c c() {
        this.e = System.currentTimeMillis();
        Thread currentThread = Thread.currentThread();
        this.f = currentThread.getId();
        this.h = Process.myPid();
        StackTraceElement[] stackTrace = currentThread.getStackTrace();
        int length = stackTrace.length;
        int i2 = this.j;
        if (length > i2) {
            StackTraceElement stackTraceElement = stackTrace[i2];
            this.g = stackTraceElement.getFileName();
            this.i = stackTraceElement.getLineNumber();
        }
        return this;
    }

    public String b() {
        StringBuilder sb = new StringBuilder();
        b(sb);
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        a(sb);
        b(sb);
        return sb.toString();
    }

    public <T> c a(T t) {
        this.a.append((Object) t);
        return this;
    }

    public c a(Throwable th) {
        a((Object) '\n').a(Log.getStackTraceString(th));
        return this;
    }

    private StringBuilder b(StringBuilder sb) {
        sb.append(' ');
        sb.append(this.a.toString());
        return sb;
    }

    public String a() {
        StringBuilder sb = new StringBuilder();
        a(sb);
        return sb.toString();
    }

    private StringBuilder a(StringBuilder sb) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(C0201.m82(33347), Locale.getDefault());
        sb.append('[');
        sb.append(simpleDateFormat.format(Long.valueOf(this.e)));
        String a2 = a(this.d);
        sb.append(' ');
        sb.append(a2);
        sb.append('/');
        sb.append(this.c);
        sb.append('/');
        sb.append(this.b);
        sb.append(' ');
        sb.append(this.h);
        sb.append(':');
        sb.append(this.f);
        sb.append(' ');
        sb.append(this.g);
        sb.append(':');
        sb.append(this.i);
        sb.append(']');
        return sb;
    }
}
