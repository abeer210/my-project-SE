package defpackage;

/* renamed from: tj2  reason: default package */
/* compiled from: StringUtils */
public class tj2 {
    public static boolean a(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean b(String str, String str2) {
        if (str == null || str2 == null) {
            return str == str2;
        }
        return str.equals(str2);
    }
}
