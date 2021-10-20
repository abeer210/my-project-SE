package com.facebook.react.views.text;

import java.text.BreakIterator;

/* compiled from: TextTransform */
public enum c0 {
    NONE,
    UPPERCASE,
    LOWERCASE,
    CAPITALIZE,
    UNSET;

    /* access modifiers changed from: package-private */
    /* compiled from: TextTransform */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            int[] iArr = new int[c0.values().length];
            a = iArr;
            iArr[c0.UPPERCASE.ordinal()] = 1;
            a[c0.LOWERCASE.ordinal()] = 2;
            try {
                a[c0.CAPITALIZE.ordinal()] = 3;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static String b(String str, c0 c0Var) {
        if (str == null) {
            return null;
        }
        int i = a.a[c0Var.ordinal()];
        if (i == 1) {
            return str.toUpperCase();
        }
        if (i == 2) {
            return str.toLowerCase();
        }
        if (i != 3) {
            return str;
        }
        return d(str);
    }

    private static String d(String str) {
        BreakIterator wordInstance = BreakIterator.getWordInstance();
        wordInstance.setText(str);
        StringBuilder sb = new StringBuilder(str.length());
        int first = wordInstance.first();
        while (true) {
            first = wordInstance.next();
            if (first == -1) {
                return sb.toString();
            }
            String substring = str.substring(first, first);
            if (Character.isLetterOrDigit(substring.charAt(0))) {
                sb.append(Character.toUpperCase(substring.charAt(0)));
                sb.append(substring.substring(1).toLowerCase());
            } else {
                sb.append(substring);
            }
        }
    }
}
