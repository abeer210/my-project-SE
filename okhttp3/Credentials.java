package okhttp3;

import java.nio.charset.Charset;
import okhttp3.internal.Util;
import vigqyno.C0201;

public final class Credentials {
    private Credentials() {
    }

    public static String basic(String str, String str2) {
        return basic(str, str2, Util.ISO_8859_1);
    }

    public static String basic(String str, String str2, Charset charset) {
        String b = dy2.j(str + C0201.m82(21757) + str2, charset).b();
        return C0201.m82(21758) + b;
    }
}
