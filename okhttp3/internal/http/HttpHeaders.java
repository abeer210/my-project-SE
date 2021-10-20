package okhttp3.internal.http;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import vigqyno.C0188;
import vigqyno.C0201;

public final class HttpHeaders {
    private static final dy2 QUOTED_STRING_DELIMITERS = dy2.k(C0201.m82(37281));
    private static final dy2 TOKEN_DELIMITERS = dy2.k(C0201.m82(37282));

    private HttpHeaders() {
    }

    public static long contentLength(Response response) {
        return contentLength(response.headers());
    }

    public static boolean hasBody(Response response) {
        if (response.request().method().equals(C0201.m82(37284))) {
            return false;
        }
        int code = response.code();
        if (((code >= 100 && code < 200) || code == 204 || code == 304) && contentLength(response) == -1) {
            if (C0201.m82(37286).equalsIgnoreCase(response.header(C0201.m82(37285)))) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static boolean hasVaryAll(Response response) {
        return hasVaryAll(response.headers());
    }

    private static void parseChallengeHeader(List<Challenge> list, ay2 ay2) {
        String readToken;
        int skipAll;
        String str;
        while (true) {
            String str2 = null;
            while (true) {
                if (str2 == null) {
                    skipWhitespaceAndCommas(ay2);
                    str2 = readToken(ay2);
                    if (str2 == null) {
                        return;
                    }
                }
                boolean skipWhitespaceAndCommas = skipWhitespaceAndCommas(ay2);
                readToken = readToken(ay2);
                if (readToken != null) {
                    skipAll = skipAll(ay2, (byte) 61);
                    boolean skipWhitespaceAndCommas2 = skipWhitespaceAndCommas(ay2);
                    if (skipWhitespaceAndCommas || (!skipWhitespaceAndCommas2 && !ay2.M())) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        int skipAll2 = skipAll + skipAll(ay2, (byte) 61);
                        while (true) {
                            if (readToken == null) {
                                readToken = readToken(ay2);
                                if (skipWhitespaceAndCommas(ay2)) {
                                    continue;
                                    break;
                                }
                                skipAll2 = skipAll(ay2, (byte) 61);
                            }
                            if (skipAll2 == 0) {
                                continue;
                                break;
                            } else if (skipAll2 <= 1 && !skipWhitespaceAndCommas(ay2)) {
                                if (ay2.M() || ay2.s(0) != 34) {
                                    str = readToken(ay2);
                                } else {
                                    str = readQuotedString(ay2);
                                }
                                if (str == null || ((String) linkedHashMap.put(readToken, str)) != null) {
                                    return;
                                }
                                if (skipWhitespaceAndCommas(ay2) || ay2.M()) {
                                    readToken = null;
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        list.add(new Challenge(str2, linkedHashMap));
                        str2 = readToken;
                    }
                } else if (ay2.M()) {
                    list.add(new Challenge(str2, Collections.emptyMap()));
                    return;
                } else {
                    return;
                }
            }
            list.add(new Challenge(str2, Collections.singletonMap(null, readToken + repeat('=', skipAll))));
        }
    }

    public static List<Challenge> parseChallenges(Headers headers, String str) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < headers.size(); i++) {
            if (str.equalsIgnoreCase(headers.name(i))) {
                ay2 ay2 = new ay2();
                ay2.r0(headers.value(i));
                parseChallengeHeader(arrayList, ay2);
            }
        }
        return arrayList;
    }

    public static int parseSeconds(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return C0188.f24;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    private static String readQuotedString(ay2 ay2) {
        if (ay2.readByte() == 34) {
            ay2 ay22 = new ay2();
            while (true) {
                long W = ay2.W(QUOTED_STRING_DELIMITERS);
                if (W == -1) {
                    return null;
                }
                if (ay2.s(W) == 34) {
                    ay22.write(ay2, W);
                    ay2.readByte();
                    return ay22.G();
                } else if (ay2.Q() == W + 1) {
                    return null;
                } else {
                    ay22.write(ay2, W);
                    ay2.readByte();
                    ay22.write(ay2, 1);
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    private static String readToken(ay2 ay2) {
        try {
            long W = ay2.W(TOKEN_DELIMITERS);
            if (W == -1) {
                W = ay2.Q();
            }
            if (W != 0) {
                return ay2.K(W);
            }
            return null;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    public static void receiveHeaders(CookieJar cookieJar, HttpUrl httpUrl, Headers headers) {
        if (cookieJar != CookieJar.NO_COOKIES) {
            List<Cookie> parseAll = Cookie.parseAll(httpUrl, headers);
            if (!parseAll.isEmpty()) {
                cookieJar.saveFromResponse(httpUrl, parseAll);
            }
        }
    }

    private static String repeat(char c, int i) {
        char[] cArr = new char[i];
        Arrays.fill(cArr, c);
        return new String(cArr);
    }

    private static int skipAll(ay2 ay2, byte b) {
        int i = 0;
        while (!ay2.M() && ay2.s(0) == b) {
            i++;
            ay2.readByte();
        }
        return i;
    }

    public static int skipUntil(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    public static int skipWhitespace(String str, int i) {
        while (i < str.length() && ((r0 = str.charAt(i)) == ' ' || r0 == '\t')) {
            i++;
        }
        return i;
    }

    private static boolean skipWhitespaceAndCommas(ay2 ay2) {
        boolean z = false;
        while (!ay2.M()) {
            byte s = ay2.s(0);
            if (s != 44) {
                if (s != 32 && s != 9) {
                    break;
                }
                ay2.readByte();
            } else {
                ay2.readByte();
                z = true;
            }
        }
        return z;
    }

    private static long stringToLong(String str) {
        if (str == null) {
            return -1;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    private static Set<String> varyFields(Response response) {
        return varyFields(response.headers());
    }

    public static Headers varyHeaders(Response response) {
        return varyHeaders(response.networkResponse().request().headers(), response.headers());
    }

    public static boolean varyMatches(Response response, Headers headers, Request request) {
        for (String str : varyFields(response)) {
            if (!Util.equal(headers.values(str), request.headers(str))) {
                return false;
            }
        }
        return true;
    }

    public static long contentLength(Headers headers) {
        return stringToLong(headers.get(C0201.m82(37283)));
    }

    public static boolean hasVaryAll(Headers headers) {
        return varyFields(headers).contains(C0201.m82(37287));
    }

    public static Set<String> varyFields(Headers headers) {
        Set<String> emptySet = Collections.emptySet();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            if (C0201.m82(37288).equalsIgnoreCase(headers.name(i))) {
                String value = headers.value(i);
                if (emptySet.isEmpty()) {
                    emptySet = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
                }
                for (String str : value.split(C0201.m82(37289))) {
                    emptySet.add(str.trim());
                }
            }
        }
        return emptySet;
    }

    public static Headers varyHeaders(Headers headers, Headers headers2) {
        Set<String> varyFields = varyFields(headers2);
        if (varyFields.isEmpty()) {
            return new Headers.Builder().build();
        }
        Headers.Builder builder = new Headers.Builder();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            String name = headers.name(i);
            if (varyFields.contains(name)) {
                builder.add(name, headers.value(i));
            }
        }
        return builder.build();
    }
}
