package com.huawei.hms.common.util;

import android.annotation.SuppressLint;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.Locale;
import org.json.JSONException;
import vigqyno.C0201;

public class Logger {
    private static final boolean a = false;
    private static final String b = null;
    private static final String c = null;
    private static final int d = 0;
    private static final int e = 0;
    private static final String f = null;

    /* access modifiers changed from: package-private */
    public static class a extends Throwable {
        private static final long b = 0;
        public String a;
        private Throwable c;
        private Throwable d;

        static {
            C0201.m83(a.class, 490);
        }

        private a(Throwable th) {
            this.d = th;
        }

        public /* synthetic */ a(Throwable th, byte b2) {
            this(th);
        }

        private void a(String str) {
            this.a = str;
        }

        private void a(Throwable th) {
            this.c = th;
        }

        public final Throwable getCause() {
            Throwable th = this.c;
            if (th == this) {
                return null;
            }
            return th;
        }

        public final String getMessage() {
            return this.a;
        }

        public final String toString() {
            Throwable th = this.d;
            if (th == null) {
                return C0201.m82(27926);
            }
            String name = th.getClass().getName();
            if (this.a == null) {
                return name;
            }
            String str = name + C0201.m82(27927);
            if (this.a.startsWith(str)) {
                return this.a;
            }
            return str + this.a;
        }
    }

    static {
        C0201.m83(Logger.class, 234);
    }

    private static int a(int i, String str, String str2) {
        return Log.println(i, a(str), a(str2, 7));
    }

    private static String a(int i) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length <= i) {
            return C0201.m82(33773);
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        StringBuilder sb = new StringBuilder();
        sb.append(Process.myPid());
        sb.append(C0201.m82(33771));
        sb.append(Process.myTid());
        String r1 = C0201.m82(33772);
        sb.append(r1);
        sb.append(stackTraceElement.getFileName());
        sb.append(r1);
        sb.append(stackTraceElement.getClassName());
        sb.append(r1);
        sb.append(stackTraceElement.getMethodName());
        sb.append(r1);
        sb.append(stackTraceElement.getLineNumber());
        return sb.toString();
    }

    private static String a(String str) {
        return C0201.m82(33774).concat(String.valueOf(str));
    }

    private static String a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return a(i);
        }
        return a(i) + C0201.m82(33775) + str;
    }

    private static Throwable a(Throwable th) {
        if (isLoggable(3)) {
            return th;
        }
        if (th == null) {
            return null;
        }
        int i = 20;
        if ((th instanceof IOException) || (th instanceof JSONException)) {
            i = 8;
        }
        a aVar = new a(th, (byte) 0);
        StackTraceElement[] stackTrace = aVar.getStackTrace();
        if (stackTrace.length > i) {
            aVar.setStackTrace((StackTraceElement[]) Arrays.copyOf(stackTrace, i));
        } else {
            aVar.setStackTrace(stackTrace);
        }
        aVar.a = anonymizeMessage(th.getMessage());
        Throwable cause = th.getCause();
        a aVar2 = aVar;
        while (cause != null) {
            a aVar3 = new a(cause, (byte) 0);
            aVar3.a = anonymizeMessage(cause.getMessage());
            aVar2.c = aVar3;
            cause = cause.getCause();
            aVar2 = aVar3;
        }
        return aVar;
    }

    public static String anonymizeMessage(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (i % 2 == 1) {
                charArray[i] = '*';
            }
        }
        return new String(charArray);
    }

    @SuppressLint({"LogTagMismatch"})
    public static void d(String str, Object obj) {
        println(3, str, obj);
    }

    @SuppressLint({"LogTagMismatch"})
    public static void d(String str, String str2, Object... objArr) {
        println(3, str, str2, objArr);
    }

    public static void e(String str, Object obj) {
        println(6, str, obj);
    }

    public static void e(String str, String str2, Throwable th) {
        Log.e(a(str), a(str2, 5), a(th));
    }

    public static void e(String str, String str2, Object... objArr) {
        println(6, str, str2, objArr);
    }

    public static String format(String str, Object... objArr) {
        return str == null ? C0201.m82(33776) : String.format(Locale.ROOT, str, objArr);
    }

    @SuppressLint({"LogTagMismatch"})
    public static void i(String str, Object obj) {
        println(4, str, obj);
    }

    @SuppressLint({"LogTagMismatch"})
    public static void i(String str, String str2, Object... objArr) {
        println(4, str, str2, objArr);
    }

    public static boolean isLoggable(int i) {
        return Log.isLoggable(C0201.m82(33777), i);
    }

    public static void println(int i, String str, Object obj) {
        if (i >= 3 && isLoggable(i)) {
            a(i, str, obj == null ? C0201.m82(33778) : obj.toString());
        }
    }

    public static void println(int i, String str, String str2, Object... objArr) {
        if (i >= 3) {
            String r0 = C0201.m82(33779);
            if (str2 == null) {
                Log.w(r0, C0201.m82(33780));
                return;
            }
            try {
                if (isLoggable(i)) {
                    a(i, str, format(str2, objArr));
                }
            } catch (IllegalFormatException e2) {
                w(r0, C0201.m82(33781).concat(String.valueOf(str2)), e2);
            }
        }
    }

    public static void v(String str, Object obj) {
        println(2, str, obj);
    }

    public static void v(String str, String str2, Object... objArr) {
        println(2, str, str2, objArr);
    }

    public static void w(String str, Object obj) {
        println(5, str, obj);
    }

    public static void w(String str, String str2, Throwable th) {
        Log.w(a(str), a(str2, 5), a(th));
    }

    public static void w(String str, String str2, Object... objArr) {
        println(5, str, str2, objArr);
    }
}
