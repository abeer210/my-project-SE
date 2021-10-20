package com.huawei.hms.framework.common;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.Arrays;
import java.util.IllegalFormatException;
import org.json.JSONException;
import vigqyno.C0201;

public class Logger {
    private static final boolean DEBUG = false;
    private static final int MAX_STACK_DEEP_LENGTH = 0;
    private static final int MAX_STACK_DEEP_LENGTH_NORMAL = 0;
    private static final String SPLIT = null;
    private static final String TAG = null;
    private static final String TAG_NETWORKKIT_PRE = null;
    private static final String TAG_NETWORK_SDK_PRE = null;
    private static ExtLogger extLogger;
    private static boolean println;

    /* access modifiers changed from: private */
    public static class ThrowableWrapper extends Throwable {
        private static final long serialVersionUID = 0;
        private String message;
        private Throwable ownerThrowable;
        private Throwable thisCause;

        static {
            C0201.m83(ThrowableWrapper.class, 494);
        }

        private ThrowableWrapper(Throwable th) {
            this.ownerThrowable = th;
            StackTraceElement[] stackTrace = th.getStackTrace();
            int i = ((th instanceof IOException) || (th instanceof JSONException)) ? 8 : 20;
            if (stackTrace.length > i) {
                setStackTrace((StackTraceElement[]) Arrays.copyOf(stackTrace, i));
            } else {
                setStackTrace(stackTrace);
            }
            setMessage(StringUtils.anonymizeMessage(th.getMessage()));
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void setCause(Throwable th) {
            this.thisCause = th;
        }

        public Throwable getCause() {
            Throwable th = this.thisCause;
            if (th == this) {
                return null;
            }
            return th;
        }

        public String getMessage() {
            return this.message;
        }

        public void setMessage(String str) {
            this.message = str;
        }

        public String toString() {
            Throwable th = this.ownerThrowable;
            if (th == null) {
                return C0201.m82(24558);
            }
            String name = th.getClass().getName();
            if (this.message == null) {
                return name;
            }
            String str = name + C0201.m82(24559);
            if (this.message.startsWith(str)) {
                return this.message;
            }
            return str + this.message;
        }
    }

    static {
        C0201.m83(Logger.class, 428);
    }

    private static String complexAppTag(String str) {
        return C0201.m82(35454) + str;
    }

    private static String complexMsg(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return getCallMethodInfo(i);
        }
        return getCallMethodInfo(i) + C0201.m82(35455) + str;
    }

    private static String complexTag(String str) {
        return C0201.m82(35456) + str;
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
        if (isAPPLoggable(6)) {
            extLogger.e(complexAppTag(str), complexMsg(str2, 5), getNewThrowable(th));
        }
        if (println) {
            Log.e(complexTag(str), complexMsg(str2, 5), getNewThrowable(th));
        }
    }

    public static void e(String str, String str2, Object... objArr) {
        println(6, str, str2, objArr);
    }

    private static void extLogPrintln(int i, String str, String str2) {
        if (i == 2) {
            extLogger.v(str, str2);
        } else if (i == 3) {
            extLogger.d(str, str2);
        } else if (i == 4) {
            extLogger.i(str, str2);
        } else if (i == 5) {
            extLogger.w(str, str2);
        } else if (i == 6) {
            extLogger.e(str, str2);
        }
    }

    private static String getCallMethodInfo(int i) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length <= i) {
            return C0201.m82(35458);
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        StringBuilder sb = new StringBuilder();
        sb.append(Thread.currentThread().getName());
        String r1 = C0201.m82(35457);
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

    private static Throwable getNewThrowable(Throwable th) {
        if (isLoggable(3)) {
            return th;
        }
        if (th == null) {
            return null;
        }
        ThrowableWrapper throwableWrapper = new ThrowableWrapper(th);
        Throwable cause = th.getCause();
        ThrowableWrapper throwableWrapper2 = throwableWrapper;
        while (cause != null) {
            ThrowableWrapper throwableWrapper3 = new ThrowableWrapper(cause);
            throwableWrapper2.setCause(throwableWrapper3);
            cause = cause.getCause();
            throwableWrapper2 = throwableWrapper3;
        }
        return throwableWrapper;
    }

    @SuppressLint({"LogTagMismatch"})
    public static void i(String str, Object obj) {
        println(4, str, obj);
    }

    @SuppressLint({"LogTagMismatch"})
    public static void i(String str, String str2, Object... objArr) {
        println(4, str, str2, objArr);
    }

    public static boolean isAPPLoggable(int i) {
        if (extLogger != null) {
            return Log.isLoggable(C0201.m82(35459), i);
        }
        return false;
    }

    public static boolean isLoggable(int i) {
        return Log.isLoggable(C0201.m82(35460), i);
    }

    private static int logPrintln(int i, String str, String str2) {
        if (isAPPLoggable(i)) {
            extLogPrintln(i, complexAppTag(str), complexMsg(str2, 7));
        }
        if (println) {
            return Log.println(i, complexTag(str), complexMsg(str2, 7));
        }
        return 1;
    }

    public static void println(int i, String str, Object obj) {
        if (i >= 3 && isLoggable(i)) {
            logPrintln(i, str, obj == null ? C0201.m82(35461) : obj.toString());
        }
    }

    public static void println(int i, String str, String str2, Object... objArr) {
        if (i >= 3) {
            String r0 = C0201.m82(35462);
            if (str2 == null) {
                Log.w(r0, C0201.m82(35463));
                return;
            }
            try {
                if (isLoggable(i)) {
                    logPrintln(i, str, StringUtils.format(str2, objArr));
                }
            } catch (IllegalFormatException e) {
                w(r0, C0201.m82(35464) + str2, e);
            }
        }
    }

    public static void setExtLogger(ExtLogger extLogger2, boolean z) {
        extLogger = extLogger2;
        println = z;
        i(C0201.m82(35466), C0201.m82(35465) + extLogger2 + z);
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
        if (isAPPLoggable(5)) {
            extLogger.w(complexAppTag(str), complexMsg(str2, 5), getNewThrowable(th));
        }
        if (println) {
            Log.w(complexTag(str), complexMsg(str2, 5), getNewThrowable(th));
        }
    }

    public static void w(String str, String str2, Object... objArr) {
        println(5, str, str2, objArr);
    }
}
