package okhttp3.internal.http2;

import okhttp3.Headers;
import okhttp3.internal.Util;
import vigqyno.C0201;

public final class Header {
    public static final dy2 PSEUDO_PREFIX = dy2.k(C0201.m82(34089));
    public static final dy2 RESPONSE_STATUS = dy2.k(C0201.m82(34090));
    public static final String RESPONSE_STATUS_UTF8 = null;
    public static final dy2 TARGET_AUTHORITY = dy2.k(C0201.m82(34094));
    public static final String TARGET_AUTHORITY_UTF8 = null;
    public static final dy2 TARGET_METHOD = dy2.k(C0201.m82(34091));
    public static final String TARGET_METHOD_UTF8 = null;
    public static final dy2 TARGET_PATH = dy2.k(C0201.m82(34092));
    public static final String TARGET_PATH_UTF8 = null;
    public static final dy2 TARGET_SCHEME = dy2.k(C0201.m82(34093));
    public static final String TARGET_SCHEME_UTF8 = null;
    public final int hpackSize;
    public final dy2 name;
    public final dy2 value;

    /* access modifiers changed from: package-private */
    public interface Listener {
        void onHeaders(Headers headers);
    }

    static {
        C0201.m83(Header.class, 402);
    }

    public Header(String str, String str2) {
        this(dy2.k(str), dy2.k(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        if (!this.name.equals(header.name) || !this.value.equals(header.value)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((527 + this.name.hashCode()) * 31) + this.value.hashCode();
    }

    public String toString() {
        return Util.format(C0201.m82(34095), this.name.J(), this.value.J());
    }

    public Header(dy2 dy2, String str) {
        this(dy2, dy2.k(str));
    }

    public Header(dy2 dy2, dy2 dy22) {
        this.name = dy2;
        this.value = dy22;
        this.hpackSize = dy2.A() + 32 + dy22.A();
    }
}
