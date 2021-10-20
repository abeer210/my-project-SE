package okhttp3;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import okhttp3.internal.Util;
import vigqyno.C0201;

public final class Challenge {
    private final Map<String, String> authParams;
    private final String scheme;

    public Challenge(String str, Map<String, String> map) {
        if (str == null) {
            throw new NullPointerException(C0201.m82(3351));
        } else if (map != null) {
            this.scheme = str;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey() == null ? null : entry.getKey().toLowerCase(Locale.US), entry.getValue());
            }
            this.authParams = Collections.unmodifiableMap(linkedHashMap);
        } else {
            throw new NullPointerException(C0201.m82(3350));
        }
    }

    public Map<String, String> authParams() {
        return this.authParams;
    }

    public Charset charset() {
        String str = this.authParams.get(C0201.m82(3352));
        if (str != null) {
            try {
                return Charset.forName(str);
            } catch (Exception unused) {
            }
        }
        return Util.ISO_8859_1;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Challenge) {
            Challenge challenge = (Challenge) obj;
            return challenge.scheme.equals(this.scheme) && challenge.authParams.equals(this.authParams);
        }
    }

    public int hashCode() {
        return ((899 + this.scheme.hashCode()) * 31) + this.authParams.hashCode();
    }

    public String realm() {
        return this.authParams.get(C0201.m82(3353));
    }

    public String scheme() {
        return this.scheme;
    }

    public String toString() {
        return this.scheme + C0201.m82(3354) + this.authParams;
    }

    public Challenge withCharset(Charset charset) {
        if (charset != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(this.authParams);
            linkedHashMap.put(C0201.m82(3355), charset.name());
            return new Challenge(this.scheme, linkedHashMap);
        }
        throw new NullPointerException(C0201.m82(3356));
    }

    public Challenge(String str, String str2) {
        if (str == null) {
            throw new NullPointerException(C0201.m82(3349));
        } else if (str2 != null) {
            this.scheme = str;
            this.authParams = Collections.singletonMap(C0201.m82(3347), str2);
        } else {
            throw new NullPointerException(C0201.m82(3348));
        }
    }
}
