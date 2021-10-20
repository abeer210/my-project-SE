package defpackage;

/* renamed from: ui2  reason: default package */
/* compiled from: ArrayUtils */
public class ui2 {
    public static boolean a(Object[] objArr, Object obj) {
        if (b(objArr)) {
            return false;
        }
        for (Object obj2 : objArr) {
            if (obj2 == obj) {
                return true;
            }
        }
        return false;
    }

    private static boolean b(Object[] objArr) {
        return objArr == null || objArr.length == 0;
    }
}
