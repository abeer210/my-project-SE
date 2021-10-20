package okhttp3;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import okhttp3.internal.Util;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import vigqyno.C0201;

public final class HttpUrl {
    public static final String FORM_ENCODE_SET = null;
    public static final String FRAGMENT_ENCODE_SET = null;
    public static final String FRAGMENT_ENCODE_SET_URI = null;
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final String PASSWORD_ENCODE_SET = null;
    public static final String PATH_SEGMENT_ENCODE_SET = null;
    public static final String PATH_SEGMENT_ENCODE_SET_URI = null;
    public static final String QUERY_COMPONENT_ENCODE_SET = null;
    public static final String QUERY_COMPONENT_ENCODE_SET_URI = null;
    public static final String QUERY_COMPONENT_REENCODE_SET = null;
    public static final String QUERY_ENCODE_SET = null;
    public static final String USERNAME_ENCODE_SET = null;
    private final String fragment;
    public final String host;
    private final String password;
    private final List<String> pathSegments;
    public final int port;
    private final List<String> queryNamesAndValues;
    public final String scheme;
    private final String url;
    private final String username;

    static {
        C0201.m83(HttpUrl.class, 350);
    }

    public HttpUrl(Builder builder) {
        this.scheme = builder.scheme;
        this.username = percentDecode(builder.encodedUsername, false);
        this.password = percentDecode(builder.encodedPassword, false);
        this.host = builder.host;
        this.port = builder.effectivePort();
        this.pathSegments = percentDecode(builder.encodedPathSegments, false);
        List<String> list = builder.encodedQueryNamesAndValues;
        String str = null;
        this.queryNamesAndValues = list != null ? percentDecode(list, true) : null;
        String str2 = builder.encodedFragment;
        this.fragment = str2 != null ? percentDecode(str2, false) : str;
        this.url = builder.toString();
    }

    public static String canonicalize(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        int i3 = i;
        while (i3 < i2) {
            int codePointAt = str.codePointAt(i3);
            if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || !z4)) {
                if (str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z && (!z2 || percentEncoded(str, i3, i2)))) && (codePointAt != 43 || !z3))) {
                    i3 += Character.charCount(codePointAt);
                }
            }
            ay2 ay2 = new ay2();
            ay2.w0(str, i, i3);
            canonicalize(ay2, str, i3, i2, str2, z, z2, z3, z4, charset);
            return ay2.G();
        }
        return str.substring(i, i2);
    }

    public static int defaultPort(String str) {
        if (str.equals(C0201.m82(14184))) {
            return 80;
        }
        return str.equals(C0201.m82(14185)) ? 443 : -1;
    }

    public static HttpUrl get(String str) {
        return new Builder().parse(null, str).build();
    }

    public static void namesAndValuesToQueryString(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = list.get(i);
            String str2 = list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    public static HttpUrl parse(String str) {
        try {
            return get(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static void pathSegmentsToString(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append(list.get(i));
        }
    }

    public static String percentDecode(String str, boolean z) {
        return percentDecode(str, 0, str.length(), z);
    }

    public static boolean percentEncoded(String str, int i, int i2) {
        int i3 = i + 2;
        if (i3 >= i2 || str.charAt(i) != '%' || Util.decodeHexDigit(str.charAt(i + 1)) == -1 || Util.decodeHexDigit(str.charAt(i3)) == -1) {
            return false;
        }
        return true;
    }

    public static List<String> queryStringToNamesAndValues(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i, indexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            }
            i = indexOf + 1;
        }
        return arrayList;
    }

    public String encodedFragment() {
        if (this.fragment == null) {
            return null;
        }
        return this.url.substring(this.url.indexOf(35) + 1);
    }

    public String encodedPassword() {
        if (this.password.isEmpty()) {
            return C0201.m82(14186);
        }
        int indexOf = this.url.indexOf(64);
        return this.url.substring(this.url.indexOf(58, this.scheme.length() + 3) + 1, indexOf);
    }

    public String encodedPath() {
        int indexOf = this.url.indexOf(47, this.scheme.length() + 3);
        String str = this.url;
        return this.url.substring(indexOf, Util.delimiterOffset(str, indexOf, str.length(), C0201.m82(14187)));
    }

    public List<String> encodedPathSegments() {
        int indexOf = this.url.indexOf(47, this.scheme.length() + 3);
        String str = this.url;
        int delimiterOffset = Util.delimiterOffset(str, indexOf, str.length(), C0201.m82(14188));
        ArrayList arrayList = new ArrayList();
        while (indexOf < delimiterOffset) {
            int i = indexOf + 1;
            int delimiterOffset2 = Util.delimiterOffset(this.url, i, delimiterOffset, '/');
            arrayList.add(this.url.substring(i, delimiterOffset2));
            indexOf = delimiterOffset2;
        }
        return arrayList;
    }

    public String encodedQuery() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int indexOf = this.url.indexOf(63) + 1;
        String str = this.url;
        return this.url.substring(indexOf, Util.delimiterOffset(str, indexOf, str.length(), '#'));
    }

    public String encodedUsername() {
        if (this.username.isEmpty()) {
            return C0201.m82(14189);
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        return this.url.substring(length, Util.delimiterOffset(str, length, str.length(), C0201.m82(14190)));
    }

    public boolean equals(Object obj) {
        return (obj instanceof HttpUrl) && ((HttpUrl) obj).url.equals(this.url);
    }

    public String fragment() {
        return this.fragment;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public String host() {
        return this.host;
    }

    public boolean isHttps() {
        return this.scheme.equals(C0201.m82(14191));
    }

    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.scheme = this.scheme;
        builder.encodedUsername = encodedUsername();
        builder.encodedPassword = encodedPassword();
        builder.host = this.host;
        builder.port = this.port != defaultPort(this.scheme) ? this.port : -1;
        builder.encodedPathSegments.clear();
        builder.encodedPathSegments.addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.encodedFragment = encodedFragment();
        return builder;
    }

    public String password() {
        return this.password;
    }

    public List<String> pathSegments() {
        return this.pathSegments;
    }

    public int pathSize() {
        return this.pathSegments.size();
    }

    public int port() {
        return this.port;
    }

    public String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        namesAndValuesToQueryString(sb, this.queryNamesAndValues);
        return sb.toString();
    }

    public String queryParameter(String str) {
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            return null;
        }
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            if (str.equals(this.queryNamesAndValues.get(i))) {
                return this.queryNamesAndValues.get(i + 1);
            }
        }
        return null;
    }

    public String queryParameterName(int i) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.get(i * 2);
        }
        throw new IndexOutOfBoundsException();
    }

    public Set<String> queryParameterNames() {
        if (this.queryNamesAndValues == null) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = this.queryNamesAndValues.size();
        for (int i = 0; i < size; i += 2) {
            linkedHashSet.add(this.queryNamesAndValues.get(i));
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    public String queryParameterValue(int i) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.get((i * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    public List<String> queryParameterValues(String str) {
        if (this.queryNamesAndValues == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = this.queryNamesAndValues.size();
        for (int i = 0; i < size; i += 2) {
            if (str.equals(this.queryNamesAndValues.get(i))) {
                arrayList.add(this.queryNamesAndValues.get(i + 1));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public int querySize() {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    public String redact() {
        Builder newBuilder = newBuilder(C0201.m82(14192));
        String r1 = C0201.m82(14193);
        return newBuilder.username(r1).password(r1).build().toString();
    }

    public HttpUrl resolve(String str) {
        Builder newBuilder = newBuilder(str);
        if (newBuilder != null) {
            return newBuilder.build();
        }
        return null;
    }

    public String scheme() {
        return this.scheme;
    }

    public String toString() {
        return this.url;
    }

    public String topPrivateDomain() {
        if (Util.verifyAsIpAddress(this.host)) {
            return null;
        }
        return PublicSuffixDatabase.get().getEffectiveTldPlusOne(this.host);
    }

    public URI uri() {
        String builder = newBuilder().reencodeForUri().toString();
        try {
            return new URI(builder);
        } catch (URISyntaxException e) {
            try {
                return URI.create(builder.replaceAll(C0201.m82(14194), C0201.m82(14195)));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public URL url() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public String username() {
        return this.username;
    }

    public static final class Builder {
        public static final String INVALID_HOST = null;
        public String encodedFragment;
        public String encodedPassword;
        public final List<String> encodedPathSegments;
        public List<String> encodedQueryNamesAndValues;
        public String encodedUsername;
        public String host;
        public int port = -1;
        public String scheme;

        static {
            C0201.m83(Builder.class, 696);
        }

        public Builder() {
            String r0 = C0201.m82(32584);
            this.encodedUsername = r0;
            this.encodedPassword = r0;
            ArrayList arrayList = new ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add(r0);
        }

        private static String canonicalizeHost(String str, int i, int i2) {
            return Util.canonicalizeHost(HttpUrl.percentDecode(str, i, i2, false));
        }

        private boolean isDot(String str) {
            return str.equals(C0201.m82(32586)) || str.equalsIgnoreCase(C0201.m82(32587));
        }

        private boolean isDotDot(String str) {
            return str.equals(C0201.m82(32588)) || str.equalsIgnoreCase(C0201.m82(32589)) || str.equalsIgnoreCase(C0201.m82(32590)) || str.equalsIgnoreCase(C0201.m82(32591));
        }

        private static int parsePort(String str, int i, int i2) {
            try {
                int parseInt = Integer.parseInt(HttpUrl.canonicalize(str, i, i2, C0201.m82(32592), false, false, false, true, null));
                if (parseInt <= 0 || parseInt > 65535) {
                    return -1;
                }
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }

        private void pop() {
            List<String> list = this.encodedPathSegments;
            boolean isEmpty = list.remove(list.size() - 1).isEmpty();
            String r1 = C0201.m82(32593);
            if (!isEmpty || this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add(r1);
                return;
            }
            List<String> list2 = this.encodedPathSegments;
            list2.set(list2.size() - 1, r1);
        }

        private static int portColonOffset(String str, int i, int i2) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt == ':') {
                    return i;
                }
                if (charAt == '[') {
                    do {
                        i++;
                        if (i >= i2) {
                            break;
                        }
                    } while (str.charAt(i) != ']');
                }
                i++;
            }
            return i2;
        }

        private void push(String str, int i, int i2, boolean z, boolean z2) {
            String canonicalize = HttpUrl.canonicalize(str, i, i2, C0201.m82(32594), z2, false, false, true, null);
            if (!isDot(canonicalize)) {
                if (isDotDot(canonicalize)) {
                    pop();
                    return;
                }
                List<String> list = this.encodedPathSegments;
                if (list.get(list.size() - 1).isEmpty()) {
                    List<String> list2 = this.encodedPathSegments;
                    list2.set(list2.size() - 1, canonicalize);
                } else {
                    this.encodedPathSegments.add(canonicalize);
                }
                if (z) {
                    this.encodedPathSegments.add(C0201.m82(32595));
                }
            }
        }

        private void removeAllCanonicalQueryParameters(String str) {
            for (int size = this.encodedQueryNamesAndValues.size() - 2; size >= 0; size -= 2) {
                if (str.equals(this.encodedQueryNamesAndValues.get(size))) {
                    this.encodedQueryNamesAndValues.remove(size + 1);
                    this.encodedQueryNamesAndValues.remove(size);
                    if (this.encodedQueryNamesAndValues.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
            }
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:57)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:15)
            */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x004e A[SYNTHETIC] */
        private void resolvePath(java.lang.String r11, int r12, int r13) {
            /*
                r10 = this;
                if (r12 != r13) goto L_0x0003
                return
            L_0x0003:
                char r0 = r11.charAt(r12)
                r1 = 47
                r2 = 32596(0x7f54, float:4.5677E-41)
                java.lang.String r2 = vigqyno.C0201.m82(r2)
                r3 = 1
                if (r0 == r1) goto L_0x0023
                r1 = 92
                if (r0 != r1) goto L_0x0018
                goto L_0x0023
            L_0x0018:
                java.util.List<java.lang.String> r0 = r10.encodedPathSegments
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L_0x002e
            L_0x0023:
                java.util.List<java.lang.String> r0 = r10.encodedPathSegments
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.encodedPathSegments
                r0.add(r2)
                goto L_0x004b
            L_0x002e:
                r6 = r12
                if (r6 >= r13) goto L_0x004e
                r12 = 32597(0x7f55, float:4.5678E-41)
                java.lang.String r12 = vigqyno.C0201.m82(r12)
                int r12 = okhttp3.internal.Util.delimiterOffset(r11, r6, r13, r12)
                if (r12 >= r13) goto L_0x0040
                r0 = 1
                goto L_0x0041
            L_0x0040:
                r0 = 0
            L_0x0041:
                r9 = 1
                r4 = r10
                r5 = r11
                r7 = r12
                r8 = r0
                r4.push(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L_0x002e
            L_0x004b:
                int r12 = r12 + 1
                goto L_0x002e
            L_0x004e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.resolvePath(java.lang.String, int, int):void");
        }

        private static int schemeDelimiterOffset(String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char charAt = str.charAt(i);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                    char charAt2 = str.charAt(i);
                    if ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && !((charAt2 >= '0' && charAt2 <= '9') || charAt2 == '+' || charAt2 == '-' || charAt2 == '.'))) {
                        if (charAt2 == ':') {
                            return i;
                        }
                    }
                }
            }
            return -1;
        }

        private static int slashCount(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        public Builder addEncodedPathSegment(String str) {
            if (str != null) {
                push(str, 0, str.length(), false, true);
                return this;
            }
            throw new NullPointerException(C0201.m82(32598));
        }

        public Builder addEncodedPathSegments(String str) {
            if (str != null) {
                return addPathSegments(str, true);
            }
            throw new NullPointerException(C0201.m82(32599));
        }

        public Builder addEncodedQueryParameter(String str, String str2) {
            if (str != null) {
                if (this.encodedQueryNamesAndValues == null) {
                    this.encodedQueryNamesAndValues = new ArrayList();
                }
                this.encodedQueryNamesAndValues.add(HttpUrl.canonicalize(str, C0201.m82(32600), true, false, true, true));
                this.encodedQueryNamesAndValues.add(str2 != null ? HttpUrl.canonicalize(str2, C0201.m82(32601), true, false, true, true) : null);
                return this;
            }
            throw new NullPointerException(C0201.m82(32602));
        }

        public Builder addPathSegment(String str) {
            if (str != null) {
                push(str, 0, str.length(), false, false);
                return this;
            }
            throw new NullPointerException(C0201.m82(32603));
        }

        public Builder addPathSegments(String str) {
            if (str != null) {
                return addPathSegments(str, false);
            }
            throw new NullPointerException(C0201.m82(32604));
        }

        public Builder addQueryParameter(String str, String str2) {
            if (str != null) {
                if (this.encodedQueryNamesAndValues == null) {
                    this.encodedQueryNamesAndValues = new ArrayList();
                }
                this.encodedQueryNamesAndValues.add(HttpUrl.canonicalize(str, C0201.m82(32605), false, false, true, true));
                this.encodedQueryNamesAndValues.add(str2 != null ? HttpUrl.canonicalize(str2, C0201.m82(32606), false, false, true, true) : null);
                return this;
            }
            throw new NullPointerException(C0201.m82(32607));
        }

        public HttpUrl build() {
            if (this.scheme == null) {
                throw new IllegalStateException(C0201.m82(32609));
            } else if (this.host != null) {
                return new HttpUrl(this);
            } else {
                throw new IllegalStateException(C0201.m82(32608));
            }
        }

        public int effectivePort() {
            int i = this.port;
            return i != -1 ? i : HttpUrl.defaultPort(this.scheme);
        }

        public Builder encodedFragment(String str) {
            this.encodedFragment = str != null ? HttpUrl.canonicalize(str, C0201.m82(32610), true, false, false, false) : null;
            return this;
        }

        public Builder encodedPassword(String str) {
            if (str != null) {
                this.encodedPassword = HttpUrl.canonicalize(str, C0201.m82(32611), true, false, false, true);
                return this;
            }
            throw new NullPointerException(C0201.m82(32612));
        }

        public Builder encodedPath(String str) {
            if (str == null) {
                throw new NullPointerException(C0201.m82(32615));
            } else if (str.startsWith(C0201.m82(32613))) {
                resolvePath(str, 0, str.length());
                return this;
            } else {
                throw new IllegalArgumentException(C0201.m82(32614) + str);
            }
        }

        public Builder encodedQuery(String str) {
            this.encodedQueryNamesAndValues = str != null ? HttpUrl.queryStringToNamesAndValues(HttpUrl.canonicalize(str, C0201.m82(32616), true, false, true, true)) : null;
            return this;
        }

        public Builder encodedUsername(String str) {
            if (str != null) {
                this.encodedUsername = HttpUrl.canonicalize(str, C0201.m82(32617), true, false, false, true);
                return this;
            }
            throw new NullPointerException(C0201.m82(32618));
        }

        public Builder fragment(String str) {
            this.encodedFragment = str != null ? HttpUrl.canonicalize(str, C0201.m82(32619), false, false, false, false) : null;
            return this;
        }

        public Builder host(String str) {
            if (str != null) {
                String canonicalizeHost = canonicalizeHost(str, 0, str.length());
                if (canonicalizeHost != null) {
                    this.host = canonicalizeHost;
                    return this;
                }
                throw new IllegalArgumentException(C0201.m82(32620) + str);
            }
            throw new NullPointerException(C0201.m82(32621));
        }

        public Builder parse(HttpUrl httpUrl, String str) {
            int delimiterOffset;
            int i;
            int skipLeadingAsciiWhitespace = Util.skipLeadingAsciiWhitespace(str, 0, str.length());
            int skipTrailingAsciiWhitespace = Util.skipTrailingAsciiWhitespace(str, skipLeadingAsciiWhitespace, str.length());
            int schemeDelimiterOffset = schemeDelimiterOffset(str, skipLeadingAsciiWhitespace, skipTrailingAsciiWhitespace);
            if (schemeDelimiterOffset != -1) {
                if (str.regionMatches(true, skipLeadingAsciiWhitespace, C0201.m82(32622), 0, 6)) {
                    this.scheme = C0201.m82(32623);
                    skipLeadingAsciiWhitespace += 6;
                } else if (str.regionMatches(true, skipLeadingAsciiWhitespace, C0201.m82(32624), 0, 5)) {
                    this.scheme = C0201.m82(32625);
                    skipLeadingAsciiWhitespace += 5;
                } else {
                    throw new IllegalArgumentException(C0201.m82(32626) + str.substring(0, schemeDelimiterOffset) + C0201.m82(32627));
                }
            } else if (httpUrl != null) {
                this.scheme = httpUrl.scheme;
            } else {
                throw new IllegalArgumentException(C0201.m82(32638));
            }
            int slashCount = slashCount(str, skipLeadingAsciiWhitespace, skipTrailingAsciiWhitespace);
            char c = '?';
            char c2 = '#';
            if (slashCount >= 2 || httpUrl == null || !httpUrl.scheme.equals(this.scheme)) {
                int i2 = skipLeadingAsciiWhitespace + slashCount;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    delimiterOffset = Util.delimiterOffset(str, i2, skipTrailingAsciiWhitespace, C0201.m82(32628));
                    char charAt = delimiterOffset != skipTrailingAsciiWhitespace ? str.charAt(delimiterOffset) : 65535;
                    if (charAt == 65535 || charAt == c2 || charAt == '/' || charAt == '\\' || charAt == c) {
                        int portColonOffset = portColonOffset(str, i2, delimiterOffset);
                        int i3 = portColonOffset + 1;
                    } else {
                        if (charAt == '@') {
                            String r8 = C0201.m82(32629);
                            if (!z) {
                                int delimiterOffset2 = Util.delimiterOffset(str, i2, delimiterOffset, ':');
                                i = delimiterOffset;
                                String canonicalize = HttpUrl.canonicalize(str, i2, delimiterOffset2, C0201.m82(32630), true, false, false, true, null);
                                if (z2) {
                                    canonicalize = this.encodedUsername + r8 + canonicalize;
                                }
                                this.encodedUsername = canonicalize;
                                if (delimiterOffset2 != i) {
                                    this.encodedPassword = HttpUrl.canonicalize(str, delimiterOffset2 + 1, i, C0201.m82(32631), true, false, false, true, null);
                                    z = true;
                                }
                                z2 = true;
                            } else {
                                i = delimiterOffset;
                                this.encodedPassword += r8 + HttpUrl.canonicalize(str, i2, i, C0201.m82(32632), true, false, false, true, null);
                            }
                            i2 = i + 1;
                        }
                        c = '?';
                        c2 = '#';
                    }
                }
                int portColonOffset2 = portColonOffset(str, i2, delimiterOffset);
                int i32 = portColonOffset2 + 1;
                if (i32 < delimiterOffset) {
                    this.host = canonicalizeHost(str, i2, portColonOffset2);
                    int parsePort = parsePort(str, i32, delimiterOffset);
                    this.port = parsePort;
                    if (parsePort == -1) {
                        throw new IllegalArgumentException(C0201.m82(32633) + str.substring(i32, delimiterOffset) + '\"');
                    }
                } else {
                    this.host = canonicalizeHost(str, i2, portColonOffset2);
                    this.port = HttpUrl.defaultPort(this.scheme);
                }
                if (this.host != null) {
                    skipLeadingAsciiWhitespace = delimiterOffset;
                } else {
                    throw new IllegalArgumentException(C0201.m82(32637) + str.substring(i2, portColonOffset2) + '\"');
                }
            } else {
                this.encodedUsername = httpUrl.encodedUsername();
                this.encodedPassword = httpUrl.encodedPassword();
                this.host = httpUrl.host;
                this.port = httpUrl.port;
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(httpUrl.encodedPathSegments());
                if (skipLeadingAsciiWhitespace == skipTrailingAsciiWhitespace || str.charAt(skipLeadingAsciiWhitespace) == '#') {
                    encodedQuery(httpUrl.encodedQuery());
                }
            }
            int delimiterOffset3 = Util.delimiterOffset(str, skipLeadingAsciiWhitespace, skipTrailingAsciiWhitespace, C0201.m82(32634));
            resolvePath(str, skipLeadingAsciiWhitespace, delimiterOffset3);
            if (delimiterOffset3 < skipTrailingAsciiWhitespace && str.charAt(delimiterOffset3) == '?') {
                int delimiterOffset4 = Util.delimiterOffset(str, delimiterOffset3, skipTrailingAsciiWhitespace, '#');
                this.encodedQueryNamesAndValues = HttpUrl.queryStringToNamesAndValues(HttpUrl.canonicalize(str, delimiterOffset3 + 1, delimiterOffset4, C0201.m82(32635), true, false, true, true, null));
                delimiterOffset3 = delimiterOffset4;
            }
            if (delimiterOffset3 < skipTrailingAsciiWhitespace && str.charAt(delimiterOffset3) == '#') {
                this.encodedFragment = HttpUrl.canonicalize(str, 1 + delimiterOffset3, skipTrailingAsciiWhitespace, C0201.m82(32636), true, false, false, false, null);
            }
            return this;
        }

        public Builder password(String str) {
            if (str != null) {
                this.encodedPassword = HttpUrl.canonicalize(str, C0201.m82(32639), false, false, false, true);
                return this;
            }
            throw new NullPointerException(C0201.m82(32640));
        }

        public Builder port(int i) {
            if (i <= 0 || i > 65535) {
                throw new IllegalArgumentException(C0201.m82(32641) + i);
            }
            this.port = i;
            return this;
        }

        public Builder query(String str) {
            this.encodedQueryNamesAndValues = str != null ? HttpUrl.queryStringToNamesAndValues(HttpUrl.canonicalize(str, C0201.m82(32642), false, false, true, true)) : null;
            return this;
        }

        public Builder reencodeForUri() {
            int size = this.encodedPathSegments.size();
            for (int i = 0; i < size; i++) {
                this.encodedPathSegments.set(i, HttpUrl.canonicalize(this.encodedPathSegments.get(i), C0201.m82(32643), true, true, false, true));
            }
            List<String> list = this.encodedQueryNamesAndValues;
            if (list != null) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str = this.encodedQueryNamesAndValues.get(i2);
                    if (str != null) {
                        this.encodedQueryNamesAndValues.set(i2, HttpUrl.canonicalize(str, C0201.m82(32644), true, true, true, true));
                    }
                }
            }
            String str2 = this.encodedFragment;
            if (str2 != null) {
                this.encodedFragment = HttpUrl.canonicalize(str2, C0201.m82(32645), true, true, false, false);
            }
            return this;
        }

        public Builder removeAllEncodedQueryParameters(String str) {
            if (str == null) {
                throw new NullPointerException(C0201.m82(32647));
            } else if (this.encodedQueryNamesAndValues == null) {
                return this;
            } else {
                removeAllCanonicalQueryParameters(HttpUrl.canonicalize(str, C0201.m82(32646), true, false, true, true));
                return this;
            }
        }

        public Builder removeAllQueryParameters(String str) {
            if (str == null) {
                throw new NullPointerException(C0201.m82(32649));
            } else if (this.encodedQueryNamesAndValues == null) {
                return this;
            } else {
                removeAllCanonicalQueryParameters(HttpUrl.canonicalize(str, C0201.m82(32648), false, false, true, true));
                return this;
            }
        }

        public Builder removePathSegment(int i) {
            this.encodedPathSegments.remove(i);
            if (this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add(C0201.m82(32650));
            }
            return this;
        }

        public Builder scheme(String str) {
            if (str != null) {
                String r0 = C0201.m82(32651);
                if (str.equalsIgnoreCase(r0)) {
                    this.scheme = r0;
                } else {
                    String r02 = C0201.m82(32652);
                    if (str.equalsIgnoreCase(r02)) {
                        this.scheme = r02;
                    } else {
                        throw new IllegalArgumentException(C0201.m82(32653) + str);
                    }
                }
                return this;
            }
            throw new NullPointerException(C0201.m82(32654));
        }

        public Builder setEncodedPathSegment(int i, String str) {
            if (str != null) {
                String canonicalize = HttpUrl.canonicalize(str, 0, str.length(), C0201.m82(32655), true, false, false, true, null);
                this.encodedPathSegments.set(i, canonicalize);
                if (!isDot(canonicalize) && !isDotDot(canonicalize)) {
                    return this;
                }
                throw new IllegalArgumentException(C0201.m82(32656) + str);
            }
            throw new NullPointerException(C0201.m82(32657));
        }

        public Builder setEncodedQueryParameter(String str, String str2) {
            removeAllEncodedQueryParameters(str);
            addEncodedQueryParameter(str, str2);
            return this;
        }

        public Builder setPathSegment(int i, String str) {
            if (str != null) {
                String canonicalize = HttpUrl.canonicalize(str, 0, str.length(), C0201.m82(32658), false, false, false, true, null);
                if (isDot(canonicalize) || isDotDot(canonicalize)) {
                    throw new IllegalArgumentException(C0201.m82(32659) + str);
                }
                this.encodedPathSegments.set(i, canonicalize);
                return this;
            }
            throw new NullPointerException(C0201.m82(32660));
        }

        public Builder setQueryParameter(String str, String str2) {
            removeAllQueryParameters(str);
            addQueryParameter(str, str2);
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.scheme;
            if (str != null) {
                sb.append(str);
                sb.append(C0201.m82(32661));
            } else {
                sb.append(C0201.m82(32662));
            }
            if (!this.encodedUsername.isEmpty() || !this.encodedPassword.isEmpty()) {
                sb.append(this.encodedUsername);
                if (!this.encodedPassword.isEmpty()) {
                    sb.append(':');
                    sb.append(this.encodedPassword);
                }
                sb.append('@');
            }
            String str2 = this.host;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.host);
                    sb.append(']');
                } else {
                    sb.append(this.host);
                }
            }
            if (!(this.port == -1 && this.scheme == null)) {
                int effectivePort = effectivePort();
                String str3 = this.scheme;
                if (str3 == null || effectivePort != HttpUrl.defaultPort(str3)) {
                    sb.append(':');
                    sb.append(effectivePort);
                }
            }
            HttpUrl.pathSegmentsToString(sb, this.encodedPathSegments);
            if (this.encodedQueryNamesAndValues != null) {
                sb.append('?');
                HttpUrl.namesAndValuesToQueryString(sb, this.encodedQueryNamesAndValues);
            }
            if (this.encodedFragment != null) {
                sb.append('#');
                sb.append(this.encodedFragment);
            }
            return sb.toString();
        }

        public Builder username(String str) {
            if (str != null) {
                this.encodedUsername = HttpUrl.canonicalize(str, C0201.m82(32663), false, false, false, true);
                return this;
            }
            throw new NullPointerException(C0201.m82(32664));
        }

        private Builder addPathSegments(String str, boolean z) {
            int i = 0;
            do {
                int delimiterOffset = Util.delimiterOffset(str, i, str.length(), C0201.m82(32585));
                push(str, i, delimiterOffset, delimiterOffset < str.length(), z);
                i = delimiterOffset + 1;
            } while (i <= str.length());
            return this;
        }
    }

    public static HttpUrl get(URL url2) {
        return parse(url2.toString());
    }

    private List<String> percentDecode(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            arrayList.add(str != null ? percentDecode(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static HttpUrl get(URI uri) {
        return parse(uri.toString());
    }

    public static String percentDecode(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                ay2 ay2 = new ay2();
                ay2.w0(str, i, i3);
                percentDecode(ay2, str, i3, i2, z);
                return ay2.G();
            }
        }
        return str.substring(i, i2);
    }

    public static void canonicalize(ay2 ay2, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        ay2 ay22 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt == 43 && z3) {
                    ay2.r0(z ? C0201.m82(14182) : C0201.m82(14183));
                } else if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str2.indexOf(codePointAt) != -1 || (codePointAt == 37 && (!z || (z2 && !percentEncoded(str, i, i2)))))) {
                    if (ay22 == null) {
                        ay22 = new ay2();
                    }
                    if (charset == null || charset.equals(Util.UTF_8)) {
                        ay22.z0(codePointAt);
                    } else {
                        ay22.m0(str, i, Character.charCount(codePointAt) + i, charset);
                    }
                    while (!ay22.M()) {
                        int readByte = ay22.readByte() & 255;
                        ay2.c0(37);
                        ay2.c0(HEX_DIGITS[(readByte >> 4) & 15]);
                        ay2.c0(HEX_DIGITS[readByte & 15]);
                    }
                } else {
                    ay2.z0(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    public Builder newBuilder(String str) {
        try {
            return new Builder().parse(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static void percentDecode(ay2 ay2, String str, int i, int i2, boolean z) {
        int i3;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 37 && (i3 = i + 2) < i2) {
                int decodeHexDigit = Util.decodeHexDigit(str.charAt(i + 1));
                int decodeHexDigit2 = Util.decodeHexDigit(str.charAt(i3));
                if (!(decodeHexDigit == -1 || decodeHexDigit2 == -1)) {
                    ay2.c0((decodeHexDigit << 4) + decodeHexDigit2);
                    i = i3;
                    i += Character.charCount(codePointAt);
                }
            } else if (codePointAt == 43 && z) {
                ay2.c0(32);
                i += Character.charCount(codePointAt);
            }
            ay2.z0(codePointAt);
            i += Character.charCount(codePointAt);
        }
    }

    public static String canonicalize(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        return canonicalize(str, 0, str.length(), str2, z, z2, z3, z4, charset);
    }

    public static String canonicalize(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return canonicalize(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }
}
