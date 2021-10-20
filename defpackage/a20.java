package defpackage;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import vigqyno.C0201;

/* renamed from: a20  reason: default package */
/* compiled from: BuilderUtil */
public class a20 {
    public static String a(String str, boolean z) {
        String b = b(str);
        if (b == null) {
            return null;
        }
        Matcher matcher = Pattern.compile(C0201.m82(10245)).matcher(b);
        matcher.find();
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        String group2 = matcher.group(2);
        String group3 = matcher.group(3);
        if (group2 == null || group2.isEmpty()) {
            return null;
        }
        if (z && (group3 == null || group3.isEmpty())) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (group == null) {
            group = C0201.m82(10246);
        }
        sb.append(group);
        sb.append(group2);
        if (group3 != null && !group3.isEmpty()) {
            String r0 = C0201.m82(10247);
            sb.append(r0);
            if (group3.endsWith(r0)) {
                sb.append((CharSequence) group3, 0, group3.length() - 1);
            } else {
                sb.append(group3);
            }
        }
        return sb.toString();
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.length() > 0) {
            return trim;
        }
        return null;
    }

    public static String[] c(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str != null) {
                String trim = str.trim();
                if (trim.length() > 0) {
                    arrayList.add(trim);
                }
            }
        }
        if (arrayList.size() > 0) {
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        return null;
    }
}
