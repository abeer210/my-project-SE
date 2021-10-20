package defpackage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import vigqyno.C0201;

/* renamed from: m32  reason: default package */
/* compiled from: PreJava9DateFormatProvider */
public class m32 {
    private static String a(int i) {
        if (i == 0) {
            return C0201.m82(4943);
        }
        if (i == 1) {
            return C0201.m82(4942);
        }
        if (i == 2) {
            return C0201.m82(4941);
        }
        if (i == 3) {
            return C0201.m82(4939);
        }
        throw new IllegalArgumentException(C0201.m82(4940) + i);
    }

    private static String b(int i) {
        if (i == 0 || i == 1) {
            return C0201.m82(4947);
        }
        if (i == 2) {
            return C0201.m82(4946);
        }
        if (i == 3) {
            return C0201.m82(4944);
        }
        throw new IllegalArgumentException(C0201.m82(4945) + i);
    }

    public static DateFormat c(int i, int i2) {
        return new SimpleDateFormat(a(i) + C0201.m82(4948) + b(i2), Locale.US);
    }
}
