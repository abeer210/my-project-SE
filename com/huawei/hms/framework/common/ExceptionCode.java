package com.huawei.hms.framework.common;

import android.text.TextUtils;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import vigqyno.C0201;

public class ExceptionCode {
    public static final int CANCEL = 0;
    private static final String CONNECT = null;
    public static final int CONNECTION_ABORT = 0;
    public static final int CONNECTION_REFUSED = 0;
    public static final int CONNECTION_RESET = 0;
    public static final int CONNECT_FAILED = 0;
    public static final int CRASH_EXCEPTION = 0;
    public static final int INTERRUPT_CONNECT_CLOSE = 0;
    public static final int INTERRUPT_EXCEPTION = 0;
    public static final int NETWORK_CHANGED = 0;
    public static final int NETWORK_IO_EXCEPTION = 0;
    public static final int NETWORK_UNREACHABLE = 0;
    public static final int PROTOCOL_ERROR = 0;
    private static final String READ = null;
    public static final int READ_ERROR = 0;
    public static final int ROUTE_FAILED = 0;
    public static final int SHUTDOWN_EXCEPTION = 0;
    public static final int SOCKET_CLOSE = 0;
    public static final int SOCKET_CONNECT_TIMEOUT = 0;
    public static final int SOCKET_READ_TIMEOUT = 0;
    public static final int SOCKET_TIMEOUT = 0;
    public static final int SOCKET_WRITE_TIMEOUT = 0;
    public static final int SSL_HANDSHAKE_EXCEPTION = 0;
    public static final int SSL_PEERUNVERIFIED_EXCEPTION = 0;
    public static final int SSL_PROTOCOL_EXCEPTION = 0;
    public static final int UNABLE_TO_RESOLVE_HOST = 0;
    public static final int UNEXPECTED_EOF = 0;
    private static final String WRITE = null;

    static {
        C0201.m83(ExceptionCode.class, 241);
    }

    private static String checkExceptionContainsKey(Exception exc, String... strArr) {
        String checkStrContainsKey = checkStrContainsKey(StringUtils.toLowerCase(exc.getMessage()), strArr);
        if (!TextUtils.isEmpty(checkStrContainsKey)) {
            return checkStrContainsKey;
        }
        for (StackTraceElement stackTraceElement : exc.getStackTrace()) {
            checkStrContainsKey = checkStrContainsKey(StringUtils.toLowerCase(stackTraceElement.toString()), strArr);
            if (!TextUtils.isEmpty(checkStrContainsKey)) {
                return checkStrContainsKey;
            }
        }
        return checkStrContainsKey;
    }

    private static String checkStrContainsKey(String str, String... strArr) {
        boolean isEmpty = TextUtils.isEmpty(str);
        String r1 = C0201.m82(33477);
        if (isEmpty) {
            return r1;
        }
        for (String str2 : strArr) {
            if (str.contains(str2)) {
                return str2;
            }
        }
        return r1;
    }

    public static int getErrorCodeFromException(Exception exc) {
        if (exc == null) {
            return 1102;
        }
        if (!(exc instanceof IOException)) {
            return 1103;
        }
        String message = exc.getMessage();
        if (message == null) {
            return 1102;
        }
        String lowerCase = StringUtils.toLowerCase(message);
        int errorCodeFromMsg = getErrorCodeFromMsg(lowerCase);
        if (errorCodeFromMsg != 1102) {
            return errorCodeFromMsg;
        }
        if (exc instanceof SocketTimeoutException) {
            return getErrorCodeSocketTimeout(exc);
        }
        if (exc instanceof ConnectException) {
            return 110206;
        }
        if (exc instanceof NoRouteToHostException) {
            return 110207;
        }
        if (exc instanceof SSLProtocolException) {
            return 110210;
        }
        if (exc instanceof SSLHandshakeException) {
            return 110211;
        }
        if (exc instanceof SSLPeerUnverifiedException) {
            return 110212;
        }
        if (exc instanceof UnknownHostException) {
            return 110202;
        }
        return exc instanceof InterruptedIOException ? lowerCase.contains(C0201.m82(33478)) ? 110214 : 110213 : errorCodeFromMsg;
    }

    private static int getErrorCodeFromMsg(String str) {
        if (str.contains(C0201.m82(33479))) {
            return 110201;
        }
        if (str.contains(C0201.m82(33480))) {
            return 110202;
        }
        if (str.contains(C0201.m82(33481))) {
            return 110203;
        }
        if (str.contains(C0201.m82(33482))) {
            return 110204;
        }
        if (str.contains(C0201.m82(33483))) {
            return 110205;
        }
        if (str.contains(C0201.m82(33484))) {
            return 110206;
        }
        if (str.contains(C0201.m82(33485))) {
            return 110209;
        }
        if (str.contains(C0201.m82(33486))) {
            return 110221;
        }
        if (str.contains(C0201.m82(33487))) {
            return 110207;
        }
        if (str.contains(C0201.m82(33488))) {
            return 110208;
        }
        return str.contains(C0201.m82(33489)) ? 110215 : 1102;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005e A[RETURN] */
    private static int getErrorCodeSocketTimeout(Exception exc) {
        char c;
        String r0 = C0201.m82(33490);
        String r1 = C0201.m82(33491);
        String r2 = C0201.m82(33492);
        String checkExceptionContainsKey = checkExceptionContainsKey(exc, r0, r1, r2);
        int hashCode = checkExceptionContainsKey.hashCode();
        if (hashCode != 3496342) {
            if (hashCode != 113399775) {
                if (hashCode == 951351530 && checkExceptionContainsKey.equals(r0)) {
                    c = 0;
                    if (c != 0) {
                        return 110221;
                    }
                    if (c != 1) {
                        return c != 2 ? 110200 : 110225;
                    }
                    return 110223;
                }
            } else if (checkExceptionContainsKey.equals(r2)) {
                c = 2;
                if (c != 0) {
                }
            }
        } else if (checkExceptionContainsKey.equals(r1)) {
            c = 1;
            if (c != 0) {
            }
        }
        c = 65535;
        if (c != 0) {
        }
    }
}
