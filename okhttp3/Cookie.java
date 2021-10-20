package okhttp3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpDate;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import vigqyno.C0201;

public final class Cookie {
    private static final Pattern DAY_OF_MONTH_PATTERN = Pattern.compile(C0201.m82(36449));
    private static final Pattern MONTH_PATTERN = Pattern.compile(C0201.m82(36448));
    private static final Pattern TIME_PATTERN = Pattern.compile(C0201.m82(36450));
    private static final Pattern YEAR_PATTERN = Pattern.compile(C0201.m82(36447));
    public static final String a = null;
    public static final String b = null;
    public static final String c = null;
    public static final String d = null;
    public static final String e = null;
    public static final String f = null;
    public static final String g = null;
    public static final String h = null;
    private final String domain;
    private final long expiresAt;
    private final boolean hostOnly;
    private final boolean httpOnly;
    private final String name;
    private final String path;
    private final boolean persistent;
    private final boolean secure;
    private final String value;

    public static final class Builder {
        public String domain;
        public long expiresAt = 253402300799999L;
        public boolean hostOnly;
        public boolean httpOnly;
        public String name;
        public String path = C0201.m82(4957);
        public boolean persistent;
        public boolean secure;
        public String value;

        public Cookie build() {
            return new Cookie(this);
        }

        public Builder domain(String str) {
            return domain(str, false);
        }

        public Builder expiresAt(long j) {
            if (j <= 0) {
                j = Long.MIN_VALUE;
            }
            if (j > 253402300799999L) {
                j = 253402300799999L;
            }
            this.expiresAt = j;
            this.persistent = true;
            return this;
        }

        public Builder hostOnlyDomain(String str) {
            return domain(str, true);
        }

        public Builder httpOnly() {
            this.httpOnly = true;
            return this;
        }

        public Builder name(String str) {
            if (str == null) {
                throw new NullPointerException(C0201.m82(4961));
            } else if (str.trim().equals(str)) {
                this.name = str;
                return this;
            } else {
                throw new IllegalArgumentException(C0201.m82(4960));
            }
        }

        public Builder path(String str) {
            if (str.startsWith(C0201.m82(4962))) {
                this.path = str;
                return this;
            }
            throw new IllegalArgumentException(C0201.m82(4963));
        }

        public Builder secure() {
            this.secure = true;
            return this;
        }

        public Builder value(String str) {
            if (str == null) {
                throw new NullPointerException(C0201.m82(4965));
            } else if (str.trim().equals(str)) {
                this.value = str;
                return this;
            } else {
                throw new IllegalArgumentException(C0201.m82(4964));
            }
        }

        private Builder domain(String str, boolean z) {
            if (str != null) {
                String canonicalizeHost = Util.canonicalizeHost(str);
                if (canonicalizeHost != null) {
                    this.domain = canonicalizeHost;
                    this.hostOnly = z;
                    return this;
                }
                throw new IllegalArgumentException(C0201.m82(4958) + str);
            }
            throw new NullPointerException(C0201.m82(4959));
        }
    }

    static {
        C0201.m83(Cookie.class, 112);
    }

    private Cookie(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.name = str;
        this.value = str2;
        this.expiresAt = j;
        this.domain = str3;
        this.path = str4;
        this.secure = z;
        this.httpOnly = z2;
        this.hostOnly = z3;
        this.persistent = z4;
    }

    private static int dateCharacterOffset(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    private static boolean domainMatch(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        if (!str.endsWith(str2) || str.charAt((str.length() - str2.length()) - 1) != '.' || Util.verifyAsIpAddress(str)) {
            return false;
        }
        return true;
    }

    public static Cookie parse(HttpUrl httpUrl, String str) {
        return parse(System.currentTimeMillis(), httpUrl, str);
    }

    public static List<Cookie> parseAll(HttpUrl httpUrl, Headers headers) {
        List<String> values = headers.values(C0201.m82(36454));
        int size = values.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            Cookie parse = parse(httpUrl, values.get(i));
            if (parse != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(parse);
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    private static String parseDomain(String str) {
        String r0 = C0201.m82(36455);
        if (!str.endsWith(r0)) {
            if (str.startsWith(r0)) {
                str = str.substring(1);
            }
            String canonicalizeHost = Util.canonicalizeHost(str);
            if (canonicalizeHost != null) {
                return canonicalizeHost;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    private static long parseExpires(String str, int i, int i2) {
        int dateCharacterOffset = dateCharacterOffset(str, i, i2, false);
        Matcher matcher = TIME_PATTERN.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (dateCharacterOffset < i2) {
            int dateCharacterOffset2 = dateCharacterOffset(str, dateCharacterOffset + 1, i2, true);
            matcher.region(dateCharacterOffset, dateCharacterOffset2);
            if (i4 == -1 && matcher.usePattern(TIME_PATTERN).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
                i7 = Integer.parseInt(matcher.group(2));
                i8 = Integer.parseInt(matcher.group(3));
            } else if (i5 == -1 && matcher.usePattern(DAY_OF_MONTH_PATTERN).matches()) {
                i5 = Integer.parseInt(matcher.group(1));
            } else if (i6 == -1 && matcher.usePattern(MONTH_PATTERN).matches()) {
                i6 = MONTH_PATTERN.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
            } else if (i3 == -1 && matcher.usePattern(YEAR_PATTERN).matches()) {
                i3 = Integer.parseInt(matcher.group(1));
            }
            dateCharacterOffset = dateCharacterOffset(str, dateCharacterOffset2 + 1, i2, false);
        }
        if (i3 >= 70 && i3 <= 99) {
            i3 += 1900;
        }
        if (i3 >= 0 && i3 <= 69) {
            i3 += 2000;
        }
        if (i3 < 1601) {
            throw new IllegalArgumentException();
        } else if (i6 == -1) {
            throw new IllegalArgumentException();
        } else if (i5 < 1 || i5 > 31) {
            throw new IllegalArgumentException();
        } else if (i4 < 0 || i4 > 23) {
            throw new IllegalArgumentException();
        } else if (i7 < 0 || i7 > 59) {
            throw new IllegalArgumentException();
        } else if (i8 < 0 || i8 > 59) {
            throw new IllegalArgumentException();
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(Util.UTC);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i3);
            gregorianCalendar.set(2, i6 - 1);
            gregorianCalendar.set(5, i5);
            gregorianCalendar.set(11, i4);
            gregorianCalendar.set(12, i7);
            gregorianCalendar.set(13, i8);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
    }

    private static long parseMaxAge(String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong <= 0) {
                return Long.MIN_VALUE;
            }
            return parseLong;
        } catch (NumberFormatException e2) {
            if (!str.matches(C0201.m82(36456))) {
                throw e2;
            } else if (str.startsWith(C0201.m82(36457))) {
                return Long.MIN_VALUE;
            } else {
                return Long.MAX_VALUE;
            }
        }
    }

    private static boolean pathMatch(HttpUrl httpUrl, String str) {
        String encodedPath = httpUrl.encodedPath();
        if (encodedPath.equals(str)) {
            return true;
        }
        if (!encodedPath.startsWith(str)) {
            return false;
        }
        if (!str.endsWith(C0201.m82(36458)) && encodedPath.charAt(str.length()) != '/') {
            return false;
        }
        return true;
    }

    public String domain() {
        return this.domain;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Cookie)) {
            return false;
        }
        Cookie cookie = (Cookie) obj;
        if (cookie.name.equals(this.name) && cookie.value.equals(this.value) && cookie.domain.equals(this.domain) && cookie.path.equals(this.path) && cookie.expiresAt == this.expiresAt && cookie.secure == this.secure && cookie.httpOnly == this.httpOnly && cookie.persistent == this.persistent && cookie.hostOnly == this.hostOnly) {
            return true;
        }
        return false;
    }

    public long expiresAt() {
        return this.expiresAt;
    }

    public int hashCode() {
        long j = this.expiresAt;
        return ((((((((((((((((527 + this.name.hashCode()) * 31) + this.value.hashCode()) * 31) + this.domain.hashCode()) * 31) + this.path.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + (!this.secure ? 1 : 0)) * 31) + (!this.httpOnly ? 1 : 0)) * 31) + (!this.persistent ? 1 : 0)) * 31) + (!this.hostOnly ? 1 : 0);
    }

    public boolean hostOnly() {
        return this.hostOnly;
    }

    public boolean httpOnly() {
        return this.httpOnly;
    }

    public boolean matches(HttpUrl httpUrl) {
        boolean z;
        if (this.hostOnly) {
            z = httpUrl.host().equals(this.domain);
        } else {
            z = domainMatch(httpUrl.host(), this.domain);
        }
        if (!z || !pathMatch(httpUrl, this.path)) {
            return false;
        }
        if (!this.secure || httpUrl.isHttps()) {
            return true;
        }
        return false;
    }

    public String name() {
        return this.name;
    }

    public String path() {
        return this.path;
    }

    public boolean persistent() {
        return this.persistent;
    }

    public boolean secure() {
        return this.secure;
    }

    public String toString() {
        return toString(false);
    }

    public String value() {
        return this.value;
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0128  */
    public static Cookie parse(long j, HttpUrl httpUrl, String str) {
        long j2;
        String host;
        String str2;
        Cookie cookie;
        String str3;
        String str4;
        int lastIndexOf;
        int length = str.length();
        char c2 = ';';
        int delimiterOffset = Util.delimiterOffset(str, 0, length, ';');
        char c3 = '=';
        int delimiterOffset2 = Util.delimiterOffset(str, 0, delimiterOffset, '=');
        if (delimiterOffset2 == delimiterOffset) {
            return null;
        }
        String trimSubstring = Util.trimSubstring(str, 0, delimiterOffset2);
        if (trimSubstring.isEmpty() || Util.indexOfControlOrNonAscii(trimSubstring) != -1) {
            return null;
        }
        String trimSubstring2 = Util.trimSubstring(str, delimiterOffset2 + 1, delimiterOffset);
        if (Util.indexOfControlOrNonAscii(trimSubstring2) != -1) {
            return null;
        }
        int i = delimiterOffset + 1;
        String str5 = null;
        String str6 = null;
        long j3 = -1;
        long j4 = 253402300799999L;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = true;
        boolean z4 = false;
        while (i < length) {
            int delimiterOffset3 = Util.delimiterOffset(str, i, length, c2);
            int delimiterOffset4 = Util.delimiterOffset(str, i, delimiterOffset3, c3);
            String trimSubstring3 = Util.trimSubstring(str, i, delimiterOffset4);
            String trimSubstring4 = delimiterOffset4 < delimiterOffset3 ? Util.trimSubstring(str, delimiterOffset4 + 1, delimiterOffset3) : b;
            if (trimSubstring3.equalsIgnoreCase(d)) {
                try {
                    j4 = parseExpires(trimSubstring4, 0, trimSubstring4.length());
                } catch (IllegalArgumentException unused) {
                }
            } else if (trimSubstring3.equalsIgnoreCase(e)) {
                j3 = parseMaxAge(trimSubstring4);
            } else {
                if (trimSubstring3.equalsIgnoreCase(h)) {
                    str6 = parseDomain(trimSubstring4);
                    z3 = false;
                } else if (trimSubstring3.equalsIgnoreCase(a)) {
                    str5 = trimSubstring4;
                } else if (trimSubstring3.equalsIgnoreCase(c)) {
                    z = true;
                } else if (trimSubstring3.equalsIgnoreCase(g)) {
                    z2 = true;
                }
                i = delimiterOffset3 + 1;
                c2 = ';';
                c3 = '=';
            }
            z4 = true;
            i = delimiterOffset3 + 1;
            c2 = ';';
            c3 = '=';
        }
        long j5 = Long.MIN_VALUE;
        if (j3 != Long.MIN_VALUE) {
            if (j3 != -1) {
                j5 = j + (j3 <= 9223372036854775L ? j3 * 1000 : Long.MAX_VALUE);
                if (j5 < j || j5 > 253402300799999L) {
                    j2 = 253402300799999L;
                }
            } else {
                j2 = j4;
            }
            host = httpUrl.host();
            if (str6 != null) {
                str2 = host;
                cookie = null;
            } else if (!domainMatch(host, str6)) {
                return null;
            } else {
                cookie = null;
                str2 = str6;
            }
            if (host.length() == str2.length() && PublicSuffixDatabase.get().getEffectiveTldPlusOne(str2) == null) {
                return cookie;
            }
            str3 = f;
            if (str5 != null || !str5.startsWith(str3)) {
                String encodedPath = httpUrl.encodedPath();
                lastIndexOf = encodedPath.lastIndexOf(47);
                if (lastIndexOf != 0) {
                    str3 = encodedPath.substring(0, lastIndexOf);
                }
                str4 = str3;
            } else {
                str4 = str5;
            }
            return new Cookie(trimSubstring, trimSubstring2, j2, str2, str4, z, z2, z3, z4);
        }
        j2 = j5;
        host = httpUrl.host();
        if (str6 != null) {
        }
        if (host.length() == str2.length()) {
        }
        str3 = f;
        if (str5 != null) {
        }
        String encodedPath2 = httpUrl.encodedPath();
        lastIndexOf = encodedPath2.lastIndexOf(47);
        if (lastIndexOf != 0) {
        }
        str4 = str3;
        return new Cookie(trimSubstring, trimSubstring2, j2, str2, str4, z, z2, z3, z4);
    }

    public String toString(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        sb.append('=');
        sb.append(this.value);
        if (this.persistent) {
            if (this.expiresAt == Long.MIN_VALUE) {
                sb.append(C0201.m82(36459));
            } else {
                sb.append(C0201.m82(36460));
                sb.append(HttpDate.format(new Date(this.expiresAt)));
            }
        }
        if (!this.hostOnly) {
            sb.append(C0201.m82(36461));
            if (z) {
                sb.append(C0201.m82(36462));
            }
            sb.append(this.domain);
        }
        sb.append(C0201.m82(36463));
        sb.append(this.path);
        if (this.secure) {
            sb.append(C0201.m82(36464));
        }
        if (this.httpOnly) {
            sb.append(C0201.m82(36465));
        }
        return sb.toString();
    }

    public Cookie(Builder builder) {
        String str = builder.name;
        if (str != null) {
            String str2 = builder.value;
            if (str2 != null) {
                String str3 = builder.domain;
                if (str3 != null) {
                    this.name = str;
                    this.value = str2;
                    this.expiresAt = builder.expiresAt;
                    this.domain = str3;
                    this.path = builder.path;
                    this.secure = builder.secure;
                    this.httpOnly = builder.httpOnly;
                    this.persistent = builder.persistent;
                    this.hostOnly = builder.hostOnly;
                    return;
                }
                throw new NullPointerException(C0201.m82(36451));
            }
            throw new NullPointerException(C0201.m82(36452));
        }
        throw new NullPointerException(C0201.m82(36453));
    }
}
