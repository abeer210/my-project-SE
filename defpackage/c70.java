package defpackage;

/* renamed from: c70  reason: default package */
/* compiled from: ExceptionWithNoStacktrace */
public class c70 extends Exception {
    public c70(String str) {
        super(str);
    }

    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}
