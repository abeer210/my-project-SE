package com.facebook.hermes.unicode;

import java.text.Collator;
import java.text.DateFormat;
import java.text.Normalizer;
import java.util.Locale;
import vigqyno.C0201;

@zh0
public class AndroidUnicodeUtils {
    @zh0
    public static String convertToCase(String str, int i, boolean z) {
        Locale locale = z ? Locale.getDefault() : Locale.ENGLISH;
        if (i == 0) {
            return str.toUpperCase(locale);
        }
        if (i == 1) {
            return str.toLowerCase(locale);
        }
        throw new RuntimeException(C0201.m82(19266));
    }

    @zh0
    public static String dateFormat(double d, boolean z, boolean z2) {
        DateFormat dateFormat;
        if (z && z2) {
            dateFormat = DateFormat.getDateTimeInstance(2, 2);
        } else if (z) {
            dateFormat = DateFormat.getDateInstance(2);
        } else if (z2) {
            dateFormat = DateFormat.getTimeInstance(2);
        } else {
            throw new RuntimeException(C0201.m82(19267));
        }
        return dateFormat.format(Long.valueOf((long) d)).toString();
    }

    @zh0
    public static int localeCompare(String str, String str2) {
        return Collator.getInstance().compare(str, str2);
    }

    @zh0
    public static String normalize(String str, int i) {
        if (i == 0) {
            return Normalizer.normalize(str, Normalizer.Form.NFC);
        }
        if (i == 1) {
            return Normalizer.normalize(str, Normalizer.Form.NFD);
        }
        if (i == 2) {
            return Normalizer.normalize(str, Normalizer.Form.NFKC);
        }
        if (i == 3) {
            return Normalizer.normalize(str, Normalizer.Form.NFKD);
        }
        throw new RuntimeException(C0201.m82(19268));
    }
}
