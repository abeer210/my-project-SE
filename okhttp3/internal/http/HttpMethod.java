package okhttp3.internal.http;

import vigqyno.C0201;

public final class HttpMethod {
    private HttpMethod() {
    }

    public static boolean invalidatesCache(String str) {
        return str.equals(C0201.m82(1922)) || str.equals(C0201.m82(1923)) || str.equals(C0201.m82(1924)) || str.equals(C0201.m82(1925)) || str.equals(C0201.m82(1926));
    }

    public static boolean permitsRequestBody(String str) {
        return !str.equals(C0201.m82(1927)) && !str.equals(C0201.m82(1928));
    }

    public static boolean redirectsToGet(String str) {
        return !str.equals(C0201.m82(1929));
    }

    public static boolean redirectsWithBody(String str) {
        return str.equals(C0201.m82(1930));
    }

    public static boolean requiresRequestBody(String str) {
        return str.equals(C0201.m82(1931)) || str.equals(C0201.m82(1932)) || str.equals(C0201.m82(1933)) || str.equals(C0201.m82(1934)) || str.equals(C0201.m82(1935));
    }
}
