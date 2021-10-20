package defpackage;

/* renamed from: wz2  reason: default package */
/* compiled from: ObjectUtils */
public class wz2 {
    public static boolean a(Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        return obj.equals(obj2);
    }
}
