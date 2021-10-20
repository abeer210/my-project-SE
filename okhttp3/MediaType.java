package okhttp3;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import vigqyno.C0201;

public final class MediaType {
    private static final Pattern PARAMETER = Pattern.compile(C0201.m82(25432));
    private static final String QUOTED = null;
    private static final String TOKEN = null;
    private static final Pattern TYPE_SUBTYPE = Pattern.compile(C0201.m82(25431));
    private final String charset;
    private final String mediaType;
    private final String subtype;
    private final String type;

    static {
        C0201.m83(MediaType.class, 442);
    }

    private MediaType(String str, String str2, String str3, String str4) {
        this.mediaType = str;
        this.type = str2;
        this.subtype = str3;
        this.charset = str4;
    }

    public static MediaType get(String str) {
        Matcher matcher = TYPE_SUBTYPE.matcher(str);
        if (matcher.lookingAt()) {
            String lowerCase = matcher.group(1).toLowerCase(Locale.US);
            String lowerCase2 = matcher.group(2).toLowerCase(Locale.US);
            String str2 = null;
            Matcher matcher2 = PARAMETER.matcher(str);
            for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
                matcher2.region(end, str.length());
                boolean lookingAt = matcher2.lookingAt();
                String r9 = C0201.m82(25433);
                if (lookingAt) {
                    String group = matcher2.group(1);
                    if (group != null && group.equalsIgnoreCase(C0201.m82(25434))) {
                        String group2 = matcher2.group(2);
                        if (group2 != null) {
                            String r8 = C0201.m82(25435);
                            if (group2.startsWith(r8) && group2.endsWith(r8) && group2.length() > 2) {
                                group2 = group2.substring(1, group2.length() - 1);
                            }
                        } else {
                            group2 = matcher2.group(3);
                        }
                        if (str2 == null || group2.equalsIgnoreCase(str2)) {
                            str2 = group2;
                        } else {
                            throw new IllegalArgumentException(C0201.m82(25436) + str2 + C0201.m82(25437) + group2 + r9 + str + '\"');
                        }
                    }
                } else {
                    throw new IllegalArgumentException(C0201.m82(25438) + str.substring(end) + r9 + str + '\"');
                }
            }
            return new MediaType(str, lowerCase, lowerCase2, str2);
        }
        throw new IllegalArgumentException(C0201.m82(25439) + str + '\"');
    }

    public static MediaType parse(String str) {
        try {
            return get(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public Charset charset() {
        return charset(null);
    }

    public boolean equals(Object obj) {
        return (obj instanceof MediaType) && ((MediaType) obj).mediaType.equals(this.mediaType);
    }

    public int hashCode() {
        return this.mediaType.hashCode();
    }

    public String subtype() {
        return this.subtype;
    }

    public String toString() {
        return this.mediaType;
    }

    public String type() {
        return this.type;
    }

    public Charset charset(Charset charset2) {
        try {
            return this.charset != null ? Charset.forName(this.charset) : charset2;
        } catch (IllegalArgumentException unused) {
            return charset2;
        }
    }
}
