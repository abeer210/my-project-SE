package defpackage;

import java.lang.reflect.Field;
import java.util.Locale;

/* renamed from: i22  reason: default package */
/* compiled from: FieldNamingPolicy */
public enum i22 implements j22 {
    IDENTITY {
        @Override // defpackage.j22
        public String b(Field field) {
            return field.getName();
        }
    },
    UPPER_CAMEL_CASE {
        @Override // defpackage.j22
        public String b(Field field) {
            return i22.f(field.getName());
        }
    },
    UPPER_CAMEL_CASE_WITH_SPACES {
        @Override // defpackage.j22
        public String b(Field field) {
            return i22.f(i22.e(field.getName(), " "));
        }
    },
    LOWER_CASE_WITH_UNDERSCORES {
        @Override // defpackage.j22
        public String b(Field field) {
            return i22.e(field.getName(), "_").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DASHES {
        @Override // defpackage.j22
        public String b(Field field) {
            return i22.e(field.getName(), "-").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DOTS {
        @Override // defpackage.j22
        public String b(Field field) {
            return i22.e(field.getName(), ".").toLowerCase(Locale.ENGLISH);
        }
    };

    private static String d(char c2, String str, int i) {
        if (i >= str.length()) {
            return String.valueOf(c2);
        }
        return c2 + str.substring(i);
    }

    public static String e(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public static String f(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        char charAt = str.charAt(0);
        int length = str.length();
        while (i < length - 1 && !Character.isLetter(charAt)) {
            sb.append(charAt);
            i++;
            charAt = str.charAt(i);
        }
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        sb.append(d(Character.toUpperCase(charAt), str, i + 1));
        return sb.toString();
    }
}
