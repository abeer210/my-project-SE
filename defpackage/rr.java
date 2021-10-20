package defpackage;

import java.util.Iterator;

/* renamed from: rr  reason: default package */
/* compiled from: StringUtil */
public final class rr {
    public static String a(Iterable<? extends CharSequence> iterable, String str) {
        int length = str.length();
        Iterator<? extends CharSequence> it = iterable.iterator();
        int i = 0;
        if (it.hasNext()) {
            i = 0 + ((CharSequence) it.next()).length() + length;
        }
        StringBuilder sb = new StringBuilder(i);
        Iterator<? extends CharSequence> it2 = iterable.iterator();
        if (it2.hasNext()) {
            sb.append((CharSequence) it2.next());
            while (it2.hasNext()) {
                sb.append(str);
                sb.append((CharSequence) it2.next());
            }
        }
        return sb.toString();
    }

    public static <T extends CharSequence> String b(T[] tArr, String str) {
        int length = str.length();
        int i = 0;
        for (T t : tArr) {
            i += t.length() + length;
        }
        StringBuilder sb = new StringBuilder(i);
        boolean z = true;
        for (T t2 : tArr) {
            if (!z) {
                sb.append(str);
            } else {
                z = false;
            }
            sb.append((CharSequence) t2);
        }
        return sb.toString();
    }
}
